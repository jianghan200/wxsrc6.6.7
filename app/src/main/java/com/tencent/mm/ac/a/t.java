package com.tencent.mm.ac.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.anr;
import com.tencent.mm.protocal.c.ans;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class t
  extends l
  implements k
{
  public String dNT;
  Object data;
  public b diG;
  private com.tencent.mm.ab.e diJ;
  
  public t(String paramString1, String paramString2, LinkedList<String> paramLinkedList, Object paramObject)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new anr();
    ((b.a)localObject).dIH = new ans();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/initiatebizchat";
    ((b.a)localObject).dIF = 1389;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (anr)this.diG.dID.dIL;
    ((anr)localObject).ruF = paramString1;
    paramString1 = paramString2;
    if (paramString2 == null) {
      paramString1 = "";
    }
    ((anr)localObject).rQt = paramString1;
    ((anr)localObject).rQu = paramLinkedList;
    this.data = paramObject;
  }
  
  public final ans Nv()
  {
    if ((this.diG != null) && (this.diG.dIE.dIL != null)) {
      return (ans)this.diG.dIE.dIL;
    }
    return null;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    x.i("MicroMsg.NetSceneInitiateBizChat", "do scene");
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneInitiateBizChat", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1389;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ac/a/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */