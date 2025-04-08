package homework_9;

import java.time.LocalDate;

public class ContractForGoods extends AbstractDoc {
    private final String goodsType;
    private final int goodsQuantity;

    public ContractForGoods(String documentNumber, LocalDate documentDate, String goodsType, int goodsQuantity) {
        super(documentNumber, documentDate);
        this.goodsType = goodsType;
        this.goodsQuantity = goodsQuantity;

    }
    public String getDocumentNumber() {
        return "GC" + documentNumber;
    }

    @Override
    public void printInfo() {
        System.out.println("Контракт на поставку товаров: Номер документа - " + documentNumber +
                ", Дата документа - " + documentDate +
                ", Тип товара - " + goodsType +
                ", Количество товаров - " + goodsQuantity);
    }
}
