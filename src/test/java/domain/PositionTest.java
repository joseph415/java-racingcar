package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
}
