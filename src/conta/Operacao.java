package conta;

import java.util.Date;

public class Operacao {
	private Date data;
	private String tipo;
	
	public Operacao(String tipo) {
		this.data = new Date();
		this.tipo = tipo;
	}
	
	public Date getData() {
		return data;
	}
	
	public String getTipo() {
		return tipo;
	}
}
