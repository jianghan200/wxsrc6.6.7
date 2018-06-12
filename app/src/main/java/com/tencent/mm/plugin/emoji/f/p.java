package com.tencent.mm.plugin.emoji.f;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.agk;
import com.tencent.mm.protocal.c.agl;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class p
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  private int fdx;
  public byte[] iiN = null;
  private int iiY;
  
  public p(int paramInt, byte[] paramArrayOfByte)
  {
    this(paramInt, paramArrayOfByte, (byte)0);
  }
  
  private p(int paramInt, byte[] paramArrayOfByte, byte paramByte)
  {
    b.a locala = new b.a();
    locala.dIG = new agk();
    locala.dIH = new agl();
    locala.uri = "/cgi-bin/micromsg-bin/mmgetpersonaldesigner";
    locala.dIF = 720;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    this.iiY = paramInt;
    this.iiN = paramArrayOfByte;
    this.fdx = 0;
  }
  
  public static com.tencent.mm.plugin.emoji.model.f a(agl paramagl)
  {
    x.d("MicroMsg.emoji.NetSceneGetPersonalDesigner", "getEmotionListModel");
    if (paramagl == null) {
      return null;
    }
    com.tencent.mm.plugin.emoji.model.f localf = new com.tencent.mm.plugin.emoji.model.f();
    if ((paramagl != null) && (paramagl.rHC != null))
    {
      localf.ihp = paramagl.rHC.size();
      ArrayList localArrayList = new ArrayList();
      paramagl = paramagl.rHC.iterator();
      while (paramagl.hasNext())
      {
        ts localts = (ts)paramagl.next();
        if (localts.rem != null) {
          localArrayList.add(new com.tencent.mm.plugin.emoji.a.a.f(localts));
        }
      }
      localf.ihq = localArrayList;
    }
    return localf;
  }
  
  protected final int Cc()
  {
    return 100;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = (agk)this.diG.dID.dIL;
    parame1.rHi = this.iiY;
    if (this.iiN != null)
    {
      parame1.rcT = ab.O(this.iiN);
      parame1.otY = this.fdx;
      if (parame1.rcT != null) {
        break label94;
      }
    }
    label94:
    for (parame1 = "Buf is NULL";; parame1 = parame1.rcT.toString())
    {
      x.d("MicroMsg.emoji.NetSceneGetPersonalDesigner", parame1);
      return a(parame, this.diG, this);
      parame1.rcT = new bhy();
      break;
    }
  }
  
  protected final int a(q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.emoji.NetSceneGetPersonalDesigner", "NetSceneGetPersonalDesigner errType:%d,errcode:%d,errMsg:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = (agl)((b)paramq).dIE.dIL;
    if (paramq.rcT != null) {
      this.iiN = ab.a(paramq.rcT);
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final agl aET()
  {
    if (this.diG == null) {
      return null;
    }
    return (agl)this.diG.dIE.dIL;
  }
  
  public final int getType()
  {
    return 720;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/emoji/f/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */