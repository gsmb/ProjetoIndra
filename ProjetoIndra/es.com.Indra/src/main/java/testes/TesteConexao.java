package testes;

import java.sql.Connection;

import es.com.indra.DAO.ConnectionFactory;

public class TesteConexao {

	public static void main(String[] args) {
	Connection conexao = ConnectionFactory.getConnection();

	if(conexao == null)
	{
		System.out.print("Erro ao conectar no BD");
	}else
	{
		System.out.print("Conectado com sucesso");
	}

}
}
