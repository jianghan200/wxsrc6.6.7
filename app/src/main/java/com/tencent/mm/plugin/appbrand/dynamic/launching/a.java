package com.tencent.mm.plugin.appbrand.dynamic.launching;

import android.util.Base64;
import com.tencent.mm.ab.a.a;
import com.tencent.mm.ab.w;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.a.c;
import com.tencent.mm.plugin.appbrand.appcache.ap;
import com.tencent.mm.plugin.appbrand.dynamic.g.a.1;
import com.tencent.mm.plugin.appbrand.dynamic.k.b;
import com.tencent.mm.plugin.appbrand.widget.i;
import com.tencent.mm.plugin.appbrand.widget.j;
import com.tencent.mm.protocal.c.aqn;
import com.tencent.mm.protocal.c.cfz;
import com.tencent.mm.protocal.c.cga;
import com.tencent.mm.protocal.c.cgw;
import com.tencent.mm.protocal.c.chy;
import com.tencent.mm.sdk.platformtools.x;
import java.util.concurrent.Callable;

public final class a
  implements Callable<j>
{
  final String appId;
  final int bPh;
  final int cbu;
  final int fwV;
  final String fwW;
  final int scene;
  
  public a(String paramString1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString2)
  {
    this.appId = paramString1;
    this.bPh = paramInt1;
    this.cbu = paramInt2;
    this.scene = paramInt3;
    this.fwV = paramInt4;
    this.fwW = paramString2;
  }
  
  public final j afo()
  {
    Object localObject2 = new j();
    ((j)localObject2).field_appId = this.appId;
    Object localObject3 = ((com.tencent.mm.plugin.appbrand.widget.a.a)g.l(com.tencent.mm.plugin.appbrand.widget.a.a.class)).abc();
    if (localObject3 == null) {
      return null;
    }
    Object localObject1 = new chy();
    ((chy)localObject1).rRb = b.ke(this.bPh);
    ((chy)localObject1).riv = this.cbu;
    ((chy)localObject1).sBT = this.fwV;
    ((chy)localObject1).otY = this.scene;
    ((chy)localObject1).sBU = 0;
    if (((i)localObject3).a((j)localObject2, new String[] { "appId", "pkgType", "widgetType" })) {
      if (((j)localObject2).field_jsApiInfo == null) {
        break label498;
      }
    }
    label495:
    label498:
    for (int i = 1;; i = 0)
    {
      a.a locala;
      if ((i == 0) || (((j)localObject2).field_launchAction == null) || (1 != ((j)localObject2).field_launchAction.qZk) || (((j)localObject2).field_versionInfo == null) || (((j)localObject2).field_versionInfo.riv < this.cbu))
      {
        if ((this.fwW != null) && (this.fwW.length() > 0)) {
          try
          {
            localObject2 = new aqn();
            ((aqn)localObject2).aG(Base64.decode(this.fwW, 0));
            localObject3 = ((com.tencent.mm.plugin.appbrand.widget.a.a)g.l(com.tencent.mm.plugin.appbrand.widget.a.a.class)).abc().a(this.appId, this.bPh, this.fwV, (aqn)localObject2);
            if (((aqn)localObject2).rTb == null) {
              break label495;
            }
            String str = ((c)g.l(c.class)).aaN().ai(this.appId, this.bPh);
            cgw localcgw = new cgw();
            localcgw.sBd = str;
            localcgw.riv = ((aqn)localObject2).rTb.riv;
            if (this.bPh == 10102)
            {
              localcgw.sBc = ((aqn)localObject2).rTb.sAy;
              ((c)g.l(c.class)).aaN().a(this.appId, localcgw, this.bPh);
            }
            else if (this.bPh == 10002)
            {
              localcgw.sBc = ((aqn)localObject2).rTb.sAx;
              ((c)g.l(c.class)).aaN().a(this.appId, localcgw, this.bPh);
            }
          }
          catch (Exception localException)
          {
            x.e("MicroMsg.AppBrand.PrepareStepCheckWidgetLaunchInfo", "preload launch data parse fail[%s]", new Object[] { this.fwW });
          }
        }
        localObject1 = new com.tencent.mm.plugin.appbrand.dynamic.g.a(this.appId, true, (chy)localObject1);
        locala = w.b(((com.tencent.mm.plugin.appbrand.dynamic.g.a)localObject1).diG);
        ((com.tencent.mm.plugin.appbrand.dynamic.g.a)localObject1).a(locala.errType, locala.errCode, locala.Yy, (aqn)locala.dIv);
        return ((com.tencent.mm.plugin.appbrand.dynamic.g.a)localObject1).fxo;
      }
      com.tencent.mm.bu.a.post(new a.1(new com.tencent.mm.plugin.appbrand.dynamic.g.a(this.appId, false, (chy)localObject1)));
      return locala;
      return (j)localObject3;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/launching/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */