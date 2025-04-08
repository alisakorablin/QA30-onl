package homework_9;

import java.time.LocalDate;

public abstract class AbstractDoc implements Document {
    protected String documentNumber;
    protected LocalDate documentDate;

    public AbstractDoc(String documentNumber, LocalDate documentDate) {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }
}

