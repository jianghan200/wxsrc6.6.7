package com.tencent.mm.sdk.platformtools;

import android.os.Looper;
import android.os.Message;

public class al
  extends ag
{
  private static int sGq;
  private final boolean gaE;
  private boolean mStop = false;
  private long sGZ = 0L;
  private final int sGr;
  private final a sHa;
  
  public al(Looper paramLooper, a parama, boolean paramBoolean)
  {
    super(paramLooper);
    this.sHa = parama;
    this.sGr = cip();
    this.gaE = paramBoolean;
    if (paramLooper.getThread().getName().equals("initThread")) {
      x.e("MicroMsg.MTimerHandler", "MTimerHandler can not init handler with initThread looper, stack %s", new Object[] { bi.cjd() });
    }
  }
  
  public al(a parama, boolean paramBoolean)
  {
    this.sHa = parama;
    this.sGr = cip();
    this.gaE = paramBoolean;
    if (getLooper().getThread().getName().equals("initThread")) {
      x.e("MicroMsg.MTimerHandler", "MTimerHandler can not init handler with initThread looper, stack %s", new Object[] { bi.cjd() });
    }
  }
  
  private static int cip()
  {
    if (sGq >= 8192) {
      sGq = 0;
    }
    int i = sGq + 1;
    sGq = i;
    return i;
  }
  
  public final void J(long paramLong1, long paramLong2)
  {
    this.sGZ = paramLong2;
    SO();
    this.mStop = false;
    sendEmptyMessageDelayed(this.sGr, paramLong1);
  }
  
  public final void SO()
  {
    removeMessages(this.sGr);
    this.mStop = true;
  }
  
  public final boolean ciq()
  {
    return (this.mStop) || (!hasMessages(this.sGr));
  }
  
  public final void fZ(long paramLong)
  {
    J(paramLong, paramLong);
  }
  
  protected void finalize()
  {
    SO();
    super.finalize();
  }
  
  public void handleMessage(Message paramMessage)
  {
    if ((paramMessage.what != this.sGr) || (this.sHa == null)) {}
    while ((!this.sHa.vD()) || (!this.gaE) || (this.mStop)) {
      return;
    }
    sendEmptyMessageDelayed(this.sGr, this.sGZ);
  }
  
  public String toString()
  {
    if (this.sHa == null) {
      return "MTimerHandler(" + getClass().getName() + "){mCallBack = null}";
    }
    return "MTimerHandler(" + getClass().getName() + "){mCallBack = " + this.sHa.getClass().getName() + "}";
  }
  
  public static abstract interface a
  {
    public abstract boolean vD();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */