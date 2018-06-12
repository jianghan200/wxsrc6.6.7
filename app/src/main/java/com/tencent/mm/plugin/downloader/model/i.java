package com.tencent.mm.plugin.downloader.model;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.mm.plugin.downloader.c.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

final class i
  extends h
{
  public i(b paramb)
  {
    super(paramb);
  }
  
  public final long a(a parama)
  {
    return 0L;
  }
  
  public final long a(e parame)
  {
    if (bi.oW(parame.fhq)) {
      return -1L;
    }
    parame = new Intent("android.intent.action.VIEW", Uri.parse(parame.fhq));
    parame.addFlags(268435456);
    try
    {
      ad.getContext().startActivity(parame);
      return 0L;
    }
    catch (Exception parame)
    {
      x.e("MicroMsg.FileDownloaderImplNormal", "Add download task failed: " + parame.toString());
    }
    return -1L;
  }
  
  public final int cl(long paramLong)
  {
    return 1;
  }
  
  public final FileDownloadTaskInfo cm(long paramLong)
  {
    FileDownloadTaskInfo localFileDownloadTaskInfo = new FileDownloadTaskInfo();
    localFileDownloadTaskInfo.id = paramLong;
    localFileDownloadTaskInfo.status = -1;
    return localFileDownloadTaskInfo;
  }
  
  public final boolean cn(long paramLong)
  {
    return false;
  }
  
  public final boolean co(long paramLong)
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/downloader/model/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */