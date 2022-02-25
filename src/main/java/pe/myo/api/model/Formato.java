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
public class Formato extends BasicEntity {
    
    private String celda_excel;
    private int tipo_celda;
    private int productos_id;
    private int modelos_id;
    private int tipo_catalogo;
    
}
