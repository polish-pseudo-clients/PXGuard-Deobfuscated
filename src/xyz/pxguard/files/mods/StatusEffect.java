package xyz.pxguard.files.mods;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import org.lwjgl.opengl.GL11;
import xyz.pxguard.files.utils.ChatUtils;

public class StatusEffect {

   private static Map potionMaxDurationMap;
   private static boolean applyXOffsetToCenter;
   private static boolean enableEffectName;
   private static ScaledResolution scaledResolution;
   private static boolean enableBackground;
   private static String effectNameColor;
   private static int durationBlinkSeconds;
   private static final int[] llllIIIIlllIl;
   private static boolean enableIconBlink;
   private static final String[] llllIIIIlIlll;
   private static String alignMode;
   public static int xOffset;
   private static boolean applyYOffsetToMiddle;
   private static String durationColor;
   public static int yOffset;
   public static boolean enabled;
   protected static float zLevel;
   private static int yOffsetBottomCenter;


   private static void lIllIIlllIIlIII() {
      llllIIIIlllIl = new int[50];
      llllIIIIlllIl[0] = 214 ^ 161 ^ 50 ^ 81;
      llllIIIIlllIl[1] = 115 ^ 82;
      llllIIIIlllIl[2] = 87 ^ 69;
      llllIIIIlllIl[3] = 84 ^ 81;
      llllIIIIlllIl[4] = (90 ^ 126) + (5 ^ 77) - (156 ^ 181) + (37 ^ 100);
      llllIIIIlllIl[5] = " ".length();
      llllIIIIlllIl[6] = (159 ^ 190) & ~(224 ^ 193);
      llllIIIIlllIl[7] = 124 ^ 65 ^ 203 ^ 142;
      llllIIIIlllIl[8] = 15 ^ 25;
      llllIIIIlllIl[9] = "  ".length();
      llllIIIIlllIl[10] = "   ".length();
      llllIIIIlllIl[11] = 242 ^ 191 ^ 234 ^ 163;
      llllIIIIlllIl[12] = 125 + 74 - 81 + 22 ^ 116 + 47 - 112 + 87;
      llllIIIIlllIl[13] = 11 ^ 12;
      llllIIIIlllIl[14] = 179 + 79 - 101 + 27 ^ 108 + 105 - 128 + 91;
      llllIIIIlllIl[15] = 203 ^ 194;
      llllIIIIlllIl[16] = 93 ^ 87;
      llllIIIIlllIl[17] = 204 ^ 199;
      llllIIIIlllIl[18] = 13 ^ 1;
      llllIIIIlllIl[19] = 130 + 46 - 97 + 66 + 11 + 92 - 7 + 67 - (-13843 & 14103) + (105 ^ 30);
      llllIIIIlllIl[20] = 73 + 98 - 85 + 54;
      llllIIIIlllIl[21] = 125 + 150 - 145 + 24 ^ 176 + 123 - 126 + 13;
      llllIIIIlllIl[22] = 120 ^ 45 ^ 250 ^ 162;
      llllIIIIlllIl[23] = -(47 ^ 55);
      llllIIIIlllIl[24] = -(77 + 30 - 3 + 27 ^ 24 + 92 - 73 + 102);
      llllIIIIlllIl[25] = 157 + 147 - 285 + 179;
      llllIIIIlllIl[26] = 131 ^ 141;
      llllIIIIlllIl[27] = 174 ^ 185 ^ 161 ^ 185;
      llllIIIIlllIl[28] = -(133 ^ 143);
      llllIIIIlllIl[29] = -(145 ^ 149);
      llllIIIIlllIl[30] = -" ".length() & -1 & 16777215;
      llllIIIIlllIl[31] = 32 + 47 - -11 + 88 ^ 101 + 98 - 115 + 78;
      llllIIIIlllIl[32] = 28 ^ 13;
      llllIIIIlllIl[33] = 81 ^ 66;
      llllIIIIlllIl[34] = 20 ^ 1;
      llllIIIIlllIl[35] = 35 ^ 52;
      llllIIIIlllIl[36] = 36 + 76 - -53 + 10 ^ 28 + 91 - -1 + 63;
      llllIIIIlllIl[37] = 78 ^ 12 ^ 215 ^ 140;
      llllIIIIlllIl[38] = 9 ^ 19;
      llllIIIIlllIl[39] = 136 ^ 147;
      llllIIIIlllIl[40] = 10 ^ 22;
      llllIIIIlllIl[41] = 164 ^ 185;
      llllIIIIlllIl[42] = 133 ^ 173 ^ 181 ^ 131;
      llllIIIIlllIl[43] = 198 ^ 149 ^ 218 ^ 150;
      llllIIIIlllIl[44] = -28678 & 29077;
      llllIIIIlllIl[45] = 158 + 55 - 171 + 134 ^ 124 + 21 - 28 + 29;
      llllIIIIlllIl[46] = 100 ^ 71;
      llllIIIIlllIl[47] = 41 ^ 125 ^ 100 ^ 20;
      llllIIIIlllIl[48] = 223 ^ 151 ^ 92 ^ 61;
      llllIIIIlllIl[49] = 31 + 126 - 63 + 40 ^ 62 + 74 - 54 + 81;
   }

   private static boolean lIllIIlllIIlllI(int lllllllllllllIlIlIlIlIllIIIllllI, int lllllllllllllIlIlIlIlIllIIIlllIl) {
      return lllllllllllllIlIlIlIlIllIIIllllI <= lllllllllllllIlIlIlIlIllIIIlllIl;
   }

   private static void lIllIIlllIIIIll() {
      llllIIIIlIlll = new String[llllIIIIlllIl[49]];
      llllIIIIlIlll[llllIIIIlllIl[6]] = lIllIIllIlllIII("ezpX7+JCyYQQ4ccUJQquKVAim1JZyNMpStROtPOlQvc56S3a8IF8AQ==", "BSjHu");
      llllIIIIlIlll[llllIIIIlllIl[5]] = lIllIIllIllllII("zAKi5trXUBg=", "DnDDh");
      llllIIIIlIlll[llllIIIIlllIl[9]] = lIllIIllIllllIl("", "HwiMX");
      llllIIIIlIlll[llllIIIIlllIl[10]] = lIllIIllIllllIl("cjkF", "RpLKt");
      llllIIIIlIlll[llllIIIIlllIl[11]] = lIllIIllIllllII("OuezjavO0/s=", "gblHX");
      llllIIIIlIlll[llllIIIIlllIl[3]] = lIllIIllIllllIl("Zh4Y", "FWNeX");
      llllIIIIlIlll[llllIIIIlllIl[12]] = lIllIIllIllllIl("RwQ=", "gRXUA");
      llllIIIIlIlll[llllIIIIlllIl[13]] = lIllIIllIllllII("NpJWyOkJ5no=", "YbFOA");
      llllIIIIlIlll[llllIIIIlllIl[14]] = lIllIIllIllllIl("SB44Kw==", "hHqbP");
      llllIIIIlIlll[llllIIIIlllIl[15]] = lIllIIllIllllII("FAkQ9LKQFa0=", "hBUmq");
      llllIIIIlIlll[llllIIIIlllIl[16]] = lIllIIllIllllIl("WREV", "yXMri");
      llllIIIIlIlll[llllIIIIlllIl[17]] = lIllIIllIlllIII("IGyqWuP0JQ8=", "yZiZo");
      llllIIIIlIlll[llllIIIIlllIl[18]] = lIllIIllIlllIII("e/I27w+mDzk=", "tAjCs");
      llllIIIIlIlll[llllIIIIlllIl[22]] = lIllIIllIllllIl("IicwPBM=", "PNWTg");
      llllIIIIlIlll[llllIIIIlllIl[26]] = lIllIIllIlllIII("zrocdfGVoLs=", "KoGYD");
      llllIIIIlIlll[llllIIIIlllIl[27]] = lIllIIllIlllIII("DIi+UBvpMEc=", "FsgQI");
      llllIIIIlIlll[llllIIIIlllIl[31]] = lIllIIllIllllIl("ZA==", "BqxlD");
      llllIIIIlIlll[llllIIIIlllIl[32]] = lIllIIllIllllIl("VxU=", "qgLlA");
      llllIIIIlIlll[llllIIIIlllIl[2]] = lIllIIllIllllII("we7Ndc26TCo=", "Qyjpj");
      llllIIIIlIlll[llllIIIIlllIl[33]] = lIllIIllIllllIl("ajc=", "LEiNZ");
      llllIIIIlIlll[llllIIIIlllIl[0]] = lIllIIllIllllII("aGGAxu5N0cs=", "ZzXso");
      llllIIIIlIlll[llllIIIIlllIl[34]] = lIllIIllIlllIII("+U5vMT9UoiY=", "nXkpu");
      llllIIIIlIlll[llllIIIIlllIl[8]] = lIllIIllIllllII("R4Qr0icIq5BzLV2fY4knVw==", "DIRTp");
      llllIIIIlIlll[llllIIIIlllIl[35]] = lIllIIllIlllIII("1lJh2d2gXOyUMcHfIDNu8A==", "GdDbi");
      llllIIIIlIlll[llllIIIIlllIl[36]] = lIllIIllIlllIII("7iI+67nkvzqmwamhp/wTRg==", "eIcmM");
      llllIIIIlIlll[llllIIIIlllIl[37]] = lIllIIllIlllIII("Xrd1rVLNaX6URHiWWeZU6Q==", "aKWHi");
      llllIIIIlIlll[llllIIIIlllIl[38]] = lIllIIllIlllIII("I3ltHRBaEd9A2mOEKOUfJQ==", "ETXQR");
      llllIIIIlIlll[llllIIIIlllIl[39]] = lIllIIllIllllIl("NyUMHiE4OBENJiE=", "UJxjN");
      llllIIIIlIlll[llllIIIIlllIl[40]] = lIllIIllIllllII("jZwSfWzrApDGnr23pCtsFQ==", "mXVpa");
      llllIIIIlIlll[llllIIIIlllIl[41]] = lIllIIllIlllIII("gM18mOMBgW7Jbg6YTesO0A==", "CmpAe");
      llllIIIIlIlll[llllIIIIlllIl[42]] = lIllIIllIllllII("kIetL57MgflRfuHhLJ/vcA==", "doqxr");
      llllIIIIlIlll[llllIIIIlllIl[43]] = lIllIIllIllllIl("ICYZMDkvJQgiIg==", "BImDV");
      llllIIIIlIlll[llllIIIIlllIl[21]] = lIllIIllIllllIl("IQAzGT8uHS4KODc=", "CoGmP");
      llllIIIIlIlll[llllIIIIlllIl[1]] = lIllIIllIlllIII("R4oI/wrGYzQE1BA3zPz4Qw==", "ZjzVM");
      llllIIIIlIlll[llllIIIIlllIl[45]] = lIllIIllIllllII("OpsXQhADc0N7ujUxliZPUA==", "vfqWw");
      llllIIIIlIlll[llllIIIIlllIl[46]] = lIllIIllIllllII("nTFKrorW2n8=", "houiL");
      llllIIIIlIlll[llllIIIIlllIl[47]] = lIllIIllIlllIII("PgtNd8PE7A0=", "ChBCd");
   }

   private static int getX(int lllllllllllllIlIlIlIlIlllIIlIIll) {
      if(lIllIIlllIIlIIl(alignMode.equalsIgnoreCase(llllIIIIlIlll[llllIIIIlllIl[8]])) && lIllIIlllIIlIIl(alignMode.equalsIgnoreCase(llllIIIIlIlll[llllIIIIlllIl[35]])) && !lIllIIlllIIlIlI(alignMode.equalsIgnoreCase(llllIIIIlIlll[llllIIIIlllIl[36]]))) {
         return lIllIIlllIIlIIl(alignMode.equalsIgnoreCase(llllIIIIlIlll[llllIIIIlllIl[37]])) && lIllIIlllIIlIIl(alignMode.equalsIgnoreCase(llllIIIIlIlll[llllIIIIlllIl[38]])) && !lIllIIlllIIlIlI(alignMode.equalsIgnoreCase(llllIIIIlIlll[llllIIIIlllIl[39]]))?xOffset:scaledResolution.getScaledWidth() - lllllllllllllIlIlIlIlIlllIIlIIll - xOffset;
      } else {
         int var10000 = scaledResolution.getScaledWidth() / llllIIIIlllIl[9] - lllllllllllllIlIlIlIlIlllIIlIIll / llllIIIIlllIl[9];
         int var10001;
         if(lIllIIlllIIlIlI(applyXOffsetToCenter)) {
            var10001 = xOffset;
            "".length();
            if("   ".length() < -" ".length()) {
               return (232 ^ 173) & ~(77 ^ 8);
            }
         } else {
            var10001 = llllIIIIlllIl[6];
         }

         return var10000 + var10001;
      }
   }

   private static int getY(int lllllllllllllIlIlIlIlIlllIIIllIl, int lllllllllllllIlIlIlIlIlllIIIllII) {
      if(lIllIIlllIIlIIl(alignMode.equalsIgnoreCase(llllIIIIlIlll[llllIIIIlllIl[40]])) && lIllIIlllIIlIIl(alignMode.equalsIgnoreCase(llllIIIIlIlll[llllIIIIlllIl[41]])) && !lIllIIlllIIlIlI(alignMode.equalsIgnoreCase(llllIIIIlIlll[llllIIIIlllIl[42]]))) {
         return lIllIIlllIIlIIl(alignMode.equalsIgnoreCase(llllIIIIlIlll[llllIIIIlllIl[43]])) && !lIllIIlllIIlIlI(alignMode.equalsIgnoreCase(llllIIIIlIlll[llllIIIIlllIl[21]]))?(lIllIIlllIIlIlI(alignMode.equalsIgnoreCase(llllIIIIlIlll[llllIIIIlllIl[1]]))?scaledResolution.getScaledHeight() - lllllllllllllIlIlIlIlIlllIIIllIl * lllllllllllllIlIlIlIlIlllIIIllII - yOffsetBottomCenter:yOffset):scaledResolution.getScaledHeight() - lllllllllllllIlIlIlIlIlllIIIllIl * lllllllllllllIlIlIlIlIlllIIIllII - yOffset;
      } else {
         int var10000 = scaledResolution.getScaledHeight() / llllIIIIlllIl[9] - lllllllllllllIlIlIlIlIlllIIIllIl * lllllllllllllIlIlIlIlIlllIIIllII / llllIIIIlllIl[9];
         int var10001;
         if(lIllIIlllIIlIlI(applyYOffsetToMiddle)) {
            var10001 = yOffset;
            "".length();
            if("  ".length() == -" ".length()) {
               return (95 ^ 25) & ~(63 ^ 121);
            }
         } else {
            var10001 = llllIIIIlllIl[6];
         }

         return var10000 + var10001;
      }
   }

   static {
      lIllIIlllIIlIII();
      lIllIIlllIIIIll();
      zLevel = -150.0F;
      enabled = (boolean)llllIIIIlllIl[5];
      alignMode = llllIIIIlIlll[llllIIIIlllIl[45]];
      enableBackground = (boolean)llllIIIIlllIl[6];
      enableEffectName = (boolean)llllIIIIlllIl[5];
      enableIconBlink = (boolean)llllIIIIlllIl[5];
      durationBlinkSeconds = llllIIIIlllIl[16];
      effectNameColor = llllIIIIlIlll[llllIIIIlllIl[46]];
      durationColor = llllIIIIlIlll[llllIIIIlllIl[47]];
      xOffset = llllIIIIlllIl[9];
      yOffset = llllIIIIlllIl[9];
      yOffsetBottomCenter = llllIIIIlllIl[48];
      applyXOffsetToCenter = (boolean)llllIIIIlllIl[6];
      applyYOffsetToMiddle = (boolean)llllIIIIlllIl[6];
      potionMaxDurationMap = new HashMap();
   }

   public void render(Minecraft lllllllllllllIlIlIlIlIllIlllllll) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      scaledResolution = new ScaledResolution(lllllllllllllIlIlIlIlIllIlllllll);
      displayStatusEffects(lllllllllllllIlIlIlIlIllIlllllll);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private static boolean lIllIIlllIIlIll(int lllllllllllllIlIlIlIlIllIIIllIlI, int lllllllllllllIlIlIlIlIllIIIllIIl) {
      return lllllllllllllIlIlIlIlIllIIIllIlI > lllllllllllllIlIlIlIlIllIIIllIIl;
   }

   private static boolean lIllIIlllIIlIlI(int lllllllllllllIlIlIlIlIllIIIlIlll) {
      return lllllllllllllIlIlIlIlIllIIIlIlll != 0;
   }

   private static void displayStatusEffects(Minecraft lllllllllllllIlIlIlIlIlllIlIIIIl) {
      Collection lllllllllllllIlIlIlIlIlllIIllllI = lllllllllllllIlIlIlIlIlllIlIIIIl.thePlayer.getActivePotionEffects();
      if(lIllIIlllIIlIIl(lllllllllllllIlIlIlIlIlllIIllllI.isEmpty())) {
         int var10000;
         if(lIllIIlllIIlIlI(enableEffectName)) {
            var10000 = llllIIIIlllIl[0];
            "".length();
            if(" ".length() <= 0) {
               return;
            }
         } else if(lIllIIlllIIlIlI(enableBackground)) {
            var10000 = llllIIIIlllIl[1];
            "".length();
            if(((102 ^ 39) & ~(74 ^ 11)) != 0) {
               return;
            }
         } else {
            var10000 = llllIIIIlllIl[2];
         }

         int lllllllllllllIlIlIlIlIlllIlIIlII = var10000;
         if(lIllIIlllIIlIll(lllllllllllllIlIlIlIlIlllIIllllI.size(), llllIIIIlllIl[3]) && lIllIIlllIIlIlI(enableBackground)) {
            lllllllllllllIlIlIlIlIlllIlIIlII = llllIIIIlllIl[4] / (lllllllllllllIlIlIlIlIlllIIllllI.size() - llllIIIIlllIl[5]);
         }

         int lllllllllllllIlIlIlIlIlllIIllIll = getY(lllllllllllllIlIlIlIlIlllIIllllI.size(), lllllllllllllIlIlIlIlIlllIlIIlII);
         Iterator lllllllllllllIlIlIlIlIlllIIllIlI = lllllllllllllIlIlIlIlIlllIIllllI.iterator();

         while(lIllIIlllIIlIlI(lllllllllllllIlIlIlIlIlllIIllIlI.hasNext())) {
            PotionEffect lllllllllllllIlIlIlIlIlllIIlllIl = (PotionEffect)lllllllllllllIlIlIlIlIlllIIllIlI.next();
            if(!lIllIIlllIIlIlI(potionMaxDurationMap.containsKey(lllllllllllllIlIlIlIlIlllIIlllIl)) || lIllIIlllIIllII(((Integer)potionMaxDurationMap.get(lllllllllllllIlIlIlIlIlllIIlllIl)).intValue(), lllllllllllllIlIlIlIlIlllIIlllIl.getDuration())) {
               potionMaxDurationMap.put(lllllllllllllIlIlIlIlIlllIIlllIl, Integer.valueOf(lllllllllllllIlIlIlIlIlllIIlllIl.getAmplifier()));
               "".length();
            }

            Potion lllllllllllllIlIlIlIlIlllIIllIIl = Potion.potionTypes[lllllllllllllIlIlIlIlIlllIIlllIl.getPotionID()];
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            lllllllllllllIlIlIlIlIlllIlIIIIl.getTextureManager().bindTexture(new ResourceLocation(llllIIIIlIlll[llllIIIIlllIl[6]]));
            int var10001;
            if(lIllIIlllIIlIlI(enableBackground)) {
               var10000 = llllIIIIlllIl[7];
               "".length();
               var10001 = " ".length();
               if(var10001 != " ".length()) {
                  return;
               }
            } else {
               var10000 = llllIIIIlllIl[8];
               "".length();
               var10001 = lllllllllllllIlIlIlIlIlllIlIIIIl + Minecraft.fontRendererObj.getStringWidth(llllIIIIlIlll[llllIIIIlllIl[5]]);
            }

            int lllllllllllllIlIlIlIlIlllIlIlIll = getX(var10001);
            String lllllllllllllIlIlIlIlIlllIlIlIlI = llllIIIIlIlll[llllIIIIlllIl[9]];
            int var10002;
            if(lIllIIlllIIlIlI(enableEffectName)) {
               lllllllllllllIlIlIlIlIlllIlIlIlI = StatCollector.translateToLocal(lllllllllllllIlIlIlIlIlllIIllIIl.getName());
               if(lIllIIlllIIllIl(lllllllllllllIlIlIlIlIlllIIlllIl.getAmplifier(), llllIIIIlllIl[5])) {
                  lllllllllllllIlIlIlIlIlllIlIlIlI = String.valueOf((new StringBuilder()).append(lllllllllllllIlIlIlIlIlllIlIlIlI).append(llllIIIIlIlll[llllIIIIlllIl[10]]));
                  "".length();
                  if(" ".length() <= 0) {
                     return;
                  }
               } else if(lIllIIlllIIllIl(lllllllllllllIlIlIlIlIlllIIlllIl.getAmplifier(), llllIIIIlllIl[9])) {
                  lllllllllllllIlIlIlIlIlllIlIlIlI = String.valueOf((new StringBuilder()).append(lllllllllllllIlIlIlIlIlllIlIlIlI).append(llllIIIIlIlll[llllIIIIlllIl[11]]));
                  "".length();
                  if(((165 + 152 - 305 + 212 ^ 174 + 92 - 138 + 55) & (66 ^ 115 ^ 242 ^ 148 ^ -" ".length())) == "  ".length()) {
                     return;
                  }
               } else if(lIllIIlllIIllIl(lllllllllllllIlIlIlIlIlllIIlllIl.getAmplifier(), llllIIIIlllIl[10])) {
                  lllllllllllllIlIlIlIlIlllIlIlIlI = String.valueOf((new StringBuilder()).append(lllllllllllllIlIlIlIlIlllIlIlIlI).append(llllIIIIlIlll[llllIIIIlllIl[3]]));
                  "".length();
                  if(-" ".length() > 0) {
                     return;
                  }
               } else if(lIllIIlllIIllIl(lllllllllllllIlIlIlIlIlllIIlllIl.getAmplifier(), llllIIIIlllIl[11])) {
                  lllllllllllllIlIlIlIlIlllIlIlIlI = String.valueOf((new StringBuilder()).append(lllllllllllllIlIlIlIlIlllIlIlIlI).append(llllIIIIlIlll[llllIIIIlllIl[12]]));
                  "".length();
                  if(-" ".length() != -" ".length()) {
                     return;
                  }
               } else if(lIllIIlllIIllIl(lllllllllllllIlIlIlIlIlllIIlllIl.getAmplifier(), llllIIIIlllIl[3])) {
                  lllllllllllllIlIlIlIlIlllIlIlIlI = String.valueOf((new StringBuilder()).append(lllllllllllllIlIlIlIlIlllIlIlIlI).append(llllIIIIlIlll[llllIIIIlllIl[13]]));
                  "".length();
                  if(" ".length() == 0) {
                     return;
                  }
               } else if(lIllIIlllIIllIl(lllllllllllllIlIlIlIlIlllIIlllIl.getAmplifier(), llllIIIIlllIl[12])) {
                  lllllllllllllIlIlIlIlIlllIlIlIlI = String.valueOf((new StringBuilder()).append(lllllllllllllIlIlIlIlIlllIlIlIlI).append(llllIIIIlIlll[llllIIIIlllIl[14]]));
                  "".length();
                  if((177 ^ 180) == 0) {
                     return;
                  }
               } else if(lIllIIlllIIllIl(lllllllllllllIlIlIlIlIlllIIlllIl.getAmplifier(), llllIIIIlllIl[13])) {
                  lllllllllllllIlIlIlIlIlllIlIlIlI = String.valueOf((new StringBuilder()).append(lllllllllllllIlIlIlIlIlllIlIlIlI).append(llllIIIIlIlll[llllIIIIlllIl[15]]));
                  "".length();
                  if((168 ^ 172) <= ((12 ^ 82) & ~(16 ^ 78))) {
                     return;
                  }
               } else if(lIllIIlllIIllIl(lllllllllllllIlIlIlIlIlllIIlllIl.getAmplifier(), llllIIIIlllIl[14])) {
                  lllllllllllllIlIlIlIlIlllIlIlIlI = String.valueOf((new StringBuilder()).append(lllllllllllllIlIlIlIlIlllIlIlIlI).append(llllIIIIlIlll[llllIIIIlllIl[16]]));
                  "".length();
                  if((169 + 43 - 142 + 101 ^ 112 + 64 - 165 + 164) < 0) {
                     return;
                  }
               } else if(lIllIIlllIIllIl(lllllllllllllIlIlIlIlIlllIIlllIl.getAmplifier(), llllIIIIlllIl[15])) {
                  lllllllllllllIlIlIlIlIlllIlIlIlI = String.valueOf((new StringBuilder()).append(lllllllllllllIlIlIlIlIlllIlIlIlI).append(llllIIIIlIlll[llllIIIIlllIl[17]]));
                  "".length();
                  if(-(105 ^ 35 ^ 56 ^ 118) >= 0) {
                     return;
                  }
               } else if(lIllIIlllIIlIll(lllllllllllllIlIlIlIlIlllIIlllIl.getAmplifier(), llllIIIIlllIl[15])) {
                  lllllllllllllIlIlIlIlIlllIlIlIlI = String.valueOf((new StringBuilder()).append(lllllllllllllIlIlIlIlIlllIlIlIlI).append(llllIIIIlIlll[llllIIIIlllIl[18]]).append(lllllllllllllIlIlIlIlIlllIIlllIl.getAmplifier() + llllIIIIlllIl[5]));
               }

               if(lIllIIlllIIlIlI(enableBackground)) {
                  var10001 = llllIIIIlllIl[7];
                  "".length();
                  var10002 = " ".length();
                  if(var10002 > " ".length()) {
                     return;
                  }
               } else {
                  var10001 = llllIIIIlllIl[8];
                  "".length();
                  var10002 = lllllllllllllIlIlIlIlIlllIlIIIIl + Minecraft.fontRendererObj.getStringWidth(lllllllllllllIlIlIlIlIlllIlIlIlI);
               }

               lllllllllllllIlIlIlIlIlllIlIlIll = getX(var10002);
            }

            String lllllllllllllIlIlIlIlIlllIIlIllI = Potion.getDurationString(lllllllllllllIlIlIlIlIlllIIlllIl);
            if(lIllIIlllIIlIlI(enableBackground)) {
               drawTexturedModalRect(lllllllllllllIlIlIlIlIlllIlIlIll, lllllllllllllIlIlIlIlIlllIIllIll, llllIIIIlllIl[6], llllIIIIlllIl[19], llllIIIIlllIl[20], llllIIIIlllIl[21], zLevel);
            }

            int lllllllllllllIlIlIlIlIlllIlIlllI;
            int var10003;
            int var10006;
            int var10007;
            if(lIllIIlllIIlIlI(alignMode.toLowerCase().contains(llllIIIIlIlll[llllIIIIlllIl[22]]))) {
               lllllllllllllIlIlIlIlIlllIlIlIll = getX(llllIIIIlllIl[6]);
               if(lIllIIlllIIlIlI(lllllllllllllIlIlIlIlIlllIIllIIl.hasStatusIcon())) {
                  lllllllllllllIlIlIlIlIlllIlIlllI = lllllllllllllIlIlIlIlIlllIIllIIl.getStatusIconIndex();
                  if(!lIllIIlllIIlIlI(enableIconBlink) || lIllIIlllIIlIlI(enableIconBlink) && lIllIIlllIIlIlI(shouldRender(lllllllllllllIlIlIlIlIlllIIlllIl, lllllllllllllIlIlIlIlIlllIIlllIl.getDuration(), durationBlinkSeconds))) {
                     if(lIllIIlllIIlIlI(enableBackground)) {
                        var10002 = llllIIIIlllIl[23];
                        "".length();
                        if("   ".length() == (6 ^ 2)) {
                           return;
                        }
                     } else {
                        var10002 = llllIIIIlllIl[24];
                     }

                     var10001 = lllllllllllllIlIlIlIlIlllIlIlIll + var10002;
                     if(lIllIIlllIIlIlI(enableBackground)) {
                        var10003 = llllIIIIlllIl[13];
                        "".length();
                        if((139 ^ 143) < 0) {
                           return;
                        }
                     } else {
                        var10003 = llllIIIIlllIl[6];
                     }

                     drawTexturedModalRect(var10001, lllllllllllllIlIlIlIlIlllIIllIll + var10003, llllIIIIlllIl[6] + lllllllllllllIlIlIlIlIlllIlIlllI % llllIIIIlllIl[14] * llllIIIIlllIl[2], llllIIIIlllIl[25] + lllllllllllllIlIlIlIlIlllIlIlllI / llllIIIIlllIl[14] * llllIIIIlllIl[2], llllIIIIlllIl[2], llllIIIIlllIl[2], zLevel);
                  }
               }

               "".length();
               lllllllllllllIlIlIlIlIlllIlIlllI = Minecraft.fontRendererObj.getStringWidth(lllllllllllllIlIlIlIlIlllIlIlIlI);
               "".length();
               FontRenderer var14 = Minecraft.fontRendererObj;
               String var10004 = ChatUtils.repairColors(String.valueOf((new StringBuilder()).append(llllIIIIlIlll[llllIIIIlllIl[26]]).append(effectNameColor).append(lllllllllllllIlIlIlIlIlllIlIlIlI).append(llllIIIIlIlll[llllIIIIlllIl[27]])));
               if(lIllIIlllIIlIlI(enableBackground)) {
                  var10006 = llllIIIIlllIl[28];
                  "".length();
                  if(-" ".length() != -" ".length()) {
                     return;
                  }
               } else {
                  var10006 = llllIIIIlllIl[29];
               }

               float var10005 = (float)(lllllllllllllIlIlIlIlIlllIlIlIll + var10006 - llllIIIIlllIl[2] - lllllllllllllIlIlIlIlIlllIlIlllI);
               if(lIllIIlllIIlIlI(enableBackground)) {
                  var10007 = llllIIIIlllIl[12];
                  "".length();
                  if(null != null) {
                     return;
                  }
               } else {
                  var10007 = llllIIIIlllIl[6];
               }

               var14.drawStringWithShadow(var10004, var10005, (float)(lllllllllllllIlIlIlIlIlllIIllIll + var10007), llllIIIIlllIl[30]);
               "".length();
               "".length();
               lllllllllllllIlIlIlIlIlllIlIlllI = Minecraft.fontRendererObj.getStringWidth(lllllllllllllIlIlIlIlIlllIIlIllI);
               if(lIllIIlllIIlIlI(shouldRender(lllllllllllllIlIlIlIlIlllIIlllIl, lllllllllllllIlIlIlIlIlllIIlllIl.getDuration(), durationBlinkSeconds))) {
                  "".length();
                  FontRenderer var21 = Minecraft.fontRendererObj;
                  String var22 = ChatUtils.repairColors(String.valueOf((new StringBuilder()).append(llllIIIIlIlll[llllIIIIlllIl[31]]).append(durationColor).append(lllllllllllllIlIlIlIlIlllIIlIllI).append(llllIIIIlIlll[llllIIIIlllIl[32]])));
                  int var10009;
                  if(lIllIIlllIIlIlI(enableBackground)) {
                     var10009 = llllIIIIlllIl[28];
                     "".length();
                     if(" ".length() == ((16 ^ 107 ^ 102 ^ 12) & (103 + 108 - 135 + 68 ^ 22 + 1 - -37 + 69 ^ -" ".length()))) {
                        return;
                     }
                  } else {
                     var10009 = llllIIIIlllIl[29];
                  }

                  float var10008 = (float)(lllllllllllllIlIlIlIlIlllIlIlIll + var10009 - llllIIIIlllIl[2] - lllllllllllllIlIlIlIlIlllIlIlllI);
                  int var10010;
                  if(lIllIIlllIIlIlI(enableBackground)) {
                     var10010 = llllIIIIlllIl[12];
                     "".length();
                     if(null != null) {
                        return;
                     }
                  } else {
                     var10010 = llllIIIIlllIl[6];
                  }

                  var10009 = lllllllllllllIlIlIlIlIlllIIllIll + var10010;
                  if(lIllIIlllIIlIlI(enableEffectName)) {
                     var10010 = llllIIIIlllIl[16];
                     "".length();
                     if(-" ".length() > 0) {
                        return;
                     }
                  } else {
                     var10010 = llllIIIIlllIl[3];
                  }

                  var21.drawStringWithShadow(var22, var10008, (float)(var10009 + var10010), llllIIIIlllIl[30]);
                  "".length();
               }

               "".length();
               if("   ".length() == 0) {
                  return;
               }
            } else {
               if(lIllIIlllIIlIlI(lllllllllllllIlIlIlIlIlllIIllIIl.hasStatusIcon())) {
                  lllllllllllllIlIlIlIlIlllIlIlllI = lllllllllllllIlIlIlIlIlllIIllIIl.getStatusIconIndex();
                  if(lIllIIlllIIlIlI(enableBackground)) {
                     var10002 = llllIIIIlllIl[12];
                     "".length();
                     if(null != null) {
                        return;
                     }
                  } else {
                     var10002 = llllIIIIlllIl[6];
                  }

                  var10001 = lllllllllllllIlIlIlIlIlllIlIlIll + var10002;
                  if(lIllIIlllIIlIlI(enableBackground)) {
                     var10003 = llllIIIIlllIl[13];
                     "".length();
                     if(-" ".length() == (176 ^ 180)) {
                        return;
                     }
                  } else {
                     var10003 = llllIIIIlllIl[6];
                  }

                  drawTexturedModalRect(var10001, lllllllllllllIlIlIlIlIlllIIllIll + var10003, lllllllllllllIlIlIlIlIlllIlIlllI % llllIIIIlllIl[14] * llllIIIIlllIl[2], llllIIIIlllIl[25] + lllllllllllllIlIlIlIlIlllIlIlllI / llllIIIIlllIl[14] * llllIIIIlllIl[2], llllIIIIlllIl[2], llllIIIIlllIl[2], zLevel);
               }

               "".length();
               FontRenderer var17 = Minecraft.fontRendererObj;
               String var18 = ChatUtils.repairColors(String.valueOf((new StringBuilder()).append(llllIIIIlIlll[llllIIIIlllIl[2]]).append(effectNameColor).append(lllllllllllllIlIlIlIlIlllIlIlIlI).append(llllIIIIlIlll[llllIIIIlllIl[33]])));
               int var19;
               if(lIllIIlllIIlIlI(enableBackground)) {
                  var19 = llllIIIIlllIl[16];
                  "".length();
                  if("   ".length() <= ((225 ^ 128 ^ 123 ^ 70) & (141 + 71 - 16 + 42 ^ 110 + 86 - 83 + 65 ^ -" ".length()))) {
                     return;
                  }
               } else {
                  var19 = llllIIIIlllIl[11];
               }

               float var15 = (float)(lllllllllllllIlIlIlIlIlllIlIlIll + var19 + llllIIIIlllIl[2]);
               if(lIllIIlllIIlIlI(enableBackground)) {
                  var10006 = llllIIIIlllIl[12];
                  "".length();
                  if(-" ".length() == ((161 ^ 189 ^ 234 ^ 175) & (204 ^ 158 ^ 34 ^ 41 ^ -" ".length()))) {
                     return;
                  }
               } else {
                  var10006 = llllIIIIlllIl[6];
               }

               var17.drawStringWithShadow(var18, var15, (float)(lllllllllllllIlIlIlIlIlllIIllIll + var10006), llllIIIIlllIl[30]);
               "".length();
               if(lIllIIlllIIlIlI(shouldRender(lllllllllllllIlIlIlIlIlllIIlllIl, lllllllllllllIlIlIlIlIlllIIlllIl.getDuration(), durationBlinkSeconds))) {
                  "".length();
                  FontRenderer var16 = Minecraft.fontRendererObj;
                  String var20 = ChatUtils.repairColors(String.valueOf((new StringBuilder()).append(llllIIIIlIlll[llllIIIIlllIl[0]]).append(durationColor).append(lllllllllllllIlIlIlIlIlllIIlIllI).append(llllIIIIlIlll[llllIIIIlllIl[34]])));
                  if(lIllIIlllIIlIlI(enableBackground)) {
                     var10007 = llllIIIIlllIl[16];
                     "".length();
                     if(((100 ^ 47) & ~(231 ^ 172)) < 0) {
                        return;
                     }
                  } else {
                     var10007 = llllIIIIlllIl[11];
                  }

                  float var23 = (float)(lllllllllllllIlIlIlIlIlllIlIlIll + var10007 + llllIIIIlllIl[2]);
                  int var24;
                  if(lIllIIlllIIlIlI(enableBackground)) {
                     var24 = llllIIIIlllIl[12];
                     "".length();
                     if(" ".length() > (184 ^ 167 ^ 19 ^ 8)) {
                        return;
                     }
                  } else {
                     var24 = llllIIIIlllIl[6];
                  }

                  var10007 = lllllllllllllIlIlIlIlIlllIIllIll + var24;
                  if(lIllIIlllIIlIlI(enableEffectName)) {
                     var24 = llllIIIIlllIl[16];
                     "".length();
                     if((154 ^ 158) != (52 ^ 48)) {
                        return;
                     }
                  } else {
                     var24 = llllIIIIlllIl[3];
                  }

                  var16.drawStringWithShadow(var20, var23, (float)(var10007 + var24), llllIIIIlllIl[30]);
                  "".length();
               }
            }

            lllllllllllllIlIlIlIlIlllIIllIll += lllllllllllllIlIlIlIlIlllIlIIlII;
            "".length();
            if("  ".length() == -" ".length()) {
               return;
            }
         }

         LinkedList lllllllllllllIlIlIlIlIlllIIllIlI1 = new LinkedList();
         Iterator lllllllllllllIlIlIlIlIlllIIllIIl1 = potionMaxDurationMap.keySet().iterator();

         PotionEffect lllllllllllllIlIlIlIlIlllIlIlIll1;
         while(lIllIIlllIIlIlI(lllllllllllllIlIlIlIlIlllIIllIIl1.hasNext())) {
            lllllllllllllIlIlIlIlIlllIlIlIll1 = (PotionEffect)lllllllllllllIlIlIlIlIlllIIllIIl1.next();
            if(lIllIIlllIIlIIl(lllllllllllllIlIlIlIlIlllIIllllI.contains(lllllllllllllIlIlIlIlIlllIlIlIll1))) {
               lllllllllllllIlIlIlIlIlllIIllIlI1.add(lllllllllllllIlIlIlIlIlllIlIlIll1);
               "".length();
            }

            "".length();
            if((62 ^ 58) == ((143 ^ 144) & ~(142 ^ 145))) {
               return;
            }
         }

         lllllllllllllIlIlIlIlIlllIIllIIl1 = lllllllllllllIlIlIlIlIlllIIllIlI1.iterator();

         while(lIllIIlllIIlIlI(lllllllllllllIlIlIlIlIlllIIllIIl1.hasNext())) {
            lllllllllllllIlIlIlIlIlllIlIlIll1 = (PotionEffect)lllllllllllllIlIlIlIlIlllIIllIIl1.next();
            potionMaxDurationMap.remove(lllllllllllllIlIlIlIlIlllIlIlIll1);
            "".length();
            "".length();
            if("   ".length() < 0) {
               return;
            }
         }
      }

   }

   private static boolean lIllIIlllIIllII(int lllllllllllllIlIlIlIlIllIIlIIIlI, int lllllllllllllIlIlIlIlIllIIlIIIIl) {
      return lllllllllllllIlIlIlIlIllIIlIIIlI < lllllllllllllIlIlIlIlIllIIlIIIIl;
   }

   public static void drawTexturedModalRect(int lllllllllllllIlIlIlIlIllIllIIlIl, int lllllllllllllIlIlIlIlIllIllIIlII, int lllllllllllllIlIlIlIlIllIllIIIll, int lllllllllllllIlIlIlIlIllIllIllIl, int lllllllllllllIlIlIlIlIllIllIIIIl, int lllllllllllllIlIlIlIlIllIllIlIll, float lllllllllllllIlIlIlIlIllIlIlllll) {
      float lllllllllllllIlIlIlIlIllIllIlIIl = 0.00390625F;
      float lllllllllllllIlIlIlIlIllIllIlIII = 0.00390625F;
      Tessellator lllllllllllllIlIlIlIlIllIllIIlll = Tessellator.getInstance();
      WorldRenderer lllllllllllllIlIlIlIlIllIlIllIll = lllllllllllllIlIlIlIlIllIllIIlll.getWorldRenderer();
      lllllllllllllIlIlIlIlIllIlIllIll.begin(llllIIIIlllIl[13], DefaultVertexFormats.POSITION_TEX);
      lllllllllllllIlIlIlIlIllIlIllIll.pos((double)lllllllllllllIlIlIlIlIllIllIIlIl, (double)(lllllllllllllIlIlIlIlIllIllIIlII + lllllllllllllIlIlIlIlIllIllIlIll), (double)lllllllllllllIlIlIlIlIllIlIlllll).tex((double)((float)lllllllllllllIlIlIlIlIllIllIIIll * lllllllllllllIlIlIlIlIllIllIlIIl), (double)((float)(lllllllllllllIlIlIlIlIllIllIllIl + lllllllllllllIlIlIlIlIllIllIlIll) * lllllllllllllIlIlIlIlIllIllIlIII)).endVertex();
      lllllllllllllIlIlIlIlIllIlIllIll.pos((double)(lllllllllllllIlIlIlIlIllIllIIlIl + lllllllllllllIlIlIlIlIllIllIIIIl), (double)(lllllllllllllIlIlIlIlIllIllIIlII + lllllllllllllIlIlIlIlIllIllIlIll), (double)lllllllllllllIlIlIlIlIllIlIlllll).tex((double)((float)(lllllllllllllIlIlIlIlIllIllIIIll + lllllllllllllIlIlIlIlIllIllIIIIl) * lllllllllllllIlIlIlIlIllIllIlIIl), (double)((float)(lllllllllllllIlIlIlIlIllIllIllIl + lllllllllllllIlIlIlIlIllIllIlIll) * lllllllllllllIlIlIlIlIllIllIlIII)).endVertex();
      lllllllllllllIlIlIlIlIllIlIllIll.pos((double)(lllllllllllllIlIlIlIlIllIllIIlIl + lllllllllllllIlIlIlIlIllIllIIIIl), (double)lllllllllllllIlIlIlIlIllIllIIlII, (double)lllllllllllllIlIlIlIlIllIlIlllll).tex((double)((float)(lllllllllllllIlIlIlIlIllIllIIIll + lllllllllllllIlIlIlIlIllIllIIIIl) * lllllllllllllIlIlIlIlIllIllIlIIl), (double)((float)lllllllllllllIlIlIlIlIllIllIllIl * lllllllllllllIlIlIlIlIllIllIlIII)).endVertex();
      lllllllllllllIlIlIlIlIllIlIllIll.pos((double)lllllllllllllIlIlIlIlIllIllIIlIl, (double)lllllllllllllIlIlIlIlIllIllIIlII, (double)lllllllllllllIlIlIlIlIllIlIlllll).tex((double)((float)lllllllllllllIlIlIlIlIllIllIIIll * lllllllllllllIlIlIlIlIllIllIlIIl), (double)((float)lllllllllllllIlIlIlIlIllIllIllIl * lllllllllllllIlIlIlIlIllIllIlIII)).endVertex();
      lllllllllllllIlIlIlIlIllIllIIlll.draw();
   }

   private static boolean lIllIIlllIIlIIl(int lllllllllllllIlIlIlIlIllIIIlIlIl) {
      return lllllllllllllIlIlIlIlIllIIIlIlIl == 0;
   }

   private static boolean shouldRender(PotionEffect lllllllllllllIlIlIlIlIlllIIIIlIl, int lllllllllllllIlIlIlIlIlllIIIIlll, int lllllllllllllIlIlIlIlIlllIIIIIll) {
      if(lIllIIlllIIlIll(((Integer)potionMaxDurationMap.get(lllllllllllllIlIlIlIlIlllIIIIlIl)).intValue(), llllIIIIlllIl[44]) && lIllIIlllIIlllI(lllllllllllllIlIlIlIlIlllIIIIlll / llllIIIIlllIl[0], lllllllllllllIlIlIlIlIlllIIIIIll)) {
         int var10000;
         if(lIllIIlllIIllII(lllllllllllllIlIlIlIlIlllIIIIlll % llllIIIIlllIl[0], llllIIIIlllIl[16])) {
            var10000 = llllIIIIlllIl[5];
            "".length();
            if(((80 + 120 - 38 + 1 ^ 128 + 81 - 82 + 62) & (92 + 94 - 130 + 96 ^ 58 + 117 - 46 + 5 ^ -" ".length())) > 0) {
               return (boolean)((78 ^ 3 ^ 91 ^ 7) & (36 ^ 53 ^ (52 ^ 20) & ~(53 ^ 21) ^ -" ".length()));
            }
         } else {
            var10000 = llllIIIIlllIl[6];
         }

         return (boolean)var10000;
      } else {
         return (boolean)llllIIIIlllIl[5];
      }
   }

   private static boolean lIllIIlllIIllIl(int lllllllllllllIlIlIlIlIllIIlIIllI, int lllllllllllllIlIlIlIlIllIIlIIlIl) {
      return lllllllllllllIlIlIlIlIllIIlIIllI == lllllllllllllIlIlIlIlIllIIlIIlIl;
   }

   public static void setRes(ScaledResolution lllllllllllllIlIlIlIlIllIlllllIl) {
      scaledResolution = lllllllllllllIlIlIlIlIllIlllllIl;
   }

   private static String lIllIIllIllllIl(String lllllllllllllIlIlIlIlIllIlIIIIll, String lllllllllllllIlIlIlIlIllIlIIIIlI) {
      lllllllllllllIlIlIlIlIllIlIIIIll = new String(Base64.getDecoder().decode(lllllllllllllIlIlIlIlIllIlIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllIlIlIlIlIllIIllllII = new StringBuilder();
      char[] lllllllllllllIlIlIlIlIllIIlllIll = lllllllllllllIlIlIlIlIllIlIIIIlI.toCharArray();
      int lllllllllllllIlIlIlIlIllIIllllll = llllIIIIlllIl[6];
      char[] lllllllllllllIlIlIlIlIllIIlllIIl = lllllllllllllIlIlIlIlIllIlIIIIll.toCharArray();
      int lllllllllllllIlIlIlIlIllIIlllIII = lllllllllllllIlIlIlIlIllIIlllIIl.length;
      int lllllllllllllIlIlIlIlIllIIllIlll = llllIIIIlllIl[6];

      do {
         if(!lIllIIlllIIllII(lllllllllllllIlIlIlIlIllIIllIlll, lllllllllllllIlIlIlIlIllIIlllIII)) {
            return String.valueOf(lllllllllllllIlIlIlIlIllIIllllII);
         }

         char lllllllllllllIlIlIlIlIllIIllIllI = lllllllllllllIlIlIlIlIllIIlllIIl[lllllllllllllIlIlIlIlIllIIllIlll];
         lllllllllllllIlIlIlIlIllIIllllII.append((char)(lllllllllllllIlIlIlIlIllIIllIllI ^ lllllllllllllIlIlIlIlIllIIlllIll[lllllllllllllIlIlIlIlIllIIllllll % lllllllllllllIlIlIlIlIllIIlllIll.length]));
         "".length();
         ++lllllllllllllIlIlIlIlIllIIllllll;
         ++lllllllllllllIlIlIlIlIllIIllIlll;
         "".length();
      } while("  ".length() == "  ".length());

      return null;
   }

   private static String lIllIIllIllllII(String lllllllllllllIlIlIlIlIllIIlIllII, String lllllllllllllIlIlIlIlIllIIlIlIll) {
      try {
         SecretKeySpec lllllllllllllIlIlIlIlIllIIlIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIlIllIIlIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllIlIlIlIlIllIIlIlIIl = Cipher.getInstance("Blowfish");
         lllllllllllllIlIlIlIlIllIIlIlIIl.init(llllIIIIlllIl[9], lllllllllllllIlIlIlIlIllIIlIllll);
         return new String(lllllllllllllIlIlIlIlIllIIlIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIlIllIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static String lIllIIllIlllIII(String lllllllllllllIlIlIlIlIllIlIlIIIl, String lllllllllllllIlIlIlIlIllIlIlIIlI) {
      try {
         SecretKeySpec lllllllllllllIlIlIlIlIllIlIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIlIllIlIlIIlI.getBytes(StandardCharsets.UTF_8)), llllIIIIlllIl[14]), "DES");
         Cipher lllllllllllllIlIlIlIlIllIlIlIlIl = Cipher.getInstance("DES");
         lllllllllllllIlIlIlIlIllIlIlIlIl.init(llllIIIIlllIl[9], lllllllllllllIlIlIlIlIllIlIlIllI);
         return new String(lllllllllllllIlIlIlIlIllIlIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIlIllIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }
}
