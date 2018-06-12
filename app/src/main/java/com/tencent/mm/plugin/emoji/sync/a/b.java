package com.tencent.mm.plugin.emoji.sync.a;

import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.cs;
import com.tencent.mm.model.au;
import com.tencent.mm.modelcdntran.c;
import com.tencent.mm.plugin.emoji.sync.d;
import com.tencent.mm.plugin.emoji.sync.e;
import com.tencent.mm.protocal.c.add;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.j;
import java.io.IOException;

public final class b
  extends d
{
  private boolean iiQ = false;
  private String iiv;
  private e ijL;
  private com.tencent.mm.plugin.emoji.f.g ijT;
  
  public b(String paramString)
  {
    if (bi.oW(paramString)) {
      x.e("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "[cpan]");
    }
    this.iiv = paramString;
  }
  
  public b(String paramString, byte paramByte)
  {
    if (bi.oW(paramString)) {
      x.e("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "[cpan]");
    }
    this.iiv = paramString;
    this.iiQ = true;
  }
  
  public final void a(e parame)
  {
    this.ijL = parame;
  }
  
  public final void cancel()
  {
    if ((this.ijT != null) && (!bi.oW(this.ijT.dVk)))
    {
      com.tencent.mm.modelcdntran.g.ND().lx(this.ijT.dVk);
      x.i("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "success cancel exchange emotion pack clientid:%s", new Object[] { this.ijT.dVk });
      return;
    }
    x.i("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "failed cancel exchange emotion pack.");
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject != null) && ((paramObject instanceof b)))
    {
      paramObject = (b)paramObject;
      if ((!bi.oW(this.iiv)) && (!bi.oW(((b)paramObject).getKey())) && (this.iiv.equals(((b)paramObject).getKey()))) {
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
    Object localObject;
    if (this.ijL != null)
    {
      this.ijL.zI(getKey());
      localObject = com.tencent.mm.plugin.emoji.model.i.aEA().igy.br(getKey(), true);
      if ((this.iiQ) || (localObject == null) || (((EmojiGroupInfo)localObject).field_sync != 2) || (((EmojiGroupInfo)localObject).field_status != 7)) {
        break label117;
      }
      localObject = new cs();
      ((cs)localObject).bKf.bKg = getKey();
      ((cs)localObject).bKf.bIH = 2;
      ((cs)localObject).bKf.success = true;
      com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
    }
    for (;;)
    {
      return;
      x.w("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "call back is null");
      break;
      label117:
      this.ijT = new com.tencent.mm.plugin.emoji.f.g(this.iiv);
      au.DF().a(this.ijT, 0);
      localObject = new add();
      com.tencent.mm.storage.emotion.i locali = com.tencent.mm.plugin.emoji.model.i.aEA().igB.ZE(this.iiv);
      if ((locali != null) && (locali.field_content != null)) {}
      try
      {
        ((add)localObject).aG(locali.field_content);
        if (((add)localObject).rHx != null) {
          continue;
        }
        localObject = new com.tencent.mm.plugin.emoji.f.l(this.iiv, 15);
        au.DF().a((com.tencent.mm.ab.l)localObject, 0);
        return;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          x.e("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "exception:%s", new Object[] { bi.i(localIOException) });
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/emoji/sync/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */