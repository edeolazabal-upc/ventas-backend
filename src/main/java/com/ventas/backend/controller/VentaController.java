package com.ventas.backend.controller;

import com.ventas.backend.entity.Venta;
import com.ventas.backend.service.VentaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/ventas")
@CrossOrigin(origins = "*")
public class VentaController {
    final VentaService ventaService;
    public VentaController(VentaService svc, VentaService ventaService){
        this.ventaService = ventaService;
        }
    @PostMapping
    public ResponseEntity<Venta> crear(@RequestBody Venta venta){
        return ResponseEntity.ok(ventaService.save(venta));
    }
    @GetMapping
    public ResponseEntity<List<Venta>> listar(){
        return ResponseEntity.ok(ventaService.findAll());
    }
    @GetMapping("/totales")
    public ResponseEntity<List<Map<String,Object>>> totales(){
        return ResponseEntity.ok(ventaService.totalsByProduct());
    }
}
