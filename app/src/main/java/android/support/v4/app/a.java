package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public final class a
  extends android.support.v4.content.a
{
  static b.a a(al paramal)
  {
    b localb = null;
    if (paramal != null) {
      localb = new b(paramal);
    }
    return localb;
  }
  
  public static void a(Activity paramActivity, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      paramActivity.startActivityForResult(paramIntent, paramInt, paramBundle);
      return;
    }
    paramActivity.startActivityForResult(paramIntent, paramInt);
  }
  
  public static void a(final Activity paramActivity, String[] paramArrayOfString, final int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 23)
    {
      if ((paramActivity instanceof c.a)) {
        ((c.a)paramActivity).validateRequestPermissionsRequestCode(paramInt);
      }
      paramActivity.requestPermissions(paramArrayOfString, paramInt);
    }
    while (!(paramActivity instanceof a)) {
      return;
    }
    new Handler(Looper.getMainLooper()).post(new Runnable()
    {
      public final void run()
      {
        int[] arrayOfInt = new int[this.mq.length];
        PackageManager localPackageManager = paramActivity.getPackageManager();
        String str = paramActivity.getPackageName();
        int j = this.mq.length;
        int i = 0;
        while (i < j)
        {
          arrayOfInt[i] = localPackageManager.checkPermission(this.mq[i], str);
          i += 1;
        }
        ((a.a)paramActivity).onRequestPermissionsResult(paramInt, this.mq, arrayOfInt);
      }
    });
  }
  
  public static boolean a(Activity paramActivity, String paramString)
  {
    if (Build.VERSION.SDK_INT >= 23) {
      return paramActivity.shouldShowRequestPermissionRationale(paramString);
    }
    return false;
  }
  
  public static abstract interface a
  {
    public abstract void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt);
  }
  
  private static final class b
    extends b.a
  {
    private al mt;
    
    public b(al paramal)
    {
      this.mt = paramal;
    }
    
    public final Parcelable onCaptureSharedElementSnapshot(View paramView, Matrix paramMatrix, RectF paramRectF)
    {
      al localal = this.mt;
      ImageView localImageView;
      Object localObject1;
      if ((paramView instanceof ImageView))
      {
        localImageView = (ImageView)paramView;
        localObject1 = localImageView.getDrawable();
        Object localObject2 = localImageView.getBackground();
        if ((localObject1 != null) && (localObject2 == null))
        {
          localObject2 = al.a((Drawable)localObject1);
          if (localObject2 != null)
          {
            localObject1 = new Bundle();
            ((Bundle)localObject1).putParcelable("sharedElement:snapshot:bitmap", (Parcelable)localObject2);
            ((Bundle)localObject1).putString("sharedElement:snapshot:imageScaleType", localImageView.getScaleType().toString());
            if (localImageView.getScaleType() == ImageView.ScaleType.MATRIX)
            {
              paramView = localImageView.getImageMatrix();
              paramMatrix = new float[9];
              paramView.getValues(paramMatrix);
              ((Bundle)localObject1).putFloatArray("sharedElement:snapshot:imageMatrix", paramMatrix);
            }
          }
        }
      }
      do
      {
        do
        {
          return (Parcelable)localObject1;
          j = Math.round(paramRectF.width());
          i = Math.round(paramRectF.height());
          localImageView = null;
          localObject1 = localImageView;
        } while (j <= 0);
        localObject1 = localImageView;
      } while (i <= 0);
      float f = Math.min(1.0F, al.qL / (j * i));
      int j = (int)(j * f);
      int i = (int)(i * f);
      if (localal.qK == null) {
        localal.qK = new Matrix();
      }
      localal.qK.set(paramMatrix);
      localal.qK.postTranslate(-paramRectF.left, -paramRectF.top);
      localal.qK.postScale(f, f);
      paramMatrix = Bitmap.createBitmap(j, i, Bitmap.Config.ARGB_8888);
      paramRectF = new Canvas(paramMatrix);
      paramRectF.concat(localal.qK);
      paramView.draw(paramRectF);
      return paramMatrix;
    }
    
    public final View onCreateSnapshotView(Context paramContext, Parcelable paramParcelable)
    {
      return al.onCreateSnapshotView(paramContext, paramParcelable);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/app/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */