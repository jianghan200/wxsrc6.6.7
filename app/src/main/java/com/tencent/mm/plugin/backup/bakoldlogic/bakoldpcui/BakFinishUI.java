package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e.e;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMWizardActivity;

public class BakFinishUI
  extends MMWizardActivity
  implements e.e
{
  private int haC;
  private TextView haE;
  private ag handler = new ag(Looper.getMainLooper());
  
  public final void atd()
  {
    this.handler.post(new BakFinishUI.2(this));
  }
  
  protected final int getLayoutId()
  {
    return R.i.bak_topc_finish;
  }
  
  protected final void initView()
  {
    setMMTitle(R.l.bak_chat_to_pc_title);
    this.haE = ((TextView)findViewById(R.h.bak_topc_finish_tip));
    if (6 == this.haC) {
      this.haE.setText(getString(R.l.bak_chat_to_pc_restore_finish));
    }
    for (;;)
    {
      setBackBtn(new BakFinishUI.1(this));
      return;
      if (1 == this.haC) {
        this.haE.setText(getString(R.l.bak_chat_to_pc_back_finish));
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false)) {
      return;
    }
    this.haC = getIntent().getIntExtra("cmd", -1);
    x.i("MicroMsg.BakFinishUI", "BakFinishUI onCreate nowCmd:%d", new Object[] { Integer.valueOf(this.haC) });
    initView();
    a.asN().asO().gZM = this;
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    a.asN().asO().gZM = null;
    x.i("MicroMsg.BakFinishUI", "BakFinishUI onDestroy nowCmd:%d", new Object[] { Integer.valueOf(this.haC) });
  }
  
  public final void onError(int paramInt)
  {
    this.handler.post(new BakFinishUI.3(this));
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      a.asN().asO().gZU = -1;
      DT(1);
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakFinishUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */