package app.fadai.supernote.adapter;

import com.app.fadai.supernote.R;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import app.fadai.supernote.bean.NoteFolder;


public class NoteBottomSheetFolderAdapter extends BaseQuickAdapter<NoteFolder, BaseViewHolder> {

    public NoteBottomSheetFolderAdapter() {
        super(R.layout.item_note_bottom_folder);
    }

    @Override
    protected void convert(BaseViewHolder helper, NoteFolder item) {
        helper.setText(R.id.tv_folder_title_bottom_sheet,item.getFolderName());
    }


}
