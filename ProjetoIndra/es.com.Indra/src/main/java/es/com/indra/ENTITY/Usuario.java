package es.com.indra.ENTITY;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import org.springframework.util.DigestUtils;
import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "usu_id")
	private int id;
	@Column(name = "usu_nome", length = 60, nullable = true)
	private String nome;
	@Column(name = "usu_email", length = 60, nullable = true)
	private String email;
	@Column(name = "usu_senha", length = 32, nullable = true)
	private String senha;
	@Column(name = "authority", nullable = true)
	private String tipo;

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

	public String getSenha() {

		return senha;
	}

	public void setSenha(String senha) throws NoSuchAlgorithmException,
			UnsupportedEncodingException {
		this.senha  = DigestUtils.md5DigestAsHex(senha.getBytes());
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
//		if (tipo.equals("Administrador"))
//			tipo = "ROLE_ADMIN";
//		else if (tipo.equals("Diretor"))
//			tipo = "ROLE_DIRETOR";
//		else
//			tipo = "ROLE_USER";
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email
				+ ", senha=" + senha + ", tipo=" + tipo + "]";
	}

	
}
