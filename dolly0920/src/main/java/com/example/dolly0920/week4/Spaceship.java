package com.example.dolly0920.week4;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Spaceship {
  private final int id;
  private final int speed;
  private final int stability;

  @Override
  public boolean equals(Object o) {
    if (o == this) { // previous equals method
      return true;
    }
    if (o == null) { // always return false when parameter is null value
      return false;
    }
    // instanceof : [reference type] instance of [class] : return [boolean]
    if (!(o instanceof Spaceship)) { // different class => return false
      return false;
    }
    Spaceship sp = (Spaceship) o; // type change
    return this.id == sp.id && this.speed == sp.speed && this.stability == sp.stability;
  }

  @Override
  public int hashCode() {
    int hashcode = Integer.hashCode(id);
    hashcode = 31 * hashcode + Integer.hashCode(speed);
    hashcode = 31 * hashcode + Integer.hashCode(stability);
    return hashcode;
  }
}
