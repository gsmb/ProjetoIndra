package negocio;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import beans.Pessoa;
import persistencia.UsuarioDAO;


public class UsuarioCtrl implements Serializable{
	private static final long serialVersionUID = 1L;

	private Pessoa usuario = new Pessoa();

	public void setCliente(Pessoa usuario) {
		this.usuario = usuario;
	}

	public Pessoa getUsuario() {
		return usuario;
	}

	public void setUsuario(Pessoa usuario) {
		this.usuario = usuario;
	}

	public List<Pessoa> getListagem() {
		return UsuarioDAO.listagem();
	}

	public String actionGravar() {
		if (usuario.getId() == 0) {
			UsuarioDAO.inserir(usuario);
			return actionInserir();
		} else {
			UsuarioDAO.alterar(usuario);
			this.usuario = new Pessoa();
			return "form";
		}

	}

	public String actionInserir() {
		usuario = new Pessoa();
		return "form";
	}

	public String actionExcluir(Pessoa u) {
		UsuarioDAO.excluir(u);
		return "lista_usuario";
	}

	public String actionAlterar(Pessoa u) {
		usuario = u;
		return "form";
	}

}


