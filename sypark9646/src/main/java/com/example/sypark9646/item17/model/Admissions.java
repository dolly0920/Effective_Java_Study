package com.example.sypark9646.item17.model;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import com.example.sypark9646.item17.utils.Messages;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Admissions {

    public static final int MAX_APPLY_SIZE = 6;
    private List<Admission> admissions;

    public Admissions(List<Admission> admissions) {
        validateSize(admissions);
        validateDuplicate(admissions);
        this.admissions = admissions;
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
        boolean isAccepted = admissions.stream().anyMatch(Admission::isAccepted);

        getAcceptedResult();
        String message =
            isAccepted ? Messages.SHOW_RESULT_PASS_MESSAGE.getMessage()
                : Messages.SHOW_RESULT_NO_PASS_MESSAGE.getMessage();
        System.out.println(message);
    }

    public void getAcceptedResult() {
        System.out.println(Messages.PASS_LIST.getMessage());
        System.out.println(Messages.DELIMITER.getMessage());
        AtomicBoolean isAccepted = new AtomicBoolean(false);

        admissions.forEach(
            admission -> {
                if (admission.isAccepted()) {
                    System.out.println(admission);
                    isAccepted.set(true);
                }
            }
        );

        if (!isAccepted.get()) {
            System.out.println(Messages.NO_PASS_LIST.getMessage());
        }
        System.out.println(Messages.DELIMITER.getMessage());
    }

    public void getDeclinedResult() {
        System.out.println(Messages.FAIL_LIST.getMessage());
        System.out.println(Messages.DELIMITER.getMessage());
        AtomicBoolean isDeclined = new AtomicBoolean(false);

        admissions.forEach(
            admission -> {
                if (!admission.isAccepted()) {
                    System.out.println(admission);
                    isDeclined.set(true);
                }
            }
        );

        if (!isDeclined.get()) {
            System.out.println(Messages.NO_FAIL_LIST.getMessage());
        }
        System.out.println(Messages.DELIMITER.getMessage());
    }
}
