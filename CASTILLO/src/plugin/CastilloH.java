package plugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;


public class CastilloH extends JavaPlugin implements Listener{
	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}




	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(command.getName().equalsIgnoreCase("getcastlecreator")){
			Player p = (Player)sender;
			ItemStack con= new ItemStack(Material.FEATHER);

			ItemMeta i = con.getItemMeta();
			i.addEnchant(Enchantment.DAMAGE_ALL, 6, false);
			i.setDisplayName(ChatColor.YELLOW +""+ ChatColor.BOLD +""+ ChatColor.ITALIC +  "Feather Creator");
			con.setItemMeta(i);
			p.setItemInHand(con);
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

					if(s != null && item.getType() == Material.FEATHER && s.contains("Creator")){
						construirCastillo(p.getLocation());
					}
				}
			}
		}
	}




	private void construirCastillo(Location location) {
		int largo = 21;
		int ancho = 7;
		int alto = 6;
		Material castleMaterial = Material.COBBLESTONE;

		int Px = location.getBlockX();
		int Pz = location.getBlockZ();
		int Py = location.getBlockY();
		construirBase(location,ancho,largo,Px,Py,Pz,castleMaterial);
		

	}




























	private void construirPared(Location location, int ancho, int largo, int px, int py, int pz, Material castleMaterial, int alto) {
		for(int x = 0; x <= ancho; x++){
			for(int y = 0; y <= alto; y++){
				for(int z = 0; z <= largo; z++){
					if(x >= 0 && x <= ancho && z == 0){
						Block b = location.getWorld().getBlockAt(px+x, py+y, pz+z);
						b.setType(castleMaterial);
						
					}
					if(z >= 0 && z <= largo && x == 0){
						Block b = location.getWorld().getBlockAt(px+x, py+y, pz+z);
						b.setType(castleMaterial);
					}
					if(x >= 0 && x <= ancho && z == largo){
						Block b = location.getWorld().getBlockAt(px+x, py+y, pz+z);
						b.setType(castleMaterial);
						
					}
					if(z >= 0 && z <= largo && x == ancho && !(z >= 7 && z <= 13 && x == 7)){
						Block b = location.getWorld().getBlockAt(px+x, py+y, pz+z);
						b.setType(castleMaterial);
						
					}
					
					
					
				}
			}
		}
		
	}




	private void construirPared1(Location location, int ancho, int largo, int px, int py, int pz, Material castleMaterial, int alto) {
		for(int x = 0; x <= ancho; x++){
			for(int y = 0; y <= alto; y++){
				for(int z = 0; z <= largo; z++){
					if(x >= 0 && x <= ancho && z == 0){
						Block b = location.getWorld().getBlockAt(px+x, py+y, pz+z);
						b.setType(castleMaterial);
						
					}
					if(z >= 0 && z <= largo && x == ancho){
						Block b = location.getWorld().getBlockAt(px+x, py+y, pz+z);
						b.setType(castleMaterial);
					}
					if(x >= 0 && x <= ancho && z == largo){
						Block b = location.getWorld().getBlockAt(px+x, py+y, pz+z);
						b.setType(castleMaterial);
						
					}
					
					if(z >= 0 && z <= largo && x == 0 && z < 7 && z > 13){
						Block b = location.getWorld().getBlockAt(px+x, py+y, pz+z);
						b.setType(castleMaterial);
						
					}
					
					
					
				}
			}
		}
		
	}
	
		
	



	private void construirBase(Location location, int ancho, int largo, int Px, int Py, int Pz, Material castleMaterial) {
		for(int x = 0; x <= ancho; x++){
			for(int z = 0; z <= largo; z++){
				Block b = location.getWorld().getBlockAt(Px+x, Py, Pz+z);
				b.setType(castleMaterial);
				construirPared(location,ancho,largo,Px,Py,Pz,castleMaterial,6);





				int xPuente = x;
				Bukkit.broadcastMessage(xPuente+", "+x+", "+ z +"");
				if(z >= 7 && z <= 13 && x == 7){


					for(int k = 1; k <= 11; k++){
						xPuente = xPuente + 1;

						Block b2 = location.getWorld().getBlockAt(Px+xPuente, Py, Pz+z);
						b2.setType(castleMaterial);
					}
				}

			}

		}
		Px = Px + (ancho + 11);
		for(int x = 0; x < ancho; x++){
			for(int z = 0; z < largo; z++){
				Block b = location.getWorld().getBlockAt(Px+x, Py, Pz+z);
				b.setType(castleMaterial);
				construirPared1(location,ancho,largo,Px,Py,Pz,castleMaterial,6);
			}

		}
	}
}
