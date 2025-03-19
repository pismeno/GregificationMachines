package pismeno.gfmachines.common.metatileentities;

import gregtech.api.GTValues;
import gregtech.api.metatileentity.SimpleMachineMetaTileEntity;

import gregtech.common.metatileentities.multi.electric.MetaTileEntityImplosionCompressor;
import net.minecraft.util.ResourceLocation;
import pismeno.gfmachines.Tags;
import pismeno.gfmachines.common.recipes.RecipeMaps;
import pismeno.gfmachines.client.Textures;

import static gregtech.api.util.GTUtility.gregtechId;
import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;
import static gregtech.common.metatileentities.MetaTileEntities.registerSimpleMetaTileEntity;


public class MetaTileEntities {
    public static final SimpleMachineMetaTileEntity[] SAW = new SimpleMachineMetaTileEntity[GTValues.V.length - 1];

    public static SteamSaw STEAM_SAW_BRONZE;
    public static SteamSaw STEAM_SAW_STEEL;
    public static LaserFabricator LASER_FABRICATOR;

    public static void init() {
        STEAM_SAW_BRONZE = registerMetaTileEntity(11000, new SteamSaw(gregtechId("steam_saw_bronze"), false));
        STEAM_SAW_STEEL = registerMetaTileEntity(11001, new SteamSaw(gregtechId("steam_saw_steel"), true));

        registerSimpleMetaTileEntity(SAW, 11002, "saw", RecipeMaps.SAW_RECIPES,
                Textures.SAW_OVERLAY, true, machineName -> new ResourceLocation(GTValues.MODID, machineName)  , fluidTank -> 0);

        LASER_FABRICATOR = registerMetaTileEntity(11011,
                new LaserFabricator(gregtechId("laser_fabricator")));
    }
}
