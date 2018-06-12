package com.tencent.mm.pluginsdk.i;

import android.annotation.TargetApi;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build.VERSION;
import android.view.SurfaceHolder;
import com.tencent.mm.compatible.e.c;
import com.tencent.mm.compatible.e.d.a.a;
import com.tencent.mm.compatible.e.h;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class f
  implements SensorEventListener
{
  static int lfv = 0;
  SensorManager bgR;
  public Camera ddt = null;
  private float lfA = 0.0F;
  private float lfB = 0.0F;
  private boolean lfu = false;
  d.a.a lfx;
  Sensor lfy;
  private float lfz = 0.0F;
  private Camera.PreviewCallback ngt = null;
  private SurfaceHolder oyi = null;
  a qEb;
  public List<Integer> qEc = new ArrayList();
  private boolean qEd = true;
  private boolean qEe = true;
  private Camera.AutoFocusCallback qEf = new f.1(this);
  
  @TargetApi(9)
  private static void e(Camera.Parameters paramParameters)
  {
    if (q.deM.dcY > 0) {}
    List localList;
    do
    {
      do
      {
        return;
      } while (Build.VERSION.SDK_INT < 9);
      localList = paramParameters.getSupportedPreviewFpsRange();
    } while ((localList == null) || (localList.size() == 0));
    int i1 = localList.size();
    int k = 0;
    int j = Integer.MIN_VALUE;
    int i = Integer.MIN_VALUE;
    label56:
    if (k < i1)
    {
      int[] arrayOfInt = (int[])localList.get(k);
      if ((arrayOfInt == null) || (arrayOfInt.length <= 1)) {
        break label222;
      }
      int n = arrayOfInt[0];
      int m = arrayOfInt[1];
      x.d("MicroMsg.YuvReocrder", "dkfps %d:[%d %d]", new Object[] { Integer.valueOf(k), Integer.valueOf(n), Integer.valueOf(m) });
      if ((n < 0) || (m < n) || (m < j)) {
        break label222;
      }
      i = n;
      j = m;
    }
    label222:
    for (;;)
    {
      k += 1;
      break label56;
      x.d("MicroMsg.YuvReocrder", "dkfps get fit  [%d %d]", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      if ((i == Integer.MAX_VALUE) || (j == Integer.MAX_VALUE)) {
        break;
      }
      try
      {
        paramParameters.setPreviewFpsRange(i, j);
        return;
      }
      catch (Exception paramParameters)
      {
        x.printErrStackTrace("MicroMsg.YuvReocrder", paramParameters, "", new Object[0]);
        return;
      }
    }
  }
  
  public static int getCameraId()
  {
    return lfv;
  }
  
  public final int b(SurfaceHolder paramSurfaceHolder)
  {
    if (this.lfu) {
      return 0;
    }
    if (paramSurfaceHolder == null) {
      return 0 - com.tencent.mm.compatible.util.g.getLine();
    }
    for (;;)
    {
      Object localObject;
      int k;
      int i;
      try
      {
        this.oyi = paramSurfaceHolder;
        localParameters = this.ddt.getParameters();
        locala = this.qEb;
        x.d("MicroMsg.YuvReocrder", "getFitRecordSize");
        j = Integer.MAX_VALUE;
        if (Build.VERSION.SDK_INT < 11) {
          break label685;
        }
        new h();
        localObject = localParameters.getSupportedVideoSizes();
        if (localObject != null) {
          break label663;
        }
        x.d("MicroMsg.YuvReocrder", "getFitRecordSize getSupportedVideoSizes null, use getSupportedPreviewSizes instead");
        new com.tencent.mm.compatible.e.g();
        localObject = localParameters.getSupportedPreviewSizes();
      }
      catch (Exception paramSurfaceHolder)
      {
        Camera.Parameters localParameters;
        a locala;
        int j;
        int n;
        int i1;
        int m;
        x.printErrStackTrace("MicroMsg.YuvReocrder", paramSurfaceHolder, "", new Object[0]);
        x.e("MicroMsg.YuvReocrder", "Start preview FAILED :" + paramSurfaceHolder.getMessage());
        return 0 - com.tencent.mm.compatible.util.g.getLine();
      }
      if (k < ((List)localObject).size())
      {
        n = ((Camera.Size)((List)localObject).get(k)).height;
        i1 = ((Camera.Size)((List)localObject).get(k)).width;
        x.d("MicroMsg.YuvReocrder", "supp w:" + i1 + " h:" + n);
        m = n * i1;
        if (((locala.bYE != 0) && (locala.bYE != 180)) || (((n >= locala.lgR) && (i1 >= locala.lgS)) || (((locala.bYE == 90) || (locala.bYE == 270)) && (i1 >= locala.lgR) && (n >= locala.lgS) && (m < j))))
        {
          locala.iSp = i1;
          locala.iSq = n;
          i = 1;
          j = m;
          break label676;
        }
      }
      else
      {
        if (i == 0)
        {
          localObject = localParameters.getPreviewSize();
          locala.iSq = ((Camera.Size)localObject).height;
          locala.iSp = ((Camera.Size)localObject).width;
        }
        x.d("MicroMsg.YuvReocrder", " rotate:" + locala.bYE + " w:" + locala.iSp + " h:" + locala.iSq);
        localParameters.setPreviewSize(this.qEb.iSp, this.qEb.iSq);
        e(localParameters);
        localObject = localParameters.getSupportedPreviewFrameRates();
        this.qEc.clear();
        this.qEc.addAll((Collection)localObject);
        localParameters.setPreviewFormat(17);
        localObject = localParameters.getSupportedFocusModes();
        if (localObject != null)
        {
          if ((d.fT(9)) && (true == ((List)localObject).contains("continuous-video")))
          {
            x.i("MicroMsg.YuvReocrder", "support continous-video");
            this.qEd = false;
            localParameters.setFocusMode("continuous-video");
          }
        }
        else
        {
          this.ddt.setParameters(localParameters);
          this.ddt.setPreviewDisplay(paramSurfaceHolder);
          this.ddt.startPreview();
          if ((this.bgR != null) && (this.lfy != null) && (this.qEd)) {
            this.bgR.registerListener(this, this.lfy, 2);
          }
          this.lfu = true;
          return 0;
          localObject = localParameters.getPreviewSize();
          locala.iSq = ((Camera.Size)localObject).height;
          locala.iSp = ((Camera.Size)localObject).width;
          continue;
        }
        if (((List)localObject).contains("auto")) {
          continue;
        }
        x.i("MicroMsg.YuvReocrder", "don't support auto");
        this.qEd = false;
        continue;
      }
      label663:
      if (localObject != null)
      {
        k = 0;
        i = 0;
        continue;
        label676:
        k += 1;
        continue;
        label685:
        localObject = null;
      }
    }
  }
  
  public final void bdL()
  {
    if ((this.bgR != null) && (this.lfy != null)) {
      this.bgR.unregisterListener(this);
    }
    if (this.ddt != null)
    {
      x.d("MicroMsg.YuvReocrder", "release camera");
      this.ddt.setPreviewCallback(null);
      this.ddt.stopPreview();
      this.ddt.release();
      this.ddt = null;
      this.lfu = false;
    }
  }
  
  public final void onAccuracyChanged(Sensor paramSensor, int paramInt) {}
  
  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    float f1 = paramSensorEvent.values[0];
    float f2 = paramSensorEvent.values[1];
    float f3 = paramSensorEvent.values[2];
    if (((Math.abs(this.lfz - f1) > 2.0F) || (Math.abs(this.lfA - f2) > 2.0F) || (Math.abs(this.lfB - f3) > 2.0F)) && (this.ddt != null) && (this.qEe) && (true == this.qEd)) {}
    try
    {
      x.d("MicroMsg.YuvReocrder", "auto focus");
      this.ddt.autoFocus(this.qEf);
      this.qEe = false;
      this.lfz = f1;
      this.lfA = f2;
      this.lfB = f3;
      return;
    }
    catch (Exception paramSensorEvent)
    {
      for (;;)
      {
        x.d("MicroMsg.YuvReocrder", "auto focus failed");
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/pluginsdk/i/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */