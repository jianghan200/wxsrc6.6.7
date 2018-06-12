package com.tencent.mm.plugin.appbrand.jsapi.f;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.mm.plugin.appbrand.compat.a.b.i;
import com.tencent.mm.plugin.appbrand.jsapi.f.a.c.10;
import com.tencent.mm.plugin.appbrand.jsapi.f.a.c.11;
import com.tencent.mm.plugin.appbrand.jsapi.f.a.c.12;
import com.tencent.mm.plugin.appbrand.jsapi.f.a.c.e;
import com.tencent.mm.plugin.appbrand.jsapi.f.a.c.f;
import com.tencent.mm.plugin.appbrand.jsapi.f.a.c.f.a;
import com.tencent.mm.plugin.appbrand.jsapi.f.a.c.f.b;
import com.tencent.mm.plugin.appbrand.page.o;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.q.f;
import com.tencent.mm.plugin.appbrand.s.g;
import com.tencent.mm.plugin.appbrand.s.h;
import com.tencent.mm.plugin.appbrand.widget.e.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  extends com.tencent.mm.plugin.appbrand.jsapi.base.c
{
  public static final int CTRL_INDEX = 133;
  public static final String NAME = "addMapMarkers";
  
  protected final boolean c(p paramp, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.JsApiAddMapMarkers", "data is null");
      return false;
    }
    x.i("MicroMsg.JsApiAddMapMarkers", "onUpdateView, data:%s", new Object[] { paramJSONObject.toString() });
    com.tencent.mm.plugin.appbrand.jsapi.f.a.c localc = com.tencent.mm.plugin.appbrand.jsapi.f.a.b.E(paramp.mAppId, paramp.hashCode(), k(paramJSONObject));
    if (localc == null)
    {
      x.e("MicroMsg.JsApiAddMapMarkers", "appBrandMapView is null, return");
      return false;
    }
    boolean bool = paramJSONObject.optBoolean("clear", true);
    x.i("MicroMsg.JsApiAddMapMarkers", "clear:%b", new Object[] { Boolean.valueOf(bool) });
    if (bool) {
      localc.ajj();
    }
    if (paramJSONObject.has("markers"))
    {
      try
      {
        paramView = new JSONArray(paramJSONObject.optString("markers"));
        if (paramView == null)
        {
          x.e("MicroMsg.JsApiAddMapMarkers", "markersArray is null, return");
          return false;
        }
      }
      catch (JSONException paramp)
      {
        for (;;)
        {
          paramView = null;
        }
        paramInt = 0;
      }
      if (paramInt >= paramView.length()) {}
    }
    for (;;)
    {
      try
      {
        paramp = (JSONObject)paramView.get(paramInt);
        if (paramp != null)
        {
          localf = new c.f();
          str = paramp.optString("id");
          f1 = bi.getFloat(paramp.optString("latitude"), 0.0F);
          f2 = bi.getFloat(paramp.optString("longitude"), 0.0F);
          double d1 = f1;
          double d2 = f2;
          localf.latitude = d1;
          localf.longitude = d2;
          paramJSONObject = paramp.optString("iconPath");
          f1 = f.a(paramp, "width", 0.0F);
          f2 = f.a(paramp, "height", 0.0F);
          if (!bi.oW(paramJSONObject))
          {
            localf.fTs = paramJSONObject;
            localf.fTy = f1;
            localf.fTz = f2;
          }
          localf.rotate = ((float)paramp.optDouble("rotate", 0.0D));
          localf.alpha = ((float)paramp.optDouble("alpha", 1.0D));
          localf.data = paramp.optString("data");
          if (!paramp.has("anchor")) {}
        }
      }
      catch (JSONException paramJSONObject)
      {
        try
        {
          paramJSONObject = new JSONObject(paramp.optString("anchor"));
          if (paramJSONObject != null)
          {
            localf.A((float)paramJSONObject.optDouble("x", 0.5D), (float)paramJSONObject.optDouble("y", 1.0D));
            paramJSONObject = paramp.optString("label");
            if (bi.oW(paramJSONObject)) {}
          }
        }
        catch (JSONException paramJSONObject)
        {
          try
          {
            paramJSONObject = new JSONObject(paramJSONObject);
            if (paramJSONObject != null)
            {
              localObject1 = paramJSONObject.optString("content");
              i = f.aQ(paramJSONObject.optString("color", ""), Color.parseColor("#000000"));
              j = paramJSONObject.optInt("fontSize", 12);
              k = f.a(paramJSONObject, "anchorX", f.a(paramJSONObject, "x", 0));
              m = f.a(paramJSONObject, "anchorY", f.a(paramJSONObject, "y", 0));
              int n = paramJSONObject.optInt("borderRadius", 0);
              int i1 = f.e(paramJSONObject, "borderWidth");
              int i2 = f.vO(paramJSONObject.optString("borderColor"));
              int i3 = f.aQ(paramJSONObject.optString("bgColor", ""), Color.parseColor("#000000"));
              int i4 = f.a(paramJSONObject, "padding", 0);
              localf.fTB = new c.f.b((String)localObject1, i, j, k, m, i3, n, i1, i2, paramJSONObject.optString("textAlign", ""), i4);
            }
            paramp = paramp.optString("callout");
            if (bi.oW(paramp)) {}
          }
          catch (JSONException paramJSONObject)
          {
            try
            {
              String str;
              float f2;
              int i;
              int k;
              paramp = new JSONObject(paramp);
              if (paramp != null) {
                localf.fTA = new c.f.a(paramp.optString("content"), f.aQ(paramp.optString("color", "#000000"), Color.parseColor("#000000")), paramp.optInt("fontSize", 12), paramp.optInt("borderRadius", 0), f.aQ(paramp.optString("bgColor", "#000000"), Color.parseColor("#000000")), f.a(paramp, "padding", 0), f.aQ(paramp.optString("shadowColor", "#000000"), Color.parseColor("#000000")), paramp.optInt("shadowOpacity"), paramp.optInt("shadowOffsetX"), paramp.optInt("shadowOffsetY"), paramp.optInt("display", 0), paramp.optString("textAlign", ""));
              }
              localObject1 = localc.fSW.ady();
              ((b.i)localObject1).h(localf.latitude, localf.longitude);
              if (!bi.oW(localf.title)) {
                ((b.i)localObject1).rF(localf.title);
              }
              ((b.i)localObject1).Y(localf.rotate);
              ((b.i)localObject1).Z(localf.alpha);
              paramJSONObject = null;
              paramp = paramJSONObject;
              if (!bi.oW(localf.fTs))
              {
                if ((localf.fTs == null) || (!localf.fTs.startsWith("wxfile://"))) {
                  continue;
                }
                localObject2 = AppBrandLocalMediaObjectManager.getItemByLocalId(localc.appId, localf.fTs);
                paramp = paramJSONObject;
                if (localObject2 != null) {
                  paramp = com.tencent.mm.sdk.platformtools.c.decodeFile(((AppBrandLocalMediaObject)localObject2).dDG, null);
                }
              }
              paramJSONObject = (FrameLayout)((LayoutInflater)localc.context.getSystemService("layout_inflater")).inflate(s.h.app_brand_map_marker_icon, null);
              localObject2 = (ImageView)paramJSONObject.findViewById(s.g.marker_icon);
              if (paramp != null)
              {
                if ((localf.fTy == 0.0F) || (localf.fTz == 0.0F))
                {
                  localf.fTy = f.lP(paramp.getWidth());
                  localf.fTz = f.lP(paramp.getHeight());
                }
                if ((localf.fTy > 0.0F) && (localf.fTz > 0.0F) && ((localf.fTy != paramp.getWidth()) || (localf.fTz != paramp.getHeight())))
                {
                  f1 = localf.fTy / paramp.getWidth();
                  f2 = localf.fTz / paramp.getHeight();
                  Object localObject3 = new Matrix();
                  ((Matrix)localObject3).postScale(f1, f2);
                  ((ImageView)localObject2).setImageBitmap(Bitmap.createBitmap(paramp, 0, 0, paramp.getWidth(), paramp.getHeight(), (Matrix)localObject3, true));
                  if ((localf.fTA == null) || (localf.fTA.fTH != c.f.a.fTK)) {
                    continue;
                  }
                  paramp = new LinearLayout(localc.context);
                  paramp.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                  paramp.setOrientation(1);
                  paramp.setGravity(17);
                  localObject3 = localc.a(localf.fTA);
                  ((LinearLayout)localObject3).setOnClickListener(new c.10(localc, str));
                  paramp.addView((View)localObject3);
                  paramp.addView(paramJSONObject);
                  paramp.measure(0, 0);
                  ((b.i)localObject1).bF(paramp);
                  i = paramp.getMeasuredHeight();
                  j = paramp.getMeasuredWidth();
                  k = ((ImageView)localObject2).getMeasuredHeight();
                  m = ((ImageView)localObject2).getMeasuredWidth();
                  if (j <= 0) {
                    break label1929;
                  }
                  if (m < j) {
                    continue;
                  }
                  f1 = localf.bhr;
                  f2 = 1.0F;
                  if (i > 0)
                  {
                    f2 = localf.bhs;
                    f2 = 1.0F - k * (1.0F - f2) / i;
                  }
                  x.d("MicroMSg.AppBrandMapView", "newAnchorX:%f, newAnchorY:%f", new Object[] { Float.valueOf(f1), Float.valueOf(f2) });
                  ((b.i)localObject1).A(f1, f2);
                  ((b.i)localObject1).bg(str);
                  ((b.i)localObject1).h(new c.11(localc));
                  ((b.i)localObject1).g(new c.12(localc));
                  ((b.i)localObject1).adJ();
                  localObject2 = new c.e(localc.fSW.a((b.i)localObject1), localf);
                  ((c.e)localObject2).data = localf.data;
                  localc.a(str, (c.e)localObject2);
                  if (localf.fTB != null)
                  {
                    localObject3 = localc.fSW.ady();
                    ((b.i)localObject3).h(localf.latitude, localf.longitude);
                    ((b.i)localObject1).Z(localf.alpha);
                    paramJSONObject = com.tencent.mm.plugin.appbrand.jsapi.f.a.a.aji();
                    paramp = paramJSONObject;
                    if (paramJSONObject == null) {
                      paramp = new e(localc.context);
                    }
                    paramp.setText("");
                    paramp.setTextSize(12);
                    paramp.setTextColor(e.gMp);
                    paramp.setTextPadding(0);
                    paramp.setGravity("center");
                    paramp.m(0, 0, e.gMq, e.gMq);
                    paramp.setTextColor(localf.fTB.color);
                    paramp.setTextSize(localf.fTB.fTC);
                    paramp.setText(localf.fTB.content);
                    paramp.setTextPadding(localf.fTB.padding);
                    paramp.setGravity(localf.fTB.fTI);
                    paramp.m(localf.fTB.fTD, localf.fTB.borderWidth, localf.fTB.fTL, localf.fTB.bgColor);
                    paramp.setX(localf.fTB.x);
                    paramp.setY(localf.fTB.y);
                    paramp.measure(0, 0);
                    ((b.i)localObject3).A(paramp.getAnchorX(), paramp.getAnchorY());
                    ((b.i)localObject3).bF(paramp);
                    ((b.i)localObject3).adJ();
                    ((b.i)localObject3).bg(str + "#label");
                    ((c.e)localObject2).fTw = localc.fSW.a((b.i)localObject3);
                    localc.a(str + "#label", (c.e)localObject2);
                  }
                  paramInt += 1;
                  break;
                  paramp = paramp;
                  x.printErrStackTrace("MicroMsg.JsApiAddMapMarkers", paramp, "", new Object[0]);
                  paramp = null;
                  continue;
                  paramJSONObject = paramJSONObject;
                  paramJSONObject = null;
                  continue;
                  localf.A(0.5F, 1.0F);
                  continue;
                  paramJSONObject = paramJSONObject;
                  paramJSONObject = null;
                }
              }
            }
            catch (JSONException paramp)
            {
              c.f localf;
              Object localObject1;
              int j;
              int m;
              Object localObject2;
              paramp = null;
              continue;
              paramp = o.j(com.tencent.mm.plugin.appbrand.a.pY(localc.appId), localf.fTs);
              continue;
              ((ImageView)localObject2).setImageBitmap(paramp);
              ((ImageView)localObject2).setScaleType(ImageView.ScaleType.CENTER);
              continue;
              x.e("MicroMSg.AppBrandMapView", "[addMarker] bitmap is null, use default");
              continue;
              f1 = 0.5F - (m - m * 2 * localf.bhr) / (j * 2);
              continue;
              ((b.i)localObject1).bF(paramJSONObject);
              ((b.i)localObject1).A(localf.bhr, localf.bhs);
              continue;
            }
          }
        }
      }
      return true;
      label1929:
      float f1 = 0.5F;
    }
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
      x.e("MicroMsg.JsApiAddMapMarkers", "get mapId error, exception : %s", new Object[] { paramJSONObject });
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/f/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */