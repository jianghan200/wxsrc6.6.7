package com.tencent.mm.plugin.fav.b.c;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ns;
import com.tencent.mm.protocal.c.nt;
import com.tencent.mm.protocal.c.nu;
import com.tencent.mm.protocal.c.wd;
import com.tencent.mm.protocal.c.wo;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
  extends l
  implements k
{
  private b dZf;
  private com.tencent.mm.ab.e diJ = null;
  
  public a(wo paramwo)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new ns();
    ((b.a)localObject).dIH = new nt();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/checkfavitem";
    ((b.a)localObject).dIF = 405;
    ((b.a)localObject).dII = 196;
    ((b.a)localObject).dIJ = 1000000196;
    this.dZf = ((b.a)localObject).KT();
    localObject = (ns)this.dZf.dID.dIL;
    ((ns)localObject).rrR = paramwo;
    ((ns)localObject).otY = 2;
    x.i("MicroMsg.Fav.NetSceneCheckFavItem", "NetSceneCheckFavItem CHECK_FAV_ITEM_SCENE_FIX_DATA %s", new Object[] { Integer.valueOf(paramwo.rbY) });
  }
  
  public a(List<wd> paramList)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new ns();
    ((b.a)localObject).dIH = new nt();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/checkfavitem";
    ((b.a)localObject).dIF = 405;
    ((b.a)localObject).dII = 196;
    ((b.a)localObject).dIJ = 1000000196;
    this.dZf = ((b.a)localObject).KT();
    localObject = (ns)this.dZf.dID.dIL;
    ((ns)localObject).rrQ = new LinkedList();
    ((ns)localObject).rrQ.addAll(paramList);
    ((ns)localObject).otY = 1;
    x.i("MicroMsg.Fav.NetSceneCheckFavItem", "NetSceneCheckFavItem CHECK_FAV_ITEM_SCENE_FIX_OBJECT %s", new Object[] { Integer.valueOf(paramList.size()) });
  }
  
  protected final int Cc()
  {
    return 10;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.dZf, this);
  }
  
  protected final int a(q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.Fav.NetSceneCheckFavItem", "netId %d errType %d errCode %d errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = (nt)((b)paramq).dIE.dIL;
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      x.i("MicroMsg.Fav.NetSceneCheckFavItem", "NetSceneCheckFavItem,cgi return error,errcode:%d,errType:%d", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramInt2) });
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramq = paramq.rrS.iterator();
    while (paramq.hasNext())
    {
      paramArrayOfByte = (nu)paramq.next();
      x.i("MicroMsg.Fav.NetSceneCheckFavItem", "NetSceneCheckFavItem, onGYNetEnd,favid: %d, ret: %d", new Object[] { Integer.valueOf(paramArrayOfByte.rbY), Integer.valueOf(paramArrayOfByte.rfn) });
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 405;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/fav/b/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */