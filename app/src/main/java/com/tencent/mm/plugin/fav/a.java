package com.tencent.mm.plugin.fav;

import android.os.Looper;
import com.tencent.mm.ab.d.a;
import com.tencent.mm.ab.d.b;
import com.tencent.mm.g.a.fz;
import com.tencent.mm.plugin.fav.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.m;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;

public final class a
  implements m
{
  public final d.b a(String paramString, Map<String, String> paramMap, d.a parama)
  {
    x.i("MicroMsg.Fav.FavNewXmlConsumer", "consumeNewXml subtype: %s values: %s", new Object[] { paramString, paramMap.toString() });
    int i = -1;
    switch (paramString.hashCode())
    {
    default: 
      switch (i)
      {
      }
      break;
    }
    for (;;)
    {
      return null;
      if (!paramString.equals("uploadfavitem")) {
        break;
      }
      i = 0;
      break;
      if (!paramString.equals("resendfavitem")) {
        break;
      }
      i = 1;
      break;
      paramString = new fz();
      paramString.bOL.type = 38;
      paramString.bOL.bOU = ((String)paramMap.get(".sysmsg.favids"));
      com.tencent.mm.sdk.b.a.sFg.a(paramString, Looper.getMainLooper());
      h.pH(1);
      continue;
      paramString = new fz();
      paramString.bOL.type = 39;
      paramString.bOL.bOU = ((String)paramMap.get(".sysmsg.favitem.favid"));
      paramString.bOL.bOV = ((String)paramMap.get(".sysmsg.favitem.dataidlist"));
      com.tencent.mm.sdk.b.a.sFg.a(paramString, Looper.getMainLooper());
      h.pH(0);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/fav/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */