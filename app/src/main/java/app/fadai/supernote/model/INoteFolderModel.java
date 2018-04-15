package app.fadai.supernote.model;

import app.fadai.supernote.bean.Note;
import app.fadai.supernote.bean.NoteFolder;


public interface INoteFolderModel<T> {

    int initNoteFolderAndGetFolderId();

    void loadNoteFoldersList(LoadDataCallBack<T> callBack);

    void addNoteFolder(T noteFolder);

    void deleteNoteFolder(NoteFolder folder);

    void deleteNoteFolders();

    void addNote2Folder(Note note, NoteFolder folder);

    void addNote2Privacy(Note note,NoteFolder folder);

}
