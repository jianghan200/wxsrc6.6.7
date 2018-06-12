package com.tencent.matrix.trace.c;

import android.os.Handler;
import android.os.HandlerThread;

public final class a
{
  private final long btC;
  private volatile boolean btD = false;
  private final Handler mHandler;
  
  public a(HandlerThread paramHandlerThread, long paramLong)
  {
    this.btC = paramLong;
    this.mHandler = new Handler(paramHandlerThread.getLooper());
  }
  
  public final void a(a parama, boolean paramBoolean)
  {
    if (this.mHandler != null)
    {
      this.btD = true;
      this.mHandler.removeCallbacksAndMessages(null);
      parama = new b(this.mHandler, this.btC, parama, paramBoolean);
      this.mHandler.postDelayed(parama, this.btC);
    }
  }
  
  public final void cancel()
  {
    if (this.mHandler != null)
    {
      this.btD = false;
      this.mHandler.removeCallbacksAndMessages(null);
    }
  }
  
  public static abstract interface a
  {
    public abstract void tG();
  }
  
  static final class b
    implements Runnable
  {
    private final long btC;
    private final a.a btE;
    private final boolean btF;
    private final Handler handler;
    
    b(Handler paramHandler, long paramLong, a.a parama, boolean paramBoolean)
    {
      this.handler = paramHandler;
      this.btC = paramLong;
      this.btE = parama;
      this.btF = paramBoolean;
    }
    
    public final void run()
    {
      this.btE.tG();
      if (this.btF) {
        this.handler.postDelayed(this, this.btC);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/trace/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */