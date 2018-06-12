package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.mm.compatible.util.p;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Map;

public final class m
{
  static String a(i parami, String paramString)
  {
    if ((parami.qkk == null) || (!parami.qkk.containsKey(paramString))) {
      return "";
    }
    return String.valueOf(parami.qkk.get(paramString));
  }
  
  public static Object[] j(Object[] paramArrayOfObject)
  {
    if ((paramArrayOfObject == null) || (paramArrayOfObject.length <= 0)) {
      return new Object[0];
    }
    Object[] arrayOfObject = new Object[paramArrayOfObject.length];
    int k = paramArrayOfObject.length;
    int j = 0;
    int i = 0;
    if (j < k)
    {
      Object localObject2 = paramArrayOfObject[j];
      Object localObject1;
      if (localObject2 == null) {
        localObject1 = "";
      }
      for (;;)
      {
        arrayOfObject[i] = String.valueOf(localObject1);
        j += 1;
        i += 1;
        break;
        localObject1 = localObject2;
        if ((localObject2 instanceof String)) {
          if (!((String)localObject2).contains(","))
          {
            localObject1 = localObject2;
            if (!((String)localObject2).contains("/")) {}
          }
          else
          {
            localObject1 = vp((String)localObject2);
          }
        }
      }
    }
    return arrayOfObject;
  }
  
  private static String vp(String paramString)
  {
    if (bi.oW(paramString)) {
      return "";
    }
    try
    {
      paramString = bi.oV(p.encode(paramString));
      return paramString;
    }
    catch (Exception paramString) {}
    return "";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/jsapi/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */