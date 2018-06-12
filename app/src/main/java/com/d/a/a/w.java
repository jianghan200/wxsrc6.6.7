package com.d.a.a;

import android.content.Context;
import android.os.Handler;

final class w
  extends n
{
  private static w bmq;
  private boolean bmr;
  private int bms;
  private long bmt;
  private long bmu;
  
  static w sY()
  {
    if (bmq == null) {
      bmq = new w();
    }
    return bmq;
  }
  
  final void a(int paramInt, String paramString, long paramLong1, long paramLong2)
  {
    if (this.bmr) {
      stop();
    }
    super.a(paramInt, paramString, paramLong1, paramLong2);
  }
  
  final void a(Context paramContext, Handler paramHandler, d.a parama)
  {
    if (this.bmr) {
      if (k.sy().bgG) {
        k.sy().su();
      }
    }
    for (;;)
    {
      super.a(paramContext, paramHandler, parama);
      return;
      if (!k.sy().bgG) {
        try
        {
          k.sy().a(paramContext, new m[] { this });
        }
        catch (Exception localException) {}
      }
    }
  }
  
  final void a(Handler paramHandler, d.a parama)
  {
    try
    {
      this.bmr = false;
      super.a(paramHandler, parama);
      return;
    }
    finally
    {
      paramHandler = finally;
      throw paramHandler;
    }
  }
  
  public final void a(p paramp)
  {
    long l = paramp.bjy;
    if ((this.bmr) && (l - this.bmu > this.bmt)) {
      stop();
    }
    for (int i = 1; i != 0; i = 0) {
      return;
    }
    super.a(paramp);
  }
  
  final void a(x paramx, long paramLong1, long paramLong2)
  {
    if (paramx.bmz == null) {
      paramx.bmz = new x.a();
    }
    float f = paramx.bmz.bmC;
    if ((this.bmr) && (f >= this.bms)) {
      stop();
    }
    for (int i = 1; i != 0; i = 0) {
      return;
    }
    super.a(paramx, paramLong1, paramLong2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/d/a/a/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */