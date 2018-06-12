package com.tencent.mm.plugin.hp.tinker;

import android.os.Looper;
import com.tencent.mm.modelmulti.m;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.tinker.lib.service.DefaultTinkerResultService;
import com.tencent.tinker.loader.app.ApplicationLike;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;

public class TinkerPatchResultService
  extends DefaultTinkerResultService
{
  public final void a(com.tencent.tinker.lib.service.a parama)
  {
    int j = 1;
    if (parama == null) {
      com.tencent.tinker.lib.f.a.e("Tinker.TinkerPatchResultService", "TinkerPatchResultService received null result!!!!", new Object[0]);
    }
    do
    {
      return;
      com.tencent.tinker.lib.f.a.i("Tinker.TinkerPatchResultService", "TinkerPatchResultService receive result: %s", new Object[] { parama.toString() });
      new ag(Looper.getMainLooper()).postDelayed(new TinkerPatchResultService.1(this), 10000L);
    } while (!parama.bLW);
    Object localObject = com.tencent.mm.app.b.applicationLike;
    int i = j;
    if (com.tencent.tinker.lib.e.b.d((ApplicationLike)localObject))
    {
      localObject = com.tencent.tinker.lib.e.b.e((ApplicationLike)localObject);
      i = j;
      if (!ShareTinkerInternals.oW((String)localObject))
      {
        i = j;
        if (parama.vsp != null)
        {
          i = j;
          if (parama.vsp.equals(localObject)) {
            i = 0;
          }
        }
      }
    }
    if (i != 0)
    {
      new m(ad.getContext(), new TinkerPatchResultService.2(this));
      return;
    }
    com.tencent.tinker.lib.f.a.i("Tinker.TinkerPatchResultService", "I have already install the newly patch version!", new Object[0]);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/hp/tinker/TinkerPatchResultService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */