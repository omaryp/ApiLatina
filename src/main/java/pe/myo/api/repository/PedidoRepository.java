package pe.myo.api.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import pe.myo.api.model.Pedido;

@Mapper
@Repository
public interface PedidoRepository extends IBasicMapper<Pedido> {
    
}
