package com.example.dolly0920.week10;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class GenericToolsTest {

  @Test
  public void boundTest() {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    assertEquals(2, GenericTools.lowerBound(list, 3));
    assertEquals(3, GenericTools.upperBound(list, 3));
  }

  @Test
  public void shouldReturnAmountWithUpperBoundAndLowerBound() {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(1);
    list.add(1);
    list.add(2);
    list.add(2);

    assertEquals(3, GenericTools.upperBound(list, 1) - GenericTools.lowerBound(list, 1));
  }

  @Test
  public void combineTest() {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    List<List<Integer>> combineList = new ArrayList<>();
    List<Integer> list1 = new ArrayList<>();
    list1.add(1);
    list1.add(2);
    List<Integer> list2 = new ArrayList<>();
    list2.add(3);
    list2.add(4);
    list2.add(5);

    combineList.add(list1);
    combineList.add(list2);

    assertEquals(list, GenericTools.combine(combineList));
  }
}
