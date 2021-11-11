package fr.robotwar.sacredarts.arguments;

import net.minecraft.entity.player.ServerPlayerEntity;

public class Target {
    public Target {

    }
    public void targetSelection(){
        if (this == Targets.SELF){
            Target = ServerPlayerEntity
        }
        else if (this == Targets.FRONT){
            //entité en face du curseur
        }
        else if (this == Targets.LEFT){
            ServerPlayerEntity player = player
            Target = player.getOffhandItem();
        }
        else if (this == Targets.LEFT){
            ServerPlayerEntity player = player
            Target = player.getMainHandItem();
        }
    }
}
