package pismeno.gfmachines.common.recipes;

import gregtech.api.gui.widgets.ProgressWidget;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.builders.SimpleRecipeBuilder;
import gregtech.core.sound.GTSoundEvents;
import pismeno.gfmachines.client.GuiTexturesHere;
import stanhebben.zenscript.annotations.ZenProperty;

public class RecipeMaps {
    @ZenProperty
    public static final RecipeMap<SimpleRecipeBuilder> SAW_RECIPES = new RecipeMap<>("saw", 1, 3, 0, 0,
            new SimpleRecipeBuilder().duration(200).EUt(2), false)
            .setSlotOverlay(false, false, GuiTexturesHere.SAW_OVERLAY)
            .setProgressBar(GuiTexturesHere.PROGRESS_BAR_SAW, ProgressWidget.MoveType.HORIZONTAL)
            .setSound(GTSoundEvents.COMPRESSOR);
}
