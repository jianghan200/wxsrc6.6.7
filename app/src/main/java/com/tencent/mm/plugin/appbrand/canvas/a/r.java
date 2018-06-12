package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import com.tencent.mm.plugin.appbrand.canvas.b.a;
import com.tencent.mm.plugin.appbrand.canvas.f;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONArray;
import org.json.JSONException;

public final class r
  implements d
{
  public final boolean a(f paramf, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    if (paramJSONArray.length() == 0) {
      return false;
    }
    try
    {
      paramCanvas = paramJSONArray.getString(0);
      paramf.fnf.rp(paramCanvas);
      paramf.fng.rp(paramCanvas);
      return true;
    }
    catch (JSONException paramf)
    {
      x.i("MicroMsg.SetFontFamily", "get 'fontFamily' error.");
    }
    return false;
  }
  
  public final String getMethod()
  {
    return "setFontFamily";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */