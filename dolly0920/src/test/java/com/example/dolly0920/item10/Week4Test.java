package com.example.dolly0920.item10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Week4Test {

  private final People p1 = new People("Chickenrun", 30, 70, 180);
  private final People p2 = new People("Chickenrun", 30, 70, 100);

  private final Spaceship s1 = new Spaceship("voyager", 1000, 500);
  private final Spaceship s2 = new Spaceship("voyager", 1000, 500);
  private final Spaceship s3 = new Spaceship("voyager", 1000, 500);

  @Test
  void shouldReturnFalseIfNotDefineEquals() {
    assertEquals(false, p1.equals(p2));
  }

  @Test
  void shouldReturnTrueIfDefineEquals() {
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

}
