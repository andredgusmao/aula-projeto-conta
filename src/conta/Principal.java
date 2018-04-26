package conta;

import java.util.Random;

public class Principal {
	public static void main(String[] args) {
		Conta c = new Conta();
		System.out.println(c.getId());
		System.out.println(c.getSaldo());
		c.deposito(100);
		System.out.println(c.getSaldo());
		Operacao o = c.ultimaOperacao();
		System.out.println(o.getData());
		System.out.println(o.getTipo());
		c.saque(30.7);
		System.out.println(c.getSaldo());
		o = c.ultimaOperacao();
		System.out.println(o.getData());
		System.out.println(o.getTipo());
		
		
		
//		Conta[] contas = new Conta[20];
//		for(int i = 0; i < 20; i++) {
//			Conta conta = new Conta();
//			contas[i] = conta;
//			
//			System.out.println(conta.getId());
//		}
	}
}
//int, double, boolean
