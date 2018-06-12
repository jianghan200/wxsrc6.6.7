package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e.c;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMWizardActivity;

public class BakWaitingUI
  extends MMWizardActivity
  implements e.c
{
  private boolean haU;
  private ag handler = new ag(Looper.getMainLooper());
  private int nc;
  
  final void atk()
  {
    if ((6 == this.nc) || (1 == this.nc))
    {
      Intent localIntent = new Intent(this, BakOperatingUI.class);
      localIntent.putExtra("cmd", this.nc);
      MMWizardActivity.D(this, localIntent);
    }
  }
  
  protected final int getLayoutId()
  {
    return R.i.bak_topc_wait;
  }
  
  protected final void initView()
  {
    setMMTitle(R.l.bak_chat_to_pc_title);
    if (this.haU) {
      findViewById(R.h.bak_topc_tip).setVisibility(8);
    }
    for (;;)
    {
      setBackBtn(new BakWaitingUI.1(this));
      return;
      findViewById(R.h.bak_topc_tip).setVisibility(0);
    }
  }
  
  public final void mR(int paramInt)
  {
    this.nc = paramInt;
    this.handler.post(new BakWaitingUI.2(this));
  }
  
  public final void mS(final int paramInt)
  {
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        x.d("MicroMsg.BakWaitingUI", "BakWaitingUI onCloseSocket errType: %d", new Object[] { Integer.valueOf(paramInt) });
        if (paramInt == -1)
        {
          x.d("MicroMsg.BakWaitingUI", "BakToPcUI jump tips");
          Intent localIntent = new Intent();
          localIntent.putExtra("title", BakWaitingUI.this.getString(R.l.backup_pc_not_support_title));
          localIntent.putExtra("rawUrl", BakWaitingUI.this.getString(R.l.backup_not_support_doc, new Object[] { w.chP() }));
          localIntent.putExtra("showShare", false);
          localIntent.putExtra("neverGetA8Key", true);
          d.b(BakWaitingUI.this, "webview", ".ui.tools.WebViewUI", localIntent);
        }
      }
    });
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false)) {
      return;
    }
    a.asN().asO().gZK = this;
    this.nc = a.asN().asO().gZR;
    this.haU = getIntent().getBooleanExtra("from_back_finish", false);
    x.i("MicroMsg.BakWaitingUI", "BakWaitingUI onCreate nowCmd:%d isFromFinish:%b", new Object[] { Integer.valueOf(this.nc), Boolean.valueOf(this.haU) });
    initView();
    atk();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    a.asN().asO().gZK = null;
    x.i("MicroMsg.BakWaitingUI", "BakWaitingUI onDestroy nowCmd:%d isFromFinish:%b", new Object[] { Integer.valueOf(this.nc), Boolean.valueOf(this.haU) });
  }
  
  public final void onError(final int paramInt)
  {
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        x.d("MicroMsg.BakWaitingUI", "BakWaitingUI onCloseSocket errType: %d", new Object[] { Integer.valueOf(paramInt) });
        if (paramInt == -1)
        {
          x.d("MicroMsg.BakWaitingUI", "BakToPcUI jump tips");
          localIntent = new Intent();
          localIntent.putExtra("title", BakWaitingUI.this.getString(R.l.backup_pc_not_support_title));
          localIntent.putExtra("rawUrl", BakWaitingUI.this.getString(R.l.backup_not_support_doc, new Object[] { w.chP() }));
          localIntent.putExtra("showShare", false);
          localIntent.putExtra("neverGetA8Key", true);
          d.b(BakWaitingUI.this, "webview", ".ui.tools.WebViewUI", localIntent);
          return;
        }
        Intent localIntent = new Intent(BakWaitingUI.this, BakConnErrorUI.class);
        MMWizardActivity.D(BakWaitingUI.this, localIntent);
      }
    });
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      DT(1);
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakWaitingUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */