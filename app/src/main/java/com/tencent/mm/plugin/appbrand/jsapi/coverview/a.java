package com.tencent.mm.plugin.appbrand.jsapi.coverview;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.plugin.appbrand.jsapi.o.c.b;
import com.tencent.mm.plugin.appbrand.jsapi.o.c.c;
import com.tencent.mm.plugin.appbrand.jsapi.o.c.d;
import com.tencent.mm.plugin.appbrand.jsapi.o.c.e;
import com.tencent.mm.plugin.appbrand.jsapi.o.c.f;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  public static void a(p paramp, View paramView, MotionEvent paramMotionEvent, String paramString, boolean paramBoolean)
  {
    int j = 0;
    int i = 0;
    int k = paramMotionEvent.getActionIndex();
    int m = paramMotionEvent.getPointerId(k);
    float f1 = paramMotionEvent.getX(k);
    float f2 = paramMotionEvent.getY(k);
    c.f localf = new c.f();
    localf.a(m, f1, f2);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("data", paramString);
      x.i("MicroMsg.InsertViewTouchEventDispatch", "action:%d", new Object[] { Integer.valueOf(paramMotionEvent.getAction()) });
      switch (paramMotionEvent.getAction())
      {
      default: 
        paramView = null;
      }
      for (;;)
      {
        if ((paramView != null) && (paramBoolean))
        {
          paramp = paramView.a(paramp);
          paramp.mData = localJSONObject.toString();
          paramp.h(null);
          label160:
          return;
        }
        try
        {
          localJSONObject.put("touch", localf.tR());
          paramView = new c.c();
          continue;
          paramView = new JSONArray();
          try
          {
            localJSONObject.put("touches", paramView);
            paramMotionEvent = y(paramMotionEvent);
            if (paramMotionEvent.length > 0) {
              while (i < paramMotionEvent.length)
              {
                paramView.put(paramMotionEvent[i].tR());
                i += 1;
              }
            }
            paramView = new c.d();
            continue;
            try
            {
              localJSONObject.put("touch", localf.tR());
              paramMotionEvent = new c.e();
              paramView.getParent().requestDisallowInterceptTouchEvent(false);
              paramView = paramMotionEvent;
              continue;
              paramView = new JSONArray();
              try
              {
                localJSONObject.put("touches", paramView);
                paramMotionEvent = y(paramMotionEvent);
                if (paramMotionEvent.length > 0)
                {
                  i = j;
                  while (i < paramMotionEvent.length)
                  {
                    paramView.put(paramMotionEvent[i].tR());
                    i += 1;
                  }
                }
                paramView = new c.b();
                continue;
                if (paramView == null) {
                  break label160;
                }
                paramp = paramView.a(paramp);
                paramp.mData = localJSONObject.toString();
                paramp.ahM();
                return;
              }
              catch (JSONException paramString)
              {
                for (;;) {}
              }
            }
            catch (JSONException paramMotionEvent)
            {
              for (;;) {}
            }
          }
          catch (JSONException paramString)
          {
            for (;;) {}
          }
        }
        catch (JSONException paramView)
        {
          for (;;) {}
        }
      }
    }
    catch (JSONException paramString)
    {
      for (;;) {}
    }
  }
  
  private static c.f[] y(MotionEvent paramMotionEvent)
  {
    int j = 0;
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramMotionEvent.getPointerCount())
    {
      c.f localf = new c.f();
      localf.id = paramMotionEvent.getPointerId(i);
      localf.x = paramMotionEvent.getX(i);
      localf.y = paramMotionEvent.getY(i);
      localArrayList.add(localf);
      i += 1;
    }
    paramMotionEvent = new c.f[localArrayList.size()];
    i = j;
    while (i < localArrayList.size())
    {
      paramMotionEvent[i] = ((c.f)localArrayList.get(i));
      i += 1;
    }
    return paramMotionEvent;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/coverview/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */