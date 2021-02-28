package com.example.dolly0920.week6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class Week6Test {

  private List<ApplyForm> aaa = new ArrayList<>();

  @BeforeEach
  public void setUpInitialValue() {
    aaa.add(new ApplyForm("aaa", "2000-01-01", "a", "abc"));
    aaa.add(new ApplyForm("aaa", "2000-01-01", "a", "bcd"));
    aaa.add(new ApplyForm("aaa", "2000-01-01", "a", "cde"));
    aaa.add(new ApplyForm("aaa", "2000-01-01", "b", "abc"));
    aaa.add(new ApplyForm("aaa", "2000-01-01", "b", "bcd"));
    aaa.add(new ApplyForm("aaa", "2000-01-01", "b", "cde"));
  }

  @Test
  public void shouldReturnTrue() {
    EarlyAdmission earlyAdmission = new EarlyAdmission(aaa);

    System.out.println("Accepted");
    earlyAdmission.getAcceptedResult();
    System.out.println("Declined");
    earlyAdmission.getDeclinedResult();
  }

  @Test
  public void shouldThrowException() {

  }
}
