package pismeno.gfmachines.client;

import gregtech.client.renderer.texture.cube.OrientedOverlayRenderer;

public class GFMTextures {
    public static OrientedOverlayRenderer SAW_OVERLAY;
    public static OrientedOverlayRenderer LASER_FABRICATOR_OVERLAY;

    public static void preInit() {
        SAW_OVERLAY = new OrientedOverlayRenderer("machines/gfsaw");
        LASER_FABRICATOR_OVERLAY = new OrientedOverlayRenderer("machines/gffabricator");
    }
}