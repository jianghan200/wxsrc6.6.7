package com.tencent.mm.plugin.clean.c;

import android.os.Looper;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.clean.c.a.a.a;
import com.tencent.mm.plugin.clean.c.a.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import java.io.File;
import java.util.ArrayList;

public final class e
  extends Thread
  implements a.a
{
  private ag dvh = new ag(Looper.getMainLooper());
  private long endTime = 0L;
  private b hQO;
  private int hQQ = 0;
  private int hQR = 0;
  private h hRg;
  private ArrayList<a> hRh;
  private int hRi = 0;
  private boolean isStop;
  private long startTime = 0L;
  
  public e(b paramb, h paramh, ArrayList<a> paramArrayList)
  {
    this.hQO = paramb;
    this.hRg = paramh;
    this.hRh = paramArrayList;
  }
  
  private void aAZ()
  {
    this.endTime = System.currentTimeMillis();
    x.i("MicroMsg.DeleteFileController", "totalUserTime:%d", new Object[] { Long.valueOf(this.endTime - this.startTime) });
    if ((this.hRg != null) && (!this.isStop)) {
      this.dvh.post(new e.2(this));
    }
  }
  
  public final void a(com.tencent.mm.plugin.clean.c.a.a parama)
  {
    interrupt();
    this.hQR += 1;
    if ((this.hRg != null) && (!this.isStop)) {
      this.dvh.post(new e.1(this));
    }
    if (this.hQR == this.hQQ) {
      aAZ();
    }
  }
  
  public final void aBr()
  {
    x.i("MicroMsg.DeleteFileController", "stop analyseController");
    this.isStop = true;
    interrupt();
  }
  
  public final void run()
  {
    this.startTime = System.currentTimeMillis();
    this.hQQ = this.hRh.size();
    x.d("MicroMsg.DeleteFileController", "totalTaskCount=%d", new Object[] { Integer.valueOf(this.hQQ) });
    if (this.hQQ == 0) {
      aAZ();
    }
    for (;;)
    {
      return;
      int i = 0;
      while ((!this.isStop) && (i < this.hRh.size()))
      {
        a locala = (a)this.hRh.get(i);
        x.d("MicroMsg.DeleteFileController", "while loop index=%d | filePath=%s", new Object[] { Integer.valueOf(i), locala.filePath });
        a locala1 = new a(locala);
        while (!this.hQO.b(locala1)) {
          try
          {
            Thread.sleep(100L);
          }
          catch (InterruptedException localInterruptedException) {}
        }
        x.d("MicroMsg.DeleteFileController", "Start task： filePath＝%s", new Object[] { locala.filePath });
        i += 1;
      }
    }
  }
  
  final class a
    extends com.tencent.mm.plugin.clean.c.a.a
  {
    private a hRk;
    
    public a(a parama)
    {
      super();
      this.hRk = parama;
    }
    
    public final void execute()
    {
      au.HU();
      Object localObject = c.FT().dW(this.hRk.bIZ);
      if (((cm)localObject).field_msgId != 0L)
      {
        ((bd)localObject).cmv();
        au.HU();
        c.FT().a(this.hRk.bIZ, (bd)localObject);
      }
      localObject = new File(this.hRk.filePath);
      e.a(e.this, (int)(e.d(e.this) + ((File)localObject).length()));
      ((File)localObject).delete();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/clean/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */