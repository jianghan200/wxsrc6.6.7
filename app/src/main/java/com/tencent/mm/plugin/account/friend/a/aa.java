package com.tencent.mm.plugin.account.friend.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.avv;
import com.tencent.mm.protocal.c.avw;
import com.tencent.mm.protocal.c.avz;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public final class aa
  extends l
  implements k
{
  public final b diG;
  private com.tencent.mm.ab.e diJ;
  
  public aa(int paramInt)
  {
    b.a locala = new b.a();
    locala.dIG = new avv();
    locala.dIH = new avw();
    locala.uri = "/cgi-bin/micromsg-bin/newgetinvitefriend";
    locala.dIF = 135;
    locala.dII = 23;
    locala.dIJ = 1000000023;
    this.diG = locala.KT();
    ((avv)this.diG.dID.dIL).rQA = paramInt;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    paramq = (avw)this.diG.dIE.dIL;
    x.d("MicroMsg.NetSceneGetInviteFriend", "friend:" + paramq.jTa.size() + " group:" + paramq.rcM.size());
    paramArrayOfByte = new HashSet();
    LinkedList localLinkedList = new LinkedList();
    paramInt1 = 0;
    while (paramInt1 < paramq.rYO)
    {
      if (!paramArrayOfByte.contains(((avz)paramq.jTa.get(paramInt1)).hbL))
      {
        localLinkedList.add(paramq.jTa.get(paramInt1));
        paramArrayOfByte.add(((avz)paramq.jTa.get(paramInt1)).hbL);
      }
      paramInt1 += 1;
    }
    paramq.jTa = localLinkedList;
    paramq.rYO = localLinkedList.size();
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 135;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/account/friend/a/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */