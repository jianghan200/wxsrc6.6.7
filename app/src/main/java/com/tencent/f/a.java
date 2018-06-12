package com.tencent.f;

import java.util.HashMap;

public final class a
  implements com.tencent.f.b.a
{
  private g vwx;
  private boolean vwy = true;
  
  protected a(g paramg)
  {
    this.vwx = paramg;
  }
  
  public final void w(String paramString, Object paramObject)
  {
    if (!this.vwy) {
      return;
    }
    f localf = f.cHr();
    if (paramObject == null) {
      throw new h("TpfServiceCenter|registerService|name or service should not be null");
    }
    synchronized (localf.vwE)
    {
      localf.vwC.put(paramString, paramObject);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */