package com.tencent.mm.plugin.game.model;

import android.os.HandlerThread;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class r
  implements e
{
  private static boolean bgH = false;
  private static int jMd = 20;
  private static LinkedList<k> jMe = new LinkedList();
  private static ah jMf;
  private int offset = 0;
  
  private void aTV()
  {
    bgH = false;
    jMf.lnJ.quit();
    g.DF().b(1215, this);
  }
  
  public static void update()
  {
    if (!f.aTG())
    {
      x.i("MicroMsg.GameListUpdater", "No need to update");
      return;
    }
    if (bgH)
    {
      x.e("MicroMsg.GameListUpdater", "Already running");
      return;
    }
    jMf = new ah("GameListUpdate");
    jMe.clear();
    r localr = new r();
    g.DF().a(1215, localr);
    g.DF().a(new bc(localr.offset, jMd), 0);
    bgH = true;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      aTV();
      return;
    }
    jMf.H(new r.1(this, paraml));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/game/model/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */