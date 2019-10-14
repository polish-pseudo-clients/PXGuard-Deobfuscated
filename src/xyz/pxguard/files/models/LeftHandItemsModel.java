package xyz.pxguard.files.models;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

public class LeftHandItemsModel extends ModelBiped {

   private static final int[] lIlIIIIIIlIllI;
   private ModelRenderer model;
   private static final String[] lIIlllIllIIllI;


   private static void lllIlIlIlIIlIll() {
      lIIlllIllIIllI = new String[lIlIIIIIIlIllI[4]];
      lIIlllIllIIllI[lIlIIIIIIlIllI[1]] = lllIlIlIlIIlIlI("abLkvLvddSfGnjac2vXDaWah1VnbPHoJ/dVH76Fhr/6mltRnVptiGw==", "BbliC");
      lIIlllIllIIllI[lIlIIIIIIlIllI[3]] = lllIlIlIlIIlIlI("iIl3sRN00Yw=", "EBxPw");
   }

   private static String lllIlIlIlIIlIlI(String lllllllllllllIIIlIllllIIIIIIlllI, String lllllllllllllIIIlIllllIIIIIIlIll) {
      try {
         SecretKeySpec lllllllllllllIIIlIllllIIIIIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIllllIIIIIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllIIIlIllllIIIIIlIIII = Cipher.getInstance("Blowfish");
         lllllllllllllIIIlIllllIIIIIlIIII.init(lIlIIIIIIlIllI[4], lllllllllllllIIIlIllllIIIIIlIIIl);
         return new String(lllllllllllllIIIlIllllIIIIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIllllIIIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public LeftHandItemsModel() {
      lllllllllllllIIIlIllllIIIIlIIlII.model = new ModelRenderer(lllllllllllllIIIlIllllIIIIlIIlII, lIlIIIIIIlIllI[0], lIlIIIIIIlIllI[0]);
      float lllllllllllllIIIlIllllIIIIlIIIlI = 0.0F;

      do {
         if(!lllIlllIIIlIIlI(lllIlllIIIlIIIl(lllllllllllllIIIlIllllIIIIlIIIlI, 0.3F))) {
            lllllllllllllIIIlIllllIIIIlIIlII.model.setRotationPoint(0.0F, -1.0F, -1.0F);
            return;
         }

         lllllllllllllIIIlIllllIIIIlIIlII.model.addBox(lllllllllllllIIIlIllllIIIIlIIIlI, 25.0F, 5.0F, lIlIIIIIIlIllI[1], lIlIIIIIIlIllI[2], lIlIIIIIIlIllI[2], 0.05F);
         lllllllllllllIIIlIllllIIIIlIIIlI += 0.01F;
         "".length();
      } while(-" ".length() < "   ".length());

      throw null;
   }

   private static boolean lllIlllIIIlIIlI(int lllllllllllllIIIlIllllIIIIIIIlll) {
      return lllllllllllllIIIlIllllIIIIIIIlll < 0;
   }

   private static void lllIlllIIIlIIII() {
      lIlIIIIIIlIllI = new int[5];
      lIlIIIIIIlIllI[0] = 246 ^ 182;
      lIlIIIIIIlIllI[1] = (57 ^ 3) & ~(65 ^ 123);
      lIlIIIIIIlIllI[2] = -(151 ^ 183);
      lIlIIIIIIlIllI[3] = " ".length();
      lIlIIIIIIlIllI[4] = "  ".length();
   }

   static {
      lllIlllIIIlIIII();
      lllIlIlIlIIlIll();
   }

   private static int lllIlllIIIlIIIl(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F?0:(var2 < 0.0F?-1:1);
   }

   public void render(ModelRenderer lllllllllllllIIIlIllllIIIIIlllII, float lllllllllllllIIIlIllllIIIIIlIlll, int lllllllllllllIIIlIllllIIIIIlIllI) {
      ModelPlayer.copyModelAngles(lllllllllllllIIIlIllllIIIIIlllII, lllllllllllllIIIlIllllIIIIIllIIl.model);
      GlStateManager.pushMatrix();
      Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(String.valueOf((new StringBuilder()).append(lIIlllIllIIllI[lIlIIIIIIlIllI[1]]).append(lllllllllllllIIIlIllllIIIIIlIllI).append(lIIlllIllIIllI[lIlIIIIIIlIllI[3]]))));
      lllllllllllllIIIlIllllIIIIIllIIl.model.render(lllllllllllllIIIlIllllIIIIIlIlll);
      GlStateManager.popMatrix();
   }
}
