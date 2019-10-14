package xyz.pxguard.files.mods;

import java.awt.Color;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import xyz.pxguard.files.mods.CPS;
import xyz.pxguard.files.mods.FPS;
import xyz.pxguard.files.mods.Key;
import xyz.pxguard.files.mods.MouseButton;
import xyz.pxguard.files.mods.Space;
import xyz.pxguard.files.modules.Modules;

public class Keystrokes {

   private final Space[] spaceKeys;
   private final Minecraft mc;
   private static final int[] COLORS;
   private final FPS[] fpsKeys;
   private final MouseButton[] mouseButtons;
   private final CPS[] cpsKeys;
   private static final int[] lIlIIlIllIlIll;
   private final Key[] movementKeys;
   public static int y;
   public static int x;
   private static ScaledResolution res;


   private void drawMouseButtons(int lllllllllllllIIIIlllIllIlllIIlII, int lllllllllllllIIIIlllIllIlllIIIll, int lllllllllllllIIIIlllIllIlllIIlll) {
      MouseButton[] lllllllllllllIIIIlllIllIlllIIIIl = lllllllllllllIIIIlllIllIlllIIlIl.mouseButtons;
      int lllllllllllllIIIIlllIllIlllIllII = lllllllllllllIIIIlllIllIlllIIlIl.mouseButtons.length;
      int lllllllllllllIIIIlllIllIllIlllll = lIlIIlIllIlIll[3];

      do {
         if(!llllIllIIIIIlIl(lllllllllllllIIIIlllIllIllIlllll, lllllllllllllIIIIlllIllIlllIllII)) {
            return;
         }

         MouseButton lllllllllllllIIIIlllIllIllIllllI = lllllllllllllIIIIlllIllIlllIIIIl[lllllllllllllIIIIlllIllIllIlllll];
         lllllllllllllIIIIlllIllIllIllllI.renderMouseButton(lllllllllllllIIIIlllIllIlllIIlII, lllllllllllllIIIIlllIllIlllIIIll, lllllllllllllIIIIlllIllIlllIIlll);
         ++lllllllllllllIIIIlllIllIllIlllll;
         "".length();
      } while(((56 ^ 27) & ~(106 ^ 73)) == 0);

   }

   static {
      llllIllIIIIIIll();
      x = lIlIIlIllIlIll[3];
      y = lIlIIlIllIlIll[3];
      int[] var10000 = new int[lIlIIlIllIlIll[12]];
      var10000[lIlIIlIllIlIll[3]] = lIlIIlIllIlIll[13];
      var10000[lIlIIlIllIlIll[2]] = lIlIIlIllIlIll[14];
      var10000[lIlIIlIllIlIll[1]] = lIlIIlIllIlIll[15];
      var10000[lIlIIlIllIlIll[5]] = lIlIIlIllIlIll[16];
      var10000[lIlIIlIllIlIll[0]] = lIlIIlIllIlIll[17];
      var10000[lIlIIlIllIlIll[18]] = lIlIIlIllIlIll[19];
      COLORS = var10000;
   }

   private void drawCPSKey(int lllllllllllllIIIIlllIlllIIIlIlII, int lllllllllllllIIIIlllIlllIIIlIIll, int lllllllllllllIIIIlllIlllIIIlIIlI) {
      CPS[] lllllllllllllIIIIlllIlllIIIlIllI = lllllllllllllIIIIlllIlllIIIlIlIl.cpsKeys;
      int lllllllllllllIIIIlllIlllIIIlllII = lllllllllllllIIIIlllIlllIIIlIlIl.cpsKeys.length;
      int lllllllllllllIIIIlllIlllIIIllIll = lIlIIlIllIlIll[3];

      do {
         if(!llllIllIIIIIlIl(lllllllllllllIIIIlllIlllIIIllIll, lllllllllllllIIIIlllIlllIIIlllII)) {
            return;
         }

         CPS lllllllllllllIIIIlllIlllIIIIlllI = lllllllllllllIIIIlllIlllIIIlIllI[lllllllllllllIIIIlllIlllIIIllIll];
         lllllllllllllIIIIlllIlllIIIIlllI.renderCPS(lllllllllllllIIIIlllIlllIIIlIlII, lllllllllllllIIIIlllIlllIIIlIIll, lllllllllllllIIIIlllIlllIIIlIIlI);
         ++lllllllllllllIIIIlllIlllIIIllIll;
         "".length();
      } while(((145 ^ 143 ^ 46 ^ 80) & (209 ^ 148 ^ 114 ^ 87 ^ -" ".length())) == 0);

   }

   private void drawMovementKeys(int lllllllllllllIIIIlllIlllIlIIlIIl, int lllllllllllllIIIIlllIlllIlIIIIll, int lllllllllllllIIIIlllIlllIlIIIIlI) {
      Key[] lllllllllllllIIIIlllIlllIlIIIIIl = lllllllllllllIIIIlllIlllIlIIIlIl.movementKeys;
      int lllllllllllllIIIIlllIlllIlIIllII = lllllllllllllIIIIlllIlllIlIIIlIl.movementKeys.length;
      int lllllllllllllIIIIlllIlllIlIIlIll = lIlIIlIllIlIll[3];

      do {
         if(!llllIllIIIIIlIl(lllllllllllllIIIIlllIlllIlIIlIll, lllllllllllllIIIIlllIlllIlIIllII)) {
            return;
         }

         Key lllllllllllllIIIIlllIlllIlIIllIl = lllllllllllllIIIIlllIlllIlIIIIIl[lllllllllllllIIIIlllIlllIlIIlIll];
         lllllllllllllIIIIlllIlllIlIIllIl.renderKey(lllllllllllllIIIIlllIlllIlIIlIIl, lllllllllllllIIIIlllIlllIlIIIIll, lllllllllllllIIIIlllIlllIlIIIIlI);
         ++lllllllllllllIIIIlllIlllIlIIlIll;
         "".length();
      } while(null == null);

   }

   private static boolean llllIllIIIIIlII(int lllllllllllllIIIIlllIllIllIlIlIl) {
      return lllllllllllllIIIIlllIllIllIlIlIl != 0;
   }

   private static boolean llllIllIIIIIlIl(int lllllllllllllIIIIlllIllIllIllIII, int lllllllllllllIIIIlllIllIllIlIlll) {
      return lllllllllllllIIIIlllIllIllIllIII < lllllllllllllIIIIlllIllIllIlIlll;
   }

   private void drawSpaceKey(int lllllllllllllIIIIlllIlllIIllIIIl, int lllllllllllllIIIIlllIlllIIlIlIll, int lllllllllllllIIIIlllIlllIIlIlIlI) {
      Space[] lllllllllllllIIIIlllIlllIIlIlIIl = lllllllllllllIIIIlllIlllIIlIllIl.spaceKeys;
      int lllllllllllllIIIIlllIlllIIllIlII = lllllllllllllIIIIlllIlllIIlIllIl.spaceKeys.length;
      int lllllllllllllIIIIlllIlllIIlIIlll = lIlIIlIllIlIll[3];

      do {
         if(!llllIllIIIIIlIl(lllllllllllllIIIIlllIlllIIlIIlll, lllllllllllllIIIIlllIlllIIllIlII)) {
            return;
         }

         Space lllllllllllllIIIIlllIlllIIlIIllI = lllllllllllllIIIIlllIlllIIlIlIIl[lllllllllllllIIIIlllIlllIIlIIlll];
         lllllllllllllIIIIlllIlllIIlIIllI.renderSpaceKey(lllllllllllllIIIIlllIlllIIllIIIl, lllllllllllllIIIIlllIlllIIlIlIll, lllllllllllllIIIIlllIlllIIlIlIlI);
         ++lllllllllllllIIIIlllIlllIIlIIlll;
         "".length();
      } while(" ".length() <= "  ".length());

   }

   private static void llllIllIIIIIIll() {
      lIlIIlIllIlIll = new int[20];
      lIlIIlIllIlIll[0] = 190 ^ 186;
      lIlIIlIllIlIll[1] = "  ".length();
      lIlIIlIllIlIll[2] = " ".length();
      lIlIIlIllIlIll[3] = (69 ^ 112) & ~(100 ^ 81);
      lIlIIlIllIlIll[4] = 168 ^ 178;
      lIlIIlIllIlIll[5] = "   ".length();
      lIlIIlIllIlIll[6] = 24 ^ 42;
      lIlIIlIllIlIll[7] = 251 ^ 197;
      lIlIIlIllIlIll[8] = 57 ^ 109 ^ 121 ^ 11;
      lIlIIlIllIlIll[9] = 29 ^ 75;
      lIlIIlIllIlIll[10] = 20 ^ 115;
      lIlIIlIllIlIll[11] = 119 ^ 120;
      lIlIIlIllIlIll[12] = 148 ^ 146;
      lIlIIlIllIlIll[13] = -1 & 16777215;
      lIlIIlIllIlIll[14] = -(-24897 & 26601) & -10305 & 16723688;
      lIlIIlIllIlIll[15] = -(76 ^ 1) & -177 & '\ufffc';
      lIlIIlIllIlIll[16] = 172 + 102 - 81 + 62;
      lIlIIlIllIlIll[17] = -(142 + 24 - 109 + 156) & -34 & 16777205;
      lIlIIlIllIlIll[18] = 199 ^ 194;
      lIlIIlIllIlIll[19] = -12102 & 11153391;
   }

