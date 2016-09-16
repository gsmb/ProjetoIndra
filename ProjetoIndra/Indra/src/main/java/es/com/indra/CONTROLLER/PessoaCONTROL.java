package es.com.indra.CONTROLLER;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import es.com.indra.BO.PessoaBO;
import es.com.indra.DAO.PessoaDAO;
import es.com.indra.ENTITY.Pessoa;

@ManagedBean(name = "pessoaBean")
@ViewScoped
public class PessoaCONTROL {
	Pessoa pessoa = new Pessoa();

	public PessoaCONTROL() {
		pessoa = new Pessoa();
	}

	public void inserirPessoa(ActionEvent actionevent) {
		new PessoaBO().inserirPessoa(pessoa);
		System.out.println("teste");
		pessoa = new Pessoa();
		//return "form";
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
