package Commands.Ordin;

import CollectionManagement.RouteCollectionManager;
import Commands.BaseCom.BaseCommand;
import Commands.Command;

public class ExitCommand implements Command {
    private final RouteCollectionManager manager;
    public ExitCommand(RouteCollectionManager manager){
        this.manager = manager;
    }


    @Override
    public void execute(String args) {
        System.out.println(" ______\n" +
                "< bye >\n" +
                " ------\n" +
                "        \\   ^__^\n" +
                "         \\  (oo)\\_______\n" +
                "            (__)\\       )\\/\\\n" +
                "                ||----w |\n" +
                "                ||     ||\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
        System.exit(0);
    }

    @Override
    public String getDescription() {
        return "завершает программу";
    }
    @Override
    public String getName(){
        return "exit";
    }
}
