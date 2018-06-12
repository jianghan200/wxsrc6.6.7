package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.oc;
import com.tencent.mm.protocal.c.od;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class ab
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  private a qAg;
  
  public ab(String paramString1, String paramString2, String paramString3, int paramInt, a parama)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new oc();
    ((b.a)localObject).dIH = new od();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/checkmd5";
    ((b.a)localObject).dIF = 939;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (oc)this.diG.dID.dIL;
    ((oc)localObject).fileid = paramString1;
    ((oc)localObject).bKg = paramString2;
    ((oc)localObject).rsn = paramString3;
    ((oc)localObject).rso = paramInt;
    this.qAg = parama;
    x.i("MicroMsg.NetSceneCheckMd5", "summersafecdn NetSceneCheckMd5 fileid[%s], md5[%s], newmd5[%s], crc[%d], stack[%s]", new Object[] { ((oc)localObject).fileid, ((oc)localObject).bKg, ((oc)localObject).rsn, Integer.valueOf(((oc)localObject).rso), bi.cjd() });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneCheckMd5", "summersafecdn onGYNetEnd [%d, %d, %s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.diJ.a(paramInt2, paramInt3, paramString, this);
    if (this.qAg != null)
    {
      if ((paramInt2 == 0) && (paramInt3 == 0)) {
        break label89;
      }
      paramString = this.qAg;
    }
    for (;;)
    {
      paramArrayOfByte = "";
      paramq = paramString;
      for (paramString = paramArrayOfByte;; paramString = paramArrayOfByte)
      {
        paramq.ac(paramString, paramInt2, paramInt3);
        return;
        label89:
        paramq = (od)((b)paramq).dIE.dIL;
        paramString = this.qAg;
        if (paramq == null) {
          break;
        }
        paramArrayOfByte = paramq.aeskey;
        paramq = paramString;
      }
    }
  }
  
  public final int getType()
  {
    return 939;
  }
  
  public static abstract interface a
  {
    public abstract void ac(String paramString, int paramInt1, int paramInt2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/model/app/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */