package pismeno.gfmachines.common.recipes;

import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;

import static gregtech.api.GTValues.*;
import static pismeno.gfmachines.common.recipes.GFMRecipeMaps.*;

public class MachineRecipes {
    public static void init() {
        LASER_FABRICATOR_RECIPES.recipeBuilder()
                .input(OrePrefix.ingot, Materials.Silver)
                .input(OrePrefix.plate, Materials.Tungsten)
                .output(OrePrefix.plate, Materials.Steel)
                .duration(240).EUt(VA[HV]).buildAndRegister();

        SAW_RECIPES.recipeBuilder()
                .input(OrePrefix.ingot, Materials.Silver)
                .input(OrePrefix.plate, Materials.Tungsten)
                .output(OrePrefix.plate, Materials.Steel)
                .duration(240).EUt(VA[HV]).buildAndRegister();
    }
}
