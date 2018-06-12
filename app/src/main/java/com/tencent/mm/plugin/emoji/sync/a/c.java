package com.tencent.mm.plugin.emoji.sync.a;

import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.plugin.emoji.sync.d;
import com.tencent.mm.plugin.emoji.sync.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.a;

public final class c
  extends d
{
  private String iiv;
  private e ijL;
  
  public c(String paramString)
  {
    if (bi.oW(paramString)) {
      x.e("MicroMsg.BKGLoader.EmojiStoreTukaziSyncTask", "[cpan] empty productid");
    }
    this.iiv = paramString;
  }
  
  public final void a(e parame)
  {
    this.ijL = parame;
  }
  
  public final void cancel() {}
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject != null) && ((paramObject instanceof c)))
    {
      paramObject = (c)paramObject;
      if ((!bi.oW(this.iiv)) && (!bi.oW(((c)paramObject).getKey())) && (this.iiv.equals(((c)paramObject).getKey()))) {
        return true;
      }
    }
    return false;
  }
  
  public final String getKey()
  {
    if (this.iiv == null) {
      return "";
    }
    return this.iiv;
  }
  
  public final void run()
  {
    if (this.ijL != null) {
      this.ijL.zI(getKey());
    }
    for (;;)
    {
      EmojiGroupInfo localEmojiGroupInfo = i.aEA().igy.br(EmojiGroupInfo.tcy, false);
      localEmojiGroupInfo.field_flag = 0;
      i.aEA().igy.a(localEmojiGroupInfo);
      if (this.ijL != null) {
        this.ijL.j(getKey(), 2, true);
      }
      return;
      x.w("MicroMsg.BKGLoader.EmojiStoreTukaziSyncTask", "call back is null");
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/emoji/sync/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */