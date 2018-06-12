package com.tencent.tinker.lib.b;

import android.content.Context;
import com.tencent.tinker.lib.e.d;
import com.tencent.tinker.lib.service.TinkerPatchService;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.io.File;

public class a
  implements b
{
  public final Context context;
  
  public a(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public final int acN(String paramString)
  {
    int i = dp(paramString, SharePatchFileUtil.ak(new File(paramString)));
    if (i == 0)
    {
      TinkerPatchService.bM(this.context, paramString);
      return i;
    }
    com.tencent.tinker.lib.e.a.hL(this.context).vsy.c(new File(paramString), i);
    return i;
  }
  
  public int dp(String paramString1, String paramString2)
  {
    com.tencent.tinker.lib.e.a locala = com.tencent.tinker.lib.e.a.hL(this.context);
    if ((!ShareTinkerInternals.In(locala.tinkerFlags)) || (!ShareTinkerInternals.ib(this.context))) {
      return -1;
    }
    if (!SharePatchFileUtil.ah(new File(paramString1))) {
      return -2;
    }
    if (locala.vsC) {
      return -4;
    }
    if (com.tencent.tinker.lib.f.b.hN(this.context)) {
      return -3;
    }
    if (ShareTinkerInternals.cHf()) {
      return -5;
    }
    paramString1 = com.tencent.tinker.lib.e.a.hL(this.context);
    if (paramString1.vsE)
    {
      paramString1 = paramString1.vsD;
      if ((paramString1 != null) && (!paramString1.vsL) && (paramString2.equals(paramString1.vsI))) {
        return -6;
      }
    }
    if (!com.tencent.tinker.lib.f.c.hQ(this.context).acP(paramString2)) {
      return -7;
    }
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tinker/lib/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */