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
public class PedidoTotal extends BasicEntity{

    private String nombre_completo;
    private Date fecha_pedido;
    private double monto_total;
    private double flete;
    private String voucher_codigo;
    private String modo_pago;
    private String banco;
    private Date fecha_llegada;
        
}
