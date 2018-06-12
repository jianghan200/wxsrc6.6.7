package com.tencent.mm.plugin.appbrand.ui.banner;

import com.tencent.mm.plugin.appbrand.jsapi.h;
import java.util.HashMap;

public final class c
  extends h
{
  private static final int CTRL_INDEX = -2;
  private static final String NAME = "onStickyStatusChange";
  
  public final void ab(String paramString, boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("isSticky", Boolean.valueOf(paramBoolean));
    x(localHashMap).aC(paramString, 0).ahM();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/banner/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */