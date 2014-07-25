package io.github.qhenckel.skyBlock;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.sk89q.worldedit.WorldEdit;

public class SkyBlock extends JavaPlugin{
	
	World sbWorld;
	HashMap<Player, Island> islands = new HashMap<Player, Island>();
	
	public void onEnable() {
		this.saveDefaultConfig();
		String reqVer = "5.6.2";
		String currVer = Bukkit.getPluginManager().getPlugin("WorldEdit").getDescription().getVersion();
		if(currVer == reqVer && getConfig().getBoolean("checkDependVersions")) {
			getLogger().info("Found a good version of WorldEdit: " + currVer);
		} else {
			getLogger().warning("Please use WorldEdit version: " + reqVer);
			getLogger().warning("To override this check change the config file");
			Bukkit.getPluginManager().disablePlugin(this);
		}
		
		
		//create or load skyblock world
		String worldname = getConfig().getString("worldname");
		World w = Bukkit.getWorld(worldname);
		if(w == null) {
			getLogger().info("No world called: " + worldname + " found.");
			getLogger().info("Creating new world...");
			WorldCreator wc = new WorldCreator(worldname);
			wc.generator(new SBWorldGenerator());
			w = wc.createWorld();
		}
		sbWorld = w;
		
		//Load player islands
		File file = new File("owners.sb");
		//StringBuilder contents = new StringBuilder();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String text = null;
 
            // repeat until all lines are read
            while ((text = reader.readLine()) != null) {
            	String[] split = text.split(";");
            	String name = split[0];
            	String id = split[1];
            	Player p = Bukkit.getPlayer(name);
            	Island is = new Island(id);
                islands.put(p, is);
            }
        } catch (IOException e) {
            getLogger().warning("Error loading islands: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
            	 getLogger().warning("Error loading islands: " + e.getMessage());
            }
        }
	}
	
	public void onDisable() {
		//TODO save islands
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		//TODO add commands
		if(sender instanceof Player) {
			Player p = (Player) sender;		
			if(cmd.getName().equalsIgnoreCase("island")){
				
				if(args.length < 1 || args[0].equalsIgnoreCase("help")) {
					//TODO add help
					return true;
				}
				
				if(args[0].equalsIgnoreCase("create")) {
					Island is = new Island(getNextFreeIsland());
					//TODO teleport player
					return true;
				}
				
				if(args[0].equalsIgnoreCase("home")) {
					//TODO
					return true;
				}
				
				if(args[0].equalsIgnoreCase("delete")) {
					//TODO
					return true;
				}
				
				if(args[0].equalsIgnoreCase("add")) {
					//TODO
					return true;
				}
				
				if(args[0].equalsIgnoreCase("remove")) {
					//TODO
					return true;
				}
				
				if(args[0].equalsIgnoreCase("visit")) {
					//TODO
					return true;
				}
			}
		} else {
			if(cmd.getName().equalsIgnoreCase("island")){
				
				if(args[0].equalsIgnoreCase("world")) {
					//TODO 
					return true;
				}
			}
		}
		return false;
	}

	String getNextFreeIsland() {
		//TODO return next id
		return null;
	}
}
