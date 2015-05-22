package plugin;

import javax.persistence.Entity;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityInteractEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.entity.EntityUnleashEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class CREEPERHAXXX extends JavaPlugin implements Listener{

	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if(command.getName().equalsIgnoreCase("getcreeperhax")){
			Player p = (Player)sender;
			ItemStack creeperhax = new ItemStack(Material.NETHER_STAR);

			ItemMeta i = creeperhax.getItemMeta();
			i.addEnchant(Enchantment.DAMAGE_ALL, 1000000000, false);
			i.setDisplayName(ChatColor.GREEN+""+ChatColor.BOLD+""+ChatColor.ITALIC+"Creeper Hax XD");
			creeperhax.setItemMeta(i);
			p.setItemInHand(creeperhax);
		}

		return false;
	}
	
	@EventHandler
	public void onPlayerInteract(PlayerInteractEntityEvent e){

		if(e.getRightClicked() instanceof Creeper){
			Creeper c =(Creeper) e.getRightClicked();
			Player p = e.getPlayer();

			ItemStack item = p.getItemInHand();
			if(item != null){
				ItemMeta i = item.getItemMeta();
				if(i != null){
					String s = i.getDisplayName();

					if(s != null && item.getType() == Material.NETHER_STAR && s.contains("Creeper Hax XD")){
						Location l = c.getLocation();
						World w = l.getWorld();
						w.spawnEntity(l, EntityType.RABBIT);
						c.remove();
						
					}

				}
			}
		}



	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
