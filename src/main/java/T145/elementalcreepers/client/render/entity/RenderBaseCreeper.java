package T145.elementalcreepers.client.render.entity;

import T145.elementalcreepers.ElementalCreepers;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelCreeper;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderCreeper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StringUtils;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderBaseCreeper extends RenderCreeper {

	private final ResourceLocation texture;
	private final boolean translucent;

	public RenderBaseCreeper(RenderManager manager, ModelBase model, String textureName, boolean translucent) {
		super(manager);
		this.mainModel = model;
		this.translucent = translucent;

		if (StringUtils.isNullOrEmpty(textureName)) {
			this.texture = new ResourceLocation("textures/entity/creeper/creeper.png");
		} else {
			this.texture = new ResourceLocation(ElementalCreepers.MODID, "textures/entities/" + textureName + ".png");
		}

		layerRenderers.clear();
		addLayer(new LayerFestive(this));
		addLayer(getChargeLayer(this));
	}

	protected LayerRenderer getChargeLayer(RenderBaseCreeper renderer) {
		return new LayerBaseCharge(renderer);
	}

	public RenderBaseCreeper(RenderManager manager, String textureName, boolean translucent) {
		this(manager, new ModelCreeper(), textureName, translucent);
	}

	public RenderBaseCreeper(RenderManager manager, boolean translucent) {
		this(manager, new ModelCreeper(), null, translucent);
	}

	public RenderBaseCreeper(RenderManager manager, ModelBase model, String textureName) {
		this(manager, model, textureName, false);
	}

	public RenderBaseCreeper(RenderManager manager, String textureName) {
		this(manager, new ModelCreeper(), textureName);
	}

	public RenderBaseCreeper(RenderManager manager) {
		this(manager, null);
	}

	@Override
	public void doRender(EntityCreeper creeper, double x, double y, double z, float entityYaw, float partialTicks) {
		if (translucent) {
			GlStateManager.pushMatrix();
			GlStateManager.enableBlend();
			GlStateManager.blendFunc(770, 771);
			GlStateManager.color(1.0F, 1.0F, 1.0F, 0.3F);
		}

		super.doRender(creeper, x, y, z, entityYaw, partialTicks);

		if (translucent) {
			GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
			GlStateManager.disableBlend();
			GlStateManager.popMatrix();
		}
	}

	@Override
	public ResourceLocation getEntityTexture(EntityCreeper creeper) {
		return texture;
	}
}