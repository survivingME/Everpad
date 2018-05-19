package app.fadai.supernote.module.notes.folder;

import android.content.Intent;


public interface IFolderView {

    void hideAddBtn();

    void showAddBtn();

    void showSnackbar();

    void showDeleteDialog();

    void showLoading(String message);

    void unShowLoading();

    void scrollToItem(int position);

    void setActivityResultAndFinish(int resultCode,Intent intent);
}
