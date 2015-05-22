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
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Fly extends JavaPlugin implements Listener{
	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}




	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if(command.getName().equalsIgnoreCase("getflyshoes")){
			Player p = (Player)sender;
			ItemStack flyshoes = new ItemStack(Material.DIAMOND_BOOTS);

			ItemMeta i = flyshoes.getItemMeta();
			i.setDisplayName(ChatColor.GOLD+"Fly Shoes");
			flyshoes.setItemMeta(i);
			p.setItemInHand(flyshoes);
		}

		return false;
	}


	@EventHandler
	public void onPlayerInteract(PlayerMoveEvent e){

		Player p = e.getPlayer();

		ItemStack item = p.getInventory().getBoots();
		if(item != null){
			ItemMeta i = item.getItemMeta();
			if(i != null){
				String s = i.getDisplayName();

				if(s != null && item.getType() == Material.DIAMOND_BOOTS && s.contains("Fly Shoes")){



					p.setAllowFlight(true);


				}else{
					p.setAllowFlight(false);
				}

			}else{
				p.setAllowFlight(false);
			}
		}else{
			p.setAllowFlight(false);
		}




	}















}
