package pismeno.gfmachines.common.recipes;

import gregtech.api.gui.GuiTextures;
import gregtech.api.gui.widgets.ProgressWidget;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.builders.SimpleRecipeBuilder;
import gregtech.core.sound.GTSoundEvents;
import stanhebben.zenscript.annotations.ZenProperty;

public class RecipeMaps {
    @ZenProperty
    public static final RecipeMap<SimpleRecipeBuilder> SAW_RECIPES = new RecipeMap<>("saw", 1, 1, 0, 0,
            new SimpleRecipeBuilder().duration(400).EUt(2), false)
            .setSlotOverlay(false, false, GuiTextures.EXTRACTOR_OVERLAY)
            .setProgressBar(GuiTextures.PROGRESS_BAR_EXTRACT, ProgressWidget.MoveType.HORIZONTAL)
            .setSound(GTSoundEvents.COMPRESSOR);
}
