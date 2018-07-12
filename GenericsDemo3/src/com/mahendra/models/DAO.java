package com.mahendra.models;

public interface DAO<T> {
	T findByName(String name);
	T[] getAll();
	void add(T t);
}
