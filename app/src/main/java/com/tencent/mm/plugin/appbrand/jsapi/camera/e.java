package com.tencent.mm.plugin.appbrand.jsapi.camera;

import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.plugin.appbrand.page.p;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class e
  extends h
{
  private static final int CTRL_INDEX = 455;
  public static final String NAME = "onCameraScanCode";
  public static e fOF = new e();
  
  public static void a(p paramp, int paramInt, String paramString1, String paramString2)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("cameraId", Integer.valueOf(paramInt));
    localHashMap.put("type", paramString1);
    localHashMap.put("result", paramString2);
    paramString1 = new JSONObject(localHashMap).toString();
    paramp = fOF.a(paramp);
    paramp.mData = paramString1;
    paramp.ahM();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/camera/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */