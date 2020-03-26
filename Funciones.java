public class Funciones {
	public boolean Funcion1(int no) {
		return no % 23 == 0;
	}

	public boolean Funcion2(int numeroPrueba) {

		Boolean prueb = null;
		int Y = 700;
		int Y2 = 600;

	if(numeroPrueba <= Y && numeroPrueba >= Y2) {

		prueb = true;
	}else {
		prueb = false;
	}
	return prueb;

	}

	public int Funcion3(int numero) {

		int x = 23;
		int y = 600;
		int y1 = 700;
		int r = (int) Math.floor(Math.random()*(y1+y));
	    int result = 0;

		if (numero%x == 0) {
			result = numero%r;
		}
		return result;
	 }
}




