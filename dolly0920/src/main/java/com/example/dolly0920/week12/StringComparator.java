package com.example.dolly0920.week12;

public enum StringComparator {
  NATURAL,
  REVERSE,
  LENGTH;

  public int compare(String s1, String s2) {
    switch (this) {
      case NATURAL:
        return s1.equals(s2) ? 1 : 0;
      case LENGTH:
        return s2.equals(s1) ? 1 : 0;
      case REVERSE:
        return s1.length() == s2.length() ? 1 : 0;
    }
    throw new AssertionError("Unknown operator:" + this);
  }
}
