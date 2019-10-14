package xyz.pxguard.files.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngame;
import xyz.pxguard.files.mods.Compass;
import xyz.pxguard.files.mods.Keystrokes;
import xyz.pxguard.files.mods.StatusEffect;
import xyz.pxguard.files.modules.Modules;

public class GuiInGameHook extends GuiIngame {

   private static Compass compass;
   private static Keystrokes keys;
   private static Minecraft mc = Minecraft.getMinecraft();
   private static StatusEffect effects;


   private static boolean lIIlIllIIlIlIll(int lllllllllllllIlllIIlIIIIlllIIlII) {
      return lllllllllllllIlllIIlIIIIlllIIlII != 0;
   }

   public void renderGameOverlay(float lllllllllllllIlllIIlIIIIlllIlIII) {
      super.renderGameOverlay(lllllllllllllIlllIIlIIIIlllIlIII);
      if(lIIlIllIIlIlIlI(mc.gameSettings.showDebugInfo)) {
         if(lIIlIllIIlIlIll(Modules.isEnabledCompass())) {
            compass.drawCompass();
         }

         if(lIIlIllIIlIlIll(Modules.isEnabledKeystrokes())) {
            keys.render();
         }

         if(lIIlIllIIlIlIll(Modules.isEnabledKeystrokes())) {
            effects.render(mc);
         }
      }

   }

   public GuiInGameHook(Minecraft lllllllllllllIlllIIlIIIIlllIllII) {
      super(lllllllllllllIlllIIlIIIIlllIllII);
      compass = new Compass();
      keys = new Keystrokes(lllllllllllllIlllIIlIIIIlllIllII);
      effects = new StatusEffect();
   }

   private static boolean lIIlIllIIlIlIlI(int lllllllllllllIlllIIlIIIIlllIIIlI) {
      return lllllllllllllIlllIIlIIIIlllIIIlI == 0;
   }
}
