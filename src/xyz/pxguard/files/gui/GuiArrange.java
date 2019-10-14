package xyz.pxguard.files.gui;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import xyz.pxguard.files.mods.Keystrokes;

public class GuiArrange extends GuiScreen {

   private int lastMouseX;
   private int y;
   private static final int[] lIIlllllIllIII;
   private int lastMouseY;
   private String dragItem;
   private final int color;
   private static final String[] lIIllllIlllllI;
   private GuiScreen prevscreen;
   private boolean dragging;
   private int x;
   private final double textBrightness;


   private static void lllIllIIlIIllIl() {
      lIIllllIlllllI = new String[lIIlllllIllIII[3]];
      lIIllllIlllllI[lIIlllllIllIII[0]] = lllIllIIlIIlIll("OpuwxS6X11k=", "sauoN");
      lIIllllIlllllI[lIIlllllIllIII[2]] = lllIllIIlIIllII("GHM=", "AIrLl");
   }

   private static String lllIllIIlIIlIll(String lllllllllllllIIIllIIIlIIlIllllII, String lllllllllllllIIIllIIIlIIlIllllIl) {
      try {
         SecretKeySpec lllllllllllllIIIllIIIlIIllIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIIIlIIlIllllIl.getBytes(StandardCharsets.UTF_8)), lIIlllllIllIII[4]), "DES");
         Cipher lllllllllllllIIIllIIIlIIlIlllIIl = Cipher.getInstance("DES");
         lllllllllllllIIIllIIIlIIlIlllIIl.init(lIIlllllIllIII[3], lllllllllllllIIIllIIIlIIllIIIIIl);
         return new String(lllllllllllllIIIllIIIlIIlIlllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIIIlIIlIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public void drawScreen(int lllllllllllllIIIllIIIlIIllIIlIII, int lllllllllllllIIIllIIIlIIllIIIlll, float lllllllllllllIIIllIIIlIIllIIIllI) {}

   private static boolean lllIllIlIIIIlII(int lllllllllllllIIIllIIIlIIlIIllIll) {
      return lllllllllllllIIIllIIIlIIlIIllIll != 0;
   }

   protected void mouseClickMove(int lllllllllllllIIIllIIIlIIllIIllIl, int lllllllllllllIIIllIIIlIIllIlIIIl, int lllllllllllllIIIllIIIlIIllIIlIll, long lllllllllllllIIIllIIIlIIllIIllll) {
      super.mouseClickMove(lllllllllllllIIIllIIIlIIllIIllIl, lllllllllllllIIIllIIIlIIllIlIIIl, lllllllllllllIIIllIIIlIIllIIlIll, lllllllllllllIIIllIIIlIIllIIllll);
      Keystrokes.setRes(new ScaledResolution(lllllllllllllIIIllIIIlIIllIIlllI.mc));
      if(!lllIllIlIIIIlIl(lllllllllllllIIIllIIIlIIllIIlllI.dragging)) {
         Keystrokes.x = Keystrokes.x + lllllllllllllIIIllIIIlIIllIIllIl - lllllllllllllIIIllIIIlIIllIIlllI.lastMouseX;
         Keystrokes.y = Keystrokes.y + lllllllllllllIIIllIIIlIIllIlIIIl - lllllllllllllIIIllIIIlIIllIIlllI.lastMouseY;
         lllllllllllllIIIllIIIlIIllIIlllI.lastMouseX = lllllllllllllIIIllIIIlIIllIIllIl;
         lllllllllllllIIIllIIIlIIllIIlllI.lastMouseY = lllllllllllllIIIllIIIlIIllIlIIIl;
         System.out.println(String.valueOf((new StringBuilder()).append(lIIllllIlllllI[lIIlllllIllIII[0]]).append(lllllllllllllIIIllIIIlIIllIIlllI.lastMouseX)));
         System.out.println(String.valueOf((new StringBuilder()).append(lIIllllIlllllI[lIIlllllIllIII[2]]).append(lllllllllllllIIIllIIIlIIllIIlllI.lastMouseY)));
      }
   }

   private static String lllIllIIlIIllII(String lllllllllllllIIIllIIIlIIlIlIlIIl, String lllllllllllllIIIllIIIlIIlIlIlIII) {
      lllllllllllllIIIllIIIlIIlIlIlIIl = new String(Base64.getDecoder().decode(lllllllllllllIIIllIIIlIIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllIIIllIIIlIIlIlIIlll = new StringBuilder();
      char[] lllllllllllllIIIllIIIlIIlIlIIllI = lllllllllllllIIIllIIIlIIlIlIlIII.toCharArray();
      int lllllllllllllIIIllIIIlIIlIlIIlIl = lIIlllllIllIII[0];
      char[] lllllllllllllIIIllIIIlIIlIlIIlII = lllllllllllllIIIllIIIlIIlIlIlIIl.toCharArray();
      int lllllllllllllIIIllIIIlIIlIlIIIll = lllllllllllllIIIllIIIlIIlIlIIlII.length;
      int lllllllllllllIIIllIIIlIIlIlIIIlI = lIIlllllIllIII[0];

      do {
         if(!lllIllIlIIIIllI(lllllllllllllIIIllIIIlIIlIlIIIlI, lllllllllllllIIIllIIIlIIlIlIIIll)) {
            return String.valueOf(lllllllllllllIIIllIIIlIIlIlIIlll);
         }

         char lllllllllllllIIIllIIIlIIlIlIllll = lllllllllllllIIIllIIIlIIlIlIIlII[lllllllllllllIIIllIIIlIIlIlIIIlI];
         lllllllllllllIIIllIIIlIIlIlIIlll.append((char)(lllllllllllllIIIllIIIlIIlIlIllll ^ lllllllllllllIIIllIIIlIIlIlIIllI[lllllllllllllIIIllIIIlIIlIlIIlIl % lllllllllllllIIIllIIIlIIlIlIIllI.length]));
         "".length();
         ++lllllllllllllIIIllIIIlIIlIlIIlIl;
         ++lllllllllllllIIIllIIIlIIlIlIIIlI;
         "".length();
      } while(-(9 ^ 12) < 0);

      return null;
   }

   private static boolean lllIllIlIIIIllI(int lllllllllllllIIIllIIIlIIlIIllllI, int lllllllllllllIIIllIIIlIIlIIlllIl) {
      return lllllllllllllIIIllIIIlIIlIIllllI < lllllllllllllIIIllIIIlIIlIIlllIl;
   }

   public GuiArrange(GuiScreen lllllllllllllIIIllIIIlIIlllIIlll) {
      lllllllllllllIIIllIIIlIIlllIlIII.x = lIIlllllIllIII[0];
      lllllllllllllIIIllIIIlIIlllIlIII.y = lIIlllllIllIII[0];
      lllllllllllllIIIllIIIlIIlllIlIII.dragging = (boolean)lIIlllllIllIII[0];
      lllllllllllllIIIllIIIlIIlllIlIII.color = lIIlllllIllIII[1];
      lllllllllllllIIIllIIIlIIlllIlIII.textBrightness = 1.0D;
      lllllllllllllIIIllIIIlIIlllIlIII.prevscreen = lllllllllllllIIIllIIIlIIlllIIlll;
      lllllllllllllIIIllIIIlIIlllIlIII.dragItem = null;
   }

   private static boolean lllIllIlIIIIlIl(int lllllllllllllIIIllIIIlIIlIIllIIl) {
      return lllllllllllllIIIllIIIlIIlIIllIIl == 0;
   }

   static {
      lllIllIlIIIIIll();
      lllIllIIlIIllIl();
   }

   protected void mouseClicked(int lllllllllllllIIIllIIIlIIlllIIIII, int lllllllllllllIIIllIIIlIIllIllIll, int lllllllllllllIIIllIIIlIIllIllllI) {
      label18: {
         try {
            super.mouseClicked(lllllllllllllIIIllIIIlIIlllIIIII, lllllllllllllIIIllIIIlIIllIllIll, lllllllllllllIIIllIIIlIIllIllllI);
         } catch (IOException var5) {
            break label18;
         }

         "".length();
         if(-"  ".length() > 0) {
            return;
         }
      }

      if(!lllIllIlIIIIlII(lllllllllllllIIIllIIIlIIllIllllI)) {
         lllllllllllllIIIllIIIlIIlllIIIIl.dragging = (boolean)lIIlllllIllIII[2];
         lllllllllllllIIIllIIIlIIlllIIIIl.lastMouseX = lllllllllllllIIIllIIIlIIlllIIIII;
         lllllllllllllIIIllIIIlIIlllIIIIl.lastMouseY = lllllllllllllIIIllIIIlIIllIllIll;
      }
   }

   private static void lllIllIlIIIIIll() {
      lIIlllllIllIII = new int[5];
      lIIlllllIllIII[0] = (51 ^ 8 ^ 38 ^ 22) & (110 ^ 53 ^ 240 ^ 160 ^ -" ".length());
      lIIlllllIllIII[1] = 79 + 14 - -23 + 139;
      lIIlllllIllIII[2] = " ".length();
      lIIlllllIllIII[3] = "  ".length();
      lIIlllllIllIII[4] = 27 ^ 121 ^ 18 ^ 120;
   }
}
