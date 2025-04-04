package pismeno.gfmachines.common.recipes;

import gregtech.api.gui.GuiTextures;
import gregtech.api.gui.widgets.ProgressWidget;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.recipes.builders.SimpleRecipeBuilder;
import gregtech.core.sound.GTSoundEvents;
import pismeno.gfmachines.client.GFMGuiTextures;
import stanhebben.zenscript.annotations.ZenProperty;

public class GFMRecipeMaps {
    @ZenProperty
    public static final RecipeMap<SimpleRecipeBuilder> SAW_RECIPES= new RecipeMap<>("saw", 2, 3, 0, 0,
            new SimpleRecipeBuilder().duration(40).EUt(2), false)
            .setSlotOverlay(false, false, false, GFMGuiTextures.SAW_OVERLAY)
            .setSlotOverlay(false, false, true, GuiTextures.INT_CIRCUIT_OVERLAY)
            .setProgressBar(GFMGuiTextures.PROGRESS_BAR_SAW, ProgressWidget.MoveType.HORIZONTAL)
            .setSound(GTSoundEvents.CUT);;

    @ZenProperty
    public static final RecipeMap<SimpleRecipeBuilder> LASER_FABRICATOR_RECIPES = new RecipeMap<>("laser_fabricator", 9, 1, 0, 0,
            new SimpleRecipeBuilder().duration(400).EUt(480), false)
            .setSound(GTSoundEvents.ELECTROLYZER)
            .setProgressBar(GuiTextures.CIRCUIT_OVERLAY, ProgressWidget.MoveType.VERTICAL)
            .setSmallRecipeMap(RecipeMaps.LASER_ENGRAVER_RECIPES);
}
