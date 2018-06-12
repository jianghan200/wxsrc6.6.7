package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import com.tencent.map.lib.d;

public class jk
{
  static final String[] a = { "txmapengine", "txnavengine" };
  
  public static void a(Context paramContext, String paramString)
  {
    try
    {
      System.loadLibrary(paramString);
      d.a("loadLibary:" + paramString + "  successful");
      return;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      boolean bool = jl.a(paramContext, paramString);
      d.a("loadLibary:" + paramString + " result:" + bool);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/jk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */