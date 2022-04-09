package jp.haruserver.mc.hctest.customitems;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MachtElytra {

	public static ItemStack machtElytra;

	public static void init() {
		createMachtElytra();
	}

	private static void createMachtElytra() {
		ItemStack item = new ItemStack(Material.ELYTRA,1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("MachtElytra");
		List<String> lore = new ArrayList<>();
		lore.add("test");
		lore.add("test2");
		meta.setLore(lore);
		item.setItemMeta(meta);
		machtElytra = item;
	}
}
