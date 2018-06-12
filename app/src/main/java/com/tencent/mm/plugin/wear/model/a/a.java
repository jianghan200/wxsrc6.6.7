package com.tencent.mm.plugin.wear.model.a;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.support.v4.app.t;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.c.au;
import com.google.android.gms.c.au.a;
import com.google.android.gms.c.av;
import com.google.android.gms.c.be;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.a;
import com.google.android.gms.common.api.c.a;
import com.google.android.gms.common.api.c.a.1;
import com.google.android.gms.common.api.c.c;
import com.google.android.gms.common.api.u;
import com.google.android.gms.common.api.v;
import com.google.android.gms.common.api.v.a;
import com.google.android.gms.common.api.v.b;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.c.d;
import com.google.android.gms.wearable.f;
import com.google.android.gms.wearable.i;
import com.google.android.gms.wearable.k;
import com.google.android.gms.wearable.k.b;
import com.google.android.gms.wearable.m;
import com.google.android.gms.wearable.n;
import com.google.android.gms.wearable.n.a;
import com.google.android.gms.wearable.p;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class a
  implements b
{
  private com.google.android.gms.common.api.c pJK;
  
  public a()
  {
    c.a locala = new c.a(ad.getContext());
    Object localObject2 = p.baY;
    locala.aJZ.put(localObject2, null);
    locala.aJT.addAll(((com.google.android.gms.common.api.a)localObject2).or().ot());
    boolean bool1;
    if (!locala.aJZ.isEmpty())
    {
      bool1 = true;
      w.e(bool1, "must call addApi() to add at least one API");
      if (locala.aKb < 0) {
        break label215;
      }
      localObject2 = new com.google.android.gms.common.api.o(locala.mContext.getApplicationContext(), locala.aKe, locala.oB(), locala.aKf, locala.aKg, locala.aJZ, locala.aKh, locala.aKi, locala.aKb, -1);
      localObject1 = u.a(locala.aKa);
      if (localObject1 != null) {
        break label203;
      }
      new Handler(locala.mContext.getMainLooper()).post(new c.a.1(locala, (com.google.android.gms.common.api.c)localObject2));
    }
    for (;;)
    {
      this.pJK = ((com.google.android.gms.common.api.c)localObject2);
      return;
      bool1 = false;
      break;
      label203:
      locala.a((u)localObject1, (com.google.android.gms.common.api.c)localObject2);
      continue;
      label215:
      if (locala.aKc >= 0)
      {
        v localv = v.c(locala.aKa);
        int i = locala.aKc;
        localObject2 = localObject1;
        if (localv.getActivity() != null)
        {
          v.a locala1 = localv.dp(i);
          localObject2 = localObject1;
          if (locala1 != null) {
            localObject2 = locala1.aLT;
          }
        }
        localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = new com.google.android.gms.common.api.o(locala.mContext.getApplicationContext(), locala.aKe, locala.oB(), locala.aKf, locala.aKg, locala.aJZ, locala.aKh, locala.aKi, -1, locala.aKc);
        }
        i = locala.aKc;
        localObject2 = locala.aKd;
        w.j(localObject1, "GoogleApiClient instance cannot be null");
        if (localv.aLR.indexOfKey(i) < 0) {}
        for (bool1 = bool2;; bool1 = false)
        {
          w.d(bool1, "Already managing a GoogleApiClient with id " + i);
          localObject2 = new v.b((com.google.android.gms.common.api.c)localObject1, (c.c)localObject2, (byte)0);
          localv.aLR.put(i, localObject2);
          localObject2 = localObject1;
          if (localv.getActivity() == null) {
            break;
          }
          android.support.v4.app.u.DEBUG = false;
          localv.getLoaderManager().a(i, localv);
          localObject2 = localObject1;
          break;
        }
      }
      localObject2 = new com.google.android.gms.common.api.o(locala.mContext, locala.aKe, locala.oB(), locala.aKf, locala.aKg, locala.aJZ, locala.aKh, locala.aKi, -1, -1);
    }
  }
  
  public final byte[] a(Asset paramAsset)
  {
    paramAsset = (c.d)p.bdt.a(bSu(), paramAsset).oE();
    Status localStatus = paramAsset.oF();
    if (!localStatus.isSuccess())
    {
      x.e("MicroMsg.Wear.GlobalConnection", "read asset data not success errorCode=%d | errorMsg=%s", new Object[] { Integer.valueOf(localStatus.aJC), localStatus.aKu });
      return null;
    }
    return com.tencent.mm.a.e.g(paramAsset.getInputStream());
  }
  
  public final void bSt()
  {
    this.pJK.disconnect();
    bSu();
  }
  
  public final com.google.android.gms.common.api.c bSu()
  {
    if (!this.pJK.isConnected())
    {
      x.i("MicroMsg.Wear.GlobalConnection", "connect to google api client");
      ConnectionResult localConnectionResult = this.pJK.a(TimeUnit.SECONDS);
      if (!localConnectionResult.isSuccess()) {
        x.e("MicroMsg.Wear.GlobalConnection", "google api client connect error, code=%d, ", new Object[] { Integer.valueOf(localConnectionResult.aJC) });
      }
    }
    return this.pJK;
  }
  
  public final HashSet<String> bSv()
  {
    HashSet localHashSet = new HashSet();
    Object localObject = (n.a)p.bdw.b(bSu()).oE();
    if (localObject != null)
    {
      localObject = ((n.a)localObject).rS().iterator();
      while (((Iterator)localObject).hasNext()) {
        localHashSet.add(((m)((Iterator)localObject).next()).getId());
      }
    }
    return localHashSet;
  }
  
  public final boolean bSw()
  {
    if (!bSu().isConnected()) {}
    while (bSv().size() == 0) {
      return false;
    }
    return true;
  }
  
  public final void bSx()
  {
    com.google.android.gms.wearable.h localh = (com.google.android.gms.wearable.h)p.bdt.a(bSu()).oE();
    Iterator localIterator = localh.iterator();
    while (localIterator.hasNext())
    {
      f localf = (f)localIterator.next();
      String str = localf.getUri().toString();
      if (str.startsWith("/wechat"))
      {
        x.i("MicroMsg.Wear.GlobalConnection", "delete data item %s", new Object[] { str });
        p.bdt.b(bSu(), localf.getUri());
      }
    }
    localh.release();
  }
  
  public final void finish()
  {
    this.pJK.disconnect();
  }
  
  public final boolean i(Uri paramUri)
  {
    p.bdt.b(bSu(), paramUri);
    x.i("MicroMsg.Wear.GlobalConnection", "delete data item %s", new Object[] { paramUri });
    return true;
  }
  
  public final boolean isAvailable()
  {
    return (com.tencent.mm.plugin.wear.model.h.aEp()) || (com.tencent.mm.plugin.wear.model.h.aEo());
  }
  
  public final b.a t(String paramString, byte[] paramArrayOfByte)
  {
    Object localObject = bSv();
    b.a locala = new b.a();
    Iterator localIterator = ((HashSet)localObject).iterator();
    if (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!bSu().isConnected())
      {
        localObject = new b.a((byte)0);
        label66:
        if (((b.a)localObject).code != 0) {
          return (b.a)localObject;
        }
      }
      else
      {
        localObject = new b.a();
        Status localStatus = ((k.b)p.bdv.a(bSu(), str, paramString, paramArrayOfByte).b(TimeUnit.SECONDS)).oF();
        if (!localStatus.isSuccess())
        {
          ((b.a)localObject).code = 131072;
          ((b.a)localObject).Yy = localStatus.aKu;
          x.e("MicroMsg.Wear.GlobalConnection", "send message not success errorCode=%d | errorMsg=%s", new Object[] { Integer.valueOf(localStatus.aJC), localStatus.aKu });
        }
        if (paramArrayOfByte != null) {
          break label216;
        }
      }
      label216:
      for (int i = 0;; i = paramArrayOfByte.length)
      {
        x.d("MicroMsg.Wear.GlobalConnection", "send Message %s %s %d", new Object[] { str, paramString, Integer.valueOf(i) });
        break label66;
        break;
      }
    }
    return locala;
  }
  
  public final b.a u(String paramString, byte[] paramArrayOfByte)
  {
    if (!bSu().isConnected()) {
      return new b.a((byte)0);
    }
    paramString = new com.google.android.gms.wearable.o(PutDataRequest.bD(paramString));
    paramString.bdp.putLong("key_timestamp", System.currentTimeMillis());
    paramString.bdp.a("key_data", Asset.o(paramArrayOfByte));
    paramArrayOfByte = paramString.bdp;
    Object localObject1 = new av();
    Object localObject2 = new ArrayList();
    ((av)localObject1).aZv = au.a(paramArrayOfByte, (List)localObject2);
    paramArrayOfByte = new au.a((av)localObject1, (List)localObject2);
    paramString.bdq.bdf = be.c(paramArrayOfByte.aZt);
    int j = paramArrayOfByte.aZu.size();
    int i = 0;
    while (i < j)
    {
      localObject1 = Integer.toString(i);
      localObject2 = (Asset)paramArrayOfByte.aZu.get(i);
      if (localObject1 == null) {
        throw new IllegalStateException("asset key cannot be null: " + localObject2);
      }
      if (localObject2 == null) {
        throw new IllegalStateException("asset cannot be null: key=" + (String)localObject1);
      }
      if (Log.isLoggable("DataMap", 3)) {
        new StringBuilder("asPutDataRequest: adding asset: ").append((String)localObject1).append(" ").append(localObject2);
      }
      paramString.bdq.b((String)localObject1, (Asset)localObject2);
      i += 1;
    }
    paramString = paramString.bdq;
    p.bdt.a(bSu(), paramString);
    x.d("MicroMsg.Wear.GlobalConnection", "send data request path=%s | length=%d", new Object[] { paramString.aMJ.getPath(), Integer.valueOf(paramString.bdf.length) });
    return new b.a();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wear/model/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */