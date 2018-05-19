package app.fadai.supernote.module.notes.share;

import android.app.Activity;
import android.net.Uri;



public interface IShareView {

    Activity getActivity();

    /**
     *   显示分享Dialog
     */
    void showShareDialog(Uri uri);
    
    /**
     *   前往应用设置Dialog
     */
    void showToAppSettingDialog();

    void showLoadingDialog(String message);

    void unShowLoadingDialog();
}
