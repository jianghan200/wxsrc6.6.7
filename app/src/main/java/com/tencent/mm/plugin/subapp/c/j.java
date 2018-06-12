package com.tencent.mm.plugin.subapp.c;

import android.os.HandlerThread;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.model.au;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public final class j
  implements e
{
  private static int bFl = 0;
  Queue<String> bFd = new LinkedList();
  Queue<String> bFe = new LinkedList();
  Map<String, g.a> bFf = new HashMap();
  private boolean bFg = false;
  private boolean bFh = false;
  private boolean bFi = false;
  int bFj = 0;
  private long bFk = 0L;
  g.a bFn = new g.a();
  private al bFo = new al(au.Em().lnJ.getLooper(), new j.3(this), false);
  
  public j()
  {
    au.DF().a(329, this);
  }
  
  private void wx()
  {
    this.bFf.clear();
    this.bFd.clear();
    this.bFe.clear();
    this.bFh = false;
    this.bFg = false;
    this.bFi = false;
    x.d("MicroMsg.VoiceRemindService", "Finish service use time(ms):" + this.bFn.Ad());
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    au.Em().H(new j.1(this, paraml, paramInt1, paramInt2));
  }
  
  public final void run()
  {
    au.Em().H(new j.2(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/subapp/c/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */