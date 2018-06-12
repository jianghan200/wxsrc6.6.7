package com.tencent.mm.plugin.appbrand.widget;

import com.tencent.mm.protocal.c.aqn;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.bi;

public final class i
  extends com.tencent.mm.sdk.e.i<j>
{
  public static final String frM = com.tencent.mm.sdk.e.i.a(j.fgt, "LaunchWxaWidgetRespData");
  
  public i(e parame)
  {
    super(parame, j.fgt, "LaunchWxaWidgetRespData", j.ciG);
  }
  
  private boolean a(j paramj, boolean paramBoolean)
  {
    paramj.field_appIdHash = paramj.field_appId.hashCode();
    super.a(paramj, paramBoolean);
    return a(paramj, new String[] { "appId" });
  }
  
  private boolean a(j paramj, boolean paramBoolean, String... paramVarArgs)
  {
    int i;
    if (!bi.G(paramVarArgs)) {
      i = 0;
    }
    for (;;)
    {
      if (i < paramVarArgs.length)
      {
        if (paramVarArgs[i].equals("appId"))
        {
          paramVarArgs[i] = "appIdHash";
          paramj.field_appIdHash = paramj.field_appId.hashCode();
        }
      }
      else {
        return super.b(paramj, paramBoolean, paramVarArgs);
      }
      i += 1;
    }
  }
  
  public final j a(String paramString, int paramInt1, int paramInt2, aqn paramaqn)
  {
    if ((bi.oW(paramString)) || (paramaqn == null)) {
      return null;
    }
    j localj = new j();
    localj.field_appIdHash = paramString.hashCode();
    localj.field_appId = paramString;
    localj.field_pkgType = paramInt1;
    localj.field_widgetType = paramInt2;
    if (!a(localj, new String[] { "appId", "pkgType", "widgetType" }))
    {
      paramInt2 = 1;
      if (com.tencent.mm.plugin.appbrand.q.i.a(localj.field_launchAction, paramaqn.rTa)) {
        break label276;
      }
      localj.field_launchAction = paramaqn.rTa;
    }
    label246:
    label276:
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      if (!com.tencent.mm.plugin.appbrand.q.i.a(localj.field_jsApiInfo, paramaqn.rSV))
      {
        localj.field_jsApiInfo = paramaqn.rSV;
        paramInt1 = 1;
      }
      if (!com.tencent.mm.plugin.appbrand.q.i.a(localj.field_versionInfo, paramaqn.rTb))
      {
        localj.field_versionInfo = paramaqn.rTb;
        paramInt1 = 1;
      }
      if (!com.tencent.mm.plugin.appbrand.q.i.a(localj.field_widgetSetting, paramaqn.rTc))
      {
        localj.field_widgetSetting = paramaqn.rTc;
        paramInt1 = 1;
      }
      if (paramInt1 != 0)
      {
        if (paramInt2 == 0) {
          break label246;
        }
        a(localj, false);
      }
      for (;;)
      {
        if (paramInt1 != 0) {
          a(localj, new String[] { "appId", "pkgType", "widgetType" });
        }
        return localj;
        paramInt2 = 0;
        break;
        a(localj, false, new String[] { "appId", "pkgType", "widgetType" });
      }
    }
  }
  
  public final boolean a(j paramj, String... paramVarArgs)
  {
    int i;
    if (!bi.G(paramVarArgs)) {
      i = 0;
    }
    for (;;)
    {
      if (i < paramVarArgs.length)
      {
        if (paramVarArgs[i].equals("appId"))
        {
          paramVarArgs[i] = "appIdHash";
          paramj.field_appIdHash = paramj.field_appId.hashCode();
        }
      }
      else {
        return super.b(paramj, paramVarArgs);
      }
      i += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */