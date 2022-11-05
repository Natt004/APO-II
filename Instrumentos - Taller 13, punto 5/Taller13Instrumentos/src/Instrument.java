public class Instrument {
boolean onSale;
double price;
int numInStock;

public Instrument(boolean onSale, double price, int numInStock) {
	this.onSale = onSale;
	this.price = price;
	this.numInStock = numInStock;
}

public boolean isOnSale() {
	return onSale;
}
public void setOnSale(boolean onSale) {
	this.onSale = onSale;
}

public double applyEmployeeDiscount(boolean empleado)
{ if (empleado==true)
{price=price*0.75;
	
}
	
return price;
}

public double getPrice() {
	
	if (onSale==true)
	{price=price-(price*0.15);
	}
	
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getNumInStock() {
	return numInStock;
}
public void setNumInStock(int numInStock) {
	this.numInStock = numInStock;
}



}
