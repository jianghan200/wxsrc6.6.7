package com.tencent.xweb.c;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.xweb.WebView.d;
import java.util.Date;
import org.xwalk.core.XWalkEnvironment;

public final class c
{
  public static boolean vCE = false;
  static String vCF = "";
  public SharedPreferences vCB;
  public int vCC;
  public String vCD;
  
  public c(String paramString, WebView.d paramd, int paramInt)
  {
    if ((paramd != WebView.d.vAP) && (paramd != WebView.d.vAR)) {}
    for (;;)
    {
      this.vCB = localSharedPreferences;
      this.vCD = paramString;
      this.vCC = paramInt;
      return;
      String str = "INIT_SP_TAG_" + paramd.toString() + paramString;
      if (!str.equals(vCF))
      {
        vCF = str;
        XWalkEnvironment.getApplicationContext();
        localSharedPreferences = XWalkEnvironment.getProcessSafePreferences("INIT_SP_TAG_" + paramd.toString(), 4);
      }
    }
  }
  
  public final void cIE()
  {
    if (vCE) {}
    while (this.vCB == null) {
      return;
    }
    long l = new Date().getTime();
    SharedPreferences.Editor localEditor = this.vCB.edit();
    localEditor.putLong("INIT_START_TIME", l);
    localEditor.putLong("INIT_START_TIME" + this.vCD, l).commit();
  }
  
  public final void cIF()
  {
    if (this.vCB == null) {
      return;
    }
    this.vCB.edit().putLong("INIT_END_TIME", new Date().getTime()).commit();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/xweb/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */