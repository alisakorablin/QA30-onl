package homework_9;

import java.time.LocalDate;

public class ContractForEmployee extends AbstractDoc{
    private final int employeeID;
    private final LocalDate contractEndDate;
    private final String employeeName;

    public ContractForEmployee(String documentNumber, LocalDate documentDate, int employeeID, LocalDate contractEndDate, String employeeName) {
        super(documentNumber, documentDate);
        this.employeeID = employeeID;
        this.contractEndDate = contractEndDate;
        this.employeeName = employeeName;
    }
    public String getDocumentNumber() {
        return "EC" + documentNumber;
    }

    @Override
    public void printInfo() {
        System.out.println("Контракт с сотрудником: Номер документа - " + documentNumber +
                ", Дата документа - " + documentDate +
                ", ID сотрудника - " + employeeID +
                ", Дата окончания контракта - " + contractEndDate +
                ", Имя сотрудника - " + employeeName);
    }
}
