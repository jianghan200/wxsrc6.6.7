package com.tencent.mm.pluginsdk.ui.d;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.mm.R.l;
import com.tencent.mm.kernel.a;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.plugin.downloader.model.e.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.base.s;
import java.io.File;

public final class q
{
  public static void f(Context paramContext, Bundle paramBundle)
  {
    if (paramBundle != null) {}
    for (int i = paramBundle.getInt("fromScene");; i = 0)
    {
      h.mEJ.h(11621, new Object[] { Integer.valueOf(i), Integer.valueOf(0) });
      paramBundle = d.aCU().yP("http://dianhua.qq.com/cgi-bin/cloudgrptemplate?t=dianhuaben_download&channel=100008");
      if ((paramBundle == null) || (paramBundle.status != 3)) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WxPhoneBookHelper", "weixin phonebook already download successfully, install directly");
      if (com.tencent.mm.a.e.cn(paramBundle.path)) {
        com.tencent.mm.pluginsdk.model.app.q.g(paramContext, Uri.fromFile(new File(paramBundle.path)));
      }
      return;
    }
    s.makeText(paramContext, paramContext.getString(R.l.chatting_phone_downloading_wxpb), 2000).show();
    paramBundle = new e.a();
    paramBundle.yQ("http://dianhua.qq.com/cgi-bin/cloudgrptemplate?t=dianhuaben_download&channel=100008");
    paramBundle.yS(paramContext.getString(R.l.chatting_phone_wxpb));
    paramBundle.ox(1);
    paramBundle.ef(true);
    d.aCU().a(paramBundle.ick);
  }
  
  public static boolean vq()
  {
    boolean bool3 = true;
    if (!com.tencent.mm.kernel.g.Eg().Dx()) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WxPhoneBookHelper", "needDisplayWxPBMenuItem, account not ready");
    }
    int i;
    label85:
    label102:
    label160:
    label165:
    label170:
    label175:
    do
    {
      return false;
      boolean bool4;
      boolean bool1;
      boolean bool2;
      if ((!bi.fU(ad.getContext())) && (com.tencent.mm.sdk.platformtools.e.bxk != 1) && (bi.getInt(com.tencent.mm.k.g.AT().getValue("ShowWeixinPBIntro"), 0) == 0) && (!p.r(ad.getContext(), "com.tencent.pb")))
      {
        i = 1;
        if (i != 0) {
          break label175;
        }
        bool4 = bi.fU(ad.getContext());
        if (com.tencent.mm.sdk.platformtools.e.bxk == 1) {
          break label160;
        }
        bool1 = true;
        if (bi.getInt(com.tencent.mm.k.g.AT().getValue("ShowWeixinPBIntro"), 0) != 0) {
          break label165;
        }
        bool2 = true;
        if (p.r(ad.getContext(), "com.tencent.pb")) {
          break label170;
        }
      }
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.WxPhoneBookHelper", "%b, %b, %b, %b", new Object[] { Boolean.valueOf(bool4), Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
        return false;
        i = 0;
        break;
        bool1 = false;
        break label85;
        bool2 = false;
        break label102;
        bool3 = false;
      }
      i = bi.a((Integer)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sPC, null), 3);
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.WxPhoneBookHelper", "needDisplayWxPBMenuItem, counter = %d", new Object[] { Integer.valueOf(i) });
    } while (i <= 0);
    com.tencent.mm.kernel.g.Ei().DT().set(352257, Integer.valueOf(i - 1));
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/d/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */