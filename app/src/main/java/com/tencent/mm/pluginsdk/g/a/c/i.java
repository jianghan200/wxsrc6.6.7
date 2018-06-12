package com.tencent.mm.pluginsdk.g.a.c;

import android.util.SparseArray;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.List;

public final class i
  implements c
{
  private final ag qCY;
  public final SparseArray<List<d>> qCZ;
  public final Object qDa;
  
  i(ag paramag)
  {
    this.qCY = paramag;
    this.qCZ = new SparseArray();
    this.qDa = new Object();
  }
  
  private List<d> Tm(String arg1)
  {
    int i = ???.hashCode();
    synchronized (this.qDa)
    {
      List localList = (List)this.qCZ.get(i);
      return localList;
    }
  }
  
  public final void a(e parame, m paramm)
  {
    x.i("MicroMsg.ResDownloader.NetworkEventDispatcher", "dispatchResponse, response = " + paramm);
    switch (paramm.status)
    {
    }
    Object localObject;
    do
    {
      do
      {
        return;
        localObject = q.a.ccH().Tn(paramm.qBy);
        if (localObject != null)
        {
          ((s)localObject).field_status = 4;
          q.a.ccH().g((s)localObject);
        }
        localObject = Tm(parame.aca());
      } while (bi.cX((List)localObject));
      parame = parame.cco();
      this.qCY.post(new i.3(this, (List)localObject, paramm, parame));
      return;
      localObject = q.a.ccH().Tn(paramm.qBy);
      if (localObject != null)
      {
        ((s)localObject).field_status = 2;
        q.a.ccH().g((s)localObject);
      }
      x.d("MicroMsg.ResDownloader.NetworkEventDispatcher", "dispatchComplete, groupId = " + parame.aca());
      localObject = Tm(parame.aca());
      if (bi.cX((List)localObject))
      {
        x.d("MicroMsg.ResDownloader.NetworkEventDispatcher", "dispatchComplete, listeners.size = null");
        return;
      }
      x.d("MicroMsg.ResDownloader.NetworkEventDispatcher", "dispatchComplete, listeners.size = " + ((List)localObject).size());
      parame = parame.cco();
      this.qCY.post(new i.2(this, (List)localObject, paramm, parame));
      return;
      localObject = q.a.ccH().Tn(paramm.qBy);
      if (localObject != null)
      {
        ((s)localObject).field_status = 3;
        q.a.ccH().g((s)localObject);
      }
      localObject = Tm(parame.aca());
    } while (bi.cX((List)localObject));
    parame = parame.cco();
    this.qCY.post(new i.1(this, (List)localObject, paramm, parame));
  }
  
  public final void a(String paramString, k paramk) {}
  
  public final void s(String paramString, int paramInt1, int paramInt2)
  {
    x.i("MicroMsg.ResDownloader.NetworkEventDispatcher", "dispatchRetry, urlKey = %s, max = %d, count = %d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    paramString = q.a.ccH().Tn(paramString);
    if (paramString != null)
    {
      paramString.field_maxRetryTimes = paramInt1;
      paramString.field_retryTimes = paramInt2;
      q.a.ccH().g(paramString);
    }
  }
  
  public final void t(String paramString, long paramLong)
  {
    paramString = q.a.ccH().Tn(paramString);
    if (paramString != null)
    {
      paramString.field_contentLength = paramLong;
      q.a.ccH().g(paramString);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/g/a/c/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */