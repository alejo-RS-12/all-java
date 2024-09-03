package ejemplos_prefinal;

public class ejemplo_prefinal_extra {
   	final static int MAXFILAS = 5;
    final static int MAXCOLUMNAS = 20;
    final static int K = 2;
    final static int P = 2;
    final static char L = 'F';

    public static void main(String[] args) {
        char[][] matriz = {
                {' ', '1', '2', 'G', 'H', ' ', '2', 'A', '3', ' ', '3', 'R', 'B', 'J', ' ', '6', '5', 'K', ' ', ' '},
                {' ', ' ', '2', '1', '4', '5', ' ', 'R', 'P', ' ', 'D', '3', ' ', '7', 'M', 'N', 'W', ' ', ' ', ' '},
                {' ', '4', 'G', '8', ' ', '3', '5', '7', '1', ' ', ' ', '2', 'X', ' ', 'D', '4', '1', ' ', ' ', ' '},
                {' ', ' ', ' ', '5', 'T', 'T', 'M', ' ', 'A', 'P', '1', '1', ' ', '2', '1', '3', ' ', '1', '3', ' '},
                {' ', '6', '6', '4', ' ', '5', '4', ' ', ' ', 'A', '2', '1', '2', ' ', 'G', '4', '2', '1', '8', ' '}
        };
        System.out.println(determinar_senales(matriz));
    }
    public static int determinar_senales(char[][]matriz){
    	int cantidadDeSeniales = 0;
    	int filasSeguidasQueCumplen = 0;//cantidad de filas que cumplen con K, pero consecutivamente
    	//por cada fila
    	for(int i=0; i<MAXFILAS; i++){
    		if(filasSeguidasQueCumplen == P){
    			cantidadDeSeniales++;
    		}
    		//obtengo la cantidad para ver si supera K en la fila
    		int cantidad = secuenciasQueSuperanL(matriz[i]);
    		if(cantidad >= K){//esta fila cumple con K?
    			filasSeguidasQueCumplen++;
    		}else{
    			filasSeguidasQueCumplen = 0;
    		}
    	}
    	return cantidadDeSeniales;
    }
    
    /*el retorno es la cantidad de secuencias que superan L*/
    public static int secuenciasQueSuperanL(char arr[]){
    	int i = 0;
    	int valorTotalSecuencia = 0;
    	int cantidadQueSuperan = 0;
    	
    	while(i < arr.length-1){//recorrer todo el arreglo
    		
    		//por cada canal convierto el caracter en numero
    		int numero = convertirNumero(arr[i]);
    		
    		if(numero != 0){//si no es un espacio
    			valorTotalSecuencia += numero;
    			i++;
    		}else{//si es un espacio
    			if(valorTotalSecuencia > 0){//si antes habia una secuencia
    				if(valorTotalSecuencia > convertirNumero(L)){//si la secuencia que estaba su suma supera L
    					System.out.println("1 secuencia es mayor a K");
    					cantidadQueSuperan++;
    				}
    			}
    			valorTotalSecuencia = 0;
    			i++;
    		}
    	}
    	
    	return cantidadQueSuperan;
    }

    public static int convertirNumero(char c){
    	if (c >= 'A' && c <= 'Z') {
            return c - 'A' + 10;
        }
    	if(c == ' '){
    		return 0;
    	}
    	return Character.getNumericValue(c);
    }
}
