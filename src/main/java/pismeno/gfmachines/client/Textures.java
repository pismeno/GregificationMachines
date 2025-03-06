package pismeno.gfmachines.client;

import gregtech.client.renderer.texture.cube.OrientedOverlayRenderer;

public class Textures {
    public static OrientedOverlayRenderer SAW_OVERLAY;

    public static void preInit() {
        SAW_OVERLAY = new OrientedOverlayRenderer("machines/saw");
    }
}
