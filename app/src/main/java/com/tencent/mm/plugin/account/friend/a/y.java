package com.tencent.mm.plugin.account.friend.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.oq;
import com.tencent.mm.protocal.c.or;
import com.tencent.mm.sdk.platformtools.x;

public final class y
  extends l
  implements k
{
  public static int eKP = 1;
  public static int eKQ = 2;
  public static int eKR = 3;
  public static int eKS = 4;
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public y(int paramInt)
  {
    b.a locala = new b.a();
    locala.dIG = new oq();
    locala.dIH = new or();
    locala.uri = "/cgi-bin/micromsg-bin/checkunbind";
    locala.dIF = 254;
    locala.dII = 131;
    locala.dIJ = 1000000131;
    this.diG = locala.KT();
    ((oq)this.diG.dID.dIL).rsT = paramInt;
  }
  
  public final String XL()
  {
    try
    {
      String str = ((or)this.diG.dIE.dIL).rsU;
      x.d("MicroMsg.NetSceneCheckUnBind", "getRandomPasswd() " + str);
      return str;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.NetSceneCheckUnBind", localException, "", new Object[0]);
    }
    return null;
  }
  
  public final or XM()
  {
    return (or)this.diG.dIE.dIL;
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
    return 254;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/account/friend/a/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */