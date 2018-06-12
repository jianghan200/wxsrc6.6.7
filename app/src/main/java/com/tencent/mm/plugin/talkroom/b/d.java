package com.tencent.mm.plugin.talkroom.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bsh;
import com.tencent.mm.protocal.c.bsi;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class d
  extends f
{
  public int actionType;
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  private final String kGu;
  public int owV;
  private int sceneType = 0;
  
  public d(int paramInt1, long paramLong, int paramInt2, String paramString, int paramInt3)
  {
    this.sceneType = paramInt3;
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bsh();
    ((b.a)localObject).dIH = new bsi();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/talkmicaction";
    ((b.a)localObject).dIF = 334;
    ((b.a)localObject).dII = 146;
    ((b.a)localObject).dIJ = 1000000146;
    this.diG = ((b.a)localObject).KT();
    localObject = (bsh)this.diG.dID.dIL;
    ((bsh)localObject).rxG = paramInt1;
    ((bsh)localObject).rxH = paramLong;
    ((bsh)localObject).rDF = paramInt2;
    ((bsh)localObject).rca = ((int)bi.VE());
    this.actionType = paramInt2;
    this.kGu = paramString;
    ((bsh)localObject).otY = paramInt3;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.d("MicroMsg.NetSceneTalkMicAction", "doScene");
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneTalkMicAction", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    this.owV = ((bsi)this.diG.dIE.dIL).rxI;
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
    return 334;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/talkroom/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */