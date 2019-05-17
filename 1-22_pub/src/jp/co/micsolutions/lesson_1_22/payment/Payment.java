package jp.co.micsolutions.lesson_1_22.payment;

import jp.co.micsolutions.lesson_1_22.data.Store;

public interface Payment {
    public Store cash(double price, Store store);

    public Store credit(double price, Store store);

    public Store eMoney(double price, Store store);
}