package io.github.qhenckel.skyBlock;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class SkyBlock extends JavaPlugin{
	
	World sbWorld;
	
	
	public void onEnable() {
		this.saveDefaultConfig();
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
	}
	
	public void onDisable() {
		
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
					Island is = new Island(p, getNextFreeIsland());
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
			sender.sendMessage("You must be a player");
		}
		return false;
	}

	private Location getNextFreeIsland() {
		// TODO Auto-generated method stub
		return null;
	}
}
