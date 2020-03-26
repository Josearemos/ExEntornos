import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Funcion1Test{
		
	@Test
	@DisplayName("Prueba de Caja Negra con Límite superior")
	void Funcion1Test() {
		assertFalse(Funcion1.Funcion1(Integer.MAX_VALUE));
	}
}