package com.tencent.mm.modelsimple;

import com.tencent.mm.ab.j;
import com.tencent.mm.ab.o;
import com.tencent.mm.k.g;
import com.tencent.mm.model.au;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.protocal.c.gu;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.protocal.l.a;
import com.tencent.mm.protocal.l.b;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  extends com.tencent.mm.ab.l
  implements k
{
  private q dJM = new a();
  private com.tencent.mm.ab.e diJ;
  
  private c(boolean paramBoolean)
  {
    l.a locala = (l.a)this.dJM.KV();
    locala.netType = com.tencent.mm.protocal.l.getNetType(ad.getContext());
    if (paramBoolean) {}
    for (int i = 1;; i = 2)
    {
      locala.qWE = i;
      return;
    }
  }
  
  private static boolean QK()
  {
    int i;
    if (af.exS != -1) {
      i = af.exS;
    }
    boolean bool;
    for (;;)
    {
      bool = b.foreground;
      x.i("MicroMsg.NetSceneBgFg", "somr DynamicConfig checkBit:%d TestMuteRoomEnable:%d muteRoomDisable:%d fg:%b", new Object[] { Integer.valueOf(1), Integer.valueOf(af.exS), Integer.valueOf(i), Boolean.valueOf(bool) });
      if ((i & 0x1) == 0) {
        break;
      }
      return true;
      try
      {
        i = bi.getInt(g.AT().getValue("MuteRoomDisable"), 0);
      }
      catch (Exception localException)
      {
        x.printErrStackTrace("MicroMsg.NetSceneBgFg", localException, "", new Object[0]);
        i = 0;
      }
    }
    return bool;
  }
  
  public static void bN(boolean paramBoolean)
  {
    x.i("MicroMsg.NetSceneBgFg", "summerbgfg setBgFgForMuteRoom isFg[%s], accHasReady[%s] stack[%s]", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(au.HX()), bi.cjd() });
    if (!au.HX()) {
      return;
    }
    if ((au.DF() == null) || (au.DF().dJs == null) || (au.DF().dJs.Lr() == null))
    {
      x.i("MicroMsg.NetSceneBgFg", "summerbgfg setBgFgForMuteRoom push not rready");
      return;
    }
    au.DF().dJs.Lr().bB(paramBoolean);
    if (paramBoolean)
    {
      au.DF().a(new c(true), 0);
      return;
    }
    c localc = new c(QK());
    au.DF().a(localc, 0);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.dJM, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneBgFg", " ret[%d]", new Object[] { Integer.valueOf(((l.b)paramq.Id()).qWF.hUm) });
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 0;
  }
  
  public static final class a
    extends j
  {
    private final l.a eeV = new l.a();
    private final l.b eeW = new l.b();
    
    protected final k.d Ic()
    {
      return this.eeV;
    }
    
    public final k.e Id()
    {
      return this.eeW;
    }
    
    public final int getType()
    {
      return 0;
    }
    
    public final String getUri()
    {
      return null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/modelsimple/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */