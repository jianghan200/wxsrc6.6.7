package com.tencent.mm.plugin.traceroute.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.s;

public class NetworkDiagnoseIntroUI
  extends MMActivity
{
  private Button oDO;
  private TextView oDP;
  
  protected final int getLayoutId()
  {
    return R.i.network_diagnose_ready;
  }
  
  protected final void initView()
  {
    this.oDO = ((Button)findViewById(R.h.start_diagnose));
    this.oDO.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        au.HU();
        if (!c.isSDCardAvailable())
        {
          s.gH(NetworkDiagnoseIntroUI.this);
          return;
        }
        if (au.DF().Lg() == 0)
        {
          Toast.makeText(NetworkDiagnoseIntroUI.this, NetworkDiagnoseIntroUI.this.getString(R.l.fmt_iap_err), 0).show();
          return;
        }
        paramAnonymousView = new Intent(NetworkDiagnoseIntroUI.this, NetworkDiagnoseUI.class);
        NetworkDiagnoseIntroUI.this.startActivity(paramAnonymousView);
        NetworkDiagnoseIntroUI.this.finish();
      }
    });
    this.oDP = ((TextView)findViewById(R.h.net_diagnose_privacy_intro));
    this.oDP.setOnClickListener(new NetworkDiagnoseIntroUI.2(this));
    setMMTitle("");
    setBackBtn(new NetworkDiagnoseIntroUI.3(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseIntroUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */