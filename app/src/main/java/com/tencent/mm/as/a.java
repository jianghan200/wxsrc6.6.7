package com.tencent.mm.as;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.agy;
import com.tencent.mm.protocal.c.agz;
import com.tencent.mm.sdk.platformtools.bi;

public final class a
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ = null;
  public String ede = null;
  public String edf = null;
  public byte[] edg = null;
  
  public a()
  {
    this(com.tencent.mm.model.q.GF(), bi.f((Integer)g.Ei().DT().get(66561, null)), 0);
  }
  
  public a(String paramString, int paramInt)
  {
    this(paramString, paramInt, 0);
  }
  
  public a(String paramString, int paramInt1, int paramInt2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new agy();
    ((b.a)localObject).dIH = new agz();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getqrcode";
    ((b.a)localObject).dIF = 168;
    ((b.a)localObject).dII = 67;
    ((b.a)localObject).dIJ = 1000000067;
    this.diG = ((b.a)localObject).KT();
    localObject = (agy)this.diG.dID.dIL;
    ((agy)localObject).rvi = ab.oT(paramString);
    ((agy)localObject).rKl = paramInt1;
    ((agy)localObject).qZc = paramInt2;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetQRCode", "username:%s, style:%d, opcode:%d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetQRCode", "onGYNetEnd errType:" + paramInt2 + " errCode" + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramArrayOfByte = (agy)this.diG.dID.dIL;
      paramq = (agz)this.diG.dIE.dIL;
      paramArrayOfByte = ab.a(paramArrayOfByte.rvi);
      this.edg = ab.a(paramq.rKm, new byte[0]);
      this.ede = paramq.rKn;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetQRCode", "expiredWording:%s, revokeId:%s, revokeWording:%s", new Object[] { this.ede, paramq.rKo, paramq.rKp });
      if (com.tencent.mm.model.q.GF().equals(paramArrayOfByte))
      {
        paramArrayOfByte = paramq.rKo;
        String str = (String)g.Ei().DT().get(66563, "");
        if ((paramArrayOfByte != null) && (!str.equals(paramArrayOfByte)))
        {
          g.Ei().DT().set(66563, paramArrayOfByte);
          this.edf = paramq.rKp;
        }
        g.Ei().DT().set(66561, Integer.valueOf(paramq.rKl));
      }
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 168;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/as/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */