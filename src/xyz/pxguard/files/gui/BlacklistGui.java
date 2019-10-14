package xyz.pxguard.files.gui;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;

public class BlacklistGui extends GuiScreen {

   private static final int[] lIIllllIlIIIll;
   private EntityPlayer entityp;
   private final String powod;
   private static final String[] lIIllllIlIIIlI;
   private final String reason;


   private static String lllIlIlllllllll(String lllllllllllllIIIllIIlllIIlllllIl, String lllllllllllllIIIllIIlllIIlllllII) {
      try {
         SecretKeySpec lllllllllllllIIIllIIlllIlIIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIIlllIIlllllII.getBytes(StandardCharsets.UTF_8)), lIIllllIlIIIll[10]), "DES");
         Cipher lllllllllllllIIIllIIlllIIlllllll = Cipher.getInstance("DES");
         lllllllllllllIIIllIIlllIIlllllll.init(lIIllllIlIIIll[1], lllllllllllllIIIllIIlllIlIIIIIII);
         return new String(lllllllllllllIIIllIIlllIIlllllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIIlllIIlllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public BlacklistGui(String lllllllllllllIIIllIIlllIlIIlIlIl, String lllllllllllllIIIllIIlllIlIIlIlII) {
      lllllllllllllIIIllIIlllIlIIllIIl.reason = lllllllllllllIIIllIIlllIlIIlIlIl;
      lllllllllllllIIIllIIlllIlIIllIIl.powod = lllllllllllllIIIllIIlllIlIIlIlII;
   }

   private static void lllIllIIIIIIIIl() {
      lIIllllIlIIIll = new int[11];
      lIIllllIlIIIll[0] = (165 ^ 135 ^ 175 ^ 185) & (26 + 40 - 37 + 103 ^ 17 + 141 - -3 + 15 ^ -" ".length());
      lIIllllIlIIIll[1] = "  ".length();
      lIIllllIlIIIll[2] = 99 ^ 13;
      lIIllllIlIIIll[3] = -" ".length() & -1 & 16777215;
      lIIllllIlIIIll[4] = " ".length();
      lIIllllIlIIIll[5] = 64 ^ 26;
      lIIllllIlIIIll[6] = 79 + 88 - 73 + 72 ^ 117 + 154 - 199 + 122;
      lIIllllIlIIIll[7] = "   ".length();
      lIIllllIlIIIll[8] = 239 ^ 146;
      lIIllllIlIIIll[9] = 83 ^ 87;
      lIIllllIlIIIll[10] = 32 ^ 15 ^ 145 ^ 182;
   }

   public void drawScreen(int lllllllllllllIIIllIIlllIlIIIlIlI, int lllllllllllllIIIllIIlllIlIIIllIl, float lllllllllllllIIIllIIlllIlIIIlIII) {
      lllllllllllllIIIllIIlllIlIIIlIll.drawDefaultBackground();
      lllllllllllllIIIllIIlllIlIIIlIll.drawCenteredString(lllllllllllllIIIllIIlllIlIIIlIll.fontRendererObj, String.valueOf((new StringBuilder()).append(lIIllllIlIIIlI[lIIllllIlIIIll[0]]).append(lllllllllllllIIIllIIlllIlIIIlIll.mc.getSession().getUsername())), lllllllllllllIIIllIIlllIlIIIlIll.width / lIIllllIlIIIll[1], lIIllllIlIIIll[2], lIIllllIlIIIll[3]);
      lllllllllllllIIIllIIlllIlIIIlIll.drawCenteredString(lllllllllllllIIIllIIlllIlIIIlIll.fontRendererObj, lIIllllIlIIIlI[lIIllllIlIIIll[4]], lllllllllllllIIIllIIlllIlIIIlIll.width / lIIllllIlIIIll[1], lIIllllIlIIIll[5], lIIllllIlIIIll[3]);
      lllllllllllllIIIllIIlllIlIIIlIll.drawCenteredString(lllllllllllllIIIllIIlllIlIIIlIll.fontRendererObj, String.valueOf((new StringBuilder()).append(lIIllllIlIIIlI[lIIllllIlIIIll[1]]).append(lllllllllllllIIIllIIlllIlIIIlIll.reason)), lllllllllllllIIIllIIlllIlIIIlIll.width / lIIllllIlIIIll[1], lIIllllIlIIIll[6], lIIllllIlIIIll[3]);
      lllllllllllllIIIllIIlllIlIIIlIll.drawCenteredString(lllllllllllllIIIllIIlllIlIIIlIll.fontRendererObj, String.valueOf((new StringBuilder()).append(lIIllllIlIIIlI[lIIllllIlIIIll[7]]).append(lllllllllllllIIIllIIlllIlIIIlIll.powod)), lllllllllllllIIIllIIlllIlIIIlIll.width / lIIllllIlIIIll[1], lIIllllIlIIIll[8], lIIllllIlIIIll[3]);
      super.drawScreen(lllllllllllllIIIllIIlllIlIIIlIlI, lllllllllllllIIIllIIlllIlIIIllIl, lllllllllllllIIIllIIlllIlIIIlIII);
   }

   protected void keyTyped(char lllllllllllllIIIllIIlllIlIIIIllI, int lllllllllllllIIIllIIlllIlIIIIlIl) throws IOException {}

   private static void lllIllIIIIIIIII() {
      lIIllllIlIIIlI = new String[lIIllllIlIIIll[9]];
      lIIllllIlIIIlI[lIIllllIlIIIll[0]] = lllIlIllllllllI("XlSEE2U0f7O6MrS9B9Ry9lRvf4VYMIUb", "nolzp");
      lIIllllIlIIIlI[lIIllllIlIIIll[4]] = lllIlIlllllllll("iAbBE+x0+R+0ooOfWsC1/9KqMOa3doq1RnH2yrufhaI=", "HDkto");
      lIIllllIlIIIlI[lIIllllIlIIIll[1]] = lllIlIlllllllll("88vjKDrt2PgkokTCacXcnZtZrdNstukJ", "nWRfc");
      lIIllllIlIIIlI[lIIllllIlIIIll[7]] = lllIlIlllllllll("hnf/+90X5oMyxFR19vy2Gl3rSH72gZLE", "kxppU");
   }

   static {
      lllIllIIIIIIIIl();
      lllIllIIIIIIIII();
   }

   private static String lllIlIllllllllI(String lllllllllllllIIIllIIlllIIllIlllI, String lllllllllllllIIIllIIlllIIllIllll) {
      try {
         SecretKeySpec lllllllllllllIIIllIIlllIIlllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIIlllIIllIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllIIIllIIlllIIllIlIll = Cipher.getInstance("Blowfish");
         lllllllllllllIIIllIIlllIIllIlIll.init(lIIllllIlIIIll[1], lllllllllllllIIIllIIlllIIlllIIIl);
         return new String(lllllllllllllIIIllIIlllIIllIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIIlllIIllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }
}
