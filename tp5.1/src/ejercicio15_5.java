//import java.util.Random;

/*Dado un arreglo de tamaño de arreglo MAX=20 de secuencias. En
el caso de eliminar secuencias se debe hacer corrimiento.
Hacer un programa que devuelva la posición de inicio y fin de la
primera secuencia de números distinta de ceros.*/
public class ejercicio15_5 {
	final static int max = 20;
	/*final static int Maxvalor = 20;
	final static int Minvalor = 0;*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arrentero = {0,0,0,0,0,0,0,5,4,5,6,3,0,0,0,0,6,5,4,7};
		int ini = obtener_inicio(arrentero);
		int fin = obtener_fin(arrentero, ini);
		System.out.println("arreglo_original");
		//cargar_arreglo_secuencia(arrentero);
		imprimir_arreglo_secuencia(arrentero);
		if(ini != -1 && fin != -1){
			System.out.println("numero de inicio: " + ini);
			System.out.println("numero de fin: " +fin);
		}
		else{
			System.out.println("no se encontro ninguna secuencia de numeros distintos de de 0:");
		}
		
	}
	public static int obtener_fin(int[]arr, int ini){
		for(int i = ini + 1; i<max; i++){
			if (arr[i] == 0){// si el arreglo es = a 0 entonces pasa y retorna de nuevo a al areglo restandole uno
				return i-1;
			}
		}
		return max-1;
		
	}
	public static int obtener_inicio(int [] arr){
		for(int i = 0; i<max; i++){
			if( arr[i] != 0){// si el arreglo es desigual a 0 retorna al arreglo iterando un nuevo espacio
				return i;
			}
		}
		return -1; //no se encontro ninugna secuencia 
	}
	/*public static void cargar_arreglo_secuencia(int [] arr){
		Random r = new Random();
		for (int i = 0; i<max; i++){
			arr[i] =(r.nextInt(Maxvalor-Minvalor-1) + Minvalor);

		}
	}*/
	public static void imprimir_arreglo_secuencia(int[]arr){
		for (int i = 0; i<max; i++){
			System.out.println("nombre_arreglo: [" + i +"] =" + arr[i]);
		}
	}
}
