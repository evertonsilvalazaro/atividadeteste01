package atividadeTeste01;

public class Equacao {

	double A, B, C, delta;

	public  String calculo(double a, double b, double c) {

		delta = Math.pow(b, 2) - 4 * a * c;

		if ((a == 0 && b == 0) && (c != 0)) {
			return "Coeficientes informados incorretamente";

		} else if ((a == 0 && b == 0) && (c == 0)) {
			return "Igualdade confirmada: 0 = 0";
		}

		if (a == 0 && b != 0) {
			return "Esta � uma equa��o do primeiro grau \n" + "A ra�z da equa��o de primeiro grau � r = " + (-c / b);
		}

		if (delta < 0) {
			return "Esta equa��o n�o possui ra�zes reais (delta < 0): " + " delta = " + delta;
		} else if (delta > 0) {
			return "Esta equa��o possui duas raizes reais diferentes" + " delta = " + delta + "\n" + "x'= "
					+ ((-b + Math.sqrt(delta)) / (2 * a)); 
		}
		return null;
	}
}