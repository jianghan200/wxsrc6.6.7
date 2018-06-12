package com.tencent.mm.plugin.appbrand.canvas.c;

import android.graphics.Path;
import com.tencent.mm.plugin.appbrand.q.f;
import org.json.JSONArray;

public final class i
  implements a
{
  public final boolean a(Path paramPath, JSONArray paramJSONArray)
  {
    if (paramJSONArray.length() < 4) {
      return false;
    }
    paramPath.quadTo(f.d(paramJSONArray, 0), f.d(paramJSONArray, 1), f.d(paramJSONArray, 2), f.d(paramJSONArray, 3));
    return true;
  }
  
  public final String getMethod()
  {
    return "quadraticCurveTo";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/c/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */