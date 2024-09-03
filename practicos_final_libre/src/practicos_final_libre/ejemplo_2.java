package practicos_final_libre;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejemplo_2 {
public static final int MAXFILA = 4;
public static final int MAXCOLUMNA = 20;
	public static void main(String[] args) {
		char [][] matchar;
		matchar = new char[MAXFILA][MAXCOLUMNA];
		cargar_matriz_aleatorio_secuencias_char(matchar);
		imprimir_matriz_char(matchar);
	}
	public static void cargar_matriz_aleatorio_secuencias_char(char [][] mat){
		for (int fila = 0; fila < MAXFILA; fila++){
			cargar_arreglo_aleatorio_char(mat[fila]);
		}
		System.out.println("");
	}
	public static void imprimir_matriz_char(char [][] mat){
		for (int fila = 0; fila < MAXFILA; fila++){
		imprimir_arreglo_char(mat[fila]);
		System.out.println("");
		}
	}
}