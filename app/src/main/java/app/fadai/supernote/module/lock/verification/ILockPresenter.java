package app.fadai.supernote.module.lock.verification;

import java.util.List;


public interface ILockPresenter {
    boolean verifyPassword(List<Integer> passPositions,String password);
}
