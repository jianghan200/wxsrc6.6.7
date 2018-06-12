package com.tencent.mm.plugin.appbrand;

import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.g.f;
import com.tencent.mm.plugin.appbrand.report.a;
import com.tencent.mm.plugin.report.service.h;

public final class d
  extends c
{
  private final l fbP;
  
  d(l paraml, f paramf)
  {
    super(paraml, paramf);
    this.fbP = paraml;
  }
  
  protected final void aag()
  {
    h.mEJ.a(370L, 39L, 1L, false);
    a.a(this.fbP.mAppId, this.fbP.fdO.fcu.frm.fii, this.fbP.fdO.fcu.frm.fih, 370, 39);
  }
  
  protected final void aah()
  {
    h.mEJ.a(370L, 48L, 1L, false);
    a.a(this.fbP.mAppId, this.fbP.fdO.fcu.frm.fii, this.fbP.fdO.fcu.frm.fih, 370, 48);
  }
  
  protected final void cq(boolean paramBoolean)
  {
    h.mEJ.a(370L, 40L, 1L, false);
    if (paramBoolean)
    {
      h.mEJ.a(370L, 41L, 1L, false);
      return;
    }
    h.mEJ.a(370L, 42L, 1L, false);
    a.a(this.fbP.mAppId, this.fbP.fdO.fcu.frm.fii, this.fbP.fdO.fcu.frm.fih, 370, 42);
  }
  
  protected final void cr(boolean paramBoolean)
  {
    h.mEJ.a(370L, 44L, 1L, false);
    if (paramBoolean)
    {
      h.mEJ.a(370L, 45L, 1L, false);
      return;
    }
    h.mEJ.a(370L, 46L, 1L, false);
    a.a(this.fbP.mAppId, this.fbP.fdO.fcu.frm.fii, this.fbP.fdO.fcu.frm.fih, 370, 46);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/appbrand/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */