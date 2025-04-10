package Commands;

import CollectionManagement.RouteCollectionManager;
import Commands.Ordin.ExitCommand;

/**
 * Для добавления команд в commandList
 */
public class CommandConfigurator {
    public static CommandList configureCommands(RouteCollectionManager manager){
        CommandList commandList = new CommandList();

        commandList.register(new ExitCommand(manager));
        return commandList;
    }
}
