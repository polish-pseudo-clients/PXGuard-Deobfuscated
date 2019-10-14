package xyz.pxguard.files;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.Display;
import xyz.pxguard.files.config.Configuration;

public class PXGuard {

   private static final int[] lIlIIIlllIIllI;
   private static final String[] lIlIIIlllIIlIl;


   private static void llllIIlIllIIlIl() {
      lIlIIIlllIIllI = new int[3];
      lIlIIIlllIIllI[0] = (210 ^ 140 ^ 48 ^ 15) & (252 + 48 - 296 + 249 ^ 2 + 155 - 80 + 79 ^ -" ".length());
      lIlIIIlllIIllI[1] = " ".length();
      lIlIIIlllIIllI[2] = "  ".length();
   }

   public static void startGame() {
      Display.setTitle(lIlIIIlllIIlIl[lIlIIIlllIIllI[0]]);

      try {
         Configuration.load();
      } catch (Exception var2) {
         var2.printStackTrace();
         return;
      }

      "".length();
      if(null == null) {
         ;
      }
   }

   private static void llllIIlIllIIlII() {
      lIlIIIlllIIlIl = new String[lIlIIIlllIIllI[1]];
      lIlIIIlllIIlIl[lIlIIIlllIIllI[0]] = llllIIlIllIIIll("6+aCDauZJ5YA1hPxoTGIOm7RWUYWIoERBgjlcDfs+mY=", "BvgMu");
   }

   private static String llllIIlIllIIIll(String lllllllllllllIIIlIIlIIllIIlIlIlI, String lllllllllllllIIIlIIlIIllIIlIlIIl) {
      try {
         SecretKeySpec lllllllllllllIIIlIIlIIllIIlIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIlIIllIIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllIIIlIIlIIllIIlIIlll = Cipher.getInstance("Blowfish");
         lllllllllllllIIIlIIlIIllIIlIIlll.init(lIlIIIlllIIllI[2], lllllllllllllIIIlIIlIIllIIlIllll);
         return new String(lllllllllllllIIIlIIlIIllIIlIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIlIIllIIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   static {
      llllIIlIllIIlIl();
      llllIIlIllIIlII();
   }
}
