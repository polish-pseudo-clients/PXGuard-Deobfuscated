package xyz.pxguard.files.mods;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class FPS {

   private static final int[] lIlIIIllIIllIl;
   private final int xOffset;
   private final Minecraft mc = Minecraft.getMinecraft();
   private static final String[] lIlIIIllIIllII;
   private final List clicks = new ArrayList();
   public static double textBrightness;
   private boolean wasPressed;
   private final int yOffset;
   private final int button;
   private static final String[] BUTTONS;
   private int color;
   private long lastPress;


   private int getFPS() {
      Object lllllllllllllIIIlIIllIIIlIIlIIII = System.currentTimeMillis();
      lllllllllllllIIIlIIllIIIlIIlIIll.clicks.removeIf((Predicate)lllllllllllllIIIlIIllIIIlIIlIIII);
      "".length();
      return lllllllllllllIIIlIIllIIIlIIlIIll.clicks.size();
   }

   private static boolean llllIIlIIIIIIIl(int lllllllllllllIIIlIIllIIIIlIIllIl) {
      return lllllllllllllIIIlIIllIIIIlIIllIl != 0;
   }

   private static void llllIIIllllllll() {
      lIlIIIllIIllIl = new int[11];
      lIlIIIllIIllIl[0] = " ".length();
      lIlIIIllIIllIl[1] = (204 ^ 130) + 178 + 12 - 122 + 135 - (8 + 49 - -39 + 42) + (221 ^ 173);
      lIlIIIllIIllIl[2] = (51 ^ 12) & ~(76 ^ 115);
      lIlIIIllIIllIl[3] = 98 ^ 70 ^ 167 ^ 197;
      lIlIIIllIIllIl[4] = 7 + 120 - 68 + 70 ^ 77 + 17 - -1 + 50;
      lIlIIIllIIllIl[5] = -29047 & 2013294966;
      lIlIIIllIIllIl[6] = 32 + 101 - -61 + 6 ^ 25 + 87 - -5 + 75;
      lIlIIIllIIllIl[7] = 180 ^ 176;
      lIlIIIllIIllIl[8] = -(-3828 & 16781043);
      lIlIIIllIIllIl[9] = "  ".length();
      lIlIIIllIIllIl[10] = "   ".length();
   }

   private static boolean lambda$getFPS$0(long lllllllllllllIIIlIIllIIIIllIlIlI, Long lllllllllllllIIIlIIllIIIIllIlIIl) {
      int var10000;
      if(llllIIlIIIIIIll(llllIIlIIIIIIlI(lllllllllllllIIIlIIllIIIIllIlIIl.longValue() + 1000L, lllllllllllllIIIlIIllIIIIllIlIlI))) {
         var10000 = lIlIIIllIIllIl[0];
         "".length();
         if(" ".length() == 0) {
            return (boolean)((176 ^ 181) & ~(48 ^ 53));
         }
      } else {
         var10000 = lIlIIIllIIllIl[2];
      }

      return (boolean)var10000;
   }

   public FPS(int lllllllllllllIIIlIIllIIIlIIllIII, int lllllllllllllIIIlIIllIIIlIIllIll, int lllllllllllllIIIlIIllIIIlIIllIlI) {
      lllllllllllllIIIlIIllIIIlIIlllIl.wasPressed = (boolean)lIlIIIllIIllIl[0];
      lllllllllllllIIIlIIllIIIlIIlllIl.lastPress = 0L;
      lllllllllllllIIIlIIllIIIlIIlllIl.color = lIlIIIllIIllIl[1];
      "".length();
      textBrightness = 1.0D;
      lllllllllllllIIIlIIllIIIlIIlllIl.button = lllllllllllllIIIlIIllIIIlIIllIII;
      lllllllllllllIIIlIIllIIIlIIlllIl.xOffset = lllllllllllllIIIlIIllIIIlIIllIll;
      lllllllllllllIIIlIIllIIIlIIlllIl.yOffset = lllllllllllllIIIlIIllIIIlIIllIlI;
   }

   private static void llllIIIlllllllI() {
      lIlIIIllIIllII = new String[lIlIIIllIIllIl[10]];
      lIlIIIllIIllII[lIlIIIllIIllIl[2]] = llllIIIllllllII("i0s3DTj+Lkg=", "cVyvX");
      lIlIIIllIIllII[lIlIIIllIIllIl[0]] = llllIIIllllllIl("oDuvpBlMNCI=", "CZtfc");
      lIlIIIllIIllII[lIlIIIllIIllIl[9]] = llllIIIllllllII("nADjpugjG1Q=", "zfDjF");
   }

   private static String llllIIIllllllIl(String lllllllllllllIIIlIIllIIIIlIlIIlI, String lllllllllllllIIIlIIllIIIIlIlIIIl) {
      try {
         SecretKeySpec lllllllllllllIIIlIIllIIIIlIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIllIIIIlIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllIIIlIIllIIIIlIlIllI = Cipher.getInstance("Blowfish");
         lllllllllllllIIIlIIllIIIIlIlIllI.init(lIlIIIllIIllIl[9], lllllllllllllIIIlIIllIIIIlIlIlIl);
         return new String(lllllllllllllIIIlIIllIIIIlIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIllIIIIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean llllIIlIIIIIIll(int lllllllllllllIIIlIIllIIIIlIIlIll) {
      return lllllllllllllIIIlIIllIIIIlIIlIll < 0;
   }

   private static boolean llllIIlIIIIIIII(int lllllllllllllIIIlIIllIIIIlIIlIII, int lllllllllllllIIIlIIllIIIIlIIIlll) {
      return lllllllllllllIIIlIIllIIIIlIIlIII != lllllllllllllIIIlIIllIIIIlIIIlll;
   }

   private static int llllIIlIIIIIIlI(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L?0:(var4 < 0L?-1:1);
   }

   public void renderFPS(int lllllllllllllIIIlIIllIIIlIIIIIll, int lllllllllllllIIIlIIllIIIIlllIlll, int lllllllllllllIIIlIIllIIIIlllIllI) {
      byte lllllllllllllIIIlIIllIIIlIIIIIII = Mouse.isButtonDown(lllllllllllllIIIlIIllIIIIllllIIl.button);
      String var10000 = BUTTONS[lllllllllllllIIIlIIllIIIIllllIIl.button];
      if(llllIIlIIIIIIII(lllllllllllllIIIlIIllIIIlIIIIIII, lllllllllllllIIIlIIllIIIIllllIIl.wasPressed)) {
         lllllllllllllIIIlIIllIIIIllllIIl.wasPressed = (boolean)lllllllllllllIIIlIIllIIIlIIIIIII;
         lllllllllllllIIIlIIllIIIIllllIIl.lastPress = System.currentTimeMillis();
         if(llllIIlIIIIIIIl(lllllllllllllIIIlIIllIIIlIIIIIII)) {
            lllllllllllllIIIlIIllIIIIllllIIl.clicks.add(Long.valueOf(lllllllllllllIIIlIIllIIIIllllIIl.lastPress));
            "".length();
         }
      }

      if(llllIIlIIIIIIIl(lllllllllllllIIIlIIllIIIlIIIIIII)) {
         lllllllllllllIIIlIIllIIIIllllIIl.color = lIlIIIllIIllIl[2];
         "".length();
         if(" ".length() <= 0) {
            return;
         }
      } else {
         lllllllllllllIIIlIIllIIIIllllIIl.color = lIlIIIllIIllIl[2];
      }

      Gui.drawRect(lllllllllllllIIIlIIllIIIlIIIIIll + lllllllllllllIIIlIIllIIIIllllIIl.xOffset, lllllllllllllIIIlIIllIIIIlllIlll + lllllllllllllIIIlIIllIIIIllllIIl.yOffset, lllllllllllllIIIlIIllIIIlIIIIIll + lllllllllllllIIIlIIllIIIIllllIIl.xOffset + lIlIIIllIIllIl[3], lllllllllllllIIIlIIllIIIIlllIlll + lllllllllllllIIIlIIllIIIIllllIIl.yOffset + lIlIIIllIIllIl[4], lIlIIIllIIllIl[5] + (lllllllllllllIIIlIIllIIIIllllIIl.color << lIlIIIllIIllIl[4]) + (lllllllllllllIIIlIIllIIIIllllIIl.color << lIlIIIllIIllIl[6]) + lllllllllllllIIIlIIllIIIIllllIIl.color);
      int lllllllllllllIIIlIIllIIIIlllIIll = lllllllllllllIIIlIIllIIIIlllIllI >> lIlIIIllIIllIl[4] & lIlIIIllIIllIl[1];
      int lllllllllllllIIIlIIllIIIIlllIIlI = lllllllllllllIIIlIIllIIIIlllIllI >> lIlIIIllIIllIl[6] & lIlIIIllIIllIl[1];
      int lllllllllllllIIIlIIllIIIIlllIIIl = lllllllllllllIIIlIIllIIIIlllIllI & lIlIIIllIIllIl[1];
      String lllllllllllllIIIlIIllIIIIllllIll = String.valueOf((new StringBuilder()).append(Minecraft.debugFPS).append(lIlIIIllIIllII[lIlIIIllIIllIl[2]]));
      Minecraft var11 = lllllllllllllIIIlIIllIIIIllllIIl.mc;
      "".length();
      int lllllllllllllIIIlIIllIIIIllllIlI = Minecraft.fontRendererObj.getStringWidth(lllllllllllllIIIlIIllIIIIllllIll);
      Minecraft var10001 = lllllllllllllIIIlIIllIIIIllllIIl.mc;
      "".length();
      FontRenderer var10002 = Minecraft.fontRendererObj;
      int var10004 = lllllllllllllIIIlIIllIIIlIIIIIll + lllllllllllllIIIlIIllIIIIllllIIl.xOffset + lIlIIIllIIllIl[4];
      int var10005 = lllllllllllllIIIlIIllIIIIlllIlll + lllllllllllllIIIlIIllIIIIllllIIl.yOffset + lIlIIIllIIllIl[7];
      Object var10006 = lIlIIIllIIllIl[8];
      double var10007 = (double)lllllllllllllIIIlIIllIIIIlllIIll;
      "".length();
      var10007 += (int)(lllllllllllllIIIlIIllIIIIllllIIl * textBrightness) << lIlIIIllIIllIl[4];
      double var10008 = (double)lllllllllllllIIIlIIllIIIIlllIIlI;
      "".length();
      var10008 += (int)(lllllllllllllIIIlIIllIIIIllllIIl * textBrightness) << lIlIIIllIIllIl[6];
      double var10009 = (double)lllllllllllllIIIlIIllIIIIlllIIIl;
      "".length();
      var10005.drawString((String)var10006, (int)var10007, (int)var10008, (int)(var10009 + (int)(lllllllllllllIIIlIIllIIIIllllIIl * textBrightness)));
      "".length();
      GL11.glScalef(0.5F, 0.5F, 0.5F);
      GL11.glScalef(2.0F, 2.0F, 2.0F);
   }

   static {
      llllIIIllllllll();
      llllIIIlllllllI();
      String[] var10000 = new String[lIlIIIllIIllIl[9]];
      var10000[lIlIIIllIIllIl[2]] = lIlIIIllIIllII[lIlIIIllIIllIl[0]];
      var10000[lIlIIIllIIllIl[0]] = lIlIIIllIIllII[lIlIIIllIIllIl[9]];
      BUTTONS = var10000;
   }

   private static String llllIIIllllllII(String lllllllllllllIIIlIIllIIIIllIIIIl, String lllllllllllllIIIlIIllIIIIllIIIII) {
      try {
         SecretKeySpec lllllllllllllIIIlIIllIIIIllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIllIIIIllIIIII.getBytes(StandardCharsets.UTF_8)), lIlIIIllIIllIl[6]), "DES");
         Cipher lllllllllllllIIIlIIllIIIIlIlllII = Cipher.getInstance("DES");
         lllllllllllllIIIlIIllIIIIlIlllII.init(lIlIIIllIIllIl[9], lllllllllllllIIIlIIllIIIIllIIlII);
         return new String(lllllllllllllIIIlIIllIIIIlIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIllIIIIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }
}
