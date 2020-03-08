package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import utils.StringUtils;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class PlayRoundTest {
    @ParameterizedTest
    @ValueSource(strings = {"1","2"})
    @DisplayName("playRound 객체 생성 테스트")
    void playRound(String input){
        Assertions.assertThatCode(()->new PlayRound(input)).doesNotThrowAnyException();
    }
    @ParameterizedTest
    @ValueSource(strings = {"","-1"})
    @DisplayName("playRound 객체 생성 오류 테스트")
    void throw_playRound(String input){
        Assertions.assertThatThrownBy(()->new PlayRound(input));
    }

    @Test
    @DisplayName("null 입력 예외 테스트")
    void null_playRound(){
        Assertions.assertThatThrownBy(()->new PlayRound(null)).isInstanceOf(NullPointerException.class);
    }
}