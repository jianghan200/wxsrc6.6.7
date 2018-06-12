package com.tencent.mm.plugin.emoji.g;

import com.tencent.mm.ab.d.a;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bv.a;
import com.tencent.mm.model.c;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.plugin.emoji.sync.BKGLoaderManager;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.protocal.c.ta;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class a
  implements bv.a
{
  public final void a(d.a parama)
  {
    parama = parama.dIN;
    if (parama.jQd == 10002)
    {
      parama = ab.a(parama.rcl);
      if (bi.oW(parama)) {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "msg content is null");
      }
      Object localObject3;
      int i;
      label381:
      do
      {
        do
        {
          return;
          localObject2 = bl.z(parama, "sysmsg");
        } while ((localObject2 == null) || (((Map)localObject2).size() <= 0));
        localObject3 = (String)((Map)localObject2).get(".sysmsg.$type");
        Object localObject1 = bi.bE(com.tencent.mm.bk.b.bi(q.zz().getBytes()).Cz(16).lR);
        int j;
        if ((!bi.oW((String)localObject3)) && (((String)localObject3).equalsIgnoreCase("EmojiBackup")))
        {
          i = Integer.valueOf((String)((Map)localObject2).get(".sysmsg.EmojiBackup.OpCode")).intValue();
          localObject2 = (String)((Map)localObject2).get(".sysmsg.EmojiBackup.DeviceID");
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "client devicesID:%s server devicesID:%s", new Object[] { localObject1, localObject2 });
          if ((!bi.oW((String)localObject2)) && (((String)localObject2).equalsIgnoreCase((String)localObject1)))
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "same devices operate ignore.");
            return;
          }
          parama = b.zF(parama);
          if (i == 1)
          {
            if ((parama == null) || (parama.size() <= 0))
            {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "xml syn list is null.");
              return;
            }
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "try to sync emoji from newxml. buckupList:%d", new Object[] { Integer.valueOf(parama.size()) });
            localObject1 = new ArrayList();
            j = parama.size();
            i = 0;
            if (i < j)
            {
              localObject2 = (ta)parama.get(i);
              if (localObject2 != null)
              {
                localObject3 = i.aEA().igx.Zy(((ta)localObject2).rwk);
                if ((localObject3 != null) && (((EmojiInfo)localObject3).cnv()) && (((EmojiInfo)localObject3).field_catalog == EmojiInfo.tcH)) {
                  break label381;
                }
                ((ArrayList)localObject1).add(new com.tencent.mm.plugin.emoji.sync.a.a(((ta)localObject2).rwk, ((ta)localObject2).jPK, ((ta)localObject2).lPl, ((ta)localObject2).rwl, ((ta)localObject2).rwm, ((ta)localObject2).rwn, ((ta)localObject2).rem, ((ta)localObject2).rwq));
              }
              for (;;)
              {
                i += 1;
                break;
                com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "md5:%s not need to download", new Object[] { ((ta)localObject2).rwk });
              }
            }
            if (((ArrayList)localObject1).size() > 0)
            {
              i.aEx().s((ArrayList)localObject1);
              i.aEx().ije.aEV();
            }
          }
          for (;;)
          {
            au.HU();
            c.DT().a(aa.a.sOY, Boolean.valueOf(true));
            return;
            if (i == 2)
            {
              if ((parama == null) || (parama.size() <= 0))
              {
                com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "xml syn list is null.");
                return;
              }
              localObject1 = new ArrayList();
              if ((parama != null) && (parama.size() > 0))
              {
                parama = parama.iterator();
                while (parama.hasNext())
                {
                  localObject2 = (ta)parama.next();
                  if (localObject2 != null) {
                    ((ArrayList)localObject1).add(((ta)localObject2).rwk);
                  }
                }
              }
              i.aEA().igx.dt((List)localObject1);
              au.HU();
              c.DT().a(aa.a.sOQ, Boolean.valueOf(false));
            }
            else if (i == 3)
            {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "set batch emoji download time to 0. ");
              au.HU();
              c.DT().a(aa.a.sPb, Long.valueOf(0L));
            }
          }
        }
        if ((bi.oW((String)localObject3)) || (!((String)localObject3).equalsIgnoreCase("EmotionBackup"))) {
          break;
        }
        i = Integer.valueOf((String)((Map)localObject2).get(".sysmsg.EmotionBackup.OpCode")).intValue();
        Object localObject2 = (String)((Map)localObject2).get(".sysmsg.EmotionBackup.DeviceID");
        if ((!bi.oW((String)localObject2)) && (((String)localObject2).equalsIgnoreCase((String)localObject1)))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "same devices operate ignore.");
          return;
        }
        parama = b.zG(parama);
        if ((parama == null) || (parama.size() <= 0))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "xml syn list is null.");
          return;
        }
        if (i == 1)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "try to sync emoji from newxml. add buckupList:%d", new Object[] { Integer.valueOf(parama.size()) });
          localObject1 = new ArrayList();
          j = parama.size();
          i = 0;
          while (i < j)
          {
            ((ArrayList)localObject1).add(new com.tencent.mm.plugin.emoji.sync.a.b((String)parama.get(i)));
            i += 1;
          }
          i.aEx().t((ArrayList)localObject1);
          i.aEx().ije.aEV();
          return;
        }
      } while (i != 2);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "try to sync emoji from newxml. delete buckupList:%d", new Object[] { Integer.valueOf(parama.size()) });
      i.aEA().igy.ac(parama);
      return;
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "not emoji message type :" + (String)localObject3);
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "not new xml type:%d ", new Object[] { Integer.valueOf(parama.jQd) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/emoji/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */