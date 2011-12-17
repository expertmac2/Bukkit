package org.bukkit.command.defaults;

import java.util.Arrays;
import org.bukkit.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class TestCommand extends Command {
	
    public TestCommand(String name) {
        super(name);
        this.description = "Testing Command";
        this.usageMessage = "/reload";
        this.setPermission("bukkit.command.reload");
        this.setAliases(Arrays.asList("rl"));
    }

    @Override
    public boolean execute(CommandSender sender, String currentAlias, String args[]) {
    	sender.sendMessage("Hi. You've called a test command! :D");
    	return true;
    }
}
