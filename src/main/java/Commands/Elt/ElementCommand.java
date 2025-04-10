package Commands.Elt;

import Commands.Command;
import Domain.Route;

/**
 * Интерфейс для команд, работающих с элементами
 */
public interface ElementCommand extends Command {
    void setElement(Route element);
}
