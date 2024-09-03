public class analisis_2{
public static void main(String[] args) {
final char letra=’a’;// esta variable global esta mal declarada
int numero1, numero2;
letra = ’f’;//no se puede cambiar una variable globla ya declarada
numero1=10+numero2;
System.out.println("El valor de numero1 es:" + numero1);
System.out.println("El valor de numero2 es:" + numero2);
}
}