package com.tencent.mm.plugin.fav.b.d;

import android.os.HandlerThread;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.plugin.fav.a.ac;
import com.tencent.mm.plugin.fav.a.aj;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public final class e
  implements com.tencent.mm.ab.e, ac
{
  private static Map<Long, g.a> bFf = new HashMap();
  private static Map<Long, Integer> iXO = new HashMap();
  private static Set<Long> iXQ = new HashSet();
  private Queue<com.tencent.mm.plugin.fav.a.g> bFd = new LinkedList();
  private boolean bFh = false;
  private boolean bFi = false;
  public int bFj = 0;
  private long bFk = 0L;
  public al bFo = new al(com.tencent.mm.kernel.g.Em().lnJ.getLooper(), new e.3(this), false);
  
  public e()
  {
    com.tencent.mm.kernel.g.DF().a(401, this);
  }
  
  public static void startSync()
  {
    aj localaj = new aj();
    com.tencent.mm.kernel.g.DF().a(localaj, 0);
  }
  
  public final boolean TM()
  {
    return this.bFh;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.Fav.FavSendService", "on scene end, errType %d, errCode %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    com.tencent.mm.kernel.g.Em().H(new e.1(this, paraml, paramInt1, paramInt2));
  }
  
  public final void run()
  {
    com.tencent.mm.kernel.g.Em().H(new e.2(this));
  }
  
  public final void wx()
  {
    x.i("MicroMsg.Fav.FavSendService", "on finish");
    this.bFd.clear();
    bFf.clear();
    this.bFi = false;
    this.bFh = false;
    iXO.clear();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/fav/b/d/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */