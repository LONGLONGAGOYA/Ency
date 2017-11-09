package com.xxx.ency.view.weixin.adapter;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xxx.ency.R;
import com.xxx.ency.model.bean.WeiXinBean;

/**
 * Created by xiarh on 2017/11/8.
 */

public class WeiXinAdapter extends BaseQuickAdapter<WeiXinBean.NewslistBean, BaseViewHolder> {

    public WeiXinAdapter() {
        super(R.layout.item_weixin);
    }

    @Override
    protected void convert(BaseViewHolder helper, WeiXinBean.NewslistBean item) {
        helper.setText(R.id.txt_weixin_title, item.getTitle());
        helper.setText(R.id.txt_weixin_author, item.getDescription());
        helper.setText(R.id.txt_weixin_date, item.getCtime());
        Glide.with(mContext)
                .load(item.getPicUrl())
                .into((ImageView) helper.getView(R.id.img_weixin));
    }
}
