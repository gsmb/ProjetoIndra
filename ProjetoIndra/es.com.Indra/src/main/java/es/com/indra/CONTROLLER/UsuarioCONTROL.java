package es.com.indra.CONTROLLER;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import es.com.indra.DAO.UsuarioDAO;
import es.com.indra.ENTITY.Usuario;

@ManagedBean (name = "usuarioCtrl")
@SessionScoped
public class UsuarioCONTROL implements Serializable {
	private static final long serialVersionUID = 1L;

	private Usuario usuario = new Usuario();

	public void setCliente(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getListagem() {
		return UsuarioDAO.listagem();
	}

	public String actionGravar() {
		if (usuario.getId() == 0) {
			UsuarioDAO.inserir(usuario);
			return actionInserir();
		} else {
			UsuarioDAO.alterar(usuario);
			this.usuario = new Usuario();
			return "lista_usuario";
		}

	}

	public String actionInserir() {
		usuario = new Usuario();
		return "formusuario";
	}

	public String actionExcluir(Usuario u) {
		UsuarioDAO.excluir(u);
		return "lista_usuario";
	}

	public String actionAlterar(Usuario u) {
		usuario = u;
		return "formusuario";
	}

	public void submit() {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Correct", "Correct");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
}
