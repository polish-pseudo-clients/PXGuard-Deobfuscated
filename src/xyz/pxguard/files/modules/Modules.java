package xyz.pxguard.files.modules;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import xyz.pxguard.files.animations.WingsAnimations;
import xyz.pxguard.files.config.Configuration;

public class Modules extends WingsAnimations {

   private static boolean rainbow;
   private static final int[] lIllIlIlllIll;
   private static final String[] lIllIlIlllIIl;
   private static Color color;


   public static void setEnabledButtons(boolean llllllllllllllIIIIIlIIIllIlIlIIl) {
      Configuration.setProperty(lIllIlIlllIIl[lIllIlIlllIll[7]], String.valueOf(llllllllllllllIIIIIlIIIllIlIlIIl));
   }

   public static boolean isEnabledCompass() {
      return Boolean.valueOf(Configuration.getProperty(lIllIlIlllIIl[lIllIlIlllIll[2]])).booleanValue();
   }

   public static void setEnabledWings(boolean llllllllllllllIIIIIlIIIllIllIlll) {
      Configuration.setProperty(lIllIlIlllIIl[lIllIlIlllIll[1]], String.valueOf(llllllllllllllIIIIIlIIIllIllIlll));
   }

   public static void setRainbow(boolean llllllllllllllIIIIIlIIIllIIlllII) {
      rainbow = llllllllllllllIIIIIlIIIllIIlllII;
   }

   public static void setEnabledKeystrokes(boolean llllllllllllllIIIIIlIIIllIlIlllI) {
      Configuration.setProperty(lIllIlIlllIIl[lIllIlIlllIll[5]], String.valueOf(llllllllllllllIIIIIlIIIllIlIlllI));
   }

   public static boolean isEnabledWings() {
      return Boolean.valueOf(Configuration.getProperty(lIllIlIlllIIl[lIllIlIlllIll[0]])).booleanValue();
   }

   private static String lIIIIlllIllIlll(String llllllllllllllIIIIIlIIIllIIIIlII, String llllllllllllllIIIIIlIIIllIIIIIll) {
      try {
         SecretKeySpec llllllllllllllIIIIIlIIIllIIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIIIIIlIIIllIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher llllllllllllllIIIIIlIIIllIIIIIIl = Cipher.getInstance("Blowfish");
         llllllllllllllIIIIIlIIIllIIIIIIl.init(lIllIlIlllIll[2], llllllllllllllIIIIIlIIIllIIIIlll);
         return new String(llllllllllllllIIIIIlIIIllIIIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIIIIIlIIIllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   public static boolean isEnabledKeystrokes() {
      return Boolean.valueOf(Configuration.getProperty(lIllIlIlllIIl[lIllIlIlllIll[4]])).booleanValue();
   }

   public static Color getColor() {
      return color;
   }

   private static void lIIIIlllIlllIlI() {
      lIllIlIlllIIl = new String[lIllIlIlllIll[8]];
      lIllIlIlllIIl[lIllIlIlllIll[0]] = lIIIIlllIllIIll("Fm6c4O1RM/w=", "GZtZU");
      lIllIlIlllIIl[lIllIlIlllIll[1]] = lIIIIlllIllIIll("MbI0fhoUsn8=", "MgynH");
      lIllIlIlllIIl[lIllIlIlllIll[2]] = lIIIIlllIllIIll("pt7CBwiK2yQ=", "Vihqw");
      lIllIlIlllIIl[lIllIlIlllIll[3]] = lIIIIlllIllIIll("gcs6JeBfcGE=", "fZaYy");
      lIllIlIlllIIl[lIllIlIlllIll[4]] = lIIIIlllIllIlll("QrPPBax+hoSsQUBktS3IbA==", "RgBay");
      lIllIlIlllIIl[lIllIlIlllIll[5]] = lIIIIlllIllIIll("YY+zpfepck2vmwqfs6RU5w==", "XxLwU");
      lIllIlIlllIIl[lIllIlIlllIll[6]] = lIIIIlllIlllIIl("Mxk5EiU/Hw==", "QlMfJ");
      lIllIlIlllIIl[lIllIlIlllIll[7]] = lIIIIlllIlllIIl("JhIuPQcqFA==", "DgZIh");
   }

   public static boolean isEnabledButtons() {
      return Boolean.valueOf(Configuration.getProperty(lIllIlIlllIIl[lIllIlIlllIll[6]])).booleanValue();
   }

   private static String lIIIIlllIllIIll(String llllllllllllllIIIIIlIIIllIIlIIll, String llllllllllllllIIIIIlIIIllIIlIIII) {
      try {
         SecretKeySpec llllllllllllllIIIIIlIIIllIIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIIIIIlIIIllIIlIIII.getBytes(StandardCharsets.UTF_8)), lIllIlIlllIll[8]), "DES");
         Cipher llllllllllllllIIIIIlIIIllIIlIlIl = Cipher.getInstance("DES");
         llllllllllllllIIIIIlIIIllIIlIlIl.init(lIllIlIlllIll[2], llllllllllllllIIIIIlIIIllIIlIllI);
         return new String(llllllllllllllIIIIIlIIIllIIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIIIIIlIIIllIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   public static boolean isRainbow() {
      return rainbow;
   }

   private static boolean lIIIIllllIIllIl(int llllllllllllllIIIIIlIIIlIlIlIlll, int llllllllllllllIIIIIlIIIlIlIlIllI) {
      return llllllllllllllIIIIIlIIIlIlIlIlll < llllllllllllllIIIIIlIIIlIlIlIllI;
   }

   private static String lIIIIlllIlllIIl(String llllllllllllllIIIIIlIIIlIlllIIII, String llllllllllllllIIIIIlIIIlIlllIlIl) {
      llllllllllllllIIIIIlIIIlIlllIIII = new String(Base64.getDecoder().decode(llllllllllllllIIIIIlIIIlIlllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder llllllllllllllIIIIIlIIIlIlllIlII = new StringBuilder();
      char[] llllllllllllllIIIIIlIIIlIllIlIll = llllllllllllllIIIIIlIIIlIlllIlIl.toCharArray();
      int llllllllllllllIIIIIlIIIlIlllIIIl = lIllIlIlllIll[0];
      char[] llllllllllllllIIIIIlIIIlIllIIlll = llllllllllllllIIIIIlIIIlIlllIIII.toCharArray();
      int llllllllllllllIIIIIlIIIlIllIIlIl = llllllllllllllIIIIIlIIIlIllIIlll.length;
      int llllllllllllllIIIIIlIIIlIllIIIll = lIllIlIlllIll[0];

      do {
         if(!lIIIIllllIIllIl(llllllllllllllIIIIIlIIIlIllIIIll, llllllllllllllIIIIIlIIIlIllIIlIl)) {
            return String.valueOf(llllllllllllllIIIIIlIIIlIlllIlII);
         }

         char llllllllllllllIIIIIlIIIlIllIIIlI = llllllllllllllIIIIIlIIIlIllIIlll[llllllllllllllIIIIIlIIIlIllIIIll];
         llllllllllllllIIIIIlIIIlIlllIlII.append((char)(llllllllllllllIIIIIlIIIlIllIIIlI ^ llllllllllllllIIIIIlIIIlIllIlIll[llllllllllllllIIIIIlIIIlIlllIIIl % llllllllllllllIIIIIlIIIlIllIlIll.length]));
         "".length();
         ++llllllllllllllIIIIIlIIIlIlllIIIl;
         ++llllllllllllllIIIIIlIIIlIllIIIll;
         "".length();
      } while(((235 ^ 155 ^ 4 ^ 64) & (13 + 162 - 72 + 69 ^ 76 + 64 - 93 + 105 ^ -" ".length())) == 0);

      return null;
   }

   private static void lIIIIllllIIllII() {
      lIllIlIlllIll = new int[9];
      lIllIlIlllIll[0] = (68 ^ 95) & ~(78 ^ 85);
      lIllIlIlllIll[1] = " ".length();
      lIllIlIlllIll[2] = "  ".length();
      lIllIlIlllIll[3] = "   ".length();
      lIllIlIlllIll[4] = 73 ^ 30 ^ 205 ^ 158;
      lIllIlIlllIll[5] = 36 + 116 - 101 + 112 ^ 93 + 12 - -2 + 59;
      lIllIlIlllIll[6] = 133 ^ 131;
      lIllIlIlllIll[7] = 1 + 49 - -55 + 38 ^ 14 + 0 - -111 + 11;
      lIllIlIlllIll[8] = 139 ^ 131;
   }

   public static void setColor(Color llllllllllllllIIIIIlIIIllIlIIIlI) {
      color = llllllllllllllIIIIIlIIIllIlIIIlI;
   }

   public static void setEnabledCompass(boolean llllllllllllllIIIIIlIIIllIllIIIl) {
      Configuration.setProperty(lIllIlIlllIIl[lIllIlIlllIll[3]], String.valueOf(llllllllllllllIIIIIlIIIllIllIIIl));
   }

   static {
      lIIIIllllIIllII();
      lIIIIlllIlllIlI();
      color = Color.WHITE;
      rainbow = (boolean)lIllIlIlllIll[1];
   }
}
