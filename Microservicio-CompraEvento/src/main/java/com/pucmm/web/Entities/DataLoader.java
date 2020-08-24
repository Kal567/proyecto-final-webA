package com.pucmm.web.Entities;

import com.pucmm.web.Repositories.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    private EventoRepository eventoRepository;

    @Autowired
    public DataLoader(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    public void run(ApplicationArguments args) {

        // - - - EVENTOS - - - //
        eventoRepository.save(new Evento(1, "Pre-Boda", 1000.00));
        eventoRepository.save(new Evento(2, "Boda", 5000.00));
        eventoRepository.save(new Evento(3, "Cumpleaños", 3000.00));
        eventoRepository.save(new Evento(4, "Video del Evento", 4000.00));

    }
}
