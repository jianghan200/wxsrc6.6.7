package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.sdk.platformtools.x;

public final class m
  extends h
{
  private static final int CTRL_INDEX = 248;
  private static final String NAME = "onUserCaptureScreen";
  private static m fFn = new m();
  
  public static void tm(String paramString)
  {
    x.i("MicroMsg.AppBrandOnUserCaptureScreenEvent", "user capture screen event dispatch, appId:%s", new Object[] { paramString });
    fFn.aC(paramString, 0).ahM();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */