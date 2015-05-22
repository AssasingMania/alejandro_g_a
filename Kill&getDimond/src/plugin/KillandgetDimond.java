package plugin;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.SmallFireball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;

public class KillandgetDimond {
	

	public class SwordTray extends JavaPlugin implements Listener{
		@Override
		public void onEnable() {

			Bukkit.getServer().getPluginManager().registerEvents(this, this);	
		}


		@EventHandler
		public void onPlayerInteract(EntityDamageByEntityEvent e){


			if(e.getEntity() instanceof Player && e.getDamager() instanceof Player){

				Player p = (Player) e.getEntity();
				if(p.getHealth() < 1){
					ItemStack i = new ItemStack(Material.DIAMOND);

					((Player) e.getDamager()).getInventory().addItem(i);
				}
				



			}




		}

	}
}
