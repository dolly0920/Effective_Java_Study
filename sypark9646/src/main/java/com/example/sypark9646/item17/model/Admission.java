package com.example.sypark9646.item17.model;

import com.example.sypark9646.item17.utils.Messages;
import com.example.sypark9646.item17.utils.RandomUtils;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Admission {

    private University university;
    private String department;
    @Getter
    private boolean isAccepted;

    public Admission(University university, String department) {
        this.university = university;
        this.department = department;
        this.isAccepted = RandomUtils.getRandomBoolean();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (!(o instanceof Admission)) {
            return false;
        }

        Admission admission = (Admission) o;
        return this.university == admission.university;
    }

    @Override
    public int hashCode() {
        return university.hashCode();
    }

    @Override
    public String toString() {
        String acceptance = isAccepted ? Messages.PASS.getMessage() : Messages.FAIL.getMessage();

        return new StringBuilder("")
            .append(university.getName())
            .append("학교 ")
            .append(this.department)
            .append(" 지원 결과")
            .append(acceptance)
            .append("입니다.")
            .toString(); // string 으로 하는게 더 좋을까...?
    }
}
