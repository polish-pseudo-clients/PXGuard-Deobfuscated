package xyz.pxguard.files.mods;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

public class Space {

   private int color;
   private boolean wasPressed;
   private static final int[] lIIllllIIIIIlI;
   private final KeyBinding key;
   private long lastPress;
   private final Minecraft mc = Minecraft.getMinecraft();
   private final int yOffset;
   private final int xOffset;
   private static final String[] lIIllllIIIIIIl;
   private double textBrightness;


   private static String lllIlIllIlIlIIl(String lllllllllllllIIIllIlIIlIlllllllI, String lllllllllllllIIIllIlIIllIIIIIIlI) {
      lllllllllllllIIIllIlIIlIlllllllI = new String(Base64.getDecoder().decode(lllllllllllllIIIllIlIIlIlllllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllIIIllIlIIllIIIIIIIl = new StringBuilder();
      char[] lllllllllllllIIIllIlIIllIIIIIIII = lllllllllllllIIIllIlIIllIIIIIIlI.toCharArray();
      int lllllllllllllIIIllIlIIlIllllllll = lIIllllIIIIIlI[2];
      char[] lllllllllllllIIIllIlIIlIlllllIIl = lllllllllllllIIIllIlIIlIlllllllI.toCharArray();
      int lllllllllllllIIIllIlIIlIlllllIII = lllllllllllllIIIllIlIIlIlllllIIl.length;
      int lllllllllllllIIIllIlIIlIllllIlll = lIIllllIIIIIlI[2];

      do {
         if(!lllIlIllIlIlllI(lllllllllllllIIIllIlIIlIllllIlll, lllllllllllllIIIllIlIIlIlllllIII)) {
            return String.valueOf(lllllllllllllIIIllIlIIllIIIIIIIl);
         }

         char lllllllllllllIIIllIlIIlIllllIllI = lllllllllllllIIIllIlIIlIlllllIIl[lllllllllllllIIIllIlIIlIllllIlll];
         lllllllllllllIIIllIlIIllIIIIIIIl.append((char)(lllllllllllllIIIllIlIIlIllllIllI ^ lllllllllllllIIIllIlIIllIIIIIIII[lllllllllllllIIIllIlIIlIllllllll % lllllllllllllIIIllIlIIllIIIIIIII.length]));
         "".length();
         ++lllllllllllllIIIllIlIIlIllllllll;
         ++lllllllllllllIIIllIlIIlIllllIlll;
         "".length();
      } while(-(133 ^ 129) < 0);

      return null;
   }

   public void renderSpaceKey(int lllllllllllllIIIllIlIIllIIIlIllI, int lllllllllllllIIIllIlIIllIIIlllll, int lllllllllllllIIIllIlIIllIIIlIlII) {
      byte lllllllllllllIIIllIlIIllIIIlllIl = lllllllllllllIIIllIlIIllIIlIIIIl.key.isKeyDown();
      String lllllllllllllIIIllIlIIllIIIlllII = Keyboard.getKeyName(lllllllllllllIIIllIlIIllIIlIIIIl.key.getKeyCode());
      String lllllllllllllIIIllIlIIllIIIlIIIl = lIIllllIIIIIIl[lIIllllIIIIIlI[2]];
      if(lllIlIllIlIllII(lllllllllllllIIIllIlIIllIIIlllIl, lllllllllllllIIIllIlIIllIIlIIIIl.wasPressed)) {
         lllllllllllllIIIllIlIIllIIlIIIIl.wasPressed = (boolean)lllllllllllllIIIllIlIIllIIIlllIl;
         lllllllllllllIIIllIlIIllIIlIIIIl.lastPress = System.currentTimeMillis();
      }

      if(lllIlIllIlIllIl(lllllllllllllIIIllIlIIllIIIlllIl)) {
         lllllllllllllIIIllIlIIllIIlIIIIl.color = Math.min(lIIllllIIIIIlI[1], (int)(2L * (System.currentTimeMillis() - lllllllllllllIIIllIlIIllIIlIIIIl.lastPress)));
         lllllllllllllIIIllIlIIllIIlIIIIl.textBrightness = Math.max(0.0D, 1.0D - (double)(System.currentTimeMillis() - lllllllllllllIIIllIlIIllIIlIIIIl.lastPress) / 20.0D);
         "".length();
         if("   ".length() <= 0) {
            return;
         }
      } else {
         lllllllllllllIIIllIlIIllIIlIIIIl.color = Math.max(lIIllllIIIIIlI[2], lIIllllIIIIIlI[1] - (int)(2L * (System.currentTimeMillis() - lllllllllllllIIIllIlIIllIIlIIIIl.lastPress)));
         lllllllllllllIIIllIlIIllIIlIIIIl.textBrightness = Math.min(1.0D, (double)(System.currentTimeMillis() - lllllllllllllIIIllIlIIllIIlIIIIl.lastPress) / 20.0D);
      }

      Gui.drawRect(lllllllllllllIIIllIlIIllIIIlIllI + lllllllllllllIIIllIlIIllIIlIIIIl.xOffset, lllllllllllllIIIllIlIIllIIIlllll + lllllllllllllIIIllIlIIllIIlIIIIl.yOffset, lllllllllllllIIIllIlIIllIIIlIllI + lllllllllllllIIIllIlIIllIIlIIIIl.xOffset + lIIllllIIIIIlI[3], lllllllllllllIIIllIlIIllIIIlllll + lllllllllllllIIIllIlIIllIIlIIIIl.yOffset + lIIllllIIIIIlI[4], lIIllllIIIIIlI[5] + (lllllllllllllIIIllIlIIllIIlIIIIl.color << lIIllllIIIIIlI[6]) + (lllllllllllllIIIllIlIIllIIlIIIIl.color << lIIllllIIIIIlI[7]) + lllllllllllllIIIllIlIIllIIlIIIIl.color);
      int lllllllllllllIIIllIlIIllIIIlIIII = lllllllllllllIIIllIlIIllIIIlIlII >> lIIllllIIIIIlI[6] & lIIllllIIIIIlI[1];
      int lllllllllllllIIIllIlIIllIIIIllll = lllllllllllllIIIllIlIIllIIIlIlII >> lIIllllIIIIIlI[7] & lIIllllIIIIIlI[1];
      int lllllllllllllIIIllIlIIllIIIIlllI = lllllllllllllIIIllIlIIllIIIlIlII & lIIllllIIIIIlI[1];
      Minecraft var10000 = lllllllllllllIIIllIlIIllIIlIIIIl.mc;
      "".length();
      Minecraft.fontRendererObj.drawString(lIIllllIIIIIIl[lIIllllIIIIIlI[0]], lllllllllllllIIIllIlIIllIIIlIllI + lllllllllllllIIIllIlIIllIIlIIIIl.xOffset + lIIllllIIIIIlI[7], lllllllllllllIIIllIlIIllIIIlllll + lllllllllllllIIIllIlIIllIIlIIIIl.yOffset + lIIllllIIIIIlI[8], lIIllllIIIIIlI[9] + ((int)((double)lllllllllllllIIIllIlIIllIIIlIIII * lllllllllllllIIIllIlIIllIIlIIIIl.textBrightness) << lIIllllIIIIIlI[6]) + ((int)((double)lllllllllllllIIIllIlIIllIIIIllll * lllllllllllllIIIllIlIIllIIlIIIIl.textBrightness) << lIIllllIIIIIlI[7]) + (int)((double)lllllllllllllIIIllIlIIllIIIIlllI * lllllllllllllIIIllIlIIllIIlIIIIl.textBrightness));
      "".length();
   }

   private static boolean lllIlIllIlIllII(int lllllllllllllIIIllIlIIlIlllIllIl, int lllllllllllllIIIllIlIIlIlllIllII) {
      return lllllllllllllIIIllIlIIlIlllIllIl != lllllllllllllIIIllIlIIlIlllIllII;
   }

   public Space(KeyBinding lllllllllllllIIIllIlIIllIIlIlllI, int lllllllllllllIIIllIlIIllIIllIIIl, int lllllllllllllIIIllIlIIllIIllIIII) {
      lllllllllllllIIIllIlIIllIIllIIll.wasPressed = (boolean)lIIllllIIIIIlI[0];
      lllllllllllllIIIllIlIIllIIllIIll.lastPress = 0L;
      lllllllllllllIIIllIlIIllIIllIIll.color = lIIllllIIIIIlI[1];
      lllllllllllllIIIllIlIIllIIllIIll.textBrightness = 1.0D;
      lllllllllllllIIIllIlIIllIIllIIll.key = lllllllllllllIIIllIlIIllIIlIlllI;
      lllllllllllllIIIllIlIIllIIllIIll.xOffset = lllllllllllllIIIllIlIIllIIllIIIl;
      lllllllllllllIIIllIlIIllIIllIIll.yOffset = lllllllllllllIIIllIlIIllIIllIIII;
   }

   static {
      lllIlIllIlIlIll();
      lllIlIllIlIlIlI();
   }

   private static void lllIlIllIlIlIll() {
      lIIllllIIIIIlI = new int[10];
      lIIllllIIIIIlI[0] = " ".length();
      lIIllllIIIIIlI[1] = 103 + 240 - 256 + 168;
      lIIllllIIIIIlI[2] = (66 ^ 79) & ~(3 ^ 14);
      lIIllllIIIIIlI[3] = 24 + 80 - 41 + 142 ^ 110 + 90 - 101 + 40;
      lIIllllIIIIIlI[4] = 100 ^ 111;
      lIIllllIIIIIlI[5] = -11985 & 2013277904;
      lIIllllIIIIIlI[6] = 141 ^ 157;
      lIIllllIIIIIlI[7] = 129 + 17 - -25 + 30 ^ 163 + 151 - 281 + 160;
      lIIllllIIIIIlI[8] = "  ".length();
      lIIllllIIIIIlI[9] = -(-(-16969 & 32763) & -581 & 16793590);
   }

   private static boolean lllIlIllIlIllIl(int lllllllllllllIIIllIlIIlIllllIIII) {
      return lllllllllllllIIIllIlIIlIllllIIII != 0;
   }

   private static void lllIlIllIlIlIlI() {
      lIIllllIIIIIIl = new String[lIIllllIIIIIlI[8]];
      lIIllllIIIIIIl[lIIllllIIIIIlI[2]] = lllIlIllIlIlIIl("wovDswlIe2R5SUh7ZA==", "ITdeV");
      lIIllllIIIIIIl[lIIllllIIIIIlI[0]] = lllIlIllIlIlIIl("wqzDvz9MQkN1f0xCQw==", "nXRao");
   }

   private static boolean lllIlIllIlIlllI(int lllllllllllllIIIllIlIIlIllllIIll, int lllllllllllllIIIllIlIIlIllllIIlI) {
      return lllllllllllllIIIllIlIIlIllllIIll < lllllllllllllIIIllIlIIlIllllIIlI;
   }
}
