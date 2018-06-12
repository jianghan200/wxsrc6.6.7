package com.tencent.xweb;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.xweb.c.i;
import com.tencent.xweb.c.i.a;
import org.xwalk.core.XWalkEnvironment;

public final class k
{
  private static k vAo = null;
  public Context vAp;
  WebView.d vAq = WebView.d.vAO;
  public boolean vAr = false;
  public boolean vAs = false;
  boolean vAt = false;
  public g.a vAu = g.a.vAc;
  public boolean vAv = false;
  String vAw = "";
  
  public static k cIn()
  {
    return vAo;
  }
  
  public static void ik(Context paramContext)
  {
    boolean bool2 = false;
    if (vAo != null) {
      return;
    }
    Object localObject = new k();
    vAo = (k)localObject;
    ((k)localObject).vAp = paramContext;
    XWalkEnvironment.init(paramContext);
    vAo.vAs = paramContext.getSharedPreferences("wcwebview", 0).getBoolean("bShowVersion", false);
    localObject = paramContext.getSharedPreferences("wcwebview", 0).getString("V8type", "RT_TYPE_AUTO");
    try
    {
      vAo.vAu = g.a.valueOf((String)localObject);
      vAo.vAr = XWalkEnvironment.getSharedPreferences().getBoolean("ENABLEREMOTEDEBUG", false);
      paramContext = XWalkEnvironment.getTestDownLoadUrl(paramContext);
      localObject = vAo;
      boolean bool1 = bool2;
      if (paramContext != null)
      {
        bool1 = bool2;
        if (!paramContext.isEmpty()) {
          bool1 = true;
        }
      }
      ((k)localObject).vAv = bool1;
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public final void a(g.a parama)
  {
    if (this.vAu == parama) {
      return;
    }
    this.vAu = parama;
    this.vAp.getSharedPreferences("wcwebview", 0).edit().putString("V8type", parama.toString()).commit();
  }
  
  public final void a(String paramString, WebView.d paramd)
  {
    if ((this.vAp == null) || (paramString == null) || (paramString.isEmpty())) {
      return;
    }
    this.vAw = paramString;
    this.vAq = paramd;
    this.vAp.getSharedPreferences("wcwebview", 0).edit().putString("HardCodeWebView" + paramString, paramd.toString()).commit();
  }
  
  public final WebView.d adC(String paramString)
  {
    if (this.vAw.equals(paramString)) {
      return this.vAq;
    }
    if ((paramString == null) || (paramString.isEmpty()) || (this.vAp == null)) {
      return WebView.d.vAO;
    }
    this.vAw = paramString;
    SharedPreferences localSharedPreferences = this.vAp.getSharedPreferences("wcwebview", 0);
    if (localSharedPreferences == null) {
      return WebView.d.vAO;
    }
    String str2 = localSharedPreferences.getString("HardCodeWebView" + paramString, "");
    String str1;
    if ((str2 != null) && (!str2.isEmpty()))
    {
      str1 = str2;
      if (!str2.equals(WebView.d.vAO.toString())) {}
    }
    else
    {
      str1 = localSharedPreferences.getString("ABTestWebView" + paramString, "");
    }
    if ((str1 == null) || (str1.isEmpty())) {
      this.vAq = WebView.d.vAO;
    }
    for (;;)
    {
      return this.vAq;
      try
      {
        this.vAq = WebView.d.valueOf(str1);
      }
      catch (Exception paramString)
      {
        this.vAq = WebView.d.vAO;
      }
    }
  }
  
  public final void mV(boolean paramBoolean)
  {
    if (paramBoolean == this.vAr) {
      return;
    }
    this.vAr = paramBoolean;
    XWalkEnvironment.getSharedPreferences().edit().putBoolean("ENABLEREMOTEDEBUG", paramBoolean).commit();
  }
  
  public final void mW(boolean paramBoolean)
  {
    if (paramBoolean == this.vAv) {
      return;
    }
    this.vAv = paramBoolean;
    if (this.vAv)
    {
      XWalkEnvironment.setTestDownLoadUrl(this.vAp, "https://dldir1.qq.com/weixin/android/wxweb/updateConfig_test.xml");
      localEditor = XWalkEnvironment.getSharedPreferencesForUpdateConfig().edit();
      localEditor.putLong("nLastFetchConfigTime", 0L);
      localEditor.commit();
      i.b(WebView.d.vAP).excute("STR_CMD_CLEAR_SCHEDULER", null);
      return;
    }
    XWalkEnvironment.setTestDownLoadUrl(this.vAp, "");
    SharedPreferences.Editor localEditor = XWalkEnvironment.getSharedPreferencesForUpdateConfig().edit();
    localEditor.putLong("nLastFetchConfigTime", 0L);
    localEditor.commit();
    i.b(WebView.d.vAP).excute("STR_CMD_CLEAR_SCHEDULER", null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/xweb/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */