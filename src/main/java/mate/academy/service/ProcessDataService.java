package mate.academy.service;import mate.academy.model.FruitTransaction;import mate.academy.strategy.TransactionStrategy;import java.util.List;public interface ProcessDataService {    void processTransactions(List<FruitTransaction> transactions,                             TransactionStrategy transactionStrategy);}