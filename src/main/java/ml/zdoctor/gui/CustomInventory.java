package ml.zdoctor.gui;

import ml.zdoctor.DemonSlayer;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class CustomInventory implements Listener {

    String inventory_title = DemonSlayer.plugin.getConfig().getString("select-ability-inventory-title");

    public void newInventory(Player player) {

        //water
        ItemStack water = new ItemStack(Material.IRON_NUGGET);
        ItemMeta water_meta = water.getItemMeta();
        water_meta.setLore(Arrays.asList("Ability of Giyu Tomioka, ", "the current Water Hashira"));
        water_meta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Water ability");
        water.setItemMeta(water_meta);

        //insect
        ItemStack insect = new ItemStack(Material.IRON_NUGGET);
        ItemMeta insect_meta = insect.getItemMeta();
        insect_meta.setLore(Arrays.asList("Ability of Shinobu Kocho, ", "the current Insect Hashira"));
        insect_meta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Insect ability");
        insect.setItemMeta(insect_meta);

        //flame
        ItemStack flame = new ItemStack(Material.IRON_NUGGET);
        ItemMeta flame_meta = flame.getItemMeta();
        flame_meta.setLore(Arrays.asList("Ability of Kyojuro Rengoku, ", "the current Flame Hashira"));
        flame_meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Flame ability");
        flame.setItemMeta(flame_meta);

        //sound
        ItemStack sound = new ItemStack(Material.IRON_NUGGET);
        ItemMeta sound_meta = sound.getItemMeta();
        sound_meta.setLore(Arrays.asList("Ability of Tengen Uzui, ", "the current Sound Hashira"));
        sound_meta.setDisplayName(ChatColor.GRAY + "" + ChatColor.BOLD + "Sound ability");
        sound.setItemMeta(sound_meta);

        //love
        ItemStack love = new ItemStack(Material.IRON_NUGGET);
        ItemMeta love_meta = love.getItemMeta();
        love_meta.setLore(Arrays.asList("Ability of Mitsuri Kanroji, ", "the current Love Hashira"));
        love_meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Love ability");
        love.setItemMeta(love_meta);

        //mist
        ItemStack mist = new ItemStack(Material.IRON_NUGGET);
        ItemMeta mist_meta = mist.getItemMeta();
        mist_meta.setLore(Arrays.asList("Ability of Muichiro Tokito, ", "the current Mist Hashira"));
        mist_meta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Mist ability");
        mist.setItemMeta(mist_meta);

        //stone
        ItemStack stone = new ItemStack(Material.IRON_NUGGET);
        ItemMeta stone_meta = stone.getItemMeta();
        stone_meta.setLore(Arrays.asList("Ability of Gyomei Himejima, ", "the current Stone Hashira"));
        stone_meta.setDisplayName(ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "Stone ability");
        stone.setItemMeta(stone_meta);

        //serpent
        ItemStack serpent = new ItemStack(Material.IRON_NUGGET);
        ItemMeta serpent_meta = serpent.getItemMeta();
        serpent_meta.setLore(Arrays.asList("Ability of Obanai Iguro, ", "the current Serpent Hashira"));
        serpent_meta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Serpent ability");
        serpent.setItemMeta(serpent_meta);

        //wind
        ItemStack wind = new ItemStack(Material.IRON_NUGGET);
        ItemMeta wind_meta = wind.getItemMeta();
        wind_meta.setLore(Arrays.asList("Ability of Sanemi Shinazugawa, ", "the current Wind Hashira"));
        wind_meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Wind ability");
        wind.setItemMeta(wind_meta);

        Inventory i = DemonSlayer.plugin.getServer().createInventory(null, 9, ChatColor.translateAlternateColorCodes('&', inventory_title));
        i.addItem(water);
        i.addItem(insect);
        i.addItem(flame);
        i.addItem(sound);
        i.addItem(love);
        i.addItem(mist);
        i.addItem(stone);
        i.addItem(serpent);
        i.addItem(wind);
        player.openInventory(i);
    }
}
