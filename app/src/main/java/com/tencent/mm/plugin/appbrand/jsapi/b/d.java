package com.tencent.mm.plugin.appbrand.jsapi.b;

import android.graphics.Paint.FontMetrics;
import android.text.TextUtils;
import com.tencent.mm.plugin.appbrand.canvas.b.a;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.n;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.q.f;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  extends n
{
  public static final int CTRL_INDEX = 436;
  public static final String NAME = "measureText";
  
  public final String a(l paraml, JSONObject paramJSONObject)
  {
    j = -1;
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.JsApiMeasureText", "measureText, data is null");
      return f("fail:data is null", null);
    }
    paraml = paramJSONObject.optString("text");
    float f1 = (float)paramJSONObject.optDouble("fontSize", 16.0D);
    x.i("MicroMsg.JsApiMeasureText", "measureText data:%s", new Object[] { paramJSONObject.toString() });
    if ((TextUtils.isEmpty(paraml)) || (f1 <= 0.0F))
    {
      x.e("MicroMsg.JsApiMeasureText", "measureText, param is illegal");
      return f("fail:param is illegal", null);
    }
    locala = new a();
    locala.setTextSize(f.ae(f1));
    try
    {
      locala.rp(paramJSONObject.getString("fontFamily"));
      try
      {
        String str = paramJSONObject.getString("fontStyle");
        i = str.hashCode();
        switch (i)
        {
        default: 
          i = -1;
          switch (i)
          {
          }
          break;
        }
      }
      catch (JSONException localJSONException2)
      {
        for (;;)
        {
          label268:
          float f2;
          x.i("MicroMsg.JsApiMeasureText", "get 'fontStyle' error.");
          continue;
          locala.jN(2);
          continue;
          locala.jN(0);
          continue;
          int i = j;
          if (paramJSONObject.equals("bold"))
          {
            i = 0;
            continue;
            i = j;
            if (paramJSONObject.equals("normal"))
            {
              i = 1;
              continue;
              locala.setFakeBoldText(true);
            }
          }
        }
      }
      try
      {
        paramJSONObject = paramJSONObject.getString("fontWeight");
        i = paramJSONObject.hashCode();
        switch (i)
        {
        default: 
          i = j;
          switch (i)
          {
          }
          break;
        }
      }
      catch (JSONException paramJSONObject)
      {
        x.i("MicroMsg.JsApiMeasureText", "get 'fontWeight' error.");
        break label268;
        locala.setFakeBoldText(false);
        break label268;
      }
      f2 = locala.measureText(paraml);
      paraml = locala.getFontMetrics();
      f1 = Math.abs(paraml.bottom - paraml.top);
      x.i("MicroMsg.JsApiMeasureText", "fontMetrics.bottom : %f, fontMetrics.top : %f, width : %f, height : %f", new Object[] { Float.valueOf(paraml.bottom), Float.valueOf(paraml.top), Float.valueOf(f2), Float.valueOf(f1) });
      f2 = f.ad(f2);
      f1 = f.ad(f1);
      paraml = new HashMap();
      paraml.put("width", Float.valueOf(f2));
      paraml.put("height", Float.valueOf(f1));
      x.i("MicroMsg.JsApiMeasureText", "map:%s", new Object[] { paraml.toString() });
      return f("ok", paraml);
    }
    catch (JSONException localJSONException1)
    {
      for (;;)
      {
        x.i("MicroMsg.JsApiMeasureText", "get 'fontFamily' error");
        continue;
        if (localJSONException1.equals("oblique"))
        {
          i = 0;
          continue;
          if (localJSONException1.equals("italic"))
          {
            i = 1;
            continue;
            if (localJSONException1.equals("normal"))
            {
              i = 2;
              continue;
              locala.jN(2);
            }
          }
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */