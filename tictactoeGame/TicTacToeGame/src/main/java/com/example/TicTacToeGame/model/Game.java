package com.example.TicTacToeGame.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Data;

@Data
public class Game {

    private String gameId;
    Player player1;
    Player player2;
    GameStatus status;
    private int[][] board;
    private TicTacToe winner;
}
