package com.tencent.mm.plugin.appbrand.jsapi.f;

import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import com.tencent.mm.plugin.appbrand.jsapi.base.f;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.f.a.b;
import com.tencent.mm.plugin.appbrand.jsapi.f.a.c.13;
import com.tencent.mm.plugin.appbrand.jsapi.f.a.c.2;
import com.tencent.mm.plugin.appbrand.jsapi.f.a.c.3;
import com.tencent.mm.plugin.appbrand.jsapi.f.a.c.e;
import com.tencent.mm.plugin.appbrand.jsapi.f.a.c.h;
import com.tencent.mm.plugin.appbrand.jsapi.f.a.c.m;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.widget.e.a;
import com.tencent.mm.plugin.appbrand.widget.e.a.a;
import com.tencent.mm.plugin.appbrand.widget.e.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class m
  extends a
{
  public static final int CTRL_INDEX = 200;
  public static final String NAME = "translateMapMarker";
  private static final LinkedList<JSONObject> fSK = new LinkedList();
  private a.a fSL;
  
  protected final boolean a(p paramp, JSONObject paramJSONObject, a.a parama, f paramf)
  {
    this.fSL = parama;
    x.d("MicroMsg.JsApiTranslateMapMarker", "onUpdateView, data:%s", new Object[] { paramJSONObject.toString() });
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.JsApiTranslateMapMarker", "data is null");
      return false;
    }
    paramp = b.E(paramp.mAppId, paramp.hashCode(), k(paramJSONObject));
    if (paramp == null)
    {
      x.e("MicroMsg.JsApiTranslateMapMarker", "appBrandMapView is null, return");
      return false;
    }
    parama = paramJSONObject.optString("markerId");
    for (;;)
    {
      int i;
      try
      {
        localObject1 = new JSONArray(paramJSONObject.optString("keyFrames"));
        paramJSONObject = new LinkedList();
        x.d("MicroMsg.JsApiTranslateMapMarker", "keyFramesArray size :%d", new Object[] { Integer.valueOf(((JSONArray)localObject1).length()) });
        i = 0;
        if (i < ((JSONArray)localObject1).length())
        {
          localObject2 = (JSONObject)((JSONArray)localObject1).get(i);
          c.h localh = new c.h();
          localh.duration = ((JSONObject)localObject2).optInt("duration", 0);
          if (localh.duration == 0)
          {
            x.e("MicroMsg.JsApiTranslateMapMarker", "keyFrame.duration is zero, err continue");
          }
          else
          {
            localh.rotate = ((float)((JSONObject)localObject2).optDouble("rotate", 0.0D));
            localh.latitude = bi.getFloat(((JSONObject)localObject2).optString("latitude"), 0.0F);
            localh.longitude = bi.getFloat(((JSONObject)localObject2).optString("longitude"), 0.0F);
            paramJSONObject.add(localh);
          }
        }
      }
      catch (JSONException paramp)
      {
        x.e("MicroMsg.JsApiTranslateMapMarker", "parse keyFrames error, exception : %s", new Object[] { paramp });
        paramf.tp(f("fail", null));
        return false;
      }
      Object localObject1 = new m.1(this, paramf);
      parama = paramp.tF(parama);
      if ((parama == null) || (parama.fTv == null))
      {
        x.e("MicroMSg.AppBrandMapView", "get marker failed!");
        ((c.m)localObject1).cR(false);
        break;
      }
      if (paramJSONObject.size() <= 0)
      {
        x.e("MicroMSg.AppBrandMapView", "keyFrame is empty, err, return");
        ((c.m)localObject1).cR(false);
        break;
      }
      com.tencent.mm.plugin.appbrand.jsapi.f.a.c.a(paramJSONObject, parama);
      Object localObject2 = new d(paramJSONObject, parama.fTv, paramp.fSW);
      localObject1 = new c.13(paramp, (c.m)localObject1);
      ((d)localObject2).gMt.addListener((Animator.AnimatorListener)localObject1);
      com.tencent.mm.plugin.appbrand.r.c.runOnUiThread(new c.2(paramp, (d)localObject2));
      if (parama.fTw == null) {
        break;
      }
      com.tencent.mm.plugin.appbrand.r.c.runOnUiThread(new c.3(paramp, new d(paramJSONObject, parama.fTw, paramp.fSW)));
      break;
      i += 1;
    }
    return true;
  }
  
  protected final boolean aik()
  {
    return true;
  }
  
  protected final int k(JSONObject paramJSONObject)
  {
    try
    {
      int i = paramJSONObject.optInt("mapId");
      return i;
    }
    catch (Exception paramJSONObject)
    {
      x.e("MicroMsg.JsApiTranslateMapMarker", "get mapId error, exception : %s", new Object[] { paramJSONObject });
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/f/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */