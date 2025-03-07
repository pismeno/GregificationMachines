package pismeno.gfmachines;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pismeno.gfmachines.client.Textures;
import pismeno.gfmachines.common.metatileentities.MetaTileEntities;
import pismeno.gfmachines.common.recipes.RecipeMaps;

@Mod(modid = Tags.MODID, version = Tags.VERSION, name = Tags.MODNAME, acceptedMinecraftVersions = "[1.12.2]")
public class GfMachines {

    public static final Logger LOGGER = LogManager.getLogger(Tags.MODNAME);

    @EventHandler
    // preInit Run before anything else. Read your config, create blocks, items, etc. (Remove if not needed)
    public void preInit(FMLPreInitializationEvent event) {
        // register to the event bus so that we can listen to events
        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.info("Recognized " + Tags.MODNAME + " + at version " + Tags.VERSION);
        Textures.preInit();
        RecipeMaps.preInit();
        LOGGER.info("Textures pre initialized");
    }

    @EventHandler
    // load "Do your mod setup. Build whatever data structures you care about." (Remove if not needed)
    public void init(FMLInitializationEvent event) {
        MetaTileEntities.init();
        LOGGER.info("Meta Tile Entities initialized");
    }
}
