package app.fadai.supernote.module.notes.folderList;



public interface IFolderListView<N> {


    public void choiceItemAll();

    public void choiceItemPrimary();

    public void choiceItemRecycleBin();

    public void unChoiceItemAll();

    public void unChoiceItemPrimary();

    public void unChoiceItemRecycleBin();

    void setAllNoteCount(int count);

}
