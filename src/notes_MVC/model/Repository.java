package notes_MVC.model;

import java.util.List;

public interface Repository {
    List<Note> getAllNotes();

    void CreateNote(Note note);

    void saveNotes(List<Note> notes);
}
