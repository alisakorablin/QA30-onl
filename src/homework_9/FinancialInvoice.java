package homework_9;


import java.time.LocalDate;

public class FinancialInvoice extends AbstractDoc {
    private final double amount;
    private final String departmentCode;

    public FinancialInvoice(String documentNumber, LocalDate documentDate, double totalAmount, String departmentCode) {
        super(documentNumber, documentDate);
        this.amount = totalAmount;
        this.departmentCode = departmentCode;
    }

    public String getDocumentNumber() {
        return "INV" + documentNumber;
    }

    @Override
    public void printInfo() {
        System.out.println("Финансовая накладная: Номер документа - " + documentNumber +
                ", Дата документа - " + documentDate +
                ", Итоговая сумма за месяц - " + amount +
                ", Код департамента - " + departmentCode);
    }
}
