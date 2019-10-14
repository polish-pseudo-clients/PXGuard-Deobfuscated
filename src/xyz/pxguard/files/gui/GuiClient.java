package xyz.pxguard.files.gui;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiYesNoCallback;
import net.minecraft.client.resources.I18n;
import xyz.pxguard.files.HatLoader;
import xyz.pxguard.files.ItemsLoader;
import xyz.pxguard.files.TailsLoader;
import xyz.pxguard.files.WingsLoader;
import xyz.pxguard.files.gui.GuiArrange;
import xyz.pxguard.files.modules.AutoSprint;
import xyz.pxguard.files.modules.Modules;
import xyz.pxguard.files.utils.ChatUtils;

public class GuiClient extends GuiScreen implements GuiYesNoCallback {

   private String field_146442_a;
   private static final int[] llIlllllIlIlI;
   private static final String[] llIlllllIIIII;
   private final GuiScreen field_146441_g;
   public static List userList;
   private String nick;
   private String id;
   public static int kom;
   private AbstractClientPlayer p_downloadCape_0_;


   private static boolean lIlIIlIllIlllIl(int lllllllllllllIllIIIllIlIIlIIlllI) {
      return lllllllllllllIllIIIllIlIIlIIlllI == 0;
   }

   public void drawScreen(int lllllllllllllIllIIIllIlIlIIlIlII, int lllllllllllllIllIIIllIlIlIIlIIll, float lllllllllllllIllIIIllIlIlIIlIIlI) {
      lllllllllllllIllIIIllIlIlIIlIlIl.drawDefaultBackground();
      lllllllllllllIllIIIllIlIlIIlIlIl.drawCenteredString(lllllllllllllIllIIIllIlIlIIlIlIl.fontRendererObj, lllllllllllllIllIIIllIlIlIIlIlIl.field_146442_a, lllllllllllllIllIIIllIlIlIIlIlIl.width / llIlllllIlIlI[3], llIlllllIlIlI[31], llIlllllIlIlI[52]);
      super.drawScreen(lllllllllllllIllIIIllIlIlIIlIlII, lllllllllllllIllIIIllIlIlIIlIIll, lllllllllllllIllIIIllIlIlIIlIIlI);
   }

   private static String lIlIIlIllIIlIIl(String lllllllllllllIllIIIllIlIIlllIllI, String lllllllllllllIllIIIllIlIIlllIlIl) {
      lllllllllllllIllIIIllIlIIlllIllI = new String(Base64.getDecoder().decode(lllllllllllllIllIIIllIlIIlllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllIllIIIllIlIIlllIlII = new StringBuilder();
      char[] lllllllllllllIllIIIllIlIIlllIIll = lllllllllllllIllIIIllIlIIlllIlIl.toCharArray();
      int lllllllllllllIllIIIllIlIIllIllIl = llIlllllIlIlI[0];
      char[] lllllllllllllIllIIIllIlIIllIllII = lllllllllllllIllIIIllIlIIlllIllI.toCharArray();
      int lllllllllllllIllIIIllIlIIllIlIll = lllllllllllllIllIIIllIlIIllIllII.length;
      int lllllllllllllIllIIIllIlIIllIlIlI = llIlllllIlIlI[0];

      do {
         if(!lIlIIlIllIlllll(lllllllllllllIllIIIllIlIIllIlIlI, lllllllllllllIllIIIllIlIIllIlIll)) {
            return String.valueOf(lllllllllllllIllIIIllIlIIlllIlII);
         }

         char lllllllllllllIllIIIllIlIIllIlIIl = lllllllllllllIllIIIllIlIIllIllII[lllllllllllllIllIIIllIlIIllIlIlI];
         lllllllllllllIllIIIllIlIIlllIlII.append((char)(lllllllllllllIllIIIllIlIIllIlIIl ^ lllllllllllllIllIIIllIlIIlllIIll[lllllllllllllIllIIIllIlIIllIllIl % lllllllllllllIllIIIllIlIIlllIIll.length]));
         "".length();
         ++lllllllllllllIllIIIllIlIIllIllIl;
         ++lllllllllllllIllIIIllIlIIllIlIlI;
         "".length();
      } while((3 ^ 6) != 0);

      return null;
   }

   private static String lIlIIlIllIIlIII(String lllllllllllllIllIIIllIlIlIIIIllI, String lllllllllllllIllIIIllIlIlIIIIIll) {
      try {
         SecretKeySpec lllllllllllllIllIIIllIlIlIIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIllIIIllIlIlIIIIIll.getBytes(StandardCharsets.UTF_8)), llIlllllIlIlI[18]), "DES");
         Cipher lllllllllllllIllIIIllIlIlIIIIIIl = Cipher.getInstance("DES");
         lllllllllllllIllIIIllIlIlIIIIIIl.init(llIlllllIlIlI[3], lllllllllllllIllIIIllIlIlIIIlIIl);
         return new String(lllllllllllllIllIIIllIlIlIIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIllIIIllIlIlIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static boolean lIlIIlIllIlllll(int lllllllllllllIllIIIllIlIIlIlIlIl, int lllllllllllllIllIIIllIlIIlIlIlII) {
      return lllllllllllllIllIIIllIlIIlIlIlIl < lllllllllllllIllIIIllIlIIlIlIlII;
   }

   private static void lIlIIlIllIllIIl() {
      llIlllllIIIII = new String[llIlllllIlIlI[53]];
      llIlllllIIIII[llIlllllIlIlI[0]] = lIlIIlIllIIlIII("BzinhOJTTKjjts4izGwmLw==", "YlZmu");
      llIlllllIIIII[llIlllllIlIlI[1]] = lIlIIlIllIIlIII("+JSriVvTmzpyyVLFaeCSQA==", "EhhLO");
      llIlllllIIIII[llIlllllIlIlI[3]] = lIlIIlIllIIlIIl("AyktPDIh", "DFYSE");
      llIlllllIIIII[llIlllllIlIlI[12]] = lIlIIlIllIIlIIl("Fxs9AyAyHnYRMTUOLwY2Jk52", "GtVbZ");
      llIlllllIIIII[llIlllllIlIlI[13]] = lIlIIlIllIIlIlI("TF6AGX7/q6vcuIhO2lOdNA==", "Qikix");
      llIlllllIIIII[llIlllllIlIlI[14]] = lIlIIlIllIIlIII("xTszqDyfIMVRTfJso3z2Vw==", "sOOrX");
      llIlllllIIIII[llIlllllIlIlI[5]] = lIlIIlIllIIlIIl("ABk5KAUxDzYnSSMAMTcQNAci", "PkCMi");
      llIlllllIIIII[llIlllllIlIlI[17]] = lIlIIlIllIIlIlI("Bh2lJuyYGQWAqgiVrOngCfTDVU1XPVw6", "Wdjtv");
      llIlllllIIIII[llIlllllIlIlI[18]] = lIlIIlIllIIlIIl("wqnDkGAMBiA=", "kwRXG");
      llIlllllIIIII[llIlllllIlIlI[19]] = lIlIIlIllIIlIII("rJmElgwtz5gdE81oKR4+Xg==", "yCbkh");
      llIlllllIIIII[llIlllllIlIlI[22]] = lIlIIlIllIIlIlI("FH+5wtu7GUstGNVd+NbXcw==", "Abqyg");
      llIlllllIIIII[llIlllllIlIlI[23]] = lIlIIlIllIIlIIl("woXDo1oaEgw=", "GDhNS");
      llIlllllIIIII[llIlllllIlIlI[24]] = lIlIIlIllIIlIIl("wpjDszQEAB8=", "ZTWJI");
      llIlllllIIIII[llIlllllIlIlI[27]] = lIlIIlIllIIlIII("anxJVB2lQftUjAN33vmUmFw1T72AS0GK", "usIXe");
      llIlllllIIIII[llIlllllIlIlI[30]] = lIlIIlIllIIlIII("z0tj5rGofQtD4op6VM4L4Q==", "eGZpZ");
      llIlllllIIIII[llIlllllIlIlI[31]] = lIlIIlIllIIlIlI("WB8dPq3onUliPIAGbmVAlg==", "xlbvx");
      llIlllllIIIII[llIlllllIlIlI[32]] = lIlIIlIllIIlIII("Phta27OmSON2nuh3tLcIfA==", "hpvFR");
      llIlllllIIIII[llIlllllIlIlI[35]] = lIlIIlIllIIlIlI("zQa6JLXls6+gdf/FDIrXnw==", "cStYv");
      llIlllllIIIII[llIlllllIlIlI[36]] = lIlIIlIllIIlIlI("Xlu2b9wX/nei+hE23gC7ww==", "vmFCd");
      llIlllllIIIII[llIlllllIlIlI[37]] = lIlIIlIllIIlIIl("wpjDthskGR8=", "ZQxjP");
      llIlllllIIIII[llIlllllIlIlI[8]] = lIlIIlIllIIlIIl("Gik7Jyk/LHA1ODg8KSI/K3xw", "JFPFS");
      llIlllllIIIII[llIlllllIlIlI[38]] = lIlIIlIllIIlIIl("wqrDhngdEyM=", "haJIR");
      llIlllllIIIII[llIlllllIlIlI[39]] = lIlIIlIllIIlIlI("ChGy0by53R3ycACEM07CwQ==", "dwjIK");
      llIlllllIIIII[llIlllllIlIlI[40]] = lIlIIlIllIIlIlI("XbiSi11d5//cn6eIp4RsB0R2XNaGYDpb", "wihkN");
      llIlllllIIIII[llIlllllIlIlI[41]] = lIlIIlIllIIlIlI("Bun3WsuJYqvGbtXXN2gJQg==", "jKMrZ");
      llIlllllIIIII[llIlllllIlIlI[42]] = lIlIIlIllIIlIIl("woHDnyA5LAY=", "CxCwe");
      llIlllllIIIII[llIlllllIlIlI[43]] = lIlIIlIllIIlIlI("vXqTmm7usD1rb4dur489mw==", "hHXRg");
      llIlllllIIIII[llIlllllIlIlI[44]] = lIlIIlIllIIlIIl("wq3DjEcSJCQ=", "okuFe");
      llIlllllIIIII[llIlllllIlIlI[45]] = lIlIIlIllIIlIIl("wrDDrDkcPzc=", "rKZRv");
      llIlllllIIIII[llIlllllIlIlI[46]] = lIlIIlIllIIlIII("7gHMq0nsl/AR2MaeBGy/Hw==", "BtUtx");
      llIlllllIIIII[llIlllllIlIlI[47]] = lIlIIlIllIIlIII("dqYGlsWCDpViqVyuCJtJIA==", "HRdFw");
      llIlllllIIIII[llIlllllIlIlI[48]] = lIlIIlIllIIlIII("rhmqFb6ytolzIU6vNmxIEg==", "DeqKf");
      llIlllllIIIII[llIlllllIlIlI[49]] = lIlIIlIllIIlIIl("Lj4lOgAOPyg2FwEycSYdHSI/IVdP", "oKQUm");
      llIlllllIIIII[llIlllllIlIlI[50]] = lIlIIlIllIIlIlI("oa+bo+m537g=", "uyiId");
      llIlllllIIIII[llIlllllIlIlI[51]] = lIlIIlIllIIlIIl("QBAeIyc=", "fsPjb");
   }

   private static void lIlIIlIllIllIlI() {
      llIlllllIlIlI = new int[54];
      llIlllllIlIlI[0] = " ".length() & ~" ".length();
      llIlllllIlIlI[1] = " ".length();
      llIlllllIlIlI[2] = -3073 & 3572;
      llIlllllIlIlI[3] = "  ".length();
      llIlllllIlIlI[4] = 119 ^ 6 ^ 63 ^ 32;
      llIlllllIlIlI[5] = 90 ^ 92;
      llIlllllIlIlI[6] = 72 + 45 - 94 + 145;
      llIlllllIlIlI[7] = 229 ^ 143;
      llIlllllIlIlI[8] = 62 ^ 42;
      llIlllllIlIlI[9] = -(-4887 & 13079) & -7681 & 16373;
      llIlllllIlIlI[10] = (148 ^ 168) + (97 ^ 49) - (151 ^ 170) + (97 ^ 45);
      llIlllllIlIlI[11] = (72 ^ 111) + (93 ^ 96) - (194 ^ 143) + 61 + 48 - 93 + 111;
      llIlllllIlIlI[12] = "   ".length();
      llIlllllIlIlI[13] = 35 ^ 39;
      llIlllllIlIlI[14] = 109 ^ 104;
      llIlllllIlIlI[15] = -30722 & 31223;
      llIlllllIlIlI[16] = -6145 & 6647;
      llIlllllIlIlI[17] = 212 ^ 175 ^ 206 ^ 178;
      llIlllllIlIlI[18] = 28 ^ 66 ^ 25 ^ 79;
      llIlllllIlIlI[19] = 42 ^ 35;
      llIlllllIlIlI[20] = -1539 & 2042;
      llIlllllIlIlI[21] = 126 + 82 - 106 + 82 ^ 62 + 64 - 22 + 40;
      llIlllllIlIlI[22] = 91 + 125 - 180 + 141 ^ 96 + 82 - 19 + 28;
      llIlllllIlIlI[23] = 12 ^ 7;
      llIlllllIlIlI[24] = 48 ^ 114 ^ 63 ^ 113;
      llIlllllIlIlI[25] = -9219 & 9723;
      llIlllllIlIlI[26] = 205 ^ 133;
      llIlllllIlIlI[27] = 31 + 22 - -80 + 42 ^ 126 + 68 - 139 + 107;
      llIlllllIlIlI[28] = -7681 & 8186;
      llIlllllIlIlI[29] = 41 ^ 118;
      llIlllllIlIlI[30] = 49 + 1 - -11 + 118 ^ 149 + 141 - 245 + 144;
      llIlllllIlIlI[31] = 183 ^ 184;
      llIlllllIlIlI[32] = 147 ^ 131;
      llIlllllIlIlI[33] = -4609 & 5115;
      llIlllllIlIlI[34] = 66 ^ 49;
      llIlllllIlIlI[35] = 32 ^ 24 ^ 36 ^ 13;
      llIlllllIlIlI[36] = 134 ^ 148;
      llIlllllIlIlI[37] = 56 ^ 43;
      llIlllllIlIlI[38] = 103 ^ 114;
      llIlllllIlIlI[39] = 19 ^ 5;
      llIlllllIlIlI[40] = 77 ^ 90;
      llIlllllIlIlI[41] = 36 ^ 60;
      llIlllllIlIlI[42] = 212 ^ 191 ^ 123 ^ 9;
      llIlllllIlIlI[43] = 135 ^ 145 ^ 200 ^ 196;
      llIlllllIlIlI[44] = 15 ^ 20;
      llIlllllIlIlI[45] = 35 ^ 63;
      llIlllllIlIlI[46] = 238 ^ 194 ^ 24 ^ 41;
      llIlllllIlIlI[47] = 139 ^ 149;
      llIlllllIlIlI[48] = 93 ^ 73 ^ 88 ^ 83;
      llIlllllIlIlI[49] = 8 ^ 40;
      llIlllllIlIlI[50] = 69 + 25 - 43 + 97 ^ 116 + 41 - 26 + 50;
      llIlllllIlIlI[51] = 56 ^ 26;
      llIlllllIlIlI[52] = -" ".length() & -1 & 16777215;
      llIlllllIlIlI[53] = 13 + 72 - 68 + 114 ^ 14 + 137 - 117 + 126;
   }

   protected void actionPerformed(GuiButton lllllllllllllIllIIIllIlIlIIllIlI) throws IOException {
      if(lIlIIlIllIllIll(lllllllllllllIllIIIllIlIlIIllIlI.enabled)) {
         if(lIlIIlIllIlllII(lllllllllllllIllIIIllIlIlIIllIlI.id, llIlllllIlIlI[2])) {
            lllllllllllllIllIIIllIlIlIIlllIl.mc.displayGuiScreen(lllllllllllllIllIIIllIlIlIIlllIl.field_146441_g);
            "".length();
            if(null != null) {
               return;
            }
         } else {
            int var10000;
            StringBuilder var10001;
            String var10002;
            if(lIlIIlIllIlllII(lllllllllllllIllIIIllIlIlIIllIlI.id, llIlllllIlIlI[9])) {
               if(lIlIIlIllIlllIl(Modules.isEnabledWings())) {
                  var10000 = llIlllllIlIlI[1];
                  "".length();
                  if(" ".length() == (100 ^ 96)) {
                     return;
                  }
               } else {
                  var10000 = llIlllllIlIlI[0];
               }

               Modules.setEnabledWings((boolean)var10000);
               var10001 = (new StringBuilder()).append(llIlllllIIIII[llIlllllIlIlI[8]]);
               if(lIlIIlIllIllIll(Modules.isEnabledWings())) {
                  var10002 = llIlllllIIIII[llIlllllIlIlI[38]];
                  "".length();
                  if(((60 + 13 - 60 + 217 ^ 27 + 41 - -102 + 5) & (87 + 127 - 144 + 67 ^ 36 + 35 - -113 + 8 ^ -" ".length())) != 0) {
                     return;
                  }
               } else {
                  var10002 = llIlllllIIIII[llIlllllIlIlI[39]];
               }

               lllllllllllllIllIIIllIlIlIIllIlI.displayString = String.valueOf(var10001.append(var10002));
               "".length();
               if("  ".length() < "  ".length()) {
                  return;
               }
            } else if(lIlIIlIllIlllII(lllllllllllllIllIIIllIlIlIIllIlI.id, llIlllllIlIlI[15])) {
               WingsLoader.loadWings();
               ItemsLoader.loadWings();
               TailsLoader.loadWings();
               HatLoader.loadWings();
               "".length();
               if(-(135 ^ 187 ^ 94 ^ 102) > 0) {
                  return;
               }
            } else if(lIlIIlIllIlllII(lllllllllllllIllIIIllIlIlIIllIlI.id, llIlllllIlIlI[16])) {
               if(lIlIIlIllIlllIl(Modules.isEnabledCompass())) {
                  var10000 = llIlllllIlIlI[1];
                  "".length();
                  if("  ".length() < "  ".length()) {
                     return;
                  }
               } else {
                  var10000 = llIlllllIlIlI[0];
               }

               Modules.setEnabledCompass((boolean)var10000);
               var10001 = (new StringBuilder()).append(llIlllllIIIII[llIlllllIlIlI[40]]);
               if(lIlIIlIllIllIll(Modules.isEnabledCompass())) {
                  var10002 = llIlllllIIIII[llIlllllIlIlI[41]];
                  "".length();
                  if(null != null) {
                     return;
                  }
               } else {
                  var10002 = llIlllllIIIII[llIlllllIlIlI[42]];
               }

               lllllllllllllIllIIIllIlIlIIllIlI.displayString = String.valueOf(var10001.append(var10002));
               "".length();
               if(((134 ^ 194) & ~(204 ^ 136)) != 0) {
                  return;
               }
            } else if(lIlIIlIllIlllII(lllllllllllllIllIIIllIlIlIIllIlI.id, llIlllllIlIlI[20])) {
               if(lIlIIlIllIlllIl(Modules.isEnabledKeystrokes())) {
                  var10000 = llIlllllIlIlI[1];
                  "".length();
                  if(-" ".length() != -" ".length()) {
                     return;
                  }
               } else {
                  var10000 = llIlllllIlIlI[0];
               }

               Modules.setEnabledKeystrokes((boolean)var10000);
               var10001 = (new StringBuilder()).append(llIlllllIIIII[llIlllllIlIlI[43]]);
               if(lIlIIlIllIllIll(Modules.isEnabledKeystrokes())) {
                  var10002 = llIlllllIIIII[llIlllllIlIlI[44]];
                  "".length();
                  if(((240 ^ 196) & ~(185 ^ 141)) != 0) {
                     return;
                  }
               } else {
                  var10002 = llIlllllIIIII[llIlllllIlIlI[45]];
               }

               lllllllllllllIllIIIllIlIlIIllIlI.displayString = String.valueOf(var10001.append(var10002));
               "".length();
               if("  ".length() > (146 ^ 150)) {
                  return;
               }
            } else if(lIlIIlIllIlllII(lllllllllllllIllIIIllIlIlIIllIlI.id, llIlllllIlIlI[28])) {
               if(lIlIIlIllIlllIl(Modules.isEnabledButtons())) {
                  var10000 = llIlllllIlIlI[1];
                  "".length();
                  if((166 + 35 - 97 + 83 ^ 135 + 10 - 108 + 154) < 0) {
                     return;
                  }
               } else {
                  var10000 = llIlllllIlIlI[0];
               }

               Modules.setEnabledButtons((boolean)var10000);
               var10001 = (new StringBuilder()).append(llIlllllIIIII[llIlllllIlIlI[46]]);
               if(lIlIIlIllIllIll(Modules.isEnabledButtons())) {
                  var10002 = llIlllllIIIII[llIlllllIlIlI[47]];
                  "".length();
                  if((22 ^ 18) <= 0) {
                     return;
                  }
               } else {
                  var10002 = llIlllllIIIII[llIlllllIlIlI[48]];
               }

               lllllllllllllIllIIIllIlIlIIllIlI.displayString = String.valueOf(var10001.append(var10002));
               "".length();
               if("   ".length() < -" ".length()) {
                  return;
               }
            } else if(lIlIIlIllIlllII(lllllllllllllIllIIIllIlIlIIllIlI.id, llIlllllIlIlI[33])) {
               if(lIlIIlIllIlllIl(AutoSprint.isEnabled())) {
                  var10000 = llIlllllIlIlI[1];
                  "".length();
                  if("   ".length() <= 0) {
                     return;
                  }
               } else {
                  var10000 = llIlllllIlIlI[0];
               }

               AutoSprint.setEnabled((boolean)var10000);
               var10001 = (new StringBuilder()).append(llIlllllIIIII[llIlllllIlIlI[49]]);
               if(lIlIIlIllIllIll(AutoSprint.isEnabled())) {
                  var10002 = llIlllllIIIII[llIlllllIlIlI[50]];
                  "".length();
                  if("  ".length() >= (128 ^ 132)) {
                     return;
                  }
               } else {
                  var10002 = llIlllllIIIII[llIlllllIlIlI[51]];
               }

               lllllllllllllIllIIIllIlIlIIllIlI.displayString = ChatUtils.repairColors(String.valueOf(var10001.append(var10002)));
               "".length();
               if((101 ^ 46 ^ 19 ^ 92) <= 0) {
                  return;
               }
            } else if(lIlIIlIllIlllII(lllllllllllllIllIIIllIlIlIIllIlI.id, llIlllllIlIlI[25]) && lIlIIlIllIllllI(lllllllllllllIllIIIllIlIlIIlllIl.mc.thePlayer)) {
               lllllllllllllIllIIIllIlIlIIlllIl.mc.displayGuiScreen(new GuiArrange(lllllllllllllIllIIIllIlIlIIlllIl));
            }
         }
      }

   }

   private static boolean lIlIIlIllIllllI(Object lllllllllllllIllIIIllIlIIlIlIIlI) {
      return lllllllllllllIllIIIllIlIIlIlIIlI != null;
   }

   public GuiClient(GuiScreen lllllllllllllIllIIIllIlIlIlIIIll) {
      lllllllllllllIllIIIllIlIlIlIIllI.field_146442_a = llIlllllIIIII[llIlllllIlIlI[0]];
      lllllllllllllIllIIIllIlIlIlIIllI.field_146441_g = lllllllllllllIllIIIllIlIlIlIIIll;
   }

   public void initGui() {
      lllllllllllllIllIIIllIlIlIlIIIII.field_146442_a = I18n.format(llIlllllIIIII[llIlllllIlIlI[1]], new Object[llIlllllIlIlI[0]]);
      lllllllllllllIllIIIllIlIlIlIIIII.buttonList.add(new GuiButton(llIlllllIlIlI[2], lllllllllllllIllIIIllIlIlIlIIIII.width / llIlllllIlIlI[3] - llIlllllIlIlI[4], lllllllllllllIllIIIllIlIlIlIIIII.height / llIlllllIlIlI[5] + llIlllllIlIlI[6], llIlllllIlIlI[7], llIlllllIlIlI[8], I18n.format(llIlllllIIIII[llIlllllIlIlI[3]], new Object[llIlllllIlIlI[0]])));
      "".length();
      List var10001 = lllllllllllllIllIIIllIlIlIlIIIII.buttonList;
      GuiButton var10002 = new GuiButton;
      int var10004 = llIlllllIlIlI[9];
      int var10005 = lllllllllllllIllIIIllIlIlIlIIIII.width / llIlllllIlIlI[3] - llIlllllIlIlI[10];
      int var10006 = lllllllllllllIllIIIllIlIlIlIIIII.height / llIlllllIlIlI[5] + llIlllllIlIlI[8] - llIlllllIlIlI[5];
      int var10007 = llIlllllIlIlI[11];
      int var10008 = llIlllllIlIlI[8];
      StringBuilder var10009 = (new StringBuilder()).append(llIlllllIIIII[llIlllllIlIlI[12]]);
      String var10010;
      if(lIlIIlIllIllIll(Modules.isEnabledWings())) {
         var10010 = llIlllllIIIII[llIlllllIlIlI[13]];
         "".length();
         if(-" ".length() == "  ".length()) {
            return;
         }
      } else {
         var10010 = llIlllllIIIII[llIlllllIlIlI[14]];
      }

      var10002.<init>(var10004, var10005, var10006, var10007, var10008, I18n.format(String.valueOf(var10009.append(var10010)), new Object[llIlllllIlIlI[0]]));
      var10001.add(var10002);
      "".length();
      lllllllllllllIllIIIllIlIlIlIIIII.buttonList.add(new GuiButton(llIlllllIlIlI[15], lllllllllllllIllIIIllIlIlIlIIIII.width / llIlllllIlIlI[3], lllllllllllllIllIIIllIlIlIlIIIII.height / llIlllllIlIlI[5] + llIlllllIlIlI[6], llIlllllIlIlI[7], llIlllllIlIlI[8], I18n.format(llIlllllIIIII[llIlllllIlIlI[5]], new Object[llIlllllIlIlI[0]])));
      "".length();
      List var10003 = lllllllllllllIllIIIllIlIlIlIIIII.buttonList;
      GuiButton var2 = new GuiButton;
      var10006 = llIlllllIlIlI[16];
      var10007 = lllllllllllllIllIIIllIlIlIlIIIII.width / llIlllllIlIlI[3] - llIlllllIlIlI[10];
      var10008 = lllllllllllllIllIIIllIlIlIlIIIII.height / llIlllllIlIlI[5] + llIlllllIlIlI[0] - llIlllllIlIlI[5];
      int var9 = llIlllllIlIlI[11];
      int var10 = llIlllllIlIlI[8];
      StringBuilder var10011 = (new StringBuilder()).append(llIlllllIIIII[llIlllllIlIlI[17]]);
      String var10012;
      if(lIlIIlIllIllIll(Modules.isEnabledCompass())) {
         var10012 = llIlllllIIIII[llIlllllIlIlI[18]];
         "".length();
         if(null != null) {
            return;
         }
      } else {
         var10012 = llIlllllIIIII[llIlllllIlIlI[19]];
      }

      var2.<init>(var10006, var10007, var10008, var9, var10, I18n.format(String.valueOf(var10011.append(var10012)), new Object[llIlllllIlIlI[0]]));
      var10003.add(var2);
      "".length();
      List var3 = lllllllllllllIllIIIllIlIlIlIIIII.buttonList;
      GuiButton var4 = new GuiButton;
      var10007 = llIlllllIlIlI[20];
      var10008 = lllllllllllllIllIIIllIlIlIlIIIII.width / llIlllllIlIlI[3] - llIlllllIlIlI[10];
      var9 = lllllllllllllIllIIIllIlIlIlIIIII.height / llIlllllIlIlI[5] + llIlllllIlIlI[21] - llIlllllIlIlI[5];
      var10 = llIlllllIlIlI[11];
      int var11 = llIlllllIlIlI[8];
      StringBuilder var12 = (new StringBuilder()).append(llIlllllIIIII[llIlllllIlIlI[22]]);
      String var10013;
      if(lIlIIlIllIllIll(Modules.isEnabledKeystrokes())) {
         var10013 = llIlllllIIIII[llIlllllIlIlI[23]];
         "".length();
         if("   ".length() <= 0) {
            return;
         }
      } else {
         var10013 = llIlllllIIIII[llIlllllIlIlI[24]];
      }

      var4.<init>(var10007, var10008, var9, var10, var11, I18n.format(String.valueOf(var12.append(var10013)), new Object[llIlllllIlIlI[0]]));
      var3.add(var4);
      "".length();
      lllllllllllllIllIIIllIlIlIlIIIII.buttonList.add(new GuiButton(llIlllllIlIlI[25], lllllllllllllIllIIIllIlIlIlIIIII.width / llIlllllIlIlI[3] - llIlllllIlIlI[10], lllllllllllllIllIIIllIlIlIlIIIII.height / llIlllllIlIlI[5] + llIlllllIlIlI[26] - llIlllllIlIlI[5], llIlllllIlIlI[11], llIlllllIlIlI[8], I18n.format(llIlllllIIIII[llIlllllIlIlI[27]], new Object[llIlllllIlIlI[0]])));
      "".length();
      List var5 = lllllllllllllIllIIIllIlIlIlIIIII.buttonList;
      GuiButton var6 = new GuiButton;
      var9 = llIlllllIlIlI[28];
      var10 = lllllllllllllIllIIIllIlIlIlIIIII.width / llIlllllIlIlI[3] - llIlllllIlIlI[10];
      var11 = lllllllllllllIllIIIllIlIlIlIIIII.height / llIlllllIlIlI[5] + llIlllllIlIlI[29] - llIlllllIlIlI[5];
      int var13 = llIlllllIlIlI[11];
      int var14 = llIlllllIlIlI[8];
      StringBuilder var10014 = (new StringBuilder()).append(llIlllllIIIII[llIlllllIlIlI[30]]);
      String var10015;
      if(lIlIIlIllIllIll(Modules.isEnabledButtons())) {
         var10015 = llIlllllIIIII[llIlllllIlIlI[31]];
         "".length();
         if(" ".length() >= (165 ^ 161)) {
            return;
         }
      } else {
         var10015 = llIlllllIIIII[llIlllllIlIlI[32]];
      }

      var6.<init>(var9, var10, var11, var13, var14, I18n.format(String.valueOf(var10014.append(var10015)), new Object[llIlllllIlIlI[0]]));
      var5.add(var6);
      "".length();
      List var7 = lllllllllllllIllIIIllIlIlIlIIIII.buttonList;
      GuiButton var8 = new GuiButton;
      var10 = llIlllllIlIlI[33];
      var11 = lllllllllllllIllIIIllIlIlIlIIIII.width / llIlllllIlIlI[3] - llIlllllIlIlI[10];
      var13 = lllllllllllllIllIIIllIlIlIlIIIII.height / llIlllllIlIlI[5] + llIlllllIlIlI[34] - llIlllllIlIlI[5];
      var14 = llIlllllIlIlI[11];
      int var15 = llIlllllIlIlI[8];
      StringBuilder var16 = (new StringBuilder()).append(llIlllllIIIII[llIlllllIlIlI[35]]);
      String var10016;
      if(lIlIIlIllIllIll(AutoSprint.isEnabled())) {
         var10016 = llIlllllIIIII[llIlllllIlIlI[36]];
         "".length();
         if(((63 + 130 - 148 + 91 ^ 37 + 134 - 164 + 165) & (19 + 138 - 147 + 216 ^ 4 + 169 - -16 + 9 ^ -" ".length())) == "   ".length()) {
            return;
         }
      } else {
         var10016 = llIlllllIIIII[llIlllllIlIlI[37]];
      }

      var8.<init>(var10, var11, var13, var14, var15, I18n.format(String.valueOf(var16.append(var10016)), new Object[llIlllllIlIlI[0]]));
      var7.add(var8);
      "".length();
   }

   static {
      lIlIIlIllIllIlI();
      lIlIIlIllIllIIl();
      kom = llIlllllIlIlI[1];
      userList = new ArrayList();
   }

   private static boolean lIlIIlIllIllIll(int lllllllllllllIllIIIllIlIIlIlIIII) {
      return lllllllllllllIllIIIllIlIIlIlIIII != 0;
   }

   private static boolean lIlIIlIllIlllII(int lllllllllllllIllIIIllIlIIlIllIIl, int lllllllllllllIllIIIllIlIIlIllIII) {
      return lllllllllllllIllIIIllIlIIlIllIIl == lllllllllllllIllIIIllIlIIlIllIII;
   }

   private static String lIlIIlIllIIlIlI(String lllllllllllllIllIIIllIlIIlIlllll, String lllllllllllllIllIIIllIlIIlIllllI) {
      try {
         SecretKeySpec lllllllllllllIllIIIllIlIIlIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIllIIIllIlIIlIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllIllIIIllIlIIllIIIll = Cipher.getInstance("Blowfish");
         lllllllllllllIllIIIllIlIIllIIIll.init(llIlllllIlIlI[3], lllllllllllllIllIIIllIlIIlIlllIl);
         return new String(lllllllllllllIllIIIllIlIIllIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIllIIIllIlIIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }
}
