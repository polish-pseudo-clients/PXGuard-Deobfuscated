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
import net.minecraft.client.gui.Gui;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class CPS {

   private final int xOffset;
   private final int button;
   private int color;
   private long lastPress;
   private boolean wasPressed;
   private static final String[] llllIIIllIlll;
   private static final String[] BUTTONS;
   private static final int[] llllIIIlllIII;
   private final int yOffset;
   private final Minecraft mc = Minecraft.getMinecraft();
   private double textBrightness;
   private final List clicks = new ArrayList();


   private int getCPS() {
      Object lllllllllllllIlIlIlIIIlIlIlIlIlI = System.currentTimeMillis();
      lllllllllllllIlIlIlIIIlIlIlIlIIl.clicks.removeIf((Predicate)lllllllllllllIlIlIlIIIlIlIlIlIlI);
      "".length();
      return lllllllllllllIlIlIlIIIlIlIlIlIIl.clicks.size();
   }

   private static String lIllIlIIIIllIII(String lllllllllllllIlIlIlIIIlIIllIIIIl, String lllllllllllllIlIlIlIIIlIIlIllllI) {
      try {
         SecretKeySpec lllllllllllllIlIlIlIIIlIIllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIIIlIIlIllllI.getBytes(StandardCharsets.UTF_8)), llllIIIlllIII[6]), "DES");
         Cipher lllllllllllllIlIlIlIIIlIIllIIIll = Cipher.getInstance("DES");
         lllllllllllllIlIlIlIIIlIIllIIIll.init(llllIIIlllIII[9], lllllllllllllIlIlIlIIIlIIllIIlII);
         return new String(lllllllllllllIlIlIlIIIlIIllIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIIIlIIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lambda$getCPS$0(long lllllllllllllIlIlIlIIIlIlIIIIIlI, Long lllllllllllllIlIlIlIIIlIlIIIIIll) {
      int var10000;
      if(lIllIlIIIIlllll(lIllIlIIIIllllI(lllllllllllllIlIlIlIIIlIlIIIIIll.longValue() + 1000L, lllllllllllllIlIlIlIIIlIlIIIIIlI))) {
         var10000 = llllIIIlllIII[0];
         "".length();
         if(((103 + 109 - 69 + 111 ^ 124 + 165 - 273 + 169) & (216 + 49 - 33 + 1 ^ 75 + 98 - 162 + 163 ^ -" ".length())) >= (69 ^ 102 ^ 109 ^ 74)) {
            return (boolean)((86 + 35 - 16 + 43 ^ 29 + 115 - 50 + 38) & (8 ^ 103 ^ 42 + 87 - 7 + 5 ^ -" ".length()));
         }
      } else {
         var10000 = llllIIIlllIII[2];
      }

      return (boolean)var10000;
   }

   public CPS(int lllllllllllllIlIlIlIIIlIlIllIlII, int lllllllllllllIlIlIlIIIlIlIlIllll, int lllllllllllllIlIlIlIIIlIlIlIlllI) {
      lllllllllllllIlIlIlIIIlIlIllIlIl.wasPressed = (boolean)llllIIIlllIII[0];
      lllllllllllllIlIlIlIIIlIlIllIlIl.lastPress = 0L;
      lllllllllllllIlIlIlIIIlIlIllIlIl.color = llllIIIlllIII[1];
      lllllllllllllIlIlIlIIIlIlIllIlIl.textBrightness = 1.0D;
      lllllllllllllIlIlIlIIIlIlIllIlIl.button = lllllllllllllIlIlIlIIIlIlIllIlII;
      lllllllllllllIlIlIlIIIlIlIllIlIl.xOffset = lllllllllllllIlIlIlIIIlIlIlIllll;
      lllllllllllllIlIlIlIIIlIlIllIlIl.yOffset = lllllllllllllIlIlIlIIIlIlIlIlllI;
   }

   private static boolean lIllIlIIIlIIIII(int lllllllllllllIlIlIlIIIlIIlIllIIl, int lllllllllllllIlIlIlIIIlIIlIllIII) {
      return lllllllllllllIlIlIlIIIlIIlIllIIl < lllllllllllllIlIlIlIIIlIIlIllIII;
   }

   public void renderCPS(int lllllllllllllIlIlIlIIIlIlIIlIIII, int lllllllllllllIlIlIlIIIlIlIIIllll, int lllllllllllllIlIlIlIIIlIlIIllIIl) {
      byte lllllllllllllIlIlIlIIIlIlIIllIII = Mouse.isButtonDown(lllllllllllllIlIlIlIIIlIlIIlIIIl.button);
      String var10000 = BUTTONS[lllllllllllllIlIlIlIIIlIlIIlIIIl.button];
      if(lIllIlIIIIlllII(lllllllllllllIlIlIlIIIlIlIIllIII, lllllllllllllIlIlIlIIIlIlIIlIIIl.wasPressed)) {
         lllllllllllllIlIlIlIIIlIlIIlIIIl.wasPressed = (boolean)lllllllllllllIlIlIlIIIlIlIIllIII;
         lllllllllllllIlIlIlIIIlIlIIlIIIl.lastPress = System.currentTimeMillis();
         if(lIllIlIIIIlllIl(lllllllllllllIlIlIlIIIlIlIIllIII)) {
            lllllllllllllIlIlIlIIIlIlIIlIIIl.clicks.add(Long.valueOf(lllllllllllllIlIlIlIIIlIlIIlIIIl.lastPress));
            "".length();
         }
      }

      if(lIllIlIIIIlllIl(lllllllllllllIlIlIlIIIlIlIIllIII)) {
         lllllllllllllIlIlIlIIIlIlIIlIIIl.color = llllIIIlllIII[2];
         "".length();
         if("   ".length() <= 0) {
            return;
         }
      } else {
         lllllllllllllIlIlIlIIIlIlIIlIIIl.color = llllIIIlllIII[2];
      }

      Gui.drawRect(lllllllllllllIlIlIlIIIlIlIIlIIII + lllllllllllllIlIlIlIIIlIlIIlIIIl.xOffset, lllllllllllllIlIlIlIIIlIlIIIllll + lllllllllllllIlIlIlIIIlIlIIlIIIl.yOffset, lllllllllllllIlIlIlIIIlIlIIlIIII + lllllllllllllIlIlIlIIIlIlIIlIIIl.xOffset + llllIIIlllIII[3], lllllllllllllIlIlIlIIIlIlIIIllll + lllllllllllllIlIlIlIIIlIlIIlIIIl.yOffset + llllIIIlllIII[4], llllIIIlllIII[5] + (lllllllllllllIlIlIlIIIlIlIIlIIIl.color << llllIIIlllIII[4]) + (lllllllllllllIlIlIlIIIlIlIIlIIIl.color << llllIIIlllIII[6]) + lllllllllllllIlIlIlIIIlIlIIlIIIl.color);
      int lllllllllllllIlIlIlIIIlIlIIlIllI = lllllllllllllIlIlIlIIIlIlIIllIIl >> llllIIIlllIII[4] & llllIIIlllIII[1];
      int lllllllllllllIlIlIlIIIlIlIIlIlIl = lllllllllllllIlIlIlIIIlIlIIllIIl >> llllIIIlllIII[6] & llllIIIlllIII[1];
      int lllllllllllllIlIlIlIIIlIlIIIlIIl = lllllllllllllIlIlIlIIIlIlIIllIIl & llllIIIlllIII[1];
      String lllllllllllllIlIlIlIIIlIlIIlIIll = String.valueOf((new StringBuilder()).append(lllllllllllllIlIlIlIIIlIlIIlIIIl.getCPS()).append(llllIIIllIlll[llllIIIlllIII[2]]));
      Minecraft var12 = lllllllllllllIlIlIlIIIlIlIIlIIIl.mc;
      "".length();
      int lllllllllllllIlIlIlIIIlIlIIlIIlI = Minecraft.fontRendererObj.getStringWidth(lllllllllllllIlIlIlIIIlIlIIlIIll);
      Minecraft var10001 = lllllllllllllIlIlIlIIIlIlIIlIIIl.mc;
      "".length();
      Minecraft.fontRendererObj.drawString(lllllllllllllIlIlIlIIIlIlIIlIIll, lllllllllllllIlIlIlIIIlIlIIlIIII + lllllllllllllIlIlIlIIIlIlIIlIIIl.xOffset + llllIIIlllIII[4], lllllllllllllIlIlIlIIIlIlIIIllll + lllllllllllllIlIlIlIIIlIlIIlIIIl.yOffset + llllIIIlllIII[7], llllIIIlllIII[8] + ((int)((double)lllllllllllllIlIlIlIIIlIlIIlIllI * lllllllllllllIlIlIlIIIlIlIIlIIIl.textBrightness) << llllIIIlllIII[4]) + ((int)((double)lllllllllllllIlIlIlIIIlIlIIlIlIl * lllllllllllllIlIlIlIIIlIlIIlIIIl.textBrightness) << llllIIIlllIII[6]) + (int)((double)lllllllllllllIlIlIlIIIlIlIIIlIIl * lllllllllllllIlIlIlIIIlIlIIlIIIl.textBrightness));
      "".length();
      GL11.glScalef(0.5F, 0.5F, 0.5F);
      GL11.glScalef(2.0F, 2.0F, 2.0F);
   }

   private static void lIllIlIIIIllIlI() {
      llllIIIllIlll = new String[llllIIIlllIII[10]];
      llllIIIllIlll[llllIIIlllIII[2]] = lIllIlIIIIllIII("sHc1V8y12v8=", "EIITl");
      llllIIIllIlll[llllIIIlllIII[0]] = lIllIlIIIIllIII("fHh321coFkk=", "gcLJr");
      llllIIIllIlll[llllIIIlllIII[9]] = lIllIlIIIIllIIl("PBsr", "nViLe");
   }

   private static boolean lIllIlIIIIlllll(int lllllllllllllIlIlIlIIIlIIlIlIlII) {
      return lllllllllllllIlIlIlIIIlIIlIlIlII < 0;
   }

   private static boolean lIllIlIIIIlllII(int lllllllllllllIlIlIlIIIlIIlIlIIIl, int lllllllllllllIlIlIlIIIlIIlIlIIII) {
      return lllllllllllllIlIlIlIIIlIIlIlIIIl != lllllllllllllIlIlIlIIIlIIlIlIIII;
   }

   private static boolean lIllIlIIIIlllIl(int lllllllllllllIlIlIlIIIlIIlIlIllI) {
      return lllllllllllllIlIlIlIIIlIIlIlIllI != 0;
   }

   static {
      lIllIlIIIIllIll();
      lIllIlIIIIllIlI();
      String[] var10000 = new String[llllIIIlllIII[9]];
      var10000[llllIIIlllIII[2]] = llllIIIllIlll[llllIIIlllIII[0]];
      var10000[llllIIIlllIII[0]] = llllIIIllIlll[llllIIIlllIII[9]];
      BUTTONS = var10000;
   }

   private static String lIllIlIIIIllIIl(String lllllllllllllIlIlIlIIIlIIlllIIIl, String lllllllllllllIlIlIlIIIlIIlllIIII) {
      lllllllllllllIlIlIlIIIlIIlllIIIl = new String(Base64.getDecoder().decode(lllllllllllllIlIlIlIIIlIIlllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllIlIlIlIIIlIIlllIlII = new StringBuilder();
      char[] lllllllllllllIlIlIlIIIlIIllIlllI = lllllllllllllIlIlIlIIIlIIlllIIII.toCharArray();
      int lllllllllllllIlIlIlIIIlIIllIllIl = llllIIIlllIII[2];
      char[] lllllllllllllIlIlIlIIIlIIllIllII = lllllllllllllIlIlIlIIIlIIlllIIIl.toCharArray();
      int lllllllllllllIlIlIlIIIlIIllIlIll = lllllllllllllIlIlIlIIIlIIllIllII.length;
      int lllllllllllllIlIlIlIIIlIIllIlIlI = llllIIIlllIII[2];

      do {
         if(!lIllIlIIIlIIIII(lllllllllllllIlIlIlIIIlIIllIlIlI, lllllllllllllIlIlIlIIIlIIllIlIll)) {
            return String.valueOf(lllllllllllllIlIlIlIIIlIIlllIlII);
         }

         char lllllllllllllIlIlIlIIIlIIlllIlll = lllllllllllllIlIlIlIIIlIIllIllII[lllllllllllllIlIlIlIIIlIIllIlIlI];
         lllllllllllllIlIlIlIIIlIIlllIlII.append((char)(lllllllllllllIlIlIlIIIlIIlllIlll ^ lllllllllllllIlIlIlIIIlIIllIlllI[lllllllllllllIlIlIlIIIlIIllIllIl % lllllllllllllIlIlIlIIIlIIllIlllI.length]));
         "".length();
         ++lllllllllllllIlIlIlIIIlIIllIllIl;
         ++lllllllllllllIlIlIlIIIlIIllIlIlI;
         "".length();
      } while("  ".length() >= 0);

      return null;
   }

   private static void lIllIlIIIIllIll() {
      llllIIIlllIII = new int[11];
      llllIIIlllIII[0] = " ".length();
      llllIIIlllIII[1] = 150 + 149 - 260 + 216;
      llllIIIlllIII[2] = (75 ^ 68 ^ 7 ^ 38) & (56 + 162 - 131 + 97 ^ 119 + 6 - 29 + 54 ^ -" ".length());
      llllIIIlllIII[3] = 105 ^ 91 ^ 10 ^ 126;
      llllIIIlllIII[4] = 24 ^ 8;
      llllIIIlllIII[5] = -(-16769 & 28159) & -16386 & 2013293695;
      llllIIIlllIII[6] = 51 ^ 90 ^ 238 ^ 143;
      llllIIIlllIII[7] = 22 ^ 18;
      llllIIIlllIII[8] = -(-(-12393 & 30703) & -12369 & 16807894);
      llllIIIlllIII[9] = "  ".length();
      llllIIIlllIII[10] = "   ".length();
   }

   private static int lIllIlIIIIllllI(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L?0:(var4 < 0L?-1:1);
   }
}