   public Keystrokes(Minecraft lllllllllllllIIIIlllIlllIllIIlII) {
      lllllllllllllIIIIlllIlllIllIIlIl.mc = lllllllllllllIIIIlllIlllIllIIlII;
      lllllllllllllIIIIlllIlllIllIIlIl.movementKeys = new Key[lIlIIlIllIlIll[0]];
      lllllllllllllIIIIlllIlllIllIIlIl.mouseButtons = new MouseButton[lIlIIlIllIlIll[1]];
      lllllllllllllIIIIlllIlllIllIIlIl.spaceKeys = new Space[lIlIIlIllIlIll[2]];
      lllllllllllllIIIIlllIlllIllIIlIl.cpsKeys = new CPS[lIlIIlIllIlIll[2]];
      lllllllllllllIIIIlllIlllIllIIlIl.fpsKeys = new FPS[lIlIIlIllIlIll[2]];
      lllllllllllllIIIIlllIlllIllIIlIl.movementKeys[lIlIIlIllIlIll[3]] = new Key(lllllllllllllIIIIlllIlllIllIIlII.gameSettings.keyBindForward, lIlIIlIllIlIll[4], lIlIIlIllIlIll[1]);
      lllllllllllllIIIIlllIlllIllIIlIl.movementKeys[lIlIIlIllIlIll[2]] = new Key(lllllllllllllIIIIlllIlllIllIIlII.gameSettings.keyBindBack, lIlIIlIllIlIll[4], lIlIIlIllIlIll[4]);
      lllllllllllllIIIIlllIlllIllIIlIl.movementKeys[lIlIIlIllIlIll[1]] = new Key(lllllllllllllIIIIlllIlllIllIIlII.gameSettings.keyBindLeft, lIlIIlIllIlIll[1], lIlIIlIllIlIll[4]);
      lllllllllllllIIIIlllIlllIllIIlIl.movementKeys[lIlIIlIllIlIll[5]] = new Key(lllllllllllllIIIIlllIlllIllIIlII.gameSettings.keyBindRight, lIlIIlIllIlIll[6], lIlIIlIllIlIll[4]);
      lllllllllllllIIIIlllIlllIllIIlIl.spaceKeys[lIlIIlIllIlIll[3]] = new Space(lllllllllllllIIIIlllIlllIllIIlII.gameSettings.keyBindJump, lIlIIlIllIlIll[1], lIlIIlIllIlIll[6]);
      lllllllllllllIIIIlllIlllIllIIlIl.mouseButtons[lIlIIlIllIlIll[3]] = new MouseButton(lIlIIlIllIlIll[3], lIlIIlIllIlIll[1], lIlIIlIllIlIll[7]);
      lllllllllllllIIIIlllIlllIllIIlIl.mouseButtons[lIlIIlIllIlIll[2]] = new MouseButton(lIlIIlIllIlIll[2], lIlIIlIllIlIll[8], lIlIIlIllIlIll[7]);
      lllllllllllllIIIIlllIlllIllIIlIl.cpsKeys[lIlIIlIllIlIll[3]] = new CPS(lIlIIlIllIlIll[3], lIlIIlIllIlIll[1], lIlIIlIllIlIll[9]);
      lllllllllllllIIIIlllIlllIllIIlIl.fpsKeys[lIlIIlIllIlIll[3]] = new FPS(lIlIIlIllIlIll[3], lIlIIlIllIlIll[1], lIlIIlIllIlIll[10]);
   }

   static int getRainbow(int lllllllllllllIIIIlllIlllIlIllllI, int lllllllllllllIIIIlllIlllIlIllIlI) {
      float lllllllllllllIIIIlllIlllIlIllIIl = (float)((System.currentTimeMillis() + (long)lllllllllllllIIIIlllIlllIlIllIlI) % (long)lllllllllllllIIIIlllIlllIlIllllI);
      float var10000 = lllllllllllllIIIIlllIlllIlIllIIl / (float)lllllllllllllIIIIlllIlllIlIllllI;
      return Color.HSBtoRGB((float)(System.currentTimeMillis() % 1000L) / 1000.0F, 0.8F, 0.8F);
   }

   public void render() {
      int var10001;
      int var10002;
      if(llllIllIIIIIlII(Modules.isEnabledKeystrokes())) {
         var10001 = x;
         var10002 = y;
         "".length();
         var10001.drawMovementKeys(var10002, (int)lllllllllllllIIIIlllIlllIlIlIllI, getRainbow(lIlIIlIllIlIll[2], lIlIIlIllIlIll[11]));
         "".length();
         if("   ".length() > "   ".length()) {
            return;
         }
      } else {
         lllllllllllllIIIIlllIlllIlIlIllI.drawMovementKeys(x, y, Modules.getColor().getRGB());
      }

      if(llllIllIIIIIlII(Modules.isEnabledKeystrokes())) {
         var10001 = x;
         var10002 = y;
         "".length();
         var10001.drawSpaceKey(var10002, (int)lllllllllllllIIIIlllIlllIlIlIllI, getRainbow(lIlIIlIllIlIll[2], lIlIIlIllIlIll[11]));
         "".length();
         if(-" ".length() == ((41 + 38 - -20 + 57 ^ 56 + 57 - 102 + 138) & (153 ^ 190 ^ 3 ^ 45 ^ -" ".length()))) {
            return;
         }
      } else {
         lllllllllllllIIIIlllIlllIlIlIllI.drawSpaceKey(x, y, Modules.getColor().getRGB());
      }

      if(llllIllIIIIIlII(Modules.isEnabledKeystrokes())) {
         var10001 = x;
         var10002 = y;
         "".length();
         var10001.drawCPSKey(var10002, (int)lllllllllllllIIIIlllIlllIlIlIllI, getRainbow(lIlIIlIllIlIll[2], lIlIIlIllIlIll[11]));
         "".length();
         if((108 ^ 104) <= " ".length()) {
            return;
         }
      } else {
         lllllllllllllIIIIlllIlllIlIlIllI.drawCPSKey(x, y, Modules.getColor().getRGB());
      }

      if(llllIllIIIIIlII(Modules.isEnabledKeystrokes())) {
         var10001 = x;
         var10002 = y;
         "".length();
         var10001.drawFPSKey(var10002, (int)lllllllllllllIIIIlllIlllIlIlIllI, getRainbow(lIlIIlIllIlIll[2], lIlIIlIllIlIll[11]));
         "".length();
         if(((82 ^ 61 ^ 54 ^ 112) & ("  ".length() ^ 113 ^ 90 ^ -" ".length())) > ((57 + 18 - 63 + 132 ^ 11 + 109 - 42 + 97) & (20 ^ 126 ^ 213 ^ 128 ^ -" ".length()))) {
            return;
         }
      } else {
         lllllllllllllIIIIlllIlllIlIlIllI.drawFPSKey(x, y, Modules.getColor().getRGB());
      }

      if(llllIllIIIIIlII(Modules.isEnabledKeystrokes())) {
         var10001 = x;
         var10002 = y;
         "".length();
         var10001.drawMouseButtons(var10002, (int)lllllllllllllIIIIlllIlllIlIlIllI, getRainbow(lIlIIlIllIlIll[2], lIlIIlIllIlIll[11]));
         "".length();
         if("   ".length() <= 0) {
            return;
         }
      } else {
         lllllllllllllIIIIlllIlllIlIlIllI.drawMouseButtons(x, y, Modules.getColor().getRGB());
      }

   }

   public static void setRes(ScaledResolution lllllllllllllIIIIlllIllIllIllIll) {
      res = lllllllllllllIIIIlllIllIllIllIll;
   }

   private void drawFPSKey(int lllllllllllllIIIIlllIllIllllllII, int lllllllllllllIIIIlllIlllIIIIIIII, int lllllllllllllIIIIlllIllIlllllIlI) {
      FPS[] lllllllllllllIIIIlllIllIlllllIIl = lllllllllllllIIIIlllIlllIIIIIIlI.fpsKeys;
      int lllllllllllllIIIIlllIlllIIIIIlII = lllllllllllllIIIIlllIlllIIIIIIlI.fpsKeys.length;
      int lllllllllllllIIIIlllIlllIIIIIIll = lIlIIlIllIlIll[3];

      do {
         if(!llllIllIIIIIlIl(lllllllllllllIIIIlllIlllIIIIIIll, lllllllllllllIIIIlllIlllIIIIIlII)) {
            return;
         }

         FPS lllllllllllllIIIIlllIllIllllIllI = lllllllllllllIIIIlllIllIlllllIIl[lllllllllllllIIIIlllIlllIIIIIIll];
         lllllllllllllIIIIlllIllIllllIllI.renderFPS(lllllllllllllIIIIlllIllIllllllII, lllllllllllllIIIIlllIlllIIIIIIII, lllllllllllllIIIIlllIllIlllllIlI);
         ++lllllllllllllIIIIlllIlllIIIIIIll;
         "".length();
      } while(("  ".length() & ("  ".length() ^ -" ".length())) >= ((142 + 19 - 141 + 186 ^ 123 + 117 - 98 + 17) & (101 ^ 110 ^ 88 ^ 2 ^ -" ".length())));

   }
}
