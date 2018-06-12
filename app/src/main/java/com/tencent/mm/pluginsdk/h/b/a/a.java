package com.tencent.mm.pluginsdk.h.b.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.sdk.platformtools.bi;
import java.io.File;

public final class a
{
  public static boolean b(String paramString, Context paramContext, boolean paramBoolean)
  {
    o.Ta();
    return c(s.nK(paramString), paramContext, paramBoolean);
  }
  
  public static boolean c(String paramString, Context paramContext, boolean paramBoolean)
  {
    if (bi.oW(paramString)) {}
    for (;;)
    {
      return false;
      if (paramContext != null)
      {
        Intent localIntent = new Intent("android.intent.action.VIEW").addFlags(268435456);
        localIntent.putExtra("ChannelID", "com.tencent.mm");
        localIntent.putExtra("PosID", 3);
        paramString = Uri.fromFile(new File(paramString));
        if (paramBoolean) {
          localIntent.setDataAndType(paramString, "video/quicktime");
        }
        while (bi.k(paramContext, localIntent))
        {
          paramContext.startActivity(localIntent);
          return true;
          localIntent.setDataAndType(paramString, "video/*");
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/pluginsdk/h/b/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */