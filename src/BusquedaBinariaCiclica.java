import java.util.Arrays;
import java.util.Scanner;

public class BusquedaBinariaCiclica{

	/**
	 * Imprime un secuencia
	 * @param secuencia, el secuencia a imprimir.
	 * @return regresa la representación en cadena de un secuencia.
	 */
	private static String imprime(int[] secuencia){
		String s = "[";
		for(int i=0;i < secuencia.length-1;i++){
			s += (secuencia[i] + ",");
		}
		s+= secuencia[secuencia.length-1] +"]";
		return s;
	}
	
	/**
	 * Extrae un subsecuencia de una secuencia.
	 * @param secuencia, el secuencia de donde se extraera el subsecuencia.
	 * @param a, indice en el secuencia del primer el elemento del subsecuencia.
	 * @param b, indice en el secuencia del ultimo elemento del subsecuencia.
	 * @return el subsecuencia.
	 */
	private static int[] subsecuencia(int[] x,int a,int b) {
		return Arrays.copyOfRange(x,a,b);
	}

	/**
	 * Encuentra el índice del elemento más pequeño de la
	 * secuencia y lo regresa.
	 * @param secuencia, el secuencia en el que buscamos el indice
	 * del menor elemento del areglo.
	 * @param n, el tamaño del secuencia.
	 * @return el indice del elemento más pequeño en una secuencia.
	 */
	public static void busquedaBinariaCiclica(int[] secuencia,int x){
		
		int longitud = secuencia.length;
		int pivote = encuentraPivote(secuencia,0, longitud-1);
		System.out.println("El espacio de busqueda es: " + imprime(secuencia));

		if(pivote == 0){
			BusquedaBinaria(x,secuencia,0);
			return;
		}

		if (x == secuencia[pivote]) {
			System.out.println("El indice del elemento buscado es: "+pivote);
			return;
		}

		if(secuencia[0] <= x && x <= secuencia[pivote-1]){
			int[] espacioBusqueda = subsecuencia(secuencia,0,pivote);
			System.out.println("El nuevo espacio de busqueda es: " + imprime(espacioBusqueda));
			BusquedaBinaria(x,espacioBusqueda,0);
			return;
		}else{
			int[] espacioBusqueda = subsecuencia(secuencia,pivote+1,longitud-1);
			System.out.println("El nuevo espacio de busqueda es: " + imprime(espacioBusqueda));
			BusquedaBinaria(x,espacioBusqueda,pivote+1);
			return;
		}
	}

	/**
	 * Encuentra el indice del menor elemento.
	 * @param secuencia, la secuencia en la que se busca el índice.
	 * @param indiceIzq, indice del inicio del espacio de búsqueda en la secuencia.
	 * @param indiceDer, indice del final del espacio de búsqueda en la secuencia.
	 * @return el indice del menor elemento en la secuencia.
	 */
	private static int encuentraPivote(int[] secuencia, int indiceIzq, int indiceDer){

		if(indiceIzq ==  indiceDer)
			return indiceIzq;
		
		else{
			
			int mitad = Math.round((indiceIzq + indiceDer)/2);

			if (secuencia[mitad] < secuencia[indiceDer]) {

				return encuentraPivote(secuencia,indiceIzq,mitad);

			} else{

				return encuentraPivote(secuencia, mitad+1, indiceDer);
			}

		}

	}

	/**
	 * Busca un elemento dado en un secuencia.
	 * @param z, el entero a buscar.
	 * @param secuencia, el secuencia en donde buscaremos a z
	 */
	public static void BusquedaBinaria(int z, int[] secuencia,int ajuste){
		int mitad=0;
		int longitud = secuencia.length;
		int max = longitud;
		int min = 0;
		int iteracion = 0;

		while((max-min) > 1){
			iteracion++;
			mitad = Math.round((max+min)/2);

			if (z < secuencia[mitad]) {
				max = mitad;
			} else{
				min = mitad;
			}
			
			int[] str = subsecuencia(secuencia,min,max);
			String l = String.format("El espacio de búsqueda en la iteración %d es: %s",iteracion,imprime(str));
			System.out.println(l);
		}

		if(secuencia[mitad] == z) {
			String n = String.format("El indice de %d en el secuencia es: %d",z,mitad+ajuste);
			System.out.println(n);
			return;
		}
		if (secuencia[min] == z) {
			String m = String.format("El indice de %d en el secuencia es: %d",z,min+ajuste);
			System.out.println(m);
			return;
		}
		else{
			System.out.println("La busqueda no tuvo éxito");
			return;
		}
	}

	/**
	 * Convierte una arreglo de cadenas en enteros.
	 * @param s, arreglo de cadenas.
	 * @return un arreglo con los elementos de s expresados en enteros.
	 */
	private static int[] toInt(String[] s){
		int[] i = new int[s.length];
		int aux = 0;
		try{
			for(String str:s){
				i[aux] = Integer.valueOf(str);
				aux++;
			}
			return i;
		}catch(Exception e){
			System.out.println("No se ha podido leer correctamente la secuencia.");
			System.exit(-1);
		}

		return null;
	}

	/**
	 * Punto de entrada del programa.
	 */
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce una secuencia ciclica de números enteros: ");
		String s = sc.nextLine();
		System.out.print("Introduce el número a buscar en la secuencia: ");
		int i = sc.nextInt();

		String[] arregloCadena = s.split(","); 
		int[] secuencia = toInt(arregloCadena);

		busquedaBinariaCiclica(secuencia,i);
	}

}