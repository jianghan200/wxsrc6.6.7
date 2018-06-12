package com.tencent.mm.plugin.websearch.api;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.widget.MMWebView.a;

public final class af
{
  private static af pMB = new af();
  private SharedPreferences mPref = an.m(ad.getContext(), "com.tencent.mm.plugin.websearch.WebSearchXWeb", 4);
  private boolean pMA = false;
  private volatile boolean pMy = this.mPref.getBoolean("isUseSysWebview", false);
  private long pMz;
  
  public af()
  {
    bTq();
  }
  
  private void bTq()
  {
    e.post(new af.1(this), "WebSearchXWeb-getSwitch");
  }
  
  public static af bTr()
  {
    return pMB;
  }
  
  public final boolean bTs()
  {
    bTq();
    if (!this.pMA)
    {
      x.i("WebSearchXWeb", "check use sys webview switch close");
      return false;
    }
    if (this.pMz == 0L) {
      this.pMz = this.mPref.getLong("lastCheckTimestamp", 0L);
    }
    if (System.currentTimeMillis() - this.pMz > 86400000L)
    {
      e.post(new af.2(this, MMWebView.a.hf(ad.getContext()), MMWebView.a.cS(ad.getContext())), "WebSearchXWeb.check");
      this.pMz = System.currentTimeMillis();
      this.mPref.edit().putLong("lastCheckTimestamp", this.pMz).commit();
    }
    return this.pMy;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/websearch/api/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */