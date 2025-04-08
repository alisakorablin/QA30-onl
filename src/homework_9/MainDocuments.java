package homework_9;

import homework_9.Exception.Exception1a2b;
import homework_9.Exception.Exception555;
import homework_9.Exception.ExceptionAbc;


import java.time.LocalDate;


public class MainDocuments {
    public static void main(String[] args) {
        Register registry = new Register();


        try {
            ContractForGoods contractForGoods = new ContractForGoods("ab1234", LocalDate.of(2023, 1, 1), "123", 10);
            ContractForEmployee employeeContract = new ContractForEmployee("555test", LocalDate.of(2023, 1, 1), 1111, LocalDate.of(2023, 1, 1), "Testovoi");
            FinancialInvoice invoice = new FinancialInvoice("ends on 1a2v", LocalDate.of(2023, 1, 1), 50.0, "11111");

            checkDocumentNumber(contractForGoods.getDocumentNumber());
            checkDocumentNumber(employeeContract.getDocumentNumber());
            checkDocumentNumber(invoice.getDocumentNumber());

            registry.saveDocument(contractForGoods);
            registry.saveDocument(employeeContract);
            registry.saveDocument(invoice);

            for (int i = 0; i < registry.doc.length; i++) {
                if (registry.doc[i] != null) {
                    registry.getDocumentInfo(registry.doc[i]);
                }
            }
        } catch (ExceptionAbc | Exception555 | Exception1a2b e) {
            System.out.println("Исключение: " + e.getMessage());
        }
    }


    public static void checkDocumentNumber(String documentNumber) throws ExceptionAbc, Exception555, Exception1a2b {
        if (documentNumber.contains("abc")) {
            throw new ExceptionAbc("Номер документа содержит последовательность 'abc'");
        }

        if (documentNumber.startsWith("555")) {
            throw new Exception555("Номер документа начинается с последовательности '555'");
        }

        if (documentNumber.endsWith("1a2b")) {
            throw new Exception1a2b("Номер документа оканчивается на последовательность '1a2b'");
        }
    }
}