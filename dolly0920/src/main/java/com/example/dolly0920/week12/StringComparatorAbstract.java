package com.example.dolly0920.week12;

public enum StringComparatorAbstract {
  NATURAL {
    public int compare(String s1, String s2) {
      return s1.equals(s2) ? 1 : 0;
    }
  },
  REVERSE {
    public int compare(String s1, String s2) {
      return s2.equals(s1) ? 1 : 0;
    }
  },
  LENGTH {
    public int compare(String s1, String s2) {
      return s1.length() == s2.length() ? 1 : 0;
    }
  }
}
