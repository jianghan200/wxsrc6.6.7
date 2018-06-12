package com.tencent.mm.plugin.emoji.sync.a;

import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.emoji.f.f;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.plugin.emoji.sync.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.emotion.EmojiInfo;

public final class d
  extends com.tencent.mm.plugin.emoji.sync.d
{
  private e ijL;
  private com.tencent.mm.ab.l ijU;
  private EmojiInfo ijV;
  private String mKey;
  
  public d(String paramString)
  {
    if (bi.oW(paramString)) {
      x.e("MicroMsg.BKGLoader.EmojiUploadTask", "[cpan] can not create task. md5 is null.");
    }
    this.mKey = paramString;
    this.ijV = i.aEA().igx.Zy(this.mKey);
  }
  
  public final void a(e parame)
  {
    this.ijL = parame;
  }
  
  public final void cancel() {}
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject != null) && ((paramObject instanceof d)))
    {
      paramObject = (d)paramObject;
      if ((!bi.oW(this.mKey)) && (!bi.oW(((d)paramObject).mKey)) && (this.mKey.equals(((d)paramObject).mKey))) {
        return true;
      }
    }
    return false;
  }
  
  public final String getKey()
  {
    return this.mKey;
  }
  
  public final void run()
  {
    if (this.ijL != null) {
      this.ijL.zI(this.mKey);
    }
    while (this.ijV == null)
    {
      this.ijL.j(this.mKey, 1, false);
      return;
      x.w("MicroMsg.BKGLoader.EmojiUploadTask", "call back is null.");
    }
    this.ijU = new f(this.ijV);
    au.DF().a(this.ijU, 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/emoji/sync/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */