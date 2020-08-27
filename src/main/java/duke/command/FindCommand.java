package duke.command;

import duke.Storage;
import duke.TaskList;
import duke.Ui;

import duke.exception.DukeInvalidKeywordException;

/**
 * Represents a command to find tasks that match a given keyword.
 */
public class FindCommand extends Command {

    /**
     * Class constructor.
     *
     * @param input A string representing the user input.
     */
    public FindCommand(String input) {
        super("find", input);
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeInvalidKeywordException {
        ui.printFindTaskChatWindow(tasks.findTasks(input));
    }

}
