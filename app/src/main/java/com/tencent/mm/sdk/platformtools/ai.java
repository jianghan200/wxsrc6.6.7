package com.tencent.mm.sdk.platformtools;

import android.os.Debug;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import junit.framework.Assert;

final class ai
  extends Handler
  implements am.a
{
  private Looper sGK = getLooper();
  private Handler.Callback sGL;
  a sGM;
  private String toStringResult = null;
  
  ai(Handler.Callback paramCallback, a parama)
  {
    super(paramCallback);
    this.sGL = paramCallback;
    this.sGM = parama;
  }
  
  ai(Looper paramLooper, Handler.Callback paramCallback, a parama)
  {
    super(paramLooper, paramCallback);
    this.sGL = paramCallback;
    this.sGM = parama;
  }
  
  ai(Looper paramLooper, a parama)
  {
    super(paramLooper);
    this.sGM = parama;
  }
  
  ai(a parama)
  {
    this.sGM = parama;
  }
  
  public final void a(Runnable paramRunnable, am paramam)
  {
    if (this.sGM != null) {
      this.sGM.onTaskRunEnd(paramRunnable, paramam);
    }
  }
  
  public final void a(Runnable paramRunnable, Thread paramThread, long paramLong1, long paramLong2, float paramFloat)
  {
    if (this.sGM != null) {
      this.sGM.onLog(null, paramRunnable, paramThread, paramLong1, paramLong2, paramFloat);
    }
  }
  
  public final void dispatchMessage(Message paramMessage)
  {
    if ((paramMessage.getCallback() != null) || (this.sGL != null)) {
      super.dispatchMessage(paramMessage);
    }
    long l1;
    long l2;
    do
    {
      return;
      l1 = System.currentTimeMillis();
      l2 = Debug.threadCpuTimeNanos();
      handleMessage(paramMessage);
    } while (this.sGM == null);
    this.sGM.onLog(paramMessage, null, this.sGK.getThread(), System.currentTimeMillis() - l1, Debug.threadCpuTimeNanos() - l2, -1.0F);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    if (this.sGM != null) {
      this.sGM.handleMessage(paramMessage);
    }
  }
  
  public final boolean sendMessageAtTime(Message paramMessage, long paramLong)
  {
    boolean bool1;
    Runnable localRunnable;
    if (paramMessage != null)
    {
      bool1 = true;
      Assert.assertTrue("msg is null", bool1);
      localRunnable = paramMessage.getCallback();
      if (localRunnable != null) {
        break label42;
      }
      bool1 = super.sendMessageAtTime(paramMessage, paramLong);
    }
    label42:
    Object localObject;
    boolean bool2;
    do
    {
      do
      {
        return bool1;
        bool1 = false;
        break;
        long l = paramLong - SystemClock.uptimeMillis();
        if (paramMessage.getTarget() == null) {}
        Message localMessage;
        for (localObject = this;; localObject = paramMessage.getTarget())
        {
          localObject = new am(this.sGK.getThread(), (Handler)localObject, localRunnable, paramMessage.obj, this);
          if (l > 0L) {
            ((am)localObject).sHg = l;
          }
          localMessage = Message.obtain(paramMessage.getTarget(), (Runnable)localObject);
          localMessage.what = paramMessage.what;
          localMessage.arg1 = paramMessage.arg1;
          localMessage.arg2 = paramMessage.arg2;
          localMessage.obj = paramMessage.obj;
          localMessage.replyTo = paramMessage.replyTo;
          localMessage.setData(paramMessage.getData());
          paramMessage.recycle();
          if ((getLooper() == null) || (getLooper().getThread().isAlive())) {
            break;
          }
          x.w("MicroMsg.MMInnerHandler", "sendMessageAtTime but thread[%d, %s] is dead so return false!", new Object[] { Long.valueOf(getLooper().getThread().getId()), getLooper().getThread().getName() });
          return false;
        }
        if (this.sGM != null) {
          this.sGM.onTaskAdded(localRunnable, (am)localObject);
        }
        bool2 = super.sendMessageAtTime(localMessage, paramLong);
        bool1 = bool2;
      } while (bool2);
      bool1 = bool2;
    } while (this.sGM == null);
    this.sGM.onTaskRunEnd(localRunnable, (am)localObject);
    return bool2;
  }
  
  public final String toString()
  {
    if (this.toStringResult == null) {
      this.toStringResult = ("MMInnerHandler{listener = " + this.sGM + "}");
    }
    return this.toStringResult;
  }
  
  public static abstract interface a
  {
    public abstract void handleMessage(Message paramMessage);
    
    public abstract void onLog(Message paramMessage, Runnable paramRunnable, Thread paramThread, long paramLong1, long paramLong2, float paramFloat);
    
    public abstract void onTaskAdded(Runnable paramRunnable, am paramam);
    
    public abstract void onTaskRunEnd(Runnable paramRunnable, am paramam);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */