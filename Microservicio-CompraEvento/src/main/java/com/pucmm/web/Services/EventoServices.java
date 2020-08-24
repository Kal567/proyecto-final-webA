package com.pucmm.web.Services;

import com.pucmm.web.Entities.Evento;
import com.pucmm.web.Repositories.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoServices {

    @Autowired
    EventoRepository eventoRepository;

    //CREATE AND UPDATE
    public void createOrUpdateEvento(Evento evento){
        eventoRepository.save(evento);
    }

}
