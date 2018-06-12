package com.tencent.mm.plugin.emoji.model;

import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.emoji.f.g;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class j
{
  Set<String> ihY;
  Set<String> ihZ;
  Set<String> iia;
  c iib = new j.1(this);
  c iic = new j.2(this);
  
  public j()
  {
    com.tencent.mm.sdk.b.a.sFg.b(this.iib);
    com.tencent.mm.sdk.b.a.sFg.b(this.iic);
    this.ihY = Collections.synchronizedSet(new HashSet());
    this.ihZ = Collections.synchronizedSet(new HashSet());
    this.iia = Collections.synchronizedSet(new HashSet());
  }
  
  final void aEE()
  {
    for (;;)
    {
      if (this.ihZ.isEmpty()) {
        x.i("MicroMsg.emoji.WearEmojiLogic", "no emoji need download");
      }
      do
      {
        return;
        if (!this.iia.isEmpty())
        {
          x.i("MicroMsg.emoji.WearEmojiLogic", "downloading emoji %s", new Object[] { this.iia.toString() });
          return;
        }
        localObject = this.ihZ.iterator();
      } while (localObject == null);
      localObject = (String)((Iterator)localObject).next();
      this.ihZ.remove(localObject);
      EmojiGroupInfo localEmojiGroupInfo = i.aEA().igy.br((String)localObject, true);
      if ((localEmojiGroupInfo == null) || ((localEmojiGroupInfo.field_flag & 0x100) <= 0)) {
        break;
      }
      x.i("MicroMsg.emoji.WearEmojiLogic", "emoji already exist %s", new Object[] { localObject });
    }
    x.i("MicroMsg.emoji.WearEmojiLogic", "start to download emoji %s", new Object[] { localObject });
    this.iia.add(localObject);
    Object localObject = new g((String)localObject, "");
    au.DF().a((com.tencent.mm.ab.l)localObject, 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/emoji/model/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */