package xyz.pxguard.files.mods;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

public class Key {

   private double textBrightness;
   private final int yOffset;
   private final int xOffset;
   private long lastPress;
   private static final int[] llIIlIIIlIlIl;
   private final KeyBinding key;
   private boolean wasPressed;
   private final Minecraft mc = Minecraft.getMinecraft();
   private int color;


   private static boolean lIIlIllIIIlIlIl(int lllllllllllllIlllIIlIIIllIllIllI) {
      return lllllllllllllIlllIIlIIIllIllIllI != 0;
   }

   public void renderKey(int lllllllllllllIlllIIlIIIllIllllll, int lllllllllllllIlllIIlIIIlllIIIlll, int lllllllllllllIlllIIlIIIlllIIIllI) {
      byte lllllllllllllIlllIIlIIIlllIIIlIl = lllllllllllllIlllIIlIIIlllIIIIII.key.isKeyDown();
      String lllllllllllllIlllIIlIIIlllIIIlII = Keyboard.getKeyName(lllllllllllllIlllIIlIIIlllIIIIII.key.getKeyCode());
      if(lIIlIllIIIlIlII(lllllllllllllIlllIIlIIIlllIIIlIl, lllllllllllllIlllIIlIIIlllIIIIII.wasPressed)) {
         lllllllllllllIlllIIlIIIlllIIIIII.wasPressed = (boolean)lllllllllllllIlllIIlIIIlllIIIlIl;
         lllllllllllllIlllIIlIIIlllIIIIII.lastPress = System.currentTimeMillis();
      }

      if(lIIlIllIIIlIlIl(lllllllllllllIlllIIlIIIlllIIIlIl)) {
         lllllllllllllIlllIIlIIIlllIIIIII.color = Math.min(llIIlIIIlIlIl[1], (int)(2L * (System.currentTimeMillis() - lllllllllllllIlllIIlIIIlllIIIIII.lastPress)));
         lllllllllllllIlllIIlIIIlllIIIIII.textBrightness = Math.max(0.0D, 1.0D - (double)(System.currentTimeMillis() - lllllllllllllIlllIIlIIIlllIIIIII.lastPress) / 20.0D);
         "".length();
         if(-"   ".length() >= 0) {
            return;
         }
      } else {
         lllllllllllllIlllIIlIIIlllIIIIII.color = Math.max(llIIlIIIlIlIl[2], llIIlIIIlIlIl[1] - (int)(2L * (System.currentTimeMillis() - lllllllllllllIlllIIlIIIlllIIIIII.lastPress)));
         lllllllllllllIlllIIlIIIlllIIIIII.textBrightness = Math.min(1.0D, (double)(System.currentTimeMillis() - lllllllllllllIlllIIlIIIlllIIIIII.lastPress) / 20.0D);
      }

      Gui.drawRect(lllllllllllllIlllIIlIIIllIllllll + lllllllllllllIlllIIlIIIlllIIIIII.xOffset, lllllllllllllIlllIIlIIIlllIIIlll + lllllllllllllIlllIIlIIIlllIIIIII.yOffset, lllllllllllllIlllIIlIIIllIllllll + lllllllllllllIlllIIlIIIlllIIIIII.xOffset + llIIlIIIlIlIl[3], lllllllllllllIlllIIlIIIlllIIIlll + lllllllllllllIlllIIlIIIlllIIIIII.yOffset + llIIlIIIlIlIl[3], llIIlIIIlIlIl[4] + (lllllllllllllIlllIIlIIIlllIIIIII.color << llIIlIIIlIlIl[5]) + (lllllllllllllIlllIIlIIIlllIIIIII.color << llIIlIIIlIlIl[6]) + lllllllllllllIlllIIlIIIlllIIIIII.color);
      int lllllllllllllIlllIIlIIIlllIIIIll = lllllllllllllIlllIIlIIIlllIIIllI >> llIIlIIIlIlIl[5] & llIIlIIIlIlIl[1];
      int lllllllllllllIlllIIlIIIllIlllIIl = lllllllllllllIlllIIlIIIlllIIIllI >> llIIlIIIlIlIl[6] & llIIlIIIlIlIl[1];
      int lllllllllllllIlllIIlIIIlllIIIIIl = lllllllllllllIlllIIlIIIlllIIIllI & llIIlIIIlIlIl[1];
      Minecraft var10000 = lllllllllllllIlllIIlIIIlllIIIIII.mc;
      "".length();
      Minecraft.fontRendererObj.drawString(lllllllllllllIlllIIlIIIlllIIIlII, lllllllllllllIlllIIlIIIllIllllll + lllllllllllllIlllIIlIIIlllIIIIII.xOffset + llIIlIIIlIlIl[6], lllllllllllllIlllIIlIIIlllIIIlll + lllllllllllllIlllIIlIIIlllIIIIII.yOffset + llIIlIIIlIlIl[6], llIIlIIIlIlIl[7] + ((int)((double)lllllllllllllIlllIIlIIIlllIIIIll * lllllllllllllIlllIIlIIIlllIIIIII.textBrightness) << llIIlIIIlIlIl[5]) + ((int)((double)lllllllllllllIlllIIlIIIllIlllIIl * lllllllllllllIlllIIlIIIlllIIIIII.textBrightness) << llIIlIIIlIlIl[6]) + (int)((double)lllllllllllllIlllIIlIIIlllIIIIIl * lllllllllllllIlllIIlIIIlllIIIIII.textBrightness));
      "".length();
   }

   private static void lIIlIllIIIlIIll() {
      llIIlIIIlIlIl = new int[8];
      llIIlIIIlIlIl[0] = " ".length();
      llIIlIIIlIlIl[1] = 241 + 94 - 111 + 31;
      llIIlIIIlIlIl[2] = (6 ^ 46 ^ 131 ^ 188) & (151 + 13 - 93 + 108 ^ 73 + 43 - 36 + 84 ^ -" ".length());
      llIIlIIIlIlIl[3] = 156 ^ 138;
      llIIlIIIlIlIl[4] = -(-6 & 20429) & -41 & 2013286383;
      llIIlIIIlIlIl[5] = 164 ^ 153 ^ 4 ^ 41;
      llIIlIIIlIlIl[6] = 70 ^ 78;
      llIIlIIIlIlIl[7] = -(-(-10881 & 32763) & -10882 & 16809979);
   }

   static {
      lIIlIllIIIlIIll();
   }

   public Key(KeyBinding lllllllllllllIlllIIlIIIlllIllIIl, int lllllllllllllIlllIIlIIIlllIlIlII, int lllllllllllllIlllIIlIIIlllIlIlll) {
      lllllllllllllIlllIIlIIIlllIlIllI.wasPressed = (boolean)llIIlIIIlIlIl[0];
      lllllllllllllIlllIIlIIIlllIlIllI.lastPress = 0L;
      lllllllllllllIlllIIlIIIlllIlIllI.color = llIIlIIIlIlIl[1];
      lllllllllllllIlllIIlIIIlllIlIllI.textBrightness = 1.0D;
      lllllllllllllIlllIIlIIIlllIlIllI.key = lllllllllllllIlllIIlIIIlllIllIIl;
      lllllllllllllIlllIIlIIIlllIlIllI.xOffset = lllllllllllllIlllIIlIIIlllIlIlII;
      lllllllllllllIlllIIlIIIlllIlIllI.yOffset = lllllllllllllIlllIIlIIIlllIlIlll;
   }

   private static boolean lIIlIllIIIlIlII(int lllllllllllllIlllIIlIIIllIllIIll, int lllllllllllllIlllIIlIIIllIllIIlI) {
      return lllllllllllllIlllIIlIIIllIllIIll != lllllllllllllIlllIIlIIIllIllIIlI;
   }
}
