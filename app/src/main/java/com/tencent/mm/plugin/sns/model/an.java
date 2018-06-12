package com.tencent.mm.plugin.sns.model;

import android.os.Looper;
import com.tencent.mm.a.g;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.HashMap;
import java.util.Map;

public final class an
{
  private static final Map<String, String> nrt = new HashMap();
  
  public static void release()
  {
    try
    {
      nrt.clear();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static String s(String paramString1, String paramString2)
  {
    if (paramString2 == null) {
      localObject1 = "";
    }
    boolean bool;
    do
    {
      return (String)localObject1;
      bool = Looper.getMainLooper().equals(Looper.myLooper());
      if ((!bool) || (!nrt.containsKey(paramString1 + paramString2))) {
        break;
      }
      localObject2 = (String)nrt.get(paramString1 + paramString2);
      localObject1 = localObject2;
    } while (!bi.oW((String)localObject2));
    Object localObject1 = g.u(paramString2.getBytes());
    Object localObject2 = new StringBuffer(paramString1);
    if (((String)localObject1).length() > 0)
    {
      ((StringBuffer)localObject2).append(((String)localObject1).charAt(0));
      ((StringBuffer)localObject2).append("/");
    }
    if (((String)localObject1).length() >= 2)
    {
      ((StringBuffer)localObject2).append(((String)localObject1).charAt(1));
      ((StringBuffer)localObject2).append("/");
    }
    if (bool) {
      nrt.put(paramString1 + paramString2, ((StringBuffer)localObject2).toString());
    }
    return ((StringBuffer)localObject2).toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */