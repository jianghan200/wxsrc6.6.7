package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import com.tencent.mm.plugin.appbrand.canvas.b.a;
import com.tencent.mm.plugin.appbrand.canvas.f;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONArray;
import org.json.JSONException;

public final class t
  implements d
{
  public final boolean a(f paramf, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    if (paramJSONArray.length() == 0) {
      return false;
    }
    int i;
    try
    {
      paramCanvas = paramJSONArray.getString(0);
      i = -1;
      switch (paramCanvas.hashCode())
      {
      case -1657669071: 
        if (!paramCanvas.equals("oblique")) {
          break label168;
        }
        i = 0;
      }
    }
    catch (JSONException paramf)
    {
      x.i("MicroMsg.SetFontStyle", "get 'fontStyle' error.");
      return false;
    }
    if (paramCanvas.equals("italic"))
    {
      i = 1;
      break label168;
      if (paramCanvas.equals("normal"))
      {
        i = 2;
        break label168;
        paramf.fnf.jN(2);
        paramf.fng.jN(2);
        break label196;
        paramf.fnf.jN(2);
        paramf.fng.jN(2);
        break label196;
        paramf.fnf.jN(0);
        paramf.fng.jN(0);
        break label196;
      }
    }
    label168:
    switch (i)
    {
    }
    label196:
    return true;
  }
  
  public final String getMethod()
  {
    return "setFontStyle";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */