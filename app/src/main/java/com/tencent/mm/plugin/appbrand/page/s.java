package com.tencent.mm.plugin.appbrand.page;

import android.content.Context;
import android.view.View;
import com.tencent.mm.plugin.appbrand.jsapi.c;

public final class s
  extends l
{
  private p fFv;
  private String mUrl;
  
  public s(Context paramContext, n paramn)
  {
    super(paramContext, paramn);
  }
  
  protected final View agC()
  {
    if (this.fFv == null) {
      this.fFv = getContainer().getPreloadedPageView();
    }
    return this.fFv.getContentView();
  }
  
  protected final void agD()
  {
    super.agD();
    this.fFv.onDestroy();
  }
  
  public final void agE()
  {
    super.agE();
    this.fFv.agL();
  }
  
  public final void agF()
  {
    super.agF();
    this.fFv.agK();
  }
  
  public final void b(String paramString1, String paramString2, int[] paramArrayOfInt)
  {
    if (!d(paramArrayOfInt, this.fFv.hashCode())) {
      return;
    }
    this.fFv.j(paramString1, paramString2, 0);
  }
  
  public final void cleanup()
  {
    super.cleanup();
    this.fFv.cleanup();
  }
  
  public final p getCurrentPageView()
  {
    return this.fFv;
  }
  
  public final String getCurrentUrl()
  {
    return this.mUrl;
  }
  
  public final void loadUrl(String paramString)
  {
    if (this.mUrl != null) {
      return;
    }
    this.mUrl = paramString;
    this.fFv.sX(paramString);
    agH();
  }
  
  public final boolean sV(String paramString)
  {
    return com.tencent.mm.plugin.appbrand.q.l.vP(this.mUrl).equals(com.tencent.mm.plugin.appbrand.q.l.vP(paramString));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/page/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */