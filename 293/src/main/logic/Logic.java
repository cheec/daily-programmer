package main.logic;

import main.logic.commands.Result;

public interface Logic {
    Result execute(String... object);
}
