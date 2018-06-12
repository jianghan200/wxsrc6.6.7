package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.mm.ar.n;
import com.tencent.mm.ar.r;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.sdk.platformtools.x;
import java.util.List;

public class ArtistBrowseUI
  extends SnsBaseGalleryUI
  implements t.a
{
  private String kCA = "";
  private String kfy = "";
  
  public final void ci(String paramString, int paramInt)
  {
    if (this.nTu != null) {
      this.nTu.aKx();
    }
  }
  
  public final void cj(String paramString, int paramInt) {}
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      x.d("MicroMsg.ArtistBrowseUI", "dispatchKeyEvent");
      paramKeyEvent = new Intent();
      paramKeyEvent.putExtra("sns_cmd_list", this.nTr.nND);
      setResult(-1, paramKeyEvent);
      finish();
      return true;
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  protected final int getLayoutId()
  {
    return i.g.sns_gallery_img;
  }
  
  protected final void initView()
  {
    this.kCA = getIntent().getStringExtra("sns_gallery_artist_lan");
    int i = getIntent().getIntExtra("sns_gallery_position", 0);
    r.Qp();
    this.kfy = n.Qm();
    t(false, 2);
    this.nTu = new SnsInfoFlip(this);
    List localList = aj.ey(this.kCA, this.kfy);
    this.nTu.setShowTitle(true);
    this.nTu.a(localList, "", i, this.nTp, this);
    addView(this.nTu);
    setBackBtn(new ArtistBrowseUI.1(this));
    setMMTitle(i.j.sns_ui_setback);
    showOptionMenu(false);
    this.nTp.setCallBack(new ArtistBrowseUI.2(this));
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    x.i("MicroMsg.ArtistBrowseUI", "onAcvityResult requestCode:" + paramInt1);
    if (paramInt2 != -1) {
      return;
    }
    paramInt1 = paramIntent.getIntExtra("sns_gallery_op_id", 0);
    this.nTr.xg(paramInt1);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
  
  public void onDestroy()
  {
    if (this.nTu != null)
    {
      this.nTu.bDr();
      this.nTu.onDestroy();
    }
    af.byl().H(this);
    super.onDestroy();
  }
  
  protected void onPause()
  {
    if (this.nTu != null) {
      this.nTu.onPause();
    }
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    if (this.nTu != null) {
      this.nTu.aKx();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/ArtistBrowseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */