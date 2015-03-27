package ejemplo;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PluginEjemploClass extends JavaPlugin implements Listener{

	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
	public void onPlayerLogIn(BlockBreakEvent e){
		
		Player jugador = e.getPlayer();
		PotionEffect efecto = new PotionEffect(PotionEffectType.BLINDNESS, 300, 100);
		jugador.addPotionEffect(efecto);
		
		
	}
	
}
