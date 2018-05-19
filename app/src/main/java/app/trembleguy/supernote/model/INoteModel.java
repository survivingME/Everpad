package app.fadai.supernote.model;

import app.fadai.supernote.bean.Note;


public interface INoteModel<T> {
    void initNote(int folderId);

    void loadAllNoteList(LoadDataCallBack<T> callBack);

    void loadPrivacyNoteList(LoadDataCallBack<T> callBack);

    void loadRecycleBinNoteList(LoadDataCallBack<T> callBack);

    void loadNormalNoteList(int folderId,LoadDataCallBack<T> callBack);

    void addNote(T note);

    void deleteNote(Note note);

    void deleteNotes();
}
