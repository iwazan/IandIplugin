package iandi.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TutorialCommand implements CommandExecutor {

	@SuppressWarnings("unused")
	private final Main plugin;

	public TutorialCommand(Main plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		sender.sendMessage("コマンドを検知");
		if(command.getName().equalsIgnoreCase("tutorial")){
			Player player = (Player)sender;
			player.sendMessage("hi! " + player.getName());
			return true;
		}
		return false;
	}

}
