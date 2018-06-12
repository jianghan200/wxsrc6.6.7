package com.tencent.mm.plugin.nearby.a;

import com.tencent.mm.aa.j;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.protocal.c.aqv;
import com.tencent.mm.protocal.c.aqw;
import com.tencent.mm.protocal.c.aqx;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class e
  extends l
  implements com.tencent.mm.network.k
{
  final b diG;
  private com.tencent.mm.ab.e diJ;
  
  public e(String paramString)
  {
    b.a locala = new b.a();
    locala.dIG = new aqw();
    locala.dIH = new aqx();
    locala.uri = "/cgi-bin/micromsg-bin/getroommember";
    locala.dIF = 377;
    locala.dII = 184;
    locala.dIJ = 1000000184;
    this.diG = locala.KT();
    ((aqw)this.diG.dID.dIL).ebL = paramString;
    x.d("MicroMsg.NetSceneLbsRoomGetMember", "Req: roomName:" + paramString);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneLbsRoomGetMember", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    paramq = (aqx)this.diG.dIE.dIL;
    if (paramInt2 != 0)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramArrayOfByte = new ArrayList();
    paramInt1 = 0;
    while (paramInt1 < paramq.rbQ.size())
    {
      j localj = new j();
      localj.username = ((aqv)paramq.rbQ.get(paramInt1)).hbL;
      localj.dHR = ((aqv)paramq.rbQ.get(paramInt1)).rqZ;
      localj.dHQ = ((aqv)paramq.rbQ.get(paramInt1)).rra;
      localj.by(true);
      paramArrayOfByte.add(localj);
      paramInt1 += 1;
    }
    com.tencent.mm.aa.q.KH().L(paramArrayOfByte);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 377;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/nearby/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */