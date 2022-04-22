package racingcar.View;

public class LapsInput {
    private static final String LABS_INPUT_GUIDE_MESSAGE = "횟수를 입력하시오. ";
    private static final String WHITESPACE_MESSAGE = "공백만 입력하면 안됩니다.";
    private static final String INVALID_NUMBER_MESSAGE =  "숫자만 입력해야 합니다.";

    public static int input(String labs) {
        View.out(LABS_INPUT_GUIDE_MESSAGE);

        if (labs.trim().isEmpty()){
            throw new IllegalArgumentException(WHITESPACE_MESSAGE);
        }

        try {
            return Integer.parseInt(labs);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(INVALID_NUMBER_MESSAGE);
        }
    }
}
