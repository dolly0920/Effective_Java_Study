package com.example.sypark9646.item19;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OverrideTimeTest {

    @DisplayName("상속용 클래스의 생성자의 재정의 가능 메소드 호출 테스트 - child")
    @Test
    void overrideTestChild() {
        Child child = new Child();
        child.overrideMe();
    }

    @DisplayName("상속용 클래스의 생성자의 재정의 가능 메소드 호출 테스트 - parent")
    @Test
    void overrideTestParent() {
        Parent parent = new Parent();
        parent.overrideMe();
    }
}
