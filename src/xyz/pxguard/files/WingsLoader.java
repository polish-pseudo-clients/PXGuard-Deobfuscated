package xyz.pxguard.files;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import xyz.pxguard.files.LoaderObject;

public class WingsLoader {

   public static List userList;
   private static final int[] lIllIIlIIlIll;
   private static final String[] lIllIIlIIIllI;


   private static boolean lIIIIlIIIllllII(int llllllllllllllIIIIlIlIIllllIlllI) {
      return llllllllllllllIIIIlIlIIllllIlllI != 0;
   }

   static {
      lIIIIlIIIlllIll();
      lIIIIlIIIllIIII();
      userList = new ArrayList();
   }

   public static int getID(String llllllllllllllIIIIlIlIlIIIlIIlll) {
      int llllllllllllllIIIIlIlIlIIIlIIllI = lIllIIlIIlIll[2];
      Iterator llllllllllllllIIIIlIlIlIIIlIIlIl = userList.iterator();

      do {
         if(!lIIIIlIIIllllII(llllllllllllllIIIIlIlIlIIIlIIlIl.hasNext())) {
            return llllllllllllllIIIIlIlIlIIIlIIllI;
         }

         LoaderObject llllllllllllllIIIIlIlIlIIIlIIlII = (LoaderObject)llllllllllllllIIIIlIlIlIIIlIIlIl.next();
         if(lIIIIlIIIllllII(llllllllllllllIIIIlIlIlIIIlIIlII.getUsername().equalsIgnoreCase(llllllllllllllIIIIlIlIlIIIlIIlll))) {
            llllllllllllllIIIIlIlIlIIIlIIllI = llllllllllllllIIIIlIlIlIIIlIIlII.getId();
         }

         "".length();
      } while(null == null);

      return (231 ^ 176 ^ 90 ^ 51) & (142 + 68 - 194 + 171 ^ 37 + 28 - -52 + 16 ^ -" ".length());
   }

   private static String lIIIIlIIIlIlIlI(String llllllllllllllIIIIlIlIlIIIIIlIIl, String llllllllllllllIIIIlIlIlIIIIIlIII) {
      llllllllllllllIIIIlIlIlIIIIIlIIl = new String(Base64.getDecoder().decode(llllllllllllllIIIIlIlIlIIIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder llllllllllllllIIIIlIlIlIIIIIIlll = new StringBuilder();
      char[] llllllllllllllIIIIlIlIlIIIIIIllI = llllllllllllllIIIIlIlIlIIIIIlIII.toCharArray();
      int llllllllllllllIIIIlIlIlIIIIIIlIl = lIllIIlIIlIll[0];
      char[] llllllllllllllIIIIlIlIlIIIIIIlII = llllllllllllllIIIIlIlIlIIIIIlIIl.toCharArray();
      int llllllllllllllIIIIlIlIlIIIIIIIll = llllllllllllllIIIIlIlIlIIIIIIlII.length;
      int llllllllllllllIIIIlIlIlIIIIIIIlI = lIllIIlIIlIll[0];

      do {
         if(!lIIIIlIIIllllIl(llllllllllllllIIIIlIlIlIIIIIIIlI, llllllllllllllIIIIlIlIlIIIIIIIll)) {
            return String.valueOf(llllllllllllllIIIIlIlIlIIIIIIlll);
         }

         char llllllllllllllIIIIlIlIlIIIIIIIIl = llllllllllllllIIIIlIlIlIIIIIIlII[llllllllllllllIIIIlIlIlIIIIIIIlI];
         llllllllllllllIIIIlIlIlIIIIIIlll.append((char)(llllllllllllllIIIIlIlIlIIIIIIIIl ^ llllllllllllllIIIIlIlIlIIIIIIllI[llllllllllllllIIIIlIlIlIIIIIIlIl % llllllllllllllIIIIlIlIlIIIIIIllI.length]));
         "".length();
         ++llllllllllllllIIIIlIlIlIIIIIIlIl;
         ++llllllllllllllIIIIlIlIlIIIIIIIlI;
         "".length();
      } while(-"   ".length() < 0);

      return null;
   }

   public static String lastPlayer() {
      return ((LoaderObject)userList.get(userList.size() - lIllIIlIIlIll[1])).getUsername();
   }

   private static void lIIIIlIIIlllIll() {
      lIllIIlIIlIll = new int[4];
      lIllIIlIIlIll[0] = (47 ^ 43) & ~(68 ^ 64);
      lIllIIlIIlIll[1] = " ".length();
      lIllIIlIIlIll[2] = -(-4297 & 21707) & -2145 & 716523;
      lIllIIlIIlIll[3] = "  ".length();
   }

   public static boolean haveWings(String llllllllllllllIIIIlIlIlIIIIlllII) {
      int llllllllllllllIIIIlIlIlIIIIlllIl = lIllIIlIIlIll[0];
      Iterator llllllllllllllIIIIlIlIlIIIIllIlI = userList.iterator();

      do {
         if(!lIIIIlIIIllllII(llllllllllllllIIIIlIlIlIIIIllIlI.hasNext())) {
            return (boolean)llllllllllllllIIIIlIlIlIIIIlllIl;
         }

         LoaderObject llllllllllllllIIIIlIlIlIIIIllIIl = (LoaderObject)llllllllllllllIIIIlIlIlIIIIllIlI.next();
         if(lIIIIlIIIllllII(llllllllllllllIIIIlIlIlIIIIllIIl.getUsername().equalsIgnoreCase(llllllllllllllIIIIlIlIlIIIIlllII))) {
            llllllllllllllIIIIlIlIlIIIIlllIl = lIllIIlIIlIll[1];
         }

         "".length();
      } while(-"   ".length() <= 0);

      return (boolean)((192 ^ 149) & ~(96 ^ 53));
   }

   public static boolean isEmpty() {
      return userList.isEmpty();
   }

   private static boolean lIIIIlIIIllllIl(int llllllllllllllIIIIlIlIIlllllIIIl, int llllllllllllllIIIIlIlIIlllllIIII) {
      return llllllllllllllIIIIlIlIIlllllIIIl < llllllllllllllIIIIlIlIIlllllIIII;
   }

   public static void loadWings() {
      try {
         Scanner llllllllllllllIIIIlIlIlIIIllIIll = new Scanner((new URL(lIllIIlIIIllI[lIllIIlIIlIll[0]])).openStream());

         while(lIIIIlIIIllllII(llllllllllllllIIIIlIlIlIIIllIIll.hasNext())) {
            String[] llllllllllllllIIIIlIlIlIIIllIIIl = llllllllllllllIIIIlIlIlIIIllIIll.next().split(lIllIIlIIIllI[lIllIIlIIlIll[1]]);
            String llllllllllllllIIIIlIlIlIIIllIIII = llllllllllllllIIIIlIlIlIIIllIIIl[lIllIIlIIlIll[0]];
            int llllllllllllllIIIIlIlIlIIIllIlIl = Integer.parseInt(llllllllllllllIIIIlIlIlIIIllIIIl[lIllIIlIIlIll[1]]);
            userList.add(new LoaderObject(llllllllllllllIIIIlIlIlIIIllIIII, llllllllllllllIIIIlIlIlIIIllIlIl));
            "".length();
            "".length();
            if(" ".length() == 0) {
               return;
            }
         }
      } catch (IOException var4) {
         var4.printStackTrace();
         return;
      }

      "".length();
      if(((25 ^ 113 ^ 248 ^ 198) & (111 ^ 107 ^ 233 ^ 187 ^ -" ".length())) != " ".length()) {
         ;
      }
   }

   private static String lIIIIlIIIlIllII(String llllllllllllllIIIIlIlIIllllllIIl, String llllllllllllllIIIIlIlIIlllllIllI) {
      try {
         SecretKeySpec llllllllllllllIIIIlIlIIlllllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIIIIlIlIIlllllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher llllllllllllllIIIIlIlIIlllllIlII = Cipher.getInstance("Blowfish");
         llllllllllllllIIIIlIlIIlllllIlII.init(lIllIIlIIlIll[3], llllllllllllllIIIIlIlIIlllllIlIl);
         return new String(llllllllllllllIIIIlIlIIlllllIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIIIIlIlIIllllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIIIIlIIIllIIII() {
      lIllIIlIIIllI = new String[lIllIIlIIlIll[3]];
      lIllIIlIIIllI[lIllIIlIIlIll[0]] = lIIIIlIIIlIlIlI("BAElNHZDWjAqOBVYMiwpDQF/NCBDFCEtYxscPyM/QhQhLQ==", "luQDL");
      lIllIIlIIIllI[lIllIIlIIlIll[1]] = lIIIIlIIIlIllII("u9qmXQwppuw=", "EZXAt");
   }
}
