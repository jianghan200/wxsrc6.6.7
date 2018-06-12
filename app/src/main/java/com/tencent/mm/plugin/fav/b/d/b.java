package com.tencent.mm.plugin.fav.b.d;

import android.os.HandlerThread;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.network.n;
import com.tencent.mm.plugin.fav.a.r;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public final class b
  implements e, r
{
  private static Map<Long, g.a> bFf = new HashMap();
  private Queue<com.tencent.mm.plugin.fav.a.g> bFd = new LinkedList();
  private boolean bFh = false;
  private boolean bFi = false;
  private long bFk = 0L;
  public al bFo = new al(com.tencent.mm.kernel.g.Em().lnJ.getLooper(), new b.4(this), false);
  public n dOT = new b.2(this);
  private boolean iXC = ao.isWifi(ad.getContext());
  
  public b()
  {
    com.tencent.mm.kernel.g.Eh().a(this.dOT);
    com.tencent.mm.kernel.g.DF().a(404, this);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    com.tencent.mm.kernel.g.Em().H(new b.1(this, paraml, paramInt1));
  }
  
  public final void run()
  {
    com.tencent.mm.kernel.g.Em().H(new Runnable()
    {
      public final void run()
      {
        long l = System.currentTimeMillis() - b.d(b.this);
        if (b.e(b.this))
        {
          if (l < 60000L) {
            return;
          }
          x.e("MicroMsg.Fav.FavCheckCdnService", "klem ERR: Try Run service runningFlag:" + b.e(b.this) + " timeWait:" + l + ">=MAX_TIME_WAIT sending:" + b.e(b.this));
        }
        b.a(b.this);
        b.f(b.this);
        b.g(b.this).J(10L, 10L);
      }
      
      public final String toString()
      {
        return super.toString() + "|run";
      }
    });
  }
  
  public final void wx()
  {
    this.bFd.clear();
    bFf.clear();
    this.bFi = false;
    this.bFh = false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/fav/b/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */