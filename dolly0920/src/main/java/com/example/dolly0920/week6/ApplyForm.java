package com.example.dolly0920.week6;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Objects;

@Getter
@RequiredArgsConstructor
public class ApplyForm {
  private final String name;
  private final String birthday;
  private final String university;
  private final String department;

  @Override
  public int hashCode() {
    return Objects.hash(name, birthday, university, department);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) { // previous equals method
      return true;
    }
    if (o == null) { // always return false when parameter is null value
      return false;
    }
    // instanceof : [reference type] instance of [class] : return [boolean]
    if (!(o instanceof ApplyForm)) { // different class => return false
      return false;
    }
    ApplyForm af = (ApplyForm) o; // type change
    return this.name == af.name
        && this.birthday == af.birthday
        && this.university == af.university
        && this.department == af.department;
  }
}
