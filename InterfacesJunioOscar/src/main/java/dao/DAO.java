package dao;

import java.util.List;

import excepciones.WrongClientCreateException;
import excepciones.WrongDeliveryDayCreationException;
import excepciones.WrongOrderDayCreationException;

public interface DAO<T> {
	
	List<T> getAll();
	
	T get(int cod);
	
	void save(T t) throws WrongOrderDayCreationException, WrongDeliveryDayCreationException, WrongClientCreateException;
	
	void delete(int cod);
	

}
