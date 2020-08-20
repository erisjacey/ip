package duke.command;

import duke.*;
import duke.exception.*;

public class DoneCommand extends Command {

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