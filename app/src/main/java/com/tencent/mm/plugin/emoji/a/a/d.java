package com.tencent.mm.plugin.emoji.a.a;

import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ao;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class d
  extends c
{
  private final String TAG = "MicroMsg.emoji.EmojiListMineData";
  
  public d(com.tencent.mm.plugin.emoji.model.f paramf)
  {
    super(paramf);
  }
  
  public final void aDF() {}
  
  public final void clear()
  {
    super.clear();
  }
  
  public final void notifyDataSetChanged()
  {
    try
    {
      Object localObject1 = i.aEA().igy.cnt();
      boolean bool = com.tencent.mm.plugin.emoji.h.a.aFS();
      this.mItemList = new ArrayList();
      x.v("MicroMsg.emoji.EmojiListMineData", "============= refresh Data By DB");
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        ts localts = ((EmojiGroupInfo)((Iterator)localObject1).next()).cnc();
        f localf = new f(localts);
        if ((com.tencent.mm.plugin.emoji.h.a.d(localts)) && (bool))
        {
          ao localao = new ao(localts.rem);
          this.iev.put(localts.rem, localao);
        }
        localf.setStatus(9);
        this.mItemList.add(localf);
      }
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/emoji/a/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */