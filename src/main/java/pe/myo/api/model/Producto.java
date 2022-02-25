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
public class Producto extends BasicEntity {
    
    private String nombre;
    private int modelos_id;
    private String modelo;
    private String color;
    private String talla;
    private String marca;
    private boolean isRemate;
    
}
