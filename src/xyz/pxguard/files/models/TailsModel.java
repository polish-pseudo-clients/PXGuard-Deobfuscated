package xyz.pxguard.files.models;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class TailsModel extends ModelBase {

   static ResourceLocation wingsImages;
   private ModelRenderer tail1;
   private ModelRenderer tail3;
   private static final String[] lIIlIllIlllIll;
   private ModelRenderer tail2;
   private static final int[] lIIlIllIllllII;


   public void render(EntityPlayerSP lllllllllllllIIlIIlllIIIIIIlIIlI, boolean lllllllllllllIIlIIlllIIIIIIlIIIl, int lllllllllllllIIlIIlllIIIIIIIllII) {
      Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(String.valueOf((new StringBuilder()).append(lIIlIllIlllIll[lIIlIllIllllII[0]]).append(lllllllllllllIIlIIlllIIIIIIIllII).append(lIIlIllIlllIll[lIIlIllIllllII[5]]))));
      lllllllllllllIIlIIlllIIIIIIlIIll.postRender(lllllllllllllIIlIIlllIIIIIIlIIlI, lllllllllllllIIlIIlllIIIIIIlIIIl);
   }

   private static boolean llIllllllIlIllI(int lllllllllllllIIlIIllIlllllIlIlII, int lllllllllllllIIlIIllIlllllIlIIll) {
      return lllllllllllllIIlIIllIlllllIlIlII < lllllllllllllIIlIIllIlllllIlIIll;
   }

   private static String llIllllllIlIIll(String lllllllllllllIIlIIllIllllllIIlII, String lllllllllllllIIlIIllIlllllIllllI) {
      lllllllllllllIIlIIllIllllllIIlII = new String(Base64.getDecoder().decode(lllllllllllllIIlIIllIllllllIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllIIlIIllIllllllIIIlI = new StringBuilder();
      char[] lllllllllllllIIlIIllIllllllIIIIl = lllllllllllllIIlIIllIlllllIllllI.toCharArray();
      int lllllllllllllIIlIIllIlllllIllIll = lIIlIllIllllII[0];
      char[] lllllllllllllIIlIIllIlllllIllIlI = lllllllllllllIIlIIllIllllllIIlII.toCharArray();
      int lllllllllllllIIlIIllIlllllIllIIl = lllllllllllllIIlIIllIlllllIllIlI.length;
      int lllllllllllllIIlIIllIlllllIllIII = lIIlIllIllllII[0];

      do {
         if(!llIllllllIlIllI(lllllllllllllIIlIIllIlllllIllIII, lllllllllllllIIlIIllIlllllIllIIl)) {
            return String.valueOf(lllllllllllllIIlIIllIllllllIIIlI);
         }

         char lllllllllllllIIlIIllIllllllIIlIl = lllllllllllllIIlIIllIlllllIllIlI[lllllllllllllIIlIIllIlllllIllIII];
         lllllllllllllIIlIIllIllllllIIIlI.append((char)(lllllllllllllIIlIIllIllllllIIlIl ^ lllllllllllllIIlIIllIllllllIIIIl[lllllllllllllIIlIIllIlllllIllIll % lllllllllllllIIlIIllIllllllIIIIl.length]));
         "".length();
         ++lllllllllllllIIlIIllIlllllIllIll;
         ++lllllllllllllIIlIIllIlllllIllIII;
         "".length();
      } while(null == null);

      return null;
   }

   private void postRender(EntityPlayerSP lllllllllllllIIlIIlllIIIIIIIIlll, boolean lllllllllllllIIlIIlllIIIIIIIIllI) {
      GL11.glPushMatrix();
      lllllllllllllIIlIIlllIIIIIIIIlIl.renderWings(lllllllllllllIIlIIlllIIIIIIIIlll, lllllllllllllIIlIIlllIIIIIIIIlll.onGround, lllllllllllllIIlIIlllIIIIIIIIllI, lllllllllllllIIlIIlllIIIIIIIIlll.isJumping);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glPopMatrix();
   }

   private static void llIllllllIlIlIl() {
      lIIlIllIllllII = new int[7];
      lIIlIllIllllII[0] = (62 ^ 33 ^ 186 ^ 144) & (2 ^ 65 ^ 119 ^ 1 ^ -" ".length());
      lIIlIllIllllII[1] = "  ".length();
      lIIlIllIllllII[2] = 14 ^ 83 ^ 124 ^ 38;
      lIIlIllIllllII[3] = 163 + 133 - 108 + 22 ^ 76 + 91 - 151 + 178;
      lIIlIllIllllII[4] = 9 ^ 73;
      lIIlIllIllllII[5] = " ".length();
      lIIlIllIllllII[6] = 60 ^ 52;
   }

   private static String llIllllllIlIIlI(String lllllllllllllIIlIIllIlllllllIlII, String lllllllllllllIIlIIllIlllllllIIll) {
      try {
         SecretKeySpec lllllllllllllIIlIIllIlllllllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIllIlllllllIIll.getBytes(StandardCharsets.UTF_8)), lIIlIllIllllII[6]), "DES");
         Cipher lllllllllllllIIlIIllIllllllIllll = Cipher.getInstance("DES");
         lllllllllllllIIlIIllIllllllIllll.init(lIIlIllIllllII[1], lllllllllllllIIlIIllIlllllllIlIl);
         return new String(lllllllllllllIIlIIllIllllllIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIllIlllllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public TailsModel() {
      lllllllllllllIIlIIlllIIIIIIllIII.tail1 = new ModelRenderer(lllllllllllllIIlIIlllIIIIIIllIII, lIIlIllIllllII[0], lIIlIllIllllII[0]);
      lllllllllllllIIlIIlllIIIIIIllIII.tail2 = new ModelRenderer(lllllllllllllIIlIIlllIIIIIIllIII, lIIlIllIllllII[0], lIIlIllIllllII[0]);
      lllllllllllllIIlIIlllIIIIIIllIII.tail3 = new ModelRenderer(lllllllllllllIIlIIlllIIIIIIllIII, lIIlIllIllllII[0], lIIlIllIllllII[0]);
      lllllllllllllIIlIIlllIIIIIIllIII.tail1.addBox(-1.034F, 10.4F, 0.05F, lIIlIllIllllII[1], lIIlIllIllllII[1], lIIlIllIllllII[2], 0.001F);
      lllllllllllllIIlIIlllIIIIIIllIII.tail2.addBox(-1.034F, 12.05F, 3.59F, lIIlIllIllllII[1], lIIlIllIllllII[1], lIIlIllIllllII[2], 0.001F);
      lllllllllllllIIlIIlllIIIIIIllIII.tail3.addBox(-1.034F, 14.6F, 6.49F, lIIlIllIllllII[1], lIIlIllIllllII[1], lIIlIllIllllII[2], 0.001F);
      GlStateManager.enableTexture2D();
      lllllllllllllIIlIIlllIIIIIIllIII.tail1.rotateAngleX = 6.64F;
      lllllllllllllIIlIIlllIIIIIIllIII.tail2.rotateAngleX = 6.9455557F;
      lllllllllllllIIlIIlllIIIIIIllIII.tail3.rotateAngleX = 7.25F;
      lllllllllllllIIlIIlllIIIIIIllIII.tail1.setRotationPoint(0.0F, -1.0F, -1.0F);
      lllllllllllllIIlIIlllIIIIIIllIII.tail1.setTextureSize(lIIlIllIllllII[3], lIIlIllIllllII[4]);
      "".length();
      lllllllllllllIIlIIlllIIIIIIllIII.tail2.setRotationPoint(0.0F, -1.0F, -1.0F);
      lllllllllllllIIlIIlllIIIIIIllIII.tail2.setTextureSize(lIIlIllIllllII[3], lIIlIllIllllII[4]);
      "".length();
      lllllllllllllIIlIIlllIIIIIIllIII.tail3.setRotationPoint(0.0F, -1.0F, -1.0F);
      lllllllllllllIIlIIlllIIIIIIllIII.tail3.setTextureSize(lIIlIllIllllII[3], lIIlIllIllllII[4]);
      "".length();
   }

   private void renderWings(EntityPlayerSP lllllllllllllIIlIIlllIIIIIIIIIII, boolean lllllllllllllIIlIIllIlllllllllll, boolean lllllllllllllIIlIIllIllllllllllI, boolean lllllllllllllIIlIIllIlllllllllIl) {
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, 0.0F, -0.0125F);
      lllllllllllllIIlIIllIlllllllllII.tail1.render(0.0625F);
      lllllllllllllIIlIIllIlllllllllII.tail2.render(0.0625F);
      lllllllllllllIIlIIllIlllllllllII.tail3.render(0.0625F);
      GL11.glPopMatrix();
   }

   private static void llIllllllIlIlII() {
      lIIlIllIlllIll = new String[lIIlIllIllllII[1]];
      lIIlIllIlllIll[lIIlIllIllllII[0]] = llIllllllIlIIlI("xFx+JOBpiI8lQD/8ovahHsOpAzXzJeqoO0hqV+BX4Anh0MeYH8s7GQ==", "nXzMo");
      lIIlIllIlllIll[lIIlIllIllllII[5]] = llIllllllIlIIll("fDMkIA==", "RCJGT");
   }

   static {
      llIllllllIlIlIl();
      llIllllllIlIlII();
   }
}
