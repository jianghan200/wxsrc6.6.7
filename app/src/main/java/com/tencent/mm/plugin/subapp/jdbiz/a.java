package com.tencent.mm.plugin.subapp.jdbiz;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.d.a;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.ao;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bv.a;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Map;

public final class a
  implements bv.a
{
  com.tencent.mm.sdk.b.c oqD = new a.1(this);
  
  public final void a(final d.a parama)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.JDSysMsgNotifyLsn", "receivemsg jd");
    Object localObject = parama.dIN;
    if (localObject == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.JDSysMsgNotifyLsn", "onPreAddMessage cmdAM is null");
      return;
    }
    parama = new b();
    parama.MU(ab.a(((by)localObject).rcl));
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.JDSysMsgNotifyLsn", "bizType " + bi.aG(parama.oqG, ""));
    if (bi.oW(parama.oqG)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.JDSysMsgNotifyLsn", "bizTye is null or nil");
    }
    for (;;)
    {
      au.HU();
      com.tencent.mm.model.c.DT().lm(true);
      return;
      if (bi.oW(parama.oqH))
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.JDSysMsgNotifyLsn", "activity id is null");
      }
      else if (!parama.a(c.bGg().bGl()))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.JDSysMsgNotifyLsn", "fo zu baoyou! the activityid is same");
      }
      else if (!c.bGo())
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.JDSysMsgNotifyLsn", "no entrance, ignore msg");
      }
      else
      {
        if (parama.oqG.equals("3"))
        {
          ((by)localObject).rcp = null;
          if ((bi.oW(parama.oqR)) || (bi.oW(parama.jumpUrl)) || (bi.oW(parama.oqS)) || (bi.oW(parama.oqT)) || (bi.oW(parama.oqQ))) {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.JDSysMsgNotifyLsn", "invalid params");
          }
          for (;;)
          {
            c.b(parama);
            break;
            if (parama.bFZ())
            {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.JDSysMsgNotifyLsn", "ingore msg due to msg is expired");
            }
            else
            {
              localObject = c.bGg();
              String str = parama.oqH;
              if (bi.oW(str)) {}
              for (boolean bool = false;; bool = ((c)localObject).oqW.containsKey(str))
              {
                if (!bool) {
                  break label324;
                }
                com.tencent.mm.sdk.platformtools.x.i("MicroMsg.JDSysMsgNotifyLsn", "activity id already show, " + parama.oqH);
                break;
              }
              label324:
              if (!parama.a(c.bGg().bGl()))
              {
                com.tencent.mm.sdk.platformtools.x.i("MicroMsg.JDSysMsgNotifyLsn", "the remind activitid is same");
              }
              else
              {
                localObject = c.bGg();
                str = parama.oqH;
                if (!bi.oW(str)) {
                  ((c)localObject).oqW.put(str, Integer.valueOf(1));
                }
                com.tencent.mm.sdk.platformtools.x.i("MicroMsg.JDSysMsgNotifyLsn", "add activity id" + parama.oqH);
                new ag(Looper.getMainLooper()).post(new Runnable()
                {
                  public final void run()
                  {
                    Object localObject = a.this;
                    b localb = parama;
                    au.HU();
                    int i = ((Integer)com.tencent.mm.model.c.DT().get(15, Integer.valueOf(0))).intValue();
                    if ((au.DF().foreground) && (1 == i))
                    {
                      localObject = c.cl(localb.jumpUrl, 5);
                      JDRemindDialog.a(ad.getContext(), localb.oqR, localb.oqS, localb.oqT, (String)localObject, localb.oqH);
                      h.mEJ.h(11178, new Object[] { localObject, c.bGg().bGl().oqH, Integer.valueOf(5) });
                      return;
                    }
                    String str = c.cl(localb.jumpUrl, 4);
                    Bundle localBundle = new Bundle();
                    localBundle.putString("activity_id", localb.oqH);
                    localBundle.putString("jump_url", str);
                    ((ao)au.getNotification()).a(37, ad.getContext().getString(R.l.app_pushcontent_title), localb.oqQ, str, "bizjd", localBundle);
                    com.tencent.mm.sdk.b.a.sFg.b(((a)localObject).oqD);
                    h.mEJ.h(11178, new Object[] { str, c.bGg().bGl().oqH, Integer.valueOf(4) });
                  }
                });
              }
            }
          }
        }
        if (parama.oqG.equals("1")) {
          c.b(parama);
        } else if (parama.oqG.equals("2")) {
          c.b(parama);
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/subapp/jdbiz/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */