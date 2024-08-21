package org.mfsierrat.futbol.models.dao;

import java.util.List;

import org.mfsierrat.futbol.models.entity.Player;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class PlayerDAOImpl implements IPlayerDAO {
	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<Player> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from Player").getResultList();
	}

	@Override
	@Transactional
	public void save(Player player) {
		// TODO Auto-generated method stub
		em.persist(player);
	}

}
