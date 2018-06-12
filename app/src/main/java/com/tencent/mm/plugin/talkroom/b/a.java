package com.tencent.mm.plugin.talkroom.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bsl;
import com.tencent.mm.protocal.c.bsm;
import com.tencent.mm.protocal.c.tw;
import com.tencent.mm.protocal.c.tx;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
  extends f
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  private final String kGu;
  public int kpo;
  public long kpp;
  public int owV;
  public int owW;
  public LinkedList<bsl> owY;
  public LinkedList<bsm> oxr;
  private int sceneType = 0;
  
  public a(String paramString, int paramInt)
  {
    b.a locala = new b.a();
    this.sceneType = paramInt;
    locala.dIG = new tw();
    locala.dIH = new tx();
    locala.uri = "/cgi-bin/micromsg-bin/entertalkroom";
    locala.dIF = 332;
    locala.dII = 147;
    locala.dIJ = 1000000147;
    this.diG = locala.KT();
    ((tw)this.diG.dID.dIL).rxF = paramString;
    ((tw)this.diG.dID.dIL).otY = paramInt;
    this.kGu = paramString;
  }
  
  private static LinkedList<bsm> ah(LinkedList<bsm> paramLinkedList)
  {
    LinkedList localLinkedList = new LinkedList();
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      bsm localbsm = (bsm)paramLinkedList.next();
      if (!bi.oW(localbsm.hbL)) {
        localLinkedList.add(localbsm);
      }
    }
    return localLinkedList;
  }
  
  private static LinkedList<bsl> ai(LinkedList<bsl> paramLinkedList)
  {
    LinkedList localLinkedList = new LinkedList();
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext()) {
      localLinkedList.add((bsl)paramLinkedList.next());
    }
    return localLinkedList;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.d("MicroMsg.NetSceneEnterTalkRoom", "doScene %d", new Object[] { Integer.valueOf(this.sceneType) });
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneEnterTalkRoom", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramq = (tx)this.diG.dIE.dIL;
    x.i("MicroMsg.NetSceneEnterTalkRoom", "resp %s", new Object[] { paramq.toString() });
    this.kpo = paramq.rxG;
    this.kpp = paramq.rxH;
    this.owV = paramq.rxI;
    this.owW = paramq.rxK;
    this.oxr = ah(paramq.rbQ);
    this.owY = ai(paramq.rfi);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final String bHj()
  {
    return this.kGu;
  }
  
  public final int bHk()
  {
    return this.sceneType;
  }
  
  public final int getType()
  {
    return 332;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/talkroom/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */