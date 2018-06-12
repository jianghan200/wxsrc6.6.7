package com.tencent.matrix.resource.e;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.Debug;
import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.matrix.resource.CanaryWorkerService;
import com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  extends com.tencent.matrix.c.a
{
  final int brw;
  public final e.a bsA = new e.a()
  {
    public final int tB()
    {
      if (Debug.isDebuggerConnected())
      {
        com.tencent.matrix.d.b.w("Matrix.ActivityRefWatcher", "debugger is connected, to avoid fake result, detection was delayed.", new Object[0]);
        return e.a.a.bsQ;
      }
      if (b.this.bsx.isEmpty()) {
        return e.a.a.bsQ;
      }
      Object localObject1 = new WeakReference(new Object());
      com.tencent.matrix.d.b.v("Matrix.ActivityRefWatcher", "triggering gc...", new Object[0]);
      Runtime.getRuntime().gc();
      Runtime.getRuntime().runFinalization();
      com.tencent.matrix.d.b.v("Matrix.ActivityRefWatcher", "gc was triggered.", new Object[0]);
      if (((WeakReference)localObject1).get() != null)
      {
        com.tencent.matrix.d.b.d("Matrix.ActivityRefWatcher", "system ignore our gc request, wait for next detection.", new Object[0]);
        return e.a.a.bsQ;
      }
      localObject1 = b.this.bsx.iterator();
      for (;;)
      {
        if (((Iterator)localObject1).hasNext())
        {
          Object localObject2 = (DestroyedActivityInfo)((Iterator)localObject1).next();
          if (b.this.cb(((DestroyedActivityInfo)localObject2).mActivityName))
          {
            com.tencent.matrix.d.b.v("Matrix.ActivityRefWatcher", "activity with key [%s] was already published.", new Object[] { ((DestroyedActivityInfo)localObject2).mActivityName });
            ((Iterator)localObject1).remove();
            continue;
          }
          if (((DestroyedActivityInfo)localObject2).mActivityRef.get() == null)
          {
            com.tencent.matrix.d.b.v("Matrix.ActivityRefWatcher", "activity with key [%s] was already recycled.", new Object[] { ((DestroyedActivityInfo)localObject2).mKey });
            ((Iterator)localObject1).remove();
            continue;
          }
          ((DestroyedActivityInfo)localObject2).mDetectedCount += 1;
          long l = b.this.bsy.get() - ((DestroyedActivityInfo)localObject2).mLastCreatedActivityCount;
          if ((((DestroyedActivityInfo)localObject2).mDetectedCount < b.this.brw) || (l < 2L))
          {
            com.tencent.matrix.d.b.i("Matrix.ActivityRefWatcher", "activity with key [%s] should be recycled but actually still \nexists in %s times detection with %s created activities during destroy, wait for next detection to confirm.", new Object[] { ((DestroyedActivityInfo)localObject2).mKey, Integer.valueOf(((DestroyedActivityInfo)localObject2).mDetectedCount), Long.valueOf(l) });
            continue;
          }
          com.tencent.matrix.d.b.i("Matrix.ActivityRefWatcher", "activity with key [%s] was suspected to be a leaked instance.", new Object[] { ((DestroyedActivityInfo)localObject2).mKey });
          if (b.this.bsv != null)
          {
            localObject3 = b.this.bsv.tC();
            if (localObject3 != null)
            {
              b.this.ca(((DestroyedActivityInfo)localObject2).mActivityName);
              localObject2 = new com.tencent.matrix.resource.analyzer.model.a((File)localObject3, ((DestroyedActivityInfo)localObject2).mKey, ((DestroyedActivityInfo)localObject2).mActivityName);
              b.this.bsw.a((com.tencent.matrix.resource.analyzer.model.a)localObject2);
              ((Iterator)localObject1).remove();
              continue;
            }
            com.tencent.matrix.d.b.i("Matrix.ActivityRefWatcher", "heap dump for further analyzing activity with key [%s] was failed, just ignore.", new Object[] { ((DestroyedActivityInfo)localObject2).mKey });
            ((Iterator)localObject1).remove();
            continue;
          }
          com.tencent.matrix.d.b.i("Matrix.ActivityRefWatcher", "lightweight mode, just report leaked activity name.", new Object[0]);
          b.this.ca(((DestroyedActivityInfo)localObject2).mActivityName);
          if (b.this.bss == null) {
            continue;
          }
          Object localObject3 = new JSONObject();
          try
          {
            ((JSONObject)localObject3).put("activity", ((DestroyedActivityInfo)localObject2).mActivityName);
            b.this.bss.a(new com.tencent.matrix.c.b((JSONObject)localObject3));
          }
          catch (JSONException localJSONException)
          {
            for (;;)
            {
              com.tencent.matrix.d.b.printErrStackTrace("Matrix.ActivityRefWatcher", localJSONException, "unexpected exception.", new Object[0]);
            }
          }
        }
      }
      return e.a.a.bsQ;
    }
  };
  public final com.tencent.matrix.resource.c bss;
  public final e bst;
  private final d bsu;
  final c bsv;
  final c.a bsw;
  final ConcurrentLinkedQueue<DestroyedActivityInfo> bsx;
  final AtomicLong bsy;
  public final Application.ActivityLifecycleCallbacks bsz = new a()
  {
    public final void onActivityCreated(Activity paramAnonymousActivity, Bundle paramAnonymousBundle)
    {
      b.this.bsy.incrementAndGet();
    }
    
    public final void onActivityDestroyed(Activity paramAnonymousActivity)
    {
      b localb = b.this;
      String str = paramAnonymousActivity.getClass().getName();
      if (localb.cb(str))
      {
        com.tencent.matrix.d.b.d("Matrix.ActivityRefWatcher", "activity leak with name %s had published, just ignore", new Object[] { str });
        return;
      }
      UUID localUUID = UUID.randomUUID();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("MATRIX_RESCANARY_REFKEY_").append(str).append('_').append(Long.toHexString(localUUID.getMostSignificantBits())).append(Long.toHexString(localUUID.getLeastSignificantBits()));
      paramAnonymousActivity = new DestroyedActivityInfo(localStringBuilder.toString(), paramAnonymousActivity, str, localb.bsy.get());
      localb.bsx.add(paramAnonymousActivity);
    }
  };
  
  public b(Application paramApplication, com.tencent.matrix.resource.c paramc)
  {
    this(paramApplication, paramc, new a()
    {
      protected final c.a a(Context paramAnonymousContext, com.tencent.matrix.resource.b.a paramAnonymousa)
      {
        if (paramAnonymousa.brx) {
          return super.a(paramAnonymousContext, paramAnonymousa);
        }
        return null;
      }
      
      protected final c a(Context paramAnonymousContext, d paramAnonymousd)
      {
        if (b.this.brq.brx) {
          return super.a(paramAnonymousContext, paramAnonymousd);
        }
        return null;
      }
      
      protected final d az(Context paramAnonymousContext)
      {
        if (b.this.brq.brx) {
          return super.az(paramAnonymousContext);
        }
        return null;
      }
    });
  }
  
  private b(Application paramApplication, com.tencent.matrix.resource.c paramc, a parama)
  {
    super(paramApplication, "memory", paramc);
    this.bss = paramc;
    paramc = paramc.brq;
    HandlerThread localHandlerThread = com.tencent.matrix.d.a.tJ();
    this.bst = new e(paramc.brv, localHandlerThread);
    this.brw = paramc.brw;
    this.bsu = parama.az(paramApplication);
    this.bsv = parama.a(paramApplication, this.bsu);
    this.bsw = parama.a(paramApplication, paramc);
    this.bsx = new ConcurrentLinkedQueue();
    this.bsy = new AtomicLong(0L);
  }
  
  public final void tA()
  {
    Object localObject = this.bss.application;
    if (localObject != null)
    {
      ((Application)localObject).unregisterActivityLifecycleCallbacks(this.bsz);
      localObject = this.bst;
      ((e)localObject).bsK.removeCallbacksAndMessages(null);
      ((e)localObject).mMainHandler.removeCallbacksAndMessages(null);
      this.bsx.clear();
      this.bsy.set(0L);
    }
  }
  
  public static class a
  {
    protected c.a a(final Context paramContext, com.tencent.matrix.resource.b.a parama)
    {
      new c.a()
      {
        public final void a(com.tencent.matrix.resource.analyzer.model.a paramAnonymousa)
        {
          CanaryWorkerService.a(paramContext, paramAnonymousa);
        }
      };
    }
    
    protected c a(Context paramContext, d paramd)
    {
      return new c(paramContext, paramd);
    }
    
    protected d az(Context paramContext)
    {
      return new d(paramContext);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/resource/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */