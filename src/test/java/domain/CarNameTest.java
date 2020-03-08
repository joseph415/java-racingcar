package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarNameTest {
    @Test
    @DisplayName("자동차의 이름을 생성하는 객체 테스트")
    void carNameTest() {
        assertThatCode(() -> new CarName("crong")).doesNotThrowAnyException();
    }

    @Test
    @DisplayName("자동차의 이름을 생성하는 객체 예외 테스트")
    void throw_carNameTest() {
        assertThatThrownBy(() -> new CarName("subway")).isInstanceOf(IllegalArgumentException.class);
    }
    @Test
    @DisplayName("자동차의 이름을 생성하는 객체 예외(빈스트링) 테스트")
    void throw_empty_carNameTest() {
        assertThatThrownBy(() -> new CarName("")).isInstanceOf(IllegalArgumentException.class);
    }
    @Test
    @DisplayName("자동차의 이름을 생성하는 객체 예외(null) 테스트")
    void throw_null_carNameTest() {
        assertThatThrownBy(() -> new CarName(null)).isInstanceOf(NullPointerException.class);
    }
}