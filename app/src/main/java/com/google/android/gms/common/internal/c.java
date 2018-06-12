package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.c.b;
import com.google.android.gms.common.api.c.c;

public final class c<T extends IInterface>
  extends k<T>
{
  private final a.d<T> aNq;
  
  public c(Context paramContext, Looper paramLooper, int paramInt, c.b paramb, c.c paramc, h paramh, a.d paramd)
  {
    super(paramContext, paramLooper, paramInt, paramh, paramb, paramc);
    this.aNq = paramd;
  }
  
  protected final T f(IBinder paramIBinder)
  {
    return this.aNq.oy();
  }
  
  protected final String ow()
  {
    return this.aNq.ow();
  }
  
  protected final String ox()
  {
    return this.aNq.ox();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/gms/common/internal/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */