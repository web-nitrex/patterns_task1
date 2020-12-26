package com.company;

import java.math.BigDecimal;
import java.util.Random;

public abstract class CreditCard {

    CreditCard()
    {
        numberCard = generateCardNumber();
    }

    protected BigDecimal creditLimit=new BigDecimal(0.0);
    protected BigDecimal costCardService = new BigDecimal(0.0);
    protected BigDecimal balance = new BigDecimal(0.0);
    protected int interestFreePeriod = 0;
    protected double interestRate = 0.0;
    protected String firstName="";
    protected String lastName="";
    protected long numberCard=0;

    private static long generateCardNumber()
    {
        long min=1000_0000_0000_0000L;
        long max=9999_9999_9999_9999L;
        Random random = new Random();
        return random.longs(min,(max+1)).findFirst().getAsLong();
    }

    public void addBalance(BigDecimal amount) {
        if(amount.compareTo(BigDecimal.valueOf(0))==1)
            balance = balance.add(amount);
        else
            throw new RuntimeException("Invalid argument!");
    }

    public boolean subtractBalance(BigDecimal amount) {
        if(amount.compareTo(BigDecimal.valueOf(0))==1 && getBalance().compareTo(amount)==1) {
            balance = balance.subtract(amount);
            return true;
        }
        return false;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public BigDecimal getCostCardService() {
        return costCardService;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public int getInterestFreePeriod() {
        return interestFreePeriod;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public String getFullName()
    {
        return firstName +" " +lastName;
    }

    public long getNumberCard()
    {
        return numberCard;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Владелец карты: " +getFullName());
        sb.append("\n");
        sb.append("Номер карты: " +getNumberCard());
        sb.append("\n");
        sb.append("Баланс: "+getBalance());
        sb.append("\n");
        sb.append("Кредитный лимит: " + getCreditLimit());
        sb.append("\n");
        sb.append("Обслуживание карты: "+getCostCardService());
        sb.append("\n");
        sb.append("Процентная ставка по любым операциям (годовых): " + getInterestRate() +"%");
        sb.append("\n");
        sb.append("Беспроцентный период на все покупки: до "+getInterestFreePeriod()+" дней");
        sb.append("\n");

        return sb.toString();

    }
}
