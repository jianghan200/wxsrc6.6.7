package com.tencent.mm.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.platformtools.s;
import com.tencent.mm.plugin.gif.a;
import com.tencent.mm.plugin.gif.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s.b;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import junit.framework.Assert;

public class CropImageNewUI
  extends MMActivity
{
  private String filePath;
  private int hop = 0;
  private final int uvS = 1;
  private final int uvT = 0;
  private int uvU;
  private int uvV = 0;
  private FilterImageView uvW;
  private LinearLayout uvX;
  private CropImageView uvY;
  private ImageView uvZ;
  private View uwa;
  private int uwb = 0;
  private boolean uwc = false;
  private boolean uwd = false;
  private boolean uwe = false;
  
  private static Bitmap a(float[][] paramArrayOfFloat, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, CropImageView paramCropImageView)
  {
    if (paramCropImageView == null) {
      return null;
    }
    float[] arrayOfFloat = m.c(paramArrayOfFloat, new float[] { paramFloat1, paramFloat2, 1.0F });
    paramArrayOfFloat = m.c(paramArrayOfFloat, new float[] { paramFloat3, paramFloat4, 1.0F });
    int j = (int)Math.min(arrayOfFloat[0], paramArrayOfFloat[0]);
    int k = (int)Math.min(arrayOfFloat[1], paramArrayOfFloat[1]);
    int i = j;
    if (j < 0) {
      i = 0;
    }
    j = k;
    if (k < 0) {
      j = 0;
    }
    int m = (int)Math.abs(arrayOfFloat[0] - paramArrayOfFloat[0]);
    int n = (int)Math.abs(arrayOfFloat[1] - paramArrayOfFloat[1]);
    paramArrayOfFloat = new Matrix();
    switch (paramCropImageView.getRotateCount() % 4)
    {
    }
    for (;;)
    {
      paramCropImageView = paramCropImageView.getBmp();
      k = m;
      if (i + m > paramCropImageView.getWidth()) {
        k = paramCropImageView.getWidth() - i;
      }
      m = n;
      if (j + n > paramCropImageView.getHeight()) {
        m = paramCropImageView.getHeight() - j;
      }
      x.i("MicroMsg.CropImageUI", "rawWidth:%d, rawHeigth:%d, originalLX:%d, originalTY:%d, realWidth:%d, realHeight:%d", new Object[] { Integer.valueOf(paramCropImageView.getWidth()), Integer.valueOf(paramCropImageView.getHeight()), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m) });
      return Bitmap.createBitmap(paramCropImageView, i, j, k, m, paramArrayOfFloat, true);
      paramArrayOfFloat.setRotate(0.0F, m / 2, n / 2);
      continue;
      paramArrayOfFloat.setRotate(90.0F, m / 2, n / 2);
      continue;
      paramArrayOfFloat.setRotate(180.0F, m / 2, n / 2);
      continue;
      paramArrayOfFloat.setRotate(270.0F, m / 2, n / 2);
    }
  }
  
  private boolean a(Bitmap paramBitmap, String paramString, boolean paramBoolean)
  {
    if ((paramString != null) && (!paramString.equals(""))) {
      try
      {
        if (this.hop == 1)
        {
          c.a(paramBitmap, 30, Bitmap.CompressFormat.JPEG, paramString, paramBoolean);
          return true;
        }
        c.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, paramString, paramBoolean);
        return true;
      }
      catch (Exception paramBitmap)
      {
        x.printErrStackTrace("MicroMsg.CropImageUI", paramBitmap, "", new Object[0]);
        x.e("MicroMsg.CropImageUI", "saveBitmapToImage failed:" + paramBitmap.toString());
      }
    }
    return false;
  }
  
  private static float[][] b(Matrix paramMatrix)
  {
    float[][] arrayOfFloat = (float[][])Array.newInstance(Float.TYPE, new int[] { 3, 3 });
    float[] arrayOfFloat1 = new float[9];
    paramMatrix.getValues(arrayOfFloat1);
    int i = 0;
    while (i < 3)
    {
      int j = 0;
      while (j < 3)
      {
        arrayOfFloat[i][j] = arrayOfFloat1[(i * 3 + j)];
        j += 1;
      }
      i += 1;
    }
    return arrayOfFloat;
  }
  
  private void c(Runnable paramRunnable1, Runnable paramRunnable2)
  {
    this.uvW = ((FilterImageView)findViewById(R.h.cropimage_filter_view));
    s.bD(this.uvW);
    this.uvW.setOnConfirmImp(paramRunnable1);
    this.uvW.setOnExitImp(paramRunnable2);
  }
  
  private boolean czD()
  {
    Object localObject1;
    if (1 == this.uvU) {
      if (this.uvW != null) {
        localObject1 = this.uvW.getCropAreaView();
      }
    }
    int n;
    int i1;
    for (;;)
    {
      n = ((View)localObject1).getWidth();
      i1 = ((View)localObject1).getHeight();
      x.v("MicroMsg.CropImageUI", "scrWidth:" + n + " scrHeight:" + i1);
      this.filePath = getIntent().getStringExtra("CropImage_ImgPath");
      if (FileOp.cn(this.filePath)) {
        break;
      }
      finish();
      return false;
      localObject1 = findViewById(R.h.cropimage_frame);
      continue;
      localObject1 = findViewById(R.h.cropimage_fl);
    }
    int k = 960;
    int m = 960;
    boolean bool;
    int j;
    int i;
    if (this.uvU == 2)
    {
      bool = true;
      j = i1;
      i = n;
      this.uwb = BackwardSupportUtil.ExifHelper.VX(this.filePath);
      if ((this.uwb != 90) && (this.uwb != 270)) {
        break label2239;
      }
    }
    for (;;)
    {
      Object localObject3 = c.e(this.filePath, i, j, bool);
      Object localObject2 = FileOp.e(this.filePath, 0, 10);
      if (o.bv((byte[])localObject2)) {}
      float f1;
      for (this.uvV = 1;; this.uvV = 0)
      {
        if (localObject3 != null) {
          break label877;
        }
        finish();
        return false;
        if (this.uvU == 3)
        {
          localObject2 = new BitmapFactory.Options();
          ((BitmapFactory.Options)localObject2).inJustDecodeBounds = true;
          localObject3 = BitmapFactory.decodeFile(this.filePath, (BitmapFactory.Options)localObject2);
          if (localObject3 != null) {
            ((Bitmap)localObject3).recycle();
          }
          k = ((BitmapFactory.Options)localObject2).outWidth;
          m = ((BitmapFactory.Options)localObject2).outHeight;
          f1 = 1.0F;
          if ((k > 640) || (m > 640)) {
            if (k > m)
            {
              f1 = m / k;
              j = 640;
              i = (int)(m * f1);
            }
          }
          for (;;)
          {
            x.d("MicroMsg.CropImageUI", "w:%d h:%d width:%d height:%d scale:%f", new Object[] { Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(j), Integer.valueOf(i), Float.valueOf(f1) });
            localObject2 = (Button)findViewById(R.h.cropimage_function_btn);
            if (localObject2 != null) {
              ((Button)localObject2).setVisibility(8);
            }
            bool = false;
            k = i;
            i = j;
            j = k;
            break;
            f1 = k / m;
            i = 640;
            j = (int)(960.0F * f1);
            continue;
            i = m;
            j = k;
          }
        }
        if (this.uvU == 1)
        {
          localObject2 = new BitmapFactory.Options();
          ((BitmapFactory.Options)localObject2).inJustDecodeBounds = true;
          localObject3 = BitmapFactory.decodeFile(this.filePath, (BitmapFactory.Options)localObject2);
          if (localObject3 != null)
          {
            x.i("MicroMsg.CropImageUI", "recycle bitmap:%s", new Object[] { localObject3.toString() });
            ((Bitmap)localObject3).recycle();
          }
          if (((BitmapFactory.Options)localObject2).outWidth > ((BitmapFactory.Options)localObject2).outHeight)
          {
            k = (int)(((BitmapFactory.Options)localObject2).outWidth * 960 * 1.0D / ((BitmapFactory.Options)localObject2).outHeight);
            j = m;
            i = k;
            if (k > 1920)
            {
              i = 1920;
              j = m;
            }
          }
          for (;;)
          {
            bool = false;
            break;
            m = (int)(((BitmapFactory.Options)localObject2).outHeight * 960 * 1.0D / ((BitmapFactory.Options)localObject2).outWidth);
            j = m;
            i = k;
            if (m > 1920)
            {
              j = 1920;
              i = k;
            }
          }
        }
        localObject2 = new BitmapFactory.Options();
        ((BitmapFactory.Options)localObject2).inJustDecodeBounds = true;
        c.c((BitmapFactory.Options)localObject2);
        localObject3 = BitmapFactory.decodeFile(this.filePath, (BitmapFactory.Options)localObject2);
        if (localObject3 != null)
        {
          x.i("MicroMsg.CropImageUI", "recycle bitmap:%s", new Object[] { localObject3.toString() });
          ((Bitmap)localObject3).recycle();
        }
        if ((ai.bv(((BitmapFactory.Options)localObject2).outWidth, ((BitmapFactory.Options)localObject2).outHeight)) && (((BitmapFactory.Options)localObject2).outWidth > 480))
        {
          bool = true;
          label739:
          this.uwc = bool;
          if ((!ai.bu(((BitmapFactory.Options)localObject2).outWidth, ((BitmapFactory.Options)localObject2).outHeight)) || (((BitmapFactory.Options)localObject2).outHeight <= 480)) {
            break label863;
          }
        }
        label863:
        for (bool = true;; bool = false)
        {
          this.uwd = bool;
          if (!this.uwc)
          {
            j = m;
            i = k;
            if (!this.uwd) {}
          }
          else
          {
            j = ((BitmapFactory.Options)localObject2).outHeight;
            i = ((BitmapFactory.Options)localObject2).outWidth;
          }
          x.e("MicroMsg.CropImageUI", "width is " + i + " height is " + j);
          bool = false;
          break;
          bool = false;
          break label739;
        }
      }
      label877:
      x.d("temBmp crop", "h:" + ((Bitmap)localObject3).getHeight() + "w: " + ((Bitmap)localObject3).getWidth());
      Bitmap localBitmap = c.b((Bitmap)localObject3, this.uwb);
      localObject3 = new Matrix();
      ((Matrix)localObject3).reset();
      float f4 = 1.0F;
      float f2;
      label991:
      float f3;
      if (bool)
      {
        f1 = localBitmap.getWidth() / n;
        f2 = localBitmap.getHeight() / i1;
        if (f1 < f2)
        {
          if (n <= i1) {
            break label1243;
          }
          f2 = i1;
          f3 = f2 / localBitmap.getWidth();
          f4 = f2 / localBitmap.getHeight();
          f2 = f4;
          if (f3 > f4) {
            f2 = f3;
          }
          if (f1 < 1.0D) {
            ((Matrix)localObject3).postScale(f2, f2);
          }
        }
      }
      for (;;)
      {
        if (1 == this.uvU)
        {
          if (this.uvW != null)
          {
            this.uvW.setMatrix((Matrix)localObject3);
            this.uvW.setImage(localBitmap);
          }
          label1070:
          if (this.uvU != 3) {
            break label2180;
          }
          if (!o.bv((byte[])localObject2)) {
            break label2172;
          }
          this.uvV = 1;
        }
        try
        {
          localObject1 = b.aVQ().dj(this.filePath, this.filePath);
          this.uvY.setImageDrawable((Drawable)localObject1);
          ((a)localObject1).start();
          ((Matrix)localObject3).reset();
          i = ((a)localObject1).getIntrinsicWidth();
          j = ((a)localObject1).getIntrinsicHeight();
          f1 = n / i;
          f2 = i1 / j;
          if (f1 >= f2) {
            break label2122;
          }
          label1162:
          f2 = i / n;
          f3 = j / i1;
          if (f2 <= f3) {
            break label2127;
          }
          label1184:
          if (f2 <= 1.0D) {
            break label2132;
          }
          ((Matrix)localObject3).postScale(f1, f1);
          ((Matrix)localObject3).postTranslate((n - i * f1) / 2.0F, (i1 - f1 * j) / 2.0F);
          label1227:
          this.uvY.setImageMatrix((Matrix)localObject3);
        }
        catch (Exception localException)
        {
          for (;;)
          {
            label1236:
            x.e("MicroMsg.CropImageUI", bi.i(localException));
          }
        }
        return true;
        f1 = f2;
        break;
        label1243:
        f2 = n;
        break label991;
        f1 = localBitmap.getWidth() / localBitmap.getHeight();
        f2 = localBitmap.getHeight() / localBitmap.getWidth();
        x.v("MicroMsg.CropImageUI", "whDiv is " + f1 + " hwDiv is " + f2);
        if ((f2 >= 2.0F) && (localBitmap.getHeight() >= 480))
        {
          f2 = localBitmap.getWidth() / n;
          f1 = n / localBitmap.getWidth();
          if (1 == this.uvU)
          {
            f2 = i1 / localBitmap.getHeight();
            if (f1 > f2) {}
            for (;;)
            {
              ((Matrix)localObject3).postScale(f1, f1);
              ((Matrix)localObject3).postTranslate((n - f1 * localBitmap.getWidth()) / 2.0F + ((View)localObject1).getLeft(), ((View)localObject1).getTop());
              break;
              f1 = f2;
            }
          }
          if (f2 > 1.0D)
          {
            ((Matrix)localObject3).postScale(f1, f1);
            localBitmap.getHeight();
            ((Matrix)localObject3).postTranslate((n - f1 * localBitmap.getWidth()) / 2.0F, 0.0F);
          }
          else
          {
            ((Matrix)localObject3).postScale(1.0F, 1.0F);
            if (3 == this.uvU) {
              ((Matrix)localObject3).postTranslate((n - localBitmap.getWidth()) / 2, (i1 - localBitmap.getHeight()) / 2);
            } else {
              ((Matrix)localObject3).postTranslate((n - localBitmap.getWidth()) / 2, 0.0F);
            }
          }
        }
        else if ((f1 >= 2.0F) && (localBitmap.getWidth() >= 480))
        {
          f1 = localBitmap.getHeight() / 480.0F;
          f2 = 480.0F / localBitmap.getHeight();
          if (1 == this.uvU)
          {
            f1 = n / localBitmap.getWidth();
            f2 = i1 / localBitmap.getHeight();
            if (f1 > f2) {}
            for (;;)
            {
              ((Matrix)localObject3).postScale(f1, f1);
              ((Matrix)localObject3).postTranslate((n - localBitmap.getWidth() * f1) / 2.0F + ((View)localObject1).getLeft(), (i1 - f1 * localBitmap.getHeight()) / 2.0F + ((View)localObject1).getTop());
              break;
              f1 = f2;
            }
          }
          if (f1 > 1.0D)
          {
            ((Matrix)localObject3).postScale(f1, f2);
            ((Matrix)localObject3).postTranslate(0.0F, (i1 - 480) / 2);
          }
          else
          {
            ((Matrix)localObject3).postScale(1.0F, 1.0F);
            f1 = (i1 - localBitmap.getHeight()) / 2;
            x.d("MicroMsg.CropImageUI", " offsety " + f1);
            ((Matrix)localObject3).postTranslate(0.0F, f1);
          }
        }
        else
        {
          f2 = n / localBitmap.getWidth();
          f3 = i1 / localBitmap.getHeight();
          if (f2 < f3)
          {
            f1 = f2;
            label1792:
            if (f2 <= f3) {
              break label1870;
            }
          }
          for (;;)
          {
            if (1 != this.uvU) {
              break label1875;
            }
            ((Matrix)localObject3).postScale(f2, f2);
            ((Matrix)localObject3).postTranslate((n - localBitmap.getWidth() * f2) / 2.0F + ((View)localObject1).getLeft(), (i1 - f2 * localBitmap.getHeight()) / 2.0F + ((View)localObject1).getTop());
            break;
            f1 = f3;
            break label1792;
            label1870:
            f2 = f3;
          }
          label1875:
          if (this.uvV == 1)
          {
            this.uvY.setGifPath(this.filePath);
            this.uvY.getGifWidth();
            this.uvY.getGifHeight();
            f1 = this.uvY.getGifWidth() / n;
            f2 = this.uvY.getGifHeight() / i1;
            if (f1 > f2)
            {
              label1942:
              if (f1 <= 1.0D) {
                break label2234;
              }
              ((Matrix)localObject3).postScale(f1, f1);
            }
          }
        }
      }
      for (;;)
      {
        ((Matrix)localObject3).postTranslate((n - this.uvY.getGifWidth() * f1) / 2.0F, (i1 - f1 * this.uvY.getGifHeight()) / 2.0F);
        break;
        f1 = f2;
        break label1942;
        f2 = localBitmap.getWidth() / n;
        f3 = localBitmap.getHeight() / i1;
        if (f2 > f3) {}
        for (;;)
        {
          f3 = f4;
          if (f2 > 1.0D)
          {
            ((Matrix)localObject3).postScale(f1, f1);
            f3 = f1;
          }
          ((Matrix)localObject3).postTranslate((n - localBitmap.getWidth() * f3) / 2.0F, (i1 - localBitmap.getHeight() * f3) / 2.0F);
          break;
          f2 = f3;
        }
        if (this.uvV == 1) {
          break label1070;
        }
        this.uvY.setImageMatrix((Matrix)localObject3);
        this.uvY.setImageBitmap(localBitmap);
        break label1070;
        label2122:
        f1 = f2;
        break label1162;
        label2127:
        f2 = f3;
        break label1184;
        label2132:
        ((Matrix)localObject3).postTranslate((n - i) / 2, (i1 - j) / 2);
        break label1227;
        label2172:
        this.uvV = 0;
        break label1236;
        label2180:
        if ((this.uwc) || (this.uwd)) {
          findViewById(R.h.cropimage_rotate).setVisibility(8);
        }
        if (getIntent().getBooleanExtra("CropImage_DirectlyIntoFilter", false)) {
          findViewById(R.h.cropimage_function_bar).setVisibility(8);
        }
        return true;
        label2234:
        f1 = 1.0F;
      }
      label2239:
      k = i;
      i = j;
      j = k;
    }
  }
  
  private int[] czE()
  {
    Object localObject1 = new Rect();
    getWindow().getDecorView().getWindowVisibleDisplayFrame((Rect)localObject1);
    int j = ((Rect)localObject1).top;
    x.e("MicroMsg.CropImageUI", "window TitleBar.h:" + j);
    int i = j;
    if (j == 0) {
      i = j;
    }
    label298:
    for (;;)
    {
      try
      {
        localObject1 = Class.forName("com.android.internal.R$dimen");
        i = j;
        Object localObject2 = ((Class)localObject1).newInstance();
        i = j;
        int k = ai.getInt(((Class)localObject1).getField("status_bar_height").get(localObject2).toString(), 0);
        i = j;
        j = getResources().getDimensionPixelSize(k);
        i = j;
        x.e("MicroMsg.CropImageUI", "sbar:" + j);
        i = j;
        localObject1 = new DisplayMetrics();
        ((WindowManager)getSystemService("window")).getDefaultDisplay().getMetrics((DisplayMetrics)localObject1);
        int m = (int)(67.0F * ((DisplayMetrics)localObject1).density / 1.5D);
        j = Math.min(this.uwa.getWidth(), this.uwa.getHeight());
        int n = Math.max(this.uwa.getWidth(), this.uwa.getHeight());
        k = j - m * 2 - i;
        if (this.uwb != 0) {
          break label298;
        }
        j += i + m * 2;
        k += m;
        return new int[] { j, n - m * 2, k, n + i + m };
      }
      catch (Exception localException)
      {
        x.printErrStackTrace("MicroMsg.CropImageUI", localException, "", new Object[0]);
      }
    }
  }
  
  private Bitmap fg(int paramInt1, int paramInt2)
  {
    Bitmap localBitmap = c.e(this.filePath, paramInt2, paramInt1, true);
    Object localObject = localBitmap;
    if (this.uwb != 0)
    {
      localObject = new Matrix();
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setRotate(this.uwb, localBitmap.getWidth() / 2, localBitmap.getHeight() / 2);
      localObject = Bitmap.createBitmap(localBitmap, 0, 0, localBitmap.getWidth(), localBitmap.getHeight(), (Matrix)localObject, true);
      if (localBitmap != localObject)
      {
        x.i("MicroMsg.CropImageUI", "recycle bitmap:%s", new Object[] { localBitmap.toString() });
        localBitmap.recycle();
      }
    }
    x.d("MicroMsg.CropImageUI", "getcrop degree:" + this.uwb);
    return (Bitmap)localObject;
  }
  
  protected final int getLayoutId()
  {
    return R.i.cropimage_new;
  }
  
  protected final void initView()
  {
    setMMTitle("");
    this.uvX = ((LinearLayout)findViewById(R.h.cropimage_operator_ll));
    this.uvZ = ((ImageView)findViewById(R.h.cropimage_iv));
    s.bD(this.uvZ);
    this.uwa = findViewById(R.h.cropimage_frame);
    this.uvU = getIntent().getIntExtra("CropImageMode", 0);
    boolean bool1;
    boolean bool2;
    Object localObject;
    Button localButton;
    int i;
    if (this.uvU != 0)
    {
      bool1 = true;
      Assert.assertTrue("the image mode must be set", bool1);
      this.hop = getIntent().getIntExtra("CropImage_from_scene", 0);
      bool1 = getIntent().getBooleanExtra("CropImage_Filter", false);
      bool2 = getIntent().getBooleanExtra("CropImage_DirectlyIntoFilter", false);
      if (bool1) {
        c(new CropImageNewUI.22(this), new CropImageNewUI.23(this));
      }
      this.uwe = false;
      this.uvY = ((CropImageView)findViewById(R.h.cropimage_origin_iv));
      s.bD(this.uvY);
      this.uvY.post(new Runnable()
      {
        public final void run()
        {
          if (!CropImageNewUI.a(CropImageNewUI.this)) {}
          do
          {
            do
            {
              return;
              if ((CropImageNewUI.b(CropImageNewUI.this)) || (CropImageNewUI.c(CropImageNewUI.this)) || (!CropImageNewUI.this.getIntent().getBooleanExtra("CropImage_DirectlyIntoFilter", false))) {
                break;
              }
              CropImageNewUI.d(CropImageNewUI.this);
            } while (CropImageNewUI.this.getSharedPreferences(ad.chY(), 0).getBoolean("CropImage_Filter_Show", true));
            CropImageNewUI.e(CropImageNewUI.this).findViewById(R.h.cropimage_filter_gallery).setVisibility(4);
            return;
          } while (1 != CropImageNewUI.f(CropImageNewUI.this));
          CropImageNewUI.g(CropImageNewUI.this);
        }
      });
      this.uvY.setOnShortClick(new CropImageView.a()
      {
        public final void czF()
        {
          CropImageNewUI.h(CropImageNewUI.this);
        }
      });
      ((Button)findViewById(R.h.cropimage_rotate)).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          paramAnonymousView = CropImageNewUI.j(CropImageNewUI.this);
          if (paramAnonymousView.jDx == null)
          {
            x.w("MicroMsg.CropImageView", "rotate not done! cause: btmp is null!");
            return;
          }
          float[] arrayOfFloat = new float[2];
          arrayOfFloat[0] = (paramAnonymousView.jDx.getWidth() / 2);
          arrayOfFloat[1] = (paramAnonymousView.jDx.getHeight() / 2);
          paramAnonymousView.getImageMatrix().mapPoints(arrayOfFloat);
          paramAnonymousView.getImageMatrix().postRotate(90.0F, arrayOfFloat[0], arrayOfFloat[1]);
          paramAnonymousView.setImageBitmap(paramAnonymousView.jDx);
          paramAnonymousView.invalidate();
          paramAnonymousView.bRV += 1;
        }
      });
      localObject = (Button)findViewById(R.h.cropimage_zoomin);
      ((Button)localObject).setOnClickListener(new CropImageNewUI.5(this));
      localButton = (Button)findViewById(R.h.cropimage_zoomout);
      localButton.setOnClickListener(new CropImageNewUI.6(this));
      al localal1 = new al(new CropImageNewUI.7(this), true);
      final al localal2 = new al(new CropImageNewUI.8(this), true);
      ((Button)localObject).setOnTouchListener(new CropImageNewUI.9(this, localal1));
      localButton.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          switch (paramAnonymousMotionEvent.getAction())
          {
          }
          for (;;)
          {
            return false;
            localal2.J(200L, 200L);
            continue;
            localal2.SO();
          }
        }
      });
      i = R.l.cropimage_use;
      switch (this.uvU)
      {
      case 4: 
      default: 
        label384:
        x.d("MicroMsg.CropImageUI", "mode is  " + this.uvU);
        localObject = new CropImageNewUI.17(this, bool1, bool2);
        if (this.uvU == 5) {
          addIconOptionMenu(0, R.g.mm_title_btn_menu, (MenuItem.OnMenuItemClickListener)localObject);
        }
        break;
      }
    }
    for (;;)
    {
      if ((bool1) && (bool2)) {
        a(0, getString(R.l.cropimage_done), (MenuItem.OnMenuItemClickListener)localObject, s.b.tmX);
      }
      setBackBtn(new CropImageNewUI.19(this));
      if (this.uvU == 6)
      {
        findViewById(R.h.cropimage_function_bar).setVisibility(8);
        a(0, getString(R.l.cropimage_use), new CropImageNewUI.20(this), s.b.tmX);
      }
      return;
      bool1 = false;
      break;
      c(new Runnable()new CropImageNewUI.3
      {
        public final void run()
        {
          CropImageNewUI.a(CropImageNewUI.this, CropImageNewUI.e(CropImageNewUI.this).getCropImageIV(), CropImageNewUI.e(CropImageNewUI.this).getCropAreaView());
          CropImageNewUI.this.finish();
        }
      }, new CropImageNewUI.3(this));
      this.uvW.setLimitZoomIn(false);
      localObject = this.uvW;
      if (((FilterImageView)localObject).uwW != null)
      {
        ((FilterImageView)localObject).uwW.setScaleType(ImageView.ScaleType.MATRIX);
        ((FilterImageView)localObject).uwW.czG();
      }
      this.uvW.setCropMaskVisible(0);
      if (this.hop != 1) {
        break label384;
      }
      this.uvW.setCropMaskBackground(R.g.new_year_capture);
      break label384;
      this.uvY.setEnableOprate(false);
      findViewById(R.h.cropimage_ajuster_select).setVisibility(8);
      findViewById(R.h.cropimage_function_bar).setVisibility(8);
      break label384;
      this.uvX.setVisibility(8);
      break label384;
      int j = getIntent().getIntExtra("CropImage_CompressType", 1);
      boolean bool3 = getIntent().getBooleanExtra("CropImage_BHasHD", false);
      if ((j != 1) && (bool3))
      {
        findViewById(R.h.cropimage_function_bar).setVisibility(0);
        localObject = (Button)findViewById(R.h.cropimage_function_btn);
        ((Button)localObject).setBackgroundResource(R.g.btn_style_black);
        ((Button)localObject).setPadding(25, 8, 25, 8);
        ((Button)localObject).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            CropImageNewUI.r(CropImageNewUI.this);
          }
        });
        break label384;
      }
      findViewById(R.h.cropimage_function_bar).setVisibility(8);
      break label384;
      if (this.uvU == 4)
      {
        addIconOptionMenu(0, R.g.mm_title_btn_menu, (MenuItem.OnMenuItemClickListener)localObject);
        findViewById(R.h.cropimage_function_bar).setVisibility(0);
        localButton = (Button)findViewById(R.h.cropimage_function_btn);
        localButton.setText(R.l.cropimage_done);
        localButton.setOnClickListener(new CropImageNewUI.18(this));
      }
      else
      {
        a(0, getString(i), (MenuItem.OnMenuItemClickListener)localObject, s.b.tmX);
      }
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    x.d("MicroMsg.CropImageUI", "onConfigurationChanged, config.orientation = " + paramConfiguration.orientation);
    if ((paramConfiguration.orientation == 1) || (paramConfiguration.orientation == 2))
    {
      x.v("MicroMsg.CropImageUI", "onConfigurationChanged");
      this.uvY.post(new CropImageNewUI.21(this));
    }
    super.onConfigurationChanged(paramConfiguration);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
  
  public void onDestroy()
  {
    Object localObject;
    if (this.uvY != null)
    {
      localObject = this.uvY;
      if ((((CropImageView)localObject).jDx != null) && (!((CropImageView)localObject).jDx.isRecycled()))
      {
        x.i("MicroMsg.CropImageView", "recycle bitmap:%s", new Object[] { ((CropImageView)localObject).jDx.toString() });
        ((CropImageView)localObject).jDx.recycle();
      }
    }
    if (this.uvW != null)
    {
      localObject = this.uvW;
      ((FilterImageView)localObject).uwT = null;
      if ((((FilterImageView)localObject).uwX != null) && (!((FilterImageView)localObject).uwX.isRecycled()))
      {
        x.i("MicroMsg.FilterView", "recycle bitmap:%s", new Object[] { ((FilterImageView)localObject).uwX.toString() });
        ((FilterImageView)localObject).uwX.recycle();
      }
      ((FilterImageView)localObject).uwX = null;
    }
    super.onDestroy();
    x.appenderClose();
    Process.killProcess(Process.myPid());
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    initView();
  }
  
  public void onResume()
  {
    super.onResume();
    setRequestedOrientation(1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/tools/CropImageNewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */