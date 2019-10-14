package xyz.pxguard.files.modules;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.Minecraft;
import xyz.pxguard.files.config.Configuration;

public class AutoSprint {

   private static final int[] lIIllIIIIllllI;
   private static final String[] lIIllIIIIlllIl;
   private static final Minecraft minecraft;


   public static boolean isEnabled() {
      return Boolean.valueOf(Configuration.getProperty(lIIllIIIIlllIl[lIIllIIIIllllI[0]])).booleanValue();
   }

   private static String lllIIIlIIIlIIII(String lllllllllllllIIlIIlIIIlllIIlIllI, String lllllllllllllIIlIIlIIIlllIIlIlIl) {
      try {
         SecretKeySpec lllllllllllllIIlIIlIIIlllIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlIIIlllIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllIIlIIlIIIlllIIlIIll = Cipher.getInstance("Blowfish");
         lllllllllllllIIlIIlIIIlllIIlIIll.init(lIIllIIIIllllI[2], lllllllllllllIIlIIlIIIlllIIlIlII);
         return new String(lllllllllllllIIlIIlIIIlllIIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlIIIlllIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   static {
      lllIIIlIIIlIIlI();
      lllIIIlIIIlIIIl();
      minecraft = Minecraft.getMinecraft();
   }

   private static void lllIIIlIIIlIIlI() {
      lIIllIIIIllllI = new int[4];
      lIIllIIIIllllI[0] = (106 + 47 - 29 + 38 ^ 150 + 100 - 187 + 101) & (110 + 165 - 172 + 91 ^ 109 + 5 - 110 + 192 ^ -" ".length());
      lIIllIIIIllllI[1] = " ".length();
      lIIllIIIIllllI[2] = "  ".length();
      lIIllIIIIllllI[3] = 118 ^ 126;
   }

   private static boolean lllIIIlIIIlIIll(int lllllllllllllIIlIIlIIIlllIIlIIIl) {
      return lllllllllllllIIlIIlIIIlllIIlIIIl != 0;
   }

   public static void setEnabled(boolean lllllllllllllIIlIIlIIIlllIlIllIl) {
      Configuration.setProperty(lIIllIIIIlllIl[lIIllIIIIllllI[1]], String.valueOf(lllllllllllllIIlIIlIIIlllIlIllIl));
   }

   private static void lllIIIlIIIlIIIl() {
      lIIllIIIIlllIl = new String[lIIllIIIIllllI[2]];
      lIIllIIIIlllIl[lIIllIIIIllllI[0]] = lllIIIlIIIIllll("wjG0jkW0JBs=", "cgpaK");
      lIIllIIIIlllIl[lIIllIIIIllllI[1]] = lllIIIlIIIlIIII("Z+8l+ajrXZw=", "JUxUc");
   }

   private static String lllIIIlIIIIllll(String lllllllllllllIIlIIlIIIlllIlIIlIl, String lllllllllllllIIlIIlIIIlllIlIIlII) {
      try {
         SecretKeySpec lllllllllllllIIlIIlIIIlllIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlIIIlllIlIIlII.getBytes(StandardCharsets.UTF_8)), lIIllIIIIllllI[3]), "DES");
         Cipher lllllllllllllIIlIIlIIIlllIlIIlll = Cipher.getInstance("DES");
         lllllllllllllIIlIIlIIIlllIlIIlll.init(lIIllIIIIllllI[2], lllllllllllllIIlIIlIIIlllIlIlIII);
         return new String(lllllllllllllIIlIIlIIIlllIlIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlIIIlllIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static void update() {
      if(lllIIIlIIIlIIll(isEnabled()) && lllIIIlIIIlIIll(minecraft.gameSettings.keyBindForward.isKeyDown())) {
         minecraft.thePlayer.setSprinting((boolean)lIIllIIIIllllI[1]);
      }

   }
}
