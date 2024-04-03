package test;

import java.util.Objects;
import java.util.Vector;

public class MoneyBag implements Imoney{
	
	private Vector<Money> fMonies = new Vector<Money>();
	
	MoneyBag(Money m1, Money m2){
		appendMoney(m1);
		appendMoney(m2);
	}
	
	MoneyBag(Money bag[]) {
		for (int i = 0; i< bag.length; i++)
			appendMoney(bag[i]);
	}
	public MoneyBag(MoneyBag mb, Money m) {
	    fMonies.addAll(mb.fMonies);
	    appendMoney(m);
	}
	private void appendMoney (Money m) {
		if (fMonies.isEmpty()) {
			fMonies.add(m);
		}
		else {
			int i = 0;
			while ((i< fMonies.size())
					&& (!(fMonies.get(i).currency().equals(m.currency()))))
				i++;
			if ( i>= fMonies.size()) {
				fMonies.add(m);
			}else {
				fMonies.set(i, new Money(fMonies.get(i).amount() + m.amount(), m.currency()));
			}
		}
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MoneyBag moneyBag = (MoneyBag) obj;
        return Objects.equals(fMonies, moneyBag.fMonies);
    }
	
	@Override
    public Imoney add(Imoney amoney) {
        return new MoneyBag(this, (Money) amoney);
    }

	@Override
	public Imoney addMoney(Money m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Imoney addMoneyBag(MoneyBag mb) {
		// TODO Auto-generated method stub
		return null;
	}
}
