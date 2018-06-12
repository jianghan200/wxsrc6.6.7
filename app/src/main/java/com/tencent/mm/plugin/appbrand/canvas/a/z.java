package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONArray;
import org.json.JSONException;

@Deprecated
public final class z
  implements d
{
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.f paramf, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    if (paramJSONArray.length() == 0) {
      return false;
    }
    try
    {
      com.tencent.mm.plugin.appbrand.q.f.i(paramJSONArray);
      return false;
    }
    catch (JSONException paramf)
    {
      x.i("MicroMsg.SetLineHeight", "get 'lineHeight' error");
    }
    return false;
  }
  
  public final String getMethod()
  {
    return "setLineHeight";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */