package app.fadai.supernote.module.notes.Image;


public interface IImageView {

    void showLoading(String message);

    void unShowLoading();

    void showToAppSettingDialog();

    void setResultAndFinish();

}
