package com.tencent.mm.plugin.cdndownloader.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.tencent.mm.ipcinvoker.wx_extension.b.b.a;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.plugin.cdndownloader.a.a.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CDNDownloadService
  extends Service
  implements com.tencent.mm.ipcinvoker.wx_extension.b.a
{
  private static com.tencent.mm.plugin.cdndownloader.a.b hKg;
  private static i.a hKs = new CDNDownloadService.2();
  private final a.a hKr = new CDNDownloadService.1(this);
  
  public IBinder onBind(Intent paramIntent)
  {
    x.i("MicroMsg.CDNDownloadService", "onBind");
    return this.hKr;
  }
  
  public void onCreate()
  {
    super.onCreate();
    x.i("MicroMsg.CDNDownloadService", "onCreate");
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    x.i("MicroMsg.CDNDownloadService", "onDestroy");
    b.a.CE().b(this);
    Object localObject1 = com.tencent.mm.plugin.cdndownloader.b.a.aAj();
    Object localObject2 = ((com.tencent.mm.plugin.cdndownloader.b.a)localObject1).dOV.entrySet().iterator();
    Object localObject3;
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (Map.Entry)((Iterator)localObject2).next();
      String str = (String)((Map.Entry)localObject3).getKey();
      if (((i)((Map.Entry)localObject3).getValue()).dQc)
      {
        ((com.tencent.mm.plugin.cdndownloader.b.a)localObject1).dOV.remove(str);
        ((com.tencent.mm.plugin.cdndownloader.b.a)localObject1).dOX.remove(str);
        x.i("MicroMsg.CdnDownloadNativeService", "summersafecdn cdntra mapWaitTask cancelAllGamePacketDownloadTask mediaid:%s", new Object[] { str });
        ((Iterator)localObject2).remove();
      }
    }
    localObject1 = ((com.tencent.mm.plugin.cdndownloader.b.a)localObject1).dOW.entrySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Map.Entry)((Iterator)localObject1).next();
      localObject3 = (String)((Map.Entry)localObject2).getKey();
      if (((i)((Map.Entry)localObject2).getValue()).dQc)
      {
        com.tencent.mm.modelcdntran.b.lu((String)localObject3);
        x.i("MicroMsg.CdnDownloadNativeService", "summersafecdn cdntra mapTaskInJni cancelAllGamePacketDownloadTask mediaid:%s  ret:%d", new Object[] { localObject3, Integer.valueOf(0) });
        ((Iterator)localObject1).remove();
      }
    }
    h.mEJ.a(710L, 1L, 1L, false);
  }
  
  public boolean onUnbind(Intent paramIntent)
  {
    x.i("MicroMsg.CDNDownloadService", "onUnbind");
    return super.onUnbind(paramIntent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/cdndownloader/service/CDNDownloadService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */