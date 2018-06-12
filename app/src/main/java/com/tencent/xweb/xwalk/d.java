package com.tencent.xweb.xwalk;

import android.content.Context;
import com.tencent.xweb.c.b.b;
import org.xwalk.core.XWalkCookieManager;

public final class d
  implements b.b
{
  XWalkCookieManager vEK = new XWalkCookieManager();
  
  public final void init(Context paramContext) {}
  
  public final void sync()
  {
    if (this.vEK != null) {
      this.vEK.flushCookieStore();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/xweb/xwalk/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */