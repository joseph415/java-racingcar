package domain;

import utils.StringUtils;

public class PlayRound {
    private int playRound;

    public PlayRound(String playRound) {
        validateNull(playRound);
        validateNumberFormat(playRound);
        validatePositiveNumber(playRound);

        this.playRound = StringUtils.parseStringToInteger(playRound);
    }

    private void validateNull(String playRound) {
        if (playRound == null) {
            throw new NullPointerException("null 입력 재입력 해주세요");
        }
    }

    private void validatePositiveNumber(String playRound) {
        if (StringUtils.parseStringToInteger(playRound) < 0) {
            throw new IllegalArgumentException("잘못된 입력입니다. 재입력 해주세요");
        }
    }

    private void validateNumberFormat(String playRound) {
        try {
            StringUtils.parseStringToInteger(playRound);
        } catch (RuntimeException e) {
            throw new NumberFormatException("잘못된 입력입니다. 재입력 해주세요");
        }
    }

    public int getPlayRound() {
        return playRound;
    }
}
