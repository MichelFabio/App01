package org.mfsierrat.futbol.controller;

import java.util.Map;

import org.mfsierrat.futbol.models.dao.ITeamDAO;
import org.mfsierrat.futbol.models.entity.Player;
import org.mfsierrat.futbol.models.entity.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@Autowired
	private ITeamDAO teamDAO;
	
	@GetMapping("/inicio")
	public String index() {
		return "inicio";
	}
	
	@GetMapping("/ligas")
	public String ligas() {
		return "ligas";
	}
	@GetMapping("/league")
	public String league(Model model) {
		model.addAttribute("titulo","Ligas");
		Team team = new Team();
		model.addAttribute("liga",teamDAO.getByLeagueId(team.getLeagueID()));
		return "league";
	}
	
}
