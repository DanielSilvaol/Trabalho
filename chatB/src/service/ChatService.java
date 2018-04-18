package service;


import pacote.PalavraChave;
import pacote.Resposta;

import java.util.List;

public class ChatService {

	private PalavraChaveService palavraChaveService = new PalavraChaveService();

	private RespostaService respostaService = new RespostaService();

	public Resposta buscaResposta(String pergunta) {

		List<PalavraChave> palavraChaves = palavraChaveService.encontraPalavrasChavesPorPergunta(pergunta);

		return respostaService.buscaRespostaApropriada(palavraChaves);
	}
}