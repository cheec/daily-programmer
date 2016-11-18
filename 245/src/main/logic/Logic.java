package main.logic;

import main.logic.command.CommandResult;

public interface Logic {
    CommandResult execute(String... args);
}
