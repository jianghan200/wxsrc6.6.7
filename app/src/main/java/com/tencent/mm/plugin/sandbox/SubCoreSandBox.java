package com.tencent.mm.plugin.sandbox;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.model.ar;
import com.tencent.mm.plugin.y.b;
import com.tencent.mm.sandbox.monitor.ExceptionMonitorService;
import com.tencent.mm.sandbox.updater.AppUpdaterUI;
import com.tencent.mm.sandbox.updater.Updater;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

public class SubCoreSandBox
  implements ar, com.tencent.mm.plugin.y.c
{
  public static boolean mFe = false;
  public static boolean mFf = false;
  
  public SubCoreSandBox()
  {
    x.i("MicroMsg.SubCoreSandBox", "SubCoreSandBox constructor at: " + System.currentTimeMillis());
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    x.i("MicroMsg.SubCoreSandBox", "SubCoreSandBox getBaseDBFactories at: " + System.currentTimeMillis());
    return null;
  }
  
  public final String Hw(String paramString)
  {
    return com.tencent.mm.sandbox.monitor.c.Hw(paramString);
  }
  
  public final com.tencent.mm.plugin.y.a a(Context paramContext, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    return Updater.c(paramContext, paramOnCancelListener);
  }
  
  public final com.tencent.mm.plugin.y.a b(Context paramContext, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    return Updater.d(paramContext, paramOnCancelListener);
  }
  
  public final b bfA()
  {
    return new com.tencent.mm.sandbox.a.a(2);
  }
  
  public final void bfz()
  {
    Updater.CU(16);
  }
  
  public final void bn(boolean paramBoolean)
  {
    x.i("MicroMsg.SubCoreSandBox", "SubCoreSandBox onAccountPostReset at: " + System.currentTimeMillis());
  }
  
  public final void bo(boolean paramBoolean)
  {
    x.i("MicroMsg.SubCoreSandBox", "SubCoreSandBox onSdcardMount at: " + System.currentTimeMillis());
  }
  
  public final void c(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    Updater.c(paramString1, paramInt, paramString2, paramString3);
  }
  
  public final com.tencent.mm.plugin.y.a dS(Context paramContext)
  {
    return Updater.fo(paramContext);
  }
  
  public final void dT(Context paramContext)
  {
    Updater.dT(paramContext);
  }
  
  public final void gB(boolean paramBoolean)
  {
    mFe = true;
    mFf = paramBoolean;
  }
  
  public final void gi(int paramInt)
  {
    x.i("MicroMsg.SubCoreSandBox", "SubCoreSandBox clearPluginData at: " + System.currentTimeMillis());
  }
  
  public final void onAccountRelease()
  {
    x.i("MicroMsg.SubCoreSandBox", "SubCoreSandBox onAccountRelease at: " + System.currentTimeMillis());
  }
  
  public final void t(Context paramContext, Intent paramIntent)
  {
    if (paramContext != null)
    {
      paramIntent.setClass(paramContext, ExceptionMonitorService.class);
      ad.getContext().startService(paramIntent);
    }
  }
  
  public final void u(Context paramContext, Intent paramIntent)
  {
    paramIntent.setClass(paramContext, AppUpdaterUI.class);
    paramContext.startActivity(paramIntent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sandbox/SubCoreSandBox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */