package com.tencent.mm.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.widget.Toast;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.ac.r;
import com.tencent.mm.ac.z;
import com.tencent.mm.bu.a;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.s;

public final class g
{
  private static int al(String paramString, int paramInt1, int paramInt2)
  {
    com.tencent.mm.ac.d locald = z.MY().kA(paramString);
    if (locald.LZ()) {
      paramString = locald.Mg();
    }
    paramString = z.Nh().kn(paramString);
    int i;
    int j;
    label50:
    long l1;
    if (paramString != null)
    {
      i = paramString.field_qyUin;
      if (paramString == null) {
        break label193;
      }
      j = paramString.field_userUin;
      if (paramString == null) {
        break label199;
      }
      l1 = paramString.field_wwCorpId;
      label60:
      if (paramString == null) {
        break label205;
      }
    }
    label193:
    label199:
    label205:
    for (long l2 = paramString.field_wwUserVid;; l2 = 0L)
    {
      com.tencent.mm.plugin.report.service.h.mEJ.h(13656, new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(l1), Long.valueOf(l2) });
      x.d("MicroMsg.EnterpriseHelper", "enterprise wework action report: %s,%s,%s,%s,%s,%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(l1), Long.valueOf(l2) });
      return paramInt2;
      i = 0;
      break;
      j = 0;
      break label50;
      l1 = 0L;
      break label60;
    }
  }
  
  public static void am(String paramString, int paramInt1, int paramInt2)
  {
    Object localObject = z.MY().kA(paramString);
    if (paramInt2 == 3) {
      paramInt2 = 2;
    }
    for (;;)
    {
      int i = paramInt2;
      if (paramInt2 == 4) {
        i = 3;
      }
      if (((com.tencent.mm.ac.d)localObject).LZ()) {
        paramString = ((com.tencent.mm.ac.d)localObject).Mg();
      }
      paramString = z.Nh().kn(paramString);
      localObject = new r(paramString, paramInt1, i, new Object());
      com.tencent.mm.kernel.g.Eh().dpP.a((l)localObject, 0);
      if (paramString.field_chatOpen)
      {
        paramInt2 = 1;
        if (!paramString.field_show_confirm) {
          break label189;
        }
      }
      label189:
      for (int j = 1;; j = 0)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.h(15162, new Object[] { Long.valueOf(paramString.field_wwCorpId), Long.valueOf(paramString.field_wwUserVid), Integer.valueOf(paramInt2), Integer.valueOf(paramString.field_wwUnreadCnt), Integer.valueOf(j), Integer.valueOf(paramString.field_userType), Integer.valueOf(paramInt1), Integer.valueOf(i) });
        return;
        paramInt2 = 0;
        break;
      }
    }
  }
  
  public static int bu(Context paramContext, String paramString)
  {
    if (bi.oW(paramString)) {}
    for (;;)
    {
      return 0;
      paramString = z.Nh().kn(paramString);
      if ((paramString != null) && ((paramString.field_userFlag & 0x2) != 0)) {}
      for (int i = 1; i != 0; i = 0)
      {
        if ((paramString.field_wwExposeTimes >= paramString.field_wwMaxExposeTimes) && (!p.r(paramContext, "com.tencent.wework"))) {
          break label63;
        }
        return 2;
      }
    }
    label63:
    return 1;
  }
  
  public static void bv(Context paramContext, String paramString)
  {
    if (bi.oW(paramString)) {}
    while (p.r(paramContext, "com.tencent.wework")) {
      return;
    }
    z.Nh().kq(paramString);
  }
  
  public static void di(String paramString, int paramInt)
  {
    if (paramInt <= 0) {
      return;
    }
    paramString = z.Nh().kn(paramString);
    int i;
    if (paramString != null)
    {
      i = paramString.field_qyUin;
      if (paramString == null) {
        break label103;
      }
    }
    label103:
    for (int j = paramString.field_userUin;; j = 0)
    {
      com.tencent.mm.plugin.report.service.h.mEJ.h(13703, new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramInt) });
      x.d("MicroMsg.EnterpriseHelper", "enterprise click report: %s,%s,%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramInt) });
      return;
      i = 0;
      break;
    }
  }
  
  public static void n(Context paramContext, String paramString, int paramInt)
  {
    if (p.r(paramContext, "com.tencent.wework"))
    {
      al(paramString, 4, paramInt);
      return;
    }
    al(paramString, 5, paramInt);
  }
  
  public static void o(Context paramContext, String paramString, int paramInt)
  {
    al(paramString, 1, paramInt);
    am(paramString, 2, paramInt);
    Object localObject = z.Nh().ko(paramString);
    if (p.r(paramContext, "com.tencent.wework"))
    {
      al(paramString, 2, paramInt);
      paramString = p.getPackageInfo(paramContext, "com.tencent.wework");
      if ((!bi.oW(paramString.versionName)) && (paramString.versionName.compareTo("1.3.3") >= 0))
      {
        localObject = new Intent();
        ((Intent)localObject).setAction("android.intent.action.VIEW");
        if ((paramInt == 2) || (paramInt == 4) || (paramInt == 6))
        {
          paramString = "wxwork://createconversation";
          ((Intent)localObject).setData(Uri.parse(paramString));
        }
      }
      for (paramString = (String)localObject;; paramString = paramContext.getPackageManager().getLaunchIntentForPackage("com.tencent.wework"))
      {
        a.post(new g.4(paramContext, paramString));
        return;
        paramString = "wxwork://conversationlist";
        break;
      }
    }
    if ((((com.tencent.mm.ac.b)localObject).field_chatOpen) || (((com.tencent.mm.ac.b)localObject).field_use_preset_banner_tips))
    {
      com.tencent.mm.ui.base.h.a(paramContext, R.l.enterprise_wework_donwload_confirm_tip, 0, R.l.enterprise_wework_donwload_confirm_btn, R.l.app_cancel, new g.1(paramContext, paramString, paramInt), null);
      return;
    }
    if (((com.tencent.mm.ac.b)localObject).field_show_confirm)
    {
      localObject = new com.tencent.mm.ui.widget.a.e.a(paramContext);
      ((com.tencent.mm.ui.widget.a.e.a)localObject).uKu = paramContext.getString(R.l.app_cancel);
      ((com.tencent.mm.ui.widget.a.e.a)localObject).Gv(R.l.enterprise_wework_donwload_confirm_btn);
      z.Nh();
      z.Nh();
      String str = com.tencent.mm.ac.c.ht(1);
      if (str == null) {
        ((com.tencent.mm.ui.widget.a.e.a)localObject).abA(paramContext.getString(R.l.enterprise_wework_donwload_confirm_tip));
      }
      for (;;)
      {
        ((com.tencent.mm.ui.widget.a.e.a)localObject).a(new g.2(), new g.3(paramContext, paramString, paramInt)).eIW.show();
        return;
        ((com.tencent.mm.ui.widget.a.e.a)localObject).abA(str);
      }
    }
    p(paramContext, paramString, paramInt);
  }
  
  public static void p(Context paramContext, String paramString, int paramInt)
  {
    al(paramString, 3, paramInt);
    am(paramString, 3, paramInt);
    z.MY();
    if (bi.oW(com.tencent.mm.ac.e.kD(paramString))) {}
    for (paramString = "off";; paramString = "on")
    {
      paramString = String.format("https://work.weixin.qq.com/wework_admin/commdownload?from=conv%s", new Object[] { paramString });
      Object localObject = com.tencent.mm.plugin.downloader.model.d.aCU().yP(paramString);
      if ((localObject != null) && (((FileDownloadTaskInfo)localObject).status == 3) && (com.tencent.mm.a.e.cn(((FileDownloadTaskInfo)localObject).path))) {
        com.tencent.mm.a.e.deleteFile(((FileDownloadTaskInfo)localObject).path);
      }
      s.makeText(paramContext, paramContext.getString(R.l.enterprise_wework_download_tip), 2000).show();
      localObject = new com.tencent.mm.plugin.downloader.model.e.a();
      ((com.tencent.mm.plugin.downloader.model.e.a)localObject).yQ(paramString);
      ((com.tencent.mm.plugin.downloader.model.e.a)localObject).yS(paramContext.getString(R.l.enterprise_wework_apk));
      ((com.tencent.mm.plugin.downloader.model.e.a)localObject).ox(1);
      ((com.tencent.mm.plugin.downloader.model.e.a)localObject).ef(true);
      com.tencent.mm.plugin.downloader.model.d.aCU().a(((com.tencent.mm.plugin.downloader.model.e.a)localObject).ick);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */