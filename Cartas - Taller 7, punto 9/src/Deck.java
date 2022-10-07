
import java.util.Random;

public class Deck {
		Card[] cardArray = new Card[52];
		Deck(){ //constructor
		 int suits = 4;
		 int cardType = 13;
		 int cardCount = 0;
		 for(int i = 1; i <= suits; i++)
		 for(int j = 1; j <= cardType; j++){
		 cardArray[cardCount] = new Card(i,j);
		 cardCount++;
		 }
		 }

		public void print(){
		for(int i = 0; i < cardArray.length; i++)
		{System.out.println(cardArray[i]);
		}
		}
		
		
	public void Mezclar() {
	Random r=new Random();
	 int suits = 4;
	 int cardType = 13;
	 int cardCount = 0;
	 for(int i = 1; i <= suits; i++)
	 for(int j = 1; j <= cardType; j++){
	 int variable1=r.nextInt(3)+1;
	 int variable2=r.nextInt(12)+1;
	 cardArray[cardCount] = new Card(variable1,variable2);
	 cardCount++;}
	 System.out.println("\nLas cartas han sido mezcladas: \n");
	 for(int i = 0; i < cardArray.length; i++)
		{System.out.println(cardArray[i]);
		}
	 }
	}



