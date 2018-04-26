package conta;

import java.util.Date;
import java.util.Random;

public class Conta {
	private String id;
	private Date criacao;
	private double saldo;
	private Titular titular;
	private Operacao[] operacoes;
	private int indiceOp;
	
	public Conta() {
		this.criacao = new Date();
		this.saldo = 0.0;
		Random r = new Random();
		long idLong = r.nextLong();
		if(idLong < 0) {
			idLong = (-1) * idLong;
		}
		this.id = Long.toString(idLong);
		this.operacoes = new Operacao[100];
		this.indiceOp = 0;
	}
	
	
	public void deposito(double quantidade) {
		if(quantidade <= 0) {
			System.out.println("Valor indevido.");
			return;
		}
		this.saldo += quantidade;
		this.adicionaOperacao("DEPOSITO");
		
	}
	
	
	public Operacao ultimaOperacao() {
		return this.operacoes[indiceOp-1];
	}
	
	public void saque(double quantidade) {
		if(quantidade > saldo) {
			System.out.println("Saldo insuficiente.");
			return;
		}
		if(quantidade <= 0) {
			System.out.println("Valor indevido.");
			return;
		}
		this.saldo -= quantidade;
		this.adicionaOperacao("SAQUE");
	}
	
	public void adicionaOperacao(String tipo) {
		Operacao o = new Operacao(tipo);
		this.operacoes[indiceOp] = o;
		indiceOp++;
	}

	
	public void transferencia(Conta conta, double quantidade) {
		
	}
	
	public String getId() {
		return id;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setTitular(Titular titular) {
		this.titular = titular;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
