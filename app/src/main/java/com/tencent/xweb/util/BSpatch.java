package com.tencent.xweb.util;

import com.tencent.mm.compatible.util.k;
import org.xwalk.core.Log;

public class BSpatch
{
  static
  {
    k.b("bspatch_utils", BSpatch.class.getClassLoader());
  }
  
  public static int av(String paramString1, String paramString2, String paramString3)
  {
    Log.i("BSpatch", "doPatch oldFile:" + paramString1 + ",patchFile:" + paramString2 + ",newFile:" + paramString3);
    long l = System.currentTimeMillis();
    e.cJd();
    int i = 0;
    String str = paramString3;
    if (paramString1.equals(paramString3))
    {
      str = paramString1 + ".temp";
      i = 1;
    }
    int j = new BSpatch().nativeDoPatch(paramString1, paramString2, str);
    if (j < 0)
    {
      Log.i("BSpatch", "doPatch failed");
      e.cJe();
    }
    for (;;)
    {
      return j;
      Log.i("BSpatch", "doPatch successful");
      if (i != 0)
      {
        if (!a.fN(str, paramString1))
        {
          Log.e("BSpatch", "doPatch same path, copy failed");
          return -1;
        }
        a.deleteFile(str);
      }
      e.hf(System.currentTimeMillis() - l);
    }
  }
  
  public native int nativeDoPatch(String paramString1, String paramString2, String paramString3);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/xweb/util/BSpatch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */