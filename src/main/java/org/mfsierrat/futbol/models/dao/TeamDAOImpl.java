package org.mfsierrat.futbol.models.dao;

import java.util.List;

import org.mfsierrat.futbol.models.entity.Team;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
public class TeamDAOImpl implements ITeamDAO {
	@PersistenceContext
	private EntityManager em;
	@Override
	@Transactional
	public List<Team> getByLeagueId(int league) {
		String query = "FROM Team WHERE league_id = :league";
	    return em.createQuery(query, Team.class)
	             .setParameter("league", league)
	             .getResultList();
	}

}
