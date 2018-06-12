package com.tencent.mm.app;

import com.tencent.mm.loader.stub.a;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.app.ApplicationLike;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import java.util.HashMap;

public final class j
{
  static ApplicationLike applicationLike;
  static String byA = "";
  static long bya;
  String byB;
  String byC;
  long byD;
  long byE;
  
  public j(ApplicationLike paramApplicationLike)
  {
    applicationLike = paramApplicationLike;
    b.applicationLike = paramApplicationLike;
  }
  
  static void a(ApplicationLike paramApplicationLike)
  {
    if (paramApplicationLike == null) {}
    for (;;)
    {
      return;
      if ((paramApplicationLike == null) || (paramApplicationLike.getApplication() == null)) {
        throw new TinkerRuntimeException("tinkerApplication is null");
      }
      paramApplicationLike = paramApplicationLike.getTinkerResultIntent();
      if ((paramApplicationLike != null) && (ShareIntentUtil.aE(paramApplicationLike) == 0)) {}
      for (paramApplicationLike = ShareIntentUtil.aK(paramApplicationLike); paramApplicationLike != null; paramApplicationLike = null)
      {
        a.PATCH_REV = (String)paramApplicationLike.get("patch.rev");
        x.w("MicroMsg.MMApplicationLikeImpl", "application set patch rev:%s", new Object[] { a.PATCH_REV });
        return;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/app/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */