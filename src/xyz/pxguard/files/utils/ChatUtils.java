package xyz.pxguard.files.utils;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class ChatUtils {

   private static final String[] lllllIIlllIIl;
   private static final int[] lllllIIllllII;


   private static void lIlllIlIIlIIIII() {
      lllllIIlllIIl = new String[lllllIIllllII[2]];
      lllllIIlllIIl[lllllIIllllII[0]] = lIlllIlIIIlllll("Qw==", "eyYNh");
      lllllIIlllIIl[lllllIIllllII[1]] = lIlllIlIIIlllll("SHI=", "JCWGg");
   }

   private static void lIlllIlIIlIIllI() {
      lllllIIllllII = new int[3];
      lllllIIllllII[0] = (177 ^ 197 ^ 233 ^ 181) & (6 + 122 - 67 + 82 ^ 11 + 145 - 48 + 59 ^ -" ".length());
      lllllIIllllII[1] = " ".length();
      lllllIIllllII[2] = "  ".length();
   }

   private static String lIlllIlIIIlllll(String lllllllllllllIlIIlllIIlIIlllIIlI, String lllllllllllllIlIIlllIIlIIlllIllI) {
      lllllllllllllIlIIlllIIlIIlllIIlI = new String(Base64.getDecoder().decode(lllllllllllllIlIIlllIIlIIlllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllIlIIlllIIlIIlllIlIl = new StringBuilder();
      char[] lllllllllllllIlIIlllIIlIIlllIlII = lllllllllllllIlIIlllIIlIIlllIllI.toCharArray();
      int lllllllllllllIlIIlllIIlIIllIlllI = lllllIIllllII[0];
      char[] lllllllllllllIlIIlllIIlIIllIllIl = lllllllllllllIlIIlllIIlIIlllIIlI.toCharArray();
      int lllllllllllllIlIIlllIIlIIllIllII = lllllllllllllIlIIlllIIlIIllIllIl.length;
      int lllllllllllllIlIIlllIIlIIllIlIll = lllllIIllllII[0];

      do {
         if(!lIlllIlIIlIIlll(lllllllllllllIlIIlllIIlIIllIlIll, lllllllllllllIlIIlllIIlIIllIllII)) {
            return String.valueOf(lllllllllllllIlIIlllIIlIIlllIlIl);
         }

         char lllllllllllllIlIIlllIIlIIllllIII = lllllllllllllIlIIlllIIlIIllIllIl[lllllllllllllIlIIlllIIlIIllIlIll];
         lllllllllllllIlIIlllIIlIIlllIlIl.append((char)(lllllllllllllIlIIlllIIlIIllllIII ^ lllllllllllllIlIIlllIIlIIlllIlII[lllllllllllllIlIIlllIIlIIllIlllI % lllllllllllllIlIIlllIIlIIlllIlII.length]));
         "".length();
         ++lllllllllllllIlIIlllIIlIIllIlllI;
         ++lllllllllllllIlIIlllIIlIIllIlIll;
         "".length();
      } while("  ".length() > 0);

      return null;
   }

   private static boolean lIlllIlIIlIIlll(int lllllllllllllIlIIlllIIlIIllIIlll, int lllllllllllllIlIIlllIIlIIllIIllI) {
      return lllllllllllllIlIIlllIIlIIllIIlll < lllllllllllllIlIIlllIIlIIllIIllI;
   }

   public static String repairColors(String lllllllllllllIlIIlllIIlIlIIIIIll) {
      return lllllllllllllIlIIlllIIlIlIIIIIll.replaceAll(lllllIIlllIIl[lllllIIllllII[0]], lllllIIlllIIl[lllllIIllllII[1]]);
   }

   static {
      lIlllIlIIlIIllI();
      lIlllIlIIlIIIII();
   }
}
