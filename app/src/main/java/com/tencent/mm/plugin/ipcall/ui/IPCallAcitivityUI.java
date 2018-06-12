package com.tencent.mm.plugin.ipcall.ui;

import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.model.au;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;

@com.tencent.mm.ui.base.a(3)
public class IPCallAcitivityUI
  extends MMActivity
{
  private FrameLayout ktq;
  private TextView ktr;
  private TextView kts;
  private Button ktt;
  private CdnImageView ktu;
  private boolean ktv = false;
  private com.tencent.mm.plugin.ipcall.a.g.a ktw;
  
  public void finish()
  {
    super.finish();
    overridePendingTransition(R.a.anim_not_change, R.a.pop_out);
    if (this.ktv)
    {
      com.tencent.mm.plugin.ipcall.a.e.c.rz(1);
      return;
    }
    com.tencent.mm.plugin.ipcall.a.e.c.rz(0);
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return R.i.ipcall_activity_ui;
  }
  
  protected final void initView()
  {
    this.ktq = ((FrameLayout)findViewById(R.h.ipcall_activity_close_btn));
    this.ktr = ((TextView)findViewById(R.h.ipcall_activity_title_tv));
    this.kts = ((TextView)findViewById(R.h.ipcall_activity_desc_tv));
    this.ktt = ((Button)findViewById(R.h.ipcall_activity_enter_btn));
    this.ktu = ((CdnImageView)findViewById(R.h.ipcall_activity_iv));
    au.HU();
    String str = (String)com.tencent.mm.model.c.DT().get(aa.a.sRw, "");
    if (bi.oW(str))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.IPCallAcitivityUI", "xml is empty");
      finish();
    }
    for (;;)
    {
      this.ktq.setOnClickListener(new IPCallAcitivityUI.1(this));
      this.ktt.setOnClickListener(new IPCallAcitivityUI.2(this));
      setBackBtn(new IPCallAcitivityUI.3(this));
      return;
      this.ktw = com.tencent.mm.plugin.ipcall.a.g.a.EN(str);
      if (this.ktw == null)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.IPCallAcitivityUI", "mMsgInfo is null");
        finish();
      }
      else
      {
        this.ktr.setText(this.ktw.bHD);
        this.kts.setText(this.ktw.jOS);
        this.ktt.setText(this.ktw.ksw);
        this.ktu.setUrl(this.ktw.ksv);
      }
    }
  }
  
  public void onBackPressed()
  {
    super.onBackPressed();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().addFlags(131072);
    getWindow().setFlags(1024, 1024);
    this.mController.hideTitleView();
    initView();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/ui/IPCallAcitivityUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */