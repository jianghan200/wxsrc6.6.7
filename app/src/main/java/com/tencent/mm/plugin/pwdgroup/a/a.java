package com.tencent.mm.plugin.pwdgroup.a;

import com.tencent.mm.aa.j;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.modelstat.o;
import com.tencent.mm.protocal.c.vr;
import com.tencent.mm.protocal.c.vs;
import com.tencent.mm.protocal.c.vt;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class a
  extends l
  implements com.tencent.mm.network.k
{
  public int bOa;
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public a(int paramInt1, String paramString1, String paramString2, float paramFloat1, float paramFloat2, int paramInt2, int paramInt3, String paramString3, String paramString4)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new vr();
    ((b.a)localObject).dIH = new vs();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmfacingcreatechatroom";
    ((b.a)localObject).dIF = 653;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (vr)this.diG.dID.dIL;
    this.bOa = paramInt1;
    ((vr)localObject).qZc = paramInt1;
    ((vr)localObject).ryU = paramString1;
    ((vr)localObject).rwj = paramString2;
    ((vr)localObject).rmr = paramFloat2;
    ((vr)localObject).rms = paramFloat1;
    ((vr)localObject).ryV = paramInt2;
    if (!bi.oW(paramString3)) {
      ((vr)localObject).ryW = paramString3;
    }
    if (!bi.oW(paramString4)) {
      ((vr)localObject).ryX = paramString4;
    }
    ((vr)localObject).ryY = paramInt3;
    x.d("MicroMsg.Facing.NetSceneFacingCreateChatRoom", "OpCode:%d, Ticket:%s, Longitude:%f, Latitude:%f, Precision:%d, MackAddr:%s, CellId:%s, GPSSource:%d", new Object[] { Integer.valueOf(paramInt1), paramString2, Float.valueOf(paramFloat2), Float.valueOf(paramFloat1), Integer.valueOf(paramInt2), paramString3, paramString4, Integer.valueOf(paramInt3) });
    o.a(2007, paramFloat2, paramFloat1, paramInt2);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.Facing.NetSceneFacingCreateChatRoom", "netId:%d errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.bOa == 0)
    {
      paramq = bnR();
      if (paramq != null)
      {
        paramq = paramq.rbQ;
        if (paramq != null)
        {
          long l = System.currentTimeMillis();
          int i = paramq.size();
          paramArrayOfByte = new ArrayList();
          paramInt1 = 0;
          if (paramInt1 < i)
          {
            vt localvt = (vt)paramq.get(paramInt1);
            j localj = new j();
            if (!bi.oW(localvt.hbL)) {}
            for (localj.username = localvt.hbL;; localj.username = localvt.ryZ)
            {
              x.d("MicroMsg.Facing.NetSceneFacingCreateChatRoom", "cpan[onGYNetEnd]UserName:%s SmallImgUrl:%s", new Object[] { localvt.hbL, localvt.rwN });
              localj.dHQ = localvt.rwN;
              localj.by(true);
              paramArrayOfByte.add(localj);
              paramInt1 += 1;
              break;
            }
          }
          com.tencent.mm.aa.q.KH().L(paramArrayOfByte);
          x.d("MicroMsg.Facing.NetSceneFacingCreateChatRoom", "use time:%s", new Object[] { System.currentTimeMillis() - l });
        }
      }
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final vs bnR()
  {
    return (vs)this.diG.dIE.dIL;
  }
  
  public final int getType()
  {
    return 653;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/pwdgroup/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */