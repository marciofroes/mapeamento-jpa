package br.com.lopes.artigo.jpa;

import br.com.lopes.artigo.jpa.dao.ClienteJpaDAO;
import br.com.lopes.artigo.jpa.model.Cliente;

public class CadastroCliente {

	public static void main(String... string) {
		ClienteJpaDAO clienteJpaDAO = null;
		Cliente cliente =  clienteJpaDAO.getById(1);
		System.out.println(cliente.getNome());


		Cliente cliente2 = new Cliente();
		cliente.setId(2);
		cliente.setNome("Armazém Feliz");

		clienteJpaDAO.merge(cliente2);
		Cliente clienteSalvo =  clienteJpaDAO.getById(2);
		System.out.println(cliente2.getNome());


	}
}
