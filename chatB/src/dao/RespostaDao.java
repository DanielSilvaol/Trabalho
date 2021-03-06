package dao;



import pacote.Resposta;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniel on 15/04/18.
 */
public class RespostaDao {

    /**
     * A resposta que tiver mais de uma palavra chave associa e que est� na lista de palavrasChavesIds, ser� retorna mais de uma vez
     */
    public List<Resposta> buscaRespostaPorPalavrasChaves(List<Integer> palavrasChavesIds) {
        String sql = "select r.id, r.valor from resposta r join resposta_palavra rp on (r.id = rp.resposta_id) where rp.palavra_chave_id in (?)";

        List<Resposta> respostas = new ArrayList<>();

        return respostas;
    }
}