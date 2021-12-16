package com.example.repository;

import java.util.Collection;
import java.util.List;

public interface CrudOperations <T>{
	
	public boolean add(T object);
	public Collection <T>findAll();
	public T updateStaffId(T object, int staffId);
	public boolean remove(T object);

}
