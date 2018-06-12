package com.tencent.mm.plugin.scanner.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ib;
import com.tencent.mm.protocal.c.ic;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class c
  extends l
  implements k
{
  public b diG;
  private com.tencent.mm.ab.e diJ;
  
  public c(String paramString1, LinkedList<String> paramLinkedList, int paramInt, String paramString2, double paramDouble1, double paramDouble2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new ib();
    ((b.a)localObject).dIH = new ic();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/usrmsg/bizscangetactioninfo";
    ((b.a)localObject).dIF = 1068;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (ib)this.diG.dID.dIL;
    ((ib)localObject).rem = paramString1;
    ((ib)localObject).otY = paramInt;
    ((ib)localObject).rjh = paramString2;
    ((ib)localObject).rjg = paramLinkedList;
    ((ib)localObject).rjj = paramDouble2;
    ((ib)localObject).rji = paramDouble1;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGetActionInfo", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1068;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/scanner/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */