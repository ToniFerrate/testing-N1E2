package testingN1E2;

public class CalculoDni {
	
	public static char CalculaLletra(int dni) {
		
		char caracters[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int resta = dni%23;
        return caracters[resta];

	}
}
