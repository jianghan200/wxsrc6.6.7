package com.tencent.mm.plugin.emoji.h;

import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;

public final class a
{
  public static boolean aFS()
  {
    return i.aEA().igy.cne();
  }
  
  public static final String aGv()
  {
    return EmojiGroupInfo.tcy;
  }
  
  public static boolean b(EmojiGroupInfo paramEmojiGroupInfo)
  {
    if (paramEmojiGroupInfo == null) {
      return false;
    }
    return zT(paramEmojiGroupInfo.field_productID);
  }
  
  public static boolean d(ts paramts)
  {
    if (paramts == null) {
      return false;
    }
    return zT(paramts.rem);
  }
  
  public static boolean zT(String paramString)
  {
    if (paramString == null) {
      return false;
    }
    return paramString.equals(aGv());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/emoji/h/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */