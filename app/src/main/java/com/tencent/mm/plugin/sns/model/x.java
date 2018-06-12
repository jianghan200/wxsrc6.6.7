package com.tencent.mm.plugin.sns.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.sns.storage.t;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.protocal.c.bps;
import com.tencent.mm.protocal.c.bpx;
import com.tencent.mm.protocal.c.bpy;
import com.tencent.mm.sdk.platformtools.bi;

public final class x
  extends l
  implements k
{
  private int bNI;
  private b diG;
  public com.tencent.mm.ab.e diJ;
  private long noJ = 0L;
  
  public x(long paramLong, String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneSnsTagOption", "opcode 3 snsTagId " + paramLong + " tagName " + paramString);
    this.noJ = paramLong;
    this.bNI = 3;
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bpx();
    ((b.a)localObject).dIH = new bpy();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnstagoption";
    ((b.a)localObject).dIF = 290;
    ((b.a)localObject).dII = 114;
    ((b.a)localObject).dIJ = 1000000114;
    this.diG = ((b.a)localObject).KT();
    localObject = (bpx)this.diG.dID.dIL;
    ((bpx)localObject).qZc = 3;
    ((bpx)localObject).snO = paramLong;
    ((bpx)localObject).jSt = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneSnsTagOption", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramq = ((bpy)((b)paramq).dIE.dIL).snQ;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneSnsTagOption", paramq.toString());
    switch (this.bNI)
    {
    }
    for (;;)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      paramArrayOfByte = af.byu().fk(paramq.snO);
      paramArrayOfByte.field_tagId = paramq.snO;
      paramArrayOfByte.field_tagName = bi.aG(paramq.jSt, "");
      paramArrayOfByte.field_count = paramq.hbF;
      paramArrayOfByte.co(paramq.hbG);
      af.byu().a(paramArrayOfByte);
      continue;
      paramInt1 = af.byu().fl(this.noJ);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneSnsTagOption", "MM_SNS_TAG_DEL " + paramInt1);
    }
  }
  
  public final int getType()
  {
    return 290;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */