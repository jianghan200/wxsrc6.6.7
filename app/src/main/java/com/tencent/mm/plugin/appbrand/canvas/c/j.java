package com.tencent.mm.plugin.appbrand.canvas.c;

import android.graphics.Path;
import android.graphics.Path.Direction;
import com.tencent.mm.plugin.appbrand.q.f;
import org.json.JSONArray;

public final class j
  implements a
{
  public final boolean a(Path paramPath, JSONArray paramJSONArray)
  {
    if (paramJSONArray.length() < 4) {
      return false;
    }
    float f1 = f.d(paramJSONArray, 0);
    float f2 = f.d(paramJSONArray, 1);
    paramPath.addRect(f1, f2, f1 + f.d(paramJSONArray, 2), f.d(paramJSONArray, 3) + f2, Path.Direction.CW);
    return true;
  }
  
  public final String getMethod()
  {
    return "rect";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/c/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */