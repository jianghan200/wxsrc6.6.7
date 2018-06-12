package com.tencent.mm.plugin.bottle.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.a;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.modelvoice.o;
import com.tencent.mm.network.k;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.bss;
import com.tencent.mm.protocal.c.bst;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class g
  extends l
  implements k
{
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  int hjW = 0;
  private com.tencent.mm.modelvoice.b hjZ;
  int msgType = -1;
  
  public g(String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bss();
    ((b.a)localObject).dIH = new bst();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/throwbottle";
    ((b.a)localObject).dIF = 154;
    ((b.a)localObject).dII = 53;
    ((b.a)localObject).dIJ = 1000000053;
    this.diG = ((b.a)localObject).KT();
    if (!bi.oW(paramString))
    {
      this.msgType = 1;
      localObject = (bss)this.diG.dID.dIL;
      ((bss)localObject).sde = 0;
      ((bss)localObject).jQd = this.msgType;
      ((bss)localObject).rdW = 0;
      ((bss)localObject).rdV = paramString.getBytes().length;
      ((bss)localObject).rvX = 0;
      ((bss)localObject).ruy = ab.O(paramString.getBytes());
      ((bss)localObject).rVk = com.tencent.mm.a.g.u((paramString + bi.VF()).getBytes());
    }
  }
  
  public g(String paramString, int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bss();
    ((b.a)localObject).dIH = new bst();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/throwbottle";
    ((b.a)localObject).dIF = 154;
    ((b.a)localObject).dII = 53;
    ((b.a)localObject).dIJ = 1000000053;
    this.diG = ((b.a)localObject).KT();
    if ((!bi.oW(paramString)) && (paramInt > 0))
    {
      this.msgType = 3;
      localObject = (bss)this.diG.dID.dIL;
      ((bss)localObject).rvX = paramInt;
      ((bss)localObject).rVk = paramString;
      ((bss)localObject).sde = 0;
      ((bss)localObject).jQd = this.msgType;
    }
  }
  
  private int nj(int paramInt)
  {
    a locala = new a();
    locala.msgType = paramInt;
    Object localObject = (bss)this.diG.dID.dIL;
    bst localbst = (bst)this.diG.dIE.dIL;
    locala.hjO = localbst.spY.size();
    locala.hjQ = 1;
    if (paramInt == 3)
    {
      locala.content = ((bss)localObject).rVk;
      locala.hjR = ((bss)localObject).rvX;
    }
    for (;;)
    {
      localObject = "";
      paramInt = 0;
      while (paramInt < localbst.spY.size())
      {
        localObject = (String)localObject + localbst.spY.get(paramInt);
        paramInt += 1;
      }
      locala.content = new String(ab.a(((bss)localObject).ruy));
    }
    locala.hjN = com.tencent.mm.a.g.u(((String)localObject).getBytes());
    locala.hjS = bi.VF();
    paramInt = 0;
    while (paramInt < localbst.spY.size())
    {
      localObject = c.wU(ab.a((bhz)localbst.spY.get(paramInt)));
      if (!bi.oW((String)localObject))
      {
        locala.hjP = ((String)localObject);
        i.auk().a(locala);
      }
      paramInt += 1;
    }
    return 0;
  }
  
  protected final int Cc()
  {
    return 10;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    if (this.msgType == 1) {
      this.msgType = (0 - this.msgType);
    }
    for (;;)
    {
      return a(parame, this.diG, this);
      if (this.msgType != 3) {
        break;
      }
      parame1 = (bss)this.diG.dID.dIL;
      parame1.jQd = 3;
      parame1.sde = 0;
      if (this.hjZ == null)
      {
        this.hjZ = com.tencent.mm.modelvoice.q.ok(parame1.rVk);
        this.hjW = 0;
        parame1.rdV = o.nM(parame1.rVk);
      }
      com.tencent.mm.modelvoice.g localg = this.hjZ.br(this.hjW, 6000);
      x.d("MicroMsg.NetSceneThrowBottle", "doScene READ file[" + parame1.rVk + "] read ret:" + localg.ret + " readlen:" + localg.bEG + " newOff:" + localg.eon + " netOff:" + this.hjW + " line:" + com.tencent.mm.compatible.util.g.getLine());
      if ((localg.ret < 0) || (localg.bEG == 0))
      {
        x.e("MicroMsg.NetSceneThrowBottle", "Err doScene READ file[" + parame1.rVk + "] read ret:" + localg.ret + " readlen:" + localg.bEG + " newOff:" + localg.eon + " netOff:" + this.hjW);
        com.tencent.mm.modelvoice.q.ol(parame1.rVk);
        return -1;
      }
      byte[] arrayOfByte = new byte[localg.bEG];
      System.arraycopy(localg.buf, 0, arrayOfByte, 0, localg.bEG);
      parame1.ruy = ab.O(arrayOfByte);
      parame1.rdW = this.hjW;
    }
    x.e("MicroMsg.NetSceneThrowBottle", "doScene Error Msg type: " + this.msgType);
    return -1;
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    paramq = (bss)((com.tencent.mm.ab.b)paramq).dID.dIL;
    if (paramq.jQd == 1) {
      return l.b.dJm;
    }
    if (paramq.jQd != 3) {
      return l.b.dJn;
    }
    if ((paramq.rdV == 0) || (paramq.rdV <= paramq.rdW) || (bi.oW(paramq.rVk)) || (bi.bC(ab.a(paramq.ruy)))) {
      return l.b.dJn;
    }
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneThrowBottle", "onGYNetEnd errtype:" + paramInt2 + " errCode:" + paramInt3);
    paramq = (bss)this.diG.dID.dIL;
    paramArrayOfByte = (bst)this.diG.dIE.dIL;
    if (paramInt2 == 4) {
      switch (paramInt3)
      {
      default: 
        c.nh(paramArrayOfByte.rGd);
        c.ng(paramArrayOfByte.rGc);
      }
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      x.d("MicroMsg.NetSceneThrowBottle", "ERR: onGYNetEnd errtype:" + paramInt2 + " errCode:" + paramInt3);
      com.tencent.mm.modelvoice.q.ol(paramq.rVk);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
    do
    {
      return;
      x.d("MicroMsg.NetSceneThrowBottle", "getStartPos " + paramArrayOfByte.rdW);
      x.d("MicroMsg.NetSceneThrowBottle", "getTotalLen " + paramArrayOfByte.rdV);
      x.d("MicroMsg.NetSceneThrowBottle", "getThrowCount " + paramArrayOfByte.rGc);
      x.d("MicroMsg.NetSceneThrowBottle", "getPickCount " + paramArrayOfByte.rGd);
      x.d("MicroMsg.NetSceneThrowBottle", "getDistance " + paramArrayOfByte.sdg);
      x.d("MicroMsg.NetSceneThrowBottle", "getBottleList " + paramArrayOfByte.spY.size());
      paramInt1 = 0;
      while (paramInt1 < paramArrayOfByte.spY.size())
      {
        x.d("MicroMsg.NetSceneThrowBottle", "bott id:" + paramArrayOfByte.spY.get(paramInt1));
        paramInt1 += 1;
      }
      if (paramq.jQd == 1)
      {
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        nj(1);
        return;
      }
      this.hjW += paramq.ruy.siI;
      if (this.hjW >= paramq.rdV)
      {
        c.nh(paramArrayOfByte.rGd);
        c.ng(paramArrayOfByte.rGc);
        nj(3);
        com.tencent.mm.modelvoice.q.ol(paramq.rVk);
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
      }
    } while (a(this.dIX, this.diJ) != -1);
    this.diJ.a(3, -1, "doScene failed", this);
  }
  
  protected final void a(l.a parama)
  {
    x.e("MicroMsg.NetSceneThrowBottle", "setSecurityCheckError:" + parama + " type:" + this.msgType);
  }
  
  public final int aui()
  {
    return ((bst)this.diG.dIE.dIL).sdg;
  }
  
  public final int getType()
  {
    return 154;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/bottle/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */