package br.com.fiap.rm551978.globalsolution.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.rm551978.globalsolution.Repositório.EventoExtremoRepository;
import br.com.fiap.rm551978.globalsolution.dto.EventoExtremoRequestCreate;
import br.com.fiap.rm551978.globalsolution.dto.EventoExtremoRequestUpdate;
import br.com.fiap.rm551978.globalsolution.model.EventoExtremo;

import java.util.Optional;

@Service
public class EventoExtremoService {

    @Autowired
    private EventoExtremoRepository repository;

    public Optional<EventoExtremo> update(Long id, EventoExtremoRequestUpdate dto) {
        return (Optional<EventoExtremo>) repository.findById(id)
            .map(e -> {
                EventoExtremo evento = (EventoExtremo) e;
                return repository.save((EventoExtremo) dto.toModel(evento));
            });
    }

    public boolean delete(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    public EventoExtremo create(EventoExtremoRequestCreate req) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    public Optional<EventoExtremo> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    public Optional<EventoExtremo> getById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }
}
