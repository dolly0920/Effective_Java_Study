package com.example.dolly0920.week6;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ResultForm {
  private final String name;
  private final String birthday;
  private final String university;
  private final String department;
  private final Boolean result;

  @Override
  public String toString() {
    return "name: "
        + name
        + ", birthday: "
        + birthday
        + ", university: "
        + university
        + ", department: "
        + department;
  }
}
