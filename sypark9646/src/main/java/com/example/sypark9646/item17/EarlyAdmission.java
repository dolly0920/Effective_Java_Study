package com.example.sypark9646.item17;

import java.time.LocalDate;
import java.util.List;
import com.example.sypark9646.item17.model.Admission;
import com.example.sypark9646.item17.model.Admissions;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EarlyAdmission {

    private String name;
    private LocalDate birth;
    private Admissions admissions;

    public EarlyAdmission(String name, LocalDate birth, List<Admission> admissionList) {
        this.name = name;
        this.birth = birth;
        this.admissions = new Admissions(admissionList);
    }

    public void showResult() {
        System.out.println(name+"님의 지원 결과");
        admissions.showResult();
    }

    public void getAcceptedResult() {
        System.out.println(name+"님의 지원 결과");
        admissions.getAcceptedResult();
    }

    public void getDeclinedResult() {
        System.out.println(name+"님의 지원 결과");
        admissions.getDeclinedResult();
    }
}
