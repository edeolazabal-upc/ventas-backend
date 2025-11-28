package com.ventas.backend.repository;

import com.ventas.backend.entity.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface VentaRepository extends JpaRepository<Venta, Long> {
    @Query("SELECT v.producto, SUM(v.importe) FROM Venta v GROUP BY v.producto")
    List<Object[]> obtenerTotalesPorProducto();
}
