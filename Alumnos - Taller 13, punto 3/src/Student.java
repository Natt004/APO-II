import java.util.Date;
import java.util.Random;

public class Student extends Person {

	private int id;
	private double gpa;
	private String carrera;
	private int anioGraduacion;

	public Student(String firstName, String middleName, String lastName, Date dateOfBirth, String carrera,
			int aniograduacion) {
		super(firstName, middleName, lastName, dateOfBirth);
		this.carrera = carrera;
		this.anioGraduacion = aniograduacion;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getAniograduacion() {
		return anioGraduacion;
	}

	public void setAniograduacion(int anioGraduacion) {
		this.anioGraduacion = anioGraduacion;
	}


	@Override
	public String toString() {
		return " Nombre= "+ getName() +", id=" + id + ", gpa=" + gpa + ", carrera=" + carrera + ", aniograduacion=" + anioGraduacion
		+", fechaNacimiento=" +getDateOfBirth() +"]";
	}

	public void generarId()
	{ Random r=new Random();
	this.id=r.nextInt(99999999)+1;
		
	}
	
	public double calcularGPA(String[] notas)
	{ for(int i=0;i<notas.length;i++)
	{
	if (notas[i].equals("A"))
	{gpa+=4;
	}
	else if(notas[i].equals("A-"))
	{gpa+=3.67;
	}
	else if(notas[i].equals("B+"))
	{gpa+=3.33;
	}
	else if(notas[i].equals("B"))
	{gpa+=3;
	}
	else if(notas[i].equals("B-"))
	{gpa+=2.67;
	}
	else if(notas[i].equals("C+"))
	{gpa+=2.33;
	}
	else if(notas[i].equals("C"))
	{gpa+=2;
	}
	else if(notas[i].equals("D"))
	{gpa+=1;
	}
	else if(notas[i].equals("F"))
	{gpa+=0;
	}
	}
	return gpa;
	}
	
	public String cambiarCarrera(String carreraACambiar)
	{carrera=carreraACambiar;
	
	return carrera;	
	}

}
