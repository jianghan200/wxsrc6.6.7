package com.tencent.mm.plugin.api.recordView;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.YuvImage;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.a;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.c;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.d;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.e;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.f;
import com.tencent.mm.plugin.mmsight.model.a.d.a;
import com.tencent.mm.plugin.mmsight.model.a.d.c;
import com.tencent.mm.plugin.mmsight.model.a.k;
import com.tencent.mm.plugin.mmsight.model.e;
import com.tencent.mm.plugin.mmsight.model.e.3;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.video.ObservableTextureView;
import com.tencent.mm.plugin.video.b;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.platformtools.x;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.List;

public final class f
  extends MMSightRecordView.d
  implements g.a, d.a, com.tencent.mm.plugin.mmsight.model.f
{
  private int audioSampleRate;
  private Context context;
  private int dQF;
  MMSightRecordView.c fbA;
  private boolean fbB = false;
  private float fbC = 1.0F;
  private byte[] fbD = null;
  private com.tencent.mm.plugin.mmsight.model.a.d fbi;
  e fbj;
  int fbk;
  float fbl;
  private int fbm;
  private boolean fbn = true;
  private ObservableTextureView fbo;
  private MMSightCameraGLSurfaceView fbp;
  boolean fbq = false;
  private MMSightRecordView.a fbr;
  boolean fbs = false;
  boolean fbt = false;
  int fbu = -1;
  Point fbv;
  private Point fbw;
  private boolean fbx = true;
  private boolean fby = true;
  private g fbz;
  private int fps;
  private int videoBitrate;
  private String videoPath;
  
  private void ZU()
  {
    if ((this.fbj != null) && (this.fbj.lfu))
    {
      if (this.fbj.lfW) {
        this.fbw = new Point(com.tencent.mm.plugin.mmsight.d.cP((int)(this.fbj.getPreviewWidth() / this.fbl), this.fbj.getPreviewHeight()), this.fbj.getPreviewWidth());
      }
    }
    else {
      return;
    }
    int i = com.tencent.mm.plugin.mmsight.d.cP((int)(this.fbj.getPreviewHeight() * this.fbl), this.fbj.getPreviewWidth());
    this.fbw = new Point(this.fbj.getPreviewHeight(), i);
  }
  
  public final boolean T(byte[] paramArrayOfByte)
  {
    int k = 0;
    if (paramArrayOfByte == null) {
      return false;
    }
    int j;
    int i;
    int m;
    Object localObject1;
    label156:
    Object localObject2;
    a locala;
    int n;
    if ((this.fbl > 0.0F) && (this.fbk > 0) && (this.fbj != null))
    {
      j = this.fbj.getPreviewWidth();
      i = this.fbj.getPreviewHeight();
      if (this.fbj.lfW)
      {
        m = (int)(this.fbj.getPreviewWidth() / this.fbl);
        if (m >= i) {
          break label1074;
        }
        if ((!this.fbs) && (this.fbD == null))
        {
          this.fbD = new byte[j * m * 3 >> 1];
          localObject1 = this.fbD;
          bi.VG();
          SightVideoJNI.cropCameraDataLongEdge(paramArrayOfByte, (byte[])localObject1, i, this.fbw.x, j);
          i = m;
          if (this.fbs) {
            i = this.fbw.x;
          }
          this.fbB = true;
          localObject2 = localObject1;
          if (this.fbp != null)
          {
            localObject2 = this.fbp;
            m = this.fbj.getOrientation();
            if ((i != ((MMSightCameraGLSurfaceView)localObject2).fau) || (j != ((MMSightCameraGLSurfaceView)localObject2).fav) || (m != ((MMSightCameraGLSurfaceView)localObject2).faO))
            {
              x.i("MicroMsg.MMSightCameraGLSurfaceView", "setFrameInfo, width: %s, height: %s, rotate: %s this: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(m), localObject2 });
              ((MMSightCameraGLSurfaceView)localObject2).fau = i;
              ((MMSightCameraGLSurfaceView)localObject2).fav = j;
              ((MMSightCameraGLSurfaceView)localObject2).faO = m;
            }
            localObject2 = this.fbp;
            if ((localObject1 == null) || (((MMSightCameraGLSurfaceView)localObject2).faM == null) || (((MMSightCameraGLSurfaceView)localObject2).faM.bum)) {
              break label988;
            }
            locala = ((MMSightCameraGLSurfaceView)localObject2).faM;
            j = ((MMSightCameraGLSurfaceView)localObject2).fau;
            m = ((MMSightCameraGLSurfaceView)localObject2).fav;
            n = ((MMSightCameraGLSurfaceView)localObject2).faO;
          }
        }
      }
    }
    for (;;)
    {
      try
      {
        if ((locala.fav != m) || (locala.fau != j) || (locala.bYE != n)) {
          break label1080;
        }
        if (!locala.faL) {
          break label1063;
        }
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.MMSightCameraGLRenderer", "setDrawFrame error: %s", new Object[] { localException.getMessage() });
        continue;
      }
      if (i != 0) {
        x.d("MicroMsg.MMSightCameraGLRenderer", "setDrawFrame, frameData: %s, frameWidth: %s, frameHeight: %s, rotate: %s, isLandScape, frameSizeChange: %s, this %s", new Object[] { localObject1, Integer.valueOf(j), Integer.valueOf(m), Integer.valueOf(n), Boolean.valueOf(false), Boolean.valueOf(true), locala });
      }
      locala.fat = ((byte[])localObject1);
      locala.fau = j;
      locala.fav = m;
      locala.bYE = n;
      locala.faL = false;
      if (i != 0)
      {
        locala.faw = ByteBuffer.allocateDirect(m * j);
        locala.fax = ByteBuffer.allocateDirect(j * m / 2);
        locala.faw.order(ByteOrder.nativeOrder());
        locala.fax.order(ByteOrder.nativeOrder());
        locala.faK = a.fao;
        if (locala.faK != null)
        {
          locala.faG.put(locala.faK);
          locala.faG.position(0);
        }
      }
      if ((locala.faw != null) && (locala.fax != null))
      {
        locala.faw.put((byte[])localObject1, 0, j * m);
        locala.faw.position(0);
        locala.fax.put((byte[])localObject1, j * m, j * m / 2);
        locala.fax.position(0);
      }
      ((MMSightCameraGLSurfaceView)localObject2).requestRender();
      localObject2 = localObject1;
      if (this.fbr != null)
      {
        localObject1 = this.fbr;
        if ((this.fbj.getOrientation() == 0) || (this.fbj.getOrientation() == 180))
        {
          i = this.fbj.getPreviewWidth();
          if ((this.fbj.getOrientation() != 0) && (this.fbj.getOrientation() != 180)) {
            break label1020;
          }
          j = this.fbj.getPreviewHeight();
          ((MMSightRecordView.a)localObject1).n(paramArrayOfByte, i, j);
        }
      }
      else
      {
        if ((this.fbi == null) || (this.fbi.bem() == null)) {
          break label1054;
        }
        if ((!this.fbs) || (!this.fbB)) {
          break label1031;
        }
        bool = this.fbi.bem().T((byte[])localObject2);
        i = 1;
        if ((i != 0) && ((this.fbi == null) || (this.fbi.ben() != d.c.lhC))) {
          com.tencent.mm.plugin.mmsight.model.a.j.lin.F((byte[])localObject2);
        }
        return bool;
        localObject1 = com.tencent.mm.plugin.mmsight.model.a.j.lin.i(Integer.valueOf(this.fbw.x * this.fbw.y * 3 >> 1));
        break;
        m = (int)(i * this.fbl);
        if (m >= j) {
          break label1068;
        }
        if ((!this.fbs) && (this.fbD == null))
        {
          this.fbD = new byte[m * i * 3 >> 1];
          localObject1 = this.fbD;
          bi.VG();
          SightVideoJNI.cropCameraData(paramArrayOfByte, (byte[])localObject1, i, j, this.fbw.y);
          j = this.fbw.y;
          this.fbB = true;
          break label156;
        }
        localObject1 = com.tencent.mm.plugin.mmsight.model.a.j.lin.i(Integer.valueOf(this.fbw.x * this.fbw.y * 3 >> 1));
        continue;
        label988:
        x.v("MicroMsg.MMSightCameraGLSurfaceView", "passing draw");
        localObject2 = localObject1;
        continue;
        localObject2 = paramArrayOfByte;
        continue;
      }
      i = this.fbj.getPreviewHeight();
      continue;
      label1020:
      j = this.fbj.getPreviewWidth();
      continue;
      label1031:
      boolean bool = this.fbi.bem().T(paramArrayOfByte);
      i = k;
      continue;
      label1054:
      bool = true;
      i = k;
      continue;
      label1063:
      i = 0;
      continue;
      label1068:
      localObject1 = paramArrayOfByte;
      break label156;
      label1074:
      localObject1 = paramArrayOfByte;
      break label156;
      label1080:
      i = 1;
    }
  }
  
  public final void ZS()
  {
    ZT();
  }
  
  final void ZT()
  {
    if (this.fbq) {
      x.i("MicroMsg.MMSightRecordViewImpl", "initRecorder, already init");
    }
    do
    {
      do
      {
        return;
        if (this.fbi != null)
        {
          x.i("MicroMsg.MMSightRecordViewImpl", "startRecord, recorder not null, stop first");
          this.fbi.cancel();
          if (this.fbj != null) {
            this.fbj.b(this.fbi.bem());
          }
          this.fbi = null;
        }
      } while ((this.fbk <= 0) || (this.fbm <= 0) || (this.videoBitrate <= 0) || (this.fps <= 0) || (this.dQF <= 0) || (this.audioSampleRate <= 0) || (this.fbj == null) || (this.fbj.lfD == null));
      VideoTransPara localVideoTransPara = new VideoTransPara();
      localVideoTransPara.width = this.fbk;
      localVideoTransPara.height = ((int)(this.fbk / this.fbl));
      localVideoTransPara.duration = this.fbm;
      localVideoTransPara.videoBitrate = this.videoBitrate;
      localVideoTransPara.fps = this.fps;
      localVideoTransPara.dQF = this.dQF;
      localVideoTransPara.audioSampleRate = this.audioSampleRate;
      localVideoTransPara.dQH = 2;
      localVideoTransPara.dQI = 1;
      localVideoTransPara.dQG = 1;
      com.tencent.mm.plugin.mmsight.model.j.lgz.lem = localVideoTransPara;
      com.tencent.mm.plugin.mmsight.model.j.lgz.videoBitrate = this.videoBitrate;
      com.tencent.mm.plugin.mmsight.model.j.lgz.lfa = this.fbk;
      k.bey();
      this.fbi = k.d(localVideoTransPara);
      if (this.fbi != null) {
        break;
      }
      x.e("MicroMsg.MMSightRecordViewImpl", "can not get media recorder!");
    } while (this.fbA == null);
    this.fbA.aiL();
    return;
    this.fbi.setFilePath(this.videoPath);
    if ((this.fbs) && (this.fbj != null) && (this.fbj.lfu)) {
      ZU();
    }
    int k = this.fbj.lfD.x;
    int m = this.fbj.lfD.y;
    int i = m;
    int j = k;
    if (this.fbw != null)
    {
      i = m;
      j = k;
      if (this.fbs)
      {
        j = this.fbw.x;
        i = this.fbw.y;
      }
    }
    j = (int)(j * this.fbC);
    i = (int)(i * this.fbC);
    j = com.tencent.mm.plugin.mmsight.d.sM(j);
    i = com.tencent.mm.plugin.mmsight.d.sM(i);
    x.i("MicroMsg.MMSightRecordViewImpl", "initRecorder, videoWidth: %s, videoHeight: %s, videoSizeRatio: %s", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Float.valueOf(this.fbC) });
    if ((this.fbw != null) && (this.fbs)) {
      this.fbi.p(this.fbw.y, this.fbw.x, j, i);
    }
    for (;;)
    {
      this.fbi.beu();
      this.fbi.a(this);
      if (this.fbi.sQ(this.fbj.getOrientation())) {
        break label600;
      }
      x.e("MicroMsg.MMSightRecordViewImpl", "init recorder error");
      if (this.fbA == null) {
        break;
      }
      this.fbA.aiL();
      return;
      this.fbi.p(this.fbj.getPreviewWidth(), this.fbj.getPreviewHeight(), j, i);
    }
    label600:
    this.fbq = true;
  }
  
  final void ZV()
  {
    if ((this.fbj != null) && (this.fbj.lfu))
    {
      if (this.fbj.lfW)
      {
        int i = (int)(this.fbj.getPreviewWidth() / this.fbl);
        this.fbv = new Point(this.fbj.getPreviewWidth(), i);
      }
    }
    else {
      return;
    }
    this.fbv = new Point((int)(this.fbj.getPreviewHeight() * this.fbl), this.fbj.getPreviewHeight());
  }
  
  final void ZW()
  {
    x.i("MicroMsg.MMSightRecordViewImpl", "setFlashModeImpl, mode: %s", new Object[] { Integer.valueOf(this.fbu) });
    switch (this.fbu)
    {
    }
    e locale;
    do
    {
      return;
      this.fbj.bdQ();
      return;
      this.fbj.bdR();
      return;
      locale = this.fbj;
      x.i("MicroMsg.MMSightCamera", "autoFlash, camera: %s, isPreviewing: %s", new Object[] { locale.ddt, Boolean.valueOf(locale.lfu) });
    } while ((locale.ddt == null) || (!locale.lfu));
    try
    {
      locale.lfJ = true;
      Camera.Parameters localParameters = locale.ddt.getParameters();
      if ((!bi.cX(localParameters.getSupportedFlashModes())) && (localParameters.getSupportedFlashModes().contains("auto")))
      {
        localParameters.setFlashMode("auto");
        locale.ddt.setParameters(localParameters);
        x.i("MicroMsg.MMSightCamera", "auto flash");
        return;
      }
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.MMSightCamera", localException, "autoFlash error: %s", new Object[] { localException.getMessage() });
      return;
    }
    x.i("MicroMsg.MMSightCamera", "camera not support auto flash!!");
  }
  
  public final void ZX()
  {
    x.i("MicroMsg.MMSightRecordViewImpl", "setHalfPreviewVideoSize");
    this.fbC = 0.5F;
  }
  
  public final void ZY()
  {
    x.i("MicroMsg.MMSightRecordViewImpl", "set34PreviewVideoSize");
    this.fbC = 0.75F;
  }
  
  public final void ZZ()
  {
    x.i("MicroMsg.MMSightRecordViewImpl", "onError: %s", new Object[] { Integer.valueOf(1) });
    this.fbi.reset();
  }
  
  public final void a(MMSightRecordView.e parame, boolean paramBoolean)
  {
    if ((parame != null) && (this.fbj != null) && (this.fbj.lfu))
    {
      if (paramBoolean) {
        this.fbj.bdQ();
      }
      if (paramBoolean) {
        ah.i(new f.4(this, parame, paramBoolean), 100L);
      }
    }
    else
    {
      return;
    }
    b(parame, paramBoolean);
  }
  
  public final void a(final MMSightRecordView.f paramf)
  {
    if (this.fbi != null)
    {
      x.i("MicroMsg.MMSightRecordViewImpl", "stopRecord, stopCallback: %s", new Object[] { paramf });
      this.fbi.a(new f.2(this, paramf));
      this.fbi.E(new Runnable()
      {
        public final void run()
        {
          f.this.fbq = false;
          if (paramf != null) {
            paramf.cN(false);
          }
        }
      });
      this.fbi = null;
    }
  }
  
  public final void aaa()
  {
    if ((this.fbj != null) && (this.fbj.lfu) && (this.fby))
    {
      e locale = this.fbj;
      if ((locale.ddt != null) && (locale.lfu))
      {
        Camera.Parameters localParameters = locale.ddt.getParameters();
        List localList = localParameters.getSupportedFocusModes();
        if ((localList != null) && (localList.contains("auto")))
        {
          x.i("MicroMsg.MMSightCameraSetting", "support auto focus");
          localParameters.setFocusMode("auto");
          locale.ddt.setParameters(localParameters);
        }
        locale.ddt.cancelAutoFocus();
        locale.ddt.autoFocus(new e.3(locale));
      }
    }
  }
  
  public final void aab()
  {
    if ((this.fbj != null) && (this.fbj.lfu) && (this.fbx)) {
      this.fbj.b(true, false, 1);
    }
  }
  
  public final void aac()
  {
    if ((this.fbj != null) && (this.fbj.lfu) && (this.fbx)) {
      this.fbj.b(false, false, 1);
    }
  }
  
  public final void b(Context paramContext, ViewGroup paramViewGroup)
  {
    this.context = paramContext;
    this.fbo = new ObservableTextureView(paramContext);
    this.fbp = new MMSightCameraGLSurfaceView(paramContext);
    int i = com.tencent.mm.bp.a.fromDPToPix(paramContext, 1);
    Object localObject = new FrameLayout.LayoutParams(i, i);
    paramViewGroup.addView(this.fbo, (ViewGroup.LayoutParams)localObject);
    localObject = new ViewGroup.MarginLayoutParams(-1, -1);
    paramViewGroup.addView(this.fbp, (ViewGroup.LayoutParams)localObject);
    this.fbz = new g();
    this.fbz.fbL = this;
    this.fbp.setOnTouchListener(this.fbz);
    com.tencent.mm.plugin.mmsight.model.j.bdS();
    x.i("MicroMsg.MMSightRecordViewImpl", "init view, context: %s", new Object[] { paramContext });
  }
  
  final void b(MMSightRecordView.e parame, boolean paramBoolean)
  {
    this.fbj.a(new f.5(this, paramBoolean, parame), false, 0);
  }
  
  public final int getCameraRotation()
  {
    if (this.fbj != null) {
      return this.fbj.getOrientation();
    }
    return 0;
  }
  
  public final Bitmap getCurrentFramePicture()
  {
    Object localObject3 = null;
    Object localObject2 = localObject3;
    Object localObject1;
    int j;
    int i;
    int k;
    if (this.fbj != null)
    {
      localObject2 = localObject3;
      if (this.fbj.lfu)
      {
        localObject2 = this.fbj;
        if (((e)localObject2).lfU == null) {
          break label299;
        }
        ((e)localObject2).lfV = true;
        localObject1 = new byte[((e)localObject2).lfU.length];
        System.arraycopy(((e)localObject2).lfU, 0, localObject1, 0, ((e)localObject2).lfU.length);
        ((e)localObject2).lfV = false;
        localObject2 = localObject3;
        if (localObject1 != null)
        {
          j = this.fbj.getPreviewWidth();
          i = this.fbj.getPreviewHeight();
          if (!this.fbj.lfW) {
            break label338;
          }
          k = (int)(this.fbj.getPreviewWidth() / this.fbl);
          if (k >= i) {
            break label457;
          }
          if ((this.fbs) || (this.fbD != null)) {
            break label305;
          }
          this.fbD = new byte[j * k * 3 >> 1];
          localObject2 = this.fbD;
          label170:
          SightVideoJNI.cropCameraDataLongEdge((byte[])localObject1, (byte[])localObject2, i, this.fbw.x, j);
          i = k;
          if (this.fbs) {
            i = this.fbw.x;
          }
          this.fbB = true;
        }
      }
    }
    for (;;)
    {
      localObject1 = localObject2;
      for (;;)
      {
        localObject1 = new YuvImage((byte[])localObject1, 17, i, j, null);
        localObject2 = new ByteArrayOutputStream();
        ((YuvImage)localObject1).compressToJpeg(new Rect(0, 0, i, j), 100, (OutputStream)localObject2);
        localObject1 = ((ByteArrayOutputStream)localObject2).toByteArray();
        localObject1 = MMBitmapFactory.decodeByteArray((byte[])localObject1, 0, localObject1.length);
        localObject2 = c.b((Bitmap)localObject1, this.fbj.getOrientation());
        ((Bitmap)localObject1).recycle();
        return (Bitmap)localObject2;
        label299:
        localObject1 = null;
        break;
        label305:
        localObject2 = com.tencent.mm.plugin.mmsight.model.a.j.lin.i(Integer.valueOf(this.fbw.x * this.fbw.y * 3 >> 1));
        break label170;
        label338:
        k = (int)(i * this.fbl);
        if (k < j)
        {
          if ((!this.fbs) && (this.fbD == null)) {
            this.fbD = new byte[k * i * 3 >> 1];
          }
          for (localObject2 = this.fbD;; localObject2 = com.tencent.mm.plugin.mmsight.model.a.j.lin.i(Integer.valueOf(this.fbw.x * this.fbw.y * 3 >> 1)))
          {
            SightVideoJNI.cropCameraData((byte[])localObject1, (byte[])localObject2, i, j, this.fbw.y);
            j = this.fbw.y;
            this.fbB = true;
            localObject1 = localObject2;
            break;
          }
        }
      }
      label457:
      localObject2 = localObject1;
    }
  }
  
  public final int getFlashMode()
  {
    return this.fbu;
  }
  
  public final Point getPictureSize()
  {
    if ((this.fbj != null) && (this.fbj.lfu))
    {
      if (!this.fbt) {
        return new Point(this.fbj.getPreviewWidth(), this.fbj.getPreviewHeight());
      }
      ZV();
      return this.fbv;
    }
    return null;
  }
  
  public final String getVideoFilePath()
  {
    if ((this.fbi != null) && (this.fbq)) {
      return this.fbi.getFilePath();
    }
    return this.videoPath;
  }
  
  public final Point getVideoSize()
  {
    if ((this.fbj != null) && (this.fbj.lfu))
    {
      int k = this.fbj.lfD.x;
      int m = this.fbj.lfD.y;
      int i = m;
      int j = k;
      if (this.fbw != null)
      {
        i = m;
        j = k;
        if (this.fbs)
        {
          j = this.fbw.x;
          i = this.fbw.y;
        }
      }
      j = (int)(j * this.fbC);
      i = (int)(i * this.fbC);
      return new Point(com.tencent.mm.plugin.mmsight.d.sM(j), com.tencent.mm.plugin.mmsight.d.sM(i));
    }
    return null;
  }
  
  public final void release()
  {
    x.i("MicroMsg.MMSightRecordViewImpl", "release, camera: %s, recorder: %s", new Object[] { this.fbj, this.fbi });
    if (this.fbj != null) {
      this.fbj.bdL();
    }
    if (this.fbi != null)
    {
      this.fbi.E(null);
      this.fbi = null;
    }
    this.fbq = false;
    this.fbs = false;
    this.fbt = false;
    this.fbv = null;
    this.fbw = null;
    this.fbu = -1;
    this.fbx = true;
    this.fby = true;
    com.tencent.mm.plugin.mmsight.model.a.j.lin.Fm();
  }
  
  public final void setClipPictureSize(boolean paramBoolean)
  {
    this.fbt = paramBoolean;
    if ((this.fbt) && (this.fbj != null) && (this.fbj.lfu)) {
      ZV();
    }
  }
  
  public final void setClipVideoSize(boolean paramBoolean)
  {
    this.fbs = paramBoolean;
    if ((this.fbs) && (this.fbj != null) && (this.fbj.lfu)) {
      ZU();
    }
  }
  
  public final void setDisplayRatio(float paramFloat)
  {
    x.i("MicroMsg.MMSightRecordViewImpl", "setDisplayRatio: %s", new Object[] { Float.valueOf(paramFloat) });
    this.fbl = paramFloat;
  }
  
  public final void setEnableDragZoom(boolean paramBoolean)
  {
    this.fbx = paramBoolean;
  }
  
  public final void setEnableTouchFocus(boolean paramBoolean)
  {
    this.fby = paramBoolean;
  }
  
  public final void setFlashMode(int paramInt)
  {
    boolean bool = true;
    this.fbu = paramInt;
    e locale = this.fbj;
    if ((this.fbj != null) && (this.fbj.lfu)) {}
    for (;;)
    {
      x.i("MicroMsg.MMSightRecordViewImpl", "setFlashMode: %s, camera: %s, previewing: %s", new Object[] { Integer.valueOf(paramInt), locale, Boolean.valueOf(bool) });
      if ((this.fbj != null) && (this.fbj.lfu)) {
        ZW();
      }
      return;
      bool = false;
    }
  }
  
  public final void setFrameDataCallback(MMSightRecordView.a parama)
  {
    this.fbr = parama;
  }
  
  public final void setInitErrorCallback(MMSightRecordView.c paramc)
  {
    this.fbA = paramc;
  }
  
  public final void setPreviewSizeLimit(int paramInt)
  {
    x.i("MicroMsg.MMSightRecordViewImpl", "setPreviewSizeLimit: %s", new Object[] { Integer.valueOf(paramInt) });
    this.fbk = paramInt;
  }
  
  public final void setUseBackCamera(boolean paramBoolean)
  {
    x.i("MicroMsg.MMSightRecordViewImpl", "setUseBackCamera: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    this.fbn = paramBoolean;
  }
  
  public final void setVideoFilePath(String paramString)
  {
    x.i("MicroMsg.MMSightRecordViewImpl", "setVideoFilePath: %s", new Object[] { paramString });
    this.videoPath = paramString;
  }
  
  public final void setVideoPara$2e715812(int paramInt)
  {
    this.fbm = paramInt;
    this.videoBitrate = 4800000;
    this.fps = 30;
    this.dQF = 64000;
    this.audioSampleRate = 44100;
    x.i("MicroMsg.MMSightRecordViewImpl", "setVideoPara, maxDuration: %s, videoBitrate: %s, fps: %s, audioBitrate: %s, audioSampleRate: %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(4800000), Integer.valueOf(30), Integer.valueOf(64000), Integer.valueOf(44100) });
  }
  
  public final void startPreview()
  {
    x.i("MicroMsg.MMSightRecordViewImpl", "startPreview, displayRatio: %s, previewSizeLimit: %s", new Object[] { Float.valueOf(this.fbl), Integer.valueOf(this.fbk) });
    if ((this.fbl > 0.0F) && (this.fbk > 0))
    {
      VideoTransPara localVideoTransPara = new VideoTransPara();
      localVideoTransPara.width = this.fbk;
      localVideoTransPara.height = ((int)(this.fbk / this.fbl));
      x.i("MicroMsg.MMSightRecordViewImpl", "para width: %s, height: %s", new Object[] { Integer.valueOf(localVideoTransPara.width), Integer.valueOf(localVideoTransPara.height) });
      this.fbj = new e(localVideoTransPara, -1);
      this.fbj.a(this);
      if (this.fbj.o(this.context, this.fbn)) {
        break label178;
      }
      x.i("MicroMsg.MMSightRecordViewImpl", "open camera failed!");
      if (this.fbA != null) {
        this.fbA.aiL();
      }
    }
    return;
    label178:
    x.i("MicroMsg.MMSightRecordViewImpl", "open camera finish");
    if (this.fbo.isAvailable())
    {
      if (this.fbj.a(this.fbo.getSurfaceTexture(), this.fbk, this.fbl, this.fbs) < 0)
      {
        x.e("MicroMsg.MMSightRecordViewImpl", "start preview failed!");
        if (this.fbA != null) {
          this.fbA.aiL();
        }
      }
      if (this.fbu != -1) {
        ZW();
      }
      this.fbj.bdM();
      x.i("MicroMsg.MMSightRecordViewImpl", "do start preview directly");
      ZT();
      return;
    }
    this.fbo.setTextureChangeCallback(new b()
    {
      public final void d(SurfaceTexture paramAnonymousSurfaceTexture)
      {
        if (f.this.fbj.a(paramAnonymousSurfaceTexture, f.this.fbk, f.this.fbl, f.this.fbs) < 0)
        {
          x.e("MicroMsg.MMSightRecordViewImpl", "start preview failed!");
          if (f.this.fbA != null) {
            f.this.fbA.aiL();
          }
        }
        if (f.this.fbu != -1) {
          f.this.ZW();
        }
        f.this.fbj.bdM();
        f.this.ZT();
        x.i("MicroMsg.MMSightRecordViewImpl", "do start preview after texture available");
      }
    });
  }
  
  public final void switchCamera()
  {
    if ((this.fbj != null) && (this.fbj.lfu) && ((this.fbi == null) || (this.fbi.ben() != d.c.lhC))) {
      this.fbj.a(this.context, this.fbo.getSurfaceTexture(), this.fbk, this.fbl, this.fbs);
    }
  }
  
  public final boolean wn()
  {
    x.i("MicroMsg.MMSightRecordViewImpl", "startRecord, recorder: %s", new Object[] { this.fbi });
    ZT();
    if (this.fbi == null) {
      x.e("MicroMsg.MMSightRecordViewImpl", "startRecord error, recorder is null!");
    }
    int i;
    do
    {
      return false;
      i = this.fbi.d(this.fbj.getOrientation(), false, 0);
      x.i("MicroMsg.MMSightRecordViewImpl", "startRecord now, ret: %s", new Object[] { Integer.valueOf(i) });
    } while (i < 0);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/api/recordView/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */