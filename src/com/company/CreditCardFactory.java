package com.company;

public interface CreditCardFactory {
    CreditCard createCreditCard(String firstName, String lastName, TypeCreditCard typeCreditCard);
}
