package com.pucmm.web.Services;

import com.pucmm.web.Entities.Pedido;
import com.pucmm.web.Repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PedidoServices {

    @Autowired
    PedidoRepository pedidoRepository;

    //CREATE AND UPDATE
    public void createOrUpdatePedido(Pedido pedido){
        pedidoRepository.save(pedido);
    }

    //GET ALL EVENTOS
    public List<Pedido> allPedidos(){
        List<Pedido> pedidoList = new ArrayList<Pedido>();
        pedidoRepository.findAll().forEach(pedido -> pedidoList.add(pedido));
        return pedidoList;
    }

    //GET ONE SPECIFIC EVENTO BY ID
    public Pedido getPedido(int idPedido){
        for (Pedido pedido : allPedidos()){
            if(pedido.getIdPedido() == idPedido){
                return pedido;
            }
        }
        return null;
    }

    //DELETE EVENTO
    public boolean deletePedido(int idEvento){
        for (Pedido pedido : allPedidos()){
            if(pedido.getIdPedido() == idEvento){
                pedidoRepository.delete(pedido);
                return true;
            }
        }
        return false;
    }
}
