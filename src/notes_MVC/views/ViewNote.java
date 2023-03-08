package notes_MVC.views;

import notes_MVC.controllers.NoteController;
import notes_MVC.model.Note;

import java.util.List;
import java.util.Scanner;

public class ViewNote {

    private final NoteController noteController;

    public ViewNote(NoteController noteController) {
        this.noteController = noteController;
    }

    public void run() {
        Commands com;

        while (true) {
            String command = prompt("Введите команду: ");
            try {
                com = Commands.valueOf(command.toUpperCase());

                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE -> createNote();
                    case READ -> readNote();
                    case LIST -> listNotes();
                    case UPDATE -> updateNote();
                    case DELETE -> deleteNote();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void deleteNote() {
        String readId = getID("Введите ID записки для удаления: ");
        noteController.deleteNote(readId);
    }

    private void updateNote() throws Exception {
        String readId = getID("Введите редактируемый ID записки: ");
        noteController.updateNote(readId,inputNote());
    }

    private String getID(String message) {
        return prompt(message);
    }

    private void listNotes() {
        List<Note> listNotes = noteController.readAllNotes();
        for (Note note : listNotes) {
            System.out.println(note + "\n");
        }
    }

    private void readNote() throws Exception {
        String id = getID("Идентификатор записки: ");

        Note note = noteController.readNote(id);
        System.out.println(note);

    }

    private Note inputNote() {
        String heading = prompt("Заголовок: ");
        String text = prompt("Текст записки: ");
        return new Note(heading, text);
    }

    private void createNote() throws Exception {
        noteController.saveNote(inputNote());
    }


    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}