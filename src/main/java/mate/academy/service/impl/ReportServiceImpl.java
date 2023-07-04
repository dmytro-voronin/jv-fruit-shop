package mate.academy.service.impl;//*

import java.util.Map;
import mate.academy.dao.FruitDao;
import mate.academy.dao.FruitDaoImpl;
import mate.academy.service.ReportService;

public class ReportServiceImpl implements ReportService {
    private final String reportHeader;
    private final String dataSeparator;
    private final FruitDao fruitDao;

    public ReportServiceImpl() {
        reportHeader = "fruit,quantity";
        dataSeparator = ",";
        fruitDao = new FruitDaoImpl();
    }

    @Override
    public String createReport() {
        StringBuilder reportBuilder = new StringBuilder().append(reportHeader);
        for (Map.Entry<String, Integer> entry : fruitDao.getAll().entrySet()) {
            reportBuilder.append(System.lineSeparator()).append(entry.getKey()).append(dataSeparator).append(entry.getValue());
        }
        return reportBuilder.toString();
    }
}
