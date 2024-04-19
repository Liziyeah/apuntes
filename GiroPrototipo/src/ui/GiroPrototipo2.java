// package ui;

import java.util.Scanner;

/**
 * Partial solution to the Giro de Rigo prototype 2  
 * To compile javac -cp src src/ui/GiroPrototipo2.java -d bin
 * To execute java -cp bin ui/GiroPrototipo2
 * @author angievig (credits to profe Angela)
 * @since march2024
 */
public class GiroPrototipo2 {
	
	/**
	 * Constant for the maximum number of subscriptions
	 */
	public static final int MAX_SUBSCRIPTIONS =5;
	public static final int PRICE_LEGEND = 1000000;
	public static final int PRICE_65K = 850000;
	public static final int PRICE_CARMELO = 500000;
	
	
	/**
	 * reader is the object for read the input, 
	 * it is declared as a global variable
	 */
	public static Scanner reader = new Scanner(System.in);

	/**
	 * The main method, starts the execution of the program
	 * @param args, is an array of strings
	 */
	public static void main(String[] args) {

		// flag es una variable para parar el ciclo, 1 para seguir y 0 para parar
		int flag = 1;

		//numRegistrados is the variable used to count all the registrations
		int numRegistrados =0; // as is a counter its initial value is zero
		String[] names = new String[5];
		double[] times = new double[5];
		int[] categories = new int[5];
		//TODO declare e inicialice los arreglos
	

		
		//the condition is composed, the loop must stop either 
		//- when the user chooses 0
		//- when the total of subscriptions reaches the maximum
		while(flag==1 && numRegistrados<MAX_SUBSCRIPTIONS) {
			
			System.out.println("Ingrese el nombre del competidor");
			names[numRegistrados] = reader.nextLine();
			
			System.out.println("Ingrese el tiempo del competidor (minutos.segundos)");
			times[numRegistrados] = reader.nextDouble();
			reader.nextLine();
			
			System.out.println("Ingrese la categoría del competidor (1) (2) (3)");
			categories[numRegistrados] = reader.nextInt();
			reader.nextLine();
			
			// avance del ciclo
			numRegistrados++;
			System.out.println("Desea seguir registrando competidores? "
					+ " 1 para si, otro número entero para no");
			flag= reader.nextInt();
			reader.nextLine();
			//TODO fix the scanner bug
		}
		
		//Una vez termina el ciclo se hacen los reportes
		if(numRegistrados ==	MAX_SUBSCRIPTIONS) {
			System.out.println("No puede ingresar más registros, el máximo es ("
								+ MAX_SUBSCRIPTIONS + ")");
		}
		
		//TODO Llamar el método para mostrar los registros
		printData(numRegistrados, names, categories, times);
		
		//TODO Llamar el método que calcula y muestra el resumen
		int respuesta = 1;
		while(respuesta != 0){
		System.out.println("Escribe en números la opción que deseas");
		System.out.println("1. Buscar por nombre");
		System.out.println("2. Menor tiempo de los competidores");
		System.out.println("3. Ver el tiempo en minutos y segundos separados");
		 respuesta = reader.nextInt();
		 reader.nextLine();
			switch(respuesta){
				case 1:
				System.out.println("Escribe el nombre de búsqueda");
				String name = reader.nextLine();
				buscarPorNombre(name, names, times, categories);
				break;
				case 2:
				System.out.println(menorTiempo(times));
				break;
				case 3:
				System.out.println("Escribe el tiempo en minutos,segundos");
				double ajuste = reader.nextDouble();
				reader.nextLine();
				ajustarTiempo(ajuste, times);
				break;
			}
		}
	}
	
	
	/**
	 * Method that prints the records of the athletes saved in the arrangements
	 * @param total, total number of registered
	 * @param nom array of names
	 * @param cat array of categories
	 * @param temps array of competitors' times
	 * @Returns: This method does not return a value (void).
	 */
	//TODO Arreglar el error en la definición de los parámetros
	public static void printData(int total, String [] nom, int [] cat, double [] temps) {
		
		System.out.println("Nombre \t | Categoria \t | Time ");
		
		for(int i=0; i<nom.length; i++) {
			
			System.out.println(nom[i]+ "\t | "+ cat[i] + " \t | " + temps[i] );
			
			
		}
		
	}

	/**
	 * Method to display in the console the message with the summary of the registration process
	 * calcula el total de competidores por cada una de las categorías
	 * y luego el total del dinero recaudado
	 * @param int total is the total number of registrations
	 * @param categorias array
	 * @Returns: This method does not return a value (void).

	 */
	public static void showSummary(int total, int[] categorias) {
		System.out.println("*** Summary of registrations ***");
		System.out.println("There is a total of "+ total+ " registrations where:");
		
		// TODO Usa un recorrido para calcular cuantos ciclistas hay registrados en cada categoria
		
		//TODO Calcula el total del dinero recaudado
	}
	
	/**
	 * Method that search the name of a competitor and shows all the registrations
	 * @param String name
	 * @param names array
	 * @param times array
	 * @param categories array
	 * @Returns: This method does not return a value (void).
	 */
	public static void buscarPorNombre(String name, String[] names, double[] times, int[] categories) {
		for(int i=0; i< names.length; i++) {
			if(names[i] != null){
				if(names[i].equals(name)){
				System.out.println(names[i]+ "\t | "+ categories[i] + " \t | " + times[i] );
				}
			}
		}
			
	}
	
	/**
	 * Method that compares the first position of the array with the others, and then, since it is smaller, it is saved in a variable
	 * @param double times
	 * @return double the less time
	 */
	public static double menorTiempo(double[] times) {
		String[] names = new String[5];
		double menorTiempoCompetidor = times[0];
		for(int i=0; i< names.length; i++) {
			if(times[i] != 0.0) {
				if(times[i] < menorTiempoCompetidor){
				menorTiempoCompetidor = times[i];	
				}
			}
		}
		return menorTiempoCompetidor;
	}
	
	/**
	 * Method 
	 * @param double ajuste
	 * @param double arreglo de tiempos
	 * @Returns: This method does not return a value (void).
	 */
	public static void ajustarTiempo(double ajuste, double[] tiempos) {
		for(int i=0; i< tiempos.length; i++) {
			if(ajuste == tiempos[i]){
				double segundos = ajuste % 1;
				double minutos = ajuste - segundos;
				System.out.println("El tiempo es: " + minutos + " en minutos y: " + segundos + " en segundos" );
			}
		}
	
	}
}
