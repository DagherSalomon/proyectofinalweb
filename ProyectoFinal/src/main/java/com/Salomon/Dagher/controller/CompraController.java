package com.Salomon.Dagher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Salomon.Dagher.Compra;
import com.Salomon.Dagher.service.CompraService;

@RestController
@RequestMapping("/compradescuento")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @PostMapping
    public ResponseEntity<Compra> Descuento(@RequestBody Compra compra) {
        Compra resultado = compraService.Descuento(compra);
        return ResponseEntity.ok(resultado);
    }
}
