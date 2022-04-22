package racingcar.View;

import racingcar.NameUtils;
import racingcar.Names;

public class NameInput {
    private static final String NAME_INPUT_GUIDE_MESSAGE = "이름을 입력하시오. (여러명을 입력할 경우 , 로 구분해주세요)";

    public static Names input(String name) {
        View.out(NAME_INPUT_GUIDE_MESSAGE);
        return new Names(NameUtils.mapToList(name));
    }
}
