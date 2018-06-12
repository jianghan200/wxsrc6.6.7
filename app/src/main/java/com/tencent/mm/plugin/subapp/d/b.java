package com.tencent.mm.plugin.subapp.d;

import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.x;

public final class b
{
  public static void b(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    x.i("MicroMsg.VoiceTransformTextReporter", "alvinluo reportTransformTextResult voiceId: %s, wordCount: %d, waitTime: %d, animationTime: %d, result: %d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    h.mEJ.h(14220, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt2 + paramInt3), Integer.valueOf(paramInt4), paramString });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/subapp/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */