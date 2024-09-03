public class analisis2_2{
	public static void main(String[] args) {
		char opcion=’a’;// sin comillas simples
		int valor=5;
		switch (opcion){
			case ‘a’: opcion=’b’;
			case ‘b’: valor=4;
			break;
			case ‘c’;
			case ‘d’;
			case ‘e’;
				opcion=’z’;
				valor=99;
			default:opcion=’a’;
		}
	}//el uso de comillas simples no sirbe para los valores de los case
}// el orden de los case estan mal y hacen mal el funcionamiento del codigo 