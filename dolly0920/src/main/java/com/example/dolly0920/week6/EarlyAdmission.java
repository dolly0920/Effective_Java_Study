package com.example.dolly0920.week6;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
public class EarlyAdmission {

  private final List<ResultForm> result = new ArrayList<>();

  // Constructor
  public EarlyAdmission(List<ApplyForm> applyList) {
    validateCount(applyList);
    validateDuplicate(applyList);
    for (ApplyForm e : applyList) {
      result.add(
          new ResultForm(e.getName(), e.getBirthday(), e.getUniversity(), e.getDepartment(), generateResult()));
    }
  }

  private void validateCount(List<ApplyForm> list) {
    if (list.size() >= 7) {
      throw new IllegalArgumentException("Exceed number of applications");
    }
  }

  private void validateDuplicate(List<ApplyForm> list) {
    Set<ApplyForm> duplicate = new HashSet<>(list);
    if (duplicate.size() != list.size()) {
      throw new IllegalArgumentException("Duplicate apply");
    }
  }

  private boolean generateResult() {
    double randomValue = Math.random() * 10;
    return randomValue >= 5 ? true : false;
  }

  public String showResult() {
    for (ResultForm e : result) {
      if (e.getResult()) {
        return "Congratulation!! You have greater possibilities. Challenge yourself to a bigger goal.";
      }
    }
    return "There is no university that you passed. I hope there are good results next year.";
  }

  public void getAcceptedResult() {
    List<ResultForm> accepted = new ArrayList<>();
    for (ResultForm e : result) {
      if (e.getResult()) {
        accepted.add(e);
      }
    }
    for (ResultForm e : accepted) {
      System.out.println(e);
    }
  }

  public void getDeclinedResult() {
    List<ResultForm> declined = new ArrayList<>();
    for (ResultForm e : result) {
      if (!e.getResult()) {
        declined.add(e);
      }
    }
    for (ResultForm e : declined) {
      System.out.println(e);
    }
  }

}
