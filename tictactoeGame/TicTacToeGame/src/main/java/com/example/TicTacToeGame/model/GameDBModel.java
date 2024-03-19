package com.example.TicTacToeGame.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class GameDBModel {
    @Id
    @GeneratedValue
    private String gameId;
    String player1Login;
    String player2Login;
    String status;
    String winner;
}
