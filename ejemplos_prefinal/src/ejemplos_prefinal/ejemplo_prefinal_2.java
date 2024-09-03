package ejemplos_prefinal;

public class ejemplo_prefinal_2 {
    final static int Maxfilas = 3;
    final static int Maxcolumnas = 15;
    
    public static void main(String[] args) {
        int[][] matrint ={
            {0,0,150,200,165,0,154,350,240,256,0,900,750,0,0},
            {0,940,105,265,840,215,0,245,765,348,0,741,125,541,0},
            {0,851,543,625,845,914,0,754,184,452,637,917,0,0,0}
        };
        
        int[] A1 = new int[Maxfilas];
        int[] A2 = new int[Maxcolumnas];
        int X = 200; // Valor límite para la segunda estadística
        
        calcularPromedioMensual(matrint, A1);
        verificarPromedioDiario(matrint, A2, X);
        
        imprimirResultados(A1, A2, X);
    }
    
    public static void calcularPromedioMensual(int[][] matrint, int[] A1) {
        for (int i = 0; i < Maxfilas; i++) {
            int sumaVentas = 0;
            int diasVentas = 0;
            
            for (int j = 0; j < Maxcolumnas; j++) {
            	sumaVentas += matrint[i][j];
                diasVentas++;
            }
            
            double promedio = (double) sumaVentas / diasVentas;
            A1[i] = (int) promedio;
        }
    }
    
    public static void verificarPromedioDiario(int[][] matrint, int[] A2, int X) {
        for (int j = 0; j < Maxcolumnas; j++) {
            int sumaVentas = 0;
            int diasVentas = 0;
            
            for (int i = 0; i < Maxfilas; i++) {
            	sumaVentas += matrint[i][j];
            	diasVentas++;
            }
            
            double promedio = (double) sumaVentas / diasVentas;
            if (promedio > X) {
                A2[j] = 1;
            }else{
            	A2[j] = 0;
            }
        }
    }
    
    public static void imprimirResultados(int[] A1, int[] A2, int X) {
        System.out.println("Promedio mensual de las ventas de mayor importe registradas en cada dia de un mes:");
        for (int i = 0; i < Maxfilas; i++) {
            System.out.println("Mes " + (i + 1) + ": " + A1[i]);
        }
        
        System.out.println("\nPromedio diario de ventas superiores a " + X + " durante los meses:");
        for (int i = 0; i < Maxcolumnas; i++) {
            System.out.println("Mes " + (i + 1) + ": " + (A2[i] == 1 ? "Sí" : "No"));
        }
    }
}