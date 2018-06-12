package com.tencent.mm.app;

import android.os.Looper;
import android.os.Message;
import android.support.v4.app.Fragment;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bs;
import com.tencent.mm.model.d.a.4;
import com.tencent.mm.model.d.b;
import com.tencent.mm.model.d.b.1;
import com.tencent.mm.model.d.c;
import com.tencent.mm.model.d.c.1;
import com.tencent.mm.model.d.c.a;
import com.tencent.mm.plugin.sns.b.f;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.HomeUI;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.conversation.j;
import com.tencent.mm.ui.z;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public final class m
{
  public static m byY;
  public boolean byZ;
  public ag bza = new ag(Looper.getMainLooper())
  {
    public final void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      Object localObject;
      if (paramAnonymousMessage.what == 63537) {
        if (!m.this.byZ)
        {
          paramAnonymousMessage = LauncherUI.cpQ();
          if ((paramAnonymousMessage != null) && (paramAnonymousMessage.tkq))
          {
            paramAnonymousMessage.tkn.tjF.ZS("tab_main");
            localObject = paramAnonymousMessage.tkn;
            if (((HomeUI)localObject).tjr) {
              ((HomeUI)localObject).tjt = true;
            }
            localObject = n.nkx;
            if (localObject != null) {
              ((f)localObject).bwU();
            }
            paramAnonymousMessage = paramAnonymousMessage.tkn.tjF.ton.values().iterator();
            while (paramAnonymousMessage.hasNext())
            {
              localObject = (Fragment)paramAnonymousMessage.next();
              if (!(localObject instanceof j)) {
                ((com.tencent.mm.ui.o)localObject).coH();
              }
            }
          }
          System.gc();
        }
      }
      while ((paramAnonymousMessage.what != 62537) || (m.this.byZ)) {
        return;
      }
      paramAnonymousMessage = LauncherUI.cpQ();
      if (paramAnonymousMessage != null)
      {
        paramAnonymousMessage = paramAnonymousMessage.tkn.tjF;
        if (paramAnonymousMessage.ton.containsKey(Integer.valueOf(0))) {
          ((com.tencent.mm.ui.o)paramAnonymousMessage.ton.get(Integer.valueOf(0))).coH();
        }
      }
      if (g.Eg().Dx())
      {
        au.HN();
        paramAnonymousMessage = bs.iK("plugin.emoji");
        if (paramAnonymousMessage != null) {
          paramAnonymousMessage.gi(0);
        }
        au.HN();
        if ((com.tencent.mm.ak.o)bs.iK(com.tencent.mm.ak.o.class.getName()) != null) {
          com.tencent.mm.ak.o.Pl();
        }
        paramAnonymousMessage = b.JG();
        localObject = com.tencent.mm.model.d.a.JA();
        c localc = c.JI();
        au.Em().H(new b.1(paramAnonymousMessage));
        au.Em().H(new a.4((com.tencent.mm.model.d.a)localObject));
        localc.a(paramAnonymousMessage);
        localc.a((c.a)localObject);
        au.Em().H(new c.1(localc));
      }
      System.gc();
    }
  };
  
  public static m vc()
  {
    if (byY == null) {
      byY = new m();
    }
    return byY;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/app/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */