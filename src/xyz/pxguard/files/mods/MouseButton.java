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

public class MouseButton {

   private static final int[] lIlIlIlIlIIlI;
   private final int yOffset;
   private static final String[] BUTTONS;
   private final int button;
   private final int xOffset;
   private final Minecraft mc = Minecraft.getMinecraft();
   private static final String[] lIlIlIlIIlIlI;
   private final List clicks = new ArrayList();
   private long lastPress;
   private double textBrightness;
   private boolean wasPressed;
   private int color;


   private int getCPS() {
      Object llllllllllllllIIIlIllIlllIIIllII = System.currentTimeMillis();
      llllllllllllllIIIlIllIlllIIIlIll.clicks.removeIf((Predicate)llllllllllllllIIIlIllIlllIIIllII);
      "".length();
      return llllllllllllllIIIlIllIlllIIIlIll.clicks.size();
   }

   private static String llllllIIIlllIl(String llllllllllllllIIIlIllIllIlIllIIl, String llllllllllllllIIIlIllIllIlIllIlI) {
      try {
         SecretKeySpec llllllllllllllIIIlIllIllIlIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIIIlIllIllIlIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher llllllllllllllIIIlIllIllIlIlIllI = Cipher.getInstance("Blowfish");
         llllllllllllllIIIlIllIllIlIlIllI.init(lIlIlIlIlIIlI[9], llllllllllllllIIIlIllIllIlIllllI);
         return new String(llllllllllllllIIIlIllIllIlIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIIIlIllIllIlIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static boolean llllllIIllIlII(int llllllllllllllIIIlIllIllIlIIIlll) {
      return llllllllllllllIIIlIllIllIlIIIlll != 0;
   }

   private static void llllllIIlIlIIl() {
      lIlIlIlIIlIlI = new String[lIlIlIlIlIIlI[10]];
      lIlIlIlIIlIlI[lIlIlIlIlIIlI[2]] = llllllIIIlllIl("ACmz/pdJTHY=", "JTgYU");
      lIlIlIlIIlIlI[lIlIlIlIlIIlI[0]] = llllllIIlIIlll("PD/VpYxtzu0=", "ciSzF");
      lIlIlIlIIlIlI[lIlIlIlIlIIlI[9]] = llllllIIIlllIl("I+7xkuQZJcY=", "iWMKv");
   }

   private static void llllllIIllIIlI() {
      lIlIlIlIlIIlI = new int[11];
      lIlIlIlIlIIlI[0] = " ".length();
      lIlIlIlIlIIlI[1] = 215 + 19 - 83 + 104;
      lIlIlIlIlIIlI[2] = (179 ^ 139) & ~(2 ^ 58);
      lIlIlIlIlIIlI[3] = 5 + 129 - 38 + 68 ^ 121 + 131 - 152 + 34;
      lIlIlIlIlIIlI[4] = 114 + 51 - 126 + 117 ^ 13 + 45 - 7 + 87;
      lIlIlIlIlIIlI[5] = -(-22401 & 32738) & -4101 & 2013280357;
      lIlIlIlIlIIlI[6] = 110 ^ 126;
      lIlIlIlIlIIlI[7] = 35 + 104 - -55 + 11 ^ 149 + 84 - 143 + 107;
      lIlIlIlIlIIlI[8] = -(-25100 & 16802315);
      lIlIlIlIlIIlI[9] = "  ".length();
      lIlIlIlIlIIlI[10] = "   ".length();
   }

   private static String llllllIIlIIlll(String llllllllllllllIIIlIllIllIlIIllII, String llllllllllllllIIIlIllIllIlIIlIll) {
      try {
         SecretKeySpec llllllllllllllIIIlIllIllIlIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIIIlIllIllIlIIlIll.getBytes(StandardCharsets.UTF_8)), lIlIlIlIlIIlI[7]), "DES");
         Cipher llllllllllllllIIIlIllIllIlIlIIII = Cipher.getInstance("DES");
         llllllllllllllIIIlIllIllIlIlIIII.init(lIlIlIlIlIIlI[9], llllllllllllllIIIlIllIllIlIlIIIl);
         return new String(llllllllllllllIIIlIllIllIlIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIIIlIllIllIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static int llllllIIllIlIl(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L?0:(var4 < 0L?-1:1);
   }

   private static boolean llllllIIllIllI(int llllllllllllllIIIlIllIllIlIIIlIl) {
      return llllllllllllllIIIlIllIllIlIIIlIl < 0;
   }

   public MouseButton(int llllllllllllllIIIlIllIlllIIlIIlI, int llllllllllllllIIIlIllIlllIIlIIIl, int llllllllllllllIIIlIllIlllIIlIlII) {
      llllllllllllllIIIlIllIlllIIlIlll.wasPressed = (boolean)lIlIlIlIlIIlI[0];
      llllllllllllllIIIlIllIlllIIlIlll.lastPress = 0L;
      llllllllllllllIIIlIllIlllIIlIlll.color = lIlIlIlIlIIlI[1];
      llllllllllllllIIIlIllIlllIIlIlll.textBrightness = 1.0D;
      llllllllllllllIIIlIllIlllIIlIlll.button = llllllllllllllIIIlIllIlllIIlIIlI;
      llllllllllllllIIIlIllIlllIIlIlll.xOffset = llllllllllllllIIIlIllIlllIIlIIIl;
      llllllllllllllIIIlIllIlllIIlIlll.yOffset = llllllllllllllIIIlIllIlllIIlIlII;
   }

   public void renderMouseButton(int llllllllllllllIIIlIllIllIlllIIlI, int llllllllllllllIIIlIllIllIlllIIIl, int llllllllllllllIIIlIllIllIlllIIII) {
      byte llllllllllllllIIIlIllIllIllIllll = Mouse.isButtonDown(llllllllllllllIIIlIllIllIlllIIll.button);
      String llllllllllllllIIIlIllIllIllIlllI = BUTTONS[llllllllllllllIIIlIllIllIlllIIll.button];
      if(llllllIIllIIll(llllllllllllllIIIlIllIllIllIllll, llllllllllllllIIIlIllIllIlllIIll.wasPressed)) {
         llllllllllllllIIIlIllIllIlllIIll.wasPressed = (boolean)llllllllllllllIIIlIllIllIllIllll;
         llllllllllllllIIIlIllIllIlllIIll.lastPress = System.currentTimeMillis();
         if(llllllIIllIlII(llllllllllllllIIIlIllIllIllIllll)) {
            llllllllllllllIIIlIllIllIlllIIll.clicks.add(Long.valueOf(llllllllllllllIIIlIllIllIlllIIll.lastPress));
            "".length();
         }
      }

      if(llllllIIllIlII(llllllllllllllIIIlIllIllIllIllll)) {
         llllllllllllllIIIlIllIllIlllIIll.color = Math.min(lIlIlIlIlIIlI[1], (int)(2L * (System.currentTimeMillis() - llllllllllllllIIIlIllIllIlllIIll.lastPress)));
         llllllllllllllIIIlIllIllIlllIIll.textBrightness = Math.max(0.0D, 1.0D - (double)(System.currentTimeMillis() - llllllllllllllIIIlIllIllIlllIIll.lastPress) / 20.0D);
         "".length();
         if(" ".length() == "  ".length()) {
            return;
         }
      } else {
         llllllllllllllIIIlIllIllIlllIIll.color = Math.max(lIlIlIlIlIIlI[2], lIlIlIlIlIIlI[1] - (int)(2L * (System.currentTimeMillis() - llllllllllllllIIIlIllIllIlllIIll.lastPress)));
         llllllllllllllIIIlIllIllIlllIIll.textBrightness = Math.min(1.0D, (double)(System.currentTimeMillis() - llllllllllllllIIIlIllIllIlllIIll.lastPress) / 20.0D);
      }

      Gui.drawRect(llllllllllllllIIIlIllIllIlllIIlI + llllllllllllllIIIlIllIllIlllIIll.xOffset, llllllllllllllIIIlIllIllIlllIIIl + llllllllllllllIIIlIllIllIlllIIll.yOffset, llllllllllllllIIIlIllIllIlllIIlI + llllllllllllllIIIlIllIllIlllIIll.xOffset + lIlIlIlIlIIlI[3], llllllllllllllIIIlIllIllIlllIIIl + llllllllllllllIIIlIllIllIlllIIll.yOffset + lIlIlIlIlIIlI[4], lIlIlIlIlIIlI[5] + (llllllllllllllIIIlIllIllIlllIIll.color << lIlIlIlIlIIlI[6]) + (llllllllllllllIIIlIllIllIlllIIll.color << lIlIlIlIlIIlI[7]) + llllllllllllllIIIlIllIllIlllIIll.color);
      int llllllllllllllIIIlIllIllIllIllIl = llllllllllllllIIIlIllIllIlllIIII >> lIlIlIlIlIIlI[6] & lIlIlIlIlIIlI[1];
      int llllllllllllllIIIlIllIllIlllIlll = llllllllllllllIIIlIllIllIlllIIII >> lIlIlIlIlIIlI[7] & lIlIlIlIlIIlI[1];
      int llllllllllllllIIIlIllIllIlllIllI = llllllllllllllIIIlIllIllIlllIIII & lIlIlIlIlIIlI[1];
      Minecraft var10000 = llllllllllllllIIIlIllIllIlllIIll.mc;
      "".length();
      Minecraft.fontRendererObj.drawString(llllllllllllllIIIlIllIllIllIlllI, llllllllllllllIIIlIllIllIlllIIlI + llllllllllllllIIIlIllIllIlllIIll.xOffset + lIlIlIlIlIIlI[7], llllllllllllllIIIlIllIllIlllIIIl + llllllllllllllIIIlIllIllIlllIIll.yOffset + lIlIlIlIlIIlI[7], lIlIlIlIlIIlI[8] + ((int)((double)llllllllllllllIIIlIllIllIllIllIl * llllllllllllllIIIlIllIllIlllIIll.textBrightness) << lIlIlIlIlIIlI[6]) + ((int)((double)llllllllllllllIIIlIllIllIlllIlll * llllllllllllllIIIlIllIllIlllIIll.textBrightness) << lIlIlIlIlIIlI[7]) + (int)((double)llllllllllllllIIIlIllIllIlllIllI * llllllllllllllIIIlIllIllIlllIIll.textBrightness));
      "".length();
      String llllllllllllllIIIlIllIllIlllIlIl = String.valueOf((new StringBuilder()).append(llllllllllllllIIIlIllIllIlllIIll.getCPS()).append(lIlIlIlIIlIlI[lIlIlIlIlIIlI[2]]));
      Minecraft var10002 = llllllllllllllIIIlIllIllIlllIIll.mc;
      "".length();
      int llllllllllllllIIIlIllIllIlllIlII = Minecraft.fontRendererObj.getStringWidth(llllllllllllllIIIlIllIllIlllIlIl);
      GL11.glScalef(0.5F, 0.5F, 0.5F);
      GL11.glScalef(2.0F, 2.0F, 2.0F);
   }

   private static boolean lambda$getCPS$0(long llllllllllllllIIIlIllIllIllIIllI, Long llllllllllllllIIIlIllIllIllIIlIl) {
      int var10000;
      if(llllllIIllIllI(llllllIIllIlIl(llllllllllllllIIIlIllIllIllIIlIl.longValue() + 1000L, llllllllllllllIIIlIllIllIllIIllI))) {
         var10000 = lIlIlIlIlIIlI[0];
         "".length();
         if("  ".length() <= " ".length()) {
            return (boolean)((95 ^ 65) & ~(190 ^ 160));
         }
      } else {
         var10000 = lIlIlIlIlIIlI[2];
      }

      return (boolean)var10000;
   }

   private static boolean llllllIIllIIll(int llllllllllllllIIIlIllIllIlIIIIlI, int llllllllllllllIIIlIllIllIlIIIIIl) {
      return llllllllllllllIIIlIllIllIlIIIIlI != llllllllllllllIIIlIllIllIlIIIIIl;
   }

   static {
      llllllIIllIIlI();
      llllllIIlIlIIl();
      String[] var10000 = new String[lIlIlIlIlIIlI[9]];
      var10000[lIlIlIlIlIIlI[2]] = lIlIlIlIIlIlI[lIlIlIlIlIIlI[0]];
      var10000[lIlIlIlIlIIlI[0]] = lIlIlIlIIlIlI[lIlIlIlIlIIlI[9]];
      BUTTONS = var10000;
   }
}
