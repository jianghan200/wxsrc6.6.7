package com.tencent.mm.plugin.facedetect.model;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import com.tencent.mm.compatible.e.d;
import com.tencent.mm.compatible.e.d.a.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class m
{
  private Context context;
  public Camera ddt;
  public boolean iOl = false;
  public Point iOm = null;
  public Point iOn = null;
  private Point iOo = null;
  private boolean iOp;
  public int iOq;
  private boolean iOr = false;
  private boolean iOs = true;
  public boolean iOt = false;
  public Point iOu = null;
  
  public m(Context paramContext)
  {
    this.context = paramContext;
  }
  
  private static Point a(Camera.Parameters paramParameters, Point paramPoint)
  {
    Object localObject = new ArrayList(paramParameters.getSupportedPreviewSizes());
    Collections.sort((List)localObject, new a((byte)0));
    Point localPoint = null;
    float f3 = paramPoint.x / paramPoint.y;
    x.d("MicroMsg.FaceScanCamera", "screen.x: %d, screen.y: %d, ratio: %f", new Object[] { Integer.valueOf(paramPoint.x), Integer.valueOf(paramPoint.y), Float.valueOf(f3) });
    long l = bi.fQ(ad.getContext());
    x.d("MicroMsg.FaceScanCamera", "systemAvailableMemInMB: %d", new Object[] { Long.valueOf(l) });
    int i = paramPoint.x;
    i = paramPoint.y;
    float f1 = Float.POSITIVE_INFINITY;
    localObject = ((List)localObject).iterator();
    int j;
    label235:
    label342:
    label349:
    label356:
    float f2;
    while (((Iterator)localObject).hasNext())
    {
      Camera.Size localSize = (Camera.Size)((Iterator)localObject).next();
      i = localSize.width;
      j = localSize.height;
      x.i("MicroMsg.FaceScanCamera", "realWidth: %d, realHeight: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      int k = i * j;
      if ((k >= 150400) && (k <= 983040))
      {
        if (i > j)
        {
          m = 1;
          if (m == 0) {
            break label342;
          }
          k = j;
          if (m == 0) {
            break label349;
          }
        }
        for (int m = i;; m = j)
        {
          x.d("MicroMsg.FaceScanCamera", "maybeFlippedWidth: %d, maybeFlippedHeight: %d", new Object[] { Integer.valueOf(k), Integer.valueOf(m) });
          if ((k != paramPoint.x) || (m != paramPoint.y) || (!f(k, m, l))) {
            break label356;
          }
          paramParameters = new Point(i, j);
          x.i("MicroMsg.FaceScanCamera", "Found preview size exactly matching screen size: " + paramParameters);
          return paramParameters;
          m = 0;
          break;
          k = i;
          break label235;
        }
        f2 = Math.abs(k / m - f3);
        if ((f2 >= f1) || (!f(i, j, l))) {
          break label537;
        }
        localPoint = new Point(i, j);
        f1 = f2;
      }
    }
    label524:
    label537:
    for (;;)
    {
      x.i("MicroMsg.FaceScanCamera", "diff:[%s] newdiff:[%s] w:[%s] h:[%s]", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(j) });
      break;
      paramPoint = localPoint;
      if (localPoint == null)
      {
        paramParameters = paramParameters.getPreviewSize();
        if (paramParameters == null) {
          break label524;
        }
        paramPoint = new Point(paramParameters.width, paramParameters.height);
        x.i("MicroMsg.FaceScanCamera", "No suitable preview sizes, using default: " + paramPoint);
      }
      for (;;)
      {
        x.i("MicroMsg.FaceScanCamera", "Found best approximate preview size: " + paramPoint);
        return paramPoint;
        x.e("MicroMsg.FaceScanCamera", "hy: can not find default size!!");
        paramPoint = localPoint;
      }
    }
  }
  
  private static boolean f(int paramInt1, int paramInt2, long paramLong)
  {
    double d = paramInt1 * paramInt2 * 3.0D / 2.0D / 1024.0D / 1024.0D;
    x.d("MicroMsg.FaceScanCamera", "dataSizeInMB: %f, availableMemInMb: %d", new Object[] { Double.valueOf(d), Long.valueOf(paramLong) });
    return paramLong / d >= 5.0D;
  }
  
  public final void e(SurfaceTexture paramSurfaceTexture)
  {
    if (this.iOl)
    {
      x.w("MicroMsg.FaceScanCamera", "in open(), previewing");
      release();
    }
    this.iOs = true;
    int j = Camera.getNumberOfCameras();
    int i = 0;
    Object localObject;
    if (i < j)
    {
      localObject = new Camera.CameraInfo();
      Camera.getCameraInfo(i, (Camera.CameraInfo)localObject);
      if ((((Camera.CameraInfo)localObject).facing == 1) && (this.iOs)) {
        x.d("MicroMsg.FaceScanCamera", "hy: front Camera found");
      }
    }
    for (;;)
    {
      long l = bi.VG();
      localObject = d.s(this.context, i);
      if (localObject == null)
      {
        x.e("MicroMsg.FaceScanCamera", "in open(), openCameraRes == null");
        throw new IOException();
        if ((((Camera.CameraInfo)localObject).facing == 0) && (!this.iOs))
        {
          x.d("MicroMsg.FaceScanCamera", "hy: front Camera found");
          continue;
        }
        i += 1;
        break;
      }
      this.iOt = true;
      x.d("MicroMsg.FaceScanCamera", "openCamera done, cameraId=[%s] costTime=[%s]", new Object[] { Integer.valueOf(i), Long.valueOf(bi.bI(l)) });
      this.iOq = ((d.a.a)localObject).bYE;
      if (((d.a.a)localObject).bYE % 180 != 0) {}
      for (boolean bool = true;; bool = false)
      {
        this.iOp = bool;
        this.ddt = ((d.a.a)localObject).ddt;
        if (this.ddt != null) {
          break;
        }
        x.e("MicroMsg.FaceScanCamera", "in open(), camera == null, bNeedRotate=[%s]", new Object[] { Boolean.valueOf(this.iOp) });
        throw new IOException();
      }
      this.ddt.setPreviewTexture(paramSurfaceTexture);
      Camera.Parameters localParameters = this.ddt.getParameters();
      Point localPoint2 = this.iOn;
      Point localPoint1 = this.iOo;
      localObject = localParameters.get("preview-size-values");
      if (localObject == null) {
        localObject = localParameters.get("preview-size-value");
      }
      for (;;)
      {
        paramSurfaceTexture = null;
        if (localObject != null)
        {
          x.d("MicroMsg.FaceScanCamera", "preview-size-values parameter: " + (String)localObject);
          paramSurfaceTexture = a(localParameters, localPoint2);
        }
        localObject = paramSurfaceTexture;
        if (paramSurfaceTexture == null) {
          localObject = new Point(localPoint1.x >> 3 << 3, localPoint1.y >> 3 << 3);
        }
        this.iOm = ((Point)localObject);
        this.iOu = new Point(this.iOm);
        x.d("MicroMsg.FaceScanCamera", "getCameraResolution: " + this.iOn + " camera:" + this.iOm + "bestVideoEncodeSize: " + this.iOu);
        localParameters.setPreviewSize(this.iOm.x, this.iOm.y);
        localParameters.setZoom(0);
        localParameters.setSceneMode("auto");
        try
        {
          if ((localParameters.getSupportedFocusModes() != null) && (localParameters.getSupportedFocusModes().contains("auto")))
          {
            x.i("MicroMsg.FaceScanCamera", "set FocusMode to FOCUS_MODE_AUTO");
            localParameters.setFocusMode("auto");
          }
          for (;;)
          {
            paramSurfaceTexture = localParameters.getSupportedPreviewFormats();
            localObject = paramSurfaceTexture.iterator();
            i = 0;
            if (!((Iterator)localObject).hasNext()) {
              break label747;
            }
            j = ((Integer)((Iterator)localObject).next()).intValue();
            x.d("MicroMsg.FaceScanCamera", "supportedPreviewFormat: " + j);
            if (j != 17) {
              break;
            }
            j = 1;
            label598:
            if (j == 0) {
              break label681;
            }
            localParameters.setPreviewFormat(17);
            label609:
            if (this.iOp) {
              localParameters.setRotation(this.iOq);
            }
            this.ddt.setParameters(localParameters);
            return;
            x.i("MicroMsg.FaceScanCamera", "camera not support FOCUS_MODE_AUTO");
          }
        }
        catch (Exception paramSurfaceTexture)
        {
          for (;;)
          {
            x.e("MicroMsg.FaceScanCamera", "set focus mode error: %s", new Object[] { paramSurfaceTexture.getMessage() });
          }
          if (j == 842094169) {
            i = 1;
          }
          for (;;)
          {
            break;
            label681:
            if (i != 0)
            {
              x.e("MicroMsg.FaceScanCamera", "Preview not support PixelFormat.YCbCr_420_SP, but hasYU12");
              localParameters.setPreviewFormat(842094169);
              break label609;
            }
            x.e("MicroMsg.FaceScanCamera", "Preview not support PixelFormat.YCbCr_420_SP. Use format: %s", new Object[] { paramSurfaceTexture.get(0) });
            localParameters.setPreviewFormat(((Integer)paramSurfaceTexture.get(0)).intValue());
            break label609;
            label747:
            j = 0;
            break label598;
          }
        }
      }
      i = -1;
    }
  }
  
  public final int getPreviewHeight()
  {
    x.v("MicroMsg.FaceScanCamera", "hy: preview height: %d", new Object[] { Integer.valueOf(this.iOm.y) });
    return this.iOm.y;
  }
  
  public final int getPreviewWidth()
  {
    x.v("MicroMsg.FaceScanCamera", "hy: preview width: %d", new Object[] { Integer.valueOf(this.iOm.x) });
    return this.iOm.x;
  }
  
  public final void release()
  {
    x.d("MicroMsg.FaceScanCamera", "release(), previewing = [%s]", new Object[] { Boolean.valueOf(this.iOl) });
    if (this.ddt != null)
    {
      long l = bi.VG();
      if (this.iOl)
      {
        this.ddt.setPreviewCallback(null);
        this.ddt.stopPreview();
        this.iOl = false;
        x.d("MicroMsg.FaceScanCamera", "stopPreview costTime=[%s]", new Object[] { Long.valueOf(bi.bI(l)) });
      }
      l = bi.VG();
      this.ddt.release();
      this.ddt = null;
      this.iOt = false;
      x.d("MicroMsg.FaceScanCamera", "camera.release() costTime=[%s]", new Object[] { Long.valueOf(bi.bI(l)) });
    }
    this.iOr = false;
  }
  
  public final void setPreviewCallback(final Camera.PreviewCallback paramPreviewCallback)
  {
    if (this.ddt == null)
    {
      x.w("MicroMsg.FaceScanCamera", "hy: camera is null. setPreviewCallback failed");
      return;
    }
    int i = getPreviewWidth() * getPreviewHeight() * ImageFormat.getBitsPerPixel(this.ddt.getParameters().getPreviewFormat()) / 8;
    byte[] arrayOfByte = c.iNi.i(Integer.valueOf(i));
    this.ddt.addCallbackBuffer(arrayOfByte);
    this.ddt.setPreviewCallbackWithBuffer(new Camera.PreviewCallback()
    {
      public final void onPreviewFrame(byte[] paramAnonymousArrayOfByte, Camera paramAnonymousCamera)
      {
        if (paramPreviewCallback != null) {
          paramPreviewCallback.onPreviewFrame(paramAnonymousArrayOfByte, paramAnonymousCamera);
        }
        paramAnonymousCamera.addCallbackBuffer(paramAnonymousArrayOfByte);
      }
    });
  }
  
  private static final class a
    implements Comparator<Camera.Size>
  {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/facedetect/model/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */