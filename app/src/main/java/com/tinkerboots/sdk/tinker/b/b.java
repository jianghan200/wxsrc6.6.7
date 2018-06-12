package com.tinkerboots.sdk.tinker.b;

import android.content.Context;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tinkerboots.sdk.b.c;
import java.io.File;

public final class b
  extends com.tencent.tinker.lib.b.a
{
  public b(Context paramContext)
  {
    super(paramContext);
  }
  
  public final int dp(String paramString1, String paramString2)
  {
    int i = 0;
    com.tencent.tinker.lib.f.a.i("Tinker.TinkerServerPatchListener", "receive a patch file: %s, file size:%d", new Object[] { paramString1, Long.valueOf(SharePatchFileUtil.ai(new File(paramString1))) });
    int j = super.dp(paramString1, paramString2);
    if (j == 0)
    {
      if (c.cJF()) {
        i = -20;
      }
      return i;
    }
    return j;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tinkerboots/sdk/tinker/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */