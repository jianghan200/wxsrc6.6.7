package com.tencent.mm.ui;

import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.preference.h;
import com.tencent.mm.ui.base.preference.i;

public abstract class a
  extends i
  implements o
{
  private Bundle nSa;
  private boolean tfN;
  private boolean tfO;
  private boolean tfP;
  private boolean tfQ;
  protected boolean tfR = false;
  protected boolean tfS = false;
  protected boolean tfT;
  
  protected abstract void coA();
  
  protected abstract void coB();
  
  protected abstract void coC();
  
  protected abstract void coD();
  
  public final void coH()
  {
    coF();
    this.tfP = true;
  }
  
  public final void coJ()
  {
    this.tfS = true;
  }
  
  public final void coK()
  {
    if (!this.tfR) {
      return;
    }
    if (this.tfO)
    {
      coy();
      this.tfO = false;
    }
    for (;;)
    {
      long l = System.currentTimeMillis();
      if (this.tfP)
      {
        coG();
        this.tfP = false;
      }
      if (!this.tDd)
      {
        int i = Ys();
        if (i != -1)
        {
          this.tCL.addPreferencesFromResource(i);
          this.tDd = true;
        }
      }
      coz();
      x.d("MicroMsg.INIT", "KEVIN " + toString() + " OnTabResume last : " + (System.currentTimeMillis() - l));
      this.tfQ = true;
      this.tfR = false;
      return;
      if (this.tfN)
      {
        coD();
        coy();
        x.v("MicroMsg.INIT", "KEVIN tab onRecreate ");
        this.tfN = false;
      }
    }
  }
  
  protected abstract void coy();
  
  protected abstract void coz();
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    this.nSa = paramBundle;
    this.tfO = true;
  }
  
  public void onDestroy()
  {
    coD();
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getAction() == 0)) {
      return false;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onPause()
  {
    super.onPause();
    this.tfT = true;
    if (this.tfT)
    {
      if (!this.tfQ) {
        this.tfT = false;
      }
    }
    else {
      return;
    }
    long l = System.currentTimeMillis();
    coB();
    x.d("MicroMsg.INIT", "KEVIN " + toString() + " onTabPause last : " + (System.currentTimeMillis() - l));
    this.tfQ = false;
    this.tfT = false;
  }
  
  public void onResume()
  {
    super.onResume();
    coI();
    LauncherUI localLauncherUI = LauncherUI.cpQ();
    if ((localLauncherUI == null) || (!localLauncherUI.tkr)) {}
    do
    {
      return;
      this.tfR = true;
    } while (!this.tfS);
    coK();
    this.tfS = false;
  }
  
  public void onStart()
  {
    super.onStart();
    LauncherUI localLauncherUI = LauncherUI.cpQ();
    if ((localLauncherUI == null) || (!localLauncherUI.tkr)) {
      return;
    }
    coA();
  }
  
  public void onStop()
  {
    super.onStop();
    coC();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */