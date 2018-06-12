package com.tencent.mm.plugin.appbrand.r.a;

import android.content.Context;
import com.tencent.mm.plugin.appbrand.r.d.a;

public enum a
  implements e, d.a
{
  public static final c gCh = new c();
  private final e gCi = new b();
  
  private a() {}
  
  public final c aoB()
  {
    return this.gCi.aoB();
  }
  
  public final void aoy()
  {
    release();
  }
  
  public final void cL(Context paramContext)
  {
    init(paramContext);
  }
  
  public final void init(Context paramContext)
  {
    this.gCi.init(paramContext);
  }
  
  public final void release()
  {
    this.gCi.release();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/r/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */