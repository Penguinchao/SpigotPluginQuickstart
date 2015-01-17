package ${package};

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class \${artifactId}Command implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        sender.sendMessage("This is \${artifactId} version \${version}");
        return true;
    }
}