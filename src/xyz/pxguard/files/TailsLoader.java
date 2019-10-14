package xyz.pxguard.files;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import xyz.pxguard.files.LoaderObject;

public class TailsLoader {

   public static List userList;
   private static final int[] lllIllIlIIIIl;
   private static final String[] lllIllIIllIIl;


   public static boolean isEmpty() {
      return userList.isEmpty();
   }

   private static boolean lIllIIIIIlllIII(int lllllllllllllIlIllIIIllIIIIlIIII) {
      return lllllllllllllIlIllIIIllIIIIlIIII != 0;
   }

   private static void lIllIIIIIllIlll() {
      lllIllIlIIIIl = new int[5];
      lllIllIlIIIIl[0] = (43 ^ 114) & ~(207 ^ 150);
      lllIllIlIIIIl[1] = " ".length();
      lllIllIlIIIIl[2] = -16403 & 713371;
      lllIllIlIIIIl[3] = "  ".length();
      lllIllIlIIIIl[4] = 203 ^ 195;
   }

   private static String lIllIIIIIlIllII(String lllllllllllllIlIllIIIllIIIIllIIl, String lllllllllllllIlIllIIIllIIIIllIlI) {
      try {
         SecretKeySpec lllllllllllllIlIllIIIllIIIIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIIIllIIIIllIlI.getBytes(StandardCharsets.UTF_8)), lllIllIlIIIIl[4]), "DES");
         Cipher lllllllllllllIlIllIIIllIIIIlllIl = Cipher.getInstance("DES");
         lllllllllllllIlIllIIIllIIIIlllIl.init(lllIllIlIIIIl[3], lllllllllllllIlIllIIIllIIIIlllII);
         return new String(lllllllllllllIlIllIIIllIIIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIIIllIIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static void loadWings() {
      try {
         Scanner lllllllllllllIlIllIIIllIIlIlIlII = new Scanner((new URL(lllIllIIllIIl[lllIllIlIIIIl[0]])).openStream());

         while(lIllIIIIIlllIII(lllllllllllllIlIllIIIllIIlIlIlII.hasNext())) {
            String[] lllllllllllllIlIllIIIllIIlIllIIl = lllllllllllllIlIllIIIllIIlIlIlII.next().split(lllIllIIllIIl[lllIllIlIIIIl[1]]);
            String lllllllllllllIlIllIIIllIIlIllIII = lllllllllllllIlIllIIIllIIlIllIIl[lllIllIlIIIIl[0]];
            int lllllllllllllIlIllIIIllIIlIlIIIl = Integer.parseInt(lllllllllllllIlIllIIIllIIlIllIIl[lllIllIlIIIIl[1]]);
            userList.add(new LoaderObject(lllllllllllllIlIllIIIllIIlIllIII, lllllllllllllIlIllIIIllIIlIlIIIl));
            "".length();
            "".length();
            if(null != null) {
               return;
            }
         }
      } catch (IOException var4) {
         var4.printStackTrace();
         return;
      }

      "".length();
      if("  ".length() < "   ".length()) {
         ;
      }
   }

   public static int getID(String lllllllllllllIlIllIIIllIIlIIlIll) {
      int lllllllllllllIlIllIIIllIIlIIlIlI = lllIllIlIIIIl[2];
      Iterator lllllllllllllIlIllIIIllIIlIIIlll = userList.iterator();

      do {
         if(!lIllIIIIIlllIII(lllllllllllllIlIllIIIllIIlIIIlll.hasNext())) {
            return lllllllllllllIlIllIIIllIIlIIlIlI;
         }

         LoaderObject lllllllllllllIlIllIIIllIIlIIllII = (LoaderObject)lllllllllllllIlIllIIIllIIlIIIlll.next();
         if(lIllIIIIIlllIII(lllllllllllllIlIllIIIllIIlIIllII.getUsername().equalsIgnoreCase(lllllllllllllIlIllIIIllIIlIIlIll))) {
            lllllllllllllIlIllIIIllIIlIIlIlI = lllllllllllllIlIllIIIllIIlIIllII.getId();
         }

         "".length();
      } while("  ".length() > 0);

      return (180 ^ 162 ^ 169 ^ 172) & (92 ^ 91 ^ 175 ^ 187 ^ -" ".length());
   }

   public static boolean haveWings(String lllllllllllllIlIllIIIllIIIlllllI) {
      int lllllllllllllIlIllIIIllIIIllllIl = lllIllIlIIIIl[0];
      Iterator lllllllllllllIlIllIIIllIIIllllII = userList.iterator();

      do {
         if(!lIllIIIIIlllIII(lllllllllllllIlIllIIIllIIIllllII.hasNext())) {
            return (boolean)lllllllllllllIlIllIIIllIIIllllIl;
         }

         LoaderObject lllllllllllllIlIllIIIllIIlIIIIIl = (LoaderObject)lllllllllllllIlIllIIIllIIIllllII.next();
         if(lIllIIIIIlllIII(lllllllllllllIlIllIIIllIIlIIIIIl.getUsername().equalsIgnoreCase(lllllllllllllIlIllIIIllIIIlllllI))) {
            lllllllllllllIlIllIIIllIIIllllIl = lllIllIlIIIIl[1];
         }

         "".length();
      } while(" ".length() >= 0);

      return (boolean)((186 + 25 - 15 + 15 ^ 32 + 153 - 163 + 176) & (217 ^ 173 ^ 17 ^ 112 ^ -" ".length()));
   }

   static {
      lIllIIIIIllIlll();
      lIllIIIIIlIllll();
      userList = new ArrayList();
   }

   private static void lIllIIIIIlIllll() {
      lllIllIIllIIl = new String[lllIllIlIIIIl[3]];
      lllIllIIllIIl[lllIllIlIIIIl[0]] = lIllIIIIIlIllII("N2LQ9RVLqCl//XubKZXqzDg6i/Uk3l5kGi2FR/6RetHtH5AB4bIjOQ==", "ULyQl");
      lllIllIIllIIl[lllIllIlIIIIl[1]] = lIllIIIIIlIlllI("fA==", "FoTHH");
   }

   private static String lIllIIIIIlIlllI(String lllllllllllllIlIllIIIllIIIllIIII, String lllllllllllllIlIllIIIllIIIlIlIlI) {
      lllllllllllllIlIllIIIllIIIllIIII = new String(Base64.getDecoder().decode(lllllllllllllIlIllIIIllIIIllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllIlIllIIIllIIIlIlIIl = new StringBuilder();
      char[] lllllllllllllIlIllIIIllIIIlIllIl = lllllllllllllIlIllIIIllIIIlIlIlI.toCharArray();
      int lllllllllllllIlIllIIIllIIIlIIlll = lllIllIlIIIIl[0];
      char[] lllllllllllllIlIllIIIllIIIlIIllI = lllllllllllllIlIllIIIllIIIllIIII.toCharArray();
      int lllllllllllllIlIllIIIllIIIlIIlIl = lllllllllllllIlIllIIIllIIIlIIllI.length;
      int lllllllllllllIlIllIIIllIIIlIIlII = lllIllIlIIIIl[0];

      do {
         if(!lIllIIIIIlllIIl(lllllllllllllIlIllIIIllIIIlIIlII, lllllllllllllIlIllIIIllIIIlIIlIl)) {
            return String.valueOf(lllllllllllllIlIllIIIllIIIlIlIIl);
         }

         char lllllllllllllIlIllIIIllIIIllIIIl = lllllllllllllIlIllIIIllIIIlIIllI[lllllllllllllIlIllIIIllIIIlIIlII];
         lllllllllllllIlIllIIIllIIIlIlIIl.append((char)(lllllllllllllIlIllIIIllIIIllIIIl ^ lllllllllllllIlIllIIIllIIIlIllIl[lllllllllllllIlIllIIIllIIIlIIlll % lllllllllllllIlIllIIIllIIIlIllIl.length]));
         "".length();
         ++lllllllllllllIlIllIIIllIIIlIIlll;
         ++lllllllllllllIlIllIIIllIIIlIIlII;
         "".length();
      } while((154 ^ 158) > "   ".length());

      return null;
   }

   public static String lastPlayer() {
      return ((LoaderObject)userList.get(userList.size() - lllIllIlIIIIl[1])).getUsername();
   }

   private static boolean lIllIIIIIlllIIl(int lllllllllllllIlIllIIIllIIIIlIIll, int lllllllllllllIlIllIIIllIIIIlIIlI) {
      return lllllllllllllIlIllIIIllIIIIlIIll < lllllllllllllIlIllIIIllIIIIlIIlI;
   }
}
