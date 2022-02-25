package pe.myo.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class Precio extends BasicEntity {

    private int tipo;
    private String descripcion;
    private double monto;
    private int modelos_id;
    private String modelo;
    
}
