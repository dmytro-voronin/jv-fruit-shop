package mate.academy.service;

import java.util.List;
import mate.academy.model.FruitTransaction;

public interface ParserService {
    List<FruitTransaction> parseData(List<String> inputDataList);
}
