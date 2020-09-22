package principal;

import modelo.Data;
import modelo.Funcionario;
import modelo.Pessoa;

public class DemoPessoa {

	public static void main(String[] args) {

		Data dt = new Data(2,5,1945);
		Pessoa p1 = new Pessoa("Bianca Souza","01234567890", new Data(3,6,1982));
		
		Funcionario f1 = new Funcionario("Marcos Lins","01234567891",dt, new Data(15,3,2000),3000);
		Funcionario f2 = new Funcionario(p1, new Data(15,10,2010),10000);
		
		
		System.out.println(p1+"\n");
		System.out.println(f1+"\n");
		System.out.println(f2+"\n");
	}

}
