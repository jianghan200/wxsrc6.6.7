package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ble;
import com.tencent.mm.protocal.c.blf;
import com.tencent.mm.protocal.c.cce;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class m
  extends l
  implements k
{
  private b diG = null;
  private com.tencent.mm.ab.e diJ;
  private ble krE = null;
  public blf krF = null;
  
  public m(int paramInt1, int paramInt2, LinkedList<cce> paramLinkedList)
  {
    b.a locala = new b.a();
    locala.dIG = new ble();
    locala.dIH = new blf();
    locala.dIF = 871;
    locala.uri = "/cgi-bin/micromsg-bin/sendwcofeedback";
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    this.krE = ((ble)this.diG.dID.dIL);
    this.krE.rXf = paramInt2;
    this.krE.skm = paramLinkedList;
    this.krE.skl = paramLinkedList.size();
    this.krE.skn = paramInt1;
    x.i("MicroMsg.NetSceneIPCallSendFeedback", "NetSceneIPCallSendFeedback roomid=%d, level=%d, feedbackCount=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramLinkedList.size()) });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneIPCallSendFeedback", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.krF = ((blf)((b)paramq).dIE.dIL);
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 871;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/d/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */