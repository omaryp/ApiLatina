package pe.myo.api.model;

import java.sql.Date;

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
public class Parametro extends BasicEntity {
    
    private int digide;
    private String codtab;
    private String descripcion;
    private int valent;
    private int valdec;
    private String cadena;
    private Date fecha;

}
