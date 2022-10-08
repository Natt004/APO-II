
public class Principal {
public static void main(String[] args) {
Informacion inf=new Informacion();
Operacion op=new Operacion();
double[][] calificaciones=inf.RecopilarDatos();
op.CalcularPromedio(calificaciones);
}
}
