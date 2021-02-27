package com.example.sypark9646.item17.model;

public enum University {
    CATHOLIC("가톨릭대"),
    KONKUK("건국대"),
    KUONGGI("경기대"),
    KYUNGHEE("경희대"),
    KOREA("고려대"),
    KWANGWOON("광운대"),
    KOOKMIN("국민대"),
    SEOUL("서울대"),
    SOGANG("서강대"),
    SUNGKYUNKWAN("성균관대");


    private String name;

    University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
