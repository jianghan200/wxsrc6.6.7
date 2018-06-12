package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.tencent.mm.k.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.q;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.s;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class f
{
  private static f nIy = new f();
  ConcurrentLinkedQueue<String> nIx = new ConcurrentLinkedQueue();
  
  private boolean Ng(String paramString)
  {
    return this.nIx.contains(paramString);
  }
  
  private void Nh(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    while (Ng(paramString)) {
      return;
    }
    this.nIx.add(paramString);
    d.b("adId", paramString, true, 0, new f.9(this, paramString));
  }
  
  private void a(String paramString, s params)
  {
    Object localObject;
    if (params.nAX == 101)
    {
      params = ((n)params).nAH.iterator();
      while (params.hasNext())
      {
        localObject = ((m)params.next()).nAH.iterator();
        while (((Iterator)localObject).hasNext()) {
          a(paramString, (s)((Iterator)localObject).next());
        }
      }
    }
    if (params.nAX == 41)
    {
      localObject = (p)params;
      if (!Ng(((p)localObject).nAL)) {}
    }
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            this.nIx.add(((p)localObject).nAL);
            d.b(paramString, ((p)localObject).nAL, true, params.nAX, new f.1(this, (p)localObject));
            return;
            if (params.nAX != 44) {
              break;
            }
            localObject = (o)params;
          } while (Ng(((o)localObject).nAL));
          this.nIx.add(((o)localObject).nAL);
          d.b(paramString, ((o)localObject).nAL, true, params.nAX, new f.3(this, (o)localObject));
          return;
          if (params.nAX != 45) {
            break;
          }
          localObject = (p)params;
        } while (Ng(((p)localObject).nAL));
        this.nIx.add(((p)localObject).nAL);
        d.b(paramString, ((p)localObject).nAL, true, params.nAX, new f.4(this, (p)localObject));
        return;
        if (params.nAX != 61) {
          break;
        }
        params = (q)params;
        if (!Ng(params.nAN))
        {
          localObject = new PInt();
          PInt localPInt = new PInt();
          com.tencent.mm.modelcontrol.c.NM();
          if (com.tencent.mm.modelcontrol.c.a((PInt)localObject, localPInt))
          {
            this.nIx.add(params.nAN);
            d.c(paramString, params.nAN, true, 61, new f.5(this, params));
          }
        }
      } while (Ng(params.nAO));
      this.nIx.add(params.nAO);
      d.b(paramString, params.nAO, true, 1000000001, new f.6(this, params));
      return;
    } while (params.nAX != 62);
    if (g.AT().getInt("SnsAdNativePagePreloadStreamMedia", 0) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      x.i("AdLandingPagesPreDownloadResHelper", "pre down video value: " + bool);
      localObject = (w)params;
      if ((bool) && (!Ng(((w)localObject).nAP)))
      {
        this.nIx.add(((w)localObject).nAP);
        d.a(paramString, ((w)localObject).nAP, true, params.nAX, new f.7(this, (w)localObject));
      }
      if (Ng(((w)localObject).nBz)) {
        break;
      }
      this.nIx.add(((w)localObject).nBz);
      d.b("adId", ((w)localObject).nBz, true, params.nAX, new f.8(this, (w)localObject));
      return;
    }
  }
  
  public static f bAB()
  {
    return nIy;
  }
  
  public final void e(final String paramString1, String paramString2, String paramString3, int paramInt)
  {
    Object localObject = ((ConnectivityManager)ad.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
    paramString2 = e.p(paramString2, paramString3, "", "");
    int i;
    if (paramInt == 0)
    {
      if ((localObject != null) && (((NetworkInfo)localObject).getType() == 1))
      {
        x.i("AdLandingPagesPreDownloadResHelper", "start pre download all resource in wifi");
        paramString2 = paramString2.iterator();
      }
      while (paramString2.hasNext())
      {
        paramString3 = (c)paramString2.next();
        localObject = paramString3.nIi.iterator();
        while (((Iterator)localObject).hasNext()) {
          a(paramString1, (s)((Iterator)localObject).next());
        }
        Nh(paramString3.nIg);
        continue;
        x.i("AdLandingPagesPreDownloadResHelper", "start pre download resource in no wifi");
        i = g.AT().getInt("SnsAdNativePageNormalFeedPreloadPageCount", 1);
        paramInt = g.AT().getInt("SnsAdNativePageNormalFeedPreloadResourceCount", 2);
        if (paramString2.size() > 0)
        {
          paramString2 = paramString2.iterator();
          if (paramString2.hasNext())
          {
            paramString3 = (c)paramString2.next();
            Nh(paramString3.nIg);
            if ((paramInt > 0) && (i > 0))
            {
              paramString3 = paramString3.nIi.iterator();
              label213:
              if (!paramString3.hasNext()) {
                break label489;
              }
              ah.A(new Runnable()
              {
                public final void run()
                {
                  f.a(f.this, paramString1, this.nIB);
                }
              });
              paramInt -= 1;
              if (paramInt > 0) {
                break label486;
              }
            }
          }
        }
      }
    }
    label380:
    label479:
    label480:
    label483:
    label486:
    label489:
    for (;;)
    {
      i -= 1;
      break;
      if (paramInt == 1)
      {
        x.i("AdLandingPagesPreDownloadResHelper", "start pre download first pages resource");
        if ((localObject != null) && (((NetworkInfo)localObject).getType() == 1))
        {
          x.i("AdLandingPagesPreDownloadResHelper", "start pre download resource in shared scene in wifi");
          i = g.AT().getInt("SnsAdNativePageForwardFeedPreloadPageCount", 1);
          paramInt = g.AT().getInt("SnsAdNativePageForwardFeedPreloadResourceCount", 2);
          if (paramString2.size() <= 0) {
            break label479;
          }
          paramString2 = paramString2.iterator();
          if (!paramString2.hasNext()) {
            break label479;
          }
          paramString3 = (c)paramString2.next();
          Nh(paramString3.nIg);
          if ((paramInt <= 0) || (i <= 0)) {
            break label479;
          }
          paramString3 = paramString3.nIi.iterator();
          if (!paramString3.hasNext()) {
            break label483;
          }
          ah.A(new f.2(this, paramString1, (s)paramString3.next()));
          paramInt -= 1;
          if (paramInt > 0) {
            break label480;
          }
        }
      }
      for (;;)
      {
        i -= 1;
        break;
        x.i("AdLandingPagesPreDownloadResHelper", "start pre download resource in shared scene in no wifi,this can't download everything");
        paramString1 = paramString2.iterator();
        while (paramString1.hasNext())
        {
          Nh(((c)paramString1.next()).nIg);
          continue;
          x.e("AdLandingPagesPreDownloadResHelper", "the dwnloadKind is error");
        }
        return;
        break label380;
      }
      break label213;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */