package com.example.TicTacToeGame.dto;

import com.example.TicTacToeGame.model.Player;
import lombok.Data;

@Data
public class ConnectRequest {
    private Player player;
    private String gameId;
}
