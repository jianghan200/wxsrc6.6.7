package com.tencent.mm.plugin.address.model;

import com.tencent.mm.a.o;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.address.a.a;
import com.tencent.mm.protocal.c.bew;
import com.tencent.mm.protocal.c.bex;
import com.tencent.mm.protocal.c.bey;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class d
  extends com.tencent.mm.ab.l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public int status;
  
  public d(String paramString1, String paramString2, o paramo)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bew();
    ((b.a)localObject).dIH = new bex();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/rcptinfoimport";
    ((b.a)localObject).dIF = 582;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    StringBuilder localStringBuilder = new StringBuilder("a2key is ");
    if (!bi.oW(paramString1))
    {
      bool1 = true;
      localStringBuilder = localStringBuilder.append(bool1).append(", newa2key is ");
      if (bi.oW(paramString2)) {
        break label206;
      }
    }
    label206:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      x.d("MicroMsg.NetSceneRcptInfoImportYiXun", bool1);
      this.diG = ((b.a)localObject).KT();
      localObject = (bew)this.diG.dID.dIL;
      ((bew)localObject).reB = new bhy().bq(bi.WP(paramString1));
      ((bew)localObject).sgu = new bhy().bq(bi.WP(paramString2));
      ((bew)localObject).qq = paramo.intValue();
      return;
      bool1 = false;
      break;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneRcptInfoImportYiXun", "errType:" + paramInt2 + ",errCode:" + paramInt3 + ",errMsg" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (bex)((b)paramq).dIE.dIL;
      this.status = paramq.sgv;
      x.d("MicroMsg.NetSceneRcptInfoImportYiXun", "status : " + this.status);
      if ((paramq.sgt.sgw != null) && (this.status == 0))
      {
        x.d("MicroMsg.NetSceneRcptInfoImportYiXun", "resp.rImpl.rcptinfolist.rcptinfolist " + paramq.sgt.sgw.size());
        a.Zv();
        a.Zx().q(paramq.sgt.sgw);
        a.Zv();
        a.Zx().Zz();
      }
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 582;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/address/model/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */