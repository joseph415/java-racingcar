package utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    @Test
    @DisplayName("쉼표로 파싱되는지 테스트")
    void stringParseTest(){
        String input = "ase,ase,sdr";
        String[] expected = {"ase","ase","sdr"};

        Assertions.assertThat(StringUtils.stringParse(input)).isEqualTo(expected);
    }
}
