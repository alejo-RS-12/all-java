/*Dado un arreglo de tamaño de arreglo MAX=20 de secuencias. En
el caso de eliminar secuencias se debe hacer corrimiento.
Hacer un programa que devuelva la posición de inicio y fin de la
secuencia de números distintos de ceros cuya suma del contenido
sea mayor.*/
public class ejercicio16_5 {
	final static int max = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arrentero = {0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,0,0,0,9,9};
		int ini = obtener_inicio(arrentero);
		int fin = obtener_fin(arrentero,ini);
		imprimir_arreglo_secuencia(arrentero);
		if(ini != -1 && fin != -1){
			System.out.println("numero de inicio: " + ini);
			System.out.println("numero de fin: " +fin);
			int suma = sumar_numeros(arrentero, ini, fin);
			System.out.println("la suma mayor es : " + suma);
		}
		else{
			System.out.println("no se encontro ninguna secuencia de numeros distintos de de 0:");
		}
		
	}
	public static int sumar_numeros(int[]arr, int ini, int fin){
		int suma = 0;
		for (int i = ini; i < fin; i++){
			suma += arr[i];
		}
		return suma;
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
	public static void imprimir_arreglo_secuencia(int[]arr){
		for (int i = 0; i<max; i++){
			System.out.println("nombre_arreglo: [" + i +"] =" + arr[i]);
		}
	}
}

