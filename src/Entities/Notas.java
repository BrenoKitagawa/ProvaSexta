package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Notas {
	private String social;
	private String cnpj;
	private String email;
	private String num_nota;
	private Date data;
	private String descricao;
	protected float valor;
	private static List<Notas> notas = new ArrayList();
	private String regime;
	
	public Notas() {
		// TODO Auto-generated constructor stub
	}

	public Notas(String social, String cnpj, String email, String num_nota, Date data,
			String descricao,float valor,String regime) {
		super();
		this.social = social;
		this.cnpj = cnpj;
		this.email = email;
		this.num_nota = num_nota;
		this.data = data;
		this.descricao = descricao;
		this.valor = valor;
		this.regime = regime;
		
	}
	


	public String getRegime() {
		return regime;
	}

	public void setRegime(String regime) {
		this.regime = regime;
	}

	public String getSocial() {
		return social;
	}


	public void setSocial(String social) {
		this.social = social;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNum_nota() {
		return num_nota;
	}


	public void setNum_nota(String num_nota) {
		this.num_nota = num_nota;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public static List<Notas> getNotas() {
		return notas;
	}


	public void setNotas(List<Notas> notas) {
		this.notas = notas;
	}
	
	
	
	public void addNotas(Notas n) {
		
		notas.add(n);
		
	}
	
	


	public float getValor() {
		return valor;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}


	
	public void calcularImposto() {
		for(int i = 0; i < notas.size() ; i++) {
			if(notas.get(i).getRegime().equalsIgnoreCase("Simples nacional")){
				System.out.println( "Numero da nota: " + notas.get(i).getNum_nota()+ " devera pagar: "+ notas.get(i).getValor() * 6.5 / 100);	
			}else {
				System.out.println( "Numero da nota: " + notas.get(i).getNum_nota()+ " devera pagar: "+ notas.get(i).getValor() * 12 / 100);	
			}
			
		}
	}
	


	
	
	@Override
	public String toString() {
		return "Notas [social=" + social + ", cnpj=" + cnpj + ", email=" + email + ", num_nota=" + num_nota + ", data="
				+ data + ", descricao=" + descricao + ", valor=" + valor + ", regime=" + regime + ", getRegime()="
				+ getRegime() + ", getSocial()=" + getSocial() + ", getCnpj()=" + getCnpj() + ", getEmail()="
				+ getEmail() + ", getNum_nota()=" + getNum_nota() + ", getData()=" + getData() + ", getDescricao()="
				+ getDescricao() + ", getValor()=" + getValor() ;
	}
	

	
}
