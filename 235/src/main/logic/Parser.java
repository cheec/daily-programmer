package main.logic;

import main.model.ScoreSheet;

public interface Parser {
    ScoreSheet parse(String args);
}