package net.robotwar.sacredarts;

import java.util.Arrays;

public class SacredArtCommand {

    String name;
    String args[];

    public SacredArtCommand(String[] command) {
        this.name = command[0];
        this.args = Arrays.copyOfRange(command, 1, command.length);
    }
}
