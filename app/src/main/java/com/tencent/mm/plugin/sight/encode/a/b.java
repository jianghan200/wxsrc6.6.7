package com.tencent.mm.plugin.sight.encode.a;

import com.tencent.mm.sdk.platformtools.ah;

public final class b
{
  public static void a(a parama, final int paramInt)
  {
    if (parama == null) {
      return;
    }
    ah.A(new Runnable()
    {
      public final void run()
      {
        this.nfn.onError(paramInt);
      }
    });
  }
  
  public static abstract interface a
  {
    public abstract void onError(int paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sight/encode/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */