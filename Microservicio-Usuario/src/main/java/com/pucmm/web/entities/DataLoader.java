package com.pucmm.web.entities;

import com.pucmm.web.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    private UsuarioRepository usuarioRepository;

    @Autowired
    public DataLoader(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void run(ApplicationArguments args) {
        //EMPLEADOS ADMINS
        usuarioRepository.save(new Usuario(1, "emp", "juanmartinez@gmail.com", "emp", true, "fotografo"));
        usuarioRepository.save(new Usuario(2, "emp2", "juanmartinez2@gmail.com", "emp2", true, "camarografo"));

        //EMPLEADO NO ADMIN
        usuarioRepository.save(new Usuario(3, "emp3", "juanmartinez3@gmail.com", "emp3", true, "fotografo"));

        //USUARIOS CLIENTES
        usuarioRepository.save(new Usuario(4, "usuario", "lucypineda@gmail.com", "usuario", false, "cliente"));
        usuarioRepository.save(new Usuario(5, "usuario2", "lucypineda2@gmail.com", "usuario2", false, "cliente"));

    }
}
