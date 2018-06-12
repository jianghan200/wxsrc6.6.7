package com.tencent.mm.plugin.account.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.gy;
import com.tencent.mm.protocal.c.gz;

public final class d
  extends l
  implements k
{
  public static int eNX = 1;
  public static int eNY = 2;
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public d(int paramInt, String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new gy();
    ((b.a)localObject).dIH = new gz();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/bindemail";
    ((b.a)localObject).dIF = 256;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (gy)this.diG.dID.dIL;
    ((gy)localObject).qZc = paramInt;
    ((gy)localObject).rhg = paramString;
  }
  
  public final int Oh()
  {
    return ((gy)this.diG.dID.dIL).qZc;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 256;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/account/model/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */