package com.tencent.mm.plugin.webwx.a;

import android.os.Looper;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.s.a;
import com.tencent.mm.modelvideo.s.a.a;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.pluginsdk.model.app.ac;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bf;
import java.io.IOException;
import java.util.HashMap;

public final class a
  implements com.tencent.mm.ab.e, s.a
{
  private static int qlV = 1048576;
  private static int qlW = 26214400;
  private bf qlX = new bf();
  private HashMap<String, bd> qlY = new HashMap();
  
  public a()
  {
    Object localObject = new StringBuilder();
    g.Ek();
    localObject = com.tencent.mm.a.e.f(g.Ei().cachePath + "syncmsgid.ini", 0, -1);
    if (!bi.bC((byte[])localObject)) {}
    try
    {
      this.qlX.aG((byte[])localObject);
      com.tencent.mm.modelvideo.o.Ta().a(this, Looper.getMainLooper());
      g.DF().a(221, this);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MultiTerminalSyncMgr", "task parse Error");
      }
    }
  }
  
  private void bYE()
  {
    try
    {
      byte[] arrayOfByte = this.qlX.toByteArray();
      StringBuilder localStringBuilder = new StringBuilder();
      g.Ek();
      com.tencent.mm.a.e.b(g.Ei().cachePath + "syncmsgid.ini", arrayOfByte, arrayOfByte.length);
      return;
    }
    catch (IOException localIOException)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MultiTerminalSyncMgr", "task to file Error");
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paraml instanceof ac)))
    {
      long l = ((ac)paraml).bJC;
      fG(l);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MultiTerminalSyncMgr", "download attach end: %d", new Object[] { Long.valueOf(l) });
    }
  }
  
  public final void a(s.a.a parama)
  {
    parama = (bd)this.qlY.get(parama.fileName);
    if (parama == null) {}
    do
    {
      r localr;
      do
      {
        return;
        localr = t.nW(parama.field_imgPath);
      } while (localr == null);
      if ((parama.cmu()) || (localr.status == 199))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MultiTerminalSyncMgr", "download video end: %d, status:%d", new Object[] { Long.valueOf(parama.field_msgId), Integer.valueOf(localr.status) });
        fG(parama.field_msgId);
        this.qlY.remove(parama.field_imgPath);
        return;
      }
    } while (parama.field_status != 198);
    this.qlY.remove(parama.field_imgPath);
  }
  
  public final void bYD()
  {
    new ag(Looper.getMainLooper()).post(new Runnable()
    {
      public final void run()
      {
        a.a(a.this);
      }
    });
  }
  
  public final void fF(final long paramLong)
  {
    au.HU();
    if (!((Boolean)c.DT().get(aa.a.sVp, Boolean.valueOf(true))).booleanValue())
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MultiTerminalSyncMgr", "autoSyncState close");
      return;
    }
    new ag(Looper.getMainLooper()).post(new Runnable()
    {
      public final void run()
      {
        a.a(a.this, paramLong);
      }
    });
  }
  
  public final void fG(long paramLong)
  {
    new ag(Looper.getMainLooper()).post(new a.2(this, paramLong));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/webwx/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */