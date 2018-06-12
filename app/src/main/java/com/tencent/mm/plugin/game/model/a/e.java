package com.tencent.mm.plugin.game.model.a;

import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public final class e
{
  static void C(String paramString, int paramInt1, int paramInt2)
  {
    if (bi.oW(paramString)) {
      return;
    }
    FileDownloadTaskInfo localFileDownloadTaskInfo = d.aCU().yO(paramString);
    if ((localFileDownloadTaskInfo != null) && (localFileDownloadTaskInfo.id > 0L))
    {
      long l = localFileDownloadTaskInfo.id;
      String str = localFileDownloadTaskInfo.url;
      if (localFileDownloadTaskInfo.gTK == 0L) {}
      for (int i = 0;; i = (int)(localFileDownloadTaskInfo.icq * 100L / localFileDownloadTaskInfo.gTK))
      {
        a(paramString, l, str, i, paramInt1, paramInt2, false, false, false, false, false, "");
        return;
      }
    }
    a(paramString, 0L, "", 0, paramInt1, paramInt2, false, false, false, false, false, "");
  }
  
  public static void DB(String paramString)
  {
    if (bi.oW(paramString)) {
      return;
    }
    FileDownloadTaskInfo localFileDownloadTaskInfo = d.aCU().yO(paramString);
    Object localObject = ((com.tencent.mm.plugin.game.a.c)g.l(com.tencent.mm.plugin.game.a.c.class)).aSl().DC(paramString);
    if ((localFileDownloadTaskInfo != null) && (localFileDownloadTaskInfo.id > 0L))
    {
      if (localObject != null)
      {
        l = localFileDownloadTaskInfo.id;
        String str = localFileDownloadTaskInfo.url;
        if (localFileDownloadTaskInfo.gTK == 0L) {}
        for (i = 0;; i = (int)(localFileDownloadTaskInfo.icq * 100L / localFileDownloadTaskInfo.gTK))
        {
          a(paramString, l, str, i, 3, 0, ((c)localObject).field_noWifi, ((c)localObject).field_noSdcard, ((c)localObject).field_noEnoughSpace, ((c)localObject).field_lowBattery, ((c)localObject).field_continueDelay, "");
          return;
        }
      }
      long l = localFileDownloadTaskInfo.id;
      localObject = localFileDownloadTaskInfo.url;
      if (localFileDownloadTaskInfo.gTK == 0L) {}
      for (int i = 0;; i = (int)(localFileDownloadTaskInfo.icq * 100L / localFileDownloadTaskInfo.gTK))
      {
        a(paramString, l, (String)localObject, i, 3, 0, false, false, false, false, false, "");
        return;
      }
    }
    if (localObject != null)
    {
      a(paramString, 0L, "", 0, 3, 0, ((c)localObject).field_noWifi, ((c)localObject).field_noSdcard, ((c)localObject).field_noEnoughSpace, ((c)localObject).field_lowBattery, ((c)localObject).field_continueDelay, "");
      return;
    }
    a(paramString, 0L, "", 0, 3, 0, false, false, false, false, false, "");
  }
  
  static void U(String paramString, int paramInt1, int paramInt2)
  {
    if (bi.oW(paramString)) {}
    while (((com.tencent.mm.plugin.game.a.c)g.l(com.tencent.mm.plugin.game.a.c.class)).aSl().DC(paramString) == null) {
      return;
    }
    C(paramString, paramInt1, paramInt2);
  }
  
  private static void a(String paramString1, long paramLong, String paramString2, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, String paramString3)
  {
    x.i("MicroMsg.GameSilentDownloadReporter", "reportInfo, appId:%s, downloadId:%d, downloadUrl:%s, downloadedPct:%d, finishType:%d, errCode:%d, noWifi:%b, noSdcard:%b, noEnoughSpace:%b, lowBattery:%b, continueDelay:%b", new Object[] { paramString1, Long.valueOf(paramLong), paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Boolean.valueOf(paramBoolean3), Boolean.valueOf(paramBoolean4), Boolean.valueOf(paramBoolean5) });
    try
    {
      if (bi.oW(paramString2)) {
        break label413;
      }
      str1 = URLEncoder.encode(paramString2, "UTF-8");
      paramString2 = str1;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException1)
    {
      String str4;
      for (;;)
      {
        String str1;
        str2 = paramString2;
        str4 = paramString3;
      }
    }
    str1 = paramString2;
    str4 = paramString3;
    try
    {
      if (!bi.oW(paramString3))
      {
        str4 = URLEncoder.encode(paramString3, "UTF-8");
        str1 = paramString2;
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException2)
    {
      for (;;)
      {
        String str2;
        String str3 = paramString2;
        str4 = paramString3;
      }
    }
    paramString2 = new Object[12];
    paramString2[0] = paramString1;
    paramString2[1] = Long.valueOf(paramLong);
    paramString2[2] = str1;
    paramString2[3] = Integer.valueOf(paramInt1);
    paramString2[4] = Integer.valueOf(paramInt2);
    paramString2[5] = Integer.valueOf(paramInt3);
    if (paramBoolean1)
    {
      paramInt1 = 1;
      paramString2[6] = Integer.valueOf(paramInt1);
      if (!paramBoolean2) {
        break label328;
      }
      paramInt1 = 1;
      label212:
      paramString2[7] = Integer.valueOf(paramInt1);
      if (!paramBoolean3) {
        break label334;
      }
      paramInt1 = 1;
      label229:
      paramString2[8] = Integer.valueOf(paramInt1);
      if (!paramBoolean4) {
        break label340;
      }
      paramInt1 = 1;
      label246:
      paramString2[9] = Integer.valueOf(paramInt1);
      if (!paramBoolean5) {
        break label346;
      }
    }
    label328:
    label334:
    label340:
    label346:
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      paramString2[10] = Integer.valueOf(paramInt1);
      paramString2[11] = str4;
      paramString1 = new StringBuilder();
      paramInt1 = 0;
      while (paramInt1 < 11)
      {
        paramString1.append(String.valueOf(paramString2[paramInt1])).append(',');
        paramInt1 += 1;
      }
      paramInt1 = 0;
      break;
      paramInt1 = 0;
      break label212;
      paramInt1 = 0;
      break label229;
      paramInt1 = 0;
      break label246;
    }
    paramString1.append(String.valueOf(paramString2[11]));
    paramString1 = new am(15547, paramString1.toString());
    g.DF().a(paramString1, 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/model/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */