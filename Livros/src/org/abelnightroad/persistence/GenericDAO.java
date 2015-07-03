package org.abelnightroad.persistence;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class GenericDAO<T, ID extends Serializable> {
	@PersistenceContext(unitName="ClnicaMedica")
	private EntityManager entityManager;
	
	private final Class<T> classe;
	
	@SuppressWarnings("unchecked")
	public GenericDAO() {
		classe = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public T salvar(T entity) {
		getEntityManager().clear();
		getEntityManager().persist(entity);
		return entity;
	}
	
	public T atualizar(T entity) {
		entity = getEntityManager().merge(entity);
		return entity;
	}
	
	public void excluir(T entity) {
		entity = getEntityManager().merge(entity);
		getEntityManager().remove(entity);
	}
	
	public T buscarPorId(ID id) {
		CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<T> cq = cb.createQuery(classe);
		Root<T> r = cq.from(classe);
		cq.select(r);
		TypedQuery<T> query = getEntityManager().createQuery(cq);
		return query.getSingleResult();
	}
	
	public List<T> buscarTodos() {
		CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<T> cq = cb.createQuery(classe);
		Root<T> r = cq.from(classe);
		cq.select(r);
		TypedQuery<T> query = getEntityManager().createQuery(cq);
		return query.getResultList();
		
	}
}
