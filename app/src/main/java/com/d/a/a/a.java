package com.d.a.a;

import android.content.Context;
import android.os.Handler;

abstract class a
  extends d
  implements m
{
  private final Handler[] bgA;
  private final d.a[] bgB;
  private final d[] bgz;
  
  a(d... paramVarArgs)
  {
    this.bgz = paramVarArgs;
    this.bgA = new Handler[this.bgz.length];
    this.bgB = new d.a[this.bgA.length];
  }
  
  void a(Context paramContext, Handler paramHandler, d.a parama)
  {
    a(paramHandler, this.bgA);
    a(parama, this.bgB);
    int i = 0;
    for (;;)
    {
      if (i >= this.bgz.length) {
        return;
      }
      try
      {
        this.bgz[i].a(this.bgA[i], this.bgB[i]);
        i += 1;
      }
      catch (Exception paramContext)
      {
        for (;;) {}
      }
    }
  }
  
  abstract void a(Handler paramHandler, Handler[] paramArrayOfHandler);
  
  abstract void a(d.a parama, d.a[] paramArrayOfa);
  
  final void aw(Context paramContext)
  {
    int i = 0;
    d[] arrayOfd = this.bgz;
    int j = arrayOfd.length;
    for (;;)
    {
      if (i >= j) {
        return;
      }
      d locald = arrayOfd[i];
      try
      {
        locald.a(paramContext, new m[] { this });
        i += 1;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
  
  final void ax(Context paramContext)
  {
    paramContext = this.bgz;
    int j = paramContext.length;
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        return;
      }
      paramContext[i].stop();
      i += 1;
    }
  }
  
  final void sr()
  {
    d[] arrayOfd = this.bgz;
    int j = arrayOfd.length;
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        return;
      }
      arrayOfd[i].su();
      i += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/d/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */