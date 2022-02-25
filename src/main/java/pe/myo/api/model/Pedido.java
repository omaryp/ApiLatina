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
public class Pedido extends BasicEntity{

    private int usuarios_id;
    private String nombre_completo;
    private Date fecha_pedido;
    private double monto_total;
    private double pago_adelantado;
    private double saldo;
    private int pedidos_total_id;
    private String voucher_codigo;
    private String mofo_pago;
    private String banco;
    private Date fecha_envio_aprox;
    private Date fecha_envio_real;
    private Date fecha_llegada;
    private Date fecha_recojo;
    
}
