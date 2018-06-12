package com.tencent.mm.plugin.address.e;

import android.util.Log;
import com.tencent.mm.plugin.q.a.b;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
{
  public static String a(b paramb)
  {
    JSONObject localJSONObject = new JSONObject();
    if (paramb == null) {
      return localJSONObject.toString();
    }
    try
    {
      localJSONObject.put("type", paramb.type);
      if ((paramb.type != null) && (paramb.type.equals("1")))
      {
        localJSONObject.put("title", paramb.knB);
        localJSONObject.put("taxNumber", "");
        localJSONObject.put("companyAddress", "");
        localJSONObject.put("telephone", "");
        localJSONObject.put("bankName", "");
        localJSONObject.put("bankAccount", "");
      }
      for (;;)
      {
        return localJSONObject.toString();
        localJSONObject.put("title", paramb.title);
        if (paramb.knC == null) {
          break;
        }
        localJSONObject.put("taxNumber", paramb.knC);
        if (paramb.knI == null) {
          break label246;
        }
        localJSONObject.put("companyAddress", paramb.knI);
        if (paramb.knG == null) {
          break label258;
        }
        localJSONObject.put("telephone", paramb.knG);
        if (paramb.knE == null) {
          break label270;
        }
        localJSONObject.put("bankName", paramb.knE);
        if (paramb.knD == null) {
          break label282;
        }
        localJSONObject.put("bankAccount", paramb.knD);
      }
    }
    catch (JSONException paramb)
    {
      for (;;)
      {
        x.e("MicroMsg.InvoiceUtil", "put json value error : %s", new Object[] { Log.getStackTraceString(paramb) });
        continue;
        localJSONObject.put("taxNumber", "");
        continue;
        label246:
        localJSONObject.put("companyAddress", "");
        continue;
        label258:
        localJSONObject.put("telephone", "");
        continue;
        label270:
        localJSONObject.put("bankName", "");
        continue;
        label282:
        localJSONObject.put("bankAccount", "");
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/address/e/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */