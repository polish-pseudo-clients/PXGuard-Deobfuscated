package xyz.pxguard.files.utils;

import java.awt.Color;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

public class RenderUtils {

   private static final int[] lIlIIlIllIIlll;


   public static int getRainbow(int lllllllllllllIIIIlllIlllllIllIll, int lllllllllllllIIIIlllIlllllIllIlI) {
      float lllllllllllllIIIIlllIlllllIllIIl = (float)((System.currentTimeMillis() + (long)lllllllllllllIIIIlllIlllllIllIlI) % (long)lllllllllllllIIIIlllIlllllIllIll);
      lllllllllllllIIIIlllIlllllIllIIl /= (float)lllllllllllllIIIIlllIlllllIllIll;
      return Color.getHSBColor(lllllllllllllIIIIlllIlllllIllIIl, 1.0F, 1.0F).getRGB();
   }

   public static void enableGL2D() {
      GL11.glDisable(lIlIIlIllIIlll[10]);
      GL11.glEnable(lIlIIlIllIIlll[4]);
      GL11.glDisable(lIlIIlIllIIlll[5]);
      GL11.glBlendFunc(lIlIIlIllIIlll[6], lIlIIlIllIIlll[7]);
      GL11.glDepthMask((boolean)lIlIIlIllIIlll[11]);
      GL11.glEnable(lIlIIlIllIIlll[8]);
      GL11.glHint(lIlIIlIllIIlll[12], lIlIIlIllIIlll[13]);
      GL11.glHint(lIlIIlIllIIlll[14], lIlIIlIllIIlll[13]);
   }

   private static void llllIlIlllllIIl() {
      lIlIIlIllIIlll = new int[16];
      lIlIIlIllIIlll[0] = 208 + 64 - 257 + 205 ^ 57 + 114 - 21 + 46;
      lIlIIlIllIIlll[1] = 99 + 123 - 131 + 87 + 34 + 11 - 21 + 143 - (-9857 & 10188) + 191 + 124 - 75 + 2;
      lIlIIlIllIIlll[2] = 152 ^ 136;
      lIlIIlIllIIlll[3] = 185 ^ 177;
      lIlIIlIllIIlll[4] = -17421 & 20462;
      lIlIIlIllIIlll[5] = -(-6337 & 14549) & -20483 & 32247;
      lIlIIlIllIIlll[6] = -(-18562 & 19703) & -6281 & 8191;
      lIlIIlIllIIlll[7] = -22645 & 23415;
      lIlIIlIllIIlll[8] = -(-577 & 25292) & -4097 & 31659;
      lIlIIlIllIIlll[9] = " ".length() ^ 111 ^ 105;
      lIlIIlIllIIlll[10] = -20483 & 23411;
      lIlIIlIllIIlll[11] = " ".length();
      lIlIIlIllIIlll[12] = -(-13559 & 14327) & -20617 & 24538;
      lIlIIlIllIIlll[13] = -(-6403 & 14623) & -19073 & 31646;
      lIlIIlIllIIlll[14] = -(-10369 & 31405) & -129 & 24319;
      lIlIIlIllIIlll[15] = -(-5157 & 14079) & -19489 & 32762;
   }

   public static void drawString(double lllllllllllllIIIIllllIIIIIllllIl, String lllllllllllllIIIIllllIIIIIllllII, int lllllllllllllIIIIllllIIIIlIIIIII, int lllllllllllllIIIIllllIIIIIllllll, int lllllllllllllIIIIllllIIIIIlllIIl) {
      GlStateManager.pushMatrix();
      GlStateManager.scale(lllllllllllllIIIIllllIIIIIllllIl, lllllllllllllIIIIllllIIIIIllllIl, lllllllllllllIIIIllllIIIIIllllIl);
      Minecraft.getMinecraft();
      "".length();
      Minecraft.fontRendererObj.drawString(lllllllllllllIIIIllllIIIIIllllII, lllllllllllllIIIIllllIIIIlIIIIII, lllllllllllllIIIIllllIIIIIllllll, lllllllllllllIIIIllllIIIIIlllIIl);
      "".length();
      GlStateManager.popMatrix();
   }

   static {
      llllIlIlllllIIl();
   }

   public static void glColor(float lllllllllllllIIIIlllIllllllIllll, int lllllllllllllIIIIlllIllllllIlllI, int lllllllllllllIIIIlllIllllllIIllI, int lllllllllllllIIIIlllIllllllIIlIl) {
      float lllllllllllllIIIIlllIllllllIIlII = 0.003921569F * (float)lllllllllllllIIIIlllIllllllIlllI;
      float lllllllllllllIIIIlllIllllllIlIlI = 0.003921569F * (float)lllllllllllllIIIIlllIllllllIIllI;
      float lllllllllllllIIIIlllIllllllIIIlI = 0.003921569F * (float)lllllllllllllIIIIlllIllllllIIlIl;
      GL11.glColor4f(lllllllllllllIIIIlllIllllllIIlII, lllllllllllllIIIIlllIllllllIlIlI, lllllllllllllIIIIlllIllllllIIIlI, lllllllllllllIIIIlllIllllllIllll);
   }

   public static void drawRect(float lllllllllllllIIIIllllIIIIIlIIllI, float lllllllllllllIIIIllllIIIIIlIlllI, float lllllllllllllIIIIllllIIIIIlIIlII, float lllllllllllllIIIIllllIIIIIlIIIll, int lllllllllllllIIIIllllIIIIIlIIIlI) {
      float lllllllllllllIIIIllllIIIIIlIlIlI = (float)(lllllllllllllIIIIllllIIIIIlIIIlI >> lIlIIlIllIIlll[0] & lIlIIlIllIIlll[1]) / 255.0F;
      float lllllllllllllIIIIllllIIIIIlIlIIl = (float)(lllllllllllllIIIIllllIIIIIlIIIlI >> lIlIIlIllIIlll[2] & lIlIIlIllIIlll[1]) / 255.0F;
      float lllllllllllllIIIIllllIIIIIIlllll = (float)(lllllllllllllIIIIllllIIIIIlIIIlI >> lIlIIlIllIIlll[3] & lIlIIlIllIIlll[1]) / 255.0F;
      float lllllllllllllIIIIllllIIIIIIllllI = (float)(lllllllllllllIIIIllllIIIIIlIIIlI & lIlIIlIllIIlll[1]) / 255.0F;
      GL11.glEnable(lIlIIlIllIIlll[4]);
      GL11.glDisable(lIlIIlIllIIlll[5]);
      GL11.glBlendFunc(lIlIIlIllIIlll[6], lIlIIlIllIIlll[7]);
      GL11.glEnable(lIlIIlIllIIlll[8]);
      GL11.glPushMatrix();
      GL11.glColor4f(lllllllllllllIIIIllllIIIIIlIlIIl, lllllllllllllIIIIllllIIIIIIlllll, lllllllllllllIIIIllllIIIIIIllllI, lllllllllllllIIIIllllIIIIIlIlIlI);
      GL11.glBegin(lIlIIlIllIIlll[9]);
      GL11.glVertex2d((double)lllllllllllllIIIIllllIIIIIlIIlII, (double)lllllllllllllIIIIllllIIIIIlIlllI);
      GL11.glVertex2d((double)lllllllllllllIIIIllllIIIIIlIIllI, (double)lllllllllllllIIIIllllIIIIIlIlllI);
      GL11.glVertex2d((double)lllllllllllllIIIIllllIIIIIlIIllI, (double)lllllllllllllIIIIllllIIIIIlIIIll);
      GL11.glVertex2d((double)lllllllllllllIIIIllllIIIIIlIIlII, (double)lllllllllllllIIIIllllIIIIIlIIIll);
      GL11.glEnd();
      GL11.glPopMatrix();
      GL11.glEnable(lIlIIlIllIIlll[5]);
      GL11.glDisable(lIlIIlIllIIlll[4]);
      GL11.glDisable(lIlIIlIllIIlll[8]);
   }

   public static void glColor(int lllllllllllllIIIIllllIIIIIIllIII) {
      float lllllllllllllIIIIllllIIIIIIlIIlI = (float)(lllllllllllllIIIIllllIIIIIIllIII >> lIlIIlIllIIlll[0] & lIlIIlIllIIlll[1]) / 255.0F;
      float lllllllllllllIIIIllllIIIIIIlIllI = (float)(lllllllllllllIIIIllllIIIIIIllIII >> lIlIIlIllIIlll[2] & lIlIIlIllIIlll[1]) / 255.0F;
      float lllllllllllllIIIIllllIIIIIIlIIII = (float)(lllllllllllllIIIIllllIIIIIIllIII >> lIlIIlIllIIlll[3] & lIlIIlIllIIlll[1]) / 255.0F;
      float lllllllllllllIIIIllllIIIIIIIllll = (float)(lllllllllllllIIIIllllIIIIIIllIII & lIlIIlIllIIlll[1]) / 255.0F;
      GL11.glColor4f(lllllllllllllIIIIllllIIIIIIlIllI, lllllllllllllIIIIllllIIIIIIlIIII, lllllllllllllIIIIllllIIIIIIIllll, lllllllllllllIIIIllllIIIIIIlIIlI);
   }

   public static void glColor(Color lllllllllllllIIIIllllIIIIIIIIlll) {
      GL11.glColor4f((float)lllllllllllllIIIIllllIIIIIIIIlll.getRed() / 255.0F, (float)lllllllllllllIIIIllllIIIIIIIIlll.getGreen() / 255.0F, (float)lllllllllllllIIIIllllIIIIIIIIlll.getBlue() / 255.0F, (float)lllllllllllllIIIIllllIIIIIIIIlll.getAlpha() / 255.0F);
   }

   public static void glColor(Color lllllllllllllIIIIllllIIIIIIIlIlI, float lllllllllllllIIIIllllIIIIIIIlIll) {
      GL11.glColor4f((float)lllllllllllllIIIIllllIIIIIIIlIlI.getRed() / 255.0F, (float)lllllllllllllIIIIllllIIIIIIIlIlI.getGreen() / 255.0F, (float)lllllllllllllIIIIllllIIIIIIIlIlI.getBlue() / 255.0F, (float)lllllllllllllIIIIllllIIIIIIIlIlI.getAlpha() / lllllllllllllIIIIllllIIIIIIIlIll);
   }

   public static void disableGL2D() {
      GL11.glEnable(lIlIIlIllIIlll[5]);
      GL11.glDisable(lIlIIlIllIIlll[4]);
      GL11.glEnable(lIlIIlIllIIlll[10]);
      GL11.glDisable(lIlIIlIllIIlll[8]);
      GL11.glHint(lIlIIlIllIIlll[12], lIlIIlIllIIlll[15]);
      GL11.glHint(lIlIIlIllIIlll[14], lIlIIlIllIIlll[15]);
   }

   public static void glColor(int lllllllllllllIIIIllllIIIIIIIIIII, float lllllllllllllIIIIlllIllllllllIlI) {
      float lllllllllllllIIIIlllIllllllllllI = (float)(lllllllllllllIIIIllllIIIIIIIIIII >> lIlIIlIllIIlll[2] & lIlIIlIllIIlll[1]) / 255.0F;
      float lllllllllllllIIIIlllIllllllllIII = (float)(lllllllllllllIIIIllllIIIIIIIIIII >> lIlIIlIllIIlll[3] & lIlIIlIllIIlll[1]) / 255.0F;
      float lllllllllllllIIIIlllIlllllllllII = (float)(lllllllllllllIIIIllllIIIIIIIIIII & lIlIIlIllIIlll[1]) / 255.0F;
      GL11.glColor4f(lllllllllllllIIIIlllIllllllllllI, lllllllllllllIIIIlllIllllllllIII, lllllllllllllIIIIlllIlllllllllII, lllllllllllllIIIIlllIllllllllIlI);
   }
}
