package com.tencent.mm.plugin.game;

import android.content.Context;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.plugin.game.a.a;
import com.tencent.mm.plugin.game.d.ax;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.plugin.game.model.f;
import com.tencent.mm.plugin.game.model.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  implements a
{
  public final void P(String paramString1, String paramString2, String paramString3)
  {
    an.P(paramString1, paramString2, paramString3);
  }
  
  public final void S(String paramString, int paramInt1, int paramInt2)
  {
    an.T(paramString, paramInt1, paramInt2);
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, String paramString4, String paramString5)
  {
    an.a(paramContext, paramString1, paramString2, paramString3, paramInt1, paramInt2, paramInt3, paramString4, 0L, paramString5);
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, String paramString4, int paramInt2)
  {
    an.a(paramContext, paramString1, paramString2, paramString3, paramInt1, paramString4, paramInt2);
  }
  
  public final void a(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, int paramInt3)
  {
    an.a(paramString1, paramString2, paramInt1, paramInt2, paramString3, paramInt3);
  }
  
  public final void a(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, long paramLong)
  {
    an.a(paramString1, paramString2, paramInt1, paramInt2, paramString3, paramLong);
  }
  
  public final boolean aSd()
  {
    try
    {
      Object localObject = h.aTL();
      boolean bool;
      if (((h)localObject).jLN != null)
      {
        bool = ((h)localObject).jLN.jRm;
        x.i("MicroMsg.GameConfigManager", "getShowEntrance : " + bool);
        return bool;
      }
      ((h)localObject).Zy();
      localObject = w.d(ad.getContext().getSharedPreferences(ad.chY(), 0));
      x.i("MicroMsg.GameConfigManager", "getShowEntrance, lang = %s", new Object[] { localObject });
      if ("zh_CN".equals(localObject)) {}
      for (localObject = "0";; localObject = "1")
      {
        localObject = bi.aG(g.AT().getValue("HideGameCenter"), (String)localObject);
        x.i("MicroMsg.GameConfigManager", "hide game center:[%s]", new Object[] { localObject });
        bool = ((String)localObject).equalsIgnoreCase("0");
        break;
      }
      return true;
    }
    catch (Exception localException) {}
  }
  
  public final void dn(Context paramContext)
  {
    f.dn(paramContext);
  }
  
  public final void q(Context paramContext, String paramString1, String paramString2)
  {
    an.q(paramContext, paramString1, paramString2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */