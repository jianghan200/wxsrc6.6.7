package com.tencent.mm.ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.mm.api.b;
import com.tencent.mm.api.e;
import com.tencent.mm.api.m;
import com.tencent.mm.api.m.a.a;
import com.tencent.mm.api.m.b;
import com.tencent.mm.api.m.c;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.remoteservice.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.tools.k;

@a(19)
public class MMNewPhotoEditUI
  extends MMActivity
  implements e
{
  private p fUo = null;
  private int hop;
  private m lqK;
  private String tnP;
  private String tnQ;
  private String tnR;
  private boolean tnS;
  private boolean tnT;
  private final d tnU = new d(this);
  private PhotoEditProxy tnV;
  private Dialog tnW;
  
  private void DS(int paramInt)
  {
    dO(true);
    this.lqK.a(new MMNewPhotoEditUI.5(this, paramInt));
  }
  
  private void dO(boolean paramBoolean)
  {
    x.i("MicroMsg.MMNewPhotoEditUI", "[setProgress] isVisible:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean) {
      this.fUo = p.b(this, getString(af.d.processing), true, 0, null);
    }
    while ((this.fUo == null) || (!this.fUo.isShowing())) {
      return;
    }
    this.fUo.dismiss();
    this.fUo = null;
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return af.c.new_photo_edit_ui;
  }
  
  protected final void initView()
  {
    FrameLayout localFrameLayout = (FrameLayout)findViewById(af.b.content);
    this.lqK = m.bwV.tY();
    Object localObject = this.lqK;
    m.a.a locala = new m.a.a();
    if ((this.hop != 291) && (this.hop != 293)) {}
    for (boolean bool = true;; bool = false)
    {
      locala.bwX = bool;
      locala.bwZ = true;
      locala.bwW = m.c.bxc;
      locala.path = this.tnP;
      ((m)localObject).a(locala.uk());
      localObject = this.lqK.aQ(this.mController.tml);
      ((b)localObject).setActionBarCallback(this);
      localFrameLayout.addView((View)localObject, new FrameLayout.LayoutParams(-1, -1));
      ((b)localObject).setSelectedFeatureListener(new MMNewPhotoEditUI.2(this));
      return;
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt2 == -1) && (paramInt1 == 1) && (paramIntent != null))
    {
      str = paramIntent.getStringExtra("Select_Conv_User");
      x.d("MicroMsg.MMNewPhotoEditUI", "select %s for sending imagePath:%s", new Object[] { str, this.tnR });
      this.tnW = com.tencent.mm.ui.base.h.a(this.mController.tml, getString(af.d.photo_edit_forward_tips), false, null);
      paramIntent = paramIntent.getStringExtra("custom_send_text");
      this.tnV.sendImage(paramIntent, this.tnR, this.tnV.getSelfUsername(), str);
      this.tnW.dismiss();
      if (!this.tnS)
      {
        FileOp.deleteFile(this.tnR);
        finish();
      }
    }
    while ((paramIntent != null) || (bi.oW(this.tnR)) || (this.hop != 291)) {
      for (;;)
      {
        String str;
        return;
        r.a(this.tnR, this);
      }
    }
    FileOp.deleteFile(this.tnR);
  }
  
  public void onBackPressed()
  {
    if (!this.lqK.tW())
    {
      if ((this.hop != 290) && (this.hop != 291)) {
        break label62;
      }
      com.tencent.mm.plugin.report.service.h.mEJ.h(13859, new Object[] { Integer.valueOf(1), Integer.valueOf(2) });
    }
    for (;;)
    {
      finish();
      return;
      label62:
      if ((this.hop == 4) || (this.hop == 293)) {
        com.tencent.mm.plugin.report.service.h.mEJ.h(13859, new Object[] { Integer.valueOf(2), Integer.valueOf(2) });
      } else {
        com.tencent.mm.plugin.report.service.h.mEJ.h(13859, new Object[] { Integer.valueOf(0), Integer.valueOf(2) });
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mController.cqo();
    this.tnV = new PhotoEditProxy(this.tnU);
    this.tnU.K(new MMNewPhotoEditUI.1(this));
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.lqK.onDestroy();
    this.tnU.release();
  }
  
  public final void onFinish()
  {
    if ((this.hop == 290) || (this.hop == 291)) {
      com.tencent.mm.plugin.report.service.h.mEJ.h(13859, new Object[] { Integer.valueOf(1), Integer.valueOf(1) });
    }
    while ((this.hop == 291) || (this.hop == 293))
    {
      k localk = new k(this.mController.tml);
      localk.ofp = new MMNewPhotoEditUI.3(this);
      localk.ofq = new MMNewPhotoEditUI.4(this);
      com.tencent.mm.ui.base.h.a(this.mController.tml, localk.bEo());
      return;
      if ((this.hop == 4) || (this.hop == 293)) {
        com.tencent.mm.plugin.report.service.h.mEJ.h(13859, new Object[] { Integer.valueOf(2), Integer.valueOf(1) });
      } else {
        com.tencent.mm.plugin.report.service.h.mEJ.h(13859, new Object[] { Integer.valueOf(0), Integer.valueOf(1) });
      }
    }
    DS(-1);
  }
  
  public final void ua()
  {
    onBackPressed();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/MMNewPhotoEditUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */