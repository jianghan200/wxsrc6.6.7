package com.tencent.mm.plugin.appbrand.widget;

import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;

public final class m
  extends i<l>
{
  public static final String[] dzV = { i.a(l.dzU, "WxaWidgetInfo") };
  public static final String[] dzW = new String[0];
  
  public m(e parame)
  {
    super(parame, l.dzU, "WxaWidgetInfo", dzW);
  }
  
  public final l wg(String paramString)
  {
    if (bi.oW(paramString)) {}
    l locall;
    do
    {
      return null;
      locall = new l();
      locall.field_appId = paramString;
      locall.field_appIdHash = paramString.hashCode();
    } while (!b(locall, new String[] { "appIdHash" }));
    return locall;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */