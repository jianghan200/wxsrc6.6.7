package com.tencent.mm.plugin.game.gamewebview.a;

import android.content.Context;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.plugin.game.model.am.a;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.protocal.c.yf;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;

public final class c
{
  public static void E(Context paramContext, int paramInt)
  {
    paramContext = am.a.g(12909, new Object[] { Integer.valueOf(5), Integer.valueOf(5), Integer.valueOf(1), Integer.valueOf(6), Integer.valueOf(0), null, Integer.valueOf(paramInt), Integer.valueOf(0), null, Integer.valueOf(bi.getInt(null, 0)), Integer.valueOf(an.getNetworkType(paramContext)), null });
    b.a locala = new b.a();
    locala.uri = "/cgi-bin/micromsg-bin/gamereportkv";
    locala.dIF = 427;
    locala.dII = 0;
    locala.dIJ = 0;
    yf localyf = new yf();
    localyf.rjL = d.qVI;
    localyf.rjM = d.qVH;
    localyf.rjN = d.qVK;
    localyf.rjO = d.qVL;
    localyf.rjP = w.chP();
    localyf.mEk = paramContext.eiF;
    localyf.rjQ = paramContext.jOg;
    locala.dIG = localyf;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */