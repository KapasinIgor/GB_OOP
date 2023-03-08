package notes_MVC;

import notes_MVC.controllers.NoteController;
import notes_MVC.model.FileOperation;
import notes_MVC.model.FileOperationImpl;
import notes_MVC.model.Repository;
import notes_MVC.model.RepositoryFile;
import notes_MVC.views.ViewNote;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("notes.txt");
        Repository repository = new RepositoryFile(fileOperation);
        NoteController controller = new NoteController(repository);
        ViewNote view = new ViewNote(controller);
        view.run();
    }
}
