package com.tencent.tencentmap.mapsdk.dynamic;

import android.content.Context;

public class TencentMapInitializer
  implements IInitializer
{
  private static volatile TencentMapInitializer b;
  private IInitializer a;
  
  private TencentMapInitializer(Context paramContext)
  {
    this.a = b.a(paramContext);
  }
  
  public static TencentMapInitializer getInstance(Context paramContext)
  {
    if (b == null) {}
    try
    {
      if (b == null) {
        b = new TencentMapInitializer(paramContext);
      }
      return b;
    }
    finally {}
  }
  
  public void downLoadVectorMapResource()
  {
    if (this.a == null) {
      return;
    }
    this.a.downLoadVectorMapResource();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/dynamic/TencentMapInitializer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */