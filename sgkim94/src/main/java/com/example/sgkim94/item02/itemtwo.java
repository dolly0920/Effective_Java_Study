package com.example.sgkim94.item02;

import java.io.Serializable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ITEM2. Analyze different between each pattern
 * that Java Beans pattern, Builder Pattern, incremental constructor pattern in a multithreaded environment
 * and test.
 */
public class itemtwo {
    /**
     * A JavaBean
     *
     * 1. All properties private (use getters/setters)
     * 2. A public no-argument constructor
     * 3. Implements Serializable.
     */
    static final class People implements Serializable {
        private int age;
        private String name;

        public People() {}

        public People(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public void passeYear() {
            this.age++;
        }

        public void lastYear() {
            this.age--;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


    /**
     * Incremental constructor pattern
     */
    static final class Board {
        private String title;
        private String content;
        private String product;
        private String userName;

        public Board(String title) {
            this.title = title;
        }

        public Board(String title, String content) {
            this.title = title;
            this.content = content;
        }

        public Board(String title, String content, String product) {
            this.title = title;
            this.content = content;
            this.product = product;
        }

        public Board(String title, String content, String product, String userName) {
            this.title = title;
            this.content = content;
            this.product = product;
            this.userName = userName;
        }
    }


    /**
     * Builder Pattern
     */
    public static class BankAccount {
        private long accountNumber;
        private String owner;
        private double balance;

        BankAccount() {}

        // for tread test method
        void depositBalance() {
            this.balance++;
        }

        // for tread test method
        void withdrawalBalance() {
            this.balance--;
        }

        // for tread test method
        double getBalance() {
            return balance;
        }

        static class Builder {
            private long accountNumber;
            private String owner;
            private double balance;

            Builder() {}

            Builder(Builder bankAccount) {
                this.accountNumber = bankAccount.accountNumber;
                this.owner = bankAccount.owner;
                this.balance = bankAccount.balance;

            }

            public Builder accountNumber(long accountNumber) {
                this.accountNumber = accountNumber;
                return this;
            }

            Builder owner(String owner) {
                this.owner = owner;
                return this;
            }


            Builder balance(double balance) {
                this.balance = balance;
                return this;
            }

            BankAccount build() {
                BankAccount account = new BankAccount();
                account.accountNumber = this.accountNumber;
                account.owner = owner;
                account.balance = balance;

                return account;
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        BuilderPatternExample();

        TestMultiThreadJavabeans();
        TestMultiThreadIncrementConstructor();
        TestMultiThreadBuilder();

    }

    private static void TestMultiThreadJavabeans() throws InterruptedException {
        int numberOfThreads = 50;
        ExecutorService service = Executors.newFixedThreadPool(10);
        CountDownLatch latch = new CountDownLatch(numberOfThreads);

        People people = new People(0, "jackson");

        for (int i = 0; i < numberOfThreads; i++) {
            service.execute(() -> {
                people.passeYear();
                try {
                    Thread.sleep(100);
                    people.lastYear();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                latch.countDown();
                System.out.println(people.getAge());
            });
        }

        latch.await();

        System.out.println(people.getAge());
    }

    private static void TestMultiThreadIncrementConstructor() throws InterruptedException {
        int numberOfThreads = 50;
        ExecutorService service = Executors.newFixedThreadPool(10);
        CountDownLatch latch = new CountDownLatch(numberOfThreads);
        for (int i = 0; i < numberOfThreads; i++) {
            service.execute(() -> {
                People people = new People(0, "jackson");
                people.passeYear();
                try {
                    Thread.sleep(100);
                    people.lastYear();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                latch.countDown();
                System.out.println(people.getAge());
            });
        }

        latch.await();
    }

    private static void TestMultiThreadBuilder() throws InterruptedException {
        int numberOfThreads = 50;
        ExecutorService service = Executors.newFixedThreadPool(10);
        CountDownLatch latch = new CountDownLatch(numberOfThreads);
        for (int i = 0; i < numberOfThreads; i++) {
            service.execute(() -> {
                BankAccount bank = new BankAccount.Builder()
                        .owner("jackson")
                        .balance(10)
                        .build();

                bank.depositBalance();

                try {
                    Thread.sleep(100);
                    bank.withdrawalBalance();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                latch.countDown();
                System.out.println(bank.getBalance());
            });
        }

        latch.await();
    }


    private static void BuilderPatternExample() {
        BankAccount bank = new BankAccount.Builder()
                .owner("jackson")
                .balance(10)
                .build();
    }
}
