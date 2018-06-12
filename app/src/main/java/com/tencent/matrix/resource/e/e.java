package com.tencent.matrix.resource.e;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

public final class e
{
  final Handler bsK;
  private final long bsL;
  final Handler mMainHandler;
  
  public e(long paramLong, HandlerThread paramHandlerThread)
  {
    this.bsK = new Handler(paramHandlerThread.getLooper());
    this.mMainHandler = new Handler(Looper.getMainLooper());
    this.bsL = paramLong;
  }
  
  public final void a(final a parama, final int paramInt)
  {
    this.bsK.postDelayed(new Runnable()
    {
      public final void run()
      {
        if (parama.tB() == e.a.a.bsQ) {
          e.this.a(parama, paramInt + 1);
        }
      }
    }, this.bsL);
  }
  
  public static abstract interface a
  {
    public abstract int tB();
    
    public static enum a {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/resource/e/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */