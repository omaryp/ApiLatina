package pe.myo.api.repository;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import pe.myo.api.model.BasicEntity;
import pe.myo.api.utils.dto.GeneralPageTable;


public interface IBasicMapper<T extends BasicEntity> {

	T getEntity(int id) throws SQLException,SQLIntegrityConstraintViolationException;
	
	List<T> getAllEntitys() throws SQLException,SQLIntegrityConstraintViolationException;
	
	List<T> pagingEntitys(GeneralPageTable params) throws SQLException,SQLIntegrityConstraintViolationException;
		
	void saveEntity(T entity) throws SQLException,SQLIntegrityConstraintViolationException;
	
	void updateEntity(T entity) throws SQLException,SQLIntegrityConstraintViolationException;
		
	void deleteEntity(int id) throws SQLException,SQLIntegrityConstraintViolationException;
}
