package Servise;

import CollectionManagement.RouteCollectionManager;
import Commands.CommandConfigurator;
import Commands.CommandExecutor;
import Commands.CommandList;
import Exceptions.CommandException;

import java.util.Scanner;

/**
 * Отвечает за инициализацию и запуск приложения
 * Связывает все компоненты системы
 */


public class Application {
    public static void main(String[] args) {

        RouteCollectionManager manager = RouteCollectionManager.createDefault();
        /**
         * Тутъ лежатъ наши команды
         */
        CommandList commandList = CommandConfigurator.configureCommands(manager);

        /**
         * Объясняем, откуда исполнителю брать команды
         */
        CommandExecutor executor = new CommandExecutor(commandList);

        /**
         * Готовимся принимать команды, введенные с клавиатуры
         */

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите команду: ");
            String input = scanner.nextLine();

            try {
                executor.execute(input);
            } catch (CommandException e){
                System.err.println("Ошибка: " + e.getMessage());
            }
        }

    }
}
