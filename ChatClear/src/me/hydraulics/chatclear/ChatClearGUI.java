package me.hydraulics.chatclear;

import org.bukkit.event.*;
import org.bukkit.command.*;
import org.bukkit.entity.*;
import org.bukkit.*;
import java.util.*;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.*;

public class ChatClearGUI implements CommandExecutor, Listener
{
    private Main main;

    public ChatClearGUI(final Main main) {
        this.main = main;
    }

    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (sender instanceof Player) {
            final Player p = (Player)sender;
            if (cmd.getName().equalsIgnoreCase("ChatClear") && p.hasPermission("ChatClear.clear")) {
                final Inventory help = Bukkit.getServer().createInventory((InventoryHolder)p, 27, String.valueOf(ChatColor.RED.toString()) + ChatColor.BOLD + "ChatClear");
                final ItemStack ref1 = new ItemStack(Material.REDSTONE_BLOCK);
                final ItemStack ref2 = new ItemStack(Material.STAINED_GLASS_PANE);
                final ItemMeta metaref1 = ref1.getItemMeta();
                final ItemMeta metaref2 = ref2.getItemMeta();
                final ArrayList<String> lore = new ArrayList<String>();
                lore.add(ChatColor.YELLOW + "Clear Global Chat!");
                metaref1.setLore((List)lore);
                metaref1.setDisplayName("§c§lChatClear");
                metaref2.setDisplayName("");
                ref1.setItemMeta(metaref1);
                help.setItem(13, ref1);
                help.setItem(0, ref2);
                help.setItem(1, ref2);
                help.setItem(2, ref2);
                help.setItem(3, ref2);
                help.setItem(4, ref2);
                help.setItem(5, ref2);
                help.setItem(6, ref2);
                help.setItem(7, ref2);
                help.setItem(8, ref2);
                help.setItem(9, ref2);
                help.setItem(10, ref2);
                help.setItem(11, ref2);
                help.setItem(12, ref2);
                help.setItem(14, ref2);
                help.setItem(15, ref2);
                help.setItem(16, ref2);
                help.setItem(17, ref2);
                help.setItem(18, ref2);
                help.setItem(19, ref2);
                help.setItem(20, ref2);
                help.setItem(21, ref2);
                help.setItem(22, ref2);
                help.setItem(23, ref2);
                help.setItem(24, ref2);
                help.setItem(25, ref2);
                help.setItem(26, ref2);
                p.openInventory(help);
            }
        }
        return false;
    }
}
