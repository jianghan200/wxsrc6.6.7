package com.tencent.xweb.sys;

import android.content.Context;
import android.webkit.CookieSyncManager;
import com.tencent.xweb.c.b.b;

public final class b
  implements b.b
{
  CookieSyncManager vCK;
  
  public final void init(Context paramContext)
  {
    this.vCK = CookieSyncManager.createInstance(paramContext);
  }
  
  public final void sync()
  {
    if (this.vCK != null) {
      this.vCK.sync();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/xweb/sys/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */