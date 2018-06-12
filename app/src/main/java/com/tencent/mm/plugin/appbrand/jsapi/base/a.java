package com.tencent.mm.plugin.appbrand.jsapi.base;

import android.view.View;
import com.tencent.mm.model.u.b;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.o.b.a;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.page.p.e;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class a
  extends d
{
  private void a(final c paramc, final int paramInt, final p paramp, final JSONObject paramJSONObject)
  {
    ah.A(new Runnable()
    {
      public final void run()
      {
        if (paramp == null)
        {
          x.w("MicroMsg.BaseInsertViewJsApi", "page view has been release.");
          paramc.E(paramInt, a.this.f("fail:page is null", null));
          return;
        }
        View localView = a.this.a(paramp, paramJSONObject);
        if (localView == null)
        {
          x.w("MicroMsg.BaseInsertViewJsApi", "inflate view return null.");
          paramc.E(paramInt, a.this.f("inflate view failed", null));
          return;
        }
        int i;
        try
        {
          i = a.this.k(paramJSONObject);
          if (paramp.agU().lw(i))
          {
            x.w("MicroMsg.BaseInsertViewJsApi", "insert view(%d) failed, it has been inserted before.", new Object[] { Integer.valueOf(i) });
            paramc.E(paramInt, a.this.f("fail:the view has already exist", null));
            return;
          }
        }
        catch (JSONException localJSONException1)
        {
          paramc.E(paramInt, a.this.f("fail:invalid view id", null));
          return;
        }
        int j = paramJSONObject.optInt("parentId", 0);
        for (;;)
        {
          try
          {
            localObject1 = a.l(paramJSONObject);
            int k = a.m(paramJSONObject);
            localObject2 = a.n(paramJSONObject);
            localObject3 = paramp.agU();
            if ((localObject2 == null) || (!((Boolean)localObject2).booleanValue())) {
              continue;
            }
            bool = true;
            bool = ((u)localObject3).a(localJSONException1, i, j, (float[])localObject1, k, bool);
          }
          catch (JSONException localJSONException2)
          {
            Object localObject1;
            Object localObject2;
            Object localObject3;
            u.b localb;
            x.e("MicroMsg.BaseInsertViewJsApi", "parse position error. Exception :%s", new Object[] { localJSONException2 });
            boolean bool = false;
            continue;
            str.setOnTouchListener(new b.a((p)localObject2, localb));
            continue;
            String str = "fail:insert view fail";
            continue;
          }
          if (bool)
          {
            localObject1 = a.this;
            localObject2 = paramp;
            localObject3 = paramJSONObject;
            if (((a)localObject1).aii())
            {
              localb = ((p)localObject2).agU().E(i, true);
              localb.w("disableScroll", ((JSONObject)localObject3).optBoolean("disableScroll", false));
              localb.w("enableLongClick", ((a)localObject1).aij());
              localb.O("data", ((JSONObject)localObject3).optString("data"));
              if (((JSONObject)localObject3).optBoolean("gesture", false))
              {
                if ((localObject2 != null) && (localJSONException1 != null) && (localb != null)) {
                  continue;
                }
                x.i("MicroMsg.ViewMotionHelper", "setOnTouchListener failed, page or view or keyValueSet is null.");
              }
            }
            a.this.a(paramp, i, localJSONException1, paramJSONObject);
          }
          localObject3 = a.this;
          localObject1 = paramp;
          localObject2 = ((p)localObject1).agU().E(i, true);
          if ((p.e)((u.b)localObject2).get("baseViewDestroyListener", null) == null)
          {
            localObject3 = new a.2((a)localObject3, (p)localObject1, i, (u.b)localObject2);
            ((u.b)localObject2).p("baseViewDestroyListener", localObject3);
            ((p)localObject1).a((p.e)localObject3);
          }
          x.i("MicroMsg.BaseInsertViewJsApi", "insert view(parentId : %s, viewId : %s, view : %s, r : %s)", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(localJSONException1.hashCode()), Boolean.valueOf(bool) });
          localObject1 = paramc;
          i = paramInt;
          localObject2 = a.this;
          if (!bool) {
            continue;
          }
          str = "ok";
          ((c)localObject1).E(i, ((e)localObject2).f(str, null));
          return;
          bool = false;
        }
      }
    });
  }
  
  public abstract View a(p paramp, JSONObject paramJSONObject);
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    super.a(paraml, paramJSONObject, paramInt);
    p localp = d(paraml);
    if (localp == null)
    {
      x.w("MicroMsg.BaseInsertViewJsApi", "invoke JsApi insertView failed, current page view is null.");
      paraml.E(paramInt, f("fail:page is null", null));
      return;
    }
    a(paraml, paramInt, localp, paramJSONObject);
  }
  
  public void a(p paramp, int paramInt, View paramView, JSONObject paramJSONObject) {}
  
  public void a(p paramp, JSONObject paramJSONObject, int paramInt)
  {
    super.a(paramp, paramJSONObject, paramInt);
    a(paramp, paramInt, paramp, paramJSONObject);
  }
  
  public boolean aii()
  {
    return false;
  }
  
  public boolean aij()
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/base/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */