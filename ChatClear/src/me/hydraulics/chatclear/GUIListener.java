package me.hydraulics.chatclear;

import org.bukkit.event.inventory.*;
import org.bukkit.entity.*;
import org.bukkit.*;
import java.util.*;
import org.bukkit.event.*;

public class GUIListener implements Listener
{
    private Main main;

    public GUIListener(final Main main) {
        this.main = main;
    }

    @EventHandler
    private void inventoryClick(final InventoryClickEvent e) {
        final Player p = (Player)e.getWhoClicked();
        if (e.getView().getTitle().equalsIgnoreCase(String.valueOf(ChatColor.RED.toString()) + ChatColor.BOLD + "ChatClear")) {
            e.setCancelled(true);
            if (e.getCurrentItem() == null || e.getCurrentItem().getType().equals(Material.STAINED_GLASS_PANE)) {
                return;
            }
            if (e.getSlot() == 13 && e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§lChatClear")) {
                for (int i = 0; i < 300; ++i) {
                    Bukkit.broadcastMessage("");
                }
                final List<String> list = (List<String>)this.main.getConfig().getStringList("ChatClearGlobal");
                for (final String l : list) {
                    Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', l.replaceAll("%player%", p.getName())));
                    p.closeInventory();
                }
            }
        }
    }
}
