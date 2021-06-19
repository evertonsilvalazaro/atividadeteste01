package teste;

import atividadeTeste01.Equacao;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import atividadeTeste01.Equacao;

public class EquacaoTeste {
	Equacao objeto;

	@Before
	public void setUp() throws Exception {
		objeto = new Equacao();
	}

	/*
	 * @Test public void testCalculo() {
	 * 
	 * }
	 */

	@Test
	public void testResolucao() {
		String valor;
		valor = objeto.calculo(0, 0, 8);
		assertEquals("Coeficientes informados incorretamente", valor);

		valor = objeto.calculo(0, 0, 0);
		assertEquals("Igualdade confirmada: 0 = 0", valor);

		valor = objeto.calculo(0, 2, -8);
		assertEquals("Esta é uma equação do primeiro grau \n" + "A raíz da equação de primeiro grau é r = " + 4.0,
				valor);

		valor = objeto.calculo(10, -4, 12);
		assertEquals("Esta equação não possui raízes reais (delta < 0): " + " delta = " + -464.0, valor);

		valor = objeto.calculo(4, -4, 1);
		assertEquals(
				"Esta equação possui duas raizes reais iguais" + " delta = " + 0.0 + "\n x'" + 0.5 + "\n x''" + 0.5,
				valor);
		valor = objeto.calculo(1, 6, 7);
		assertEquals("Esta equação possui duas raizes reais diferentes" + " delta = " + 8.0 + "\n" + "x'= "
				+ -1.5857864376269049 + "\n x''=  " + -4.414213562373095, valor);

	}

}