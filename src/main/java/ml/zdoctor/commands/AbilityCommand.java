package ml.zdoctor.commands;

import ml.zdoctor.gui.CustomInventory;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AbilityCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;

            CustomInventory i = new CustomInventory();

            i.newInventory(player);
        } else {
            sender.sendMessage(ChatColor.RED + "Only players can do this!");
        }

        return true;
    }
}
