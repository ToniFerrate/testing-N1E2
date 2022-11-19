package testingN1E2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/*
Crea una classe anomenada CalculoDni que calculi la lletra del DNI en rebre el número com a paràmetre.
Crea una classe jUnit que verifiqui el seu correcte funcionament, parametritzant-la perquè el test rebi 
un espectre de dades ampli i validi si el càlcul és correcte per a 10 números de DNI predefinits.
*/


class CalculoDniTest {
	
	@ParameterizedTest
	@ValueSource(strings = {"46339358Q", "19942670Z", "12578753F", "71743982J", "11294482X", "36659104W",
	"86185645E", "88067461R", "85236463G", "21786622X"})
	final void test(String dni) {
		//fail("Not yet implemented"); // TODO
		
		assertEquals(dni.charAt(dni.length()-1), CalculoDni.CalculaLletra(Integer.parseInt(dni.substring(0,8))));
	}

}
