package com.tencent.mm.plugin.emoji.e;

import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.emoji.f.g;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.util.ArrayList;

public class c
{
  public static c ifi;
  public ArrayList<String> ifj = new ArrayList();
  public boolean ifk = true;
  public boolean ifl = false;
  
  public static void a(EmojiInfo paramEmojiInfo, boolean paramBoolean)
  {
    if (paramEmojiInfo != null)
    {
      paramEmojiInfo.field_reserved4 = 0;
      i.aEA().igx.q(paramEmojiInfo);
      i.aEu().g(paramEmojiInfo);
      if (paramBoolean) {
        h.mEJ.a(231L, 0L, 1L, false);
      }
    }
    else
    {
      return;
    }
    h.mEJ.a(231L, 1L, 1L, false);
  }
  
  public static c aDJ()
  {
    if (ifi == null) {}
    try
    {
      ifi = new c();
      return ifi;
    }
    finally {}
  }
  
  private static boolean aDK()
  {
    return (ao.is3G(ad.getContext())) || (ao.is4G(ad.getContext())) || (ao.is2G(ad.getContext()));
  }
  
  private void b(EmojiInfo paramEmojiInfo, boolean paramBoolean)
  {
    if (this.ifj == null) {
      this.ifj = new ArrayList();
    }
    this.ifj.add(paramEmojiInfo.field_groupId);
    paramEmojiInfo = new g(paramEmojiInfo.field_groupId);
    au.DF().a(paramEmojiInfo, 0);
    if (paramBoolean)
    {
      h.mEJ.a(231L, 3L, 1L, false);
      return;
    }
    h.mEJ.a(231L, 2L, 1L, false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/emoji/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */