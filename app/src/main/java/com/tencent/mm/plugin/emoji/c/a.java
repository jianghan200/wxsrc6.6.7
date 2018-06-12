package com.tencent.mm.plugin.emoji.c;

import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.lw;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.emoji.f.s;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.plugin.emoji.sync.BKGLoaderManager;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.util.ArrayList;

public final class a
  extends com.tencent.mm.sdk.b.c<lw>
{
  public a()
  {
    this.sFo = lw.class.getName().hashCode();
  }
  
  public static void aDH()
  {
    au.HU();
    boolean bool = bi.a((Boolean)com.tencent.mm.model.c.DT().get(348162, null), false);
    au.HU();
    Object localObject;
    if ((!bi.a((Boolean)com.tencent.mm.model.c.DT().get(aa.a.sOQ, null), false)) && (bool))
    {
      au.HU();
      localObject = com.tencent.mm.model.c.DT().get(348163, null);
      if ((localObject == null) || (!(localObject instanceof Long))) {
        break label369;
      }
    }
    label237:
    label341:
    label369:
    for (long l = ((Long)localObject).longValue();; l = 0L)
    {
      int i;
      if (System.currentTimeMillis() - l > 3600000L) {
        i = 1;
      }
      for (;;)
      {
        if (i != 0)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiPostTaskListener", "[cpan] start do backup emoji.");
          localObject = (ArrayList)i.aEA().igx.cnH();
          if (((ArrayList)localObject).size() > 0) {
            break;
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiPostTaskListener", "[cpan] no local emoji need not to backup ");
          au.HU();
          com.tencent.mm.model.c.DT().set(348162, Boolean.valueOf(false));
        }
        return;
        i = 0;
        continue;
        i = 0;
      }
      au.HU();
      com.tencent.mm.model.c.DT().set(348163, Long.valueOf(System.currentTimeMillis()));
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiPostTaskListener", "[cpan] start backup local emoji ");
      if (((ArrayList)localObject).size() > 50)
      {
        int k = ((ArrayList)localObject).size();
        int m = k / 50;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiPostTaskListener", "count:%d", new Object[] { Integer.valueOf(m) });
        i = 0;
        ArrayList localArrayList;
        int n;
        if (i <= m)
        {
          localArrayList = new ArrayList();
          n = i * 50;
          if ((i + 1) * 50 - 1 < k) {
            break label341;
          }
        }
        for (int j = k;; j = (i + 1) * 50)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiPostTaskListener", "start index:%d to index:%d", new Object[] { Integer.valueOf(n), Integer.valueOf(j) });
          if (j > n)
          {
            localArrayList.addAll(((ArrayList)localObject).subList(n, j));
            au.DF().a(new com.tencent.mm.plugin.emoji.f.d(localArrayList), 0);
          }
          i += 1;
          break label237;
          break;
        }
      }
      au.DF().a(new com.tencent.mm.plugin.emoji.f.d((ArrayList)localObject), 0);
      return;
    }
  }
  
  public static void eh(boolean paramBoolean)
  {
    au.HU();
    Object localObject = com.tencent.mm.model.c.DT().get(aa.a.sOR, null);
    if ((localObject != null) && ((localObject instanceof Long))) {}
    for (long l = ((Long)localObject).longValue();; l = 0L)
    {
      if (System.currentTimeMillis() - l > 86400000L) {}
      for (int i = 1;; i = 0)
      {
        if ((i != 0) || (paramBoolean))
        {
          boolean bool = i.aEA().igy.cnq();
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiPostTaskListener", "uploadStoreEmoji need upload:%b", new Object[] { Boolean.valueOf(bool) });
          if ((!bool) && (!paramBoolean)) {
            break;
          }
          localObject = new s(i.aEA().igy.cns(), 1);
          au.DF().a((com.tencent.mm.ab.l)localObject, 0);
        }
        return;
      }
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sOU, Boolean.valueOf(true));
      return;
    }
  }
  
  public static void ei(boolean paramBoolean)
  {
    au.HU();
    Object localObject;
    if (bi.a((Boolean)com.tencent.mm.model.c.DT().get(348165, null), false))
    {
      au.HU();
      localObject = com.tencent.mm.model.c.DT().get(348166, null);
      if ((localObject == null) || (!(localObject instanceof Long))) {
        break label269;
      }
    }
    label243:
    label269:
    for (long l = ((Long)localObject).longValue();; l = 0L)
    {
      int i;
      if (System.currentTimeMillis() - l > 3600000L) {
        i = 1;
      }
      while ((i != 0) || (paramBoolean))
      {
        localObject = i.aEA().igx.cnL();
        if (((ArrayList)localObject).size() <= 0) {
          break label243;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiPostTaskListener", "try to sync emoji uploadEmojiList:%d", new Object[] { Integer.valueOf(((ArrayList)localObject).size()) });
        ArrayList localArrayList = new ArrayList();
        int j = ((ArrayList)localObject).size();
        i = 0;
        for (;;)
        {
          if (i < j)
          {
            localArrayList.add(new com.tencent.mm.plugin.emoji.sync.a.d((String)((ArrayList)localObject).get(i)));
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiPostTaskListener", "try to sync emoji upload Emoji:%s", new Object[] { ((ArrayList)localObject).get(i) });
            i += 1;
            continue;
            i = 0;
            break;
            i = 0;
            break;
          }
        }
        i.aEx().ije.aO(localArrayList);
        i.aEx().ije.aEV();
      }
      for (;;)
      {
        au.HU();
        com.tencent.mm.model.c.DT().set(348166, Long.valueOf(System.currentTimeMillis()));
        return;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiPostTaskListener", "no things need to upload.");
        au.HU();
        com.tencent.mm.model.c.DT().set(348165, Boolean.valueOf(false));
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/emoji/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */