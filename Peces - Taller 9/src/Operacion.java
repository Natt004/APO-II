import java.util.Scanner;

public class Operacion {
	Scanner sc=new Scanner(System.in);
	
			
			
		public String inicializarPeces()
		{
		System.out.println("Escriba la cantidad de peces a ingresar");
		int cantidadPeces=sc.nextInt();	
		Fish[] fi=new Fish[cantidadPeces];
		
		for (int i=0;i<cantidadPeces;i++)
		{System.out.println("Pescado numero "+(i+1) +"\n");
			
		System.out.println("Escribe el nombre del pescado");
			String n=sc.next(); 
			sc.nextLine();
			
			System.out.println("Escribe el tipo de pescado");
			String t=sc.nextLine();

		
			System.out.println("Digite la escala de amistad con el pescado");
			System.out.println("1.Malo\n2.No amigable\n3.Neutral\n4.Amigable\n5.Muy amigable");
			int f=sc.nextInt();
			
			
			fi[i]=new Fish(n,t,f);}
		String niceFish="";
		
int contador=0;
int tem=fi[0].getFriendliness();

for (int i=0;i<cantidadPeces;i++)
{ int amistad=fi[i].getFriendliness();
if (amistad>tem)
{tem=amistad;
contador=i;
}
niceFish=fi[contador].toString();
}System.out.println("El pez más amigable fue: " +niceFish);
return niceFish;
}}

