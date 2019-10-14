package xyz.pxguard.files.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;

public class GuiWindow extends Gui {

   public Minecraft mc;
   public int right;
   public int windowZIndex;
   public int left;
   public double posY;
   public int top;
   public double posX;
   public int sizeW;
   private int lastScaledW;
   public FontRenderer fontRenderer;
   private int lastScaledH;
   public final String name;
   public int bottom;
   private static final int[] lIlIIIIlllllIl;
   public boolean visible;
   public int sizeH;


   public GuiWindow(String lllllllllllllIIIlIlIlIIlIIIIIlIl, int lllllllllllllIIIlIlIlIIlIIIIIlII, int lllllllllllllIIIlIlIlIIIllllllll) {
      lllllllllllllIIIlIlIlIIlIIIIIllI.visible = (boolean)lIlIIIIlllllIl[0];
      lllllllllllllIIIlIlIlIIlIIIIIllI.name = lllllllllllllIIIlIlIlIIlIIIIIlIl;
      lllllllllllllIIIlIlIlIIlIIIIIllI.sizeW = lllllllllllllIIIlIlIlIIlIIIIIlII;
      lllllllllllllIIIlIlIlIIlIIIIIllI.sizeH = lllllllllllllIIIlIlIlIIIllllllll;
   }

   public void calculatePositions(int lllllllllllllIIIlIlIlIIIllIlllIl, int lllllllllllllIIIlIlIlIIIllIlllII) {
      lllllllllllllIIIlIlIlIIIlllIIIIl.left = (int)(lllllllllllllIIIlIlIlIIIlllIIIIl.posX * (double)(lllllllllllllIIIlIlIlIIIllIlllIl - lllllllllllllIIIlIlIlIIIlllIIIIl.sizeW));
      lllllllllllllIIIlIlIlIIIlllIIIIl.top = (int)(lllllllllllllIIIlIlIlIIIlllIIIIl.posY * (double)(lllllllllllllIIIlIlIlIIIllIlllII - lllllllllllllIIIlIlIlIIIlllIIIIl.sizeH));
      lllllllllllllIIIlIlIlIIIlllIIIIl.right = lllllllllllllIIIlIlIlIIIlllIIIIl.left + lllllllllllllIIIlIlIlIIIlllIIIIl.sizeW;
      lllllllllllllIIIlIlIlIIIlllIIIIl.bottom = lllllllllllllIIIlIlIlIIIlllIIIIl.top + lllllllllllllIIIlIlIlIIIlllIIIIl.sizeH;
   }

   public void setPosition(double lllllllllllllIIIlIlIlIIIllIlIlII, double lllllllllllllIIIlIlIlIIIllIlIllI) {
      lllllllllllllIIIlIlIlIIIllIlIlIl.posX = lllllllllllllIIIlIlIlIIIllIlIlII;
      lllllllllllllIIIlIlIlIIIllIlIlIl.posY = lllllllllllllIIIlIlIlIIIllIlIllI;
      lllllllllllllIIIlIlIlIIIllIlIlIl.calculatePositions(lllllllllllllIIIlIlIlIIIllIlIlIl.lastScaledW, lllllllllllllIIIlIlIlIIIllIlIlIl.lastScaledH);
   }

   public final void renderGameOverlay0(int lllllllllllllIIIlIlIlIIIlllIIlll, int lllllllllllllIIIlIlIlIIIlllIIllI, float lllllllllllllIIIlIlIlIIIlllIlIIl) {
      if(!llllIIIIIlIlIIl(lllllllllllllIIIlIlIlIIIlllIllII.lastScaledW, lllllllllllllIIIlIlIlIIIlllIIlll) || llllIIIIIlIlIlI(lllllllllllllIIIlIlIlIIIlllIllII.lastScaledH, lllllllllllllIIIlIlIlIIIlllIIllI)) {
         lllllllllllllIIIlIlIlIIIlllIllII.calculatePositions(lllllllllllllIIIlIlIlIIIlllIIlll, lllllllllllllIIIlIlIlIIIlllIIllI);
         lllllllllllllIIIlIlIlIIIlllIllII.lastScaledW = lllllllllllllIIIlIlIlIIIlllIIlll;
         lllllllllllllIIIlIlIlIIIlllIllII.lastScaledH = lllllllllllllIIIlIlIlIIIlllIIllI;
      }

      lllllllllllllIIIlIlIlIIIlllIllII.renderGameOverlay(lllllllllllllIIIlIlIlIIIlllIIlll, lllllllllllllIIIlIlIlIIIlllIIllI, lllllllllllllIIIlIlIlIIIlllIlIIl);
      lllllllllllllIIIlIlIlIIIlllIllII.mc.getTextureManager().bindTexture(icons);
   }

   private static boolean llllIIIIIlIlIlI(int lllllllllllllIIIlIlIlIIIllIIllII, int lllllllllllllIIIlIlIlIIIllIIlIll) {
      return lllllllllllllIIIlIlIlIIIllIIllII != lllllllllllllIIIlIlIlIIIllIIlIll;
   }

   public void onLoad() {}

   static {
      llllIIIIIlIlIII();
   }

   private static void llllIIIIIlIlIII() {
      lIlIIIIlllllIl = new int[1];
      lIlIIIIlllllIl[0] = " ".length();
   }

   public void setSize(int lllllllllllllIIIlIlIlIIIllllIllI, int lllllllllllllIIIlIlIlIIIlllllIII) {
      if(!llllIIIIIlIlIIl(lllllllllllllIIIlIlIlIIIlllllIlI.sizeH, lllllllllllllIIIlIlIlIIIlllllIII) || !llllIIIIIlIlIIl(lllllllllllllIIIlIlIlIIIlllllIlI.sizeW, lllllllllllllIIIlIlIlIIIllllIllI)) {
         lllllllllllllIIIlIlIlIIIlllllIlI.sizeW = lllllllllllllIIIlIlIlIIIllllIllI;
         lllllllllllllIIIlIlIlIIIlllllIlI.sizeH = lllllllllllllIIIlIlIlIIIlllllIII;
         lllllllllllllIIIlIlIlIIIlllllIlI.calculatePositions(lllllllllllllIIIlIlIlIIIlllllIlI.lastScaledW, lllllllllllllIIIlIlIlIIIlllllIlI.lastScaledH);
      }
   }

   public void renderGameOverlay(int lllllllllllllIIIlIlIlIIIllllIIll, int lllllllllllllIIIlIlIlIIIllllIIlI, float lllllllllllllIIIlIlIlIIIllllIIIl) {}

   private static boolean llllIIIIIlIlIIl(int lllllllllllllIIIlIlIlIIIllIlIIII, int lllllllllllllIIIlIlIlIIIllIIllll) {
      return lllllllllllllIIIlIlIlIIIllIlIIII == lllllllllllllIIIlIlIlIIIllIIllll;
   }
}
