package com.tencent.mm.plugin.traceroute.ui;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.traceroute.b.a;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMProgressBar;
import com.tencent.mm.ui.base.MMProgressBar.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.s;

public class NetworkDiagnoseUI
  extends MMActivity
{
  private ag handler = new NetworkDiagnoseUI.2(this);
  private TextView jej;
  private int lod = 0;
  private final int oDZ = 100;
  private int oEa = 0;
  private a oEb;
  private MMProgressBar oEc;
  private al oEd = new al(new NetworkDiagnoseUI.1(this), true);
  
  private void bIQ()
  {
    h.a(this, R.l.confirm_cancel_diagnose, R.l.diagnose_cancel_confirm_title, R.l.app_yes, R.l.app_no, new NetworkDiagnoseUI.7(this), new NetworkDiagnoseUI.8(this));
  }
  
  protected final int getLayoutId()
  {
    return R.i.network_diagnose_run;
  }
  
  protected final void initView()
  {
    this.jej = ((TextView)findViewById(R.h.report_status_tv));
    this.oEc = ((MMProgressBar)findViewById(R.h.diagnose_progress));
    this.oEc.setOnProgressChangedListener(new MMProgressBar.a()
    {
      public final void yl(int paramAnonymousInt)
      {
        if (paramAnonymousInt < 5)
        {
          NetworkDiagnoseUI.f(NetworkDiagnoseUI.this).setText(NetworkDiagnoseUI.this.getString(R.l.connecting_server));
          return;
        }
        if ((paramAnonymousInt >= 5) && (paramAnonymousInt < 95))
        {
          NetworkDiagnoseUI.f(NetworkDiagnoseUI.this).setText(NetworkDiagnoseUI.this.getString(R.l.getting_route_path));
          return;
        }
        NetworkDiagnoseUI.f(NetworkDiagnoseUI.this).setText(NetworkDiagnoseUI.this.getString(R.l.uploading_report));
      }
    });
    setMMTitle("");
    setBackBtn(new NetworkDiagnoseUI.4(this));
    new ag().postDelayed(new NetworkDiagnoseUI.5(this), 200L);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      bIQ();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    this.oEc.setAutoProgress(false);
    super.onPause();
  }
  
  protected void onResume()
  {
    au.HU();
    if (!c.isSDCardAvailable())
    {
      s.gH(this);
      return;
    }
    this.oEc.setAutoProgress(true);
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */