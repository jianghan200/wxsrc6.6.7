package com.tencent.mm.modelsimple;

import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.c.bkg;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.protocal.v.a;
import com.tencent.mm.sdk.platformtools.bi;
import junit.framework.Assert;

public final class w
  extends l
  implements k
{
  private final com.tencent.mm.network.q dJM = new b();
  private com.tencent.mm.ab.e diJ;
  
  public w(int paramInt, String paramString)
  {
    this(paramInt, paramString, "");
  }
  
  public w(int paramInt, String paramString1, String paramString2)
  {
    v.a locala = (v.a)this.dJM.KV();
    locala.qXa.hbL = com.tencent.mm.model.q.GF();
    bkg localbkg = locala.qXa;
    Object localObject = new StringBuilder();
    int i = paramInt;
    if (paramInt == 0) {
      i = 64;
    }
    StringBuilder localStringBuilder = ((StringBuilder)localObject).append(i).append(";");
    localObject = paramString1;
    if (paramString1 == null) {
      localObject = "";
    }
    localbkg.jSA = ((String)localObject);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneSendCard", "content:" + locala.qXa.jSA);
    Assert.assertTrue("empty sendcard", true);
    locala.qXa.rZh = 64;
    if ((paramString2 != null) && (paramString2.length() > 0)) {
      locala.qXa.sjW = paramString2;
    }
  }
  
  public w(String paramString)
  {
    v.a locala = (v.a)this.dJM.KV();
    locala.qXa.hbL = com.tencent.mm.model.q.GF();
    locala.qXa.jSA = paramString;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneSendCard", "content:" + paramString);
    locala.qXa.rKl = bi.f((Integer)g.Ei().DT().get(66561, null));
    Assert.assertTrue("empty sendcard", true);
    locala.qXa.rZh = 128;
  }
  
  public w(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    v.a locala = (v.a)this.dJM.KV();
    locala.qXa.hbL = com.tencent.mm.model.q.GF();
    locala.qXa.jSA = paramString;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneSendCard", "content:" + paramString);
    locala.qXa.rKl = bi.f((Integer)g.Ei().DT().get(66561, null));
    int i;
    if (paramBoolean1)
    {
      i = 1;
      if (!paramBoolean2) {
        break label143;
      }
    }
    label143:
    for (int j = 4;; j = 0)
    {
      Assert.assertTrue("empty sendcard", true);
      locala.qXa.rZh = (j | i | 0x0 | 0x0 | 0x8);
      return;
      i = 0;
      break;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.dJM, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    this.diJ.a(paramInt2, paramInt3, paramq.Id().qWD, this);
  }
  
  public final int getType()
  {
    return 26;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/modelsimple/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */