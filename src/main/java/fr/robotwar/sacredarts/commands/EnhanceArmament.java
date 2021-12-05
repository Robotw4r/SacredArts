package fr.robotwar.sacredarts.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class EnhanceArmament {
    public EnhanceArmament(CommandDispatcher<CommandSource> dispatcher) {
        dispatcher.register(Commands.literal("system")
                .then(Commands.literal("call")
                        .then(Commands.literal("enhance")
                                .then(Commands.literal("armament")
                                        .executes(source -> enhanceArmament(source.getSource()))
                                )
                        )
                )
        );
    }

    private int enhanceArmament(CommandSource source) throws CommandSyntaxException {
        ServerPlayerEntity player = source.asPlayer();
        ItemStack mainHandItem = player.getHeldItemMainhand();
        mainHandItem.addEnchantment(Enchantments.SHARPNESS, 5);
        player.addPotionEffect(new EffectInstance(Effects.STRENGTH, 400, 4, false, false));

        return 1;
    }
}
