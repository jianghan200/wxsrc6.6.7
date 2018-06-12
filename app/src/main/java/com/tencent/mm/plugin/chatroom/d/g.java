package com.tencent.mm.plugin.chatroom.d;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.model.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.qy;
import com.tencent.mm.protocal.c.qz;
import com.tencent.mm.protocal.c.rh;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class g
  extends l
  implements k
{
  public List<String> bTR;
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public g(String paramString, List<String> paramList)
  {
    this(paramString, paramList, 0);
  }
  
  public g(String paramString, List<String> paramList, int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new qy();
    ((b.a)localObject).dIH = new qz();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/delchatroommember";
    ((b.a)localObject).dIF = 179;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (qy)this.diG.dID.dIL;
    ((qy)localObject).rvj = paramString;
    paramString = new LinkedList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      rh localrh = new rh();
      localrh.rvo = ab.oT(str);
      paramString.add(localrh);
    }
    ((qy)localObject).rbQ = paramString;
    ((qy)localObject).hLg = paramString.size();
    ((qy)localObject).otY = paramInt;
    this.bTR = paramList;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneDelChatRoomMember", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramq = (qy)this.diG.dID.dIL;
    paramArrayOfByte = (qz)this.diG.dIE.dIL;
    if (this.diG.dIE.qWB != 0)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    m.a(paramq.rvj, paramArrayOfByte);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 179;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/chatroom/d/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */