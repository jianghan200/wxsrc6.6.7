package com.tencent.mm.plugin.product.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.s;
import java.util.List;

@a(3)
public class MallGalleryUI
  extends MallBaseUI
{
  private final String TAG = "MicroMsg.MallGalleryUI";
  private ViewPager lSo;
  private g lSp;
  private List<String> lSq;
  private int lSr = 0;
  private boolean lSs;
  
  final String bnc()
  {
    if ((this.lSq == null) || (this.lSq.size() < this.lSr + 1)) {
      x.e("MicroMsg.MallGalleryUI", "data not ready.retransmit failed");
    }
    for (String str = null; bi.oW(str); str = (String)this.lSq.get(this.lSr))
    {
      x.w("MicroMsg.MallGalleryUI", "invoke error. No current url");
      return null;
    }
    return c.JC(str);
  }
  
  protected final int getLayoutId()
  {
    return a.g.product_gallery_ui;
  }
  
  protected final void initView()
  {
    this.lSo = ((ViewPager)findViewById(a.f.mall_gallery));
    this.lSo.setOnPageChangeListener(new MallGalleryUI.1(this));
    this.lSp = new g(this);
    this.lSp.lSO = new MallGalleryUI.2(this);
    this.lSo.setAdapter(this.lSp);
    setBackBtn(new MallGalleryUI.3(this));
    addIconOptionMenu(0, a.e.mm_title_btn_menu, new MallGalleryUI.4(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.lSq = getIntent().getStringArrayListExtra("keys_img_urls");
    this.mController.hideTitleView();
    this.lSs = false;
    initView();
  }
  
  protected void onResume()
  {
    super.onResume();
    this.lSp.aK(this.lSq);
    this.lSp.notifyDataSetChanged();
    if (this.lSq != null) {
      this.lSq.size();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/product/ui/MallGalleryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */