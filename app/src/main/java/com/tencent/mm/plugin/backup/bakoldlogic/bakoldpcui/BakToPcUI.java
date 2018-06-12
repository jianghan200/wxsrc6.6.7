package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.c;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e.a;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMWizardActivity;

public class BakToPcUI
  extends MMWizardActivity
  implements e.a
{
  private Button eGn;
  private Button haQ;
  private TextView haR;
  private TextView haS;
  private ag handler = new ag(Looper.getMainLooper());
  private int nc = -1;
  
  private void atj()
  {
    if (this.nc == 0)
    {
      this.eGn.setEnabled(true);
      this.haQ.setEnabled(true);
      return;
    }
    this.eGn.setEnabled(false);
    this.haQ.setEnabled(false);
  }
  
  public final void ata()
  {
    this.nc = 0;
    this.eGn.setVisibility(0);
    this.haQ.setVisibility(0);
    new ag(Looper.getMainLooper()).post(new BakToPcUI.4(this));
  }
  
  protected final int getLayoutId()
  {
    return R.i.bak_topc_chat;
  }
  
  public final void initView()
  {
    setMMTitle(R.l.bak_chat_to_pc_title);
    setBackBtn(new BakToPcUI.1(this));
    this.eGn = ((Button)findViewById(R.h.bak_topc_ok_button));
    this.eGn.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        if (BakToPcUI.b(BakToPcUI.this) == 0)
        {
          a.asN().asP().dBM = 1;
          a.asN().asO().mO(0);
          paramAnonymousView = new Intent(BakToPcUI.this, BakWaitingUI.class);
          MMWizardActivity.D(BakToPcUI.this, paramAnonymousView);
        }
      }
    });
    this.haQ = ((Button)findViewById(R.h.bak_topc_cancel_button));
    this.haQ.setOnClickListener(new BakToPcUI.3(this));
    this.haR = ((TextView)findViewById(R.h.bak_topc_tip_pcname));
    this.haR.setText(a.asN().asO().gZS);
    this.haS = ((TextView)findViewById(R.h.bak_topc_tip_username));
    this.haS.setText(a.asN().asO().gZT);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false)) {
      return;
    }
    initView();
    this.nc = a.asN().asO().gZR;
    x.i("MicroMsg.BakToPcUI", "BakToPcUI auth onCreate nowCmd:%d", new Object[] { Integer.valueOf(this.nc) });
    a.asN().asO().gZL = this;
    atj();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    x.i("MicroMsg.BakToPcUI", "BakToPcUI auth onDestroy nowCmd:%d", new Object[] { Integer.valueOf(this.nc) });
    a.asN().asO().gZL = null;
  }
  
  public final void onError(int paramInt)
  {
    this.handler.post(new BakToPcUI.5(this, paramInt));
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      a.asN().asP().dBM = 3;
      a.asN().asP().IF();
      a.asN().asO().mO(1);
      DT(1);
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakToPcUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */