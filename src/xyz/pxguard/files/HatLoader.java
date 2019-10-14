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

public class HatLoader {

   public static List userList;
   private static final String[] lIlIllIIlIIII;
   private static final int[] lIlIllIIlIIll;


   public static void loadWings() {
      try {
         Scanner llllllllllllllIIIlIIllllIIlIIIll = new Scanner((new URL(lIlIllIIlIIII[lIlIllIIlIIll[0]])).openStream());

         while(lIIIIIIIIIlIllI(llllllllllllllIIIlIIllllIIlIIIll.hasNext())) {
            String[] llllllllllllllIIIlIIllllIIlIIIII = llllllllllllllIIIlIIllllIIlIIIll.next().split(lIlIllIIlIIII[lIlIllIIlIIll[1]]);
            String llllllllllllllIIIlIIllllIIIlllll = llllllllllllllIIIlIIllllIIlIIIII[lIlIllIIlIIll[0]];
            int llllllllllllllIIIlIIllllIIlIIlII = Integer.parseInt(llllllllllllllIIIlIIllllIIlIIIII[lIlIllIIlIIll[1]]);
            userList.add(new LoaderObject(llllllllllllllIIIlIIllllIIIlllll, llllllllllllllIIIlIIllllIIlIIlII));
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
      if(((188 ^ 162) & ~(95 ^ 65)) > -" ".length()) {
         ;
      }
   }

   private static void lIIIIIIIIIlIIII() {
      lIlIllIIlIIII = new String[lIlIllIIlIIll[3]];
      lIlIllIIlIIII[lIlIllIIlIIll[0]] = lIIIIIIIIIIllll("aLl634sHmloy1g0R/LXDpxDwXR0Pey/MuHnLEthlNx21Wlh1Ixl7tQ==", "sQXap");
      lIlIllIIlIIII[lIlIllIIlIIll[1]] = lIIIIIIIIIIllll("JWQD3cdDIeg=", "PMgMM");
   }

   public static int getID(String llllllllllllllIIIlIIllllIIIllIII) {
      int llllllllllllllIIIlIIllllIIIlIlIl = lIlIllIIlIIll[2];
      Iterator llllllllllllllIIIlIIllllIIIlIlII = userList.iterator();

      do {
         if(!lIIIIIIIIIlIllI(llllllllllllllIIIlIIllllIIIlIlII.hasNext())) {
            return llllllllllllllIIIlIIllllIIIlIlIl;
         }

         LoaderObject llllllllllllllIIIlIIllllIIIlIIll = (LoaderObject)llllllllllllllIIIlIIllllIIIlIlII.next();
         if(lIIIIIIIIIlIllI(llllllllllllllIIIlIIllllIIIlIIll.getUsername().equalsIgnoreCase(llllllllllllllIIIlIIllllIIIllIII))) {
            llllllllllllllIIIlIIllllIIIlIlIl = llllllllllllllIIIlIIllllIIIlIIll.getId();
         }

         "".length();
      } while(((78 + 36 - 27 + 57 ^ 122 + 120 - 221 + 118) & (198 ^ 192 ^ 110 ^ 115 ^ -" ".length())) == ((233 ^ 190 ^ 215 ^ 190) & (105 + 90 - 175 + 107 ^ 44 ^ 109 ^ -" ".length())));

      return (218 ^ 148 ^ 232 ^ 152) & (233 ^ 154 ^ 71 ^ 10 ^ -" ".length());
   }

   private static void lIIIIIIIIIlIlIl() {
      lIlIllIIlIIll = new int[4];
      lIlIllIIlIIll[0] = (198 ^ 195) & ~(63 ^ 58);
      lIlIllIIlIIll[1] = " ".length();
      lIlIllIIlIIll[2] = -7441 & 704409;
      lIlIllIIlIIll[3] = "  ".length();
   }

   public static boolean isEmpty() {
      return userList.isEmpty();
   }

   static {
      lIIIIIIIIIlIlIl();
      lIIIIIIIIIlIIII();
      userList = new ArrayList();
   }

   private static String lIIIIIIIIIIllll(String llllllllllllllIIIlIIlllIlllllllI, String llllllllllllllIIIlIIlllIllllllll) {
      try {
         SecretKeySpec llllllllllllllIIIlIIllllIIIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIIIlIIlllIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher llllllllllllllIIIlIIlllIlllllIll = Cipher.getInstance("Blowfish");
         llllllllllllllIIIlIIlllIlllllIll.init(lIlIllIIlIIll[3], llllllllllllllIIIlIIllllIIIIIIll);
         return new String(llllllllllllllIIIlIIlllIlllllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIIIlIIlllIlllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIIIIIIIIIlIllI(int llllllllllllllIIIlIIlllIlllllIIl) {
      return llllllllllllllIIIlIIlllIlllllIIl != 0;
   }

   public static boolean haveWings(String llllllllllllllIIIlIIllllIIIIllIl) {
      int llllllllllllllIIIlIIllllIIIIlIlI = lIlIllIIlIIll[0];
      Iterator llllllllllllllIIIlIIllllIIIIlIIl = userList.iterator();

      do {
         if(!lIIIIIIIIIlIllI(llllllllllllllIIIlIIllllIIIIlIIl.hasNext())) {
            return (boolean)llllllllllllllIIIlIIllllIIIIlIlI;
         }

         LoaderObject llllllllllllllIIIlIIllllIIIIlIII = (LoaderObject)llllllllllllllIIIlIIllllIIIIlIIl.next();
         if(lIIIIIIIIIlIllI(llllllllllllllIIIlIIllllIIIIlIII.getUsername().equalsIgnoreCase(llllllllllllllIIIlIIllllIIIIllIl))) {
            llllllllllllllIIIlIIllllIIIIlIlI = lIlIllIIlIIll[1];
         }

         "".length();
      } while((128 ^ 132) != "  ".length());

      return (boolean)((63 ^ 115) & ~(20 ^ 88));
   }

   public static String lastPlayer() {
      return ((LoaderObject)userList.get(userList.size() - lIlIllIIlIIll[1])).getUsername();
   }
}
