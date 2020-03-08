package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarsTest {
    @Test
    @DisplayName("Cars 객체 생성 테스트")
    void carsTest(){
        String s = "crong,pobi";

        Assertions.assertThatCode(()->new Cars(s,0)).doesNotThrowAnyException();
    }
}