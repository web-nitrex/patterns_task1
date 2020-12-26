package com.company;

import java.math.BigDecimal;

public class DigitalCreditCard extends CreditCard{
    DigitalCreditCard(String firstName, String lastName)
    {
        super.firstName = firstName;
        super.lastName = lastName;
        super.creditLimit= BigDecimal.valueOf(600_000.0);
        super.costCardService=BigDecimal.valueOf(0.0);
        super.interestFreePeriod=50;
        super.interestRate=23.9;
    }
}
