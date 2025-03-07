package pismeno.gfmachines.common.items;

import gregtech.api.GTValues;
import gregtech.api.items.toolitem.*;
import gregtech.core.sound.GTSoundEvents;

import static gregtech.common.items.ToolItems.register;

public class ToolItems {
    public static IGTTool CUTTING_BLADE;

    public static void init () {
        CUTTING_BLADE = register(ItemGTTool.Builder.of(GTValues.MODID, "cutting_blade")
                .toolStats(b -> b.crafting().attackDamage(1.0F).attackSpeed(-3.0F)
                        .brokenStack(ToolHelper.SUPPLY_POWER_UNIT_LV))
                .sound(GTSoundEvents.CHAINSAW_TOOL, false)
                .oreDict(ToolOreDict.toolSaw)
                .secondaryOreDicts("craftingToolSaw")
                .secondaryOreDicts(ToolOreDict.toolBuzzsaw)
                .toolClasses(ToolClasses.SAW)
                .electric(GTValues.LV));
    }
}
