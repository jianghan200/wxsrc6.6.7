package com.tencent.mm.plugin.voip.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.Area;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.compatible.util.l;
import com.tencent.mm.g.a.lr;
import com.tencent.mm.plugin.video.ObservableSurfaceView;
import com.tencent.mm.plugin.video.ObservableTextureView;
import com.tencent.mm.plugin.voip.model.i;
import com.tencent.mm.plugin.voip.model.r;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public final class a
  implements com.tencent.mm.plugin.video.a, com.tencent.mm.plugin.video.b
{
  private static final Pattern mNm = Pattern.compile(",");
  private static int oTa = 20;
  private static int oTb = 70;
  protected int mHeight = 240;
  protected int mWidth = 320;
  protected int oTA;
  protected int oTB = 0;
  protected int oTC = 0;
  protected int oTD = 0;
  Camera.PreviewCallback oTE = new a.2(this);
  protected boolean oTc = false;
  protected boolean oTd = false;
  protected boolean oTe = false;
  protected boolean oTf = false;
  protected boolean oTg = false;
  protected long oTh = 0L;
  protected long oTi = 30000L;
  protected int oTj = 0;
  protected Camera oTk;
  protected Camera.Parameters oTl;
  protected Camera.Size oTm;
  protected int oTn;
  protected boolean oTo = false;
  protected boolean oTp = false;
  protected boolean oTq = false;
  protected ObservableSurfaceView oTr = null;
  protected ObservableTextureView oTs;
  protected g oTt;
  protected boolean oTu = false;
  protected boolean oTv = false;
  protected byte[] oTw = null;
  protected int[] oTx = null;
  protected List<byte[]> oTy;
  protected boolean oTz = true;
  
  public a(int paramInt1, int paramInt2)
  {
    this.mWidth = paramInt1;
    this.mHeight = paramInt2;
    j.eq(ad.getContext().getApplicationContext());
    x.d("MicroMsg.Voip.CaptureRender", "width: %d, height: %d", new Object[] { Integer.valueOf(this.mWidth), Integer.valueOf(this.mHeight) });
  }
  
  private static Point a(CharSequence paramCharSequence, Point paramPoint)
  {
    int i1 = Integer.MAX_VALUE;
    paramCharSequence = mNm.split(paramCharSequence);
    int i6 = paramCharSequence.length;
    int m = 0;
    int j = 0;
    String str;
    int k;
    int i4;
    int i3;
    int i2;
    for (int i = 0;; i = i4)
    {
      if (m >= i6) {
        break label269;
      }
      str = paramCharSequence[m].trim();
      k = str.indexOf('x');
      if (k >= 0) {
        break;
      }
      x.w("MicroMsg.Voip.CaptureRender", "Bad preview-size: " + str);
      i4 = i;
      i3 = j;
      i2 = i1;
      m += 1;
      i1 = i2;
      j = i3;
    }
    for (;;)
    {
      int i5;
      try
      {
        n = Integer.parseInt(str.substring(0, k));
        k = Integer.parseInt(str.substring(k + 1));
        i5 = Math.abs(n - paramPoint.x) + Math.abs(k - paramPoint.y);
        if (i5 != 0) {
          break label218;
        }
        if ((n <= 0) || (k <= 0)) {
          break label267;
        }
        return new Point(n, k);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        x.w("MicroMsg.Voip.CaptureRender", "Bad preview-size: " + str);
        i2 = i1;
        i3 = j;
        i4 = i;
      }
      break;
      label218:
      i2 = i1;
      i3 = j;
      i4 = i;
      if (i5 >= i1) {
        break;
      }
      i2 = i1;
      i3 = j;
      i4 = i;
      if (n == k) {
        break;
      }
      i2 = i5;
      i3 = k;
      i4 = n;
      break;
      label267:
      return null;
      label269:
      k = j;
      int n = i;
    }
  }
  
  private static boolean a(Camera paramCamera, int paramInt1, int paramInt2)
  {
    if (paramCamera == null) {
      return false;
    }
    try
    {
      Camera.Parameters localParameters = paramCamera.getParameters();
      if ((paramInt1 > 0) && (paramInt2 > 0)) {
        localParameters.setPreviewSize(paramInt1, paramInt2);
      }
      paramCamera.setParameters(localParameters);
      return true;
    }
    catch (Exception paramCamera)
    {
      com.tencent.mm.plugin.report.service.h.mEJ.a(159L, 0L, 1L, false);
      x.e("MicroMsg.Voip.CaptureRender", "TryPreviewSize fail:" + paramCamera.toString());
    }
    return false;
  }
  
  private void bLW()
  {
    if ((this.oTm != null) && (this.oTm.height > 0) && (this.oTm.width > 0))
    {
      int j = this.oTm.height * this.oTm.width * 3 / 2;
      if (this.oTy == null)
      {
        this.oTy = new ArrayList(3);
        i = 0;
        while (i < 3)
        {
          this.oTy.add(new byte[j]);
          i += 1;
        }
      }
      int i = 0;
      while (i < this.oTy.size())
      {
        this.oTk.addCallbackBuffer((byte[])this.oTy.get(i));
        i += 1;
      }
      this.oTk.setPreviewCallbackWithBuffer(this.oTE);
      return;
    }
    this.oTk.setPreviewCallback(this.oTE);
  }
  
  public static void bMa() {}
  
  private int e(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    x.i("MicroMsg.Voip.CaptureRender", "try open camera, face: " + paramBoolean);
    this.oTp = false;
    int j = 1;
    int i = j;
    if (this.oTk != null)
    {
      if (this.oTc == paramBoolean) {
        break label108;
      }
      this.oTk.setPreviewCallback(null);
      this.oTk.stopPreview();
      this.oTk.release();
      this.oTk = null;
    }
    label108:
    for (i = j; i != 0; i = 0)
    {
      this.oTk = iW(paramBoolean);
      if (this.oTk != null) {
        break;
      }
      this.oTo = false;
      return -1;
    }
    Object localObject3;
    try
    {
      if (this.oTk != null) {
        this.oTk.getParameters();
      }
      this.oTo = true;
      localObject1 = this.oTk;
      i = j.oVo.oTX;
      if (localObject1 == null) {}
    }
    catch (Exception localException1)
    {
      try
      {
        label190:
        label233:
        label241:
        localCamera = this.oTk;
        localObject1 = localCamera.getParameters();
        localPoint = new Point(paramInt1, paramInt2);
        localObject4 = ((Camera.Parameters)localObject1).get("preview-size-values");
        if (localObject4 != null) {
          break label1295;
        }
        localObject4 = ((Camera.Parameters)localObject1).get("preview-size-value");
        label370:
        localObject1 = null;
        if (localObject4 != null)
        {
          x.i("MicroMsg.Voip.CaptureRender", "preview-size-values parameter: " + (String)localObject4);
          localObject1 = a((CharSequence)localObject4, localPoint);
        }
        localObject4 = localObject1;
        if (localObject1 == null) {
          localObject4 = new Point(localPoint.x >> 3 << 3, localPoint.y >> 3 << 3);
        }
        localCamera.getClass();
        localObject1 = new Camera.Size(localCamera, ((Point)localObject4).x, ((Point)localObject4).y);
      }
      catch (Exception localException5)
      {
        Object localObject1;
        Object localObject5;
        localObject2 = localObject5;
      }
      try
      {
        x.i("MicroMsg.Voip.CaptureRender", "getCameraResolution:" + ((Camera.Size)localObject1).width + "," + ((Camera.Size)localObject1).height);
        if (i == 0) {
          break label825;
        }
        paramBoolean = a(this.oTk, ((Camera.Size)localObject3).width, ((Camera.Size)localObject3).height);
        x.i("MicroMsg.Voip.CaptureRender", "1.try config size first! w" + ((Camera.Size)localObject3).width + ",h" + ((Camera.Size)localObject3).height);
        if ((paramBoolean) || (localObject1 == null)) {
          break label940;
        }
        x.e("MicroMsg.Voip.CaptureRender", "1.try config size failed!,try support size: w" + ((Camera.Size)localObject1).width + ",h" + ((Camera.Size)localObject1).height);
        if (a(this.oTk, ((Camera.Size)localObject1).width, ((Camera.Size)localObject1).height)) {
          break label940;
        }
        x.e("MicroMsg.Voip.CaptureRender", "1.try support size fail: w" + ((Camera.Size)localObject1).width + ",h" + ((Camera.Size)localObject1).height);
        return -1;
      }
      catch (Exception localException6)
      {
        for (;;) {}
      }
      localException1 = localException1;
      com.tencent.mm.plugin.report.service.h.mEJ.a(159L, 0L, 1L, false);
      x.e("MicroMsg.Voip.CaptureRender", "Camera open failed, error:%s", new Object[] { localException1.getMessage() });
      if (this.oTt != null) {
        this.oTt.bgV();
      }
      return -1;
    }
    label738:
    Object localObject2;
    try
    {
      localObject3 = ((Camera)localObject1).getParameters();
      if (!l.xZ()) {
        break label738;
      }
      ((Camera.Parameters)localObject3).setPreviewFpsRange(i * 1000, i * 1000);
      ((Camera)localObject1).setParameters((Camera.Parameters)localObject3);
    }
    catch (Exception localException2)
    {
      x.e("MicroMsg.Voip.CaptureRender", "SafeSetFps error:" + localException2.toString());
      break label190;
      localObject2 = j.oVo.oUd;
      break label233;
      i = 0;
      break label241;
    }
    x.i("MicroMsg.Voip.CaptureRender", "Camera Open Success, try set size: w,h:" + paramInt1 + "," + paramInt2);
    if (paramBoolean)
    {
      localObject1 = j.oVo.oUc;
      if (localObject1 == null) {
        break label790;
      }
      i = 1;
      localObject5 = null;
      if (localObject1 == null) {
        break label1298;
      }
      localObject3 = this.oTk;
      localObject3.getClass();
      localObject3 = new Camera.Size((Camera)localObject3, ((Point)localObject1).x, ((Point)localObject1).y);
      x.i("MicroMsg.Voip.CaptureRender", "getCameraSize from table:" + ((Camera.Size)localObject3).width + "," + ((Camera.Size)localObject3).height);
    }
    for (;;)
    {
      Camera localCamera;
      Point localPoint;
      Object localObject4;
      ((Camera.Parameters)localObject3).setPreviewFrameRate(i);
      break;
      label790:
      x.e("MicroMsg.Voip.CaptureRender", "getCameraResolution failed: %s", new Object[] { localException5.getMessage() });
    }
    label825:
    x.i("MicroMsg.Voip.CaptureRender", "2.no config size!");
    if (localObject2 != null)
    {
      x.i("MicroMsg.Voip.CaptureRender", "2.try support size alternatively! w" + ((Camera.Size)localObject2).width + ",h" + ((Camera.Size)localObject2).height);
      if (!a(this.oTk, ((Camera.Size)localObject2).width, ((Camera.Size)localObject2).height))
      {
        x.e("MicroMsg.Voip.CaptureRender", "2.try support size fail: w" + ((Camera.Size)localObject2).width + ",h" + ((Camera.Size)localObject2).height);
        return -1;
      }
    }
    label940:
    g(this.oTk);
    for (;;)
    {
      try
      {
        this.oTl = this.oTk.getParameters();
        this.oTm = this.oTl.getPreviewSize();
        paramInt2 = this.oTl.getPreviewFrameRate();
        this.oTn = j.oVt;
        if (this.oTn <= 0) {
          this.oTn = 7;
        }
      }
      catch (Exception localException3)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(159L, 0L, 1L, false);
        x.e("MicroMsg.Voip.CaptureRender", "try getParameters and getPreviewSize fail, error:%s", new Object[] { localException3.getMessage() });
        return -1;
      }
      try
      {
        localObject2 = this.oTk;
        localObject3 = new Camera.CameraInfo();
        if (!this.oTc) {
          break label1239;
        }
        paramInt1 = j.oVp;
        Camera.getCameraInfo(paramInt1, (Camera.CameraInfo)localObject3);
        i = ((WindowManager)ad.getContext().getSystemService("window")).getDefaultDisplay().getRotation();
        paramInt1 = 0;
        switch (i)
        {
        default: 
          if (!this.oTc) {
            break label1246;
          }
          paramInt1 = (360 - (paramInt1 + ((Camera.CameraInfo)localObject3).orientation) % 360) % 360;
          ((Camera)localObject2).setDisplayOrientation(paramInt1);
          this.oTA = paramInt1;
        }
      }
      catch (Exception localException4)
      {
        x.e("MicroMsg.Voip.CaptureRender", "setDisplayOrientation failed: %s", new Object[] { localException4.getMessage() });
        continue;
      }
      x.i("MicroMsg.Voip.CaptureRender", "Camera ok, fps: %d, mSize.width: %d, mSize.height: %d, format: %d, IsRotate180: %d, displayOrientation: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(this.oTm.width), Integer.valueOf(this.oTm.height), Integer.valueOf(this.oTn), Integer.valueOf(j.oVr), Integer.valueOf(this.oTA) });
      return 1;
      label1239:
      paramInt1 = j.oVq;
      continue;
      label1246:
      paramInt1 = (((Camera.CameraInfo)localObject3).orientation - paramInt1 + 360) % 360;
      continue;
      label1295:
      break label370;
      label1298:
      localObject3 = null;
      break;
      continue;
      paramInt1 = 0;
      continue;
      paramInt1 = 90;
      continue;
      paramInt1 = 180;
      continue;
      paramInt1 = 270;
    }
  }
  
  private boolean g(Camera paramCamera)
  {
    if (paramCamera == null) {
      return false;
    }
    Camera.Parameters localParameters;
    List localList;
    try
    {
      localParameters = paramCamera.getParameters();
      localList = localParameters.getSupportedFocusModes();
      if (localList == null) {
        break label307;
      }
      x.d("MicroMsg.Voip.CaptureRender", "supported focus modes size = " + localList.size());
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        x.d("MicroMsg.Voip.CaptureRender", "supported focus modes : " + str);
      }
      if (q.deM.ddo != 0) {
        break label227;
      }
    }
    catch (Exception paramCamera)
    {
      com.tencent.mm.plugin.report.service.h.mEJ.a(159L, 0L, 1L, false);
      x.e("MicroMsg.Voip.CaptureRender", "TrySetAutoFocus fail:" + paramCamera.toString());
      return false;
    }
    if (localList.contains("auto"))
    {
      x.d("MicroMsg.Voip.CaptureRender", "camera support auto focus");
      localParameters.setFocusMode("auto");
      this.oTp = false;
    }
    for (;;)
    {
      paramCamera.setParameters(localParameters);
      break;
      if (localList.contains("continuous-video"))
      {
        x.d("MicroMsg.Voip.CaptureRender", "camera support continuous video focus");
        localParameters.setFocusMode("continuous-video");
        this.oTp = true;
        continue;
        label227:
        if (q.deM.ddo == 1) {
          if (localList.contains("continuous-video"))
          {
            x.d("MicroMsg.Voip.CaptureRender", "camera support continuous video focus");
            localParameters.setFocusMode("continuous-video");
            this.oTp = true;
          }
          else if (localList.contains("auto"))
          {
            x.d("MicroMsg.Voip.CaptureRender", "camera support auto focus");
            localParameters.setFocusMode("auto");
            this.oTp = false;
          }
        }
      }
    }
    label307:
    return true;
  }
  
  private int h(Camera paramCamera)
  {
    if (paramCamera == null) {
      return 0;
    }
    for (;;)
    {
      try
      {
        localObject = paramCamera.getParameters().getSupportedPreviewSizes();
        if ((localObject == null) || (((List)localObject).size() == 0)) {
          continue;
        }
        localObject = ((List)localObject).iterator();
        i = 0;
      }
      catch (Exception paramCamera)
      {
        Object localObject;
        int i = 0;
        continue;
        i = 0;
        continue;
      }
      try
      {
        if (((Iterator)localObject).hasNext())
        {
          Camera.Size localSize = (Camera.Size)((Iterator)localObject).next();
          x.d("MicroMsg.Voip.CaptureRender", "support Size:" + localSize.width + "," + localSize.height);
          if (i == 0)
          {
            this.oTB = localSize.width;
            this.oTC = localSize.height;
          }
          i += 1;
        }
        else
        {
          try
          {
            paramCamera = paramCamera.getParameters().getSupportedPreviewFormats();
            if ((paramCamera == null) || (paramCamera.size() == 0)) {
              continue;
            }
            paramCamera = paramCamera.iterator();
            if (!paramCamera.hasNext()) {
              continue;
            }
            int j = ((Integer)paramCamera.next()).intValue();
            x.i("MicroMsg.Voip.CaptureRender", "support Format:" + j);
            continue;
            x.printErrStackTrace("MicroMsg.Voip.CaptureRender", paramCamera, "", new Object[0]);
          }
          catch (Exception paramCamera) {}
        }
      }
      catch (Exception paramCamera) {}
    }
    return i;
    return i;
  }
  
  private static void i(Camera paramCamera)
  {
    try
    {
      localList = paramCamera.getParameters().getSupportedPreviewFrameRates();
      paramCamera = "supportFps:";
      localCamera = paramCamera;
      if (localList != null)
      {
        int i = 0;
        for (;;)
        {
          localCamera = paramCamera;
          if (i >= localList.size()) {
            break;
          }
          int j = ((Integer)localList.get(i)).intValue();
          paramCamera = paramCamera + j + ",";
          i += 1;
        }
      }
    }
    catch (Exception paramCamera)
    {
      Camera localCamera;
      for (;;)
      {
        x.d("MicroMsg.Voip.CaptureRender", "getSupportedPreviewFrameRates:error:" + paramCamera.toString());
        List localList = null;
      }
      x.i("MicroMsg.Voip.CaptureRender", localCamera);
    }
  }
  
  private static Camera iV(boolean paramBoolean)
  {
    Object localObject = null;
    if (j.oVo.dcI <= 0) {}
    while (!j.oVu) {
      return null;
    }
    if (paramBoolean == true) {
      try
      {
        Camera localCamera1 = Camera.open(j.oVp);
        localObject = localCamera1;
        x.i("Camera", "Use front");
        return localCamera1;
      }
      catch (Exception localException)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(159L, 0L, 1L, false);
        com.tencent.mm.plugin.report.service.h.mEJ.a(159L, 1L, 1L, false);
        x.e("MicroMsg.Voip.CaptureRender", "openCameraByHighApiLvl:error:" + localException.toString());
        return (Camera)localObject;
      }
    }
    Camera localCamera2 = Camera.open(j.oVq);
    localObject = localCamera2;
    x.i("Camera", "Use back");
    return localCamera2;
  }
  
  private Camera iW(boolean paramBoolean)
  {
    Object localObject2 = iV(paramBoolean);
    Object localObject1 = localObject2;
    if (localObject2 == null) {}
    for (;;)
    {
      try
      {
        localObject1 = Camera.open();
      }
      catch (Exception localException1)
      {
        x.e("MicroMsg.Voip.CaptureRender", "OpenCameraError:" + localException1.toString());
        com.tencent.mm.plugin.report.service.h.mEJ.a(159L, 0L, 1L, false);
        com.tencent.mm.plugin.report.service.h.mEJ.a(159L, 1L, 1L, false);
        if (this.oTt != null) {
          this.oTt.bgV();
        }
        return null;
      }
      try
      {
        localObject2 = ((Camera)localObject1).getParameters();
        if (!paramBoolean) {
          break label130;
        }
        i = 2;
        ((Camera.Parameters)localObject2).set("camera-id", i);
        ((Camera)localObject1).setParameters((Camera.Parameters)localObject2);
      }
      catch (Exception localException2)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(159L, 0L, 1L, false);
        x.e("MicroMsg.Voip.CaptureRender", "set camera-id error:" + localException2.toString());
        continue;
      }
      this.oTc = paramBoolean;
      i((Camera)localObject1);
      h((Camera)localObject1);
      return (Camera)localObject1;
      label130:
      int i = 1;
    }
  }
  
  public final int a(g paramg, boolean paramBoolean)
  {
    if (j.oVo.dcI <= 0)
    {
      this.oTj = 1;
      return -1;
    }
    if (paramBoolean) {
      if (!j.oVo.oTY) {
        paramBoolean = false;
      }
    }
    for (;;)
    {
      this.oTt = paramg;
      if (e(paramBoolean, this.mWidth, this.mHeight) > 0) {
        break;
      }
      int i = e(paramBoolean, 0, 0);
      if (i > 0) {
        break;
      }
      this.oTj = 1;
      return i;
      if (!j.oVo.oTZ) {
        paramBoolean = true;
      }
    }
    bLW();
    this.oTj = 0;
    return 1;
  }
  
  public final void a(SurfaceHolder paramSurfaceHolder)
  {
    boolean bool1 = false;
    x.d("MicroMsg.Voip.CaptureRender", "surfaceChange");
    if ((!this.oTo) || (paramSurfaceHolder.getSurface() == null))
    {
      boolean bool2 = this.oTo;
      if (paramSurfaceHolder.getSurface() == null) {
        bool1 = true;
      }
      x.e("MicroMsg.Voip.CaptureRender", "surfaceChange failed, CameraOpen: %b, surface: %b", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
      return;
    }
    try
    {
      this.oTk.setPreviewCallback(null);
      this.oTk.stopPreview();
      this.oTk.setPreviewDisplay(paramSurfaceHolder);
      bLW();
      this.oTk.startPreview();
      if (this.oTv)
      {
        bLY();
        this.oTv = false;
      }
      i.bJI().yI(this.oTj);
      return;
    }
    catch (Exception paramSurfaceHolder)
    {
      for (;;)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(159L, 0L, 1L, false);
        com.tencent.mm.plugin.report.service.h.mEJ.a(159L, 2L, 1L, false);
        x.e("MicroMsg.Voip.CaptureRender", "surfaceChange failed" + paramSurfaceHolder.getMessage());
        this.oTj = 1;
      }
    }
  }
  
  public final void a(ObservableSurfaceView paramObservableSurfaceView)
  {
    if (paramObservableSurfaceView == null) {
      return;
    }
    this.oTr = paramObservableSurfaceView;
    this.oTr.setSurfaceChangeCallback(this);
    this.oTq = true;
  }
  
  public final void a(ObservableTextureView paramObservableTextureView)
  {
    x.d("MicroMsg.Voip.CaptureRender", "bindTextureView");
    if (paramObservableTextureView == null) {
      return;
    }
    this.oTs = paramObservableTextureView;
    this.oTs.setTextureChangeCallback(this);
    this.oTq = false;
  }
  
  public final void bLX()
  {
    if (j.oVo.dcI < 2)
    {
      x.e("MicroMsg.Voip.CaptureRender", "ExchangeCapture...gCameraNum= " + j.oVo.dcI);
      return;
    }
    x.i("MicroMsg.Voip.CaptureRender", "ExchangeCapture start, gCameraNum= " + j.oVo.dcI);
    bLZ();
    g localg = this.oTt;
    if (!this.oTc) {}
    for (boolean bool = true;; bool = false)
    {
      a(localg, bool);
      bLY();
      i.bJI().yI(this.oTj);
      this.oTz = true;
      return;
    }
  }
  
  /* Error */
  public final int bLY()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 98	com/tencent/mm/plugin/voip/video/a:oTo	Z
    //   4: ifne +18 -> 22
    //   7: ldc -106
    //   9: ldc_w 683
    //   12: invokestatic 262	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   15: aload_0
    //   16: iconst_1
    //   17: putfield 96	com/tencent/mm/plugin/voip/video/a:oTj	I
    //   20: iconst_m1
    //   21: ireturn
    //   22: aload_0
    //   23: getfield 106	com/tencent/mm/plugin/voip/video/a:oTu	Z
    //   26: ifeq +13 -> 39
    //   29: ldc -106
    //   31: ldc_w 685
    //   34: invokestatic 262	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   37: iconst_m1
    //   38: ireturn
    //   39: aload_0
    //   40: getfield 104	com/tencent/mm/plugin/voip/video/a:oTr	Lcom/tencent/mm/plugin/video/ObservableSurfaceView;
    //   43: ifnull +28 -> 71
    //   46: aload_0
    //   47: getfield 104	com/tencent/mm/plugin/voip/video/a:oTr	Lcom/tencent/mm/plugin/video/ObservableSurfaceView;
    //   50: invokevirtual 688	com/tencent/mm/plugin/video/ObservableSurfaceView:bIT	()Z
    //   53: ifne +18 -> 71
    //   56: ldc -106
    //   58: ldc_w 690
    //   61: invokestatic 492	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   64: aload_0
    //   65: iconst_1
    //   66: putfield 108	com/tencent/mm/plugin/voip/video/a:oTv	Z
    //   69: iconst_0
    //   70: ireturn
    //   71: ldc -106
    //   73: ldc_w 692
    //   76: iconst_1
    //   77: anewarray 4	java/lang/Object
    //   80: dup
    //   81: iconst_0
    //   82: aload_0
    //   83: getfield 102	com/tencent/mm/plugin/voip/video/a:oTq	Z
    //   86: invokestatic 629	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   89: aastore
    //   90: invokestatic 164	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   93: aload_0
    //   94: getfield 104	com/tencent/mm/plugin/voip/video/a:oTr	Lcom/tencent/mm/plugin/video/ObservableSurfaceView;
    //   97: ifnull +98 -> 195
    //   100: aload_0
    //   101: getfield 102	com/tencent/mm/plugin/voip/video/a:oTq	Z
    //   104: ifeq +91 -> 195
    //   107: aload_0
    //   108: getfield 292	com/tencent/mm/plugin/voip/video/a:oTk	Landroid/hardware/Camera;
    //   111: aload_0
    //   112: getfield 104	com/tencent/mm/plugin/voip/video/a:oTr	Lcom/tencent/mm/plugin/video/ObservableSurfaceView;
    //   115: invokevirtual 696	com/tencent/mm/plugin/video/ObservableSurfaceView:getSurfaceHolder	()Landroid/view/SurfaceHolder;
    //   118: invokevirtual 632	android/hardware/Camera:setPreviewDisplay	(Landroid/view/SurfaceHolder;)V
    //   121: aload_0
    //   122: getfield 292	com/tencent/mm/plugin/voip/video/a:oTk	Landroid/hardware/Camera;
    //   125: invokevirtual 635	android/hardware/Camera:startPreview	()V
    //   128: aload_0
    //   129: iconst_1
    //   130: putfield 106	com/tencent/mm/plugin/voip/video/a:oTu	Z
    //   133: iconst_1
    //   134: ireturn
    //   135: astore_1
    //   136: getstatic 251	com/tencent/mm/plugin/report/service/h:mEJ	Lcom/tencent/mm/plugin/report/service/h;
    //   139: ldc2_w 252
    //   142: lconst_0
    //   143: lconst_1
    //   144: iconst_0
    //   145: invokevirtual 256	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   148: getstatic 251	com/tencent/mm/plugin/report/service/h:mEJ	Lcom/tencent/mm/plugin/report/service/h;
    //   151: ldc2_w 252
    //   154: ldc2_w 650
    //   157: lconst_1
    //   158: iconst_0
    //   159: invokevirtual 256	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   162: aload_0
    //   163: iconst_1
    //   164: putfield 96	com/tencent/mm/plugin/voip/video/a:oTj	I
    //   167: ldc -106
    //   169: new 185	java/lang/StringBuilder
    //   172: dup
    //   173: ldc_w 698
    //   176: invokespecial 190	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   179: aload_1
    //   180: invokevirtual 259	java/lang/Exception:toString	()Ljava/lang/String;
    //   183: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   186: invokevirtual 197	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   189: invokestatic 262	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   192: goto -71 -> 121
    //   195: aload_0
    //   196: getfield 665	com/tencent/mm/plugin/voip/video/a:oTs	Lcom/tencent/mm/plugin/video/ObservableTextureView;
    //   199: ifnull -78 -> 121
    //   202: aload_0
    //   203: getfield 102	com/tencent/mm/plugin/voip/video/a:oTq	Z
    //   206: ifne -85 -> 121
    //   209: aload_0
    //   210: getfield 292	com/tencent/mm/plugin/voip/video/a:oTk	Landroid/hardware/Camera;
    //   213: aload_0
    //   214: getfield 665	com/tencent/mm/plugin/voip/video/a:oTs	Lcom/tencent/mm/plugin/video/ObservableTextureView;
    //   217: invokevirtual 702	com/tencent/mm/plugin/video/ObservableTextureView:getSurfaceTexture	()Landroid/graphics/SurfaceTexture;
    //   220: invokevirtual 706	android/hardware/Camera:setPreviewTexture	(Landroid/graphics/SurfaceTexture;)V
    //   223: goto -102 -> 121
    //   226: astore_1
    //   227: getstatic 251	com/tencent/mm/plugin/report/service/h:mEJ	Lcom/tencent/mm/plugin/report/service/h;
    //   230: ldc2_w 252
    //   233: lconst_0
    //   234: lconst_1
    //   235: iconst_0
    //   236: invokevirtual 256	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   239: getstatic 251	com/tencent/mm/plugin/report/service/h:mEJ	Lcom/tencent/mm/plugin/report/service/h;
    //   242: ldc2_w 252
    //   245: ldc2_w 650
    //   248: lconst_1
    //   249: iconst_0
    //   250: invokevirtual 256	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   253: aload_0
    //   254: iconst_1
    //   255: putfield 96	com/tencent/mm/plugin/voip/video/a:oTj	I
    //   258: ldc -106
    //   260: new 185	java/lang/StringBuilder
    //   263: dup
    //   264: ldc_w 698
    //   267: invokespecial 190	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   270: aload_1
    //   271: invokevirtual 259	java/lang/Exception:toString	()Ljava/lang/String;
    //   274: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   277: invokevirtual 197	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   280: invokestatic 262	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   283: goto -162 -> 121
    //   286: astore_1
    //   287: getstatic 251	com/tencent/mm/plugin/report/service/h:mEJ	Lcom/tencent/mm/plugin/report/service/h;
    //   290: ldc2_w 252
    //   293: lconst_0
    //   294: lconst_1
    //   295: iconst_0
    //   296: invokevirtual 256	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   299: getstatic 251	com/tencent/mm/plugin/report/service/h:mEJ	Lcom/tencent/mm/plugin/report/service/h;
    //   302: ldc2_w 252
    //   305: ldc2_w 650
    //   308: lconst_1
    //   309: iconst_0
    //   310: invokevirtual 256	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   313: aload_0
    //   314: iconst_1
    //   315: putfield 96	com/tencent/mm/plugin/voip/video/a:oTj	I
    //   318: aload_0
    //   319: getfield 396	com/tencent/mm/plugin/voip/video/a:oTt	Lcom/tencent/mm/plugin/voip/video/g;
    //   322: ifnull +12 -> 334
    //   325: aload_0
    //   326: getfield 396	com/tencent/mm/plugin/voip/video/a:oTt	Lcom/tencent/mm/plugin/voip/video/g;
    //   329: invokeinterface 401 1 0
    //   334: ldc -106
    //   336: new 185	java/lang/StringBuilder
    //   339: dup
    //   340: ldc_w 708
    //   343: invokespecial 190	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   346: aload_1
    //   347: invokevirtual 259	java/lang/Exception:toString	()Ljava/lang/String;
    //   350: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   353: invokevirtual 197	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   356: invokestatic 262	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   359: goto -231 -> 128
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	362	0	this	a
    //   135	45	1	localException1	Exception
    //   226	45	1	localException2	Exception
    //   286	61	1	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   107	121	135	java/lang/Exception
    //   209	223	226	java/lang/Exception
    //   121	128	286	java/lang/Exception
  }
  
  public final void bLZ()
  {
    x.d("MicroMsg.Voip.CaptureRender", "StopCapture....mIsInCapture = " + this.oTu);
    if (this.oTu)
    {
      this.oTv = false;
      this.oTk.setPreviewCallback(null);
    }
    try
    {
      this.oTk.stopPreview();
      this.oTu = false;
      if (1 == this.oTj)
      {
        lr locallr = new lr();
        locallr.bWf.type = 2;
        com.tencent.mm.sdk.b.a.sFg.m(locallr);
      }
      x.d("MicroMsg.Voip.CaptureRender", "UnInitCapture....mCameraOpen = " + this.oTo);
      if (this.oTo)
      {
        this.oTj = 0;
        this.oTv = false;
        this.oTk.setPreviewCallback(null);
        this.oTk.release();
        this.oTk = null;
        this.oTo = false;
        this.oTw = null;
        if (this.oTy != null) {
          this.oTy.clear();
        }
        this.oTy = null;
        this.oTp = false;
        return;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.e("MicroMsg.Voip.CaptureRender", "stopPreview:error" + localException.toString());
        continue;
        if (this.oTk != null)
        {
          this.oTk.release();
          this.oTk = null;
          this.oTo = false;
        }
      }
    }
  }
  
  public final boolean bMb()
  {
    return this.oTc;
  }
  
  public final boolean bMc()
  {
    return this.oTd;
  }
  
  public final int bMd()
  {
    return this.oTj;
  }
  
  public final void bMe()
  {
    try
    {
      Camera.Size localSize;
      com.tencent.mm.plugin.voip_cs.b.c localc;
      if (this.oTl != null)
      {
        localSize = this.oTl.getPreviewSize();
        localc = com.tencent.mm.plugin.voip_cs.b.b.bMx();
        if (!this.oTo) {
          break label104;
        }
      }
      label104:
      for (int i = 1;; i = 0)
      {
        this.oTl.getPreviewFrameRate();
        int j = this.oTB;
        int k = this.oTC;
        int m = localSize.width;
        int n = localSize.height;
        x.d("MicroMsg.VoipCSReportHelper", "setCameraInfo");
        localc.oWC = i;
        localc.oWy = j;
        localc.oWz = k;
        localc.oWA = m;
        localc.oWB = n;
        return;
      }
      return;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.Voip.CaptureRender", "getCameraDataForVoipCS failed" + localException.getMessage());
    }
  }
  
  public final void d(SurfaceTexture paramSurfaceTexture)
  {
    boolean bool1 = false;
    x.d("MicroMsg.Voip.CaptureRender", "onSurfaceTextureAvailable");
    if ((!this.oTo) || (paramSurfaceTexture == null))
    {
      boolean bool2 = this.oTo;
      if (paramSurfaceTexture == null) {
        bool1 = true;
      }
      x.e("MicroMsg.Voip.CaptureRender", "onSurfaceTextureAvailable failed, CameraOpen: %b, surface: %b", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
      return;
    }
    try
    {
      this.oTk.setPreviewCallback(null);
      this.oTk.stopPreview();
      this.oTk.setPreviewTexture(paramSurfaceTexture);
      bLW();
      this.oTk.startPreview();
      if (this.oTv)
      {
        bLY();
        this.oTv = false;
      }
      i.bJI().yI(this.oTj);
      return;
    }
    catch (Exception paramSurfaceTexture)
    {
      for (;;)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(159L, 0L, 1L, false);
        com.tencent.mm.plugin.report.service.h.mEJ.a(159L, 2L, 1L, false);
        x.e("MicroMsg.Voip.CaptureRender", "surfaceChange failed" + paramSurfaceTexture.getMessage());
        this.oTj = 1;
      }
    }
  }
  
  @TargetApi(14)
  public final void o(int[] paramArrayOfInt)
  {
    boolean bool3 = true;
    label20:
    label75:
    label119:
    label305:
    label307:
    label313:
    int i;
    label333:
    Object localObject;
    int j;
    int k;
    int m;
    label463:
    int n;
    int i1;
    if ((q.deM.ddo == 1) && (this.oTp))
    {
      return;
    }
    else
    {
      if (q.deM.ddn > 2000) {
        this.oTi = q.deM.ddn;
      }
      if (paramArrayOfInt == null)
      {
        x.e("MicroMsg.Voip.CaptureRender", "focusOnFace error, faceLocation is null");
        boolean bool2;
        if (System.currentTimeMillis() - this.oTh > this.oTi)
        {
          bool1 = true;
          if ((this.oTe) && (!bool1) && (this.oTf == this.oTc)) {
            break label305;
          }
          paramArrayOfInt = new StringBuilder("now i need autoFocus! and !mIsCameraNoParamAutoFocus: ");
          if (this.oTe) {
            break label307;
          }
          bool2 = true;
          paramArrayOfInt = paramArrayOfInt.append(bool2).append(",isAutoFocusTimeout: ").append(bool1).append(",mAutoFocusTimeOut:").append(this.oTi).append(",mIsLastAutoFocusFaceCamera != mIsCurrentFaceCamera :");
          if (this.oTf == this.oTc) {
            break label313;
          }
        }
        for (boolean bool1 = bool3;; bool1 = false)
        {
          x.i("MicroMsg.Voip.CaptureRender", bool1 + ",isClickScreen :false");
          try
          {
            if ((this.oTk == null) || (this.oTk.getParameters() == null) || (this.oTk.getParameters().getFocusMode() == null) || (!this.oTk.getParameters().getFocusMode().equals("auto"))) {
              break;
            }
            this.oTk.autoFocus(null);
            this.oTx = null;
            this.oTh = System.currentTimeMillis();
            this.oTe = true;
            this.oTf = this.oTc;
            return;
          }
          catch (Exception paramArrayOfInt)
          {
            x.e("MicroMsg.Voip.CaptureRender", "mCamera.getParameters() or autoFocus fail!" + paramArrayOfInt.toString());
            return;
          }
          bool1 = false;
          break label75;
          break;
          bool2 = false;
          break label119;
        }
      }
      if (this.oTx != null) {
        break label774;
      }
      this.oTx = paramArrayOfInt;
      i = 1;
      localObject = this.oTx;
      j = Math.abs(localObject[0] - paramArrayOfInt[0]);
      k = Math.abs(localObject[1] - paramArrayOfInt[1]);
      m = Math.abs(localObject[2] - paramArrayOfInt[2]);
      k = Math.abs(localObject[3] - paramArrayOfInt[3]) + (j + k + m);
      x.d("MicroMsg.Voip.CaptureRender", "face location diff:%d", new Object[] { Integer.valueOf(k) });
      if (k <= oTb)
      {
        j = i;
        if (k <= oTa) {
          break label763;
        }
      }
      this.oTx = paramArrayOfInt;
      if (k > oTb) {
        i = 1;
      }
      j = i;
      if (k <= oTa) {
        break label763;
      }
      j = 1;
      if ((i == 0) && (j == 0)) {
        break label772;
      }
      k = this.oTx[0];
      m = this.oTx[1];
      n = this.oTx[2];
      i1 = this.oTx[3];
    }
    for (;;)
    {
      try
      {
        paramArrayOfInt = new Rect(k, m, n, i1);
        localObject = this.oTk.getParameters();
        k = j;
        if (j != 0)
        {
          if ((!d.fR(14)) || (((Camera.Parameters)localObject).getMaxNumMeteringAreas() <= 0)) {
            break label736;
          }
          localArrayList = new ArrayList();
          localArrayList.add(new Camera.Area(paramArrayOfInt, 1000));
          ((Camera.Parameters)localObject).setMeteringAreas(localArrayList);
          k = j;
        }
        j = i;
        if (i == 0) {
          break label779;
        }
        if ((!d.fR(14)) || (((Camera.Parameters)localObject).getMaxNumFocusAreas() <= 0)) {
          break label750;
        }
        ArrayList localArrayList = new ArrayList();
        localArrayList.add(new Camera.Area(paramArrayOfInt, 1000));
        ((Camera.Parameters)localObject).setFocusAreas(localArrayList);
        j = i;
      }
      catch (Exception paramArrayOfInt)
      {
        x.e("MicroMsg.Voip.CaptureRender", "focusOnFace exception:%s", new Object[] { paramArrayOfInt.getMessage() });
        return;
      }
      this.oTk.setParameters((Camera.Parameters)localObject);
      if (j == 0) {
        break label20;
      }
      x.d("MicroMsg.Voip.CaptureRender", "refocus, mIsFocusOnFace:%b", new Object[] { Boolean.valueOf(this.oTz) });
      if (!this.oTz) {
        break label20;
      }
      this.oTe = false;
      this.oTz = false;
      this.oTk.autoFocus(new a.1(this));
      return;
      label736:
      x.d("MicroMsg.Voip.CaptureRender", "camera not support metering area");
      k = 0;
      continue;
      label750:
      x.d("MicroMsg.Voip.CaptureRender", "camera not support area focus");
      j = 0;
      break label779;
      label763:
      k = 0;
      i = j;
      j = k;
      break label463;
      label772:
      break label20;
      label774:
      i = 0;
      break label333;
      label779:
      if (j == 0) {
        if (k == 0) {
          break;
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/voip/video/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */