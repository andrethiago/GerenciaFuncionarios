package br.mp.mpf.funcionario;

public class CalculadoraDeSalario {

	public double calculaSalario(Funcionario funcionario) {
		if (funcionario.getCargo().equals(Cargo.DESENVOLVEDOR)) {
			return vinteOuDezPorCentoDeDesconto(funcionario);
		} else if (funcionario.getCargo().equals(Cargo.DBA) || funcionario.getCargo().equals(Cargo.TESTADOR)) {
			return quinzeOuVinteCincoPorCentoDeDesconto(funcionario);
		}

		return 0.0;
	}

	private double quinzeOuVinteCincoPorCentoDeDesconto(Funcionario funcionario) {
		if (funcionario.getSalario() > 2500.0) {
			return funcionario.getSalario() * 0.75;
		}
		return funcionario.getSalario() * 0.85;
	}

	private double vinteOuDezPorCentoDeDesconto(Funcionario funcionario) {
		if (funcionario.getSalario() > 3000.0) {
			return funcionario.getSalario() * 0.8;
		}
		return funcionario.getSalario() * 0.9;
	}

}
