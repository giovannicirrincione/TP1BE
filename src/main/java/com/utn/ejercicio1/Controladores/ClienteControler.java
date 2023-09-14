package com.utn.ejercicio1.Controladores;

import com.utn.ejercicio1.repositorios.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*") // Después explicamos los dominios cruzados

@RequestMapping(path = "api/cliente")

public class ClienteControler {
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("Todos")
    public ResponseEntity<?> getAll(){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(clienteRepository.findAll());
        }
        catch (Exception e){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error. Por favor intente luego\"}");
        }

    }


//------------------- otra ruta

    // Atrapo el Id que viene el la Request, es como una variable
    @GetMapping("/{id}")


    public ResponseEntity<?> getOne(@PathVariable Long id){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(clienteRepository.findById(id));
        }
        catch (Exception e){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error. Por favor intente luego\"}");
        }

    }



}
