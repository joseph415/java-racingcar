package utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringUtilsTest {
    @Test
    @DisplayName("쉼표로 파싱되는지 테스트")
    void stringParseTest(){
        String input = "ase,ase,sdr";
        String[] expected = {"ase","ase","sdr"};

        assertThat(StringUtils.stringParse(input)).isEqualTo(expected);
    }
}
