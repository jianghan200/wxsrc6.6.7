package com.tencent.mm.plugin.soter_mp.a;

import android.app.Activity;
import android.os.Message;
import com.tencent.mm.plugin.soter_mp.b.d;
import com.tencent.mm.plugin.soter_mp.b.e;
import com.tencent.mm.plugin.soter_mp.ui.SoterAuthenticationUI;
import com.tencent.mm.plugin.soter_mp.ui.SoterAuthenticationUI.a;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;

public abstract class c
{
  protected d ooq = null;
  protected e oor = null;
  protected WeakReference<Activity> oos = null;
  
  public c(WeakReference<Activity> paramWeakReference, d paramd, e parame)
  {
    this.ooq = paramd;
    this.oor = parame;
    this.oos = paramWeakReference;
  }
  
  protected static void a(com.tencent.mm.ui.widget.a.c paramc)
  {
    if (paramc == null)
    {
      x.e("MicroMsg.SoterMpBaseController", "hy: dialog is null.");
      return;
    }
    if (SoterAuthenticationUI.oox != null)
    {
      bFp();
      SoterAuthenticationUI.oox.obtainMessage(6, paramc).sendToTarget();
      return;
    }
    x.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
  }
  
  protected static void bFp()
  {
    if (SoterAuthenticationUI.oox != null)
    {
      SoterAuthenticationUI.oox.obtainMessage(5).sendToTarget();
      return;
    }
    x.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
  }
  
  protected final void bFq()
  {
    if (SoterAuthenticationUI.oox != null)
    {
      bFp();
      SoterAuthenticationUI.oox.obtainMessage(0, this.oor).sendToTarget();
      return;
    }
    x.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
  }
  
  protected final void bFr()
  {
    if (SoterAuthenticationUI.oox != null)
    {
      bFp();
      SoterAuthenticationUI.oox.obtainMessage(1, this.oor).sendToTarget();
      return;
    }
    x.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
  }
  
  protected final void bFs()
  {
    if (SoterAuthenticationUI.oox != null)
    {
      bFp();
      SoterAuthenticationUI.oox.obtainMessage(2, this.oor).sendToTarget();
      return;
    }
    x.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
  }
  
  public abstract void dd();
  
  public abstract void onPause();
  
  public abstract void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt);
  
  public abstract void onResume();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/soter_mp/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */