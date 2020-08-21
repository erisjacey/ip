package duke.command;

import duke.*;
import duke.exception.*;
import duke.task.Task;

public class AddTaskCommand extends Command {

    public AddTaskCommand(String tag, String input) {
        super(tag, input);
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage)
            throws DukeInvalidTaskTimeException,
            DukeInvalidTaskDescriptionException,
            DukeLoadingErrorException {
        Task toAdd = tasks.addTask(tag, input);
        ui.printAddTaskChatWindow(toAdd, tasks.getTasks().size());
        storage.save(tasks.getTasks());
    }

}
