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

public class ItemsLoader {

   public static List userList;
   private static final int[] llllIllIlllII;
   private static final String[] llllIllIllIll;


   public static String lastPlayer() {
      return ((LoaderObject)userList.get(userList.size() - llllIllIlllII[1])).getUsername();
   }

   private static String lIlllIIIIlIlIll(String lllllllllllllIlIlIIIIIIlllIIlllI, String lllllllllllllIlIlIIIIIIlllIIllll) {
      try {
         SecretKeySpec lllllllllllllIlIlIIIIIIlllIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIIIIIlllIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllIlIlIIIIIIlllIlIIlI = Cipher.getInstance("Blowfish");
         lllllllllllllIlIlIIIIIIlllIlIIlI.init(llllIllIlllII[3], lllllllllllllIlIlIIIIIIlllIlIIIl);
         return new String(lllllllllllllIlIlIIIIIIlllIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIIIIIlllIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static String lIlllIIIIlIlIlI(String lllllllllllllIlIlIIIIIIlllIlllIl, String lllllllllllllIlIlIIIIIIlllIllIlI) {
      try {
         SecretKeySpec lllllllllllllIlIlIIIIIIlllIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIIIIIlllIllIlI.getBytes(StandardCharsets.UTF_8)), llllIllIlllII[4]), "DES");
         Cipher lllllllllllllIlIlIIIIIIlllIllIII = Cipher.getInstance("DES");
         lllllllllllllIlIlIIIIIIlllIllIII.init(llllIllIlllII[3], lllllllllllllIlIlIIIIIIlllIllIIl);
         return new String(lllllllllllllIlIlIIIIIIlllIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIIIIIlllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static void loadWings() {
      try {
         Scanner lllllllllllllIlIlIIIIIIllllllllI = new Scanner((new URL(llllIllIllIll[llllIllIlllII[0]])).openStream());

         while(lIlllIIIIlIlllI(lllllllllllllIlIlIIIIIIllllllllI.hasNext())) {
            String[] lllllllllllllIlIlIIIIIIlllllllIl = lllllllllllllIlIlIIIIIIllllllllI.next().split(llllIllIllIll[llllIllIlllII[1]]);
            String lllllllllllllIlIlIIIIIIlllllllII = lllllllllllllIlIlIIIIIIlllllllIl[llllIllIlllII[0]];
            int lllllllllllllIlIlIIIIIIllllllIll = Integer.parseInt(lllllllllllllIlIlIIIIIIlllllllIl[llllIllIlllII[1]]);
            userList.add(new LoaderObject(lllllllllllllIlIlIIIIIIlllllllII, lllllllllllllIlIlIIIIIIllllllIll));
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
      if(null == null) {
         ;
      }
   }

   static {
      lIlllIIIIlIllIl();
      lIlllIIIIlIllII();
      userList = new ArrayList();
   }

   private static void lIlllIIIIlIllIl() {
      llllIllIlllII = new int[5];
      llllIllIlllII[0] = (178 ^ 133 ^ 19 ^ 124) & (106 ^ 91 ^ 198 ^ 175 ^ -" ".length());
      llllIllIlllII[1] = " ".length();
      llllIllIlllII[2] = -(-9229 & 32125) & -1027 & 720891;
      llllIllIlllII[3] = "  ".length();
      llllIllIlllII[4] = 87 + 49 - 33 + 81 ^ 28 + 43 - -65 + 40;
   }

   public static boolean haveWings(String lllllllllllllIlIlIIIIIIllllIlIlI) {
      int lllllllllllllIlIlIIIIIIllllIlIIl = llllIllIlllII[0];
      Iterator lllllllllllllIlIlIIIIIIllllIIllI = userList.iterator();

      do {
         if(!lIlllIIIIlIlllI(lllllllllllllIlIlIIIIIIllllIIllI.hasNext())) {
            return (boolean)lllllllllllllIlIlIIIIIIllllIlIIl;
         }

         LoaderObject lllllllllllllIlIlIIIIIIllllIlIll = (LoaderObject)lllllllllllllIlIlIIIIIIllllIIllI.next();
         if(lIlllIIIIlIlllI(lllllllllllllIlIlIIIIIIllllIlIll.getUsername().equalsIgnoreCase(lllllllllllllIlIlIIIIIIllllIlIlI))) {
            lllllllllllllIlIlIIIIIIllllIlIIl = llllIllIlllII[1];
         }

         "".length();
      } while((17 ^ 89 ^ 206 ^ 131) > 0);

      return (boolean)((225 ^ 128 ^ 193 ^ 129) & (229 ^ 155 ^ 80 ^ 15 ^ -" ".length()));
   }

   public static int getID(String lllllllllllllIlIlIIIIIIlllllIlIl) {
      int lllllllllllllIlIlIIIIIIlllllIlII = llllIllIlllII[2];
      Iterator lllllllllllllIlIlIIIIIIlllllIIIl = userList.iterator();

      do {
         if(!lIlllIIIIlIlllI(lllllllllllllIlIlIIIIIIlllllIIIl.hasNext())) {
            return lllllllllllllIlIlIIIIIIlllllIlII;
         }

         LoaderObject lllllllllllllIlIlIIIIIIlllllIllI = (LoaderObject)lllllllllllllIlIlIIIIIIlllllIIIl.next();
         if(lIlllIIIIlIlllI(lllllllllllllIlIlIIIIIIlllllIllI.getUsername().equalsIgnoreCase(lllllllllllllIlIlIIIIIIlllllIlIl))) {
            lllllllllllllIlIlIIIIIIlllllIlII = lllllllllllllIlIlIIIIIIlllllIllI.getId();
         }

         "".length();
      } while(-"  ".length() <= 0);

      return (112 ^ 79) & ~(109 ^ 82);
   }

   public static boolean isEmpty() {
      return userList.isEmpty();
   }

   private static boolean lIlllIIIIlIlllI(int lllllllllllllIlIlIIIIIIlllIIlIIl) {
      return lllllllllllllIlIlIIIIIIlllIIlIIl != 0;
   }

   private static void lIlllIIIIlIllII() {
      llllIllIllIll = new String[llllIllIlllII[3]];
      llllIllIllIll[llllIllIlllII[0]] = lIlllIIIIlIlIlI("6OeRXe97kHfopAUWLDGpFchKr5hBAN/nr3JRwn8Avd9bq7C1h1ZRYA==", "ZUTHV");
      llllIllIllIll[llllIllIlllII[1]] = lIlllIIIIlIlIll("xhtsaawLP0E=", "OwAkG");
   }
}
