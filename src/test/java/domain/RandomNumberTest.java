package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.RandomNumberUtils;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class RandomNumberTest {

    @Test
    @DisplayName("랜덤넘버 생성시 객체 테스트")
    void rule() {
        Assertions.assertThatCode(()-> new RandomNumber(9))
                .doesNotThrowAnyException();
    }

    @Test
    @DisplayName("랜덤넘버 생성시 객체 테스트")
    void throw_rule() {
        Assertions.assertThatCode(()-> new RandomNumber(-1))
                .doesNotThrowAnyException();
    }
}