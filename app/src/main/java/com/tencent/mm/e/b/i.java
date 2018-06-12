package com.tencent.mm.e.b;

import android.os.HandlerThread;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelvoice.p;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public final class i
  implements e
{
  private static int bFl = 0;
  public static boolean bFm = true;
  Queue<String> bFd = new LinkedList();
  Queue<p> bFe = new LinkedList();
  Map<String, g.a> bFf = new HashMap();
  private boolean bFg = false;
  private boolean bFh = false;
  private boolean bFi = false;
  public int bFj = 0;
  private long bFk = 0L;
  g.a bFn = new g.a();
  private al bFo = new al(g.Em().lnJ.getLooper(), new i.3(this), false);
  
  public i()
  {
    g.DF().a(127, this);
    g.DF().a(128, this);
  }
  
  private void wx()
  {
    this.bFf.clear();
    this.bFd.clear();
    this.bFe.clear();
    this.bFh = false;
    this.bFg = false;
    this.bFi = false;
    x.i("MicroMsg.SceneVoiceService", "Finish service use time(ms):" + this.bFn.Ad());
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    g.Em().H(new i.1(this, paraml, paramInt1, paramInt2));
  }
  
  public final void run()
  {
    g.Em().H(new i.2(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/e/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */