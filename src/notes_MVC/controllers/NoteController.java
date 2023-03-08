package notes_MVC.controllers;

import notes_MVC.model.Repository;
import notes_MVC.model.Note;

import java.util.ArrayList;
import java.util.List;

public class NoteController {
    private final Repository repository;

    public NoteController(Repository repository) {
        this.repository = repository;
    }

    public void saveNote(Note note) throws Exception {
        repository.CreateNote(note);
    }

    public Note readNote(String noteId) throws Exception {
        List<Note> notes = repository.getAllNotes();
        return noteSearch(noteId, notes);
    }

    private static Note noteSearch(String noteId, List<Note> notes) throws Exception {
        for (Note note : notes) {
            if (note.getId().equals(noteId)) {
                return note;
            }
        }
        throw new Exception("Note not found");
    }

    public List<Note> readAllNotes() {
        return repository.getAllNotes();
    }

    public void updateNote(String noteId, Note newNote) throws Exception {
        List<Note> notes = repository.getAllNotes();
        Note note = noteSearch(noteId, notes);
        note.setHeading(newNote.getHeading());
        note.setText(newNote.getText());
        repository.saveNotes(notes);
    }

    public void deleteNote(String readId) {
        List<Note> notes = repository.getAllNotes();
        List<Note> newNotes = new ArrayList<>();
        for (Note note : notes) {
            String tempId = note.getId();
            if (!tempId.equals(readId))
                newNotes.add(note);
        }
        repository.saveNotes(newNotes);
    }
}
