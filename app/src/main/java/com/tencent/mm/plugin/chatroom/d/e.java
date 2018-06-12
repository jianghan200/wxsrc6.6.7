package com.tencent.mm.plugin.chatroom.d;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.model.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ali;
import com.tencent.mm.protocal.c.pp;
import com.tencent.mm.protocal.c.pq;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;

public final class e
  extends l
  implements k
{
  private LinkedList<ali> bTM;
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  
  public e(LinkedList<ali> paramLinkedList)
  {
    this.bTM = paramLinkedList;
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new pp();
    ((b.a)localObject).dIH = new pq();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/collectchatroom";
    ((b.a)localObject).dIF = 181;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (pp)this.diG.dID.dIL;
    ((pp)localObject).rtS = paramLinkedList;
    ((pp)localObject).rtR = paramLinkedList.size();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneCollectChatRoom", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if (paramq.Id().qWB != 0)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (this.bTM != null)
    {
      paramq = this.bTM.iterator();
      while (paramq.hasNext())
      {
        paramArrayOfByte = (ali)paramq.next();
        x.d("MicroMsg.NetSceneCollectChatRoom", "del groupcard Name :" + paramArrayOfByte.rNX);
        m.gF(paramArrayOfByte.rNX);
      }
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 181;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/chatroom/d/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */