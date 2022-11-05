public class Guitar extends StringInstrument {

boolean isElectric;

public Guitar(boolean onSale, double price, int numInStock, int numStrings, boolean isElectric) {
	super(onSale, price, numInStock, numStrings);
	this.isElectric = isElectric;
}

public boolean getIsElectric() {
	
	return isElectric;
	
	
}

@Override
public String toString() {
	return "Guitar [isElectric=" + isElectric + ", numStrings=" + numStrings + ", onSale=" + onSale + ", price=" + price
			+ ", numInStock=" + numInStock + "]";
}


}