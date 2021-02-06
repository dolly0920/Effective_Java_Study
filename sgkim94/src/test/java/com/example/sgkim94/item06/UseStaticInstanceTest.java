package com.example.sgkim94.item06;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UseStaticInstanceTest {
    @Test
    @DisplayName("static method 를 사용하여 객체를 생성한 경우 시간 결고 = 4초")
    void useStaticMethodTest() {
        StaticInstance useStaticInstance = new UseStaticInstance();

        long duration = executeCreateInstances(useStaticInstance);

        System.out.println("### use static instance : " + duration);
    }

    @Test
    @DisplayName("static method 를 사용하지 않고 객체를 생성한 경우 시간 결과 = 13초")
    void notUseStaticMethodTest() {
        StaticInstance useStaticInstance = new NotUseStaticInstance();

        long duration = executeCreateInstances(useStaticInstance);

        System.out.println("### not use static instance : " + duration);
    }

    private long executeCreateInstances(StaticInstance useStaticInstance) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            useStaticInstance.createInstance();
        }

        long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }
}
