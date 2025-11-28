package com.ventas.backend.service;

import com.ventas.backend.entity.Venta;
import com.ventas.backend.repository.VentaRepository;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class VentaService {
    private final VentaRepository ventaRepository;
    public VentaService(VentaRepository repo, VentaRepository ventaRepository){
        this.ventaRepository = ventaRepository;
        }
    public Venta save(Venta v){
        return ventaRepository.save(v);
    }
    public List<Venta> findAll(){
        return ventaRepository.findAll();
    }
    public List<Map<String,Object>> totalsByProduct(){
        return ventaRepository.obtenerTotalesPorProducto().stream().map(arr -> {
            Map<String,Object> m = new HashMap<>();
            m.put("producto", arr[0]);
            m.put("total", arr[1]);
            return m;
        }).collect(Collectors.toList());
    }
}
