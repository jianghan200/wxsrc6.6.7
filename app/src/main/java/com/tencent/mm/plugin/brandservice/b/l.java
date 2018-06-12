package com.tencent.mm.plugin.brandservice.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.asd;
import com.tencent.mm.protocal.c.asg;
import com.tencent.mm.protocal.c.ash;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class l
  extends com.tencent.mm.ab.l
  implements k
{
  public b diG;
  private com.tencent.mm.ab.e diJ;
  
  public l(String paramString, LinkedList<asd> paramLinkedList)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new asg();
    ((b.a)localObject).dIH = new ash();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/usrmsg/setrecvtmpmsgoption";
    ((b.a)localObject).dIF = 1030;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (asg)this.diG.dID.dIL;
    ((asg)localObject).rPS = paramString;
    ((asg)localObject).rUz = paramLinkedList;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    x.i("MicroMsg.brandservice.NetSceneSetRecvTmpMsgOption", "do scene");
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.brandservice.NetSceneSetRecvTmpMsgOption", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1030;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/brandservice/b/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */