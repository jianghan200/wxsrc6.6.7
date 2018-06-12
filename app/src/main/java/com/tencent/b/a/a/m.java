package com.tencent.b.a.a;

import android.content.Context;
import android.util.DisplayMetrics;
import org.json.JSONArray;
import org.json.JSONObject;

final class m
{
  private int bvI = 0;
  private JSONObject bvJ = null;
  protected Context context = null;
  
  m(Context paramContext, JSONObject paramJSONObject)
  {
    this.context = paramContext;
    this.bvI = ((int)(System.currentTimeMillis() / 1000L));
    this.bvJ = paramJSONObject;
  }
  
  final JSONObject tR()
  {
    JSONObject localJSONObject1 = new JSONObject();
    for (;;)
    {
      try
      {
        localJSONObject1.put("ky", "AVF4T76RVR81");
        localJSONObject1.put("et", 2);
        localJSONObject1.put("ts", this.bvI);
        localJSONObject1.put("si", this.bvI);
        s.a(localJSONObject1, "ui", s.aJ(this.context));
        s.a(localJSONObject1, "mc", s.aK(this.context));
        localObject1 = i.aF(this.context).tP();
        if (s.cj((String)localObject1))
        {
          localJSONObject1.put("mid", localObject1);
          localObject1 = new b(this.context);
          localJSONObject2 = new JSONObject();
        }
      }
      catch (Throwable localThrowable1)
      {
        Object localObject1;
        JSONObject localJSONObject2;
        return localJSONObject1;
      }
      try
      {
        if (b.bvh != null)
        {
          b.a locala = b.bvh;
          localJSONObject2.put("sr", locala.bvm.widthPixels + "*" + locala.bvm.heightPixels);
          s.a(localJSONObject2, "av", locala.bvk);
          s.a(localJSONObject2, "ch", locala.bvp);
          s.a(localJSONObject2, "mf", locala.bvo);
          s.a(localJSONObject2, "sv", locala.bvl);
          s.a(localJSONObject2, "ov", Integer.toString(locala.bvn));
          localJSONObject2.put("os", 1);
          s.a(localJSONObject2, "op", locala.bvq);
          s.a(localJSONObject2, "lg", locala.aem);
          s.a(localJSONObject2, "md", locala.model);
          s.a(localJSONObject2, "tz", locala.timezone);
          if (locala.bvs != 0) {
            localJSONObject2.put("jb", locala.bvs);
          }
          s.a(localJSONObject2, "sd", locala.bvr);
          s.a(localJSONObject2, "apn", locala.packageName);
          if (s.aI(locala.ctx))
          {
            localObject2 = new JSONObject();
            s.a((JSONObject)localObject2, "bs", s.aL(locala.ctx));
            s.a((JSONObject)localObject2, "ss", s.aM(locala.ctx));
            if (((JSONObject)localObject2).length() > 0) {
              s.a(localJSONObject2, "wf", ((JSONObject)localObject2).toString());
            }
          }
          Object localObject2 = s.aN(locala.ctx);
          if ((localObject2 != null) && (((JSONArray)localObject2).length() > 0)) {
            s.a(localJSONObject2, "wflist", ((JSONArray)localObject2).toString());
          }
          s.a(localJSONObject2, "ram", locala.bvt);
          s.a(localJSONObject2, "rom", locala.bvu);
          s.a(localJSONObject2, "im", locala.imsi);
        }
        s.a(localJSONObject2, "cn", ((b)localObject1).bvj);
        if (((b)localObject1).bvi != null) {
          localJSONObject2.put("tn", ((b)localObject1).bvi);
        }
        localJSONObject1.put("ev", localJSONObject2);
      }
      catch (Throwable localThrowable2)
      {
        continue;
      }
      if (this.bvJ == null) {
        break;
      }
      localJSONObject1.put("ext", this.bvJ);
      return localJSONObject1;
      localJSONObject1.put("mid", "0");
    }
    return localJSONObject1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/b/a/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */