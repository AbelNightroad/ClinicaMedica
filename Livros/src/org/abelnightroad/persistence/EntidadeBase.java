package org.abelnightroad.persistence;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class EntidadeBase<T extends Serializable> {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private T id;
	
	public T getId(){
		return this.id;
	}
	
	public void setId(T id) {
		this.id = id;
	}
}
