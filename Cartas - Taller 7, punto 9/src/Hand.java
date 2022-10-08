import java.util.Random;
	import java.util.Scanner;



	public class Hand {
		Card[] list=new Card[52];
		Random r=new Random();
	public void entregarCartas()
	{   generarCartas();
		 int CartasC=2;
		 int puntosTotales=0, puntosC=0, contador=2;
		 int continuar=0;
		 Scanner sc=new Scanner(System.in);
		 
		do
		 {
		 System.out.println("\nSus cartas son: \n");
		 for(int i = 0; i < contador; i++)
			{ 
			 System.out.println(list[i]);
		puntosTotales+=list[i].getPoints();}
		  	
		    if(puntosTotales>21)
			{System.out.println("\nPasaste los 21 puntos.");
			puntosTotales=1;
			contador=1;
			System.out.println("Ahora tienes: " +puntosTotales +" puntos");
		    generarCartas();}
		    
		    else if(puntosTotales==21)
			{System.out.println("Ganaste. Venciste al Crupier.");
			break;}
		    
			for(int i=1;i<CartasC;i++)
			{
			puntosC+=list[i].getPoints();
			if(puntosC>=16)
			{puntosC=16;
			break;
			}}
	System.out.println("\nSus puntos hasta el momento son: " +puntosTotales);
	System.out.println("Los puntos del crupier son:" +puntosC);
	System.out.println("Quiere otra carta? \n1.Si\n2.No");
	continuar=sc.nextInt();;
	
	if (continuar!=2)
	{
	CartasC++;
	contador++;}
	
	else
	{ break;
	}
	
	}while(contador<=5);
}
	
	public void generarCartas()
	 {int suits = 4;
	 int cardType = 13;
	 int cardCount = 0;
	 for(int i = 1; i <= suits; i++){
		for(int j=1;j<=cardType;j++)
		{
		 int variable1=r.nextInt(3)+1;
		 int variable2=r.nextInt(12)+1;
		 list[cardCount] = new Card(variable1,variable2);
		 cardCount++;}}}}