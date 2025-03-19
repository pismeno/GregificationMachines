package pismeno.gfmachines.common.recipes;

import gregtech.api.gui.GuiTextures;
import gregtech.api.gui.widgets.ProgressWidget;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.builders.SimpleRecipeBuilder;
import gregtech.core.sound.GTSoundEvents;
import pismeno.gfmachines.client.GuiTexturesHere;
import stanhebben.zenscript.annotations.ZenProperty;

public class RecipeMaps {
    @ZenProperty
    public static RecipeMap<SimpleRecipeBuilder> SAW_RECIPES;
    public static RecipeMap<SimpleRecipeBuilder> LASER_FABRICATOR_RECIPES;

    public static void preInit() {
           SAW_RECIPES = new RecipeMap<>("saw", 2, 3, 0, 0,
                new SimpleRecipeBuilder().duration(40).EUt(2), false)
                   .setSlotOverlay(false, false, false, GuiTexturesHere.SAW_OVERLAY)
                   .setSlotOverlay(false, false, true, GuiTextures.INT_CIRCUIT_OVERLAY)
                .setProgressBar(GuiTexturesHere.PROGRESS_BAR_SAW, ProgressWidget.MoveType.HORIZONTAL)
                .setSound(GTSoundEvents.CUT);

        LASER_FABRICATOR_RECIPES = new RecipeMap<>("laser_fabricator", 9, 1, 0, 0,
                new SimpleRecipeBuilder().duration(200).EUt(480), false)
                .setSound(GTSoundEvents.ELECTROLYZER)
                .setSmallRecipeMap(gregtech.api.recipes.RecipeMaps.LASER_ENGRAVER_RECIPES);
    }
}
