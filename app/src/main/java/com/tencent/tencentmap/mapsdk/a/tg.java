package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class tg
  implements tp.a
{
  private static final TimeUnit a = TimeUnit.SECONDS;
  private static final int b = Runtime.getRuntime().availableProcessors();
  private sl c;
  private Map<String, List<td>> d = new HashMap();
  private Map<String, List<td>> e = new HashMap();
  private final BlockingQueue<Runnable> f = new LinkedBlockingQueue();
  private final BlockingQueue<Runnable> g = new LinkedBlockingQueue();
  private ExecutorService h;
  private ExecutorService i;
  private ThreadFactory j = new tg.1(this);
  
  public tg(sl paramsl)
  {
    this.c = paramsl;
    int m;
    if (b < 4) {
      m = 3;
    }
    for (int k = 3;; k = 4)
    {
      this.i = new ThreadPoolExecutor(k, m, 30L, TimeUnit.SECONDS, this.g, this.j);
      this.h = new ThreadPoolExecutor(1, 1, 30L, a, this.f);
      return;
      m = 4;
    }
  }
  
  public final void a()
  {
    if (this.f != null) {
      this.f.clear();
    }
    if (this.g != null) {
      this.g.clear();
    }
    if (this.h != null)
    {
      this.h.shutdownNow();
      this.h = null;
    }
    if (this.i != null)
    {
      this.i.shutdown();
      this.i = null;
    }
  }
  
  public final void a(tp paramtp)
  {
    if (paramtp != null)
    {
      Object localObject2 = paramtp.b();
      Bitmap localBitmap = paramtp.a();
      synchronized (this.d)
      {
        List localList = (List)this.e.remove(localObject2);
        this.d.remove(localObject2);
        if ((localList != null) && (localBitmap != null) && (!localBitmap.isRecycled()))
        {
          ??? = localList.iterator();
          while (((Iterator)???).hasNext())
          {
            localObject2 = (td)((Iterator)???).next();
            if (!((td)localObject2).i()) {
              ((td)localObject2).a(localBitmap.copy(localBitmap.getConfig(), false));
            }
          }
        }
      }
    }
    this.c.c().postInvalidate();
  }
  
  public final void a(ArrayList<tc> paramArrayList)
  {
    if (sz.a(paramArrayList)) {}
    for (;;)
    {
      return;
      this.f.clear();
      paramArrayList = new tg.2(this, paramArrayList);
      try
      {
        if (!this.h.isShutdown())
        {
          this.h.execute(paramArrayList);
          return;
        }
      }
      catch (Exception paramArrayList)
      {
        new StringBuilder("getTiles get error:").append(paramArrayList.getMessage());
      }
    }
  }
  
  public final void b(tp arg1)
  {
    String str;
    if (??? != null) {
      str = ???.b();
    }
    synchronized (this.d)
    {
      List localList = (List)this.d.remove(str);
      this.e.put(str, localList);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/tg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */