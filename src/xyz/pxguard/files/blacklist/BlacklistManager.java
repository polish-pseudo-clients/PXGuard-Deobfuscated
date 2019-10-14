package xyz.pxguard.files.blacklist;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.Minecraft;
import xyz.pxguard.files.gui.BlacklistGui;

public class BlacklistManager {

   private static final int[] lIIlIlIlIIIlIl;
   private static final String[] lIIlIlIlIIIlII;


   static {
      llIlllIlIIllIlI();
      llIlllIlIIllIIl();
   }

   private static boolean llIlllIlIIllIll(int lllllllllllllIIlIlIIllIIIIIllIll) {
      return lllllllllllllIIlIlIIllIIIIIllIll != 0;
   }

   private static void llIlllIlIIllIlI() {
      lIIlIlIlIIIlIl = new int[3];
      lIIlIlIlIIIlIl[0] = (0 ^ 19) & ~(187 ^ 168);
      lIIlIlIlIIIlIl[1] = " ".length();
      lIIlIlIlIIIlIl[2] = "  ".length();
   }

   private static void llIlllIlIIllIIl() {
      lIIlIlIlIIIlII = new String[lIIlIlIlIIIlIl[2]];
      lIIlIlIlIIIlII[lIIlIlIlIIIlIl[0]] = llIlllIlIIlIlll("OyY4Nn58fS0oMCp/Ly4hMiZiNih8MzwvazE+LSUvPzs/MhEgNz41ajIiJQ==", "SRLFD");
      lIIlIlIlIIIlII[lIIlIlIlIIIlIl[1]] = llIlllIlIIllIII("ypWJg2wPIjY=", "jaBpx");
   }

   private static String llIlllIlIIlIlll(String lllllllllllllIIlIlIIllIIIIllllIl, String lllllllllllllIIlIlIIllIIIIllIlll) {
      lllllllllllllIIlIlIIllIIIIllllIl = new String(Base64.getDecoder().decode(lllllllllllllIIlIlIIllIIIIllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllIIlIlIIllIIIIlllIll = new StringBuilder();
      char[] lllllllllllllIIlIlIIllIIIIlllIlI = lllllllllllllIIlIlIIllIIIIllIlll.toCharArray();
      int lllllllllllllIIlIlIIllIIIIlllIIl = lIIlIlIlIIIlIl[0];
      char[] lllllllllllllIIlIlIIllIIIIllIIll = lllllllllllllIIlIlIIllIIIIllllIl.toCharArray();
      int lllllllllllllIIlIlIIllIIIIllIIlI = lllllllllllllIIlIlIIllIIIIllIIll.length;
      int lllllllllllllIIlIlIIllIIIIllIIIl = lIIlIlIlIIIlIl[0];

      do {
         if(!llIlllIlIIlllIl(lllllllllllllIIlIlIIllIIIIllIIIl, lllllllllllllIIlIlIIllIIIIllIIlI)) {
            return String.valueOf(lllllllllllllIIlIlIIllIIIIlllIll);
         }

         char lllllllllllllIIlIlIIllIIIIllIIII = lllllllllllllIIlIlIIllIIIIllIIll[lllllllllllllIIlIlIIllIIIIllIIIl];
         lllllllllllllIIlIlIIllIIIIlllIll.append((char)(lllllllllllllIIlIlIIllIIIIllIIII ^ lllllllllllllIIlIlIIllIIIIlllIlI[lllllllllllllIIlIlIIllIIIIlllIIl % lllllllllllllIIlIlIIllIIIIlllIlI.length]));
         "".length();
         ++lllllllllllllIIlIlIIllIIIIlllIIl;
         ++lllllllllllllIIlIlIIllIIIIllIIIl;
         "".length();
      } while(((136 ^ 144) & ~(26 ^ 2)) >= -" ".length());

      return null;
   }

   private static boolean llIlllIlIIlllII(Object lllllllllllllIIlIlIIllIIIIIlllIl) {
      return lllllllllllllIIlIlIIllIIIIIlllIl != null;
   }

   private static String llIlllIlIIllIII(String lllllllllllllIIlIlIIllIIIIlIlIII, String lllllllllllllIIlIlIIllIIIIlIIlIl) {
      try {
         SecretKeySpec lllllllllllllIIlIlIIllIIIIlIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIIllIIIIlIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllIIlIlIIllIIIIlIlIlI = Cipher.getInstance("Blowfish");
         lllllllllllllIIlIlIIllIIIIlIlIlI.init(lIIlIlIlIIIlIl[2], lllllllllllllIIlIlIIllIIIIlIIlII);
         return new String(lllllllllllllIIlIlIIllIIIIlIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIIllIIIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static void check(Minecraft lllllllllllllIIlIlIIllIIIlIlIIII) {
      try {
         String lllllllllllllIIlIlIIllIIIlIlIlII = lllllllllllllIIlIlIIllIIIlIlIIII.getSession().getUsername();

         String lllllllllllllIIlIlIIllIIIlIIllIl;
         label35: {
            try {
               lllllllllllllIIlIlIIllIIIlIIllIl = lllllllllllllIIlIlIIllIIIlIlIIII.getSession().getProfile().getId().toString();
            } catch (NullPointerException var8) {
               lllllllllllllIIlIlIIllIIIlIIllIl = null;
               break label35;
            }

            "".length();
            if("   ".length() <= 0) {
               return;
            }
         }

         Scanner lllllllllllllIIlIlIIllIIIlIIllII = new Scanner((new URL(lIIlIlIlIIIlII[lIIlIlIlIIIlIl[0]])).openStream());

         while(llIlllIlIIllIll(lllllllllllllIIlIlIIllIIIlIIllII.hasNextLine())) {
            String[] lllllllllllllIIlIlIIllIIIlIllIII = lllllllllllllIIlIlIIllIIIlIIllII.nextLine().split(lIIlIlIlIIIlII[lIIlIlIlIIIlIl[1]]);
            String lllllllllllllIIlIlIIllIIIlIlIlll = lllllllllllllIIlIlIIllIIIlIllIII[lIIlIlIlIIIlIl[0]];
            String lllllllllllllIIlIlIIllIIIlIIlIIl = lllllllllllllIIlIlIIllIIIlIllIII[lIIlIlIlIIIlIl[1]];
            String lllllllllllllIIlIlIIllIIIlIIlIII = lllllllllllllIIlIlIIllIIIlIllIII[lIIlIlIlIIIlIl[2]];
            if(llIlllIlIIllIll(lllllllllllllIIlIlIIllIIIlIlIlII.equalsIgnoreCase(lllllllllllllIIlIlIIllIIIlIlIlll))) {
               lllllllllllllIIlIlIIllIIIlIlIIII.displayGuiScreen(new BlacklistGui(lllllllllllllIIlIlIIllIIIlIIlIIl, lllllllllllllIIlIlIIllIIIlIIlIII));
            }

            if(llIlllIlIIlllII(lllllllllllllIIlIlIIllIIIlIIllIl) && llIlllIlIIllIll(lllllllllllllIIlIlIIllIIIlIIllIl.equals(lllllllllllllIIlIlIIllIIIlIlIlll))) {
               lllllllllllllIIlIlIIllIIIlIlIIII.displayGuiScreen(new BlacklistGui(lllllllllllllIIlIlIIllIIIlIIlIIl, lllllllllllllIIlIlIIllIIIlIIlIII));
            }

            "".length();
            if(-"   ".length() > 0) {
               return;
            }
         }
      } catch (IOException var9) {
         var9.printStackTrace();
         return;
      }

      "".length();
      if(-((109 ^ 40) & ~(16 ^ 85) ^ 164 ^ 160) < 0) {
         ;
      }
   }

   private static boolean llIlllIlIIlllIl(int lllllllllllllIIlIlIIllIIIIlIIIII, int lllllllllllllIIlIlIIllIIIIIlllll) {
      return lllllllllllllIIlIlIIllIIIIlIIIII < lllllllllllllIIlIlIIllIIIIIlllll;
   }
}
