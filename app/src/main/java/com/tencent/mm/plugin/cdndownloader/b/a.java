package com.tencent.mm.plugin.cdndownloader.b;

import android.content.Context;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.mm.modelcdntran.b;
import com.tencent.mm.modelcdntran.b.b;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.i.b;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

public final class a
  implements b.b
{
  private static a hJU = null;
  Queue<String> dOU = new LinkedList();
  public Map<String, i> dOV = new ConcurrentHashMap();
  public Map<String, i> dOW = new ConcurrentHashMap();
  public Map<String, Integer> dOX = new ConcurrentHashMap();
  private String dOY = "";
  private long dOZ = 0L;
  public HashSet<String> dPa = new HashSet();
  private ah dqM = new ah();
  b hJV = new b(ad.getContext().getFilesDir() + "/NativeCDNInfo", this);
  
  public static a aAj()
  {
    try
    {
      if (hJU == null) {
        hJU = new a();
      }
      a locala = hJU;
      return locala;
    }
    finally {}
  }
  
  public static boolean ym(String paramString)
  {
    int i = CdnLogic.pauseHttpMultiSocketDownloadTask(paramString);
    x.i("MicroMsg.CdnDownloadNativeService", "summersafecdn cdntra pauseRecvTask mediaid:%s, ret:%d", new Object[] { paramString, Integer.valueOf(i) });
    return i == 0;
  }
  
  public final int a(String paramString, keep_ProgressInfo paramkeep_ProgressInfo, keep_SceneResult paramkeep_SceneResult)
  {
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.CdnDownloadNativeService", "cdn callback mediaid is null");
      return -1;
    }
    if ((paramkeep_ProgressInfo == null) && (paramkeep_SceneResult == null))
    {
      x.e("MicroMsg.CdnDownloadNativeService", "cdn callback info all null");
      return -2;
    }
    if (paramkeep_ProgressInfo != null) {
      x.d("MicroMsg.CdnDownloadNativeService", "CDN progress. total:%d, cur:%d, canshow:%b, isUploadTask:%b", new Object[] { Integer.valueOf(paramkeep_ProgressInfo.field_toltalLength), Integer.valueOf(paramkeep_ProgressInfo.field_finishedLength), Boolean.valueOf(paramkeep_ProgressInfo.field_mtlnotify), Boolean.valueOf(paramkeep_ProgressInfo.field_isUploadTask) });
    }
    if (paramkeep_ProgressInfo != null) {}
    for (boolean bool = paramkeep_ProgressInfo.field_isUploadTask;; bool = false)
    {
      this.dOZ = bi.VF();
      this.dOY = paramString;
      this.dqM.H(new a.2(this, paramString, paramkeep_ProgressInfo, bool, paramkeep_SceneResult));
      return 0;
    }
  }
  
  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.CdnDownloadNativeService", "cdn callback getauthbuf mediaid is null");
      return;
    }
    i locali = (i)this.dOW.get(paramString);
    if (locali == null)
    {
      x.e("MicroMsg.CdnDownloadNativeService", " getauthbuf task in jni get info failed mediaid:%s", new Object[] { paramString });
      return;
    }
    if (locali.dPV != null)
    {
      locali.dPV.a(paramString, paramByteArrayOutputStream);
      return;
    }
    x.e("MicroMsg.CdnDownloadNativeService", "getCdnAuthInfo fail, null taskcallback.");
  }
  
  public final void b(final String paramString, final keep_SceneResult paramkeep_SceneResult)
  {
    if (bi.oW(paramString)) {
      return;
    }
    this.dqM.H(new Runnable()
    {
      public final void run()
      {
        i locali = (i)a.d(a.this).get(paramString);
        if (locali == null) {
          x.e("MicroMsg.CdnDownloadNativeService", " task in jni get info failed mediaid:%s", new Object[] { paramString });
        }
        while (locali.dQi == null) {
          return;
        }
        locali.dQi.b(paramString, paramkeep_SceneResult);
      }
    });
  }
  
  public final int d(i parami)
  {
    if (bi.oW(parami.field_mediaId))
    {
      x.e("MicroMsg.CdnDownloadNativeService", "addRecvTask mediaId is null");
      return -1;
    }
    if (parami.field_fileId == null) {
      parami.field_fileId = "";
    }
    if (parami.field_aesKey == null) {
      parami.field_aesKey = "";
    }
    if (this.dOU.contains(parami.field_fileId))
    {
      x.e("MicroMsg.CdnDownloadNativeService", "addRecvTask mediaId  exists in queueTask");
      return -2;
    }
    if (this.dOV.containsKey(parami.field_fileId))
    {
      x.e("MicroMsg.CdnDownloadNativeService", "addRecvTask mediaId  exists in mapWaitTask");
      return -2;
    }
    if (this.dOW.containsKey(parami.field_fileId))
    {
      x.e("MicroMsg.CdnDownloadNativeService", "addRecvTask mediaId  exists in mapTaskInJni");
      return -2;
    }
    parami.ceW = false;
    this.dqM.H(new a.1(this, parami));
    return 0;
  }
  
  public final byte[] i(String paramString, byte[] paramArrayOfByte)
  {
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.CdnDownloadNativeService", "cdn callback decodePrepareResponse mediaid is null");
      return null;
    }
    i locali = (i)this.dOW.get(paramString);
    if (locali == null)
    {
      x.e("MicroMsg.CdnDownloadNativeService", " decodePrepareResponse task in jni get info failed mediaid:%s", new Object[] { paramString });
      return null;
    }
    if (locali.dPV != null) {
      return locali.dPV.i(paramString, paramArrayOfByte);
    }
    x.e("MicroMsg.CdnDownloadNativeService", "decodePrepareResponse fail, null taskcallback.");
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/cdndownloader/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */