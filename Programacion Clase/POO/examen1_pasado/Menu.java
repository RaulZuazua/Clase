package examen1_pasado;
import java.util.*;
public class Menu {

	public static void main(String[] args)
	{
		Scanner teclado=new Scanner(System.in);
		String terminar, estadoCivil, nombre;
		int edad, opcion,hombresCasadosMayores=0, mujeresMenores=0; char sexo;
		int totalHombres=0, totalMujeres=0;
		System.out.println("¿Quieres meter datos de una persona?");
		terminar=teclado.nextLine();
		while (terminar.equalsIgnoreCase("si"))
		{
			System.out.println("Meter nombre");
			nombre=teclado.nextLine();
			System.out.println("Meter edad");
			edad=teclado.nextInt();
			System.out.println("Meter sexo");
			sexo=teclado.next().charAt(0);
			teclado.nextLine();
			System.out.println("Estado civil");
			estadoCivil=teclado.nextLine();
			if (sexo=='h')
			{
				totalHombres=totalHombres++;				
				hombresCasadosMayores=hombresCasadosMayores+comprobarHombres(edad,estadoCivil);
			}
			else
			{
				totalMujeres=totalMujeres++;
				mujeresMenores=mujeresMenores+comprobarMujeres(edad);
			}
			System.out.println("¿Meter datos de otra persona?");
			terminar=teclado.nextLine();
		}





		System.out.println("¿Qué quieres visualizar?");
		opcion=verMenu(teclado);
		switch(opcion)
		{
		case 1:
			System.out.println("Hubo "+hombresCasadosMayores+" hombres casados mayores de edad");
			break;
		case 2:
			System.out.println("Hubo "+mujeresMenores+" mujeres menores de edad");
			break;
		case 3:
			System.out.println("Hubo "+totalHombres+"hombres");
			break;
		case 4:
			System.out.println("Hubo "+totalMujeres+"mujeres");
			break;
		}
		teclado.close();
		}
	
	public static int comprobarHombres(int edad,String estadoCivil)
	{
		if((estadoCivil.equals("casado"))&&(edad>18))
			return(1);
		else
			return(0);
			
	}
	public static int comprobarMujeres(int edad)
	{
		if(edad<18)
			return(1);
		else
			return(0);
			
	}








	public static int verMenu(Scanner teclado)
	{
		System.out.println("1.Hombres casados mayores de edad");
		System.out.println("2.Mujeres menores de edad");
		System.out.println("3.Total de hombres");
		System.out.println("4.Total de mujeres");
		System.out.println("0.Salir sin visualizar nada");
		System.out.println("Mete opción");
		return(teclado.nextInt());
		
	}
	}

