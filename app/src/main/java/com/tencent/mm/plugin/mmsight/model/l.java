package com.tencent.mm.plugin.mmsight.model;

import android.media.MediaMetadataRetriever;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.t;
import com.tencent.mm.k.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.zero.b.a;
import com.tencent.mm.protocal.c.aso;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;

public final class l
{
  public static boolean a(String paramString, VideoTransPara paramVideoTransPara, aso paramaso, d paramd)
  {
    Object localObject = paramaso;
    for (;;)
    {
      try
      {
        if ((bi.oW(paramString)) || (paramVideoTransPara == null)) {
          break label734;
        }
        localaso = paramaso;
        if (paramaso == null)
        {
          localObject = paramaso;
          localaso = new aso();
        }
        localObject = localaso;
        x.i("MicroMsg.SightSendVideoLogic", "check localCaptureVideo %s videoPath %s videoParams %s, finishPreSendProcess: %s", new Object[] { Boolean.valueOf(localaso.rUP), paramString, paramVideoTransPara, Boolean.valueOf(localaso.rUT) });
        localObject = localaso;
        if (localaso.rUT)
        {
          localObject = localaso;
          x.i("MicroMsg.SightSendVideoLogic", "checkShouldRemuxing, already finish preSendProcess, videoPath: %s", new Object[] { paramString });
          return false;
        }
        localObject = localaso;
        if (!localaso.rUP) {
          break label742;
        }
        localObject = localaso;
        if (bi.oW(paramString)) {
          break label742;
        }
        localObject = localaso;
        SightVideoJNI.tagMP4Dscp(paramString, com.tencent.mm.modelcontrol.d.NP().getWeixinMeta());
        localObject = localaso;
        if (!bi.oW(localaso.rUS))
        {
          localObject = localaso;
          SightVideoJNI.tagMp4RecordInfo(paramString, localaso.rUS);
        }
        localObject = localaso;
        long l = bi.VG();
        localObject = localaso;
        SightVideoJNI.optimizeMP4(paramString);
        localObject = localaso;
        x.i("MicroMsg.SightSendVideoLogic", "optimizeMP4 used %sms", new Object[] { Long.valueOf(bi.bI(l)) });
        localObject = localaso;
        paramd.bcM();
        localObject = localaso;
        paramaso = new MediaMetadataRetriever();
        localObject = localaso;
        paramaso.setDataSource(paramString);
        localObject = localaso;
        i = bi.getInt(paramaso.extractMetadata(18), 0);
        localObject = localaso;
        k = bi.getInt(paramaso.extractMetadata(19), 0);
        localObject = localaso;
        j = bi.getInt(paramaso.extractMetadata(20), 0);
        localObject = localaso;
        paramaso.release();
        localObject = localaso;
        x.i("MicroMsg.SightSendVideoLogic", "videopath %d %d %s", new Object[] { Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(j) });
        localObject = localaso;
        x.i("MicroMsg.SightSendVideoLogic", "videoParams %s %s %s", new Object[] { Integer.valueOf(paramVideoTransPara.width), Integer.valueOf(paramVideoTransPara.height), Integer.valueOf(paramVideoTransPara.videoBitrate) });
        localObject = localaso;
        k = Math.min(i, k);
        localObject = localaso;
        if (q.deT.dfl != 1) {
          break label744;
        }
        bool1 = true;
        localObject = localaso;
        if (bi.getInt(((a)g.l(a.class)).AT().getValue("MMSightCheckSendVideoBitrate"), 0) != 1) {
          break label750;
        }
        bool2 = true;
        localObject = localaso;
        f = bi.getFloat(((a)g.l(a.class)).AT().getValue("MMSightCheckSendVideoBitrateLimit"), 1.3F);
        localObject = localaso;
        x.i("MicroMsg.SightSendVideoLogic", "deviceConfigCheckBitrate: %s, serverConfigCheckBitrate: %s, bitrateLimitRatio: %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Float.valueOf(f) });
        if (bool1) {
          break label736;
        }
        if (!bool2) {
          break label756;
        }
      }
      catch (Exception paramVideoTransPara)
      {
        aso localaso;
        int k;
        int j;
        float f;
        x.e("MicroMsg.SightSendVideoLogic", "checkShouldRemuxing error: %s %s", new Object[] { paramVideoTransPara.getMessage(), paramString });
        if (localObject == null) {
          continue;
        }
        ((aso)localObject).rUT = true;
        return false;
      }
      localObject = localaso;
      if (k > paramVideoTransPara.width)
      {
        localObject = localaso;
        if ((k > paramVideoTransPara.width) && (k % 16 == 0))
        {
          localObject = localaso;
          if (Math.abs(k - paramVideoTransPara.width) < 16) {}
        }
        else
        {
          if (i == 0) {
            continue;
          }
          localObject = localaso;
          if (j < paramVideoTransPara.videoBitrate * f) {
            continue;
          }
        }
      }
      localObject = localaso;
      if (localaso.rUO) {
        return true;
      }
      if (i != 0)
      {
        localObject = localaso;
        if (j >= paramVideoTransPara.videoBitrate * f)
        {
          localObject = localaso;
          x.i("MicroMsg.SightSendVideoLogic", "exceed video bitrate, need remux video");
          localObject = localaso;
          h.mEJ.a(440L, 205L, 1L, false);
          return true;
        }
      }
      localObject = localaso;
      localaso.rUT = true;
      return false;
      return true;
      label734:
      return false;
      label736:
      int i = 1;
      continue;
      label742:
      return false;
      label744:
      boolean bool1 = false;
      continue;
      label750:
      boolean bool2 = false;
      continue;
      label756:
      i = 0;
    }
  }
  
  public static int b(String paramString, VideoTransPara paramVideoTransPara, aso paramaso, d paramd)
  {
    if ((paramaso == null) || (!paramaso.rUP) || (!FileOp.cn(paramString))) {
      return -1;
    }
    if (paramaso.rUT) {
      x.i("MicroMsg.SightSendVideoLogic", "doRemuxingSendVideoMsg, already finish preSendProcess, videoPath: %s", new Object[] { paramString });
    }
    for (;;)
    {
      int n;
      int i1;
      try
      {
        Object localObject = FileOp.mK(paramString);
        if (((String)localObject).endsWith("/")) {
          break label691;
        }
        localObject = (String)localObject + "/";
        String str1 = new File(paramString).getName();
        i = str1.lastIndexOf('.');
        if (i <= 0) {
          break label688;
        }
        str1 = str1.substring(0, i);
        str3 = (String)localObject + str1 + "_hd";
        str2 = str3;
        if (paramString.endsWith(".mp4")) {
          str2 = str3 + ".mp4";
        }
        str3 = (String)localObject + str1 + "tempRemuxing.mp4";
        FileOp.y(paramString, str2);
        x.i("MicroMsg.SightSendVideoLogic", "doRemuxingSendVideoMsg, dir: %s, oldFileName: %s, hdFilePath: %s, remuxingOutputFile: %s extInfotrycount %d", new Object[] { localObject, str1, str2, str3, Integer.valueOf(paramaso.rUQ) });
        localObject = new MediaMetadataRetriever();
        ((MediaMetadataRetriever)localObject).setDataSource(str2);
        n = bi.getInt(((MediaMetadataRetriever)localObject).extractMetadata(18), 0);
        i1 = bi.getInt(((MediaMetadataRetriever)localObject).extractMetadata(19), 0);
        i = Math.min(n, i1);
        if (i <= paramVideoTransPara.width) {
          break label694;
        }
        if ((i <= paramVideoTransPara.width) || (i % 16 != 0) || (Math.abs(i - paramVideoTransPara.width) >= 16)) {
          break label623;
        }
      }
      catch (Exception paramString)
      {
        String str3;
        String str2;
        long l;
        x.e("MicroMsg.SightSendVideoLogic", "doRemuxingSendVideoMsg error: %s", new Object[] { paramString.getMessage() });
        return -1;
      }
      x.i("MicroMsg.SightSendVideoLogic", "start remuxing %s,  rawwith %s, rawheight %s, outputWidth: %s, outputHeight: %s videoParams: %s", new Object[] { paramString, Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(j), Integer.valueOf(m), paramVideoTransPara });
      l = bi.VG();
      int i = SightVideoJNI.remuxing(str2, str3, j, m, paramVideoTransPara.videoBitrate, paramVideoTransPara.dQI, 8, paramVideoTransPara.dQH, 25.0F, 30.0F, null, 0, false);
      x.i("MicroMsg.SightSendVideoLogic", "doremuxing finish %s,  rawwith %s, rawheight %s, outputWidth: %s, outputHeight: %s duration: %s, used %sms", new Object[] { paramString, Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(j), Integer.valueOf(m), Integer.valueOf(i), Long.valueOf(bi.bI(l)) });
      FileOp.av(str3, paramString);
      l = bi.VG();
      if (paramaso.rUP)
      {
        SightVideoJNI.tagMP4Dscp(paramString, com.tencent.mm.modelcontrol.d.NP().getWeixinMeta());
        if (!bi.oW(paramaso.rUS)) {
          SightVideoJNI.tagMp4RecordInfo(paramString, paramaso.rUS);
        }
        SightVideoJNI.optimizeMP4(paramString);
      }
      paramd.bcM();
      x.i("MicroMsg.SightSendVideoLogic", "tagMP4Dscp used %sms", new Object[] { Long.valueOf(bi.bI(l)) });
      return i;
      label623:
      double d;
      if (n < i1)
      {
        i = paramVideoTransPara.width;
        d = 1.0D * n / i;
        j = (int)(i1 / d);
      }
      else
      {
        j = paramVideoTransPara.width;
        d = 1.0D * i1 / j;
        i = (int)(n / d);
        break label705;
        label688:
        continue;
        label691:
        continue;
        label694:
        m = i1;
        j = n;
        continue;
      }
      label705:
      int k = j;
      if (j % 2 != 0) {
        k = j + 1;
      }
      int j = i;
      int m = k;
      if (i % 2 != 0)
      {
        j = i + 1;
        m = k;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/mmsight/model/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */