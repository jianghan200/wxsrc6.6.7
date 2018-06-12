package com.tencent.mm.plugin.appbrand.game.page;

import android.annotation.SuppressLint;
import android.content.Context;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.page.aa;
import com.tencent.mm.plugin.appbrand.page.n;
import com.tencent.mm.sdk.platformtools.x;

@SuppressLint({"ViewConstructor"})
public final class c
  extends n
{
  private b fCD = null;
  
  public c(Context paramContext, g paramg)
  {
    super(paramContext, paramg);
  }
  
  public final void V(String paramString, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      getCurrentPage().loadUrl(paramString);
      getReporter().a(getCurrentPageView(), null, aa.gpk);
      return;
    }
    x.e("MicroMsg.WAGamePageContainer", "reLaunch without auto is not support here");
  }
  
  public final void agI()
  {
    getCurrentPage().agI();
  }
  
  public final void agJ()
  {
    runOnUiThread(new c.2(this));
  }
  
  public final void agK()
  {
    getCurrentPage().agF();
  }
  
  public final void agL()
  {
    getCurrentPage().agE();
  }
  
  public final boolean agM()
  {
    return false;
  }
  
  public final void c(String paramString1, String paramString2, int[] paramArrayOfInt) {}
  
  public final b getCurrentPage()
  {
    try
    {
      b localb = this.fCD;
      return localb;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final d getCurrentPageView()
  {
    return getCurrentPage().getCurrentPageView();
  }
  
  public final int getPageCount()
  {
    return 1;
  }
  
  public final void ko(int paramInt)
  {
    agJ();
  }
  
  public final void sW(String paramString)
  {
    runOnUiThread(new c.1(this, paramString));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/page/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */