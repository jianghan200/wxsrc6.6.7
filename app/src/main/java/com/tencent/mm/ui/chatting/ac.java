package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.os.Looper;
import android.view.ViewStub;
import com.tencent.mm.R.h;
import com.tencent.mm.ab.o;
import com.tencent.mm.ar.h;
import com.tencent.mm.br.f.a;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.s;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.pluginsdk.g.a.a.m;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ac
{
  public List<com.tencent.mm.storage.bd> huM;
  public ag mHandler = new ac.1(this, Looper.getMainLooper());
  public ChattingAnimFrame tMs = null;
  public Activity tMt;
  
  private static void am(int paramInt, boolean paramBoolean)
  {
    for (;;)
    {
      Object localObject2;
      try
      {
        Object localObject1 = new StringBuilder();
        au.HU();
        localObject1 = com.tencent.mm.a.e.f(com.tencent.mm.model.c.Gp() + "eggresult.rep", 0, -1);
        com.tencent.mm.ar.g localg;
        if (localObject1 != null)
        {
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.EggMgr", "data not null, parse it");
          localObject1 = (h)new h().aG((byte[])localObject1);
          localObject2 = ((h)localObject1).ecN.iterator();
          if (!((Iterator)localObject2).hasNext()) {
            break label292;
          }
          localg = (com.tencent.mm.ar.g)((Iterator)localObject2).next();
          if (localg.ecA != paramInt) {
            continue;
          }
          if (paramBoolean)
          {
            localg.ecL += 1;
            break label297;
            if (i == 0)
            {
              localObject2 = new com.tencent.mm.ar.g();
              ((com.tencent.mm.ar.g)localObject2).ecA = paramInt;
              if (!paramBoolean) {
                break label283;
              }
              ((com.tencent.mm.ar.g)localObject2).ecL = 1;
              ((h)localObject1).ecN.add(localObject2);
            }
            localObject2 = ((h)localObject1).toByteArray();
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.EggMgr", "report list is %s, then save it", new Object[] { localObject1.toString() });
            localObject1 = new StringBuilder();
            au.HU();
            com.tencent.mm.a.e.b(com.tencent.mm.model.c.Gp() + "eggresult.rep", (byte[])localObject2, localObject2.length);
          }
        }
        else
        {
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.EggMgr", "data is null, new one");
          localObject1 = new h();
          continue;
        }
        localg.ecM += 1;
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.EggMgr", "statistics crash : %s", new Object[] { localException.getLocalizedMessage() });
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.EggMgr", localException, "", new Object[0]);
        return;
      }
      label283:
      ((com.tencent.mm.ar.g)localObject2).ecM = 1;
      continue;
      label292:
      int i = 0;
      continue;
      label297:
      i = 1;
    }
  }
  
  private static boolean at(String paramString1, String paramString2, String paramString3)
  {
    if ((ai.oW(paramString1)) || (ai.oW(paramString2)) || (ad.getContext() == null)) {}
    String str;
    int i;
    do
    {
      return false;
      str = paramString1.toLowerCase();
      i = str.indexOf(paramString2.toLowerCase());
    } while (i == -1);
    for (;;)
    {
      Object localObject;
      boolean bool1;
      try
      {
        if ((i >= str.length() - 1) || (ai.oW(paramString3))) {
          break label408;
        }
        if ((i <= 0) || (str.charAt(i - 1) < 'a') || (str.charAt(i - 1) > 'z')) {
          break label402;
        }
        com.tencent.mm.sdk.platformtools.x.v("MicroMsg.EggMgr", "letter in the prefix");
        localObject = paramString1.substring(0, i);
        int k = ((String)localObject).lastIndexOf('/');
        j = k;
        if (k == -1) {
          break label414;
        }
        localObject = ((String)localObject).subSequence(k, ((String)localObject).length());
        com.tencent.mm.br.g.cjL();
        localObject = com.tencent.mm.br.f.cjI().Xx((String)localObject);
        if (localObject == null) {
          break label427;
        }
        localObject = ((f.a)localObject).text;
        j = k;
        if (ai.oW((String)localObject)) {
          break label414;
        }
        j = k;
        if (((String)localObject).length() + k != i) {
          break label414;
        }
        com.tencent.mm.sdk.platformtools.x.v("MicroMsg.EggMgr", "letter in the prefix is smiley");
        j = -2;
      }
      catch (Exception paramString1)
      {
        com.tencent.mm.sdk.platformtools.x.v("MicroMsg.EggMgr", "Exception in isKeywordMatch, %s", new Object[] { paramString1.getMessage() });
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.EggMgr", paramString1, "", new Object[0]);
        return false;
      }
      boolean bool2 = bool1;
      if (bool1)
      {
        bool2 = bool1;
        if (paramString2.length() + i < str.length())
        {
          bool2 = bool1;
          if (str.charAt(paramString2.length() + i) >= 'a')
          {
            bool2 = bool1;
            if (str.charAt(paramString2.length() + i) <= 'z')
            {
              com.tencent.mm.sdk.platformtools.x.v("MicroMsg.EggMgr", "letter in the suffix");
              bool2 = false;
            }
          }
        }
      }
      label297:
      if (bool2)
      {
        com.tencent.mm.sdk.platformtools.x.v("MicroMsg.EggMgr", "full match, matchPos = %s, TextLength = %s, keyLength = %s", new Object[] { Integer.valueOf(i), Integer.valueOf(str.length()), Integer.valueOf(paramString2.length()) });
        return bool2;
      }
      int j = str.indexOf(paramString2.toLowerCase(), i + 1);
      i = j;
      if (j == -1)
      {
        return false;
        label402:
        label408:
        label414:
        do
        {
          bool1 = true;
          break;
          bool2 = true;
          break label297;
        } while (j == -2);
        bool1 = false;
        continue;
        label427:
        localObject = null;
      }
    }
  }
  
  public final void a(Activity paramActivity, List<com.tencent.mm.storage.bd> paramList)
  {
    if (paramList == null) {
      return;
    }
    Iterator localIterator1 = paramList.iterator();
    while (localIterator1.hasNext())
    {
      com.tencent.mm.storage.bd localbd = (com.tencent.mm.storage.bd)localIterator1.next();
      au.HU();
      if (ai.bG(ai.d((Long)com.tencent.mm.model.c.DT().get(68108, null))) * 1000L > 21600000L) {
        new ag().postDelayed(new Runnable()
        {
          public final void run()
          {
            if (!au.HX()) {
              return;
            }
            m localm = new m(37);
            au.DF().a(localm, 0);
            au.HU();
            com.tencent.mm.model.c.DT().set(68108, Long.valueOf(ai.VE()));
          }
        }, 10000L);
      }
      paramList = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().aDT();
      int i;
      if (paramList == null)
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.EggMgr", "eggList is null");
        i = 0;
      }
      while (i != 0)
      {
        return;
        int m = (int)bi.VE();
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.EggMgr", "cursecond is %d, getEggList.size is %d", new Object[] { Integer.valueOf(m), Integer.valueOf(paramList.ecJ.size()) });
        Iterator localIterator2 = paramList.ecJ.iterator();
        for (;;)
        {
          if (localIterator2.hasNext())
          {
            com.tencent.mm.ar.d locald = (com.tencent.mm.ar.d)localIterator2.next();
            paramList = locald.ecD;
            int k = 0;
            label218:
            Iterator localIterator3;
            if (ai.oW(paramList))
            {
              i = 1;
              if (i == 0) {
                break label321;
              }
              localIterator3 = locald.ecy.iterator();
            }
            String str2;
            for (;;)
            {
              if (!localIterator3.hasNext()) {
                break label450;
              }
              com.tencent.mm.ar.e locale = (com.tencent.mm.ar.e)localIterator3.next();
              str2 = locale.ecI;
              if (ai.oW(str2))
              {
                com.tencent.mm.sdk.platformtools.x.e("MicroMsg.EggMgr", "error egg keyWord");
                continue;
                paramList = paramList.split(",");
                int n = paramList.length;
                int j = 0;
                for (;;)
                {
                  i = k;
                  if (j >= n) {
                    break label218;
                  }
                  if (paramList[j].equals(w.chP()))
                  {
                    i = 1;
                    break label218;
                    label321:
                    break;
                  }
                  j += 1;
                }
              }
              else
              {
                String str1 = localbd.field_content;
                paramList = str1;
                if (s.fq(localbd.field_talker))
                {
                  i = com.tencent.mm.model.bd.iA(str1);
                  paramList = str1;
                  if (i != -1) {
                    paramList = str1.substring(i + 1).trim();
                  }
                }
                if (at(paramList, str2, locale.lang))
                {
                  if (this.tMs == null)
                  {
                    paramList = (ViewStub)paramActivity.findViewById(R.h.viewstub_chatting_animframe);
                    if (paramList != null) {
                      paramList.inflate();
                    }
                    this.tMs = ((ChattingAnimFrame)paramActivity.findViewById(R.h.chatting_anim_iv));
                  }
                  if (this.tMs != null) {
                    break label452;
                  }
                  com.tencent.mm.sdk.platformtools.x.e("MicroMsg.EggMgr", "AnimFrameView should not be null");
                }
              }
            }
            label450:
            continue;
            label452:
            boolean bool;
            if ((locald.ecB <= m) && (m <= locald.ecC + 86400L))
            {
              this.tMs.a(locald);
              i = locald.ecA;
              if (localbd.field_isSend == 1) {}
              for (bool = true;; bool = false)
              {
                am(i, bool);
                com.tencent.mm.sdk.platformtools.x.d("MicroMsg.EggMgr", "match keyWord[%s], time[%d - %d]", new Object[] { str2, Integer.valueOf(locald.ecB), Integer.valueOf(locald.ecC) });
                i = 1;
                break;
              }
            }
            if ((locald.ecB == locald.ecC) && (locald.ecB == 0))
            {
              this.tMs.a(locald);
              i = locald.ecA;
              if (localbd.field_isSend == 1) {}
              for (bool = true;; bool = false)
              {
                am(i, bool);
                com.tencent.mm.sdk.platformtools.x.d("MicroMsg.EggMgr", "match keyWord[%s], time[0 - 0]", new Object[] { str2 });
                i = 1;
                break;
              }
            }
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.EggMgr", "match keyWord[%s], but not match time[%d - %d]", new Object[] { str2, Integer.valueOf(locald.ecB), Integer.valueOf(locald.ecC) });
            i = 0;
            break;
          }
        }
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.EggMgr", "no match");
        i = 0;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/chatting/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */