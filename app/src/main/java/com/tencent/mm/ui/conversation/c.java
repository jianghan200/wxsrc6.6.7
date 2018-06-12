package com.tencent.mm.ui.conversation;

import android.app.Activity;
import android.widget.ListView;
import com.tencent.mm.g.a.jh;
import com.tencent.mm.g.c.am;
import com.tencent.mm.model.au;
import com.tencent.mm.model.s;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.HomeUI;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.aa;
import com.tencent.mm.ui.al;
import com.tencent.mm.ui.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class c
{
  Activity activity;
  HashMap<String, Integer> unI = new HashMap();
  int unJ = -1;
  public int unK = -1;
  g unL;
  com.tencent.mm.sdk.b.c unM = new c.1(this);
  com.tencent.mm.sdk.b.c unN = new c.2(this);
  com.tencent.mm.sdk.b.c unO = new com.tencent.mm.sdk.b.c()
  {
    private final long INTERVAL = 3000L;
    long unR = 0L;
    int unS = -1;
  };
  ListView unh;
  
  public final void Z(Activity paramActivity)
  {
    this.unK = ((LauncherUI)paramActivity).tkn.tjF.cqE();
  }
  
  final com.tencent.mm.storage.ai aaQ(String paramString)
  {
    if (this.unL != null) {
      return (com.tencent.mm.storage.ai)this.unL.cn(paramString);
    }
    return null;
  }
  
  public final void cyG()
  {
    if (this.activity == null) {
      return;
    }
    long l = System.currentTimeMillis();
    Object localObject1 = (LauncherUI)this.activity;
    x.i("MicroMsg.ConvUnreadHelper", "unreadcheck postSetLauncherUIUnReadCount  resetStatus %d", new Object[] { Integer.valueOf(this.unJ) });
    switch (this.unJ)
    {
    case 1: 
    default: 
      this.unK = ((LauncherUI)localObject1).tkn.tjF.cqE();
      x.i("MicroMsg.ConvUnreadHelper", "unreadcheck postSetLauncherUIUnReadCount UNREAD_RESET_ALL totalUnReadCount %d, usetime %d,", new Object[] { Integer.valueOf(this.unK), Long.valueOf(System.currentTimeMillis() - l) });
      return;
    }
    Iterator localIterator = this.unI.entrySet().iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      Object localObject2 = (Map.Entry)localIterator.next();
      String str = (String)((Map.Entry)localObject2).getKey();
      j = ((Integer)((Map.Entry)localObject2).getValue()).intValue();
      x.i("MicroMsg.ConvUnreadHelper", "unreadcheck postSetLauncherUIUnReadCount  username %s, preunread %d", new Object[] { str, Integer.valueOf(j) });
      localObject2 = aaQ(str);
      if ((localObject2 == null) || (al.cqV().contains(str)))
      {
        j = 0 - j;
        x.i("MicroMsg.ConvUnreadHelper", "unreadcheck postSetLauncherUIUnReadCount  cov == null username %s, change %d", new Object[] { str, Integer.valueOf(j) });
        label256:
        if ((j != 0) && (this.unL.aaR(str)))
        {
          x.i("MicroMsg.ConvUnreadHelper", "unreadcheck postSetLauncherUIUnReadCount  username %s isWithoutItemCache", new Object[] { str });
          au.HU();
          localObject2 = com.tencent.mm.model.c.FR().Yg(str);
          if (localObject2 == null) {
            continue;
          }
          if (!s.fq(str)) {
            break label398;
          }
          if (((com.tencent.mm.g.c.ai)localObject2).csI == 0) {
            continue;
          }
        }
      }
      for (;;)
      {
        i += j;
        x.i("MicroMsg.ConvUnreadHelper", "unreadcheck postSetLauncherUIUnReadCount  real change usename %s, change %d, totalchange %d", new Object[] { str, Integer.valueOf(j), Integer.valueOf(i) });
        break;
        j = ((am)localObject2).field_unReadCount - j + 0;
        x.i("MicroMsg.ConvUnreadHelper", "unreadcheck postSetLauncherUIUnReadCount  cov != null username %s, change %d", new Object[] { str, Integer.valueOf(j) });
        break label256;
        label398:
        if (((ab)localObject2).BD()) {
          break;
        }
      }
    }
    this.unK += i;
    localObject1 = ((LauncherUI)localObject1).tkn.tjF;
    int j = this.unK;
    ((z)localObject1).toc.DX(j);
    x.i("MicroMsg.ConvUnreadHelper", "unreadcheck postSetLauncherUIUnReadCount UNREAD_RESET_PART totalUnReadCount %d, change %d, usetime %d,", new Object[] { Integer.valueOf(this.unK), Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - l) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/conversation/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */