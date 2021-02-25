package com.example.sypark9646.item16;

import java.awt.Point;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PointAndDimensionTest {

    @DisplayName("java.awt.package.Point 테스트")
    @Test
    void pointTest() {
        Point point = new Point(); // 0, 0
        point.x = 10;
        point.y = 10;

        Assertions.assertAll(
            () -> Assertions.assertEquals(point.getX(), 10),
            () -> Assertions.assertEquals(point.getY(), 10)
        );
    }

    @DisplayName("java.awt.package.Point 상속 테스트")
    @Test
    void pointExtensionTest() {
        PointExtension pointExtension = new PointExtension();
        System.out.println(pointExtension.x + "" + pointExtension.y);

        pointExtension.move(10, 10); // 0, 0
        Assertions.assertAll(
            () -> Assertions.assertNotEquals(pointExtension.x, 10), // 0
            () -> Assertions.assertNotEquals(pointExtension.y, 10) // 0
        );

        Assertions.assertAll(
            () -> Assertions.assertEquals(10.0, pointExtension.getX()), // 10.0
            () -> Assertions.assertEquals(10.0, pointExtension.getY()) // 10.0
        );
    }
}
