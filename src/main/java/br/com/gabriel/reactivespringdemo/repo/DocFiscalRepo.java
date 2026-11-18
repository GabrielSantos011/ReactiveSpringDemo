package br.com.gabriel.reactivespringdemo.repo;

import java.util.Optional;
import br.com.gabriel.reactivespringdemo.model.DocFiscal;
import org.springframework.data.repository.ListCrudRepository;

public interface DocFiscalRepo extends ListCrudRepository<DocFiscal, Integer>{
    public Optional<DocFiscal> findByProtocolo(String protocolo);
}