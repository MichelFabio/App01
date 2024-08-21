package org.mfsierrat.futbol.models.dao;

import java.util.List;

import org.mfsierrat.futbol.models.entity.Player;

public interface IPlayerDAO {
	public List<Player> findAll();
	public void save(Player player);
}
