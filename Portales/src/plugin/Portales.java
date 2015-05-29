package plugin;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Portales extends JavaPlugin implements Listener{
	
	
	private HashMap<String, Location> destinos = new HashMap<String, Location>();
	
	
	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		destinos.put("micasa", new Location(null, 0, 0, 0));
		Location l = destinos.get("micasa");
		Player p = (Player) sender;
		p.getLocation();
		if(p == ){
			
			
		}
		return false;
	}












}