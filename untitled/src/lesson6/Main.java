package lesson6;

import lesson6.entity.CreditCard;
import lesson6.service.CreditCardService;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCardAlfaBank = new CreditCard(5864587156325896L, 100);
        CreditCard creditCardVtbBank = new CreditCard(2458215826352147L, 600);
        CreditCard creditCardBelarusBank = new CreditCard(7458412565238569L, 268);

        CreditCardService creditCardService = new CreditCardService();
        creditCardService.transferAmount(creditCardAlfaBank,56);
        creditCardService.cardStatus(creditCardAlfaBank);

        creditCardService.transferAmount(creditCardVtbBank,299);
        creditCardService.cardStatus(creditCardVtbBank);

        creditCardService.withdrawAmount(creditCardBelarusBank,166);
        creditCardService.cardStatus(creditCardBelarusBank);

    }
}
