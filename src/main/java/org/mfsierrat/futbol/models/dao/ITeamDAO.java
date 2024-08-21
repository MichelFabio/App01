package org.mfsierrat.futbol.models.dao;

import java.util.List;

import org.mfsierrat.futbol.models.entity.Team;

public interface ITeamDAO {
	public List<Team> getByLeagueId(int league);
}
