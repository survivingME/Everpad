package app.fadai.supernote.model;

import java.util.List;


public abstract class LoadDataCallBack<T> {
    protected abstract void onSuccedd(List<T> list);

}
