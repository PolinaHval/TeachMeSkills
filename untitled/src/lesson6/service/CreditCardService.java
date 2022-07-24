package lesson6.service;

import lesson6.entity.CreditCard;

public class CreditCardService {
    int result;

    public void transferAmount (CreditCard creditCard, int number) {
        result = creditCard.getAmountOnAccount() + number;
    }

    public void withdrawAmount( CreditCard creditCard, int number) {
        result = creditCard.getAmountOnAccount() - number;
    }

    public void cardStatus (CreditCard creditCard) {
        System.out.println( "Номер карты " + creditCard.getAccountNumber());
        System.out.println("Текущее состояние карты " + result);
    }
}
