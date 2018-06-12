package com.tencent.mm.plugin.exdevice.f.a;

import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.a.a;
import com.tencent.mm.plugin.exdevice.a.b;
import com.tencent.mm.protocal.c.akd;
import com.tencent.mm.protocal.c.ake;
import com.tencent.mm.protocal.c.xl;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class k
  extends a<akd, ake>
{
  private final WeakReference<b<k>> isV;
  public List<String> ixY;
  public List<String> ixZ;
  public List<String> iya;
  
  public k(b<k> paramb)
  {
    this.isV = new WeakReference(paramb);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneGetWeRunFollowerList", "ap: errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      Object localObject1 = (ake)asj();
      this.iya = new ArrayList();
      Object localObject2 = ((ake)localObject1).rMT.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        String str = (String)((Iterator)localObject2).next();
        au.HU();
        if (c.FR().Yc(str)) {
          this.iya.add(str);
        }
      }
      this.ixY = new ArrayList();
      this.ixZ = new ArrayList();
      if (((ake)localObject1).rMU != null)
      {
        localObject1 = ((ake)localObject1).rMU.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (xl)((Iterator)localObject1).next();
          if (((xl)localObject2).rDp) {
            this.ixZ.add(((xl)localObject2).username);
          }
          au.HU();
          if (c.FR().Yc(((xl)localObject2).username)) {
            this.ixY.add(((xl)localObject2).username);
          }
        }
      }
      x.d("MicroMsg.NetSceneGetWeRunFollowerList", "follow:%s %s", new Object[] { Integer.valueOf(this.ixZ.size()), this.ixZ.toString() });
      x.d("MicroMsg.NetSceneGetWeRunFollowerList", "all follow:%s %s", new Object[] { Integer.valueOf(this.ixY.size()), this.ixY });
    }
    super.a(paramInt1, paramInt2, paramInt3, paramString, paramq, paramArrayOfByte);
    paramq = (b)this.isV.get();
    if (paramq != null)
    {
      x.d("MicroMsg.NetSceneGetWeRunFollowerList", "callback is not null");
      paramq.b(paramInt2, paramInt3, paramString, this);
      return;
    }
    x.d("MicroMsg.NetSceneGetWeRunFollowerList", "callback is null");
  }
  
  public final int getType()
  {
    return 1758;
  }
  
  protected final String getUri()
  {
    return "/cgi-bin/mmoc-bin/hardware/getwerunfollowerlist";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/exdevice/f/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */