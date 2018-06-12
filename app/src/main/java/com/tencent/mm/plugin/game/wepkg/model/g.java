package com.tencent.mm.plugin.game.wepkg.model;

import com.tencent.mm.plugin.game.wepkg.ipc.WepkgMainProcessService;
import com.tencent.mm.plugin.game.wepkg.utils.d;
import com.tencent.mm.protocal.c.baw;
import com.tencent.mm.protocal.c.cfq;
import com.tencent.mm.protocal.c.cfs;
import com.tencent.mm.protocal.c.cft;
import com.tencent.mm.protocal.c.cfu;
import com.tencent.mm.protocal.c.cfv;
import com.tencent.mm.protocal.c.cfw;
import com.tencent.mm.protocal.c.cfx;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class g
{
  public static WepkgVersion Em(String paramString)
  {
    WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
    localWepkgCrossProcessTask.nc = 3001;
    localWepkgCrossProcessTask.kff.kfA = paramString;
    if (ad.cic()) {
      localWepkgCrossProcessTask.aai();
    }
    while (localWepkgCrossProcessTask.kff == null)
    {
      return null;
      WepkgMainProcessService.b(localWepkgCrossProcessTask);
    }
    return localWepkgCrossProcessTask.kff;
  }
  
  public static WepkgVersion En(String paramString)
  {
    WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
    localWepkgCrossProcessTask.nc = 3002;
    localWepkgCrossProcessTask.kff.kfA = paramString;
    if (ad.cic()) {
      localWepkgCrossProcessTask.aai();
    }
    while (localWepkgCrossProcessTask.kff == null)
    {
      return null;
      WepkgMainProcessService.b(localWepkgCrossProcessTask);
    }
    return localWepkgCrossProcessTask.kff;
  }
  
  public static List<WepkgPreloadFile> Eo(String paramString)
  {
    WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
    localWepkgCrossProcessTask.nc = 4001;
    localWepkgCrossProcessTask.kff.kfA = paramString;
    if (ad.cic()) {
      localWepkgCrossProcessTask.aai();
    }
    for (;;)
    {
      return localWepkgCrossProcessTask.kfi;
      WepkgMainProcessService.b(localWepkgCrossProcessTask);
    }
  }
  
  public static List<WepkgPreloadFile> Ep(String paramString)
  {
    WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
    localWepkgCrossProcessTask.nc = 4003;
    localWepkgCrossProcessTask.kff.kfA = paramString;
    if (ad.cic()) {
      localWepkgCrossProcessTask.aai();
    }
    for (;;)
    {
      return localWepkgCrossProcessTask.kfi;
      WepkgMainProcessService.b(localWepkgCrossProcessTask);
    }
  }
  
  public static void a(int paramInt1, String paramString1, String paramString2, String paramString3, long paramLong, String paramString4, String paramString5, int paramInt2, a parama)
  {
    WepkgDownloadProcessTask localWepkgDownloadProcessTask = new WepkgDownloadProcessTask();
    localWepkgDownloadProcessTask.fileType = paramInt1;
    localWepkgDownloadProcessTask.cfX = paramString1;
    localWepkgDownloadProcessTask.downloadUrl = paramString3;
    localWepkgDownloadProcessTask.kfl = paramLong;
    localWepkgDownloadProcessTask.version = paramString4;
    localWepkgDownloadProcessTask.bKg = paramString5;
    localWepkgDownloadProcessTask.kfm = paramInt2;
    if (ad.cic())
    {
      d.Em().H(new g.12(paramInt1, paramString1, paramString2, paramString3, paramLong, paramString4, paramString5, paramInt2, localWepkgDownloadProcessTask, parama));
      return;
    }
    localWepkgDownloadProcessTask.fFC = new g.1(parama, localWepkgDownloadProcessTask);
    localWepkgDownloadProcessTask.ahA();
    WepkgMainProcessService.a(localWepkgDownloadProcessTask);
  }
  
  public static void a(baw parambaw, int paramInt)
  {
    WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
    localWepkgCrossProcessTask.nc = 2002;
    Object localObject1 = localWepkgCrossProcessTask.kff;
    Object localObject3;
    Object localObject2;
    if (parambaw != null)
    {
      ((WepkgVersion)localObject1).kfA = parambaw.rtC;
      localObject3 = parambaw.sdh;
      localObject2 = parambaw.sdi;
      if (localObject3 != null)
      {
        ((WepkgVersion)localObject1).appId = ((cfv)localObject3).jQb;
        localObject3 = ((cfv)localObject3).sAq;
        if (localObject3 != null)
        {
          ((WepkgVersion)localObject1).version = ((cfs)localObject3).sAk;
          ((WepkgVersion)localObject1).kfR = ((cfs)localObject3).sAl;
          ((WepkgVersion)localObject1).kfS = ((cfs)localObject3).sAm;
          ((WepkgVersion)localObject1).kfT = ((cfs)localObject3).sAn;
        }
      }
      if (localObject2 != null)
      {
        ((WepkgVersion)localObject1).cfx = ((cfx)localObject2).sAt;
        ((WepkgVersion)localObject1).charset = ((cfx)localObject2).syW;
        localObject3 = ((cfx)localObject2).sAu;
        if ((localObject3 == null) || (((cfq)localObject3).sAh == null) || (bi.oW(((cfq)localObject3).sAh.rcY))) {
          break label494;
        }
        ((WepkgVersion)localObject1).bKg = ((cfq)localObject3).sAh.rwk;
        ((WepkgVersion)localObject1).downloadUrl = ((cfq)localObject3).sAh.rcY;
        ((WepkgVersion)localObject1).kfV = ((cfq)localObject3).sAh.sAp;
        ((WepkgVersion)localObject1).kfm = ((cfq)localObject3).sAh.sAo;
        ((WepkgVersion)localObject1).kfX = false;
        localObject2 = ((cfx)localObject2).sAv;
        if (localObject2 != null) {
          ((WepkgVersion)localObject1).kfZ = ((cfw)localObject2).sAs;
        }
        if ((localObject2 == null) || (bi.cX(((cfw)localObject2).sAr)) || (!((cfw)localObject2).sAs)) {
          break label502;
        }
      }
    }
    label494:
    label502:
    for (((WepkgVersion)localObject1).kfY = false;; ((WepkgVersion)localObject1).kfY = true)
    {
      ((WepkgVersion)localObject1).kga = 0;
      ((WepkgVersion)localObject1).cga = paramInt;
      localObject2 = parambaw.sdi.sAv;
      if ((localObject2 == null) || (bi.cX(((cfw)localObject2).sAr))) {
        break label515;
      }
      localObject1 = new ArrayList();
      localObject2 = ((cfw)localObject2).sAr.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        Object localObject4 = (cfu)((Iterator)localObject2).next();
        localObject3 = new WepkgPreloadFile();
        String str1 = parambaw.rtC;
        String str2 = parambaw.sdh.sAq.sAk;
        if (localObject4 != null)
        {
          ((WepkgPreloadFile)localObject3).aAL = d.di(str1, ((cfu)localObject4).rDd);
          ((WepkgPreloadFile)localObject3).kfA = str1;
          ((WepkgPreloadFile)localObject3).version = str2;
          ((WepkgPreloadFile)localObject3).kfk = ((cfu)localObject4).rDd;
          ((WepkgPreloadFile)localObject3).mimeType = ((cfu)localObject4).rDf;
          localObject4 = ((cfu)localObject4).sAh;
          if (localObject4 != null)
          {
            ((WepkgPreloadFile)localObject3).bKg = ((cft)localObject4).rwk;
            ((WepkgPreloadFile)localObject3).downloadUrl = ((cft)localObject4).rcY;
            ((WepkgPreloadFile)localObject3).size = ((cft)localObject4).sAp;
            ((WepkgPreloadFile)localObject3).kfm = ((cft)localObject4).sAo;
          }
          ((WepkgPreloadFile)localObject3).kfB = false;
        }
        ((List)localObject1).add(localObject3);
      }
      ((WepkgVersion)localObject1).kfX = true;
      break;
    }
    localWepkgCrossProcessTask.kfi = ((List)localObject1);
    label515:
    if (ad.cic())
    {
      localWepkgCrossProcessTask.aai();
      return;
    }
    WepkgMainProcessService.b(localWepkgCrossProcessTask);
  }
  
  public static void a(String paramString1, String paramString2, String paramString3, a parama)
  {
    WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
    localWepkgCrossProcessTask.nc = 4002;
    localWepkgCrossProcessTask.kfh.kfA = paramString1;
    localWepkgCrossProcessTask.kfh.kfk = paramString2;
    localWepkgCrossProcessTask.kfh.filePath = paramString3;
    localWepkgCrossProcessTask.kfh.kfB = false;
    if (ad.cic())
    {
      d.Em().H(new g.4(localWepkgCrossProcessTask, parama));
      return;
    }
    localWepkgCrossProcessTask.fFC = new g.5(parama, localWepkgCrossProcessTask);
    localWepkgCrossProcessTask.ahA();
    WepkgMainProcessService.a(localWepkgCrossProcessTask);
  }
  
  public static void a(String paramString1, String paramString2, boolean paramBoolean, a parama)
  {
    final WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
    localWepkgCrossProcessTask.nc = 3005;
    localWepkgCrossProcessTask.kff.kfA = paramString1;
    localWepkgCrossProcessTask.kff.ffK = paramString2;
    localWepkgCrossProcessTask.kff.kfX = paramBoolean;
    if (ad.cic())
    {
      d.Em().H(new g.8(localWepkgCrossProcessTask, parama));
      return;
    }
    localWepkgCrossProcessTask.fFC = new Runnable()
    {
      public final void run()
      {
        if (this.kfC != null) {
          this.kfC.a(localWepkgCrossProcessTask);
        }
        localWepkgCrossProcessTask.ahB();
      }
    };
    localWepkgCrossProcessTask.ahA();
    WepkgMainProcessService.a(localWepkgCrossProcessTask);
  }
  
  public static boolean aVy()
  {
    WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
    localWepkgCrossProcessTask.nc = 1002;
    if (ad.cic()) {
      localWepkgCrossProcessTask.aai();
    }
    for (;;)
    {
      return localWepkgCrossProcessTask.bGZ;
      WepkgMainProcessService.b(localWepkgCrossProcessTask);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/wepkg/model/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */