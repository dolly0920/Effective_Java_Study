package com.example.sypark9646.item17;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.example.sypark9646.item17.model.Admission;
import com.example.sypark9646.item17.model.University;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EarlyAdmissionTest {

    @DisplayName("정상 동작 테스트")
    @Test
    void testEarlyAdmission() {
        List<Admission> admissions = new ArrayList<>();
        admissions.add(new Admission(University.CATHOLIC, "컴퓨터공학과"));
        admissions.add(new Admission(University.KONKUK, "컴퓨터공학과"));
        admissions.add(new Admission(University.KOREA, "컴퓨터공학과"));
        admissions.add(new Admission(University.KYUNGHEE, "컴퓨터공학과"));
        admissions.add(new Admission(University.SEOUL, "컴퓨터공학과"));
        admissions.add(new Admission(University.SOGANG, "컴퓨터공학과"));

        LocalDate birth = LocalDate.of(1996, 4, 6);

        EarlyAdmission earlyAdmission = new EarlyAdmission("박소연", birth, admissions);

        System.out.println("[Show Result]");
        earlyAdmission.showResult();
        System.out.println();

        System.out.println("[Get Accepted Result]");
        earlyAdmission.getAcceptedResult();

        System.out.println("[Get Declined Result]");
        earlyAdmission.getDeclinedResult();
    }

    @DisplayName("invalid size 테스트")
    @Test
    void testEarlyAdmission_WhenInvalidSize_ThrowException() {
        List<Admission> admissions = new ArrayList<>();
        admissions.add(new Admission(University.CATHOLIC, "컴퓨터공학과"));
        admissions.add(new Admission(University.KONKUK, "컴퓨터공학과"));
        admissions.add(new Admission(University.KOREA, "컴퓨터공학과"));
        admissions.add(new Admission(University.KYUNGHEE, "컴퓨터공학과"));
        admissions.add(new Admission(University.SEOUL, "컴퓨터공학과"));
        admissions.add(new Admission(University.SOGANG, "컴퓨터공학과"));
        admissions.add(new Admission(University.SUNGKYUNKWAN, "컴퓨터공학과"));

        LocalDate birth = LocalDate.of(1996, 4, 6);

        assertThatThrownBy(() -> {
            EarlyAdmission earlyAdmission = new EarlyAdmission("박소연", birth, admissions);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("duplicate admission 테스트")
    @Test
    void testEarlyAdmission_WhenDuplicateAdmission_ThrowException() {
        List<Admission> admissions = new ArrayList<>();
        admissions.add(new Admission(University.CATHOLIC, "컴퓨터공학과"));
        admissions.add(new Admission(University.KONKUK, "컴퓨터공학과"));
        admissions.add(new Admission(University.KOREA, "컴퓨터공학과"));
        admissions.add(new Admission(University.KYUNGHEE, "컴퓨터공학과"));
        admissions.add(new Admission(University.SEOUL, "컴퓨터공학과"));
        admissions.add(new Admission(University.SEOUL, "수학과"));

        LocalDate birth = LocalDate.of(1996, 4, 6);

        assertThatThrownBy(() -> {
            EarlyAdmission earlyAdmission = new EarlyAdmission("박소연", birth, admissions);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
