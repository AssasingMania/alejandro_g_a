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
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class KICKOUT extends JavaPlugin implements Listener{
	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);


	}


	@EventHandler
	public void onPlayerInteract(PlayerJoinEvent e){
		//QUIERO Q LA FLECHA TE TELETRANSPORTE!
		Player p = e.getPlayer();
		if(p.getName().contains("google") || p.getName().contains("Luckyprogamer") || p.getName().equals("")){
			p.kickPlayer("Not allowed MOTHER FUCKERRRRRRRRRR");
		}
	}
	
	
	
}
