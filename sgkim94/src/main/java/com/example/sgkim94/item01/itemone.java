package com.example.sgkim94.item01;

import java.util.Objects;


/**
 * ITEM1. Consider static factory methods instead of constructors.
 */
public class itemone {
    /**
     * Production Example
     * When creating a DTO, create it using toDto`s static factory method rather than creating the DTO as a constructor
     * if Lombok can be used, add @Builder above the construct and use
     */
    static class CreateUserRequestView {
        private Long id;
        private String name;
        private int age;

        // Add NoArgsConstructor to ObjectMapping
        protected CreateUserRequestView() {}

        // @Builder
        private CreateUserRequestView(User user) {
            this.id = user.getId();
            this.name = user.getName();
            this.age = user.getAge();
        }

        public static final CreateUserRequestView toDto(User user) {
            return new CreateUserRequestView(user);
        }
    }

    static class User {
        private Long id;
        private String name;
        private int age;

        Long getId() {
            return id;
        }

        String getName() {
            return name;
        }

        int getAge() {
            return age;
        }
    }


    /**
     * Optional Example
     * Optional provides 3 example to create object
     * @param <T>
     */
    static final class Optional<T> {
        private static final Optional<?> EMPTY = new Optional();
        private final T value;

        private Optional() {
            this.value = null;
        }


        private Optional(T value) {
            this.value = Objects.requireNonNull(value);
        }

        static <T> Optional<T> of(T value) {
            return new Optional(value);
        }

        public static <T> Optional<T> ofNullable(T value) {
            return value == null ? empty() : of(value);
        }

        static <T> Optional<T> empty() {
            Optional<T> t = (Optional<T>) EMPTY;
            return t;
        }
    }

    public static void main(String[] args) {
        ProductBuilderPatternExample();
        OptinalExample();

    }

    private static void OptinalExample() {
        Optional<String> value = Optional.of("value");
        Optional<Object> nullObject = Optional.ofNullable(null);
        Optional<Object> empty = Optional.empty();
    }

    private static void ProductBuilderPatternExample() {
        CreateUserRequestView.toDto(new User());
    }
}
