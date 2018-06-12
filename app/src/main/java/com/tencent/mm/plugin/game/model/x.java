package com.tencent.mm.plugin.game.model;

import com.tencent.mm.g.a.go;
import com.tencent.mm.g.a.go.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.a.c;
import com.tencent.mm.sdk.platformtools.bi;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class x
{
  public static void a(go paramgo)
  {
    paramgo = paramgo.bPJ.bPE;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.GameJsapiProcessor", "writeMsg param=%s", new Object[] { paramgo });
    if (paramgo != null) {
      try
      {
        paramgo = new JSONObject(paramgo);
        if ((paramgo.isNull("type")) || (bi.getInt(paramgo.optString("type"), 0) == 0))
        {
          new JSONArray();
          paramgo = paramgo.getJSONArray("localIdList");
          int j = paramgo.length();
          long[] arrayOfLong = new long[j];
          int i = 0;
          while (i < j)
          {
            arrayOfLong[i] = paramgo.getLong(i);
            i += 1;
          }
          ((c)g.l(c.class)).aSj().f(arrayOfLong);
          return;
        }
        if (bi.getInt(paramgo.optString("type"), 0) == 65536)
        {
          ((c)g.l(c.class)).aSj().fV("GameRawMessage", "update GameRawMessage set isRead=1 where 1=1");
          return;
        }
      }
      catch (JSONException paramgo)
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.GameJsapiProcessor", "JSONException : %s", new Object[] { paramgo.getMessage() });
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/model/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */