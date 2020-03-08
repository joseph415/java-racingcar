package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    @DisplayName("자동차 객체 생성 테스트")
    void carTest(){
        Assertions.assertThatCode(()->new Car(new CarName("crong"),new Position(0))).doesNotThrowAnyException();
    }

    @Test
    @DisplayName("자동차 객체 생성 에러(Name) 테스트")
    void throw_name_carTest(){
        Assertions.assertThatCode(()->new Car(new CarName("subway"),new Position(0)))
                .isInstanceOf(IllegalArgumentException.class);
    }
    @Test
    @DisplayName("자동차 객체 생성 에러(position) 테스트")
    void throw_position_carTest(){
        Assertions.assertThatCode(()->new Car(new CarName("crong"),new Position(-1)))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
