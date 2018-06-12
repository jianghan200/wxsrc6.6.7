package com.tencent.matrix.trace.core;

import android.app.Activity;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.Fragment;
import com.tencent.matrix.d.b;
import com.tencent.matrix.trace.b.c;
import com.tencent.matrix.trace.b.d;

public class MethodBeat
  implements c, a.a
{
  private static final int RELEASE_BUFFER_MSG_ID = 512;
  private static final String TAG = "Matrix.MethodBeat";
  private static final int UPDATE_TIME_MSG_ID = 256;
  private static volatile boolean isBackground;
  private static volatile boolean isCreated = false;
  private static boolean isRealTrace;
  private static long[] sBuffer;
  private static volatile long sCurrentDiffTime;
  private static volatile long sFirstDiffTime;
  private static volatile int sIndex = 0;
  private static boolean sIsIn;
  private static volatile long sLastDiffTime;
  private static d sListener;
  private static Thread sMainThread;
  private static Handler sReleaseBufferHandler;
  private static Handler sTimeUpdateHandler;
  private static HandlerThread sTimerUpdateThread;
  
  static
  {
    sBuffer = new long['✐'];
    sIsIn = false;
    sMainThread = Looper.getMainLooper().getThread();
    sTimerUpdateThread = com.tencent.matrix.d.a.cd("matrix_time_update_thread");
    sTimeUpdateHandler = new Handler(sTimerUpdateThread.getLooper(), new Handler.Callback()
    {
      public final boolean handleMessage(Message paramAnonymousMessage)
      {
        if (paramAnonymousMessage.what == 256)
        {
          MethodBeat.access$002(System.nanoTime() / 1000000L - MethodBeat.sLastDiffTime);
          MethodBeat.sTimeUpdateHandler.sendEmptyMessageDelayed(256, 5L);
        }
        return true;
      }
    });
    sReleaseBufferHandler = new Handler(Looper.getMainLooper(), new Handler.Callback()
    {
      public final boolean handleMessage(Message paramAnonymousMessage)
      {
        if ((paramAnonymousMessage.what == 512) && (!MethodBeat.isCreated))
        {
          b.i("Matrix.MethodBeat", "Plugin is never init, release buffer!", new Object[0]);
          MethodBeat.access$402(null);
        }
        return true;
      }
    });
    sFirstDiffTime = System.currentTimeMillis();
    long l = System.nanoTime() / 1000000L;
    sLastDiffTime = l;
    sCurrentDiffTime = l;
    sTimeUpdateHandler.sendEmptyMessage(256);
    sReleaseBufferHandler.sendEmptyMessageDelayed(512, 60000L);
  }
  
  public static void at(Activity paramActivity, boolean paramBoolean)
  {
    boolean bool1 = true;
    String str = paramActivity.getClass().getSimpleName();
    boolean bool2 = isCreated;
    if (sListener == null) {}
    for (;;)
    {
      b.i("Matrix.MethodBeat", "[AT] activity: %s, isCreated: %b sListener is null?: %b，isFocus: %b", new Object[] { str, Boolean.valueOf(bool2), Boolean.valueOf(bool1), Boolean.valueOf(paramBoolean) });
      if ((isCreated) && (Thread.currentThread() == sMainThread) && (sListener != null)) {
        sListener.a(paramActivity, paramBoolean, sIndex - 1, sBuffer);
      }
      return;
      bool1 = false;
    }
  }
  
  public static void i(int paramInt)
  {
    if (isBackground) {}
    do
    {
      do
      {
        return;
        isRealTrace = true;
        if ((!isCreated) || (Thread.currentThread() != sMainThread)) {
          break;
        }
      } while (sIsIn);
      sIsIn = true;
      mergeData(paramInt, sIndex, true);
      paramInt = sIndex + 1;
      sIndex = paramInt;
      if ((paramInt >= 1000000) && (sListener != null))
      {
        sListener.b(sBuffer);
        sIndex = 0;
      }
      sIsIn = false;
      return;
    } while ((isCreated) || (Thread.currentThread() != sMainThread) || (sIsIn));
    sIsIn = true;
    if (sIndex < 10000)
    {
      mergeData(paramInt, sIndex, true);
      sIndex += 1;
    }
    sIsIn = false;
  }
  
  private static void mergeData(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    long l1 = 0L;
    if (paramBoolean) {
      l1 = Long.MIN_VALUE;
    }
    long l2 = paramInt1;
    long l3 = sCurrentDiffTime;
    sBuffer[paramInt2] = (l1 | l2 << 43 | l3 & 0x7FFFFFFFFFF);
  }
  
  public static void o(int paramInt)
  {
    if (isBackground) {}
    do
    {
      do
      {
        return;
        if ((!isCreated) || (Thread.currentThread() != sMainThread)) {
          break;
        }
        mergeData(paramInt, sIndex, false);
        paramInt = sIndex + 1;
        sIndex = paramInt;
      } while ((paramInt < 1000000) || (sListener == null));
      sListener.b(sBuffer);
      sIndex = 0;
      return;
    } while ((isCreated) || (Thread.currentThread() != sMainThread) || (sIndex >= 10000));
    mergeData(paramInt, sIndex, false);
    sIndex += 1;
  }
  
  public long[] getBuffer()
  {
    return sBuffer;
  }
  
  public int getCurIndex()
  {
    return sIndex;
  }
  
  public long getFirstTime()
  {
    return sFirstDiffTime;
  }
  
  public long getLastDiffTime()
  {
    return sLastDiffTime;
  }
  
  public boolean isRealTrace()
  {
    return isRealTrace;
  }
  
  public void onActivityCreated(Activity paramActivity)
  {
    b.i("Matrix.MethodBeat", "[onActivityCreated]: %s", new Object[] { paramActivity.getClass().getSimpleName() });
    if ((isBackground) && (!sTimeUpdateHandler.hasMessages(256))) {
      sTimeUpdateHandler.sendEmptyMessage(256);
    }
  }
  
  public void onActivityPause(Activity paramActivity) {}
  
  public void onActivityStarted(Activity paramActivity)
  {
    b.i("Matrix.MethodBeat", "[onActivityStarted]: %s", new Object[] { paramActivity.getClass().getSimpleName() });
    if ((isBackground) && (!sTimeUpdateHandler.hasMessages(256))) {
      sTimeUpdateHandler.sendEmptyMessage(256);
    }
  }
  
  public void onBackground(Activity paramActivity)
  {
    b.i("Matrix.MethodBeat", "[onBackground]: %s", new Object[] { paramActivity.getClass().getSimpleName() });
    sTimeUpdateHandler.removeMessages(256);
    isBackground = true;
  }
  
  public void onChange(Activity paramActivity, Fragment paramFragment) {}
  
  public void onCreate()
  {
    b.i("Matrix.MethodBeat", "[onCreate]", new Object[0]);
    if (!isCreated)
    {
      sTimeUpdateHandler.removeMessages(512);
      a.tE().a(this);
      isCreated = true;
      if ((sBuffer != null) && (sBuffer.length < 1000000))
      {
        long[] arrayOfLong = sBuffer;
        sBuffer = new long[1000000];
        System.arraycopy(arrayOfLong, 0, sBuffer, 0, sIndex);
      }
    }
    else
    {
      return;
    }
    sBuffer = new long[1000000];
  }
  
  public void onDestroy()
  {
    b.i("Matrix.MethodBeat", "[onDestroy]", new Object[0]);
    if (isCreated)
    {
      sListener = null;
      isCreated = false;
      sIndex = 0;
      sBuffer = null;
      sTimeUpdateHandler.removeMessages(256);
      sTimeUpdateHandler.removeMessages(512);
      sTimerUpdateThread.quit();
      a.tE().b(this);
    }
  }
  
  public void onFront(Activity paramActivity)
  {
    b.i("Matrix.MethodBeat", "[onFront]: %s", new Object[] { paramActivity.getClass().getSimpleName() });
    if (!sTimeUpdateHandler.hasMessages(256)) {
      sTimeUpdateHandler.sendEmptyMessage(256);
    }
    isBackground = false;
    reset();
  }
  
  public void registerListener(d paramd)
  {
    sListener = paramd;
  }
  
  public void reset()
  {
    sIndex = 0;
  }
  
  public void unregisterListener(d paramd)
  {
    sListener = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/trace/core/MethodBeat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */