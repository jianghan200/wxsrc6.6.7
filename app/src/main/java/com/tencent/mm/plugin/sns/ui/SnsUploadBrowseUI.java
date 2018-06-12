package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.mm.plugin.sns.g.b;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class SnsUploadBrowseUI
  extends SnsBaseGalleryUI
  implements t.a
{
  private int nTw = 0;
  private ArrayList<String> ogn = new ArrayList();
  private HashMap<Integer, Boolean> ogo = new HashMap();
  
  public final void bEq()
  {
    Intent localIntent = new Intent();
    Object localObject = this.nTu.getFlipList();
    if (localObject == null) {
      return;
    }
    this.ogn.clear();
    Iterator localIterator = ((List)localObject).iterator();
    if (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      localObject = af.getAccSnsTmpPath() + localb.caK.ksA;
      if (!localb.caK.ksA.startsWith("pre_temp_extend_pic")) {
        break label168;
      }
      localObject = localb.caK.ksA.substring(19);
    }
    label168:
    for (;;)
    {
      this.ogn.add(localObject);
      break;
      localIntent.putExtra("sns_gallery_temp_paths", this.ogn);
      localIntent.putExtra("sns_update_preview_image_count", this.ogo.size());
      this.ogo.clear();
      setResult(-1, localIntent);
      finish();
      return;
    }
  }
  
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
      x.d("MicroMsg.SnsUploadBrowseUI", "dispatchKeyEvent");
      bEq();
      return true;
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  protected final int getForceOrientation()
  {
    return 4;
  }
  
  protected final int getLayoutId()
  {
    return i.g.sns_browse_img;
  }
  
  protected final void initView()
  {
    String str = bi.aG(getIntent().getStringExtra("sns_gallery_userName"), "");
    this.ogn = getIntent().getStringArrayListExtra("sns_gallery_temp_paths");
    if (this.ogn == null) {
      return;
    }
    this.nTw = getIntent().getIntExtra("sns_gallery_position", 0);
    this.nTu = new SnsInfoFlip(this);
    this.nTu.setEnableHorLongBmpMode(false);
    this.nTu.setShowTitle(true);
    af.getAccSnsTmpPath();
    List localList = aj.ch(this.ogn);
    this.nTu.a(localList, str, this.nTw, this.nTp, this);
    this.nTu.setOnPageSelectListener(new SnsUploadBrowseUI.1(this));
    addView(this.nTu);
    setBackBtn(new SnsUploadBrowseUI.2(this));
    addIconOptionMenu(0, i.j.app_delete, i.e.mm_title_btn_delete_normal, new SnsUploadBrowseUI.3(this));
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    x.i("MicroMsg.SnsUploadBrowseUI", "onAcvityResult requestCode:" + paramInt1);
    if (paramInt2 != -1) {}
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsUploadBrowseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */