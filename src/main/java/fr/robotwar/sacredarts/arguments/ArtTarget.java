package fr.robotwar.sacredarts.arguments;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import net.minecraft.command.CommandSource;
import net.minecraft.command.ISuggestionProvider;
import net.minecraft.command.arguments.PotionArgument;
import net.minecraft.potion.Effect;
import net.minecraft.potion.Effects;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;


public class ArtTarget implements ArgumentType<String> {
    private static final Collection<String> EXAMPLES = Arrays.asList("spooky", "effect");

    public static ArtTarget target() {
        return new PotionArgument();
    }

    public static Target getTarget(CommandContext<CommandSource> p_197125_0_, String p_197125_1_) throws CommandSyntaxException {
        return p_197125_0_.getArgument(p_197125_1_, Target.class);
    }

    public Target parse(StringReader p_parse_1_) throws CommandSyntaxException {
        return 1;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> p_listSuggestions_1_, SuggestionsBuilder p_listSuggestions_2_) {
        return ISuggestionProvider.suggestResource(Registry.MOB_EFFECT.keySet(), p_listSuggestions_2_);
    }

    public Collection<String> getExamples() {
        return EXAMPLES;
    }
}
