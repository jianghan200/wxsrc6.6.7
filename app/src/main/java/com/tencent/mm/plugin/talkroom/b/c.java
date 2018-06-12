package com.tencent.mm.plugin.talkroom.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aik;
import com.tencent.mm.protocal.c.ail;
import com.tencent.mm.protocal.c.bsm;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;

public final class c
  extends f
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  private final String kGu;
  public int owV;
  public LinkedList<bsm> oxr;
  private int sceneType = 0;
  
  public c(int paramInt1, long paramLong, String paramString, int paramInt2)
  {
    this.sceneType = paramInt2;
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new aik();
    ((b.a)localObject).dIH = new ail();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/gettalkroommember";
    ((b.a)localObject).dIF = 336;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (aik)this.diG.dID.dIL;
    ((aik)localObject).rxG = paramInt1;
    ((aik)localObject).rxH = paramLong;
    this.kGu = paramString;
    ((aik)localObject).otY = paramInt2;
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
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.d("MicroMsg.NetSceneGetTalkRoomMember", "doScene");
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneGetTalkRoomMember", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramq = (ail)this.diG.dIE.dIL;
    x.i("MicroMsg.NetSceneGetTalkRoomMember", "resp %s", new Object[] { paramq.toString() });
    this.owV = paramq.rxI;
    this.oxr = ah(paramq.rbQ);
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
    return 336;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/talkroom/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */