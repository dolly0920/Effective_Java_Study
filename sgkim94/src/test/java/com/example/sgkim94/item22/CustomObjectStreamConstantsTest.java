package com.example.sgkim94.item22;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CustomObjectStreamConstantsTest {

    @Test
    @DisplayName("CustomObjectStreamConstants에 정의된 STREAM_MAGIC값을 가져온다")
    void stream_magic() {
        assertThat(CustomObjectStreamConstants.STREAM_MAGIC).isEqualTo((short) -21267);
    }
}
