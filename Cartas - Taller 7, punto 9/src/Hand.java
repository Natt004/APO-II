import java.util.Random;
import java.util.Scanner;



public class Hand {

public void entregarCartas()
{   Random r=new Random();
	Card[] list=new Card[5];
	 int suits = 4;
	 int cardType = 13;
	 int cardCount = 0;
	 for(int i = 1; i <= 5; i++){
		 int variable1=r.nextInt(3)+1;
		 int variable2=r.nextInt(12)+1;
		 list[cardCount] = new Card(variable1,variable2);
		 cardCount++;}
	 int CartasC=0;
	 int puntosTotales=0, contador=2;
	 int continuar=0;
	 Scanner sc=new Scanner(System.in);
	do
	 {
	 System.out.println("\nSus cartas son: \n");
	 for(int i = 0; i < contador; i++)
		{System.out.println(list[i]);}

for (int i=0;i<contador;i++)
{ 
	puntosTotales+=list[i].getPoints();
}
System.out.println("\nSus puntos hasta el momento son: " +puntosTotales);
System.out.println("\nQuiere otra carta? \n1.Si\n2.No");
continuar=sc.nextInt();
if (continuar!=2)
{
contador++;}
else
{ break;
}
if(puntosTotales<=21)
{System.out.println("Pasaste los 21 puntos.");
break;
}
}while(contador<6);
	
}}
