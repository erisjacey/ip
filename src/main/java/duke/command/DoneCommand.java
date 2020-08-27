package duke.command;

import duke.Storage;
import duke.TaskList;
import duke.Ui;

import duke.exception.DukeInvalidListNumberInputException;
import duke.exception.DukeLoadingErrorException;

/**
 * Represents a command to complete a task.
 */
public class DoneCommand extends Command {

    /**
     * Class constructor.
     *
     * @param input A string representing the user input.
     */
    public DoneCommand(String input) {
        super("done", input);
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage)
            throws DukeInvalidListNumberInputException, DukeLoadingErrorException {
        ui.printDoneTaskChatWindow(tasks.completeTask(input));
        storage.save(tasks.getTasks());
    }

}
