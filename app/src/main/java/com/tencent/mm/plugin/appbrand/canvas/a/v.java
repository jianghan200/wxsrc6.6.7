package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import com.tencent.mm.plugin.appbrand.canvas.b.a;
import com.tencent.mm.plugin.appbrand.canvas.f;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONArray;
import org.json.JSONException;

public final class v
  implements d
{
  public final boolean a(f paramf, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    try
    {
      int i = paramJSONArray.getInt(0);
      paramf.fnf.X(i / 255.0F);
      paramf.fng.X(i / 255.0F);
      return true;
    }
    catch (JSONException paramf)
    {
      x.e("MicroMsg.SetGlobalAlphaAction", "getGlobalAlpha value error. exception : %s", new Object[] { paramf });
    }
    return false;
  }
  
  public final String getMethod()
  {
    return "setGlobalAlpha";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */