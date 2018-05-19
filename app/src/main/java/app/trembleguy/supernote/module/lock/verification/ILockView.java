package app.fadai.supernote.module.lock.verification;


public interface ILockView {

    /**
     *  错误
     *  @describe
     */
    void onError();

    /**
     *  正确
     *  @describe
     */
    void onSuccess();
}
