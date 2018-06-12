package com.tencent.mm.plugin.exdevice.f.a;

import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.a.b;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.protocal.c.bw;
import com.tencent.mm.protocal.c.bx;
import com.tencent.mm.protocal.c.xj;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class g
  extends com.tencent.mm.plugin.exdevice.a.a<bw, bx>
{
  List<String> gZA;
  private final WeakReference<b<g>> isV;
  public ArrayList<xj> ixu;
  
  public g(List<String> paramList, b<g> paramb)
  {
    this.gZA = paramList;
    this.isV = new WeakReference(paramb);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneAddFollow", "ap: errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      bx localbx = (bx)asj();
      this.ixu = new ArrayList();
      if (localbx.rch != null)
      {
        Iterator localIterator = localbx.rch.iterator();
        while (localIterator.hasNext())
        {
          xj localxj = (xj)localIterator.next();
          x.d("MicroMsg.NetSceneAddFollow", "follow: index:%s step: %s username: %s", new Object[] { Integer.valueOf(localxj.index), Integer.valueOf(localxj.fHo), localxj.username });
          this.ixu.add(localxj);
        }
        x.d("MicroMsg.NetSceneAddFollow", "follows: %s, %d", new Object[] { this.ixu.toString(), Integer.valueOf(localbx.rch.size()) });
      }
      ad.aHg().a(this.ixu, "hardcode_rank_id", "hardcode_app_name");
    }
    super.a(paramInt1, paramInt2, paramInt3, paramString, paramq, paramArrayOfByte);
    paramq = (b)this.isV.get();
    if (paramq != null) {
      paramq.b(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1777;
  }
  
  protected final String getUri()
  {
    return "/cgi-bin/mmoc-bin/hardware/addfollow";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/exdevice/f/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */