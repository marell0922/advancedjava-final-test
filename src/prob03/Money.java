package prob03;

public class Money {

	//field
	private int amount;
	
	//constructor
	public Money(int amount) {
		this.amount = amount;
	}

	//method
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if(obj ==null)
			return false;
		if(!(obj instanceof Money))
			return false;
		Money other = (Money) obj;
		if (amount != other.amount)
			return false;
		return true;
	}

	public Object add(Money m) {
		// TODO Auto-generated method stub
		return new Money(amount+m.amount);
	}

	public Object minus(Money m) {
		// TODO Auto-generated method stub
		return new Money(amount-m.amount);
	}

	public Object multiply(Money m) {
		// TODO Auto-generated method stub
		return new Money(amount*m.amount);
	}

	public Object devide(Money m) {
		// TODO Auto-generated method stub
		return new Money((int)amount/m.amount);
	}
    
    
}
