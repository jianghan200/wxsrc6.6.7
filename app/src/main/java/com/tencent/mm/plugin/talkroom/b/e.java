package com.tencent.mm.plugin.talkroom.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bsj;
import com.tencent.mm.protocal.c.bsk;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class e
  extends f
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  private final String kGu;
  private int sceneType = 0;
  
  public e(String paramString, int paramInt1, long paramLong, int paramInt2)
  {
    this.sceneType = paramInt2;
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bsj();
    ((b.a)localObject).dIH = new bsk();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/talknoop";
    ((b.a)localObject).dIF = 335;
    ((b.a)localObject).dII = 149;
    ((b.a)localObject).dIJ = 1000000149;
    this.diG = ((b.a)localObject).KT();
    localObject = (bsj)this.diG.dID.dIL;
    ((bsj)localObject).rxG = paramInt1;
    ((bsj)localObject).rxH = paramLong;
    ((bsj)localObject).rca = ((int)bi.VE());
    this.kGu = paramString;
    ((bsj)localObject).otY = paramInt2;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.d("MicroMsg.NetSceneTalkNoop", "doScene");
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneTalkNoop", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
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
    return 335;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/talkroom/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */