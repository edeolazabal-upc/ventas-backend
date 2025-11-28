package com.ventas.backend.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "venta")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String producto;

    @Column(nullable = false)
    private Double importe;

    public Venta() {}
    public Venta(String producto, Double importe){ this.producto = producto; this.importe = importe; }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getProducto() { return producto; }
    public void setProducto(String producto) { this.producto = producto; }
    public Double getImporte() { return importe; }
    public void setImporte(Double importe) { this.importe = importe; }
}
