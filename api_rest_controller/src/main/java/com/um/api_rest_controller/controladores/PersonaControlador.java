package com.um.api_rest_controller.controladores;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/personas")
public class PersonaControlador {

    @GetMapping("dummy")
    public ResponseEntity<String> getDummy(){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body("Lo que me solicitaste soy dummy\n");
        }
        catch (Exception e){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }

    @GetMapping("subRuta")
    public ResponseEntity<String> getChau(){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body("Me despido desde la Api Dummy\n");
        }
        catch (Exception e){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getById(@PathVariable Long id){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body("Te devuelvo un registro de la base de datos por el ID indicado\n");
        }
        catch (Exception e){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }

    @GetMapping("/all")
    public ResponseEntity<String> getAll(){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body("Te devuelvo una lista de registros\n");
        }
        catch (Exception e){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }

    @PostMapping()
    public ResponseEntity<String> create(@PathVariable String persona){
        try {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body("Te devuelvo la persona creada:\n" + persona);
        }
        catch (Exception e){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }
}
