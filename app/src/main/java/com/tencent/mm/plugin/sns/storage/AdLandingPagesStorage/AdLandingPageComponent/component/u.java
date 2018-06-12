package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONException;
import org.json.JSONObject;

public final class u
  extends i
  implements SensorEventListener
{
  ImageView bOA;
  private SensorManager bgR;
  Sensor bkA;
  Sensor bkC;
  ProgressBar eVR;
  int nFm;
  final float nFn = 10.0F;
  final int nFo = 1;
  HorizontalScrollView nFp;
  float[] nFq;
  float[] nFr;
  private int nFs = 0;
  boolean nFt = true;
  
  public u(Context paramContext, o paramo, ViewGroup paramViewGroup)
  {
    super(paramContext, paramo, paramViewGroup);
  }
  
  public final boolean aa(JSONObject paramJSONObject)
  {
    if (!super.aa(paramJSONObject)) {
      return false;
    }
    try
    {
      paramJSONObject.put("swipeCount", this.nFs);
      if (!this.nFt)
      {
        String str = ac.ce(((o)this.nDt).nAL);
        JSONObject localJSONObject = new JSONObject();
        localJSONObject.put("urlMd5", str);
        localJSONObject.put("needDownload", 1);
        paramJSONObject.put("imgUrlInfo", localJSONObject);
      }
      return true;
    }
    catch (JSONException paramJSONObject)
    {
      x.printErrStackTrace("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", paramJSONObject, "", new Object[0]);
    }
    return false;
  }
  
  public final void bzA()
  {
    super.bzA();
    this.bgR.registerListener(this, this.bkA, 1);
    this.bgR.registerListener(this, this.bkC, 1);
  }
  
  public final void bzB()
  {
    super.bzB();
    this.bgR.unregisterListener(this);
  }
  
  public final View bzM()
  {
    View localView = this.contentView;
    this.bgR = ((SensorManager)this.context.getSystemService("sensor"));
    this.bkA = this.bgR.getDefaultSensor(1);
    this.bkC = this.bgR.getDefaultSensor(2);
    this.nFp = ((HorizontalScrollView)localView.findViewById(i.f.activity_gyroscope_horizontalscrollview));
    this.bOA = ((ImageView)localView.findViewById(i.f.activity_gyroscope_img));
    this.eVR = ((ProgressBar)localView.findViewById(i.f.progressbar));
    this.eVR.setVisibility(8);
    return localView;
  }
  
  protected final void bzQ()
  {
    if (!e.cn(d.eH("adId", ((o)this.nDt).nAL))) {
      this.nFt = false;
    }
    this.nFp.setLayoutParams(new RelativeLayout.LayoutParams(this.hmV, this.hmW));
    this.bOA.setLayoutParams(new RelativeLayout.LayoutParams(this.hmV, this.hmW));
    this.contentView.setLayoutParams(new LinearLayout.LayoutParams(this.hmV, this.hmW));
    this.contentView.setPadding(this.contentView.getPaddingLeft(), (int)((o)this.nDt).nAY, this.contentView.getPaddingRight(), (int)((o)this.nDt).nAZ);
    String str = ((o)this.nDt).nAL;
    Bitmap localBitmap = d.eK("adId", str);
    if (localBitmap != null)
    {
      x.i("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", "loaded cached image with  " + str);
      setImage(localBitmap);
      return;
    }
    startLoading();
    d.a(str, ((o)this.nDt).nAX, new u.1(this));
  }
  
  protected final int getLayout()
  {
    return i.g.sns_ad_native_landing_pages_gyroscope_image_view;
  }
  
  public final void onAccuracyChanged(Sensor paramSensor, int paramInt) {}
  
  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    float f2 = -10.0F;
    if (paramSensorEvent.sensor.getType() == 1) {
      this.nFq = paramSensorEvent.values;
    }
    if (paramSensorEvent.sensor.getType() == 2) {
      this.nFr = paramSensorEvent.values;
    }
    float f1;
    if ((this.nFq != null) && (this.nFr != null))
    {
      paramSensorEvent = new float[9];
      if (SensorManager.getRotationMatrix(paramSensorEvent, new float[9], this.nFq, this.nFr))
      {
        float[] arrayOfFloat = new float[3];
        SensorManager.getOrientation(paramSensorEvent, arrayOfFloat);
        float f3 = arrayOfFloat[2];
        if (this.nFm != 0)
        {
          f1 = f3;
          if (f3 > 10.0F) {
            f1 = 10.0F;
          }
          if (f1 >= -10.0F) {
            break label151;
          }
          f1 = f2;
        }
      }
    }
    label151:
    for (;;)
    {
      f1 = f1 * this.nFm / 10.0F;
      this.nFp.scrollBy((int)f1, 0);
      return;
    }
  }
  
  public final void setImage(Bitmap paramBitmap)
  {
    if (paramBitmap == null) {
      x.e("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", "when set image the bmp is null!");
    }
    do
    {
      return;
      if (this.bOA == null)
      {
        x.e("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", "when set image the imageView is null!");
        return;
      }
      if (paramBitmap.getHeight() == 0)
      {
        x.e("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", "when set image the bmp.getHeight is 0!");
        return;
      }
      this.eVR.setVisibility(8);
      this.bOA.setImageBitmap(paramBitmap);
      this.bOA.setLayoutParams(new RelativeLayout.LayoutParams(paramBitmap.getWidth() * this.hmW / paramBitmap.getHeight(), this.hmW));
      this.bOA.post(new Runnable()
      {
        public final void run()
        {
          int i = u.this.bOA.getMeasuredWidth();
          if (i > u.this.hmV)
          {
            u.this.nFm = ((i - u.this.hmV) / 2);
            u.this.nFp.scrollBy(u.this.nFm, 0);
          }
        }
      });
    } while (paramBitmap.getHeight() == 0);
    this.contentView.setLayoutParams(new LinearLayout.LayoutParams(paramBitmap.getWidth() * this.hmW / paramBitmap.getHeight(), this.hmW));
  }
  
  public final void startLoading()
  {
    this.eVR.setVisibility(0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */