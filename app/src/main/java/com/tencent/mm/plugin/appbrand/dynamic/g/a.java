package com.tencent.mm.plugin.appbrand.dynamic.g;

import android.text.TextUtils;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.a.c;
import com.tencent.mm.plugin.appbrand.appcache.ap;
import com.tencent.mm.plugin.appbrand.dynamic.j.b;
import com.tencent.mm.plugin.appbrand.widget.i;
import com.tencent.mm.protocal.c.aqm;
import com.tencent.mm.protocal.c.aqn;
import com.tencent.mm.protocal.c.cga;
import com.tencent.mm.protocal.c.cgw;
import com.tencent.mm.protocal.c.chy;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class a
  extends com.tencent.mm.ab.a<aqn>
{
  private int bPh;
  public final com.tencent.mm.ab.b diG;
  private int fwV;
  public com.tencent.mm.plugin.appbrand.widget.j fxo;
  
  public a(String paramString, boolean paramBoolean, chy paramchy)
  {
    aqm localaqm = new aqm();
    localaqm.jQb = paramString;
    localaqm.rSZ = paramchy;
    if (paramBoolean) {}
    for (int i = 1;; i = 2)
    {
      localaqm.rKO = i;
      paramString = new b.a();
      paramString.dIF = 1181;
      paramString.uri = "/cgi-bin/mmbiz-bin/wxaattr/launchwxawidget";
      paramString.dIG = localaqm;
      paramString.dIH = new aqn();
      paramString = paramString.KT();
      this.diG = paramString;
      this.diG = paramString;
      this.fwV = paramchy.sBT;
      this.bPh = com.tencent.mm.plugin.appbrand.dynamic.k.b.bH(this.fwV, paramchy.rRb);
      return;
    }
  }
  
  private String getAppId()
  {
    return ((aqm)this.diG.dID.dIL).jQb;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, aqn paramaqn)
  {
    x.i("MicroMsg.CgiLaunchWxaWidget", "onCgiBack, errType %d, errCode %d, errMsg %s, req appId %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, getAppId() });
    Object localObject1;
    Object localObject2;
    if ((paramInt1 == 0) && (paramInt2 == 0) && (paramaqn != null))
    {
      paramString = getAppId();
      this.fxo = ((com.tencent.mm.plugin.appbrand.widget.a.a)g.l(com.tencent.mm.plugin.appbrand.widget.a.a.class)).abc().a(paramString, this.bPh, this.fwV, paramaqn);
      if (paramaqn.rTb != null)
      {
        localObject1 = ((c)g.l(c.class)).aaN().ai(paramString, this.bPh);
        localObject2 = new cgw();
        ((cgw)localObject2).sBd = ((String)localObject1);
        ((cgw)localObject2).riv = paramaqn.rTb.riv;
        if (this.bPh != 10102) {
          break label193;
        }
        ((cgw)localObject2).sBc = paramaqn.rTb.sAy;
        ((c)g.l(c.class)).aaN().a(paramString, (cgw)localObject2, this.bPh);
      }
      label193:
      while (this.bPh != 10002) {
        return;
      }
      ((cgw)localObject2).sBc = paramaqn.rTb.sAx;
      ((c)g.l(c.class)).aaN().a(paramString, (cgw)localObject2, this.bPh);
      return;
    }
    paramaqn = com.tencent.mm.plugin.appbrand.dynamic.j.aeV();
    paramString = getAppId();
    if (!TextUtils.isEmpty(paramString))
    {
      localObject1 = paramaqn.fuI.entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        if ((((Map.Entry)localObject2).getValue() != null) && (paramString.equals(((j.b)((Map.Entry)localObject2).getValue()).appId)))
        {
          paramString = (String)((Map.Entry)localObject2).getKey();
          paramaqn.C(paramString, 626, 7);
          paramaqn = ((com.tencent.mm.plugin.appbrand.widget.a.a)g.l(com.tencent.mm.plugin.appbrand.widget.a.a.class)).abc();
          localObject1 = getAppId();
          paramInt1 = this.bPh;
          paramInt2 = this.fwV;
          if (bi.oW((String)localObject1)) {
            break label465;
          }
          paramString = new com.tencent.mm.plugin.appbrand.widget.j();
          paramString.field_appIdHash = ((String)localObject1).hashCode();
          paramString.field_appId = ((String)localObject1);
          paramString.field_pkgType = paramInt1;
          paramString.field_widgetType = paramInt2;
          if (!paramaqn.a(paramString, new String[] { "appId", "pkgType", "widgetType" })) {
            break label465;
          }
        }
      }
    }
    for (;;)
    {
      this.fxo = paramString;
      return;
      paramString = "";
      break;
      label465:
      paramString = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */