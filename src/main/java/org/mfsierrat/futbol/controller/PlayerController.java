package org.mfsierrat.futbol.controller;

import java.util.Map;

import org.mfsierrat.futbol.models.dao.IPlayerDAO;
import org.mfsierrat.futbol.models.entity.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.persistence.EntityManager;

@Controller

public class PlayerController {
	@Autowired
	private IPlayerDAO playerDAO;

	@GetMapping(value = "/listar")
	public String listar(Model model) {
		model.addAttribute("titulo","Listado de jugadores");
		model.addAttribute("jugadores",playerDAO.findAll());
		return "listar";
	}
	
	@GetMapping(value="/guardar")
	public String crear(Map<String, Object> map) {
		map.put("titulo", "formulario de jugador");
		Player player = new Player();
		map.put("player", player);
		return "guardar";
	}
	@PostMapping(value="/guardar")
	public String guardar(Player player) {
		playerDAO.save(player);
		return "redirect:/listar";
	}
}
