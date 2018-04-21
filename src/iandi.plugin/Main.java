package iandi.plugin;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements CommandExecutor {

	@Override
	public void onDisable() {
	}

	@Override
	public void onEnable() {
		getCommand("tutorial").setExecutor(new TutorialCommand(this));
		getCommand("ii").setExecutor(new Commands(this));
	}

}
