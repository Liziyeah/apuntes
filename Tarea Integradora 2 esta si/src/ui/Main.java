package ui;

import java.util.Scanner;
import model .*;
import java.util.Calendar;

public class Main {

	// Variables globales
	static Scanner reader;
	static Controller con = new Controller();

	public static void main(String[] args) {

		reader = new Scanner(System.in);
		menu();


	}

	public static void menu()
	{

		int respuesta = 1;

		while (respuesta!=0) {

			System.out.println("\n \n Holi, elija un número para mostrar el menu \n");
			System.out.println("Opciones:\n" + "1. Menu administrativo \n" + "2. Menu de consultas\n");

			respuesta = reader.nextInt();

			reader.nextLine();

			switch (respuesta) {
					case 1:
						primerMenu();
						break;
					case 2:
						segundoMenu();
						break;

					default:
						System.out.print("Por favor ingrese una opcion válida");
						continue;
			}

		}

	}

	public static void primerMenu() {
		System.out.println("(1). Ingresar una Comunidad.\n"+
		"(2). Ingresar un lugar, el nombre debe ser único.\n"+
		"(3). Ingresar un producto de una comunidad.\n"+
		"(4). Eliminar un producto de una comunidad.\n"+
		"(5). Ingresar una especie a un lugar.\n"+
		"(6). Modificar los datos de la especie en un lugar.\n");
		int respuesta = reader.nextInt();

		reader.nextLine();

		switch (respuesta) {
				case 1:
					crearComunidad();
					break;

				case 2:

					break;

				case 4:
					con.ingresarEspecie();
					break;
				case 5:
					con.modificardatosEspecie();
					break;
				// case 6:
				// 	con.crearCasosPrueba();
				// 	break;

				default:
					System.out.print("Por favor ingrese una opcion valida");
		}
}

	public static void segundoMenu() {
		System.out.println("(1). Consultar la información de un lugar.\n"+
	"(2). Consultar la información de las comunidades de un departamento.\n"+
	"(3). Consultar la información de las comunidades cuyos problemas son: que les falta un hospital o que les falta una escuela.\n"+
	"(4). Consultar el nombre del lugar con mayor cantidad de especies.\n"+
	"(5). Consultar los tres lugares más grandes por kilómetro cuadrado.\n");
	int respuesta = reader.nextInt();

			reader.nextLine();

			switch (respuesta) {
					case 1:
						primerMenu();
						break;
					case 2:
						segundoMenu();
						break;
					case 3:
						primerMenu();
						break;
					case 4:
						segundoMenu();
						break;
					case 5:
						segundoMenu();
						break;

					default:
						System.out.print("Por favor ingrese una opcion valida");
			}
		}

	public static void crearComunidad(){
		System.out.println("Escribe el nombre de la comunidad: ");
		String name = reader.nextLine();
		System.out.println("Escribe un numero para el tipo de comunidad: ");
		System.out.println(" 1) Afrocolombiana, 2) Nativa, 3) Racial");
		int typeCommunityString = reader.nextInt();
		reader.nextLine();
		System.out.println("Escribe un nombre para el representante:");
		String nameRepresentant = reader.nextLine();
		System.out.println("Escribe un numero para el representante:");
		int contactNumberRepresentant = reader.nextInt();
		reader.nextLine();
		System.out.println("Escribe un numero para la cantidad de Residentes:");
		int amountResidents = reader.nextInt();
		reader.nextLine();
		System.out.println("Escribe un numero para el tipo de problema:");
		System.out.println("1) Falta de hospitales 2) Falta de agua  potable 3) Falta de comida 4) Falta de escuelas");
		int mainTroubleString = reader.nextInt();
		reader.nextLine();
		System.out.println(con.ingresarComunidad(name,typeCommunityString,nameRepresentant,contactNumberRepresentant,amountResidents,mainTroubleString));
	}

	public static void createPlace() {
		System.out.println("Escribe el nombre del lugar: ");
		String namePlace = reader.nextLine();
		System.out.println("Escribe un número para el nombre del departamento: ");
		System.out.println("1) Chocó, 2) Valle, 3) Cauca, 4) Nariño");
		int typeDepartmentString = reader.nextInt();
		System.out.println("Escribe la extensión en km del lugar:");
		double extensionKm = reader.nextDouble();
		System.out.println("Escribe un número para el tipo de lugar: ");
		System.out.println("1) Area protegida, 2) Parque Nacional, 3) Area privada");
		int typePlaceString = reader.nextInt();
		// System.out.println("Escribe la fecha de inaguración del lugar:");
		// Calendar date = reader.next();
		System.out.println("Ingresa la URL de la imagen del lugar: ");
		String urlPicture = reader.nextLine();
		System.out.println("Escribe el nombre de la comunidad que cuida el lugar");
		String comunnityOfPlace = reader.nextLine();
		System.out.println("Escribe la cantidad de recursos económicos necesarios para el cuidado del hábitat del lugar: ");
		double resources = reader.nextDouble();
		System.out.println("Escribe las especies que habitan en el lugar:");
		resources = reader.nextDouble();
		reader.nextLine();
		System.out.println(con.ingresarLugar(namePlace, extensionKm, urlPicture, ));

	}
}