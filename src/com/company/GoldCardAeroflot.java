package com.company;

import java.math.BigDecimal;

public class GoldCardAeroflot extends CreditCard{
    GoldCardAeroflot(String firstName, String lastName)
    {
        super.firstName = firstName;
        super.lastName = lastName;
        super.creditLimit= BigDecimal.valueOf(300_000.0);
        super.costCardService=BigDecimal.valueOf(3500.0);
        super.interestFreePeriod=50;
        super.interestRate=25.9;
    }
}
