package com.tencent.tencentmap.mapsdk.a;

import android.os.Build.VERSION;
import com.tencent.map.lib.gl.e;

public class gg
{
  public static boolean a(e parame, boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT < 11) {
      return false;
    }
    parame.setPreserveEGLContextOnPause(paramBoolean);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/gg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */