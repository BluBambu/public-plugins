package nulled.plugins.tooltips

import com.google.inject.Provides
import com.lucidplugins.exampleplugin.LucidExampleConfig
import net.runelite.api.events.ItemSpawned
import net.runelite.client.config.ConfigManager
import net.runelite.client.eventbus.Subscribe
import net.runelite.client.plugins.Plugin
import net.runelite.client.plugins.PluginDescriptor
import net.runelite.client.ui.overlay.OverlayManager
import net.runelite.client.ui.overlay.tooltip.TooltipManager
import javax.inject.Inject
import net.unethicalite.api.plugins.Script
import net.unethicalite.api.widgets.Widgets
import org.pf4j.Extension

@PluginDescriptor(name = "LucidExampleConfig")
@Extension
class TooltipsPlugin : Script() {
    @Inject
//    lateinit var overlayManager: OverlayManager

//    @Inject
//    lateinit var tooltipsOverlay: TooltipsOverlay

//    @Inject
//    lateinit var tooltipOverlay: TooltipOverlay

//    @Inject
//    lateinit var tooltipManager: TooltipManager

    @Provides
    fun provideConfig(configManager: ConfigManager): LucidExampleConfig {
        return configManager.getConfig(LucidExampleConfig::class.java)
    }

    override fun onStart(vararg  scriptArgs: String) {
    }

    override fun loop(): Int {
        return 0
    }
}