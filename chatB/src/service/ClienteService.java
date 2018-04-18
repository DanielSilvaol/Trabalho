package service;

import dao.ClienteDao;
import pacote.Cliente;

public class ClienteService {

	private ClienteDao dao;

	public Cliente carregar(int id){
		return dao.carregarCliente(id);
	}

	public int criarCliente(Cliente cli) {
		return dao.cadastroCliente(cli);
	}
}
