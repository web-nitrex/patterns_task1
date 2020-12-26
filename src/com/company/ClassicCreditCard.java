package com.company;

import java.math.BigDecimal;

public class ClassicCreditCard extends CreditCard{
    ClassicCreditCard(String firstName, String lastName)
    {
        super.firstName = firstName;
        super.lastName = lastName;
        super.creditLimit= BigDecimal.valueOf(300_000.0);
        super.costCardService=BigDecimal.valueOf(0.0);
        super.interestFreePeriod=50;
        super.interestRate=25.9;
    }
}
