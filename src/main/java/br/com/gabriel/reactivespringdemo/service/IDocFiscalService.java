package br.com.gabriel.reactivespringdemo.service;

import br.com.gabriel.reactivespringdemo.model.DocFiscal;

public interface IDocFiscalService {
    public void realizarAutorizacaoAPIExterna(Long idCliente, Integer idServico, String protocolo);
    public DocFiscal consultarPorProtocolo(String protocolo);
}