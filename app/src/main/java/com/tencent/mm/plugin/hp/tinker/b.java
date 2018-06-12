package com.tencent.mm.plugin.hp.tinker;

import android.app.ActivityManager;
import android.content.Context;
import com.tencent.mm.app.p;
import com.tencent.mm.plugin.hp.d.c;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.io.File;
import java.util.Properties;

public final class b
  extends com.tencent.tinker.lib.b.a
{
  private final int kmZ;
  
  public b(Context paramContext)
  {
    super(paramContext);
    this.kmZ = ((ActivityManager)paramContext.getSystemService("activity")).getMemoryClass();
    com.tencent.tinker.lib.f.a.i("Tinker.TinkerPatchListener", "application maxMemory:" + this.kmZ, new Object[0]);
  }
  
  public final int dp(String paramString1, String paramString2)
  {
    boolean bool = false;
    File localFile = new File(paramString1);
    com.tencent.tinker.lib.f.a.i("Tinker.TinkerPatchListener", "receive a patch file: %s, file size:%d", new Object[] { paramString1, Long.valueOf(SharePatchFileUtil.ai(localFile)) });
    int j = super.dp(paramString1, paramString2);
    int i = j;
    if (j == 0)
    {
      if (this.kmZ < 45) {
        i = -23;
      }
    }
    else
    {
      j = i;
      if (i == 0)
      {
        com.tencent.tinker.lib.e.a.hL(this.context);
        j = i;
        if (i == 0)
        {
          paramString1 = ShareTinkerInternals.ao(localFile);
          if (paramString1 != null) {
            break label173;
          }
          j = -24;
        }
      }
    }
    for (;;)
    {
      i = j;
      if (j == 0)
      {
        i = j;
        if (ShareTinkerInternals.cHe())
        {
          i = j;
          if (p.a(new Throwable().getStackTrace())) {
            i = -26;
          }
        }
      }
      if (i == 0) {
        bool = true;
      }
      com.tencent.mm.plugin.hp.b.b.fK(bool);
      return i;
      if (!c.aWA())
      {
        i = -21;
        break;
      }
      i = 0;
      break;
      label173:
      paramString1 = paramString1.getProperty("patch.basepack.client.ver");
      com.tencent.tinker.lib.f.a.i("Tinker.TinkerPatchListener", "get BASE_CLIENT_VERSION:" + paramString1, new Object[0]);
      if (paramString1 != null)
      {
        j = i;
        if (paramString1.equalsIgnoreCase(com.tencent.mm.loader.stub.a.CLIENT_VERSION)) {}
      }
      else
      {
        j = -25;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/hp/tinker/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */