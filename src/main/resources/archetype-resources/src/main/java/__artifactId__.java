package ${package};

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Simple Plugin
 *
 */
public class \${artifactId} extends JavaPlugin
{
    public void onEnable(){
        getCommand("\${artifactId}").setExecutor(new \${artifactId}Command());
        getLogger().info("\${artifactId} enabled");
    }

    public void onDisable(){
        getLogger().info("\${artifactId} disabled");
    }
}
