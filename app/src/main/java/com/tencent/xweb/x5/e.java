package com.tencent.xweb.x5;

import android.content.Context;
import com.tencent.smtt.sdk.CookieSyncManager;
import com.tencent.xweb.c.b.b;

public final class e
  implements b.b
{
  CookieSyncManager vDx;
  
  public final void init(Context paramContext)
  {
    this.vDx = CookieSyncManager.createInstance(paramContext);
  }
  
  public final void sync()
  {
    if (this.vDx != null) {
      this.vDx.sync();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/xweb/x5/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */