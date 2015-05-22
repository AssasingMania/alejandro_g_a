package plugin;



import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Flecha extends JavaPlugin implements Listener{
	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);


	}


	public boolean onCommand(CommandSender sender, Command command, String label, String[] args, ProjectileHitEvent e) {

		if(command.getName().equalsIgnoreCase("getteleporter")){
			Player p = (Player)sender;
			ItemStack teleporterbow = new ItemStack(Material.BOW);

			ItemMeta i = teleporterbow.getItemMeta();
			i.addEnchant(Enchantment.DAMAGE_ALL, 7, true);
			i.setDisplayName(ChatColor.BOLD+""+ ChatColor.AQUA+""+ ChatColor.ITALIC+""+("Teleporter Bow"));
			teleporterbow.setItemMeta(i);
			p.setItemInHand(teleporterbow);


		}

		return false;
	}


	@EventHandler
	public void onPlayerInteract(ProjectileHitEvent e){
		//QUIERO Q LA FLECHA TE TELETRANSPORTE!
		if(e.getEntity().getShooter() instanceof Player){
			Player p = (Player) e.getEntity().getShooter();
			if(p.getItemInHand().getItemMeta().getDisplayName().contains("Teleporter")){
				Location loc = e.getEntity().getLocation();
				p.teleport(loc);
			}
			
			
		}
		
	}
	
	
	
}
