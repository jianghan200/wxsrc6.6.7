package com.tencent.mm.plugin.mmsight.model.a;

import android.graphics.Point;
import android.os.HandlerThread;
import com.tencent.mm.e.b.c.a;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.plugin.mmsight.model.b;
import com.tencent.mm.plugin.mmsight.model.f;
import com.tencent.mm.plugin.mmsight.model.o;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.aa.a;
import java.io.File;

public final class n
  implements d
{
  private String bKg = "";
  String bOX = null;
  private boolean dtt = false;
  private String fOt = null;
  boolean faL = false;
  VideoTransPara lem;
  private Point lfE = null;
  private boolean lgJ = false;
  int lhM;
  private int liA = 1600000;
  int liB = 480;
  int liC = 640;
  int liD;
  private String liE = null;
  private boolean liJ = false;
  boolean liK = false;
  boolean liM = false;
  int liN = 0;
  d.a liO;
  boolean liQ = true;
  private f liR = new n.1(this);
  s lis;
  private String liv = "";
  private int liw = 0;
  private float lix = 0.0F;
  private int liy = 480;
  private int liz = 640;
  c ljf;
  q ljg;
  private m ljh;
  private HandlerThread lji;
  ag ljj;
  private int ljk = 0;
  b ljl = new b("yuvRecorderWriteData");
  b ljm = new b("frameCountCallback");
  Runnable ljn = null;
  private boolean ljo = false;
  private String mFileName;
  
  public n(VideoTransPara paramVideoTransPara)
  {
    this.lem = paramVideoTransPara;
    this.liy = paramVideoTransPara.width;
    this.liz = paramVideoTransPara.height;
    this.liA = paramVideoTransPara.videoBitrate;
    k.bey();
    int i = k.bez();
    if (i == -1) {}
    for (this.liA = paramVideoTransPara.videoBitrate;; this.liA = i)
    {
      this.lis = new s();
      x.d("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "create MMSightMediaCodecMP4MuxRecorder, targetWidth: %s, targetHeight: %s, targetRate: %s", new Object[] { Integer.valueOf(this.liy), Integer.valueOf(this.liz), Integer.valueOf(this.liA) });
      return;
    }
  }
  
  private boolean sS(int paramInt)
  {
    long l = bi.VG();
    this.lgJ = com.tencent.mm.plugin.mmsight.model.j.lgz.lgJ;
    int i = this.liA;
    this.lhM = SightVideoJNI.initDataBufferForMMSight(this.liB, this.liC, paramInt, this.liy, this.liz, this.lem.fps, i, this.lem.dQI, 8, this.lem.dQH, 23.0F, false, false, this.lem.duration, false);
    x.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "init, bufId: %s", new Object[] { Integer.valueOf(this.lhM) });
    if (this.lhM < 0)
    {
      x.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "init failed!");
      com.tencent.mm.plugin.mmsight.model.k.bdV();
      return false;
    }
    this.liD = paramInt;
    this.ljg = new q(this.liB, this.liC, this.liy, this.liz, this.liA, this.lem.dQG, this.lem.fps, this.lgJ);
    int j = this.ljg.cQ(this.lhM, paramInt);
    paramInt = 0;
    i = -1;
    if (CaptureMMProxy.getInstance() != null) {
      i = CaptureMMProxy.getInstance().getInt(aa.a.sUL, -1);
    }
    if (i < 0)
    {
      this.ljf = new g(this.lem.audioSampleRate, this.lem.dQF);
      this.ljf.gt(this.ljo);
      paramInt = this.ljf.at(this.lhM, com.tencent.mm.plugin.sight.base.d.Lm(this.liv));
      if ((j < 0) || (paramInt < 0))
      {
        x.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "init yuv or aac recorder error!! %d %d", new Object[] { Integer.valueOf(j), Integer.valueOf(paramInt) });
        if ((paramInt < 0) && (j >= 0))
        {
          x.w("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "aac init error, try mediarecorder now");
          this.ljf.clear();
          this.ljf = new i(this.lem.audioSampleRate, this.lem.dQF);
          this.ljf.gt(this.ljo);
          paramInt = this.ljf.at(this.lhM, com.tencent.mm.plugin.sight.base.d.Lm(this.liv));
          x.w("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "MMSightAACMediaRecorder init ret: %s", new Object[] { Integer.valueOf(paramInt) });
          if (paramInt >= 0) {
            return true;
          }
        }
        SightVideoJNI.releaseBigSightDataBuffer(this.lhM);
        com.tencent.mm.plugin.mmsight.model.k.bdV();
        return false;
      }
    }
    else
    {
      if (i == 1)
      {
        this.ljf = new g(this.lem.audioSampleRate, this.lem.dQF);
        this.ljf.gt(this.ljo);
        paramInt = this.ljf.at(this.lhM, com.tencent.mm.plugin.sight.base.d.Lm(this.liv));
      }
      while ((j < 0) || (paramInt < 0))
      {
        x.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "init yuv or aac recorder error!! %d %d", new Object[] { Integer.valueOf(j), Integer.valueOf(paramInt) });
        SightVideoJNI.releaseBigSightDataBuffer(this.lhM);
        com.tencent.mm.plugin.mmsight.model.k.bdV();
        return false;
        if (i == 2)
        {
          this.ljf = new i(this.lem.audioSampleRate, this.lem.dQF);
          this.ljf.gt(this.ljo);
          paramInt = this.ljf.at(this.lhM, com.tencent.mm.plugin.sight.base.d.Lm(this.liv));
        }
      }
    }
    x.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "initImpl used %sms", new Object[] { Long.valueOf(bi.bI(l)) });
    return true;
  }
  
  public final void E(Runnable paramRunnable)
  {
    this.ljn = paramRunnable;
    x.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "!!!!!stop, stopCallback: %s!!!", new Object[] { paramRunnable });
    if ((this.ljg == null) || (this.ljf == null))
    {
      x.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "error, yuvRecorder or aacRecorder is null");
      if (paramRunnable != null) {
        ah.A(paramRunnable);
      }
    }
    do
    {
      return;
      if ((this.lis == null) || (this.lis.ljK != d.c.lhF)) {
        break;
      }
      x.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "stop, already in stop status");
      if (this.ljf != null) {
        this.ljf.clear();
      }
      if (this.ljg != null) {
        this.ljg.clear();
      }
    } while (paramRunnable == null);
    ah.A(paramRunnable);
    return;
    this.liR = null;
    this.liw = ((int)this.ljg.beD());
    if (this.lis != null) {
      this.lis.a(d.c.lhD);
    }
    this.ljg.a(new n.4(this));
    this.ljf.a(new n.5(this));
  }
  
  public final void Hr(String paramString)
  {
    this.bOX = paramString;
  }
  
  public final void Hs(String paramString)
  {
    this.fOt = paramString;
  }
  
  public final void O(int paramInt1, int paramInt2, int paramInt3)
  {
    x.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "resume, cameraOrientation: %s", new Object[] { Integer.valueOf(paramInt1) });
    if ((this.lis != null) && (this.lis.ljK == d.c.lhK))
    {
      if (this.ljg != null)
      {
        q localq = this.ljg;
        localq.ljx = paramInt1;
        localq.ljy = paramInt2;
        localq.ljz = paramInt3;
        x.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "resume, newRotation: %s, newFrameWidth: %s, newFrameHeight: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      }
      this.lis.a(d.c.lhC);
    }
  }
  
  public final String Xh()
  {
    return bi.aG(this.bKg, "");
  }
  
  public final void a(d.a parama)
  {
    this.liO = parama;
  }
  
  public final String aRw()
  {
    return this.bOX;
  }
  
  public final boolean bdK()
  {
    return this.faL;
  }
  
  final boolean beC()
  {
    long l = bi.VG();
    int i;
    if ((this.lji != null) && (this.ljj != null))
    {
      if (com.tencent.mm.compatible.util.d.fR(18))
      {
        this.lji.quitSafely();
        this.ljj = null;
      }
    }
    else
    {
      i = this.ljg.frameCount;
      this.lix = (i * 1000.0F / this.liw);
      x.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "stop, frameCount: %s, fps: %s, duration: %s, file: %s handlerrunning %s", new Object[] { Integer.valueOf(i), Float.valueOf(this.lix), Integer.valueOf(this.liw), this.liv, Long.valueOf(bi.bI(l)) });
      x.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "frameCountCallback %s", new Object[] { this.ljm.getValue() });
      x.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "yuvRecorderWriteDataCallback %s", new Object[] { this.ljl.getValue() });
      str = null;
      if (CaptureMMProxy.getInstance() == null) {
        break label323;
      }
      str = CaptureMMProxy.getInstance().getAccVideoPath();
      label180:
      if (bi.oW(str)) {
        break label355;
      }
    }
    label323:
    label355:
    for (String str = com.tencent.mm.plugin.mmsight.d.Hn(str);; str = this.liv)
    {
      this.ljh = new m(this.lhM, str, this.lix, this.liA, this.liw, this.lem.audioSampleRate);
      l = bi.VG();
      boolean bool = this.ljh.bev();
      x.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "mux used %sms, success: %s", new Object[] { Long.valueOf(bi.bI(l)), Boolean.valueOf(bool) });
      if (bool) {
        break label364;
      }
      x.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "mux failed!");
      x.i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecMuxError");
      h.mEJ.a(440L, 31L, 1L, false);
      return false;
      this.lji.quit();
      break;
      if (bi.oW(this.liv)) {
        break label180;
      }
      str = new File(this.liv).getParentFile().getAbsolutePath();
      break label180;
    }
    label364:
    if (((this.faL) && (this.lgJ)) || ((!this.lgJ) && (!this.faL)) || ((this.faL) && (Math.abs(this.liD - this.liN) == 0)) || (this.liN == 180))
    {
      l = bi.VG();
      if ((this.lgJ) || (this.faL)) {
        break label687;
      }
      i = this.liD;
    }
    for (;;)
    {
      int j = i;
      if (this.liN == 180)
      {
        j = i;
        if (!this.lgJ)
        {
          i += 180;
          j = i;
          if (i > 360) {
            j = i - 360;
          }
        }
      }
      SightVideoJNI.tagRotateVideo(str, this.liE, j);
      this.liJ = true;
      x.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "tagRotateVideo used %sms, cameraOrientation: %s, isLandscape: %s, deviceDegree: %s, rotateDegree: %s", new Object[] { Long.valueOf(bi.bI(l)), Integer.valueOf(this.liD), Boolean.valueOf(this.faL), Integer.valueOf(this.liN), Integer.valueOf(j) });
      l = bi.VG();
      try
      {
        FileOp.deleteFile(str);
        FileOp.av(this.liE, str);
        x.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "copyFile cost %s", new Object[] { Long.valueOf(bi.bI(l)) });
        com.tencent.mm.sdk.f.e.post(new n.7(this, this.liE), "BigSightMediaCodecMP4MuxRecorder_tagRotate_after_process");
        SightVideoJNI.releaseBigSightDataBuffer(this.lhM);
        this.lis.a(d.c.lhF);
        this.bKg = com.tencent.mm.c.g.cu(str);
        if ((!bi.oW(str)) && (!str.equals(this.liv)))
        {
          FileOp.av(str, this.liv);
          FileOp.deleteFile(str);
        }
        return true;
      }
      catch (Exception localException)
      {
        label687:
        x.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "stop, copy file error");
      }
      if (this.lgJ) {
        i = this.liN;
      } else {
        i = 180;
      }
    }
    return false;
  }
  
  public final String bej()
  {
    return this.fOt;
  }
  
  public final float bek()
  {
    return this.lix;
  }
  
  public final long bel()
  {
    if (this.ljg != null) {
      return this.ljg.beD();
    }
    return 0L;
  }
  
  public final f bem()
  {
    return this.liR;
  }
  
  public final d.c ben()
  {
    return this.lis.ljK;
  }
  
  public final int beo()
  {
    return Math.round(this.liw / 1000.0F);
  }
  
  public final Point bep()
  {
    return new Point(this.liB, this.liC);
  }
  
  public final int beq()
  {
    return this.liD;
  }
  
  public final boolean ber()
  {
    return this.liM;
  }
  
  public final void bes()
  {
    this.ljo = true;
  }
  
  public final c.a bet()
  {
    if (this.ljf != null) {
      return this.ljf.beg();
    }
    return null;
  }
  
  public final void beu()
  {
    this.liQ = false;
  }
  
  public final void cancel()
  {
    x.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "cancel record");
    if ((this.ljg == null) || (this.ljf == null))
    {
      x.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "error, yuvRecorder or aacRecorder is null");
      return;
    }
    this.lis.a(d.c.lhE);
    this.ljg.a(null);
    this.ljf.a(new n.8(this));
    if ((this.lji != null) && (this.ljj != null))
    {
      this.ljj.removeMessages(0);
      this.lji.quit();
      this.ljj = null;
    }
    SightVideoJNI.releaseBigSightDataBuffer(this.lhM);
    this.lis.a(d.c.lhF);
    reset();
  }
  
  public final void clear()
  {
    try
    {
      x.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "clear");
      if (this.ljf != null) {
        this.ljf.clear();
      }
      if (this.ljg != null) {
        this.ljg.clear();
      }
      return;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.MMSightMediaCodecMP4MuxRecorder", localException, "clear error: %s", new Object[] { localException.getMessage() });
    }
  }
  
  public final int d(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    x.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "start, cameraOrientation: %s, isLandscape: %s, degree: %s", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt2) });
    this.ljl.reset();
    this.liw = 0;
    this.ljm.reset();
    this.liK = false;
    this.faL = paramBoolean;
    this.liN = paramInt2;
    this.lis.a(d.c.lhB);
    if (bi.oW(this.liv))
    {
      x.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "start error, mCurRecordPath is null!!");
      return -1;
    }
    try
    {
      this.mFileName = com.tencent.mm.a.e.cq(this.liv);
      String str2 = FileOp.mK(this.liv);
      String str1 = str2;
      if (!str2.endsWith("/")) {
        str1 = str2 + "/";
      }
      this.liE = (str1 + "tempRotate.mp4");
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "retrieve file name error: %s", new Object[] { localException.getMessage() });
        continue;
        this.lis.a(d.c.lhJ);
      }
    }
    x.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "mCurRecordPath: %s, tempRotateFilePath: %s", new Object[] { this.liv, this.liE });
    this.liD = paramInt1;
    this.lji = com.tencent.mm.sdk.f.e.cZ("BigSightMediaCodecMP4MuxRecorder_writeYuvData_" + hashCode(), -1);
    this.lji.start();
    this.ljj = new n.2(this, this.lji.getLooper());
    if (!this.dtt)
    {
      sS(paramInt1);
      this.dtt = true;
    }
    paramInt1 = this.ljf.a(new n.3(this));
    x.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "start aacRecorder ret: %s", new Object[] { Integer.valueOf(paramInt1) });
    this.liM = false;
    if (paramInt1 != 0)
    {
      this.lis.a(d.c.lhI);
      com.tencent.mm.plugin.mmsight.model.k.bdT();
      x.i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecCapture");
      h.mEJ.a(440L, 2L, 1L, false);
      return paramInt1;
    }
  }
  
  public final String getFileName()
  {
    return this.mFileName;
  }
  
  public final String getFilePath()
  {
    return this.liv;
  }
  
  public final void p(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    x.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "setSize, width: %s, height: %s, targetWidth: %s, targetHeight: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    x.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "setSize, after align, targetWidth: %d, targetHeight: %d", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    this.liy = paramInt3;
    this.liz = paramInt4;
    this.liB = paramInt1;
    this.liC = paramInt2;
    if (j.lin.i(Integer.valueOf(paramInt1 * paramInt2 * 3 / 2)) == null)
    {
      x.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "preloadCameraData, width: %s, height: %s, count: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(3) });
      long l = bi.VG();
      paramInt3 = 0;
      while (paramInt3 < 3)
      {
        j.lin.F(new byte[paramInt1 * paramInt2 * 3 / 2]);
        paramInt3 += 1;
      }
      x.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "preloadCameraData used %sms", new Object[] { Long.valueOf(bi.bI(l)) });
    }
  }
  
  public final void pause()
  {
    x.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "pause");
    if ((this.lis != null) && (this.lis.ljK == d.c.lhC)) {
      this.lis.a(d.c.lhK);
    }
  }
  
  public final void reset()
  {
    x.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "reset, yuvRecorder: %s, aacRecorder: %s, muxer: %s", new Object[] { this.ljg, this.ljf, this.ljh });
    this.ljg = null;
    this.ljf = null;
    this.ljh = null;
    this.dtt = false;
    this.liM = false;
  }
  
  public final boolean sQ(int paramInt)
  {
    if (!this.dtt)
    {
      x.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "preInit, cameraOrientation");
      boolean bool = sS(paramInt);
      this.dtt = true;
      x.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "initImpl result: %s", new Object[] { Boolean.valueOf(bool) });
      return bool;
    }
    return true;
  }
  
  public final void setFilePath(String paramString)
  {
    this.liv = paramString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/mmsight/model/a/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */