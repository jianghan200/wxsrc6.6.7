package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ListView;
import com.tencent.mm.compatible.util.Exif;
import com.tencent.mm.compatible.util.Exif.a;
import com.tencent.mm.modelsfs.FileOp;
import java.io.InputStream;

public final class BackwardSupportUtil
{
  public static final class ExifHelper
  {
    public static int VX(String paramString)
    {
      if (bi.oW(paramString))
      {
        x.d("MicroMsg.SDK.BackwardSupportUtil", "filepath is null or nil");
        return 0;
      }
      if (!FileOp.cn(paramString))
      {
        x.d("MicroMsg.SDK.BackwardSupportUtil", "file not exist:[%s]", new Object[] { paramString });
        return 0;
      }
      return Exif.fromFile(paramString).getOrientationInDegree();
    }
    
    public static LatLongData VY(String paramString)
    {
      if (bi.oW(paramString)) {
        x.d("MicroMsg.SDK.BackwardSupportUtil", "filepath is null or nil");
      }
      do
      {
        return null;
        if (!FileOp.cn(paramString))
        {
          x.d("MicroMsg.SDK.BackwardSupportUtil", "file not exist:[%s]", new Object[] { paramString });
          return null;
        }
        paramString = Exif.fromFile(paramString).getLocation();
      } while (paramString == null);
      LatLongData localLatLongData = new LatLongData();
      localLatLongData.bSx = ((float)paramString.latitude);
      localLatLongData.dVI = ((float)paramString.longitude);
      return localLatLongData;
    }
    
    public static class LatLongData
      implements Parcelable
    {
      public static final Parcelable.Creator<LatLongData> CREATOR = new Parcelable.Creator() {};
      public float bSx;
      public float dVI;
      
      public LatLongData()
      {
        this.bSx = 0.0F;
        this.dVI = 0.0F;
      }
      
      public LatLongData(float paramFloat1, float paramFloat2)
      {
        this.bSx = paramFloat1;
        this.dVI = paramFloat2;
      }
      
      public int describeContents()
      {
        return 0;
      }
      
      public boolean equals(Object paramObject)
      {
        if (!(paramObject instanceof LatLongData)) {}
        do
        {
          return false;
          paramObject = (LatLongData)paramObject;
        } while ((Math.abs(this.bSx - ((LatLongData)paramObject).bSx) >= 1.0E-6F) || (Math.abs(this.dVI - ((LatLongData)paramObject).dVI) >= 1.0E-6F));
        return true;
      }
      
      public int hashCode()
      {
        return (int)(this.bSx * 10000.0F) + (int)(this.dVI * 10000.0F);
      }
      
      public void writeToParcel(Parcel paramParcel, int paramInt)
      {
        paramParcel.writeFloat(this.bSx);
        paramParcel.writeFloat(this.dVI);
      }
    }
  }
  
  public static final class a
  {
    public static void c(View paramView, Animation paramAnimation)
    {
      if (Build.VERSION.SDK_INT >= 8)
      {
        new b();
        paramAnimation.cancel();
      }
      do
      {
        return;
        new a();
      } while (paramView == null);
      paramView.setAnimation(null);
    }
  }
  
  public static final class b
  {
    public static Bitmap a(InputStream paramInputStream, float paramFloat)
    {
      paramInputStream = c.a(paramInputStream, paramFloat, 0, 0);
      if (paramInputStream != null) {
        paramInputStream.setDensity((int)(160.0F * paramFloat));
      }
      return paramInputStream;
    }
    
    public static int b(Context paramContext, float paramFloat)
    {
      return Math.round(paramContext.getResources().getDisplayMetrics().densityDpi * paramFloat / 160.0F);
    }
    
    public static Bitmap e(String paramString, float paramFloat)
    {
      paramString = c.f(paramString, paramFloat);
      if (paramString != null) {
        paramString.setDensity((int)(160.0F * paramFloat));
      }
      return paramString;
    }
    
    public static String fp(Context paramContext)
    {
      Object localObject = paramContext.getResources().getDisplayMetrics();
      Configuration localConfiguration = paramContext.getResources().getConfiguration();
      if (((DisplayMetrics)localObject).density < 1.0F)
      {
        paramContext = "" + "LDPI";
        localObject = new StringBuilder().append(paramContext);
        if (localConfiguration.orientation != 2) {
          break label136;
        }
      }
      label136:
      for (paramContext = "_L";; paramContext = "_P")
      {
        return paramContext;
        if (((DisplayMetrics)localObject).density >= 1.5F)
        {
          paramContext = "" + "HDPI";
          break;
        }
        paramContext = "" + "MDPI";
        break;
      }
    }
  }
  
  public static final class c
  {
    public static void a(ListView paramListView)
    {
      if (paramListView == null) {}
      do
      {
        return;
        if (Build.VERSION.SDK_INT < 8) {
          break;
        }
        new bc();
        if (paramListView.getFirstVisiblePosition() > 10) {
          paramListView.setSelection(10);
        }
      } while (Build.VERSION.SDK_INT < 8);
      paramListView.smoothScrollToPosition(0);
      return;
      new bb();
      paramListView.setSelection(0);
    }
    
    public static void b(ListView paramListView, int paramInt)
    {
      if (paramListView == null) {}
      for (;;)
      {
        return;
        if (Build.VERSION.SDK_INT < 8) {
          break;
        }
        new bc();
        int i = paramListView.getFirstVisiblePosition();
        if ((i > paramInt) && (i - paramInt > 10)) {
          paramListView.setSelection(paramInt + 10);
        }
        while (Build.VERSION.SDK_INT >= 8)
        {
          paramListView.smoothScrollToPosition(paramInt);
          return;
          if ((i < paramInt) && (paramInt - i > 10)) {
            paramListView.setSelection(paramInt - 10);
          }
        }
      }
      new bb();
      paramListView.setSelection(paramInt);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/BackwardSupportUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */