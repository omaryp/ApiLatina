package pe.myo.api.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import pe.myo.api.model.PedidoTotal;

@Mapper
@Repository
public interface PedidoTotalRepository extends IBasicMapper<PedidoTotal> {
    
}
