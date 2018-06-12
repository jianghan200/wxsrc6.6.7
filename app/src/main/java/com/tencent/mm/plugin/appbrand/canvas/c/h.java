package com.tencent.mm.plugin.appbrand.canvas.c;

import android.graphics.Path;
import com.tencent.mm.plugin.appbrand.q.f;
import org.json.JSONArray;

public final class h
  implements a
{
  public final boolean a(Path paramPath, JSONArray paramJSONArray)
  {
    if (paramJSONArray.length() < 2) {
      return false;
    }
    paramPath.moveTo(f.d(paramJSONArray, 0), f.d(paramJSONArray, 1));
    return true;
  }
  
  public final String getMethod()
  {
    return "moveTo";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/c/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */