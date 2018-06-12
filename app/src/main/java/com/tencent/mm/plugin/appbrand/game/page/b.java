package com.tencent.mm.plugin.appbrand.game.page;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.mm.plugin.appbrand.game.k;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.page.l;
import com.tencent.mm.plugin.appbrand.page.n;
import com.tencent.mm.sdk.platformtools.x;

@SuppressLint({"ViewConstructor"})
public final class b
  extends l
{
  private d fCC;
  private String mURL;
  
  public b(Context paramContext, n paramn)
  {
    super(paramContext, paramn);
    x.i("MicroMsg.WAGamePage", "hy: WAGamePage on create");
  }
  
  protected final View agB()
  {
    return new FrameLayout(getContext());
  }
  
  protected final View agC()
  {
    d locald = new d(getContext(), getContainer().getRuntime());
    this.fCC = locald;
    return locald.fCH;
  }
  
  protected final void agD()
  {
    super.agD();
    this.fCC.onDestroy();
  }
  
  public final void agE()
  {
    super.agE();
    this.fCC.agL();
  }
  
  public final void agF()
  {
    super.agF();
    this.fCC.agK();
  }
  
  protected final void agG() {}
  
  protected final void agH() {}
  
  public final void agI()
  {
    if (this.fCC != null)
    {
      d locald = this.fCC;
      if (locald.fCI != null) {
        locald.fCI.getMBRenderer();
      }
    }
  }
  
  public final void b(String paramString1, String paramString2, int[] paramArrayOfInt)
  {
    this.fCC.j(paramString1, paramString2, 0);
  }
  
  public final void cleanup()
  {
    super.cleanup();
    this.fCC.cleanup();
  }
  
  public final d getCurrentPageView()
  {
    return this.fCC;
  }
  
  public final String getCurrentUrl()
  {
    return this.mURL;
  }
  
  public final void loadUrl(String paramString)
  {
    this.mURL = paramString;
    this.fCC.sX(paramString);
  }
  
  public final boolean sV(String paramString)
  {
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/page/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */