package plugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
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

public class House extends JavaPlugin implements Listener{

	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}




	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if(command.getName().equalsIgnoreCase("gethouseconstructor")){
			Player p = (Player)sender;
			ItemStack con= new ItemStack(Material.EMERALD);

			ItemMeta i = con.getItemMeta();
			i.addEnchant(Enchantment.DAMAGE_ALL, 6, false);
			i.setDisplayName(ChatColor.GREEN +""+ ChatColor.BOLD +"EMERALD CONSTRUCTOR");
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

					if(s != null && item.getType() == Material.EMERALD && s.contains("EMERALD CONSTRUCTOR")){



						Location loc = p.getTargetBlock(null, 255).getLocation();
						World w = loc.getWorld();
						
						int t = 5;
						for(int x=0;x<t ;x++){
							
							for(int y=0;y<t;y++){
								
								for(int z=0;z<t;z++){
									Block b = w.getBlockAt(x+loc.getBlockX(),y+loc.getBlockY(),z+loc.getBlockZ());
									b.setType(Material.WOOD);
									if(x == 2 && (y == 1 || y == 2) && z == 4){
										b.setType(Material.AIR);
									
										
									}
									
									if(x == 2 && y == 2 && z == 0){	
										b.setType(Material.GLASS);
									}
									if(x == 0 && y == 2 && z == 2){
										b.setType(Material.GLASS);
									}
									if(x== 4 && z== 2 && y== 2){	
										b.setType(Material.GLASS);
									}
								}
							}
						}
						t = 4;
						for(int x = 1; x<t ;x++){
							
							for(int y=1;y<t;y++){
								
								for(int z=1;z<t;z++){
									Block b = w.getBlockAt(x+loc.getBlockX(),y+loc.getBlockY(),z+loc.getBlockZ());
									b.setType(Material.AIR);
									
									if(x== 1 && z== 1 && y==1){
										b.setType(Material.CHEST);
										Bukkit.getServer().broadcastMessage("");
									}
									if(x == 1 && z== 2 && y== 1){
										b.setType(Material.FURNACE);
										Bukkit.getServer().broadcastMessage("");
									}
									if(x== 1 && z== 3 && y== 1){
										b.setType(Material.WORKBENCH);
										Bukkit.getServer().broadcastMessage("");
									}
							}
						}
						
						
						
						
						


					}

				}
			}
		}



	}


}
}



