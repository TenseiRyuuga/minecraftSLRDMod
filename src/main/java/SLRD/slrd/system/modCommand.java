package SLRD.slrd.system;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;

public abstract class modCommand extends CommandBase {

	final String commandName;
	
	modCommand () {
		this("nameless_modCommand");
	}
	
	modCommand (final String commandName) {
		super();
		this.commandName = commandName;
	}
	
	@Override
	public String getName() {
		return commandName;
	}

	@Override
	public abstract String getUsage(ICommandSender sender);

	@Override
	public abstract void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException;

}
