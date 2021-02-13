package com.example.dolly0920.week4;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class Week4Test {

  private final People p1 = new People(1, 30, 70, 180);
  private final People p2 = new People(1, 30, 70, 100);
  private final Car c1 = new Car(1, 500, 50);
  private final Car c2 = new Car(1, 500, 50);
  private final Spaceship s1 = new Spaceship(1, 1000, 500);
  private final Spaceship s2 = new Spaceship(1, 1000, 500);
  private final Spaceship s3 = new Spaceship(1, 1000, 500);

  @Test
  void shouldReturnFalseWhenNotDefineEquals() {
    assertEquals(false, p1.equals(p2));
  }

  @Test
  void shouldReturnTrueWhenDefineEquals() {
    // reflexivity
    assertEquals(true, s1.equals(s1));
    assertEquals(true, s2.equals(s2));
    // symmetry
    assertEquals(true, s1.equals(s2));
    assertEquals(true, s2.equals(s1));
    // transivity
    assertEquals(true, s1.equals(s2));
    assertEquals(true, s2.equals(s3));
    assertEquals(true, s1.equals(s3));
    // consistency
    assertEquals(true, s1.equals(s2));
    assertEquals(true, s1.equals(s2));
    assertEquals(true, s1.equals(s2));
    assertEquals(false, s1.equals(p1));
    assertEquals(false, s1.equals(p1));
    assertEquals(false, s1.equals(p1));
    // compare to null value
    assertEquals(false, s1.equals(null));
  }

  @Test
  void shouldReturnDifValueWhenNotDefineHahsCode() {
    HashMap<Car, String> hashMap = new HashMap<>();
    hashMap.put(c1, "testValue");

    assertNotEquals(hashMap.get(c2), "testValue");
    assertNotEquals(hashMap.get(new Car(1, 500, 50)), "testValue");
  }

  @Test
  void shouldReturnDifValueWhenNotDefineHashCode() {
    HashMap<People, String> hashMap = new HashMap<>();
    hashMap.put(p1, "testValue");

    assertNotEquals(hashMap.get(p2), "testValue");
    assertNotEquals(hashMap.get(new People(1, 30, 70, 180)), "testValue");
  }

  @Test
  void shouldReturnSameValueWhenDefineHashCode() {
    HashMap<Spaceship, String> hashMap = new HashMap<>();
    hashMap.put(s1, "testValue");

    assertEquals(hashMap.get(s2), "testValue");
    assertEquals(hashMap.get(new Spaceship(1, 1000, 500)), "testValue");
  }
}
