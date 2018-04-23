package T145.elementalcreepers.entities;

import T145.elementalcreepers.config.ModConfig;
import T145.elementalcreepers.entities.base.EntityBaseCreeper;
import net.minecraft.world.World;

public class EntityGhostCreeper extends EntityBaseCreeper {

    public EntityGhostCreeper(World world) {
        super(world);
    }

    @Override
    public void explode(boolean canGrief) {
        world.createExplosion(this, posX, posY, posZ, ModConfig.EXPLOSION_RADII.ghost, canGrief);
    }
}