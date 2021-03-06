package com.dots.view;

public interface GameMode {
    public boolean getGameStatus(int score, int color, int moves);

    public String message(int moves);

    public String endMessage();
}
