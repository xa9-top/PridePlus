package net.ccbluex.liquidbounce.features.module.modules.combat;

import me.utils.WebUtil;
import net.ccbluex.liquidbounce.LiquidBounce;
import net.ccbluex.liquidbounce.injection.backend.Backend;

import java.io.File;
import java.io.IOException;

import static net.ccbluex.liquidbounce.utils.MinecraftInstance.mc;

/**
 * Skid by Paimon.
 * Fixed by WaWa & MolokyTeam
 *
 * @Date 2023/1/27
 */
public class AntiJbyteMod {

    public static File getMotherStatus(){
        return  new File(mc.getDataDir(), LiquidBounce.CLIENT_NAME + "-1.12");
    }
    public static String getSb() {
        String a = "PridePlus";
        return a;
    }
    public static String fuckyourmom(int i,boolean o,float k,double l){
        if(i == 1 && o==true && k==1.1f && l == 11.4){
            return "Using "+getSb()+" b"+LiquidBounce.CLIENT_VERSION;
        }else{
            return "JBY GOD";
        }
    }
    public static void checkMom2(){
        if(LiquidBounce.CLIENT_NAME == getSb()){
            System.out.println("Using " + getSb() + " b"+LiquidBounce.CLIENT_VERSION);
        }else{
            System.exit(0);
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
    /**
     * 取两个文本之间的文本值
     *
     * @param text
     * @param left
     * @param right
     * @return
     */
    public static String getSubString(String text, String left, String right) {
        String result = "";
        int zLen;
        if (left == null || left.isEmpty()) {
            zLen = 0;
        } else {
            zLen = text.indexOf(left);
            if (zLen > -1) {
                zLen += left.length();
            } else {
                zLen = 0;
            }
        }
        int yLen = text.indexOf(right, zLen);
        if (yLen < 0 || right == null || right.isEmpty()) {
            yLen = text.length();
        }
        result = text.substring(zLen, yLen);
        return result;
    }
}
