package com.example.TicTacToeGame.controller;

import com.example.TicTacToeGame.model.Player;
import com.example.TicTacToeGame.repository.PlayerRepository;
import com.example.TicTacToeGame.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {

    private final PlayerRepository playerRepository;
    @Autowired
    private PlayerService playerService;

    public PlayerController(PlayerRepository playerRepository, PlayerService playerService) {
        this.playerRepository = playerRepository;
        this.playerService = playerService;
    }

    @GetMapping("/getAllPlayers")
    public List<Player> getAllPlayers(@RequestHeader("Authorization")String jwt){
        return playerRepository.findAll();
    }

}
