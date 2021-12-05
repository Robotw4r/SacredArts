package fr.robotwar.sacredarts.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.EnchantedGoldenAppleItem;
import net.minecraft.item.ItemStack;

public class GenerateLuminousElement {
    public GenerateLuminousElement(CommandDispatcher<CommandSource> dispatcher) {
        dispatcher.register(Commands.literal("system")
                .then(Commands.literal("call")
                        .then(Commands.literal("generate")
                                .then(Commands.literal("luminous")
                                        .then(Commands.literal("element")
                                                .then(Commands.literal("adhere")
                                                        .executes(source -> lightItem(source.getSource()))
                                                )
                                        )
                                )
                        )
                )
        );
    }

    private int lightItem(CommandSource source) throws CommandSyntaxException {
        ServerPlayerEntity player = source.asPlayer();
        ItemStack mainHandItem = player.getHeldItemMainhand();
        mainHandItem.addEnchantment(Enchantments.BANE_OF_ARTHROPODS, 0);
        //RenderType.outline(true);

        return 1;
    }
}
