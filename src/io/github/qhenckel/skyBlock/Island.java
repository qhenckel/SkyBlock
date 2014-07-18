package io.github.qhenckel.skyBlock;

import java.util.ArrayList;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class Island {
	
	Player owner;
	Location center;
	ArrayList<Player> helpers;
	
	Island(Player p, Location l) {
		owner = p;
		center = l;
		helpers = new ArrayList<Player>();
		//TODO create an island
		//TODO tp the player
		//TODO create home?
	}
	
	public Player getOwner() {
		return owner;
	}
	
	public Location getLocation() {
		return center;
	}
	
	public ArrayList<Player> getHelpers() {
		return helpers;
	}
	
	public boolean isHelper(Player p) {
		return helpers.contains(p);
	}
	
	public boolean addHelper(Player p) {
		//returns true if the list changed
		return helpers.add(p);
	}
	
	public boolean removeHelper(Player p) {
		//returns true if the list changed
		return helpers.remove(p);
	}
	
	//TODO add a save method
	//TODO add a load method
}
