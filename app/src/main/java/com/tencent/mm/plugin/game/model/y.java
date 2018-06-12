package com.tencent.mm.plugin.game.model;

import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.x;

public final class y
  implements e
{
  public y()
  {
    g.DF().a(1223, this);
  }
  
  public static void b(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3)
  {
    x.i("MicroMsg.GameMsgReportService", "appId = %s, opType = %d, opStatus = %d, extInfo = %s", new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString3 });
    paramString1 = new bb(paramString1, paramInt1, paramInt2, paramString2, paramString3);
    g.DF().a(paramString1, 0);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/model/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */