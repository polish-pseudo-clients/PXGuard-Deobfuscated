package xyz.pxguard.files.models;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import xyz.pxguard.files.animations.WingsAnimations;

public class WingsModel extends WingsAnimations {

   private ResourceLocation wingsImages;
   private ModelRenderer leftWing;
   private static final int[] lIIllIllIllIIl;
   private static final String[] lIIllIllIllIII;
   private ModelRenderer rightWing;


   private static String lllIIlllIllIllI(String lllllllllllllIIIllllIIIIIIllIlll, String lllllllllllllIIIllllIIIIIIllIlII) {
      try {
         SecretKeySpec lllllllllllllIIIllllIIIIIIllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllllIIIIIIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllIIIllllIIIIIIllIIlI = Cipher.getInstance("Blowfish");
         lllllllllllllIIIllllIIIIIIllIIlI.init(lIIllIllIllIIl[7], lllllllllllllIIIllllIIIIIIllIIll);
         return new String(lllllllllllllIIIllllIIIIIIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllllIIIIIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public void render(EntityPlayerSP lllllllllllllIIIllllIIIIIllIllll, boolean lllllllllllllIIIllllIIIIIllIlllI, int lllllllllllllIIIllllIIIIIllIlIIl) {
      Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(String.valueOf((new StringBuilder()).append(lIIllIllIllIII[lIIllIllIllIIl[0]]).append(lllllllllllllIIIllllIIIIIllIlIIl).append(lIIllIllIllIII[lIIllIllIllIIl[4]]))));
      lllllllllllllIIIllllIIIIIlllIIII.postRender(lllllllllllllIIIllllIIIIIllIllll, lllllllllllllIIIllllIIIIIllIlllI);
   }

   static {
      lllIIlllIlllIII();
      lllIIlllIllIlll();
   }

   private static String lllIIlllIllIlIl(String lllllllllllllIIIllllIIIIIlIIIlII, String lllllllllllllIIIllllIIIIIlIIIIll) {
      try {
         SecretKeySpec lllllllllllllIIIllllIIIIIlIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllllIIIIIlIIIIll.getBytes(StandardCharsets.UTF_8)), lIIllIllIllIIl[8]), "DES");
         Cipher lllllllllllllIIIllllIIIIIlIIIllI = Cipher.getInstance("DES");
         lllllllllllllIIIllllIIIIIlIIIllI.init(lIIllIllIllIIl[7], lllllllllllllIIIllllIIIIIlIIIlIl);
         return new String(lllllllllllllIIIllllIIIIIlIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllllIIIIIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lllIIlllIlllIll(int lllllllllllllIIIllllIIIIIIllIIII) {
      return lllllllllllllIIIllllIIIIIIllIIII != 0;
   }

   private static int lllIIlllIlllIIl(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F?0:(var2 < 0.0F?-1:1);
   }

   private static void lllIIlllIllIlll() {
      lIIllIllIllIII = new String[lIIllIllIllIIl[7]];
      lIIllIllIllIII[lIIllIllIllIIl[0]] = lllIIlllIllIlIl("f2TdUW05NPutQghleiJg9a8+qChcA+0D8PzO/M1dCaf/s3mP472a2g==", "HFHFU");
      lIIllIllIllIII[lIIllIllIllIIl[4]] = lllIIlllIllIllI("oidnm/V09i4=", "AcIUF");
   }

   private static boolean lllIIlllIlllIlI(int lllllllllllllIIIllllIIIIIIlIlllI) {
      return lllllllllllllIIIllllIIIIIIlIlllI < 0;
   }

   private void postRender(EntityPlayerSP lllllllllllllIIIllllIIIIIllIIlII, boolean lllllllllllllIIIllllIIIIIllIIIll) {
      GL11.glPushMatrix();
      lllllllllllllIIIllllIIIIIllIIIlI.renderWings(lllllllllllllIIIllllIIIIIllIIlII, lllllllllllllIIIllllIIIIIllIIlII.onGround, lllllllllllllIIIllllIIIIIllIIIll, lllllllllllllIIIllllIIIIIllIIlII.isJumping);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glPopMatrix();
   }

   private static void lllIIlllIlllIII() {
      lIIllIllIllIIl = new int[9];
      lIIllIllIllIIl[0] = (141 ^ 165) & ~(77 ^ 101);
      lIIllIllIllIIl[1] = 191 ^ 159;
      lIIllIllIllIIl[2] = 100 + 19 - 49 + 65 ^ 116 + 143 - 172 + 64;
      lIIllIllIllIIl[3] = 98 + 69 - -32 + 2 ^ 80 + 8 - 15 + 64;
      lIIllIllIllIIl[4] = " ".length();
      lIIllIllIllIIl[5] = -(-1025 & 27662) & -131 & 32767;
      lIIllIllIllIIl[6] = -8742 & 9191;
      lIIllIllIllIIl[7] = "  ".length();
      lIIllIllIllIIl[8] = 21 ^ 116 ^ 226 ^ 139;
   }

   public WingsModel() {
      lllllllllllllIIIllllIIIIIlllIllI.leftWing = new ModelRenderer(lllllllllllllIIIllllIIIIIlllIllI, lIIllIllIllIIl[0], lIIllIllIllIIl[0]);
      lllllllllllllIIIllllIIIIIlllIllI.rightWing = new ModelRenderer(lllllllllllllIIIllllIIIIIlllIllI, lIIllIllIllIIl[0], lIIllIllIllIIl[0]);
      float lllllllllllllIIIllllIIIIIllllIII = 0.0F;

      do {
         if(!lllIIlllIlllIlI(lllIIlllIlllIIl(lllllllllllllIIIllllIIIIIllllIII, 0.35F))) {
            lllllllllllllIIIllllIIIIIlllIllI.rightWing.rotateAngleZ = -0.16F;
            lllllllllllllIIIllllIIIIIlllIllI.leftWing.rotateAngleZ = 0.16F;
            lllllllllllllIIIllllIIIIIlllIllI.leftWing.setRotationPoint(0.0F, -1.0F, -1.0F);
            lllllllllllllIIIllllIIIIIlllIllI.rightWing.setRotationPoint(0.0F, -1.0F, -1.0F);
            lllllllllllllIIIllllIIIIIlllIllI.leftWing.setTextureSize(lIIllIllIllIIl[2], lIIllIllIllIIl[3]);
            "".length();
            lllllllllllllIIIllllIIIIIlllIllI.rightWing.setTextureSize(lIIllIllIllIIl[2], lIIllIllIllIIl[3]);
            "".length();
            return;
         }

         lllllllllllllIIIllllIIIIIlllIllI.leftWing.addBox(0.0F, -0.0F, -0.0F, lIIllIllIllIIl[0], lIIllIllIllIIl[1], lIIllIllIllIIl[1], lllllllllllllIIIllllIIIIIllllIII);
         lllllllllllllIIIllllIIIIIlllIllI.rightWing.addBox(0.0F, -0.0F, -0.0F, lIIllIllIllIIl[0], lIIllIllIllIIl[1], lIIllIllIllIIl[1], lllllllllllllIIIllllIIIIIllllIII);
         lllllllllllllIIIllllIIIIIllllIII += 0.01F;
         "".length();
      } while((147 ^ 151) != "   ".length());

      throw null;
   }

   private void renderWings(EntityPlayerSP lllllllllllllIIIllllIIIIIlIlIIII, boolean lllllllllllllIIIllllIIIIIlIlIlIl, boolean lllllllllllllIIIllllIIIIIlIlIlII, boolean lllllllllllllIIIllllIIIIIlIlIIll) {
      float lllllllllllllIIIllllIIIIIlIIllIl = lllllllllllllIIIllllIIIIIlIlIIIl.getWingAngle(30.0F, lIIllIllIllIIl[5], lllllllllllllIIIllllIIIIIlIlIIII.getYOffset());
      lllllllllllllIIIllllIIIIIlIlIIIl.setRotation(lllllllllllllIIIllllIIIIIlIlIIIl.leftWing, (float)Math.toRadians((double)(-lllllllllllllIIIllllIIIIIlIIllIl - 5.0F)));
      lllllllllllllIIIllllIIIIIlIlIIIl.setRotation(lllllllllllllIIIllllIIIIIlIlIIIl.rightWing, (float)Math.toRadians((double)(lllllllllllllIIIllllIIIIIlIIllIl + 5.0F)));
      float lllllllllllllIIIllllIIIIIlIllIIl;
      if(lllIIlllIlllIll(lllllllllllllIIIllllIIIIIlIlIIII.capabilities.isFlying)) {
         lllllllllllllIIIllllIIIIIlIllIIl = lllllllllllllIIIllllIIIIIlIlIIIl.getWingAngle(30.0F, lIIllIllIllIIl[6], lllllllllllllIIIllllIIIIIlIlIIII.getYOffset());
         lllllllllllllIIIllllIIIIIlIlIIIl.setRotation(lllllllllllllIIIllllIIIIIlIlIIIl.leftWing, (float)Math.toRadians((double)(-lllllllllllllIIIllllIIIIIlIllIIl - 5.0F)));
         lllllllllllllIIIllllIIIIIlIlIIIl.setRotation(lllllllllllllIIIllllIIIIIlIlIIIl.rightWing, (float)Math.toRadians((double)(lllllllllllllIIIllllIIIIIlIllIIl + 5.0F)));
      }

      if(lllIIlllIlllIll(lllllllllllllIIIllllIIIIIlIlIIll)) {
         lllllllllllllIIIllllIIIIIlIllIIl = lllllllllllllIIIllllIIIIIlIlIIIl.getWingAngle(30.0F, lIIllIllIllIIl[6], lllllllllllllIIIllllIIIIIlIlIIII.getYOffset());
         lllllllllllllIIIllllIIIIIlIlIIIl.setRotation(lllllllllllllIIIllllIIIIIlIlIIIl.leftWing, (float)Math.toRadians((double)(-lllllllllllllIIIllllIIIIIlIllIIl - 5.0F)));
         lllllllllllllIIIllllIIIIIlIlIIIl.setRotation(lllllllllllllIIIllllIIIIIlIlIIIl.rightWing, (float)Math.toRadians((double)(lllllllllllllIIIllllIIIIIlIllIIl + 5.0F)));
      }

      if(lllIIlllIlllIll(lllllllllllllIIIllllIIIIIlIlIlII)) {
         lllllllllllllIIIllllIIIIIlIlIIIl.rightWing.rotateAngleX = 0.25F;
         lllllllllllllIIIllllIIIIIlIlIIIl.leftWing.rotateAngleX = 0.25F;
      }

      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, 0.0F, -0.0125F);
      lllllllllllllIIIllllIIIIIlIlIIIl.leftWing.render(0.0625F);
      lllllllllllllIIIllllIIIIIlIlIIIl.rightWing.render(0.0625F);
      GL11.glPopMatrix();
   }
}
