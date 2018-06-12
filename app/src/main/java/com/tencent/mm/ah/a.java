package com.tencent.mm.ah;

import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.s;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import junit.framework.Assert;

public final class a
  extends l
  implements k
{
  private com.tencent.mm.storage.bd bGS = new com.tencent.mm.storage.bd();
  private com.tencent.mm.ab.e diJ;
  private ag handler = new a.1(this);
  
  public a(String paramString1, String paramString2)
  {
    this.bGS.setStatus(1);
    this.bGS.ep(paramString1);
    this.bGS.ay(com.tencent.mm.model.bd.iD(paramString1));
    this.bGS.eX(1);
    this.bGS.setContent(paramString2);
    this.bGS.setType(s.hQ(paramString1));
    au.HU();
    long l = c.FT().T(this.bGS);
    if (l != -1L) {}
    for (;;)
    {
      Assert.assertTrue(bool);
      x.i("MicroMsg.NetSceneSendMsgFake", "new msg inserted to db , local id = " + l);
      return;
      bool = false;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    x.i("MicroMsg.NetSceneSendMsgFake", "send local msg, msgId = " + this.bGS.field_msgId);
    this.handler.sendEmptyMessageDelayed(0, 500L);
    return 999;
  }
  
  protected final int a(q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneSendMsgFake", "recv local msg, msgId = " + this.bGS.field_msgId);
    this.bGS.setStatus(2);
    this.bGS.ay(com.tencent.mm.model.bd.o(this.bGS.field_talker, System.currentTimeMillis() / 1000L));
    au.HU();
    c.FT().a(this.bGS.field_msgId, this.bGS);
    this.diJ.a(0, 0, paramString, this);
  }
  
  public final int getType()
  {
    return 522;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ah/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */