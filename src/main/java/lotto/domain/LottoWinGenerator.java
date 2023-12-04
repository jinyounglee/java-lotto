package lotto.domain;

import java.util.ArrayList;
import java.util.List;

public class LottoWinGenerator {

    private final List<Integer> winNumbers;

    public LottoWinGenerator(List<Integer> winNumbers) {
        this.winNumbers = winNumbers;
    }

    public Prize winPrize(Lotto lotto) {
        List<Integer> resultNumber = new ArrayList<>();
        for (int number : lotto.getNumbers()) {
            addNumberToResult(number, resultNumber);
        }
        return Prize.valueOf(resultNumber.size());
    }

    private void addNumberToResult(int number, List<Integer> resultNumbers) {
        if (winNumbers.contains(number)) {
            resultNumbers.add(number);
        }
    }
}
