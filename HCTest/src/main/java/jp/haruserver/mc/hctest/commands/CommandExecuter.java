package jp.haruserver.mc.hctest.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import jp.haruserver.mc.hctest.customitems.MachtElytra;

public class CommandExecuter implements CommandExecutor{
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(!(sender instanceof Player)) return false;
		Player player = (Player)sender;
		if(label.equals("hctest")) {
			player.getInventory().addItem(MachtElytra.machtElytra);
		}
		if(label.equals("hctest2")) {
			if(player.getInventory().getItemInMainHand().getItemMeta().equals(MachtElytra.machtElytra.getItemMeta())) {
				player.sendMessage("メインハンドアイテム一致");
			}
			ItemStack newItem = MachtElytra.machtElytra;
			if(newItem.getItemMeta().equals(MachtElytra.machtElytra.getItemMeta())) {
				player.sendMessage("新規生成ItemStack一致");
			}
			ItemMeta playerHand = player.getInventory().getItemInMainHand().getItemMeta();
			playerHand.setDisplayName("テスト2");
			player.getInventory().getItemInMainHand().setItemMeta(playerHand);
			ItemMeta originalItem = MachtElytra.machtElytra.getItemMeta();
			originalItem.setDisplayName("テスト2");
			if(player.getInventory().getItemInMainHand().getItemMeta().equals(originalItem)) {
				player.sendMessage("メタ変更後ItemStack一致");
			}
			if(newItem.getItemMeta().equals(MachtElytra.machtElytra.getItemMeta())) {
				player.sendMessage("メタ変更後元比較ItemStack一致");
			}
		}
		return true;
	}
}
