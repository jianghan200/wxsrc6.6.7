package com.tencent.mm.plugin.emoji.model;

import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tj;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import java.util.ArrayList;
import java.util.List;

public final class f
{
  public int ihp;
  public List<com.tencent.mm.plugin.emoji.a.a.f> ihq;
  public th ihr;
  public List<th> ihs;
  public List<tj> iht;
  public List<tj> ihu;
  
  public final void aEr()
  {
    if (this.ihu == null) {}
    for (;;)
    {
      return;
      if (!this.ihu.isEmpty())
      {
        ArrayList localArrayList = new ArrayList();
        localArrayList.addAll(this.ihu);
        int i = localArrayList.size() - 1;
        while (i >= 0)
        {
          this.ihq.add(0, new com.tencent.mm.plugin.emoji.a.a.f((tj)localArrayList.get(i)));
          this.ihp += 1;
          this.ihu.remove(localArrayList.get(i));
          i -= 1;
        }
      }
    }
  }
  
  public final void aN(List<com.tencent.mm.plugin.emoji.a.a.f> paramList)
  {
    if (this.ihq == null) {
      this.ihq = new ArrayList();
    }
    for (;;)
    {
      this.ihq.addAll(paramList);
      return;
      int i = this.ihq.size() - 1;
      if ((i >= 0) && (i < this.ihq.size()))
      {
        com.tencent.mm.plugin.emoji.a.a.f localf = (com.tencent.mm.plugin.emoji.a.a.f)this.ihq.get(i);
        if ((localf != null) && (localf.iez != null) && (!bi.oW(localf.iez.rem)) && (localf.iez.rem.equals(EmojiGroupInfo.tcy))) {
          this.ihq.remove(localf);
        }
      }
    }
  }
  
  public final void oL(int paramInt)
  {
    this.ihp += paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/emoji/model/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */