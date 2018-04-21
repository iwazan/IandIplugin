package iandi.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Commands implements CommandExecutor {

	@SuppressWarnings("unused")
	private final Main plugin;

	public Commands(Main plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		//コマンド判断//発言者判断//(要るなら権限判断)//実行//return true//失敗系はretrun false
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

}
