package br.com.herick.cursoJsf.projectJSF.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "pessoaBean")
@ViewScoped
public class PessoaBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String sobrenome;
	private String nomeCompleto;

	public String exibirNome() {
		setNomeCompleto(this.nome + " " + this.sobrenome);
		return "";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

}
