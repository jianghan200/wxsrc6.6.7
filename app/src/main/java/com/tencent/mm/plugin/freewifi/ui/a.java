package com.tencent.mm.plugin.freewifi.ui;

import android.content.Context;
import android.view.View;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.Date;

public final class a
  extends b
{
  private static Date jmj = null;
  private boolean hasInit = false;
  private Runnable jmk = new a.2(this);
  
  public a(Context paramContext)
  {
    super(paramContext);
    initialize();
  }
  
  private void initialize()
  {
    View localView;
    if (this.view != null)
    {
      localView = this.view.findViewById(R.h.free_wifi_tip_view);
      if (!this.hasInit) {}
    }
    else
    {
      return;
    }
    this.hasInit = true;
    localView.setOnClickListener(new a.1(this));
    localView.setVisibility(8);
  }
  
  public final boolean anR()
  {
    if (!this.hasInit)
    {
      initialize();
      return false;
    }
    ah.M(this.jmk);
    ah.i(this.jmk, 500L);
    return true;
  }
  
  public final void destroy() {}
  
  public final int getLayoutId()
  {
    return R.i.free_wifi_tips;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */