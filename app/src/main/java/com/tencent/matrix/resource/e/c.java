package com.tencent.matrix.resource.e;

import android.content.Context;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import android.view.LayoutInflater;
import android.widget.Toast;
import com.tencent.matrix.d.b;
import com.tencent.matrix.resource.b.a;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class c
{
  private final d bsu;
  final Context mContext;
  private final Handler mMainHandler;
  
  public c(Context paramContext, d paramd)
  {
    this(paramContext, paramd, new Handler(Looper.getMainLooper()));
  }
  
  private c(Context paramContext, d paramd, Handler paramHandler)
  {
    this.mContext = paramContext;
    this.bsu = paramd;
    this.mMainHandler = paramHandler;
  }
  
  public final File tC()
  {
    File localFile = this.bsu.tD();
    if (localFile == null) {}
    for (localFile = null; localFile == null; localFile = new File(localFile, "dump_" + Long.toHexString(((UUID)localObject).getMostSignificantBits()) + Long.toHexString(((UUID)localObject).getLeastSignificantBits()) + ".hprof"))
    {
      b.w("Matrix.AndroidHeapDumper", "hprof file is null.", new Object[0]);
      return null;
      localObject = UUID.randomUUID();
    }
    if (!localFile.getParentFile().canWrite())
    {
      b.w("Matrix.AndroidHeapDumper", "hprof file path: %s cannot be written.", new Object[] { localFile.getAbsolutePath() });
      return null;
    }
    final Object localObject = new com.tencent.matrix.resource.d.a.a();
    this.mMainHandler.post(new Runnable()
    {
      public final void run()
      {
        final Toast localToast = new Toast(c.this.mContext);
        localToast.setDuration(1);
        localToast.setGravity(16, 0, 0);
        localToast.setView(LayoutInflater.from(c.this.mContext).inflate(b.a.resource_canary_toast_wait_for_heapdump, null));
        localToast.show();
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler()
        {
          public final boolean queueIdle()
          {
            com.tencent.matrix.resource.d.a.a locala = c.1.this.bsE;
            Toast localToast = localToast;
            locala.bsq.set(localToast);
            locala.bsr.countDown();
            return false;
          }
        });
      }
    });
    if (!((com.tencent.matrix.resource.d.a.a)localObject).c(TimeUnit.SECONDS))
    {
      b.w("Matrix.AndroidHeapDumper", "give up dumping heap, waiting for toast too long.", new Object[0]);
      return null;
    }
    try
    {
      Debug.dumpHprofData(localFile.getAbsolutePath());
      if (((com.tencent.matrix.resource.d.a.a)localObject).bsr.getCount() > 0L) {
        throw new IllegalStateException("Call wait() and check its result");
      }
    }
    catch (IOException localIOException)
    {
      b.printErrStackTrace("Matrix.AndroidHeapDumper", localIOException, "failed to dump heap into file: %s.", new Object[] { localFile.getAbsolutePath() });
      return null;
    }
    final Toast localToast = (Toast)localIOException.bsq.get();
    this.mMainHandler.post(new Runnable()
    {
      public final void run()
      {
        localToast.cancel();
      }
    });
    return localFile;
  }
  
  public static abstract interface a
  {
    public abstract void a(com.tencent.matrix.resource.analyzer.model.a parama);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/resource/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */