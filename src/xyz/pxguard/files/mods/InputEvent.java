package xyz.pxguard.files.mods;

import net.minecraft.client.settings.KeyBinding;

public class InputEvent {

   public static boolean dabLocked;
   public static int prevDabbingHeld;
   public static final int MAX_DABBING_HELD;
   public static boolean printed;
   public static boolean dabbing;
   public static float firstPersonPartialTicks;
   private static final int[] lIllIllIIIIII;
   private KeyBinding event;
   public static int dabbingHeld;


   public void onRender(int llllllllllllllIIIIIIlllllIIlllII) {
      firstPersonPartialTicks = (float)llllllllllllllIIIIIIlllllIIlllII;
   }

   private static boolean lIIIIllllIlllIl(int llllllllllllllIIIIIIlllllIIlIlIl) {
      return llllllllllllllIIIIIIlllllIIlIlIl != 0;
   }

   private static boolean lIIIIllllIlllll(int llllllllllllllIIIIIIlllllIIlIIIl) {
      return llllllllllllllIIIIIIlllllIIlIIIl > 0;
   }

   private static boolean lIIIIllllIlllII(int llllllllllllllIIIIIIlllllIIlIIll) {
      return llllllllllllllIIIIIIlllllIIlIIll == 0;
   }

   public void onKeyInput(KeyBinding llllllllllllllIIIIIIlllllIlIIIIl) {
      if(lIIIIllllIlllII(dabLocked)) {
         if(lIIIIllllIlllIl(llllllllllllllIIIIIIlllllIlIIIII.event.isKeyDown())) {
            dabbing = (boolean)lIllIllIIIIII[0];
            "".length();
            if(((84 ^ 26 ^ 113 ^ 92) & (192 + 123 - 150 + 63 ^ 9 + 8 - -94 + 24 ^ -" ".length())) == " ".length()) {
               return;
            }
         } else {
            dabbing = (boolean)lIllIllIIIIII[1];
         }
      }

   }

   public void onTick() {
      prevDabbingHeld = dabbingHeld;
      if(lIIIIllllIlllIl(dabbing) && lIIIIllllIllllI(dabbingHeld, lIllIllIIIIII[2])) {
         dabbingHeld += lIllIllIIIIII[0];
         "".length();
         if(null != null) {
            return;
         }
      } else if(lIIIIllllIlllII(dabbing) && lIIIIllllIlllll(dabbingHeld)) {
         dabbingHeld -= lIllIllIIIIII[0];
      }

   }

   static {
      lIIIIllllIllIll();
      MAX_DABBING_HELD = lIllIllIIIIII[2];
      dabbing = (boolean)lIllIllIIIIII[1];
      printed = (boolean)lIllIllIIIIII[1];
      dabbingHeld = lIllIllIIIIII[1];
      prevDabbingHeld = lIllIllIIIIII[1];
      dabLocked = (boolean)lIllIllIIIIII[1];
   }

   private static void lIIIIllllIllIll() {
      lIllIllIIIIII = new int[3];
      lIllIllIIIIII[0] = " ".length();
      lIllIllIIIIII[1] = (24 ^ 110 ^ 12 ^ 102) & (90 + 9 - 76 + 120 ^ 34 + 36 - -40 + 37 ^ -" ".length());
      lIllIllIIIIII[2] = 191 ^ 183;
   }

   private static boolean lIIIIllllIllllI(int llllllllllllllIIIIIIlllllIIllIII, int llllllllllllllIIIIIIlllllIIlIlll) {
      return llllllllllllllIIIIIIlllllIIllIII < llllllllllllllIIIIIIlllllIIlIlll;
   }
}
