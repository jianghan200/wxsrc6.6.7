package com.tencent.mm.plugin.voip.model.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.e;
import com.tencent.mm.model.q;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bzu;
import com.tencent.mm.protocal.c.caw;
import com.tencent.mm.protocal.c.cax;
import com.tencent.mm.sdk.platformtools.x;

public final class m
  extends n<caw, cax>
{
  public m(int paramInt1, bzu parambzu, byte[] paramArrayOfByte, long paramLong, int paramInt2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new caw();
    ((b.a)localObject).dIH = new cax();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipsync";
    ((b.a)localObject).dIF = 174;
    ((b.a)localObject).dII = 62;
    ((b.a)localObject).dIJ = 1000000062;
    this.diG = ((b.a)localObject).KT();
    localObject = (caw)this.diG.dID.dIL;
    ((caw)localObject).rxG = paramInt1;
    ((caw)localObject).sxh = parambzu;
    ((caw)localObject).rxH = paramLong;
    ((caw)localObject).seC = q.GF();
    ((caw)localObject).rnx = paramInt2;
    ((caw)localObject).rny = new bhy().bq(paramArrayOfByte);
    ((caw)localObject).suO = System.currentTimeMillis();
    x.i("MicroMsg.NetSceneVoipSync", "sync timestamp: " + ((caw)localObject).suO);
  }
  
  public final e bLm()
  {
    return new m.1(this);
  }
  
  public final int bLo()
  {
    return ((caw)this.diG.dID.dIL).rnx;
  }
  
  public final int getType()
  {
    return 174;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/voip/model/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */