package net.ccbluex.liquidbounce.features.module.modules.combat;

import me.utils.WebUtil;
import net.ccbluex.liquidbounce.LiquidBounce;

import java.io.File;
import java.io.IOException;

import static net.ccbluex.liquidbounce.utils.MinecraftInstance.mc;

/**
 * Skid by Paimon.
 * Fixed by WaWa & MolokyTeam
 *
 * This is AntiJbyteMod
 */
public class CancelC03 {

    public static File getMotherStatus(){
        return  new File(mc.getDataDir(), LiquidBounce.CLIENT_NAME + "-1.12");
    }
    public static String getSb() {
        String a = "Pri";
        String b = "dePl";
        String c = "us";
        String d = a + b + c;
        return d;
    }
    public static String fuckyourmom(int i,boolean o,float k,double l){
        if(i == 1 && o==true && k==1.1f && l == 11.4){
            return "Using "+getSb()+" b"+LiquidBounce.CLIENT_VERSION;
        }else{
            return "JBY GOD";
        }
    }
    public static void checkMom() throws IOException {
        String a = WebUtil.get("https://gitee.com/wawa1337/bestloser/blob/master/RikkaMoloky");
        if  (a.contains(LiquidBounce.CLIENT_NAME)) {
            System.out.println("Gooood");
        } else {
            System.exit(0);
        }
    }
}
