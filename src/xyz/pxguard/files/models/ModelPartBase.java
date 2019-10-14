package xyz.pxguard.files.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public abstract class ModelPartBase extends ModelBase {

   public static final float SCALE = 0.0625F;


   public static float getAnimationTime(double lllllllllllllIIllllIlIlllllllIIl, Entity lllllllllllllIIllllIlIllllllIllI) {
      return (float)((double)((long)lllllllllllllIIllllIlIllllllIllI.hashCode() + System.currentTimeMillis()) % lllllllllllllIIllllIlIlllllllIIl / lllllllllllllIIllllIlIlllllllIIl * 2.0D * 3.141592653589793D);
   }

   protected void setRotationDegrees(ModelRenderer lllllllllllllIIllllIlIllllllllll, float lllllllllllllIIllllIllIIIIIIIIll, float lllllllllllllIIllllIlIllllllllIl, float lllllllllllllIIllllIlIllllllllII) {
      lllllllllllllIIllllIllIIIIIIIIII.setRotationRadians(lllllllllllllIIllllIlIllllllllll, (double)((float)Math.toRadians((double)lllllllllllllIIllllIllIIIIIIIIll)), (double)((float)Math.toRadians((double)lllllllllllllIIllllIlIllllllllIl)), (double)((float)Math.toRadians((double)lllllllllllllIIllllIlIllllllllII)));
   }

   public abstract void render(Entity var1);

   protected void setRotationRadians(ModelRenderer lllllllllllllIIllllIllIIIIIlIIlI, double lllllllllllllIIllllIllIIIIIlIIIl, double lllllllllllllIIllllIllIIIIIlIIII, double lllllllllllllIIllllIllIIIIIIlIll) {
      lllllllllllllIIllllIllIIIIIlIIlI.rotateAngleX = (float)lllllllllllllIIllllIllIIIIIlIIIl;
      lllllllllllllIIllllIllIIIIIlIIlI.rotateAngleY = (float)lllllllllllllIIllllIllIIIIIlIIII;
      lllllllllllllIIllllIllIIIIIlIIlI.rotateAngleZ = (float)lllllllllllllIIllllIllIIIIIIlIll;
   }
}
