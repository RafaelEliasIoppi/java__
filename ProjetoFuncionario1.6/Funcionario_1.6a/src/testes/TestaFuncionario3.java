package testes;
import telas.TelaFuncionario;
import dominio.Endereco;

import dominio.FuncionarioFixo;
import dominio.FuncionarioHorista;
import dominio.FuncionarioComissionado;

public class TestaFuncionario3 {

	public static void main(String[] args) {
		

		TelaFuncionario tela = new TelaFuncionario();

		Endereco e1 = new Endereco("Rua Sem Fim", 44, "apto 100", "Centro");
		Endereco e2 = new Endereco("Rua das Flores", 77, "Apto 00", "Vila Ipiranga");
		FuncionarioFixo f1 = new FuncionarioFixo("Rafael Elias", "M","972.220.565-90", e1, 8000);
		FuncionarioHorista f3 = new FuncionarioHorista ("Ana Oara da Silva", "F","999.222.222-22", e2, 5, 9000);
		FuncionarioComissionado f = new FuncionarioComissionado ("João de Alencar", "M","333.330.333-90", e1, 5, 3000, 10);
				
		tela.mostrarDados(f1);
		tela.mostrarDados(f3);
		tela.mostrarDados(f);
		
		
		}


}