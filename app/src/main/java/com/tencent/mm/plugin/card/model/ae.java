package com.tencent.mm.plugin.card.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.acw;
import com.tencent.mm.protocal.c.acx;
import com.tencent.mm.protocal.c.bda;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class ae
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  public bda hxl;
  
  public ae(LinkedList<String> paramLinkedList, int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new acw();
    ((b.a)localObject).dIH = new acx();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getdynamiccardcode";
    ((b.a)localObject).dIF = 1382;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (acw)this.diG.dID.dIL;
    ((acw)localObject).rHq = paramLinkedList;
    ((acw)localObject).scene = paramInt;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGetDynamicCardCode", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      this.hxl = ((acx)this.diG.dIE.dIL).rHr;
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1382;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/card/model/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */