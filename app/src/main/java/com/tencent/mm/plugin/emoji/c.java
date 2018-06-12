package com.tencent.mm.plugin.emoji;

import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.x;

public final class c
{
  public static void a(String paramString1, int paramInt1, int paramInt2, int paramInt3, String paramString2, int paramInt4, String paramString3)
  {
    x.i("MicroMsg.emoji.EmojiReportHepler", "report kv stat md5:%s, downType:%d donwloadResult:%d verifyResult:%d productID:%s", new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString2 });
    h.mEJ.h(12007, new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString2, Integer.valueOf(paramInt4), paramString3 });
  }
  
  public static void cA(long paramLong)
  {
    x.i("MicroMsg.emoji.EmojiReportHepler", "report id stat key:%d, value:%d", new Object[] { Long.valueOf(paramLong), Long.valueOf(1L) });
    h.mEJ.a(96L, paramLong, 1L, false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/emoji/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */