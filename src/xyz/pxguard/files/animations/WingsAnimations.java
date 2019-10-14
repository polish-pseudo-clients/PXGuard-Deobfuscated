package xyz.pxguard.files.animations;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class WingsAnimations extends ModelBase {

   public float SCALE = 0.0625F;


   protected float getWingAngle(float lllllllllllllIlIIlIIIIIIIlllIIlI, int lllllllllllllIlIIlIIIIIIIllIlIll, double lllllllllllllIlIIlIIIIIIIllIlIlI) {
      float lllllllllllllIlIIlIIIIIIIllIlIIl = 0.0F;
      float lllllllllllllIlIIlIIIIIIIllIlllI = lllllllllllllIlIIlIIIIIIIlllIIll.getAnimationTime(lllllllllllllIlIIlIIIIIIIllIlIll, lllllllllllllIlIIlIIIIIIIllIlIlI);
      if(llIIIIIIlIIlIlI(llIIIIIIlIIlIIl(lllllllllllllIlIIlIIIIIIIllIlllI, 0.5F))) {
         lllllllllllllIlIIlIIIIIIIllIlIIl = Sigmoid((double)(-4.0F + lllllllllllllIlIIlIIIIIIIllIlllI * 2.0F * 8.0F));
         "".length();
         if(((189 ^ 150) & ~(18 ^ 57)) >= "   ".length()) {
            return 0.0F;
         }
      } else {
         lllllllllllllIlIIlIIIIIIIllIlIIl = 1.0F - Sigmoid((double)(-4.0F + (lllllllllllllIlIIlIIIIIIIllIlllI * 2.0F - 1.0F) * 8.0F));
      }

      lllllllllllllIlIIlIIIIIIIllIlIIl *= lllllllllllllIlIIlIIIIIIIlllIIlI;
      return lllllllllllllIlIIlIIIIIIIllIlIIl;
   }

   private static int llIIIIIIlIIlIIl(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F?0:(var2 < 0.0F?-1:1);
   }

   protected void setRotation(ModelRenderer lllllllllllllIlIIlIIIIIIIllIIIlI, float lllllllllllllIlIIlIIIIIIIllIIIIl) {
      lllllllllllllIlIIlIIIIIIIllIIIlI.rotateAngleY = lllllllllllllIlIIlIIIIIIIllIIIIl;
   }

   private float getAnimationTime(int lllllllllllllIlIIlIIIIIIIlIlIllI, double lllllllllllllIlIIlIIIIIIIlIllIII) {
      float lllllllllllllIlIIlIIIIIIIlIlIlII = (float)(((double)System.currentTimeMillis() + lllllllllllllIlIIlIIIIIIIlIllIII) % (double)lllllllllllllIlIIlIIIIIIIlIlIllI);
      return lllllllllllllIlIIlIIIIIIIlIlIlII / (float)lllllllllllllIlIIlIIIIIIIlIlIllI;
   }

   private static boolean llIIIIIIlIIlIlI(int lllllllllllllIlIIlIIIIIIIlIlIIlI) {
      return lllllllllllllIlIIlIIIIIIIlIlIIlI <= 0;
   }

   private static float Sigmoid(double lllllllllllllIlIIlIIIIIIIlIllllI) {
      return 1.0F / (1.0F + (float)Math.exp(-lllllllllllllIlIIlIIIIIIIlIllllI));
   }
}
