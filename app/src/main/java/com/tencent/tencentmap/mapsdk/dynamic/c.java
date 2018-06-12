package com.tencent.tencentmap.mapsdk.dynamic;

import android.content.Context;
import com.tencent.tencentmap.mapsdk.a.pw;
import com.tencent.tencentmap.mapsdk.a.qi;
import com.tencent.tencentmap.mapsdk.map.IMapView;
import com.tencent.tencentmap.mapsdk.map.TencentMapOptions;

public class c
{
  private int a = 1;
  private TencentMapOptions b;
  
  public IMapView a(Context paramContext, TencentMapOptions paramTencentMapOptions)
  {
    this.b = paramTencentMapOptions;
    this.a = new a(paramContext).a(this.a);
    if (this.a == 0) {
      return new pw(paramContext, this.b);
    }
    return new qi(paramContext, this.b);
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/dynamic/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */