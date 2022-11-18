//Se importa la clase Scanner
import java.util.Scanner;

//Se declara la clase principal
public class Principal {
//Se declara el metodo main
public static void main(String[] args) {

//Se declara la clase Scanner.
Scanner sc=new Scanner(System.in);

int eleccion=0;

//Se le solicita al usuario una eleccion para poder ver los salarios de los empleados.
System.out.println("||||Bienvenido||||");
System.out.println("Digite el salario que desee ver:"
+"\n1.Desarrollador Backend.\n2.Desarrollador Fronted."		);
eleccion=sc.nextInt();
switch (eleccion)
{//Al tomar la primera eleccion, se dará el sueldo del desarrollador Backend 
case 1: DesarrolladorBackend des1=new DesarrolladorBackend("Luisa","Morales","Cra 5 #80-20",102004501,0,'F');
System.out.println("El salario del desarrollador Backend es de: " +des1.devolverSalario());
break;
//Al tomar la segunda eleccion, se dará el sueldo del desarrollador Fronted 
case 2: DesarrolladorFronted des2=new DesarrolladorFronted("Luna", "Lopez", "Calle 13 #90-23",20105030,0,'F');
System.out.println("El salario del desarrollador Fronted es de: " +des2.devolverSalario());
break;
}

}
}
