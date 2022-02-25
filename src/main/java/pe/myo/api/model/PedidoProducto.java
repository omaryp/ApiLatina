package pe.myo.api.model;

import java.util.Date;

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
public class PedidoProducto extends BasicEntity{

    private int pedidos_id;
    private int productos_id;
    private int cantidad;
    private double precio;
    private double total;
    private double precio_vendedor;
    
}
