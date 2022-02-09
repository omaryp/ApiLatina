package pe.myo.api.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;

import pe.myo.api.model.BasicEntity;
import pe.myo.api.utils.ApiException;

public interface IBasicService<T extends BasicEntity> {
			
	T getEntity(int id) throws ApiException;
	
	List<T> getAllEntitys() throws ApiException;
	
	PageInfo<T> pagingEntitys(Map<String, String> params) throws ApiException;
	
	void saveEntity(T entity) throws ApiException;
	
	void updateEntity(T entity) throws ApiException; 
	
	void deleteEntity(int id) throws ApiException;
	
	Object searchEntity(Map<String, String> params) throws ApiException;

}
