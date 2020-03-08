package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PositionTest {
    @Test
    @DisplayName("포지션 생성 테스트")
    void positionTest(){
        Assertions.assertThatCode(()->new Position(0)).doesNotThrowAnyException();
    }

    @Test
    @DisplayName("포지션 생성 테스트")
    void throw_positionTest(){
        Assertions.assertThatCode(()->new Position(-1)).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(ints = {4,5})
    @DisplayName("전진 테스트")
    void movePositionTest(int input){
        Position position = new Position(0);
        position.movePosition(input);

        Assertions.assertThat(position).extracting("position").isEqualTo(1);
    }

    @ParameterizedTest
    @ValueSource(ints = {2,3})
    @DisplayName("전진 테스트")
    void no_movePositionTest(int input){
        Position position = new Position(0);

        position.movePosition(input);

        Assertions.assertThat(position).extracting("position").isEqualTo(0);
    }
}
