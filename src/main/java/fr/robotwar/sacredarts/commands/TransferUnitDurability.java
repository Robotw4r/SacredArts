package fr.robotwar.sacredarts.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;

import fr.robotwar.sacredarts.arguments.ArtTarget;
import net.minecraft.potion.Effect;

public class TransferUnitDurability {
    public TransferUnitDurability(CommandDispatcher<CommandSource> dispatcher) {
        dispatcher.register(Commands.literal("system")
                .then(Commands.literal("call")
                        .then(Commands.literal("transfer")
                                .then(Commands.literal("human")
                                        .then(Commands.literal("unit")
                                                .then(Commands.literal("durability")
                                                        .then(Commands.literal("self")
                                                                .then(Commands.literal("to")
                                                                        .then(Commands.literal("left")
                                                                                .executes(source -> 1)
                                                                        )
                                                                )
                                                        )

                                                )
                                        )
                                )
                        )
                )
        );
    }

    private int transferUnitDurability(CommandSource source) throws CommandSyntaxException {


        return 1;
    }
}
