package pe.myo.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class PedidoTotalProducto extends BasicEntity{

    private int pedidos_total_id;
    private int productos_id;
    private int cantidad;
    private double precio;
    private double precio_lista;
    private double total;
    
}
