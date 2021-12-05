package fr.robotwar.sacredarts;

import fr.robotwar.sacredarts.commands.EnhanceArmament;
import fr.robotwar.sacredarts.commands.GenerateLuminousElement;
import fr.robotwar.sacredarts.commands.TransferUnitDurability;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.server.command.ConfigCommand;

@Mod.EventBusSubscriber(modid = References.MODID)
public class ModEvents {

    @SubscribeEvent
    public static void onCommandsRegister(RegisterCommandsEvent event) {
        new TransferUnitDurability(event.getDispatcher());
        new GenerateLuminousElement(event.getDispatcher());
        new EnhanceArmament(event.getDispatcher());

        ConfigCommand.register(event.getDispatcher());
    }
}
