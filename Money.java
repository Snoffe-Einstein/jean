package test;

import java.util.Objects;

public class Money implements Imoney{

	private int fAmount;
	private String fCurrency;
	
	public Money(int amount, String currency) {
		fAmount = amount;
		fCurrency = currency;
	}
	
	public int amount() {
		return fAmount;
	}
	
	public String currency() {
		return fCurrency;
	}
	
	
	public Imoney addMoney(Money m) {
	    if (m.currency().equals(currency())) {
	        return new Money(amount() + m.amount(), currency());
	    }
	    return new MoneyBag(this, m);
	}

	public Imoney addMoneyBag(MoneyBag mb) {
	    return mb.addMoney(this);
	}

	@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Money money = (Money) obj;
        return fAmount == money.fAmount && Objects.equals(fCurrency, money.fCurrency);
    }
	

	 @Override
	   
	 public Imoney add(Imoney amoney) {
	        if (amoney instanceof Money) {
	            Money m = (Money) amoney;
	            if (m.currency().equals(currency())) {
	                return new Money(amount() + m.amount(), currency());
	            }
	        }
	        return new MoneyBag(this, (Money) amoney);
	    }
	
}
