package app.fadai.supernote.module.lock.verification;

import app.fadai.supernote.module.base.BasePresenter;
import app.fadai.supernote.utils.MD5Util;

import java.util.List;


public class LockPresenter extends BasePresenter<ILockView> implements ILockPresenter{

    @Override
    public boolean verifyPassword(List<Integer> passPositions, String password) {
        StringBuilder sb=new StringBuilder();
        for (Integer i:passPositions){
            sb.append(i.intValue());
        }
        String currentPassword= MD5Util.getMd5Value(sb.toString());
        if(currentPassword.equals(password)){
            mView.onSuccess();
            return true;
        } else{
            mView.onError();
            return false;
        }
    }
}
