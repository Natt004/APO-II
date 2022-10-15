import java.util.Scanner;
public class Cuenta {

		Scanner sc=new Scanner(System.in);
		
		private String titular;
		private double cantidad;
		
		public Cuenta() {}
		
		public Cuenta(String titular, double cantidad) {
			if(cantidad<0)
			{
			cantidad=0;
			}
			this.titular = titular;
			this.cantidad = cantidad;	}
		
		public String getTitular() {
			return titular;
		}
		public void setTitular(String titular) {
			this.titular = titular;
		}
		public double getCantidad() {
			return cantidad;
		}
		public void setCantidad(double cantidad) {
			this.cantidad = cantidad;
		}
		
		@Override
		public String toString() {
			return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
		}
		
		public void ingresar(double cantidad)
		{
		System.out.println("Ingrese la cantidad que desee ingresar a la cuenta: ");
		double ingreso=sc.nextDouble();
		if (ingreso>0)
		{
		cantidad=ingreso;
		}}
		
		public void retirar(double cantidad)
		{System.out.println("Ingrese la cantidad que desee retirar de la cuenta");
		double retiro=sc.nextDouble();
		cantidad=cantidad-retiro;
		if(cantidad<0)
		{
		cantidad=0;
		}
		}
	}
