package cx.rain.qore;

import org.bukkit.plugin.java.JavaPlugin;

public final class Qore extends JavaPlugin {
    public static final String VERSION = "@version@";

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Loading Qore. Ver: " + VERSION);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        
    }
}
