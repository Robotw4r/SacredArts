package fr.robotwar.sacredarts.arguments;


import net.minecraft.potion.Effect;
import net.minecraft.util.registry.Registry;

public class Targets {
    public static final Target SELF = register("self");
    public static final Target FRONT = register("front");
    public static final Target LEFT = register("left");
    public static final Target RIGHT = register("right");

    private static Effect register(String) {
        return 0;
    }
}
