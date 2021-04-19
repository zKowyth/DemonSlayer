package ml.zdoctor.listeners;

import ml.zdoctor.DemonSlayer;
import ml.zdoctor.gui.CustomInventory;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;

public class InvEvents implements Listener {

    @EventHandler
    public void InvClick(InventoryClickEvent e) {
        Player player = (Player) e.getWhoClicked();


        //water
        ItemStack water = new ItemStack(Material.IRON_NUGGET);
        ItemMeta water_meta = water.getItemMeta();
        water_meta.setLore(Arrays.asList("Ability of Giyu Tomioka, ", "the current Water Hashira"));
        water_meta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Water ability");
        water.setItemMeta(water_meta);

        if (e.getClickedInventory().contains(water, 1) && e.getClickedInventory() != null) {
            e.setCancelled(true);
        }

        if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "" + ChatColor.BOLD + "Water ability") && e.getClickedInventory() != null) {
            DemonSlayer.plugin.getConfig().set("players." + player.getName() + ".ability", "water");
            DemonSlayer.plugin.saveConfig();
            DemonSlayer.plugin.reloadConfig();

        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "" + ChatColor.BOLD + "Insect ability") && e.getClickedInventory() != null) {
            DemonSlayer.plugin.getConfig().set("players." + player.getName() + ".ability", "insect");
            DemonSlayer.plugin.saveConfig();
            DemonSlayer.plugin.reloadConfig();
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "Flame ability") && e.getClickedInventory() != null) {
            DemonSlayer.plugin.getConfig().set("players." + player.getName() + ".ability", "flame");
            DemonSlayer.plugin.saveConfig();
            DemonSlayer.plugin.reloadConfig();
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GRAY + "" + ChatColor.BOLD + "Sound ability") && e.getClickedInventory() != null) {
            DemonSlayer.plugin.getConfig().set("players." + player.getName() + ".ability", "sound");
            DemonSlayer.plugin.saveConfig();
            DemonSlayer.plugin.reloadConfig();
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Love ability") && e.getClickedInventory() != null) {
            DemonSlayer.plugin.getConfig().set("players." + player.getName() + ".ability", "love");
            DemonSlayer.plugin.saveConfig();
            DemonSlayer.plugin.reloadConfig();
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "" + ChatColor.BOLD + "Mist ability") && e.getClickedInventory() != null) {
            DemonSlayer.plugin.getConfig().set("players." + player.getName() + ".ability", "mist");
            DemonSlayer.plugin.saveConfig();
            DemonSlayer.plugin.reloadConfig();
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "Stone ability") && e.getClickedInventory() != null) {
            DemonSlayer.plugin.getConfig().set("players." + player.getName() + ".ability", "stone");
            DemonSlayer.plugin.saveConfig();
            DemonSlayer.plugin.reloadConfig();
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "Serpent ability") && e.getClickedInventory() != null) {
            DemonSlayer.plugin.getConfig().set("players." + player.getName() + ".ability", "serpent");
            DemonSlayer.plugin.saveConfig();
            DemonSlayer.plugin.reloadConfig();
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "Wind ability") && e.getClickedInventory() != null) {
            DemonSlayer.plugin.getConfig().set("players." + player.getName() + ".ability", "wind");
            DemonSlayer.plugin.saveConfig();
            DemonSlayer.plugin.reloadConfig();
        }
    }
}
