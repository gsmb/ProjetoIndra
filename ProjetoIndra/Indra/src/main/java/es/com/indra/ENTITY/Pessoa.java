package es.com.indra.ENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="pessoa")
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "usu_id")
	private int id;
	@Column(name = "usu_nome", length = 50, nullable = true)
	private String nome;
	@Column(name = "usu_sobrenome", length = 60, nullable = true)
	private String sobrenome;
	@Column(name = "usu_email", length = 60, nullable = true)
	private String email;
	@Column(name = "usu_usuario", length = 32, nullable = true)
	private String usuario;
	@Column(name = "usu_senha", length = 32, nullable = true)
	private String senha;
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", email=" + email + ", usuario="
				+ usuario + ", senha=" + senha + "]";
	}
}
