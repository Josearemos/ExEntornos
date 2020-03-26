public class Funcion2 {
	public boolean Funcion1(int no) {
		return no % 23 == 0;
	}

	public Boolean Funcion2(int numeroPrueba) {

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
}
}
