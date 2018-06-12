package com.tencent.mm.plugin.account.friend.a;

import com.tencent.mm.ab.j;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.av;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.c.bnp;
import com.tencent.mm.protocal.c.brj;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;

public final class z
  extends l
  implements k
{
  public com.tencent.mm.network.q dJM = new a();
  private int dJp = 2;
  private com.tencent.mm.ab.e diJ;
  
  private z(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    r.a locala = (r.a)this.dJM.KV();
    locala.eKz.rfe = paramInt;
    locala.eKz.rhg = paramString1;
    locala.eKz.iwP = w.chP();
    locala.eKz.rhI = bi.WN(paramString2);
    locala.eKz.rwg = paramString3;
    paramString1 = locala.eKz;
    g.Eg();
    paramString1.reS = a.DA();
    locala.eKz.rwh = com.tencent.mm.compatible.e.q.getSimCountryIso();
    locala.eKz.rwi = 1;
  }
  
  public z(String paramString1, String paramString2)
  {
    this(1, paramString1, paramString2, "");
  }
  
  public z(String paramString1, String paramString2, String paramString3)
  {
    this(2, paramString1, paramString2, paramString3);
  }
  
  protected final int Cc()
  {
    return 5;
  }
  
  public final int Ro()
  {
    Object localObject = ((r.b)this.dJM.Id()).eKA.reD;
    if ((localObject != null) && (((bnp)localObject).slI != null) && (((bnp)localObject).slI.size() > 0))
    {
      localObject = ((bnp)localObject).slI.iterator();
      while (((Iterator)localObject).hasNext())
      {
        brj localbrj = (brj)((Iterator)localObject).next();
        if (localbrj.mEb == 1) {
          return bi.getInt(localbrj.spx, 0);
        }
      }
    }
    return 0;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.dJM, this);
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneEmailReg", "onGYNetEnd  errType:%d errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    paramq = (r.b)paramq.Id();
    if ((paramInt2 == 4) && (paramInt3 == 65235))
    {
      av.a(true, paramq.eKA.rhK, paramq.eKA.rhL, paramq.eKA.rhJ);
      this.dJp -= 1;
      if (this.dJp <= 0)
      {
        this.diJ.a(3, -1, "", this);
        return;
      }
      a(this.dIX, this.diJ);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      x.e("MicroMsg.NetSceneEmailReg", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    av.a(false, paramq.eKA.rhK, paramq.eKA.rhL, paramq.eKA.rhJ);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 481;
  }
  
  public static final class a
    extends j
  {
    private r.a eKT = new r.a();
    private r.b eKU = new r.b();
    
    protected final k.d Ic()
    {
      return this.eKT;
    }
    
    public final k.e Id()
    {
      return this.eKU;
    }
    
    public final int KP()
    {
      return 1;
    }
    
    public final int getType()
    {
      return 481;
    }
    
    public final String getUri()
    {
      return "/cgi-bin/micromsg-bin/emailreg";
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/account/friend/a/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */