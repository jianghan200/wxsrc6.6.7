package com.tencent.mm.ak.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.widget.ImageView;
import com.tencent.mm.ak.a.c.e;
import com.tencent.mm.ak.a.c.g;
import com.tencent.mm.ak.a.c.i;
import com.tencent.mm.ak.a.c.j;
import com.tencent.mm.ak.a.c.l;
import com.tencent.mm.ak.a.c.m;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class a
{
  private static a dWR = null;
  public b dWO;
  private com.tencent.mm.ak.a.a.b dWP;
  private final i dWQ = new com.tencent.mm.ak.a.b.h();
  
  public a(Context paramContext)
  {
    a(com.tencent.mm.ak.a.a.b.bN(paramContext));
  }
  
  public a(com.tencent.mm.ak.a.a.b paramb)
  {
    a(paramb);
  }
  
  public static a Pq()
  {
    try
    {
      if (dWR == null) {
        dWR = new a(ad.getContext());
      }
      a locala = dWR;
      return locala;
    }
    finally {}
  }
  
  private void a(ImageView paramImageView, com.tencent.mm.ak.a.a.c paramc)
  {
    if ((paramImageView == null) || (paramc == null)) {
      x.w("MicroMsg.imageloader.ImageLoader", "[cpan] should show default image view or options is null.");
    }
    label80:
    label88:
    do
    {
      return;
      int i;
      Resources localResources;
      if ((paramc.dXN > 0) || (paramc.dXO != null))
      {
        i = 1;
        if (i == 0) {
          continue;
        }
        if (paramc.dXN != 0) {
          break label88;
        }
        localResources = this.dWP.dXh;
        if (paramc.dXN == 0) {
          break label80;
        }
      }
      for (paramc = localResources.getDrawable(paramc.dXN);; paramc = paramc.dXO)
      {
        paramImageView.setImageDrawable(paramc);
        return;
        i = 0;
        break;
      }
      paramImageView.setImageResource(paramc.dXN);
      return;
    } while (!paramc.dXV);
    paramImageView.setImageDrawable(null);
  }
  
  private void a(com.tencent.mm.ak.a.a.b paramb)
  {
    if (paramb == null) {
      try
      {
        throw new IllegalArgumentException("[cpan] image loader configuration is null.");
      }
      finally {}
    }
    if (this.dWP == null)
    {
      this.dWO = new b(paramb);
      this.dWP = paramb;
    }
    for (;;)
    {
      return;
      x.w("MicroMsg.imageloader.ImageLoader", "[cpan] image loader had init.");
    }
  }
  
  public final void a(String paramString, ImageView paramImageView)
  {
    a(paramString, paramImageView, null, null, null, null, null, null, null);
  }
  
  public final void a(String paramString, ImageView paramImageView, com.tencent.mm.ak.a.a.c paramc)
  {
    a(paramString, paramImageView, paramc, null, null, null, null, null, null);
  }
  
  public final void a(String paramString, ImageView paramImageView, com.tencent.mm.ak.a.a.c paramc, e parame, com.tencent.mm.ak.a.c.d paramd, l paraml)
  {
    a(paramString, paramImageView, paramc, null, null, null, parame, paramd, paraml);
  }
  
  public final void a(String paramString, ImageView paramImageView, com.tencent.mm.ak.a.a.c paramc, g paramg)
  {
    a(paramString, paramImageView, paramc, null, null, paramg, null, null, null);
  }
  
  public final void a(String paramString, ImageView paramImageView, com.tencent.mm.ak.a.a.c paramc, i parami)
  {
    a(paramString, paramImageView, paramc, parami, null, null, null, null, null);
  }
  
  public final void a(String paramString, ImageView paramImageView, com.tencent.mm.ak.a.a.c paramc, i parami, g paramg)
  {
    a(paramString, paramImageView, paramc, parami, null, paramg, null, null, null);
  }
  
  public final void a(String paramString, ImageView paramImageView, com.tencent.mm.ak.a.a.c paramc, i parami, j paramj, g paramg, e parame, com.tencent.mm.ak.a.c.d paramd, l paraml)
  {
    if (paramc == null) {
      paramc = this.dWP.dXk;
    }
    for (;;)
    {
      if (parami == null) {
        parami = this.dWQ;
      }
      for (;;)
      {
        c localc = new c(paramImageView, paramString);
        if ((paramImageView == null) || (paramc == null))
        {
          x.w("MicroMsg.imageloader.ImageLoader", "[cpan] should show default background view or options is null.");
          if (!bi.oW(paramString)) {
            break label191;
          }
          x.w("MicroMsg.imageloader.ImageLoader", "[cpan load image url is null.]");
          a(paramImageView, paramc);
          this.dWO.a(localc);
          parami.a(paramString, null, paramc.dYc);
        }
        label109:
        label163:
        label172:
        label183:
        label191:
        label699:
        for (;;)
        {
          return;
          int i;
          if ((paramc.dXR > 0) || (paramc.dXS != null))
          {
            i = 1;
            if (i == 0) {
              break label183;
            }
            if (paramc.dXR != 0) {
              break label172;
            }
            localObject = this.dWP.dXh;
            if (paramc.dXR == 0) {
              break label163;
            }
          }
          for (Object localObject = ((Resources)localObject).getDrawable(paramc.dXR);; localObject = paramc.dXS)
          {
            paramImageView.setBackgroundDrawable((Drawable)localObject);
            break;
            i = 0;
            break label109;
          }
          paramImageView.setBackgroundResource(paramc.dXR);
          break;
          paramImageView.setBackgroundDrawable(null);
          break;
          localObject = paramc.handler;
          if ((localObject == null) || (Looper.myLooper() == Looper.getMainLooper())) {
            localObject = new ag();
          }
          parame = new com.tencent.mm.ak.a.f.b(paramString, localc, (ag)localObject, paramc, parami, paramj, this.dWO, paramg, parame, paramd, paraml);
          parami = parame.mg(paramString);
          paramj = this.dWO.ma(parami);
          if ((paramj != null) && (!paramj.isRecycled()))
          {
            x.d("MicroMsg.imageloader.ImageLoader", "[cpan] load from cache. not need to load:%s", new Object[] { parami });
            parami = paramj;
            if (paramc.dXI) {
              parami = com.tencent.mm.sdk.platformtools.c.e(paramj, paramc.dXJ);
            }
            if (paramImageView != null) {
              paramImageView.setImageBitmap(parami);
            }
            parame.bv(0L);
            if (paramg != null) {
              paramg.a(paramString, paramImageView, new com.tencent.mm.ak.a.d.b(parami));
            }
            this.dWO.a(localc);
            return;
          }
          if (paramImageView != null) {
            a(paramImageView, paramc);
          }
          if ((parame.dXk.dXz) || (!this.dWO.dWT.wc()))
          {
            paramImageView = this.dWO;
            if (!bi.oW(paramString))
            {
              parami = (String)paramImageView.dWV.get(Integer.valueOf(localc.Pr()));
              if ((bi.oW(parami)) || (!paramString.equals(parami))) {
                paramImageView.dWV.put(Integer.valueOf(localc.Pr()), paramString);
              }
            }
            for (i = 1;; i = 0)
            {
              if (i == 0) {
                break label699;
              }
              paramString = this.dWO;
              if ((paramString.dWW != null) && (parame.dYk != null))
              {
                paramImageView = (com.tencent.mm.ak.a.f.b)paramString.dWW.get(Integer.valueOf(parame.dYk.Pr()));
                if ((paramImageView != null) && (paramImageView.dYk != null) && (parame.dYk.Pr() == paramImageView.dYk.Pr()))
                {
                  paramString.dWT.remove(paramImageView);
                  x.d("MicroMsg.imageloader.ImageLoaderManager", "remove taks url:%s", new Object[] { paramImageView.url });
                }
                paramString.dWW.put(Integer.valueOf(parame.dYk.Pr()), parame);
              }
              paramString = this.dWO;
              boolean bool = paramc.dXx;
              if (((ExecutorService)paramString.dWS.dXs).isShutdown()) {
                paramString.dWT = com.tencent.mm.ak.a.a.a.bf(paramString.dWS.dXi, paramString.dWS.dXj);
              }
              paramString.dWT.execute(parame);
              if ((!bool) || (!com.tencent.mm.ak.a.g.b.Px())) {
                break;
              }
              paramString.dWU.execute(new com.tencent.mm.ak.a.f.d());
              return;
            }
          }
        }
      }
    }
  }
  
  public final void a(String paramString, ImageView paramImageView, g paramg)
  {
    a(paramString, paramImageView, null, null, null, paramg, null, null, null);
  }
  
  public final void a(String paramString, com.tencent.mm.ak.a.a.c paramc, com.tencent.mm.ak.a.c.c paramc1)
  {
    paramString = new com.tencent.mm.ak.a.f.a(paramString, paramc, this.dWO, paramc1);
    this.dWO.dWT.execute(paramString);
  }
  
  public final void br(int paramInt)
  {
    x.d("MicroMsg.imageloader.ImageLoader", "[cpan] on scroll state changed :%d", new Object[] { Integer.valueOf(paramInt) });
    if ((paramInt == 0) || (paramInt == 1))
    {
      x.d("MicroMsg.imageloader.ImageLoader", "[cpan] resume");
      this.dWO.dWT.resume();
      return;
    }
    x.d("MicroMsg.imageloader.ImageLoader", "[cpan] pause");
    this.dWO.dWT.pause();
  }
  
  public final void detach()
  {
    if (this.dWO != null)
    {
      b localb = this.dWO;
      if (localb.dWS != null)
      {
        localb.dWS.dXl.clear();
        localb.dWS.dXm.Pu();
      }
    }
  }
  
  public final void j(String paramString, Bitmap paramBitmap)
  {
    if (this.dWO != null)
    {
      b localb = this.dWO;
      if (localb.dWS != null) {
        localb.dWS.dXl.d(paramString, paramBitmap);
      }
    }
  }
  
  public final Bitmap ma(String paramString)
  {
    if (this.dWO != null) {
      return this.dWO.ma(paramString);
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ak/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */