package com.tencent.mm.modelstat;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import java.util.HashSet;

public final class d
{
  private static d eiM;
  private a eiK = new a();
  private HashSet<String> eiL = new HashSet();
  
  private d()
  {
    this.eiL.add("com.tencent.mm.ui.LauncherUI");
    this.eiL.add("com.tencent.mm.plugin.profile.ui.ContactInfoUI");
    this.eiL.add("com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
    this.eiL.add("com.tencent.mm.ui.conversation.BizConversationUI");
    this.eiL.add("com.tencent.mm.ui.chatting.ChattingUI");
    this.eiL.add("com.tencent.mm.plugin.label.ui.ContactLabelEditUI");
    this.eiL.add("com.tencent.mm.plugin.appbrand.ui.AppBrandUI");
    this.eiL.add("com.tencent.mm.plugin.appbrand.ui.AppBrandUI1");
    this.eiL.add("com.tencent.mm.plugin.appbrand.ui.AppBrandUI2");
    this.eiL.add("com.tencent.mm.plugin.appbrand.ui.AppBrandUI3");
    this.eiL.add("com.tencent.mm.plugin.appbrand.ui.AppBrandUI4");
  }
  
  public static boolean RU()
  {
    a locala = RV().eiK;
    return locala.eiP > locala.eiQ;
  }
  
  public static d RV()
  {
    if (eiM == null) {}
    try
    {
      if (eiM == null) {
        eiM = new d();
      }
      return eiM;
    }
    finally {}
  }
  
  public static void b(int paramInt1, String paramString, int paramInt2)
  {
    Intent localIntent = new Intent("com.tencent.mm.Intent.ACTION_CLICK_FLOW_REPORT");
    localIntent.putExtra("opCode", paramInt1);
    localIntent.putExtra("ui", paramString);
    localIntent.putExtra("uiHashCode", paramInt2);
    localIntent.putExtra("nowMilliSecond", bi.VF());
    localIntent.putExtra("elapsedRealtime", SystemClock.elapsedRealtime());
    paramString = ad.getContext();
    if (paramString != null)
    {
      if (ad.cic()) {
        c.RT().q(localIntent);
      }
    }
    else {
      return;
    }
    x.d("MicroMsg.ClickFlowStatSender", "sendBroadcast, Intent: %s, Extra: %s", new Object[] { localIntent, localIntent.getExtras() });
    paramString.sendBroadcast(localIntent);
  }
  
  public static void c(Application paramApplication)
  {
    paramApplication.registerActivityLifecycleCallbacks(RV().eiK);
  }
  
  public static void h(String paramString, long paramLong1, long paramLong2)
  {
    if ((com.tencent.mm.protocal.d.qVQ) || (com.tencent.mm.protocal.d.qVR) || (com.tencent.mm.protocal.d.qVP))
    {
      x.i("MicroMsg.ClickFlowStatSender", "kvCheck :%s [%s,%s,%s]", new Object[] { paramString, Long.valueOf(paramLong1), Long.valueOf(paramLong2), Long.valueOf(paramLong2 - paramLong1) });
      com.tencent.mm.plugin.report.f.mDy.k(13393, "99999,0,0," + paramLong1 + "," + paramLong2 + "," + paramString);
    }
  }
  
  static final class a
    implements Application.ActivityLifecycleCallbacks
  {
    private int eiN;
    private int eiO;
    int eiP;
    int eiQ;
    
    public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
    {
      d.a(d.RV(), 1, paramActivity);
    }
    
    public final void onActivityDestroyed(Activity paramActivity)
    {
      d.a(d.RV(), 6, paramActivity);
    }
    
    public final void onActivityPaused(Activity paramActivity)
    {
      this.eiO += 1;
      x.i("MicroMsg.ClickFlowStatSender", "paused[%d]", new Object[] { Integer.valueOf(this.eiO) });
      d.a(d.RV(), 4, paramActivity);
      f localf = f.RY();
      if ((paramActivity != null) && ((paramActivity instanceof MMActivity)))
      {
        String str = paramActivity.getClass().getName();
        long l = ((MMActivity)paramActivity).cql();
        localf.r(str, l);
        x.v("MicroMsg.MMActivityBrowseMgr", "onPause activity[%s] time[%d] map[%d]", new Object[] { str, Long.valueOf(l), Integer.valueOf(localf.ejE.size()) });
      }
    }
    
    public final void onActivityResumed(Activity paramActivity)
    {
      this.eiN += 1;
      x.i("MicroMsg.ClickFlowStatSender", "resumed[%d]", new Object[] { Integer.valueOf(this.eiN) });
      d.a(d.RV(), 3, paramActivity);
    }
    
    public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
    
    public final void onActivityStarted(Activity paramActivity)
    {
      this.eiP += 1;
      x.i("MicroMsg.ClickFlowStatSender", "started[%d]", new Object[] { Integer.valueOf(this.eiP) });
      d.a(d.RV(), 2, paramActivity);
    }
    
    public final void onActivityStopped(Activity paramActivity)
    {
      this.eiQ += 1;
      x.i("MicroMsg.ClickFlowStatSender", "stopped[%d]", new Object[] { Integer.valueOf(this.eiQ) });
      d.a(d.RV(), 5, paramActivity);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/modelstat/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */