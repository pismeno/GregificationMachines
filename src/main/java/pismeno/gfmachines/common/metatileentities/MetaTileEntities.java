package pismeno.gfmachines.common.metatileentities;

import static gregtech.api.util.GTUtility.gregtechId;
import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;

public class MetaTileEntities {
    public static SteamSaw STEAM_SAW_BRONZE;
    public static SteamSaw STEAM_SAW_STEEL;

    public static void init() {
        STEAM_SAW_BRONZE = registerMetaTileEntity(11000, new SteamSaw(gregtechId("steam_saw_bronze"), false));
        STEAM_SAW_STEEL = registerMetaTileEntity(11001, new SteamSaw(gregtechId("steam_saw_steel"), true));
    }
}
