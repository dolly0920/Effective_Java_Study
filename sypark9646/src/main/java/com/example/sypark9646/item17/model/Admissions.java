package com.example.sypark9646.item17.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import com.example.sypark9646.item17.utils.Messages;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Admissions {

    public static final int MAX_APPLY_SIZE = 6;
    private List<Admission> admissions;
    private List<Admission> accepted = new ArrayList<>();
    private List<Admission> declined = new ArrayList<>();
    private String result;

    public Admissions(List<Admission> admissions) {
        validateSize(admissions);
        validateDuplicate(admissions);
        this.admissions = admissions;

        admissions.forEach(
            admission -> {
                if (admission.isAccepted()) {
                    this.accepted.add(admission);
                } else {
                    this.declined.add(admission);
                }
            }
        );

        this.result = accepted.size() != 0 ? Messages.SHOW_RESULT_PASS_MESSAGE.getMessage()
            : Messages.SHOW_RESULT_NO_PASS_MESSAGE.getMessage();
    }

    private void validateSize(List<Admission> admissions) {
        if (admissions.size() > MAX_APPLY_SIZE) {
            throw new IllegalArgumentException(Messages.SIZE_ERROR_MESSAGE.getMessage());
        }
    }

    private void validateDuplicate(List<Admission> admissions) {
        HashSet<Admission> noDuplicateAdmissions = new HashSet<>(admissions);
        if (admissions.size() != noDuplicateAdmissions.size()) {
            throw new IllegalArgumentException(Messages.DUPLICATE_ERROR_MESSAGE.getMessage());
        }
    }

    public void showResult() {
        admissions.forEach(
            System.out::println
        );
        System.out.println(result);
    }

    public void getAcceptedResult() {
        System.out.println(Messages.PASS_LIST.getMessage());
        System.out.println(Messages.DELIMITER.getMessage());

        accepted.forEach(
            System.out::println
        );

        if (accepted.size() == 0) {
            System.out.println(Messages.NO_PASS_LIST.getMessage());
        }
        System.out.println(Messages.DELIMITER.getMessage());
    }

    public void getDeclinedResult() {
        System.out.println(Messages.FAIL_LIST.getMessage());
        System.out.println(Messages.DELIMITER.getMessage());

        declined.forEach(
            System.out::println
        );

        if (declined.size() == 0) {
            System.out.println(Messages.NO_FAIL_LIST.getMessage());
        }
        System.out.println(Messages.DELIMITER.getMessage());
    }
}
