/*
 * LiquidBounce Hacked Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge.
 * https://github.com/CCBlueX/LiquidBounce/
 */
package net.ccbluex.liquidbounce.features.module.modules.misc

import net.ccbluex.liquidbounce.LiquidBounce
import net.ccbluex.liquidbounce.event.EventTarget
import net.ccbluex.liquidbounce.event.UpdateEvent
import net.ccbluex.liquidbounce.features.module.Module
import net.ccbluex.liquidbounce.features.module.ModuleCategory
import net.ccbluex.liquidbounce.features.module.ModuleInfo
import net.ccbluex.liquidbounce.features.module.modules.world.Scaffold
import net.ccbluex.liquidbounce.features.module.modules.world.Timer
import net.ccbluex.liquidbounce.value.FloatValue

@ModuleInfo(name = "ScaffoldHelper", description = "WaWa",category = ModuleCategory.MISC)
class ScaffoldHelper : Module() {
    val Scaffold = LiquidBounce.moduleManager[Scaffold::class.java] as Scaffold
    val Timer = LiquidBounce.moduleManager[Timer::class.java] as Timer

    private val timerValue = FloatValue("TimerValue",0.85F,0.00F,1.00F)

    override fun onEnable(){
        Timer.speedValue.set(timerValue.get())
    }

    override fun onDisable() {
        Scaffold.state = false
        super.onDisable()
    }
    @EventTarget
    fun onUpdate(event: UpdateEvent){
        if (mc.thePlayer!!.onGround) {
            Scaffold.state = false
            Timer.state = true
            mc2.player.jump()
        } else {
            Scaffold.state = true
            Timer.state = false
            mc2.player.jump()
        }
    }
}
