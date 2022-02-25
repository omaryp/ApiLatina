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
public class Catalogo extends BasicEntity {
    private String descripcion;
    private String nombre;
    private int tipo;
    private String estacion;
    private int anio;
    private String ruta;
}
