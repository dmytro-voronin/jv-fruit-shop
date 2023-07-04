package mate.academy.service.transaction;//*

import mate.academy.dao.FruitDao;
import mate.academy.dao.FruitDaoImpl;
import mate.academy.model.FruitTransaction;

public class BalanceHandlerImpl implements TransactionHandler {
    private final FruitDao fruitDao;

    public BalanceHandlerImpl() {
        fruitDao = new FruitDaoImpl();
    }

    @Override
    public void handleTransaction(FruitTransaction transaction) {
        fruitDao.add(transaction.getFruit(), transaction.getQuantity());
    }
}
