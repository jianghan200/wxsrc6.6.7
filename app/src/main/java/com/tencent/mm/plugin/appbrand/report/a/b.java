package com.tencent.mm.plugin.appbrand.report.a;

import android.content.Intent;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.page.aa;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class b
  implements f
{
  private final com.tencent.mm.plugin.appbrand.g fdO;
  public boolean gmD = false;
  public Intent gqU;
  public boolean gqV = false;
  i gqW = null;
  private k gqX = null;
  public p gqY = null;
  public volatile g gqZ = null;
  private final String mAppId;
  
  public b(com.tencent.mm.plugin.appbrand.g paramg)
  {
    this.mAppId = paramg.mAppId;
    this.fdO = paramg;
    aea();
  }
  
  final void a(com.tencent.mm.plugin.appbrand.page.p paramp1, com.tencent.mm.plugin.appbrand.page.p paramp2)
  {
    if (paramp2 != null)
    {
      Object localObject = this.gqW;
      paramp1.ahc();
      ((i)localObject).i(paramp2);
      ((i)localObject).xP();
      localObject = this.gqY;
      String str = paramp1.ahc();
      ((p)localObject).grK = ((String)((p)localObject).gsD.peekFirst());
      ((p)localObject).grL = 2;
      ((p)localObject).grM = str;
      ((p)localObject).gsD.push(paramp2.getURL());
      ((p)localObject).gsC = paramp2.getURL();
      ((p)localObject).k(paramp2);
    }
    this.gqX.j(paramp1);
  }
  
  public final void a(com.tencent.mm.plugin.appbrand.page.p paramp1, com.tencent.mm.plugin.appbrand.page.p paramp2, aa paramaa)
  {
    if (aa.gpk == paramaa) {
      aea();
    }
    int i;
    g localg;
    if ((aa.gpk == paramaa) || (paramp2 == null) || (bi.oW(paramp2.ahc())) || (paramp2 == paramp1))
    {
      i = 1;
      localg = this.gqZ;
      if (i == 0) {
        break label94;
      }
    }
    label94:
    for (com.tencent.mm.plugin.appbrand.page.p localp = null;; localp = paramp2)
    {
      localg.a(paramp1, localp, paramaa);
      if (i != 0) {
        break label100;
      }
      paramp2.gnC.t(new b.1(this, paramp1, paramp2));
      return;
      i = 0;
      break;
    }
    label100:
    a(paramp1, null);
  }
  
  public final void aea()
  {
    if (!bi.oW(this.mAppId))
    {
      localObject = j.g(this.fdO);
      if (localObject != null) {}
    }
    else
    {
      x.e("MicroMsg.AppBrandPageContainerReporter", "resetSession with dummy model, stack %s", new Object[] { bi.i(new Throwable()) });
      this.gqZ = g.grq;
      this.gqX = k.amQ();
      this.gqW = i.amP();
      this.gqY = p.amS();
      return;
    }
    String str = ((j)localObject).fdE;
    Object localObject = a.d(((j)localObject).aaD());
    this.gqZ = new d((String)localObject);
    this.gqW = i.a(this.fdO, str, this.gqZ);
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.push(bi.oV((String)localObject));
    this.gqY = p.a(this.fdO, str, localLinkedList);
    this.gqX = k.b(this.fdO, str, this.gqZ);
  }
  
  public final void c(com.tencent.mm.plugin.appbrand.page.p paramp)
  {
    this.gmD = true;
    this.gqZ.c(paramp);
    paramp.gnC.t(new b.2(this, paramp));
  }
  
  public final void d(com.tencent.mm.plugin.appbrand.page.p paramp)
  {
    this.gqU = null;
    if (this.gqV)
    {
      this.gqV = false;
      return;
    }
    this.gqZ.d(paramp);
    this.gqX.j(paramp);
  }
  
  public final void h(long paramLong, int paramInt)
  {
    AppBrandSysConfig localAppBrandSysConfig = com.tencent.mm.plugin.appbrand.a.qa(this.mAppId);
    if (localAppBrandSysConfig == null) {}
    for (int i = 0;; i = localAppBrandSysConfig.frm.fii)
    {
      h.mEJ.h(13543, new Object[] { this.mAppId, Integer.valueOf(i), Long.valueOf(paramLong), Integer.valueOf(paramInt) });
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/report/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */