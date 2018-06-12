package com.tencent.mm.modelsimple;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.btz;
import com.tencent.mm.protocal.c.bua;
import com.tencent.mm.protocal.c.cp;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class aa
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  
  public aa(String paramString, int paramInt, LinkedList<cp> paramLinkedList)
  {
    x.i("MicroMsg.NetSceneTranslateLink", "ticket link = " + paramString + "; scene = " + paramInt);
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new btz();
    ((b.a)localObject).dIH = new bua();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/translatelink";
    ((b.a)localObject).dIF = 1200;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (btz)this.diG.dID.dIL;
    ((btz)localObject).egr = paramString;
    ((btz)localObject).scene = paramInt;
    ((btz)localObject).srr = paramLinkedList;
  }
  
  public final String Rv()
  {
    bua localbua = (bua)this.diG.dIE.dIL;
    if (localbua == null) {
      return null;
    }
    return localbua.srs;
  }
  
  public final bua Rw()
  {
    if ((this.diG != null) && (this.diG.dIE.dIL != null)) {
      return (bua)this.diG.dIE.dIL;
    }
    return null;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneTranslateLink", "swap deep link with ticket onGYNetEnd:[%d,%d,%s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1200;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/modelsimple/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */