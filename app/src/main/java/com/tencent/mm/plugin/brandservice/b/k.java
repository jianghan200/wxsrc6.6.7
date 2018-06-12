package com.tencent.mm.plugin.brandservice.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.brandservice.a;
import com.tencent.mm.protocal.c.ai;
import com.tencent.mm.protocal.c.blm;
import com.tencent.mm.protocal.c.bln;
import com.tencent.mm.protocal.c.ix;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class k
  extends l
  implements com.tencent.mm.network.k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  
  public k(List<ix> paramList)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new blm();
    ((b.a)localObject).dIH = new bln();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/setapplist";
    ((b.a)localObject).dIF = 386;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (blm)this.diG.dID.dIL;
    LinkedList localLinkedList = new LinkedList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      ix localix = (ix)paramList.next();
      ai localai = new ai();
      localai.hbL = localix.userName;
      localLinkedList.add(localai);
    }
    ((blm)localObject).hbF = localLinkedList.size();
    ((blm)localObject).hbG = localLinkedList;
    x.i("MicroMsg.BrandService.NetSceneSetAppList", "info: upload size %d, toString %s", new Object[] { Integer.valueOf(localLinkedList.size()), localLinkedList.toString() });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    x.i("MicroMsg.BrandService.NetSceneSetAppList", "do scene");
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.BrandService.NetSceneSetAppList", "on scene end code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (bln)this.diG.dIE.dIL;
      x.i("MicroMsg.BrandService.NetSceneSetAppList", "ok, hash code is %d", new Object[] { Integer.valueOf(paramq.rEY) });
      a.g(196610, Integer.valueOf(paramq.rEY));
      a.g(196611, Boolean.valueOf(false));
    }
    for (;;)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      a.g(196611, Boolean.valueOf(true));
    }
  }
  
  public final int getType()
  {
    return 386;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/brandservice/b/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */