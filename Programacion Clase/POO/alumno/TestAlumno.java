package alumno;

public class TestAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Alumno a1=new Alumno("Pepe", "AAA", 1992, 1);
		Alumno a2=new Alumno("Juan", "PPP", 1995, 2,"DAW","Mañana\n");
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		
		
		
		//modificar el grupo y horario del alumno a1
		
		a1.setGrupo("Multiplataforma");
		a1.setHorario("Tarde");
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
	} // fin main

} //fin programa
