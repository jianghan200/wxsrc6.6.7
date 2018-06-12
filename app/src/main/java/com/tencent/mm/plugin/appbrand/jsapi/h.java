package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.page.n;
import com.tencent.mm.plugin.appbrand.permission.c.a;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public abstract class h
  extends b
{
  private int fFf;
  private g fdO;
  public String mData;
  
  public final h a(c paramc)
  {
    if (paramc == null) {
      return this;
    }
    this.fdO = paramc.getRuntime();
    this.fFf = paramc.hashCode();
    return this;
  }
  
  public final h aC(String paramString, int paramInt)
  {
    this.fdO = com.tencent.mm.plugin.appbrand.a.pY(paramString);
    this.fFf = paramInt;
    return this;
  }
  
  public final boolean ahM()
  {
    boolean bool1 = true;
    if ((this.fdO == null) || (this.fdO.fcy == null) || (!this.fdO.dti)) {
      if (this.fdO == null) {
        x.e("MicroMsg.AppBrandJsApiEvent", "dispatchToService runtime null == %b, running state not valid, skip", new Object[] { Boolean.valueOf(bool1) });
      }
    }
    Object localObject;
    label156:
    label159:
    for (;;)
    {
      return false;
      bool1 = false;
      break;
      localObject = null;
      if (this.fdO != null)
      {
        com.tencent.mm.plugin.appbrand.b.b localb = this.fdO.fcL;
        localObject = localb;
        if (localb != null)
        {
          i = 1;
          localObject = localb;
          if ((!com.tencent.mm.sdk.a.b.chp()) || (com.tencent.mm.sdk.a.b.chn())) {
            break label156;
          }
        }
      }
      for (int j = 1;; j = 0)
      {
        if ((i == 0) && (j == 0)) {
          break label159;
        }
        if (!((com.tencent.mm.plugin.appbrand.b.b)localObject).fjj.fjt.get()) {
          break label161;
        }
        x.i("MicroMsg.AppBrandJsApiEvent", "dispatchToService(%s), runtime stopped, just return", new Object[] { getName() });
        return false;
        i = 0;
        break;
      }
    }
    label161:
    label177:
    boolean bool3;
    boolean bool2;
    if (((com.tencent.mm.plugin.appbrand.b.b)localObject).fjj.acv() == com.tencent.mm.plugin.appbrand.b.a.fjg)
    {
      bool1 = true;
      bool3 = b(this.fdO.fcy);
      if ((!bool1) && (!bool3)) {
        break label306;
      }
      bool2 = true;
      label202:
      if (com.tencent.mm.compatible.loader.a.a(o.fFp, getClass())) {
        break label312;
      }
    }
    label306:
    label312:
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        x.i("MicroMsg.AppBrandJsApiEvent", "dispatchToService, canSend %B, event %s, index %d, suspend %b, hasPermission %b", new Object[] { Boolean.valueOf(bool2), getName(), Integer.valueOf(ahI()), Boolean.valueOf(bool1), Boolean.valueOf(bool3) });
      }
      if (!bool2) {
        break;
      }
      this.fdO.fcy.j(getName(), this.mData, this.fFf);
      return true;
      bool1 = false;
      break label177;
      bool2 = false;
      break label202;
    }
  }
  
  public final boolean b(c paramc)
  {
    return com.tencent.mm.plugin.appbrand.permission.c.u(this.fdO).a(paramc, this, null).code == 1;
  }
  
  public final boolean h(int[] paramArrayOfInt)
  {
    boolean bool = true;
    if ((this.fdO == null) || (this.fdO.fcz == null) || (!this.fdO.dti))
    {
      if (this.fdO == null) {}
      for (;;)
      {
        x.e("MicroMsg.AppBrandJsApiEvent", "dispatchToPage runtime null == %b, running state not valid, skip", new Object[] { Boolean.valueOf(bool) });
        return false;
        bool = false;
      }
    }
    try
    {
      if (!b(this.fdO.fcz.getCurrentPage().getCurrentPageView()))
      {
        x.d("MicroMsg.AppBrandJsApiEvent", "event name = %s, ctrlIndex = %d, perm denied", new Object[] { getName(), Integer.valueOf(ahI()) });
        return false;
      }
    }
    catch (NullPointerException paramArrayOfInt)
    {
      x.printErrStackTrace("MicroMsg.AppBrandJsApiEvent", paramArrayOfInt, "", new Object[0]);
      return false;
    }
    this.fdO.fcz.c(getName(), this.mData, paramArrayOfInt);
    return true;
  }
  
  public final h x(Map<String, Object> paramMap)
  {
    com.tencent.mm.plugin.appbrand.r.c.m(paramMap);
    this.mData = new JSONObject(paramMap).toString();
    return this;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */