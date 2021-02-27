package com.example.sypark9646.item17.utils;

public enum Messages {
    PASS("합격"),
    FAIL("불합격"),
    PASS_LIST("합격한 대학 목록입니다"),
    FAIL_LIST("불합격한 대학 목록입니다"),
    DELIMITER("- - -"),
    NO_PASS_LIST("합격한 대학이 없습니다."),
    NO_FAIL_LIST("불합격한 대학이 없습니다."),
    SHOW_RESULT_NO_PASS_MESSAGE("지원한 학교에 모두 떨어졌습니다. 재수 학원을 추천합니다..."),
    SHOW_RESULT_PASS_MESSAGE("합격을 축하합니다! 반수는 어떨까요...?"),
    DUPLICATE_ERROR_MESSAGE("같은 대학의 같은 학과를 다른 전형으로 지원하는 것은 불가능합니다."),
    SIZE_ERROR_MESSAGE("지원할 수 있는 학교 및 학과는 0개 이상 6개 이하입니다.")
    ;


    private String message;

    Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
