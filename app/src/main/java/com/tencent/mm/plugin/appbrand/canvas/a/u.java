package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import com.tencent.mm.plugin.appbrand.canvas.b.a;
import com.tencent.mm.plugin.appbrand.canvas.f;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONArray;
import org.json.JSONException;

public final class u
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
      case 3029637: 
        if (!paramCanvas.equals("bold")) {
          break label126;
        }
        i = 0;
      }
    }
    catch (JSONException paramf)
    {
      x.i("MicroMsg.SetFontWeight", "get 'fontWeight' error.");
      return false;
    }
    if (paramCanvas.equals("normal"))
    {
      i = 1;
      break label126;
      paramf.fnf.setFakeBoldText(true);
      paramf.fng.setFakeBoldText(true);
      break label152;
      paramf.fnf.setFakeBoldText(false);
      paramf.fng.setFakeBoldText(false);
      break label152;
    }
    label126:
    switch (i)
    {
    }
    label152:
    return true;
  }
  
  public final String getMethod()
  {
    return "setFontWeight";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */