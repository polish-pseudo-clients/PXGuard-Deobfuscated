package xyz.pxguard.files.models;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

public class HatModel extends ModelBiped {

   private static final String[] llIlIlIIIIIIl;
   private static final int[] llIlIlIIIIIlI;
   private ModelRenderer model;


   private static void lIIllllIIIlllIl() {
      llIlIlIIIIIIl = new String[llIlIlIIIIIlI[4]];
      llIlIlIIIIIIl[llIlIlIIIIIlI[2]] = lIIllllIIIllIll("AyIaLDMFIhF3Mh83AzstWCQNKysSMws7NVgvAyw1WC8DLA==", "wGbXF");
      llIlIlIIIIIIl[llIlIlIIIIIlI[10]] = lIIllllIIIlllII("wsgPKZJ7Rs8=", "xjknr");
   }

   private static String lIIllllIIIllIll(String lllllllllllllIllIlIlIlllIllIIlll, String lllllllllllllIllIlIlIlllIllIIllI) {
      lllllllllllllIllIlIlIlllIllIIlll = new String(Base64.getDecoder().decode(lllllllllllllIllIlIlIlllIllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllIllIlIlIlllIllIIIII = new StringBuilder();
      char[] lllllllllllllIllIlIlIlllIllIIlII = lllllllllllllIllIlIlIlllIllIIllI.toCharArray();
      int lllllllllllllIllIlIlIlllIllIIIll = llIlIlIIIIIlI[2];
      char[] lllllllllllllIllIlIlIlllIlIlllIl = lllllllllllllIllIlIlIlllIllIIlll.toCharArray();
      int lllllllllllllIllIlIlIlllIlIlllII = lllllllllllllIllIlIlIlllIlIlllIl.length;
      int lllllllllllllIllIlIlIlllIlIllIll = llIlIlIIIIIlI[2];

      do {
         if(!lIIllllIIIlllll(lllllllllllllIllIlIlIlllIlIllIll, lllllllllllllIllIlIlIlllIlIlllII)) {
            return String.valueOf(lllllllllllllIllIlIlIlllIllIIIII);
         }

         char lllllllllllllIllIlIlIlllIlIllIlI = lllllllllllllIllIlIlIlllIlIlllIl[lllllllllllllIllIlIlIlllIlIllIll];
         lllllllllllllIllIlIlIlllIllIIIII.append((char)(lllllllllllllIllIlIlIlllIlIllIlI ^ lllllllllllllIllIlIlIlllIllIIlII[lllllllllllllIllIlIlIlllIllIIIll % lllllllllllllIllIlIlIlllIllIIlII.length]));
         "".length();
         ++lllllllllllllIllIlIlIlllIllIIIll;
         ++lllllllllllllIllIlIlIlllIlIllIll;
         "".length();
      } while(" ".length() > ((219 ^ 130) & ~(154 ^ 195)));

      return null;
   }

   static {
      lIIllllIIIllllI();
      lIIllllIIIlllIl();
   }

   public void render(ModelRenderer lllllllllllllIllIlIlIlllIlllIlII, float lllllllllllllIllIlIlIlllIlllIIll, int lllllllllllllIllIlIlIlllIlllIIlI) {
      ModelPlayer.copyModelAngles(lllllllllllllIllIlIlIlllIlllIlII, lllllllllllllIllIlIlIlllIlllIlIl.model);
      GlStateManager.pushMatrix();
      Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(String.valueOf((new StringBuilder()).append(llIlIlIIIIIIl[llIlIlIIIIIlI[2]]).append(lllllllllllllIllIlIlIlllIlllIIlI).append(llIlIlIIIIIIl[llIlIlIIIIIlI[10]]))));
      lllllllllllllIllIlIlIlllIlllIlIl.model.render(lllllllllllllIllIlIlIlllIlllIIll);
      GlStateManager.popMatrix();
   }

   private static String lIIllllIIIlllII(String lllllllllllllIllIlIlIlllIlIlIIlI, String lllllllllllllIllIlIlIlllIlIlIIIl) {
      try {
         SecretKeySpec lllllllllllllIllIlIlIlllIlIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIllIlIlIlllIlIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllIllIlIlIlllIlIlIlII = Cipher.getInstance("Blowfish");
         lllllllllllllIllIlIlIlllIlIlIlII.init(llIlIlIIIIIlI[4], lllllllllllllIllIlIlIlllIlIlIIll);
         return new String(lllllllllllllIllIlIlIlllIlIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIllIlIlIlllIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public HatModel() {
      lllllllllllllIllIlIlIllllIIIIlIl.model = (new ModelRenderer(lllllllllllllIllIlIlIllllIIIIlIl)).setTextureSize(llIlIlIIIIIlI[0], llIlIlIIIIIlI[1]);
      lllllllllllllIllIlIlIllllIIIIlIl.model.setRotationPoint(-5.0F, -10.03125F, -5.0F);
      lllllllllllllIllIlIlIllllIIIIlIl.model.setTextureOffset(llIlIlIIIIIlI[2], llIlIlIIIIIlI[0]).addBox(-5.0F, -10.0F, -5.0F, llIlIlIIIIIlI[3], llIlIlIIIIIlI[4], llIlIlIIIIIlI[3]);
      "".length();
      ModelRenderer lllllllllllllIllIlIlIllllIIIIlII = (new ModelRenderer(lllllllllllllIllIlIlIllllIIIIlIl)).setTextureSize(llIlIlIIIIIlI[0], llIlIlIIIIIlI[1]);
      lllllllllllllIllIlIlIllllIIIIlII.setRotationPoint(1.75F, -4.0F, 2.0F);
      lllllllllllllIllIlIlIllllIIIIlII.setTextureOffset(llIlIlIIIIIlI[2], llIlIlIIIIIlI[5]).addBox(-5.0F, -9.0F, -5.0F, llIlIlIIIIIlI[6], llIlIlIIIIIlI[7], llIlIlIIIIIlI[6]);
      "".length();
      lllllllllllllIllIlIlIllllIIIIlII.rotateAngleX = -0.05235988F;
      lllllllllllllIllIlIlIllllIIIIlII.rotateAngleZ = 0.02617994F;
      lllllllllllllIllIlIlIllllIIIIlIl.model.addChild(lllllllllllllIllIlIlIllllIIIIlII);
      ModelRenderer lllllllllllllIllIlIlIllllIIIIIll = (new ModelRenderer(lllllllllllllIllIlIlIllllIIIIlIl)).setTextureSize(llIlIlIIIIIlI[0], llIlIlIIIIIlI[1]);
      lllllllllllllIllIlIlIllllIIIIIll.setRotationPoint(1.75F, -4.0F, 2.0F);
      lllllllllllllIllIlIlIllllIIIIIll.setTextureOffset(llIlIlIIIIIlI[2], llIlIlIIIIIlI[8]).addBox(-5.0F, -8.0F, -5.0F, llIlIlIIIIIlI[7], llIlIlIIIIIlI[7], llIlIlIIIIIlI[7]);
      "".length();
      lllllllllllllIllIlIlIllllIIIIIll.rotateAngleX = -0.10471976F;
      lllllllllllllIllIlIlIllllIIIIIll.rotateAngleZ = 0.05235988F;
      lllllllllllllIllIlIlIllllIIIIlII.addChild(lllllllllllllIllIlIlIllllIIIIIll);
      ModelRenderer lllllllllllllIllIlIlIlllIllllllI = (new ModelRenderer(lllllllllllllIllIlIlIllllIIIIlIl)).setTextureSize(llIlIlIIIIIlI[0], llIlIlIIIIIlI[1]);
      lllllllllllllIllIlIlIlllIllllllI.setRotationPoint(1.75F, -2.0F, 2.0F);
      lllllllllllllIllIlIlIlllIllllllI.setTextureOffset(llIlIlIIIIIlI[2], llIlIlIIIIIlI[9]).addBox(-6.0F, -7.0F, -5.0F, llIlIlIIIIIlI[10], llIlIlIIIIIlI[4], llIlIlIIIIIlI[10], 0.25F);
      lllllllllllllIllIlIlIlllIllllllI.rotateAngleX = -0.20943952F;
      lllllllllllllIllIlIlIlllIllllllI.rotateAngleZ = 0.10471976F;
      lllllllllllllIllIlIlIllllIIIIIll.addChild(lllllllllllllIllIlIlIlllIllllllI);
   }

   private static boolean lIIllllIIIlllll(int lllllllllllllIllIlIlIlllIlIIlIlI, int lllllllllllllIllIlIlIlllIlIIlIIl) {
      return lllllllllllllIllIlIlIlllIlIIlIlI < lllllllllllllIllIlIlIlllIlIIlIIl;
   }

   private static void lIIllllIIIllllI() {
      llIlIlIIIIIlI = new int[11];
      llIlIlIIIIIlI[0] = 40 ^ 104;
      llIlIlIIIIIlI[1] = (39 ^ 107) + (224 ^ 151) - (147 + 167 - 196 + 61) + (119 ^ 7);
      llIlIlIIIIIlI[2] = (27 ^ 13) & ~(123 ^ 109);
      llIlIlIIIIIlI[3] = 173 ^ 188 ^ 49 ^ 42;
      llIlIlIIIIIlI[4] = "  ".length();
      llIlIlIIIIIlI[5] = 189 + 40 - 117 + 98 ^ 3 + 135 - -8 + 12;
      llIlIlIIIIIlI[6] = 123 + 45 - 78 + 109 ^ 17 + 45 - -105 + 25;
      llIlIlIIIIIlI[7] = 38 + 98 - -14 + 37 ^ 142 + 123 - 128 + 54;
      llIlIlIIIIIlI[8] = 127 + 51 - 50 + 109 ^ 28 + 171 - 15 + 2;
      llIlIlIIIIIlI[9] = 6 ^ 89;
      llIlIlIIIIIlI[10] = " ".length();
   }
}
