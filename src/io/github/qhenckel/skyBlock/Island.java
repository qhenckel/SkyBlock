package io.github.qhenckel.skyBlock;

import java.util.ArrayList;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class Island {
	
	Player owner;
	Location center;
	ArrayList<Player> helpers;
	Location spawn;
	String id;
	
	Island(String i) {
		id = i;
		
		//TODO If island exists
		//TODO load island
		//else
		//TODO create an island
		//TODO create island spawn
		helpers = new ArrayList<Player>();
		//owner = p;
		//center = l;
	}
	
	public Player getOwner() {
		return owner;
	}
	
	public void setOwner(Player p){
		owner = p;
		return;
	}
	
	public Location getLocation() {
		return center;
	}
	
	public void setLocation(Location l) {
		center = l;
		return;
	}
	
	public Location getSpawn() {
		return spawn;
	}
	
	public void setSpawn(Location s) {
		//TODO add spawn validation
		spawn = s;
		return;
	}
	
	public ArrayList<Player> getHelpers() {
		return helpers;
	}
	
	public boolean isHelper(Player p) {
		return helpers.contains(p.getName());
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
