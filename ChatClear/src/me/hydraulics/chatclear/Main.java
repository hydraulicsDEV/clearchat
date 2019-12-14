package me.hydraulics.chatclear;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.*;
import net.md_5.bungee.api.*;
import org.bukkit.command.*;
import org.bukkit.*;
import org.bukkit.event.*;
import org.bukkit.plugin.*;

public class Main extends JavaPlugin
{
    public void onEnable() {
        this.getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + "ChatClear has been Enabled!!");
        this.getCommand("ChatClear").setExecutor((CommandExecutor)new ChatClearGUI(this));
        Bukkit.getPluginManager().registerEvents((Listener)new GUIListener(this), (Plugin)this);
        this.getConfig().options().copyDefaults();
        this.saveDefaultConfig();
    }
}
