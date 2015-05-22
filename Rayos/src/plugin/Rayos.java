package plugin;



import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.entity.SmallFireball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;

public class Rayos extends JavaPlugin implements Listener{

	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}




	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if(command.getName().equalsIgnoreCase("getzeusstick")){
			Player p = (Player)sender;
			ItemStack lightningstick = new ItemStack(Material.STICK);

			ItemMeta i = lightningstick.getItemMeta();
			i.addEnchant(Enchantment.DAMAGE_ALL, 6, true);
			i.setDisplayName(ChatColor.BLUE+""+ ChatColor.BOLD+"Zeus Stick");
			lightningstick.setItemMeta(i);
			p.setItemInHand(lightningstick);
		}

		return false;
	}



	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent e){

		if(e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR){
			Player p = e.getPlayer();

			ItemStack item = p.getItemInHand();
			if(item != null){
				ItemMeta i = item.getItemMeta();
				if(i != null){
					String s = i.getDisplayName();

					if(s != null && item.getType() == Material.STICK && s.contains("Zeus Stick")){

						

						Location loc = p.getTargetBlock(null, 255).getLocation();
						
						for(int j=0;j<50;j++){
							p.getWorld().strikeLightning(loc);
						}
					}

				}
			}
		}



	}


}
