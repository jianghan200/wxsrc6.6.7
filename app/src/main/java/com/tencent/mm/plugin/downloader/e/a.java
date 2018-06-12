package com.tencent.mm.plugin.downloader.e;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.mm.a.e;
import com.tencent.mm.g.a.gt;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;

public final class a
{
  public static void a(String paramString1, int paramInt, long paramLong, String paramString2)
  {
    gt localgt = new gt();
    localgt.bPU.appId = paramString1;
    localgt.bPU.scene = paramInt;
    localgt.bPU.bGm = paramLong;
    localgt.bPU.channelId = paramString2;
    localgt.bPU.opType = 4;
    com.tencent.mm.sdk.b.a.sFg.m(localgt);
  }
  
  public static boolean yW(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.DownloadAppUtil", "installApk, path is null");
      return false;
    }
    x.i("MicroMsg.DownloadAppUtil", "installApk, path = " + paramString);
    if (!e.cn(paramString))
    {
      x.e("MicroMsg.DownloadAppUtil", "installApk, path not exists");
      return false;
    }
    paramString = Uri.fromFile(new File(paramString));
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setDataAndType(paramString, "application/vnd.android.package-archive");
    localIntent.addFlags(268435456);
    try
    {
      ad.getContext().startActivity(localIntent);
      return true;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.DownloadAppUtil", "install app failed: " + paramString.toString() + ", ex = " + localException.getMessage());
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/downloader/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */