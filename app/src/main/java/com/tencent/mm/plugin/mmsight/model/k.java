package com.tencent.mm.plugin.mmsight.model;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;

public final class k
{
  public static void bdT()
  {
    x.i("MicroMsg.MMSightRecorderIDKeyStat", "markCapture");
    h.mEJ.a(440L, 0L, 1L, false);
    int i = 36;
    if (j.lgz.dfb == 1) {
      i = 39;
    }
    int j;
    if (j.lgz.lfa == 720) {
      j = i + 1;
    }
    for (;;)
    {
      h.mEJ.a(440L, j, 1L, false);
      return;
      j = i;
      if (j.lgz.beb()) {
        j = i + 2;
      }
    }
  }
  
  public static void bdU()
  {
    x.i("MicroMsg.MMSightRecorderIDKeyStat", "markFFMpegInitError");
    h.mEJ.a(440L, 7L, 1L, false);
  }
  
  public static void bdV()
  {
    x.i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecInitError");
    h.mEJ.a(440L, 8L, 1L, false);
  }
  
  public static void bdW()
  {
    x.i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecYUVInitError");
    h.mEJ.a(440L, 16L, 1L, false);
  }
  
  public static void bdX()
  {
    x.i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecWriteYUVError");
    h.mEJ.a(440L, 21L, 1L, false);
  }
  
  public static void c(boolean paramBoolean, long paramLong)
  {
    x.v("MicroMsg.MMSightRecorderIDKeyStat", "markCaptureProcessCost isPictureMode %s cost_time %s", new Object[] { Boolean.valueOf(paramBoolean), Long.valueOf(paramLong) });
    a.bdH().lfh = paramLong;
    a locala = a.bdH();
    d locald1 = new d();
    d locald2 = new d();
    locald1.q("model", locala.model + ",");
    locald1.q("apiLevel", locala.leH + ",");
    locald1.q("memoryClass", locala.iNj + ",");
    locald1.q("totalMemory", locala.leI + ",");
    locald1.q("maxCpu", locala.leJ + ",");
    locald1.q("screenW", locala.leK + ",");
    locald1.q("screenH", locala.leL + ",");
    locald2.q("model", locala.model + ",");
    locald2.q("apiLevel", locala.leH + ",");
    locald2.q("memoryClass", locala.iNj + ",");
    locald2.q("totalMemory", locala.leI + ",");
    locald2.q("maxCpu", locala.leJ + ",");
    locald2.q("screenW", locala.leK + ",");
    locald2.q("screenH", locala.leL + ",");
    locald1.q("cropx", locala.leQ + ",");
    locald1.q("cropy", locala.leR + ",");
    locald1.q("previewx", locala.leS + ",");
    locald1.q("previewy", locala.leT + ",");
    locald1.q("encoderx", locala.leU + ",");
    locald1.q("encodery", locala.leV + ",");
    locald1.q("rotate", locala.bYE + ",");
    locald1.q("deviceoutfps", locala.leW + ",");
    locald1.q("recordfps", locala.leX + ",");
    locald1.q("recordertype", locala.leY + ",");
    locald1.q("videoBitrate", locala.videoBitrate + ",");
    locald1.q("needRotateEachFrame", locala.dfc + ",");
    locald1.q("isNeedRealtimeScale", locala.leZ + ",");
    locald1.q("resolutionLimit", locala.lfa + ",");
    locald1.q("outfps", locala.lfb + ",");
    locald1.q("recordTime", locala.lfc + ",");
    locald1.q("avgcpu", locala.lfd + ",");
    locald1.q("outx", locala.lfe + ",");
    locald1.q("outy", locala.lff + ",");
    locald1.q("outbitrate", locala.lfg + ",");
    locald1.q("fileSize", locala.fileSize + ",");
    locald1.q("wait2playtime", locala.lfh + ",");
    locald1.q("useback", locala.lfi + ",");
    int j = 0;
    Intent localIntent = ad.getContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    int m;
    int k;
    if (localIntent != null)
    {
      i = localIntent.getIntExtra("status", -1);
      if ((i == 2) || (i == 5))
      {
        i = 1;
        j = localIntent.getIntExtra("level", -1);
        m = localIntent.getIntExtra("scale", -1);
        k = i;
      }
    }
    for (int i = m;; i = 0)
    {
      x.i("MicroMsg.CaptureStatistics", "battery %s %s %s", new Object[] { Integer.valueOf(k), Integer.valueOf(j), Integer.valueOf(i) });
      locald1.q("mIsCharging", k + ",");
      locald1.q("level", j + ",");
      locald1.q("scale", i + ",");
      locald1.q("createTime", System.currentTimeMillis() + ",");
      locald2.q("prewViewlist1", locala.leM + ",");
      locald2.q("pictureSize1", locala.leN + ",");
      locald2.q("prewViewlist2", locala.leO + ",");
      locald2.q("pictureSize2", locala.leP + ",");
      x.i("MicroMsg.CaptureStatistics", "report " + locald1.wF());
      x.v("MicroMsg.CaptureStatistics", "report " + locald2.wF());
      h.mEJ.k(13947, locald1.toString());
      h.mEJ.k(13949, locald2.toString());
      if (!paramBoolean) {
        break label1710;
      }
      h.mEJ.a(440L, 119L, 1L, false);
      h.mEJ.a(440L, 120L, paramLong, false);
      if (j.lgz.lfa != 720) {
        break label1671;
      }
      h.mEJ.a(440L, 122L, paramLong, false);
      return;
      i = 0;
      break;
      k = 0;
    }
    label1671:
    if (j.lgz.beb())
    {
      h.mEJ.a(440L, 123L, paramLong, false);
      return;
    }
    h.mEJ.a(440L, 121L, paramLong, false);
    return;
    label1710:
    h.mEJ.a(440L, 124L, 1L, false);
    h.mEJ.a(440L, 125L, paramLong, false);
    if (j.lgz.dfb == 1)
    {
      h.mEJ.a(440L, 127L, paramLong, false);
      h.mEJ.a(440L, 131L, paramLong, false);
      return;
    }
    h.mEJ.a(440L, 126L, paramLong, false);
    h.mEJ.a(440L, 130L, paramLong, false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/mmsight/model/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */