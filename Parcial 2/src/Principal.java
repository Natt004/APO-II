import java.util.LinkedList;
import java.util.List;

public class Principal {
		public static void main(String[] args) {
			
Serie serie[]= {new Serie("Los sueños catastroficos",2,"Terror","Lucas Morales"),
new Serie("Tu odio es mi amor",1,"Drama","Maria Becerra"), 
new Serie("Te amo con locura",3,"Romance","Luna Corral"),
new Serie("La casa de los horrores",1,"Terror","Mario Ceballos"),
new Serie("Correle que se nos va",2,"Humor","Chloe Carrys")};

serie[0].entregar();
serie[2].entregar();
serie[4].entregar();

Videojuego videojuego[]= {new Videojuego("Little more",24,"Aventura","Sega"),
new Videojuego("El laberinto de las mil piezas",50,"Puzzles","Ghor"), 
new Videojuego("Los terrores de la calle how", 30,"Terror","Locke"),
new Videojuego("Sister", 35, "Aventura","Joop"), 
new Videojuego("Coster",20,"Construccion","Loom")};
		
videojuego[0].entregar();
videojuego[1].entregar();
videojuego[4].entregar();

int contadorseries=0;
int contadorvideojuegos=0;
for (int i=0;i<5;i++)
{boolean retornoseries=serie[i].isEntregado(serie[i]);
boolean retornovideojuegos=videojuego[i].isEntregado(videojuego[i]);
if (retornoseries==true)
{contadorseries++;
}
if (retornovideojuegos==true)
{contadorvideojuegos++;
}
}System.out.println("Se entregaron: " +contadorseries +" series");
System.out.println("Se entregaron: " +contadorvideojuegos +" videojuegos");

for (int i=0;i<5;i++)
{serie[i].compareTo(serie[i].getNumeroTemporadas());
}System.out.println("La serie con más temporadas fue: " +serie[2]);

for (int i=0;i<5;i++)
{videojuego[i].compareTo(videojuego[i].getHorasEstimadas());
}System.out.println("El videojuego con más horas fue: " +videojuego[1]);
}}
	


