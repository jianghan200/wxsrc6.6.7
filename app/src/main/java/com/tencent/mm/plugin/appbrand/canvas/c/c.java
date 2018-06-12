package com.tencent.mm.plugin.appbrand.canvas.c;

import android.graphics.Path;
import android.graphics.RectF;
import com.tencent.mm.plugin.appbrand.q.f;
import org.json.JSONArray;

public final class c
  implements a
{
  public final boolean a(Path paramPath, JSONArray paramJSONArray)
  {
    if (paramJSONArray.length() < 6) {
      return false;
    }
    float f6 = f.d(paramJSONArray, 0);
    float f7 = f.d(paramJSONArray, 1);
    float f1 = f.d(paramJSONArray, 2);
    float f3 = (float)paramJSONArray.optDouble(3);
    float f2 = (float)paramJSONArray.optDouble(4);
    boolean bool = paramJSONArray.optBoolean(5);
    float f4 = f6 - f1;
    float f5 = f7 - f1;
    f6 += f1;
    f7 += f1;
    float f8 = (float)Math.toDegrees(f3);
    f3 = (float)Math.toDegrees(f2);
    float f9 = (float)(360.0D / (6.283185307179586D * f1));
    if (bool) {
      if (f8 - f3 >= 360.0F)
      {
        f1 = -360.0F;
        f2 = f1 % 360.0F;
        if ((f2 > f9) || (f2 < -f9)) {
          break label363;
        }
        paramPath.arcTo(new RectF(f4, f5, f6, f7), f8, f1, false);
        paramPath.addArc(new RectF(f4, f5, f6, f7), f8, f1);
      }
    }
    for (;;)
    {
      return true;
      f2 = f8 % 360.0F;
      f3 %= 360.0F;
      f1 = f2;
      if (f2 < 0.0F) {
        f1 = f2 + 360.0F;
      }
      f2 = f3;
      if (f3 < 0.0F) {
        f2 = f3 + 360.0F;
      }
      if (f2 >= f1)
      {
        f1 = f2 - f1 - 360.0F;
        break;
      }
      f1 = f2 - f1;
      break;
      if (f3 - f8 >= 360.0F)
      {
        f1 = 360.0F;
        break;
      }
      f2 = f8 % 360.0F;
      f3 %= 360.0F;
      f1 = f2;
      if (f2 < 0.0F) {
        f1 = f2 + 360.0F;
      }
      f2 = f3;
      if (f3 < 0.0F) {
        f2 = f3 + 360.0F;
      }
      if (f2 >= f1)
      {
        f1 = f2 - f1;
        break;
      }
      f1 = f2 + 360.0F - f1;
      break;
      label363:
      paramPath.arcTo(new RectF(f4, f5, f6, f7), f8, f1, false);
    }
  }
  
  public final String getMethod()
  {
    return "arcTo";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */