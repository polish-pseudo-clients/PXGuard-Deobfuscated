package xyz.pxguard.files.mods;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import org.lwjgl.opengl.GL11;

public class Compass {

   private int offY;
   public int height;
   public int width;
   private static final int[] lllIIIlllllII;
   private int clientWidth;
   private static final String[] lllIIIllllIIl;
   private FontRenderer fontRenderer;
   private int offsetAll;
   private ScaledResolution scaledResolution;
   private int centerX;


   private static boolean lIlIlIIlIIIlIIl(int lllllllllllllIlIlllllllIlIllIIII, int lllllllllllllIlIlllllllIlIlIllll) {
      return lllllllllllllIlIlllllllIlIllIIII < lllllllllllllIlIlllllllIlIlIllll;
   }

   private static void lIlIlIIlIIIIllI() {
      lllIIIlllllII = new int[26];
      lllIIIlllllII[0] = (211 ^ 158 ^ 50 + 25 - -9 + 43) & (13 + 107 - 85 + 126 ^ 63 + 8 - -66 + 10 ^ -" ".length());
      lllIIIlllllII[1] = 19 + 144 - 16 + 41 ^ 41 + 82 - 92 + 165;
      lllIIIlllllII[2] = 25 + 46 - -54 + 14 ^ 14 + 71 - -22 + 52;
      lllIIIlllllII[3] = "  ".length();
      lllIIIlllllII[4] = -(-24938 & 32623) & -16513 & 24557;
      lllIIIlllllII[5] = " ".length();
      lllIIIlllllII[6] = 25 + 40 - -49 + 70 ^ 107 + 51 - 38 + 29;
      lllIIIlllllII[7] = 106 ^ 48;
      lllIIIlllllII[8] = "   ".length();
      lllIIIlllllII[9] = 69 + 125 - 59 + 0;
      lllIIIlllllII[10] = 98 + 121 - 192 + 164 ^ 115 + 27 - -34 + 11;
      lllIIIlllllII[11] = "  ".length() + (249 ^ 151) - -(204 ^ 194) + (158 ^ 168);
      lllIIIlllllII[12] = 49 ^ 125 ^ 118 ^ 63;
      lllIIIlllllII[13] = 125 + 29 - -30 + 41;
      lllIIIlllllII[14] = 176 ^ 156 ^ 163 ^ 137;
      lllIIIlllllII[15] = -721 & 990;
      lllIIIlllllII[16] = 39 ^ 114 ^ 28 ^ 78;
      lllIIIlllllII[17] = -(-287 & 27935) & -4097 & 32059;
      lllIIIlllllII[18] = -(-24969 & 30170) & -18597 & 24567;
      lllIIIlllllII[19] = -4217 & 4987;
      lllIIIlllllII[20] = 171 ^ 187;
      lllIIIlllllII[21] = (11 ^ 25) + (76 ^ 101) - -(70 ^ 110) + 45 + 55 - -20 + 36;
      lllIIIlllllII[22] = 30 ^ 22;
      lllIIIlllllII[23] = -1 & 16777215;
      lllIIIlllllII[24] = 150 ^ 142;
      lllIIIlllllII[25] = -20510 & 23551;
   }

   private static void lIlIlIIlIIIIIII() {
      lllIIIllllIIl = new String[lllIIIlllllII[22]];
      lllIIIllllIIl[lllIIIlllllII[0]] = lIlIlIIIlllllIl("LHv8wAVmgyY=", "Rtflf");
      lllIIIllllIIl[lllIIIlllllII[5]] = lIlIlIIIlllllIl("uWTihSE9m9Q=", "hwTch");
      lllIIIllllIIl[lllIIIlllllII[3]] = lIlIlIIIllllllI("xaKI8bymw1g=", "vEwYY");
      lllIIIllllIIl[lllIIIlllllII[8]] = lIlIlIIIlllllIl("QsFdeEwVa+Y=", "IuGQp");
      lllIIIllllIIl[lllIIIlllllII[10]] = lIlIlIIIlllllll("Jw==", "iAfNH");
      lllIIIllllIIl[lllIIIlllllII[12]] = lIlIlIIIllllllI("qtrfe46jA3k=", "eJhuj");
      lllIIIllllIIl[lllIIIlllllII[14]] = lIlIlIIIlllllIl("z2zahakdij8=", "PoYTu");
      lllIIIllllIIl[lllIIIlllllII[16]] = lIlIlIIIlllllIl("da9JlzN5X4k=", "UHACo");
   }

   private int normalize(int lllllllllllllIlIlllllllIlllIIlIl) {
      if(lIlIlIIlIIIlIII(lllllllllllllIlIlllllllIlllIIlIl, lllIIIlllllII[4])) {
         lllllllllllllIlIlllllllIlllIIlIl %= lllIIIlllllII[4];
      }

      do {
         if(!lIlIlIIlIIIlIll(lllllllllllllIlIlllllllIlllIIlIl)) {
            return lllllllllllllIlIlllllllIlllIIlIl;
         }

         lllllllllllllIlIlllllllIlllIIlIl += 360;
         "".length();
      } while((66 + 123 - 143 + 113 ^ 2 + 79 - -49 + 25) >= "  ".length());

      return ("  ".length() ^ 236 ^ 140) & (120 ^ 5 ^ 137 ^ 150 ^ -" ".length());
   }

   private static boolean lIlIlIIlIIIlIll(int lllllllllllllIlIlllllllIlIlIlIIl) {
      return lllllllllllllIlIlllllllIlIlIlIIl < 0;
   }

   static {
      lIlIlIIlIIIIllI();
      lIlIlIIlIIIIIII();
   }

   private void drawDirection(String lllllllllllllIlIlllllllIllllIlll, int lllllllllllllIlIlllllllIllllIIII, double lllllllllllllIlIlllllllIllllIlIl) {
      int lllllllllllllIlIlllllllIllllIlII = lllllllllllllIlIlllllllIlllllIII.clientWidth * lllllllllllllIlIlllllllIllllIIII / lllIIIlllllII[4] - lllllllllllllIlIlllllllIlllllIII.offsetAll;
      if(lIlIlIIlIIIlIII(lllllllllllllIlIlllllllIllllIlII, lllllllllllllIlIlllllllIlllllIII.clientWidth / lllIIIlllllII[3])) {
         lllllllllllllIlIlllllllIllllIlII -= lllllllllllllIlIlllllllIlllllIII.clientWidth;
      }

      if(lIlIlIIlIIIlIIl(lllllllllllllIlIlllllllIllllIlII, -lllllllllllllIlIlllllllIlllllIII.clientWidth / lllIIIlllllII[3])) {
         lllllllllllllIlIlllllllIllllIlII += lllllllllllllIlIlllllllIlllllIII.clientWidth;
      }

      double lllllllllllllIlIlllllllIllllIIll = 1.0D - (double)Math.abs(lllllllllllllIlIlllllllIllllIlII) / ((double)lllllllllllllIlIlllllllIlllllIII.width / 2.0D);
      if(lIlIlIIlIIIlIlI(lIlIlIIlIIIIlll(lllllllllllllIlIlllllllIllllIIll, 0.1D))) {
         int lllllllllllllIlIlllllllIlllIllII = lllIIIlllllII[23];
         int lllllllllllllIlIlllllllIlllIlIll = lllllllllllllIlIlllllllIlllIllII | (int)(lllllllllllllIlIlllllllIllllIIll * 255.0D) << lllIIIlllllII[24];
         int lllllllllllllIlIlllllllIlllIlIlI = lllllllllllllIlIlllllllIlllllIII.centerX + lllllllllllllIlIlllllllIllllIlII - (int)((double)lllllllllllllIlIlllllllIlllllIII.fontRenderer.getStringWidth(lllllllllllllIlIlllllllIllllIlll) * lllllllllllllIlIlllllllIllllIlIl / 2.0D);
         int lllllllllllllIlIlllllllIlllIlIIl = lllllllllllllIlIlllllllIlllllIII.offY + lllllllllllllIlIlllllllIlllllIII.height / lllIIIlllllII[3] - (int)((double)lllllllllllllIlIlllllllIlllllIII.fontRenderer.FONT_HEIGHT * lllllllllllllIlIlllllllIllllIlIl / 2.0D);
         GL11.glEnable(lllIIIlllllII[25]);
         GL11.glPushMatrix();
         GL11.glTranslated((double)(-lllllllllllllIlIlllllllIlllIlIlI) * (lllllllllllllIlIlllllllIllllIlIl - 1.0D), (double)(-lllllllllllllIlIlllllllIlllIlIIl) * (lllllllllllllIlIlllllllIllllIlIl - 1.0D), 0.0D);
         GL11.glScaled(lllllllllllllIlIlllllllIllllIlIl, lllllllllllllIlIlllllllIllllIlIl, 1.0D);
         lllllllllllllIlIlllllllIlllllIII.fontRenderer.drawStringWithShadow(lllllllllllllIlIlllllllIllllIlll, (float)lllllllllllllIlIlllllllIlllIlIlI, (float)lllllllllllllIlIlllllllIlllIlIIl, lllllllllllllIlIlllllllIlllIlIll);
         "".length();
         GL11.glPopMatrix();
         GL11.glDisable(lllIIIlllllII[25]);
      }

   }

   private static boolean lIlIlIIlIIIlIII(int lllllllllllllIlIlllllllIlIlIllII, int lllllllllllllIlIlllllllIlIlIlIll) {
      return lllllllllllllIlIlllllllIlIlIllII > lllllllllllllIlIlllllllIlIlIlIll;
   }

   private void renderMarker() {
      Tessellator lllllllllllllIlIllllllllIIIIlIIl = Tessellator.getInstance();
      WorldRenderer lllllllllllllIlIllllllllIIIIlIII = lllllllllllllIlIllllllllIIIIlIIl.getWorldRenderer();
      GlStateManager.enableBlend();
      GlStateManager.disableTexture2D();
      GlStateManager.tryBlendFuncSeparate(lllIIIlllllII[18], lllIIIlllllII[19], lllIIIlllllII[5], lllIIIlllllII[0]);
      int lllllllllllllIlIllllllllIIIIlIll = lllIIIlllllII[0];
      GlStateManager.color((float)(lllllllllllllIlIllllllllIIIIlIll >> lllIIIlllllII[20] & lllIIIlllllII[21]) / 255.0F, (float)(lllllllllllllIlIllllllllIIIIlIll >> lllIIIlllllII[22] & lllIIIlllllII[21]) / 255.0F, (float)(lllllllllllllIlIllllllllIIIIlIll & lllIIIlllllII[21]) / 255.0F, 1.0F);
      lllllllllllllIlIllllllllIIIIlIII.begin(lllIIIlllllII[14], DefaultVertexFormats.POSITION);
      lllllllllllllIlIllllllllIIIIlIII.pos((double)lllllllllllllIlIllllllllIIIIlIlI.centerX, (double)(lllllllllllllIlIllllllllIIIIlIlI.offY + lllIIIlllllII[8]), 0.0D).endVertex();
      lllllllllllllIlIllllllllIIIIlIII.pos((double)(lllllllllllllIlIllllllllIIIIlIlI.centerX + lllIIIlllllII[8]), (double)lllllllllllllIlIllllllllIIIIlIlI.offY, 0.0D).endVertex();
      lllllllllllllIlIllllllllIIIIlIII.pos((double)(lllllllllllllIlIllllllllIIIIlIlI.centerX - lllIIIlllllII[8]), (double)lllllllllllllIlIllllllllIIIIlIlI.offY, 0.0D).endVertex();
      lllllllllllllIlIllllllllIIIIlIIl.draw();
      GlStateManager.enableTexture2D();
      GlStateManager.disableBlend();
   }

   public Compass() {
      lllllllllllllIlIllllllllIIIllIIl.offY = lllIIIlllllII[0];
      lllllllllllllIlIllllllllIIIllIIl.offsetAll = lllIIIlllllII[0];
      lllllllllllllIlIllllllllIIIllIIl.width = lllIIIlllllII[1];
      lllllllllllllIlIllllllllIIIllIIl.height = lllIIIlllllII[2];
   }

   private static boolean lIlIlIIlIIIlIlI(int lllllllllllllIlIlllllllIlIlIIlll) {
      return lllllllllllllIlIlllllllIlIlIIlll > 0;
   }

   private static String lIlIlIIIlllllIl(String lllllllllllllIlIlllllllIllIlIIII, String lllllllllllllIlIlllllllIllIIllIl) {
      try {
         SecretKeySpec lllllllllllllIlIlllllllIllIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllllllIllIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllIlIlllllllIllIIlIll = Cipher.getInstance("Blowfish");
         lllllllllllllIlIlllllllIllIIlIll.init(lllIIIlllllII[3], lllllllllllllIlIlllllllIllIIllII);
         return new String(lllllllllllllIlIlllllllIllIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllllllIllIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static String lIlIlIIIllllllI(String lllllllllllllIlIlllllllIllIlllIl, String lllllllllllllIlIlllllllIllIlllII) {
      try {
         SecretKeySpec lllllllllllllIlIlllllllIlllIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllllllIllIlllII.getBytes(StandardCharsets.UTF_8)), lllIIIlllllII[22]), "DES");
         Cipher lllllllllllllIlIlllllllIllIllIII = Cipher.getInstance("DES");
         lllllllllllllIlIlllllllIllIllIII.init(lllIIIlllllII[3], lllllllllllllIlIlllllllIlllIIIII);
         return new String(lllllllllllllIlIlllllllIllIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllllllIllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   public void drawCompass() {
      Minecraft var10001 = Minecraft.getMinecraft();
      "".length();
      var10001.fontRenderer = Minecraft.fontRendererObj;
      lllllllllllllIlIllllllllIIIlIlII.scaledResolution = new ScaledResolution(Minecraft.getMinecraft());
      lllllllllllllIlIllllllllIIIlIlII.clientWidth = lllllllllllllIlIllllllllIIIlIlII.scaledResolution.getScaledWidth();
      lllllllllllllIlIllllllllIIIlIlII.centerX = lllllllllllllIlIllllllllIIIlIlII.clientWidth / lllIIIlllllII[3];
      int lllllllllllllIlIllllllllIIIlIIll = lllllllllllllIlIllllllllIIIlIlII.normalize((int)Minecraft.getMinecraft().thePlayer.rotationYaw);
      lllllllllllllIlIllllllllIIIlIlII.offsetAll = lllllllllllllIlIllllllllIIIlIlII.clientWidth * lllllllllllllIlIllllllllIIIlIIll / lllIIIlllllII[4];
      lllllllllllllIlIllllllllIIIlIlII.renderMarker();
      lllllllllllllIlIllllllllIIIlIlII.drawDirection(lllIIIllllIIl[lllIIIlllllII[0]], lllIIIlllllII[0], 1.5D);
      lllllllllllllIlIllllllllIIIlIlII.drawDirection(lllIIIllllIIl[lllIIIlllllII[5]], lllIIIlllllII[6], 1.5D);
      lllllllllllllIlIllllllllIIIlIlII.drawDirection(lllIIIllllIIl[lllIIIlllllII[3]], lllIIIlllllII[7], 1.5D);
      lllllllllllllIlIllllllllIIIlIlII.drawDirection(lllIIIllllIIl[lllIIIlllllII[8]], lllIIIlllllII[9], 1.5D);
      lllllllllllllIlIllllllllIIIlIlII.drawDirection(lllIIIllllIIl[lllIIIlllllII[10]], lllIIIlllllII[11], 1.5D);
      lllllllllllllIlIllllllllIIIlIlII.drawDirection(lllIIIllllIIl[lllIIIlllllII[12]], lllIIIlllllII[13], 1.5D);
      lllllllllllllIlIllllllllIIIlIlII.drawDirection(lllIIIllllIIl[lllIIIlllllII[14]], lllIIIlllllII[15], 1.5D);
      lllllllllllllIlIllllllllIIIlIlII.drawDirection(lllIIIllllIIl[lllIIIlllllII[16]], lllIIIlllllII[17], 1.5D);
   }

   private static String lIlIlIIIlllllll(String lllllllllllllIlIlllllllIlIlllIll, String lllllllllllllIlIlllllllIlIllllll) {
      lllllllllllllIlIlllllllIlIlllIll = new String(Base64.getDecoder().decode(lllllllllllllIlIlllllllIlIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllIlIlllllllIlIlllllI = new StringBuilder();
      char[] lllllllllllllIlIlllllllIlIllllIl = lllllllllllllIlIlllllllIlIllllll.toCharArray();
      int lllllllllllllIlIlllllllIlIllIlll = lllIIIlllllII[0];
      char[] lllllllllllllIlIlllllllIlIllIllI = lllllllllllllIlIlllllllIlIlllIll.toCharArray();
      int lllllllllllllIlIlllllllIlIllIlIl = lllllllllllllIlIlllllllIlIllIllI.length;
      int lllllllllllllIlIlllllllIlIllIlII = lllIIIlllllII[0];

      do {
         if(!lIlIlIIlIIIlIIl(lllllllllllllIlIlllllllIlIllIlII, lllllllllllllIlIlllllllIlIllIlIl)) {
            return String.valueOf(lllllllllllllIlIlllllllIlIlllllI);
         }

         char lllllllllllllIlIlllllllIllIIIIIl = lllllllllllllIlIlllllllIlIllIllI[lllllllllllllIlIlllllllIlIllIlII];
         lllllllllllllIlIlllllllIlIlllllI.append((char)(lllllllllllllIlIlllllllIllIIIIIl ^ lllllllllllllIlIlllllllIlIllllIl[lllllllllllllIlIlllllllIlIllIlll % lllllllllllllIlIlllllllIlIllllIl.length]));
         "".length();
         ++lllllllllllllIlIlllllllIlIllIlll;
         ++lllllllllllllIlIlllllllIlIllIlII;
         "".length();
      } while((181 ^ 177) >= 0);

      return null;
   }

   private static int lIlIlIIlIIIIlll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D?0:(var4 < 0.0D?-1:1);
   }
}
