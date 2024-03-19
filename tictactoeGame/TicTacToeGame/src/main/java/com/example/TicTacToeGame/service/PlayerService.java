package com.example.TicTacToeGame.service;

import com.example.TicTacToeGame.model.Game;
import com.example.TicTacToeGame.model.Player;
import com.example.TicTacToeGame.model.TicTacToe;
import com.example.TicTacToeGame.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    @Autowired
    private final PlayerRepository playerRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public void updatePlayerResults(Game game){
        if(playerRepository.findByLogin(game.getPlayer1().getLogin()).isPresent()
                && playerRepository.findByLogin(game.getPlayer2().getLogin()).isPresent()){

            Player player1 = playerRepository.findByLogin(game.getPlayer1().getLogin()).get();
            Player player2 = playerRepository.findByLogin(game.getPlayer2().getLogin()).get();

            if (game.getWinner().equals(TicTacToe.X)) {

                player1.setWins(player1.getWins() + 1);
                player2.setLoses(player2.getLoses() + 1);

            }else if(game.getWinner().equals(TicTacToe.O)){

                player1.setLoses(player1.getLoses() + 1);
                player2.setWins(player2.getWins() + 1);

            }
            playerRepository.save(player1);
            playerRepository.save(player2);
        }

    }



}
