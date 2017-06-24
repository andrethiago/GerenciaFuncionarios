package br.mp.mpf.funcionario;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraDeSalarioTest {

	@Test
	public void calculaSalarioDesenvolvedorComSalarioAbaixoDoLimite() {
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		Funcionario desenvolvedor = new Funcionario("André", 1500.0, Cargo.DESENVOLVEDOR);

		double salario = calculadora.calculaSalario(desenvolvedor);
		double salarioComDescontoDezPorCento = 1500 * 0.9;

		assertEquals(salarioComDescontoDezPorCento, salario, 0.00001);

	}

	@Test
	public void calculaSalarioDesenvolvedorComSalarioMaiorQueLimite() {
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		Funcionario desenvolvedor = new Funcionario("André", 4000.0, Cargo.DESENVOLVEDOR);

		double salario = calculadora.calculaSalario(desenvolvedor);
		double salarioComDescontoVintePorCento = 4000.0 * 0.8;

		assertEquals(salarioComDescontoVintePorCento, salario, 0.00001);

	}

	@Test
	public void calculaSalarioDBAComSalarioAbaixoDoLimite() {
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		Funcionario dba = new Funcionario("André", 500.0, Cargo.DBA);

		double salario = calculadora.calculaSalario(dba);
		double salarioComDescontoQuinzePorCento = 500.0 * 0.85;

		assertEquals(salarioComDescontoQuinzePorCento, salario, 0.00001);

	}

	@Test
	public void calculaSalarioDBAComSalarioAcimaDoLimite() {
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		Funcionario dba = new Funcionario("André", 4500.0, Cargo.DBA);

		double salario = calculadora.calculaSalario(dba);
		double salarioComDescontoVinteCincoPorCento = 4500.0 * 0.75;

		assertEquals(salarioComDescontoVinteCincoPorCento, salario, 0.00001);

	}

	@Test
	public void calculaSalarioTestadorComSalarioAbaixoDoLimite() {
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		Funcionario testador = new Funcionario("André", 500.0, Cargo.TESTADOR);

		double salario = calculadora.calculaSalario(testador);
		double salarioComDescontoQuinzePorCento = 500.0 * 0.85;

		assertEquals(salarioComDescontoQuinzePorCento, salario, 0.00001);

	}

	@Test
	public void calculaSalarioTestadorComSalarioAcimaDoLimite() {
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		Funcionario testador = new Funcionario("André", 4500.0, Cargo.TESTADOR);

		double salario = calculadora.calculaSalario(testador);
		double salarioComDescontoVinteCincoPorCento = 4500.0 * 0.75;

		assertEquals(salarioComDescontoVinteCincoPorCento, salario, 0.00001);

	}

}
