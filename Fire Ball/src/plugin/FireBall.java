package plugin;



import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
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

public class FireBall extends JavaPlugin implements Listener{

	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}




	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if(command.getName().equalsIgnoreCase("getfirestick")){
			Player p = (Player)sender;
			ItemStack superPalo = new ItemStack(Material.BLAZE_ROD);

			ItemMeta i = superPalo.getItemMeta();
			i.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			i.setDisplayName(ChatColor.GOLD+"SuperBlaze");
			superPalo.setItemMeta(i);
			p.setItemInHand(superPalo);
		}

		return false;
	}



	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent e){

		if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK ){
			Player p = e.getPlayer();

			ItemStack item = p.getItemInHand();
			if(item != null){
				ItemMeta i = item.getItemMeta();
				if(i != null){
					String s = i.getDisplayName();

					if(s != null && item.getType() == Material.BLAZE_ROD && s.contains("SuperBlaze")){

						Vector v = p.getEyeLocation().getDirection(); 

						p.launchProjectile(SmallFireball.class, v);


					}

				}
			}
		}



	}


}
