package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.content.Context;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;

public final class a
  extends c.a
{
  private boolean gtW = false;
  
  public a(Context paramContext)
  {
    super(paramContext);
    if ((paramContext instanceof Activity)) {
      this.gtW = j.c(((Activity)paramContext).getWindow());
    }
  }
  
  public final c anj()
  {
    c localc = super.anj();
    j.a(localc.getWindow(), this.gtW);
    return localc;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */