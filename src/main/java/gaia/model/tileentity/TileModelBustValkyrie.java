package gaia.model.tileentity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class TileModelBustValkyrie extends ModelBase implements IModelBust {
	private ModelRenderer head;
	private ModelRenderer headaccessory;
	private ModelRenderer helmet;
	private ModelRenderer featherright;
	private ModelRenderer featherleft;
	private ModelRenderer hair;
	private ModelRenderer body;
	private ModelRenderer rightchest;
	private ModelRenderer leftchest;
	private ModelRenderer rightpauldron;
	private ModelRenderer rightarm;
	private ModelRenderer leftpauldron;
	private ModelRenderer leftarm;
	private ModelRenderer stand1;
	private ModelRenderer stand2;
	private ModelRenderer stand3;

	public TileModelBustValkyrie() {
		textureWidth = 128;
		textureHeight = 64;

		head = new ModelRenderer(this, 0, 0);
		head.addBox(-3F, -6F, -3F, 6, 6, 6);
		head.setRotationPoint(0F, 14F, 0F);
		setRotation(head, 0F, 0F, 0F);
		headaccessory = new ModelRenderer(this, 36, 0);
		headaccessory.addBox(-3.5F, -6.5F, -3.5F, 7, 7, 7);
		headaccessory.setRotationPoint(0F, 14F, 0F);
		setRotation(headaccessory, 0F, 0F, 0F);
		helmet = new ModelRenderer(this, 36, 27);
		helmet.addBox(-3F, -7F, -4F, 6, 3, 4);
		helmet.setRotationPoint(0F, 14F, 0F);
		setRotation(helmet, 0F, 0F, 0F);
		featherright = new ModelRenderer(this, 36, 34);
		featherright.addBox(-4.5F, -7F, 0F, 1, 6, 8);
		featherright.setRotationPoint(0F, 14F, 0F);
		setRotation(featherright, 0.3490659F, -0.2617994F, 0F);
		featherleft = new ModelRenderer(this, 54, 34);
		featherleft.addBox(3.5F, -7F, 0F, 1, 6, 8);
		featherleft.setRotationPoint(0F, 14F, 0F);
		setRotation(featherleft, 0.3490659F, 0.2617994F, 0F);
		hair = new ModelRenderer(this, 36, 14);
		hair.addBox(-3.5F, -3F, 1F, 7, 10, 3);
		hair.setRotationPoint(0F, 14F, 0F);
		setRotation(hair, 0.2617994F, 0F, 0F);
		body = new ModelRenderer(this, 0, 12);
		body.addBox(-2.5F, 0F, -1.5F, 5, 6, 3);
		body.setRotationPoint(0F, 14F, 0F);
		setRotation(body, 0F, 0F, 0F);
		rightchest = new ModelRenderer(this, 0, 21);
		rightchest.addBox(-1F, -1F, -1F, 2, 2, 2);
		rightchest.setRotationPoint(-1.3F, 16F, -1.5F);
		setRotation(rightchest, 0.7853982F, 0.1745329F, 0.0872665F);
		leftchest = new ModelRenderer(this, 8, 21);
		leftchest.addBox(-1F, -1F, -1F, 2, 2, 2);
		leftchest.setRotationPoint(1.3F, 16F, -1.5F);
		setRotation(leftchest, 0.7853982F, -0.1745329F, -0.0872665F);
		rightpauldron = new ModelRenderer(this, 72, 0);
		rightpauldron.addBox(-4F, -2F, -2F, 4, 3, 4);
		rightpauldron.setRotationPoint(-2.5F, 16F, 0F);
		setRotation(rightpauldron, 0.0872665F, 0F, -0.3490659F);
		rightarm = new ModelRenderer(this, 16, 12);
		rightarm.addBox(-2.5F, -1F, -1F, 2, 4, 2);
		rightarm.setRotationPoint(-2F, 16F, 0F);
		setRotation(rightarm, 0F, 0F, -0.2617994F);
		leftpauldron = new ModelRenderer(this, 88, 0);
		leftpauldron.addBox(0F, -2F, -2F, 4, 3, 4);
		leftpauldron.setRotationPoint(2.5F, 16F, 0F);
		setRotation(leftpauldron, 0.0872665F, 0F, 0.3490659F);
		leftarm = new ModelRenderer(this, 16, 12);
		leftarm.addBox(0.5F, -1F, -1F, 2, 4, 2);
		leftarm.setRotationPoint(2F, 16F, 0F);
		setRotation(leftarm, 0F, 0F, 0.2617994F);
		stand1 = new ModelRenderer(this, 0, 25);
		stand1.addBox(-1.5F, 6F, -1.5F, 3, 1, 3);
		stand1.setRotationPoint(0F, 14F, 0F);
		setRotation(stand1, 0F, 0F, 0F);
		stand2 = new ModelRenderer(this, 0, 29);
		stand2.addBox(-1F, 7F, -1F, 2, 2, 2);
		stand2.setRotationPoint(0F, 14F, 0F);
		setRotation(stand2, 0F, 0F, 0F);
		stand3 = new ModelRenderer(this, 0, 33);
		stand3.addBox(-2F, 9F, -2F, 4, 1, 4);
		stand3.setRotationPoint(0F, 14F, 0F);
		setRotation(stand3, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		head.render(scale);
		headaccessory.render(scale);
		helmet.render(scale);
		featherright.render(scale);
		featherleft.render(scale);
		hair.render(scale);
		body.render(scale);
		rightchest.render(scale);
		leftchest.render(scale);
		rightpauldron.render(scale);
		rightarm.render(scale);
		leftpauldron.render(scale);
		leftarm.render(scale);
		stand1.render(scale);
		stand2.render(scale);
		stand3.render(scale);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void renderModel(float scale) {
		head.render(scale);
		headaccessory.render(scale);
		helmet.render(scale);
		featherright.render(scale);
		featherleft.render(scale);
		hair.render(scale);
		body.render(scale);
		rightchest.render(scale);
		leftchest.render(scale);
		rightpauldron.render(scale);
		rightarm.render(scale);
		leftpauldron.render(scale);
		leftarm.render(scale);
		stand1.render(scale);
		stand2.render(scale);
		stand3.render(scale);
	}
}
