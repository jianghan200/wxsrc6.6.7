package com.tencent.mm.ac.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aaj;
import com.tencent.mm.protocal.c.aak;
import com.tencent.mm.protocal.c.ht;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class p
  extends l
  implements k
{
  Map<String, String> dNV = new HashMap();
  public b diG;
  private com.tencent.mm.ab.e diJ;
  
  public p(LinkedList<ht> paramLinkedList)
  {
    Object localObject1 = paramLinkedList.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = (ht)((Iterator)localObject1).next();
      String str = ((ht)localObject2).riE;
      localObject2 = ((ht)localObject2).riK;
      if ((localObject2 != null) && (str != null)) {
        this.dNV.put(str, localObject2);
      }
    }
    localObject1 = new b.a();
    ((b.a)localObject1).dIG = new aaj();
    ((b.a)localObject1).dIH = new aak();
    ((b.a)localObject1).uri = "/cgi-bin/mmocbiz-bin/getbizchatinfolist";
    ((b.a)localObject1).dIF = 1365;
    ((b.a)localObject1).dII = 0;
    ((b.a)localObject1).dIJ = 0;
    this.diG = ((b.a)localObject1).KT();
    ((aaj)this.diG.dID.dIL).rFT = paramLinkedList;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    x.i("MicroMsg.brandservice.NetSceneGetBizChatInfoList", "do scene");
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.brandservice.NetSceneGetBizChatInfoList", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1365;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ac/a/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */