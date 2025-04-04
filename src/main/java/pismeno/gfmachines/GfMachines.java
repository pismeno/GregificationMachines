package pismeno.gfmachines;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pismeno.gfmachines.client.GFMTextures;
import pismeno.gfmachines.common.metatileentities.MetaTileEntities;
import pismeno.gfmachines.common.recipes.MachineRecipes;

@Mod(modid = Tags.MODID, version = Tags.VERSION, name = Tags.MODNAME, acceptedMinecraftVersions = "[1.12.2]", dependencies =  "required-after:gregtech")
public class GfMachines {

    public static final Logger LOGGER = LogManager.getLogger(Tags.MODNAME);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.info("Recognized " + Tags.MODNAME + " + at version " + Tags.VERSION);

        GFMTextures.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        MetaTileEntities.init();
    }

    @SubscribeEvent
    public void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        MachineRecipes.init();
    }
}
