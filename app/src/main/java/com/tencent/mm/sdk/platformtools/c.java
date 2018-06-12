package com.tencent.mm.sdk.platformtools;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mm.a.b;
import com.tencent.mm.compatible.g.a;
import com.tencent.mm.compatible.util.Exif;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.vfs.d;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c
{
  private static DisplayMetrics ewi = null;
  public static boolean sFw;
  
  public static Bitmap CV(int paramInt)
  {
    return a(paramInt, null, false, 0.0F, 0, 0);
  }
  
  public static Bitmap CW(int paramInt)
  {
    return a(paramInt, null, false, 1.25F, 0, 0);
  }
  
  public static Bitmap P(Bitmap paramBitmap)
  {
    float f1 = 2.5F;
    int j = 120;
    float f2;
    int i;
    if (paramBitmap.getHeight() >= paramBitmap.getWidth())
    {
      f2 = paramBitmap.getHeight() / paramBitmap.getWidth();
      if (f2 <= 2.0F)
      {
        i = (int)(paramBitmap.getWidth() * 120.0D / paramBitmap.getHeight());
        x.d("MicroMsg.BitmapUtil", "bitmap decoded size=" + paramBitmap.getWidth() + "x" + paramBitmap.getHeight());
        Bitmap localBitmap2 = Bitmap.createScaledBitmap(paramBitmap, i, j, true);
        Bitmap localBitmap1 = paramBitmap;
        if (localBitmap2 != null)
        {
          localBitmap1 = paramBitmap;
          if (paramBitmap != localBitmap2)
          {
            x.i("MicroMsg.BitmapUtil", "extractThumeNail bitmap recycle. %s", new Object[] { paramBitmap });
            paramBitmap.recycle();
            localBitmap1 = localBitmap2;
          }
        }
        return localBitmap1;
      }
      if (f2 <= 2.5D) {
        break label303;
      }
      paramBitmap = Bitmap.createBitmap(paramBitmap, 0, (paramBitmap.getHeight() - (int)(paramBitmap.getWidth() * 2.5F)) / 2, paramBitmap.getWidth(), (int)(paramBitmap.getWidth() * 2.5F));
    }
    for (;;)
    {
      j = (int)(f1 * 56.0F);
      i = 56;
      break;
      f2 = paramBitmap.getWidth() / paramBitmap.getHeight();
      if (f2 <= 2.0F)
      {
        j = (int)(paramBitmap.getHeight() * 120.0D / paramBitmap.getWidth());
        i = 120;
        break;
      }
      if (f2 > 2.5D) {
        paramBitmap = Bitmap.createBitmap(paramBitmap, (paramBitmap.getWidth() - (int)(paramBitmap.getHeight() * 2.5F)) / 2, 0, (int)(paramBitmap.getHeight() * 2.5F), paramBitmap.getHeight());
      }
      for (;;)
      {
        i = (int)(f1 * 56.0F);
        j = 56;
        break;
        f1 = f2;
      }
      label303:
      f1 = f2;
    }
  }
  
  public static byte[] Q(Bitmap paramBitmap)
  {
    if ((paramBitmap == null) || (paramBitmap.isRecycled())) {
      return new byte[0];
    }
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    a(paramBitmap, Bitmap.CompressFormat.JPEG, 100, localByteArrayOutputStream);
    paramBitmap = localByteArrayOutputStream.toByteArray();
    try
    {
      localByteArrayOutputStream.close();
      return paramBitmap;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.BitmapUtil", localException, "", new Object[0]);
    }
    return paramBitmap;
  }
  
  public static byte[] R(Bitmap paramBitmap)
  {
    if ((paramBitmap == null) || (paramBitmap.isRecycled())) {
      return new byte[0];
    }
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    a(paramBitmap, Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
    paramBitmap = localByteArrayOutputStream.toByteArray();
    try
    {
      localByteArrayOutputStream.close();
      return paramBitmap;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.BitmapUtil", localException, "", new Object[0]);
    }
    return paramBitmap;
  }
  
  public static Bitmap S(Bitmap paramBitmap)
  {
    int i = paramBitmap.getHeight();
    Bitmap localBitmap = Bitmap.createBitmap(paramBitmap.getWidth(), i, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint();
    ColorMatrix localColorMatrix = new ColorMatrix();
    localColorMatrix.setSaturation(0.0F);
    localPaint.setColorFilter(new ColorMatrixColorFilter(localColorMatrix));
    localCanvas.drawBitmap(paramBitmap, 0.0F, 0.0F, localPaint);
    return localBitmap;
  }
  
  public static Bitmap T(Bitmap paramBitmap)
  {
    int i = paramBitmap.getHeight();
    Bitmap localBitmap = Bitmap.createBitmap(paramBitmap.getWidth(), i, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint();
    ColorMatrix localColorMatrix = new ColorMatrix();
    localColorMatrix.set(new float[] { 0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F });
    localPaint.setColorFilter(new ColorMatrixColorFilter(localColorMatrix));
    localCanvas.drawBitmap(paramBitmap, 0.0F, 0.0F, localPaint);
    return localBitmap;
  }
  
  public static BitmapFactory.Options VZ(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.BitmapUtil", "getImageOptions invalid path");
      return null;
    }
    try
    {
      paramString = d.openRead(paramString);
      return a(paramString, null, true);
    }
    catch (FileNotFoundException paramString)
    {
      x.printErrStackTrace("MicroMsg.BitmapUtil", paramString, "Decode bitmap failed.", new Object[0]);
    }
    return new BitmapFactory.Options();
  }
  
  public static Point Wa(String paramString)
  {
    paramString = VZ(paramString);
    if (paramString != null) {
      return new Point(paramString.outWidth, paramString.outHeight);
    }
    return null;
  }
  
  public static Bitmap Wb(String paramString)
  {
    return cU(paramString, 1);
  }
  
  public static int a(boolean paramBoolean, String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2, b paramb)
  {
    int i = 0;
    Bitmap localBitmap = a(paramString1, paramInt1, paramInt2, false, null, 0);
    if (localBitmap == null) {
      return -1;
    }
    Exif localExif = new Exif();
    try
    {
      paramInt1 = localExif.parseFromFile(paramString1);
      x.e("EXIFTEST", "parseFromFile ret = " + paramInt1);
      paramInt1 = localExif.getOrientationInDegree();
      paramString1 = b(localBitmap, paramInt1);
      if (paramb != null) {
        paramb.tZ();
      }
      if (paramBoolean) {
        try
        {
          paramInt1 = n.a(paramString1, paramInt3, paramString2);
          x.i("MicroMsg.BitmapUtil", "dkimgopt compressByQualityOptim ret:%d  [%d,%d,%d] path:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt3), Integer.valueOf(paramString1.getWidth()), Integer.valueOf(paramString1.getHeight()), paramString2 });
          return paramInt1;
        }
        catch (IOException paramString1)
        {
          x.e("MicroMsg.BitmapUtil", "create thumbnail from orig failed: " + paramString2);
          return -2;
        }
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.BitmapUtil", localIOException, "Can't read EXIF from " + paramString1, new Object[0]);
        paramInt1 = i;
      }
      a(paramString1, paramInt3, paramCompressFormat, paramString2, true);
    }
    return 1;
  }
  
  private static Bitmap a(int paramInt1, String paramString, boolean paramBoolean, float paramFloat, int paramInt2, int paramInt3)
  {
    return a(paramInt1, paramString, null, null, paramBoolean, paramFloat, paramInt2, paramInt3, null, 1, new int[0]);
  }
  
  private static Bitmap a(int paramInt1, String paramString, byte[] paramArrayOfByte, Uri paramUri, boolean paramBoolean, float paramFloat, int paramInt2, int paramInt3, MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger, int paramInt4, int... paramVarArgs)
  {
    int n = 0;
    int m = 0;
    if ((paramInt2 == 0) && (paramInt3 == 0)) {}
    for (int j = 1; (paramInt2 < 0) || (paramInt3 < 0); j = 0) {
      return null;
    }
    int k = n;
    try
    {
      BitmapFactory.Options localOptions2 = new BitmapFactory.Options();
      if (paramFloat != 0.0F)
      {
        k = n;
        localOptions2.inDensity = ((int)(160.0F * paramFloat));
      }
      BitmapFactory.Options localOptions1 = localOptions2;
      int i = m;
      if (j == 0)
      {
        k = n;
        localOptions2.inJustDecodeBounds = true;
        k = n;
        a(localOptions2, paramArrayOfByte, paramString, paramUri, paramBoolean, paramInt1, paramDecodeResultLogger, paramInt4, paramVarArgs);
        k = n;
        int i1 = localOptions2.outWidth;
        k = n;
        int i2 = localOptions2.outHeight;
        k = n;
        localOptions2 = new BitmapFactory.Options();
        k = n;
        localOptions2.inPreferredConfig = Bitmap.Config.ARGB_8888;
        if (i1 <= paramInt2)
        {
          localOptions1 = localOptions2;
          i = m;
          if (i2 <= paramInt3) {}
        }
        else
        {
          k = n;
          localOptions2.inSampleSize = ((int)Math.max(i1 / paramInt2, i2 / paramInt3));
          k = n;
          i = localOptions2.inSampleSize;
          localOptions1 = localOptions2;
        }
      }
      k = i;
      c(localOptions1);
      k = i;
      paramDecodeResultLogger = a(localOptions1, paramArrayOfByte, paramString, paramUri, paramBoolean, paramInt1, paramDecodeResultLogger, paramInt4, paramVarArgs);
      return paramDecodeResultLogger;
    }
    catch (Throwable paramDecodeResultLogger)
    {
      paramDecodeResultLogger = new BitmapFactory.Options();
      if (paramFloat != 0.0F) {
        paramDecodeResultLogger.inDensity = ((int)(160.0F * paramFloat));
      }
      paramDecodeResultLogger.inPreferredConfig = Bitmap.Config.RGB_565;
      if ((j == 0) && (k != 0)) {
        paramDecodeResultLogger.inSampleSize = k;
      }
      c(paramDecodeResultLogger);
      try
      {
        paramString = a(paramDecodeResultLogger, paramArrayOfByte, paramString, paramUri, paramBoolean, paramInt1, null, paramInt4, paramVarArgs);
        return paramString;
      }
      catch (Throwable paramString) {}
    }
    return null;
  }
  
  public static Bitmap a(Bitmap paramBitmap, float paramFloat1, float paramFloat2)
  {
    if (paramBitmap == null) {
      localObject = null;
    }
    do
    {
      return (Bitmap)localObject;
      if ((paramFloat1 <= 0.999D) || (paramFloat1 >= 1.001D) || (paramFloat2 <= 0.999D)) {
        break;
      }
      localObject = paramBitmap;
    } while (paramFloat2 < 1.001D);
    Object localObject = new Matrix();
    ((Matrix)localObject).reset();
    if ((paramFloat1 < 0.999D) || (paramFloat1 > 1.001D) || (paramFloat2 < 0.999D) || (paramFloat2 > 1.001D)) {
      ((Matrix)localObject).postScale(paramFloat1, paramFloat2);
    }
    localObject = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), (Matrix)localObject, true);
    StringBuilder localStringBuilder = new StringBuilder("resultBmp is null: ");
    if (localObject == null) {}
    for (boolean bool = true;; bool = false)
    {
      x.d("MicroMsg.BitmapUtil", bool + "  degree:0.0");
      if (paramBitmap != localObject)
      {
        x.i("MicroMsg.BitmapUtil", "rotateAndScale bitmap recycle asdfasdjfjasdfjsadfjdsa. %s", new Object[] { paramBitmap });
        paramBitmap.recycle();
      }
      return (Bitmap)localObject;
    }
  }
  
  public static Bitmap a(Bitmap paramBitmap, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramBitmap == null) || (paramInt1 < 0) || (paramInt2 < 0) || (paramInt3 < 0)) {
      return null;
    }
    long l = System.currentTimeMillis();
    Bitmap localBitmap = createBitmap(paramInt2, paramInt3, Bitmap.Config.ARGB_8888, false);
    Canvas localCanvas = new Canvas(localBitmap);
    x.d("MicroMsg.BitmapUtil", "bm size w %d h %d target w %d h %d", new Object[] { Integer.valueOf(paramBitmap.getWidth()), Integer.valueOf(paramBitmap.getHeight()), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    localCanvas.drawBitmap(paramBitmap, null, new Rect(0, 0, paramInt2, paramInt3), new Paint());
    x.d("MicroMsg.BitmapUtil", "create nine patch bitmap " + (System.currentTimeMillis() - l));
    return d(localBitmap, paramInt1);
  }
  
  public static Bitmap a(Bitmap paramBitmap, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    Object localObject2;
    if (paramBitmap == null) {
      localObject2 = null;
    }
    for (;;)
    {
      return (Bitmap)localObject2;
      int i = paramBitmap.getWidth();
      int j = paramBitmap.getHeight();
      float f2 = Math.max(paramInt1 / i, paramInt2 / j);
      float f1 = i * f2;
      f2 = j * f2;
      float f3 = (paramInt1 - f1) / 2.0F;
      float f4 = (paramInt2 - f2) / 2.0F;
      RectF localRectF = new RectF(f3, f4, f1 + f3, f2 + f4);
      localObject2 = paramBitmap.getConfig();
      Object localObject1 = localObject2;
      if (localObject2 == null)
      {
        x.w("MicroMsg.BitmapUtil", "get center crop bitmap, config is null");
        localObject1 = Bitmap.Config.ARGB_8888;
      }
      try
      {
        localObject1 = Bitmap.createBitmap(paramInt1, paramInt2, (Bitmap.Config)localObject1);
        new Canvas((Bitmap)localObject1).drawBitmap(paramBitmap, null, localRectF, null);
        localObject2 = localObject1;
        if (paramBoolean)
        {
          x.i("MicroMsg.BitmapUtil", "getCenterCropBitmap bitmap recycle %s", new Object[] { paramBitmap });
          paramBitmap.recycle();
          return (Bitmap)localObject1;
        }
      }
      catch (Throwable localThrowable1)
      {
        try
        {
          Bitmap localBitmap = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.RGB_565);
        }
        catch (Throwable localThrowable2)
        {
          x.e("MicroMsg.BitmapUtil", "BitmapUtil decode getCenterCropBitmap fail");
        }
      }
    }
    return paramBitmap;
  }
  
  public static Bitmap a(Bitmap paramBitmap, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBitmap == null)
    {
      x.e("MicroMsg.BitmapUtil", "extractThumbNail bitmap is null.");
      paramBitmap = null;
      return paramBitmap;
    }
    if ((paramInt1 <= 0) || (paramInt2 <= 0))
    {
      x.e("MicroMsg.BitmapUtil", "extractThumbNail height:" + paramInt1 + " width:" + paramInt2);
      return null;
    }
    Object localObject = new BitmapFactory.Options();
    c((BitmapFactory.Options)localObject);
    ((BitmapFactory.Options)localObject).outHeight = paramBitmap.getHeight();
    ((BitmapFactory.Options)localObject).outWidth = paramBitmap.getWidth();
    x.i("MicroMsg.BitmapUtil", "extractThumbNail: round=" + paramInt2 + "x" + paramInt1 + ", crop=" + paramBoolean1 + ", recycle=" + paramBoolean2);
    double d2 = ((BitmapFactory.Options)localObject).outHeight * 1.0D / paramInt1;
    double d3 = ((BitmapFactory.Options)localObject).outWidth * 1.0D / paramInt2;
    x.d("MicroMsg.BitmapUtil", "extractThumbNail: extract beX = " + d3 + ", beY = " + d2);
    double d1;
    if (paramBoolean1) {
      if (d2 > d3) {
        d1 = d3;
      }
    }
    for (;;)
    {
      ((BitmapFactory.Options)localObject).inSampleSize = ((int)d1);
      if (((BitmapFactory.Options)localObject).inSampleSize <= 1) {}
      for (((BitmapFactory.Options)localObject).inSampleSize = 1; ((BitmapFactory.Options)localObject).outHeight * ((BitmapFactory.Options)localObject).outWidth / ((BitmapFactory.Options)localObject).inSampleSize / ((BitmapFactory.Options)localObject).inSampleSize > 2764800; ((BitmapFactory.Options)localObject).inSampleSize += 1) {}
      d1 = d2;
      continue;
      if (d2 < d3) {
        d1 = d3;
      } else {
        d1 = d2;
      }
    }
    int j;
    int i;
    Bitmap localBitmap;
    if (paramBoolean1) {
      if (d2 > d3)
      {
        j = (int)Math.ceil(paramInt2 * 1.0D * ((BitmapFactory.Options)localObject).outHeight / ((BitmapFactory.Options)localObject).outWidth);
        i = paramInt2;
        ((BitmapFactory.Options)localObject).inJustDecodeBounds = false;
        x.i("MicroMsg.BitmapUtil", "bitmap required size=" + i + "x" + j + ", orig=" + ((BitmapFactory.Options)localObject).outWidth + "x" + ((BitmapFactory.Options)localObject).outHeight + ", sample=" + ((BitmapFactory.Options)localObject).inSampleSize);
        localBitmap = Bitmap.createScaledBitmap(paramBitmap, i, j, true);
        if (localBitmap == null) {
          break label811;
        }
        localObject = localBitmap;
        if (paramBoolean2)
        {
          localObject = localBitmap;
          if (paramBitmap != localBitmap)
          {
            x.i("MicroMsg.BitmapUtil", "extractThumbNail bitmap recycle asdfjasjdfja asdfasd. %s", new Object[] { paramBitmap });
            paramBitmap.recycle();
          }
        }
      }
    }
    label811:
    for (localObject = localBitmap;; localObject = paramBitmap)
    {
      if (paramBoolean1)
      {
        i = paramInt2;
        if (((Bitmap)localObject).getWidth() < paramInt2)
        {
          x.e("MicroMsg.BitmapUtil", "bmw < width %d %d", new Object[] { Integer.valueOf(((Bitmap)localObject).getWidth()), Integer.valueOf(paramInt2) });
          i = ((Bitmap)localObject).getWidth();
        }
        paramInt2 = paramInt1;
        if (((Bitmap)localObject).getHeight() < paramInt1)
        {
          x.e("MicroMsg.BitmapUtil", "bmh < height %d %d", new Object[] { Integer.valueOf(((Bitmap)localObject).getHeight()), Integer.valueOf(paramInt1) });
          paramInt2 = ((Bitmap)localObject).getHeight();
        }
        localBitmap = Bitmap.createBitmap((Bitmap)localObject, ((Bitmap)localObject).getWidth() - i >> 1, ((Bitmap)localObject).getHeight() - paramInt2 >> 1, i, paramInt2);
        paramBitmap = (Bitmap)localObject;
        if (localBitmap == null) {
          break;
        }
        if ((paramBoolean2) && (localObject != localBitmap))
        {
          x.i("MicroMsg.BitmapUtil", "extractThumbNail bitmap recycle ajdfjajsdfjdsajjfsad. %s", new Object[] { localObject });
          ((Bitmap)localObject).recycle();
        }
        x.d("MicroMsg.BitmapUtil", "bitmap croped size=" + localBitmap.getWidth() + "x" + localBitmap.getHeight());
      }
      for (paramBitmap = localBitmap;; paramBitmap = (Bitmap)localObject)
      {
        return paramBitmap;
        i = (int)Math.ceil(paramInt1 * 1.0D * ((BitmapFactory.Options)localObject).outWidth / ((BitmapFactory.Options)localObject).outHeight);
        j = paramInt1;
        break;
        if (d2 < d3)
        {
          j = (int)Math.ceil(paramInt2 * 1.0D * ((BitmapFactory.Options)localObject).outHeight / ((BitmapFactory.Options)localObject).outWidth);
          i = paramInt2;
          break;
        }
        i = (int)Math.ceil(paramInt1 * 1.0D * ((BitmapFactory.Options)localObject).outWidth / ((BitmapFactory.Options)localObject).outHeight);
        j = paramInt1;
        break;
      }
    }
  }
  
  public static Bitmap a(Bitmap paramBitmap, boolean paramBoolean, float paramFloat)
  {
    return a(paramBitmap, paramBoolean, paramFloat, false);
  }
  
  public static Bitmap a(Bitmap paramBitmap, boolean paramBoolean1, float paramFloat, boolean paramBoolean2)
  {
    if ((paramBitmap == null) || (paramBitmap.isRecycled())) {
      x.e("MicroMsg.BitmapUtil", "getRoundedCornerBitmap in bitmap is null");
    }
    Bitmap localBitmap;
    do
    {
      return null;
      localBitmap = createBitmap(paramBitmap.getWidth(), paramBitmap.getHeight(), Bitmap.Config.ARGB_8888, paramBoolean2);
    } while (localBitmap == null);
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint();
    Rect localRect = new Rect(0, 0, paramBitmap.getWidth(), paramBitmap.getHeight());
    RectF localRectF = new RectF(localRect);
    localPaint.setAntiAlias(true);
    localPaint.setDither(true);
    localPaint.setFilterBitmap(true);
    localCanvas.drawARGB(0, 0, 0, 0);
    localPaint.setColor(-4144960);
    localCanvas.drawRoundRect(localRectF, paramFloat, paramFloat, localPaint);
    localPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    localCanvas.drawBitmap(paramBitmap, localRect, localRect, localPaint);
    if (paramBoolean1)
    {
      x.i("MicroMsg.BitmapUtil", "getRoundedCornerBitmap bitmap recycle %s", new Object[] { paramBitmap });
      paramBitmap.recycle();
    }
    return localBitmap;
  }
  
  private static Bitmap a(BitmapFactory.Options paramOptions, byte[] paramArrayOfByte, String paramString, Uri paramUri, boolean paramBoolean, int paramInt1, MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger, int paramInt2, int... paramVarArgs)
  {
    Object localObject2 = null;
    if ((bi.bC(paramArrayOfByte)) && (bi.oW(paramString)) && (paramUri == null) && (paramInt1 <= 0)) {}
    for (;;)
    {
      return null;
      if (!bi.bC(paramArrayOfByte)) {}
      for (int i = 1; i != 0; i = 0) {
        return MMBitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length, paramOptions, paramDecodeResultLogger, paramInt2, paramVarArgs);
      }
      if (paramInt1 > 0) {
        return a.decodeResource(ad.getContext().getResources(), paramInt1, paramOptions);
      }
      Object localObject1;
      if (paramBoolean) {
        localObject1 = localObject2;
      }
      try
      {
        if (bi.oW(paramString)) {
          continue;
        }
        localObject1 = localObject2;
        paramArrayOfByte = ad.getContext().getAssets().open(paramString);
        for (;;)
        {
          localObject1 = paramArrayOfByte;
          paramOptions = MMBitmapFactory.decodeStream(paramArrayOfByte, null, paramOptions, paramDecodeResultLogger, paramInt2, paramVarArgs);
          if (paramArrayOfByte == null) {
            return paramOptions;
          }
          try
          {
            paramArrayOfByte.close();
            return paramOptions;
          }
          catch (IOException paramArrayOfByte)
          {
            return paramOptions;
          }
          if (paramUri != null)
          {
            localObject1 = localObject2;
            paramArrayOfByte = ad.getContext().getContentResolver().openInputStream(paramUri);
          }
          else
          {
            localObject1 = localObject2;
            paramArrayOfByte = d.openRead(paramString);
          }
        }
        return paramOptions;
      }
      finally
      {
        if (localObject1 != null) {}
        try
        {
          ((InputStream)localObject1).close();
          throw paramOptions;
        }
        catch (IOException paramArrayOfByte)
        {
          for (;;) {}
        }
      }
    }
  }
  
  public static Bitmap a(InputStream paramInputStream, float paramFloat)
  {
    return a(paramInputStream, paramFloat, 0, 0);
  }
  
  public static Bitmap a(InputStream paramInputStream, float paramFloat, int paramInt1, int paramInt2)
  {
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    if (paramFloat != 0.0F) {
      localOptions.inDensity = ((int)(160.0F * paramFloat));
    }
    Object localObject;
    int i;
    if (paramInt1 == 0)
    {
      localObject = paramInputStream;
      if (paramInt2 == 0) {}
    }
    else
    {
      i = paramInt1;
      if (paramInt1 == 0) {
        i = Integer.MAX_VALUE;
      }
      paramInt1 = paramInt2;
      if (paramInt2 == 0) {
        paramInt1 = Integer.MAX_VALUE;
      }
      if (!(paramInputStream instanceof FileInputStream)) {
        break label183;
      }
      localObject = new i((FileInputStream)paramInputStream);
    }
    for (;;)
    {
      ((InputStream)localObject).mark(25165824);
      localOptions.inJustDecodeBounds = true;
      MMBitmapFactory.decodeStream((InputStream)localObject, null, localOptions);
      paramInt2 = localOptions.outWidth;
      int j = localOptions.outHeight;
      if ((paramInt2 > i) || (j > paramInt1)) {
        localOptions.inSampleSize = ((int)Math.max(paramInt2 / i, j / paramInt1));
      }
      localOptions.inJustDecodeBounds = false;
      try
      {
        ((InputStream)localObject).reset();
        localOptions.inPreferredConfig = Bitmap.Config.ARGB_8888;
        c(localOptions);
        try
        {
          paramInputStream = MMBitmapFactory.decodeStream((InputStream)localObject, null, localOptions);
          return paramInputStream;
        }
        catch (OutOfMemoryError paramInputStream)
        {
          label183:
          localOptions.inPreferredConfig = Bitmap.Config.RGB_565;
          c(localOptions);
          try
          {
            paramInputStream = MMBitmapFactory.decodeStream((InputStream)localObject, null, localOptions);
            return paramInputStream;
          }
          catch (OutOfMemoryError paramInputStream)
          {
            x.e("MicroMsg.BitmapUtil", "decodeStream OutOfMemoryError return null");
          }
        }
        localObject = paramInputStream;
        if (!paramInputStream.markSupported()) {
          localObject = new BufferedInputStream(paramInputStream, 65536);
        }
      }
      catch (IOException paramInputStream)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.BitmapUtil", paramInputStream, "Failed seeking InputStream.", new Object[0]);
        }
      }
    }
    return null;
  }
  
  @TargetApi(11)
  private static Bitmap a(InputStream paramInputStream, int paramInt1, int paramInt2, boolean paramBoolean, MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger, int paramInt3)
  {
    if ((paramInt2 <= 0) || (paramInt1 <= 0))
    {
      x.e("MicroMsg.BitmapUtil", "extractThumbNail height:" + paramInt2 + " width:" + paramInt1);
      paramDecodeResultLogger = null;
      return paramDecodeResultLogger;
    }
    label72:
    Object localObject;
    if (!paramInputStream.markSupported()) {
      if ((paramInputStream instanceof FileInputStream))
      {
        paramInputStream = new i((FileInputStream)paramInputStream);
        localObject = new BitmapFactory.Options();
      }
    }
    for (;;)
    {
      int m;
      try
      {
        ((BitmapFactory.Options)localObject).inJustDecodeBounds = true;
        paramInputStream.mark(8388608);
        Bitmap localBitmap = MMBitmapFactory.decodeStream(paramInputStream, null, (BitmapFactory.Options)localObject, paramDecodeResultLogger, paramInt3, new int[0]);
        paramInputStream.reset();
        if (localBitmap != null)
        {
          x.i("MicroMsg.BitmapUtil", "extractThumeNail bitmap recycle, adsf. %s", new Object[] { localBitmap });
          localBitmap.recycle();
        }
        if ((((BitmapFactory.Options)localObject).outHeight <= 0) || (((BitmapFactory.Options)localObject).outWidth <= 0))
        {
          x.e("MicroMsg.BitmapUtil", "decode[%s] error, outHeight[%d] outWidth[%d]", new Object[] { paramInputStream, Integer.valueOf(((BitmapFactory.Options)localObject).outHeight), Integer.valueOf(((BitmapFactory.Options)localObject).outWidth) });
          return null;
          if (paramInputStream.markSupported()) {
            break label1118;
          }
          paramInputStream = new BufferedInputStream(paramInputStream);
          break label72;
        }
        x.i("MicroMsg.BitmapUtil", "extractThumbNail: round=" + paramInt1 + "x" + paramInt2 + ", crop=" + paramBoolean);
        d2 = ((BitmapFactory.Options)localObject).outHeight * 1.0D / paramInt2;
        d3 = ((BitmapFactory.Options)localObject).outWidth * 1.0D / paramInt1;
        x.d("MicroMsg.BitmapUtil", "extractThumbNail: extract beX = " + d3 + ", beY = " + d2);
        if (paramBoolean) {
          if (d2 > d3)
          {
            d1 = d3;
            ((BitmapFactory.Options)localObject).inSampleSize = ((int)d1);
            if (((BitmapFactory.Options)localObject).inSampleSize <= 1) {
              ((BitmapFactory.Options)localObject).inSampleSize = 1;
            }
            if (((BitmapFactory.Options)localObject).outHeight * ((BitmapFactory.Options)localObject).outWidth / ((BitmapFactory.Options)localObject).inSampleSize / ((BitmapFactory.Options)localObject).inSampleSize <= 2764800) {
              continue;
            }
            ((BitmapFactory.Options)localObject).inSampleSize += 1;
            continue;
          }
        }
      }
      catch (OutOfMemoryError paramInputStream)
      {
        double d2;
        double d3;
        x.e("MicroMsg.BitmapUtil", "decode bitmap failed: " + paramInputStream.getMessage());
        return null;
        double d1 = d2;
        continue;
        if (d2 < d3)
        {
          d1 = d3;
          continue;
        }
        d1 = d2;
        continue;
        if (paramBoolean)
        {
          if (d2 > d3)
          {
            d1 = paramInt1;
            j = (int)Math.ceil(d1 * 1.0D * ((BitmapFactory.Options)localObject).outHeight / ((BitmapFactory.Options)localObject).outWidth);
            i = paramInt1;
            break label1121;
            ((BitmapFactory.Options)localObject).inJustDecodeBounds = false;
            if (Build.VERSION.SDK_INT >= 11) {
              ((BitmapFactory.Options)localObject).inMutable = true;
            }
            x.i("MicroMsg.BitmapUtil", "bitmap required size=" + i + "x" + j + ", orig=" + ((BitmapFactory.Options)localObject).outWidth + "x" + ((BitmapFactory.Options)localObject).outHeight + ", sample=" + ((BitmapFactory.Options)localObject).inSampleSize);
            c((BitmapFactory.Options)localObject);
            paramInputStream = MMBitmapFactory.decodeStream(paramInputStream, null, (BitmapFactory.Options)localObject, paramDecodeResultLogger, paramInt3, new int[0]);
            if (paramInputStream == null)
            {
              x.e("MicroMsg.BitmapUtil", "bitmap decode failed");
              return null;
            }
          }
          else
          {
            i = (int)Math.ceil(paramInt2 * 1.0D * ((BitmapFactory.Options)localObject).outWidth / ((BitmapFactory.Options)localObject).outHeight);
            j = paramInt2;
            break label1121;
          }
        }
        else
        {
          if (d2 < d3)
          {
            j = (int)Math.ceil(paramInt1 * 1.0D * ((BitmapFactory.Options)localObject).outHeight / ((BitmapFactory.Options)localObject).outWidth);
            i = paramInt1;
            break label1121;
          }
          i = (int)Math.ceil(paramInt2 * 1.0D * ((BitmapFactory.Options)localObject).outWidth / ((BitmapFactory.Options)localObject).outHeight);
          j = paramInt2;
          break label1121;
        }
        x.d("MicroMsg.BitmapUtil", "bitmap decoded size=" + paramInputStream.getWidth() + "x" + paramInputStream.getHeight());
        paramDecodeResultLogger = Bitmap.createScaledBitmap(paramInputStream, i, j, true);
        if ((paramInputStream != paramDecodeResultLogger) && (paramDecodeResultLogger != null))
        {
          x.i("MicroMsg.BitmapUtil", "extractThumbNail bitmap recycle adsfad. %s", new Object[] { paramInputStream });
          paramInputStream.recycle();
          paramInputStream = paramDecodeResultLogger;
          if (paramBoolean)
          {
            paramInt3 = paramInt1;
            if (paramInputStream.getWidth() < paramInt1)
            {
              x.e("MicroMsg.BitmapUtil", "bmw < width %d %d", new Object[] { Integer.valueOf(paramInputStream.getWidth()), Integer.valueOf(paramInt1) });
              paramInt3 = paramInputStream.getWidth();
            }
            i = paramInt2;
            if (paramInputStream.getHeight() < paramInt2)
            {
              x.e("MicroMsg.BitmapUtil", "bmh < height %d %d", new Object[] { Integer.valueOf(paramInputStream.getHeight()), Integer.valueOf(paramInt2) });
              i = paramInputStream.getHeight();
            }
            paramInt2 = paramInputStream.getWidth() - paramInt3 >> 1;
            m = paramInputStream.getHeight() - i >> 1;
            if (paramInt2 >= 0)
            {
              j = m;
              k = paramInt2;
              if (m >= 0) {}
            }
            else
            {
              x.e("MicroMsg.BitmapUtil", "fix crop image error %d %d %d %d", new Object[] { Integer.valueOf(paramInputStream.getWidth()), Integer.valueOf(paramInputStream.getHeight()), Integer.valueOf(paramInt3), Integer.valueOf(i) });
              paramInt1 = paramInt2;
              if (paramInt2 >= 0) {
                break label1146;
              }
              paramInt1 = 0;
              break label1146;
            }
            localObject = Bitmap.createBitmap(paramInputStream, k, j, paramInt3, i);
            paramDecodeResultLogger = paramInputStream;
            if (localObject == null) {
              break;
            }
            if (localObject != paramInputStream)
            {
              x.i("MicroMsg.BitmapUtil", "extractThumbNail bitmap recycle adsfaasdfad. %s", new Object[] { paramInputStream });
              paramInputStream.recycle();
              paramInputStream = (InputStream)localObject;
              x.d("MicroMsg.BitmapUtil", "bitmap croped size=" + paramInputStream.getWidth() + "x" + paramInputStream.getHeight());
              return paramInputStream;
            }
          }
        }
      }
      catch (IOException paramInputStream)
      {
        x.printErrStackTrace("MicroMsg.BitmapUtil", paramInputStream, "Failed decode bitmap", new Object[0]);
        continue;
        continue;
        continue;
        continue;
      }
      label1118:
      break label72;
      label1121:
      if (j > 0) {}
      for (;;)
      {
        if (i <= 0) {
          break label1140;
        }
        break;
        j = 1;
      }
      label1140:
      int i = 1;
      continue;
      label1146:
      int j = m;
      int k = paramInt1;
      if (m < 0)
      {
        j = 0;
        k = paramInt1;
      }
    }
  }
  
  public static Bitmap a(String paramString, int paramInt1, int paramInt2, float paramFloat, MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger, int paramInt3, int... paramVarArgs)
  {
    return a(0, paramString, null, null, false, paramFloat, paramInt1, paramInt2, paramDecodeResultLogger, paramInt3, paramVarArgs);
  }
  
  public static Bitmap a(String paramString, int paramInt1, int paramInt2, MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger, int paramInt3, int... paramVarArgs)
  {
    return a(paramString, paramInt1, paramInt2, 0.0F, paramDecodeResultLogger, paramInt3, paramVarArgs);
  }
  
  /* Error */
  public static Bitmap a(String paramString, int paramInt1, int paramInt2, boolean paramBoolean, MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger, int paramInt3)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 177	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   4: ifeq +13 -> 17
    //   7: ldc 40
    //   9: ldc_w 604
    //   12: invokestatic 182	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   15: aconst_null
    //   16: areturn
    //   17: aload_0
    //   18: invokestatic 188	com/tencent/mm/vfs/d:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   21: astore_0
    //   22: aload_0
    //   23: iload_2
    //   24: iload_1
    //   25: iload_3
    //   26: aload 4
    //   28: iload 5
    //   30: invokestatic 606	com/tencent/mm/sdk/platformtools/c:a	(Ljava/io/InputStream;IIZLcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;I)Landroid/graphics/Bitmap;
    //   33: astore 4
    //   35: aload_0
    //   36: ifnull +7 -> 43
    //   39: aload_0
    //   40: invokevirtual 517	java/io/InputStream:close	()V
    //   43: aload 4
    //   45: areturn
    //   46: astore 4
    //   48: aconst_null
    //   49: astore_0
    //   50: ldc 40
    //   52: aload 4
    //   54: ldc_w 608
    //   57: iconst_0
    //   58: anewarray 4	java/lang/Object
    //   61: invokestatic 119	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   64: aload_0
    //   65: ifnull +7 -> 72
    //   68: aload_0
    //   69: invokevirtual 517	java/io/InputStream:close	()V
    //   72: aconst_null
    //   73: areturn
    //   74: astore 4
    //   76: aconst_null
    //   77: astore_0
    //   78: aload_0
    //   79: ifnull +7 -> 86
    //   82: aload_0
    //   83: invokevirtual 517	java/io/InputStream:close	()V
    //   86: aload 4
    //   88: athrow
    //   89: astore_0
    //   90: goto -47 -> 43
    //   93: astore_0
    //   94: goto -22 -> 72
    //   97: astore_0
    //   98: goto -12 -> 86
    //   101: astore 4
    //   103: goto -25 -> 78
    //   106: astore 4
    //   108: goto -30 -> 78
    //   111: astore 4
    //   113: goto -63 -> 50
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	116	0	paramString	String
    //   0	116	1	paramInt1	int
    //   0	116	2	paramInt2	int
    //   0	116	3	paramBoolean	boolean
    //   0	116	4	paramDecodeResultLogger	MMBitmapFactory.DecodeResultLogger
    //   0	116	5	paramInt3	int
    // Exception table:
    //   from	to	target	type
    //   17	22	46	java/io/FileNotFoundException
    //   17	22	74	finally
    //   39	43	89	java/io/IOException
    //   68	72	93	java/io/IOException
    //   82	86	97	java/io/IOException
    //   22	35	101	finally
    //   50	64	106	finally
    //   22	35	111	java/io/FileNotFoundException
  }
  
  /* Error */
  public static Bitmap a(String paramString, BitmapFactory.Options paramOptions, int paramInt, int... paramVarArgs)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +116 -> 117
    //   4: new 195	android/graphics/BitmapFactory$Options
    //   7: dup
    //   8: invokespecial 196	android/graphics/BitmapFactory$Options:<init>	()V
    //   11: astore 4
    //   13: aload_0
    //   14: invokestatic 188	com/tencent/mm/vfs/d:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   17: astore_1
    //   18: aload 4
    //   20: invokestatic 299	com/tencent/mm/sdk/platformtools/c:c	(Landroid/graphics/BitmapFactory$Options;)V
    //   23: aload_1
    //   24: aconst_null
    //   25: aload 4
    //   27: aconst_null
    //   28: iload_2
    //   29: aload_3
    //   30: invokestatic 514	com/tencent/mm/sdk/platformtools/MMBitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;I[I)Landroid/graphics/Bitmap;
    //   33: astore_3
    //   34: aload_1
    //   35: ifnull +7 -> 42
    //   38: aload_1
    //   39: invokevirtual 517	java/io/InputStream:close	()V
    //   42: aload_3
    //   43: areturn
    //   44: astore_3
    //   45: aconst_null
    //   46: astore_1
    //   47: ldc 40
    //   49: ldc_w 611
    //   52: iconst_2
    //   53: anewarray 4	java/lang/Object
    //   56: dup
    //   57: iconst_0
    //   58: aload_0
    //   59: aastore
    //   60: dup
    //   61: iconst_1
    //   62: aload_3
    //   63: invokevirtual 612	java/io/IOException:getMessage	()Ljava/lang/String;
    //   66: aastore
    //   67: invokestatic 419	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   70: aload_1
    //   71: ifnull +7 -> 78
    //   74: aload_1
    //   75: invokevirtual 517	java/io/InputStream:close	()V
    //   78: aconst_null
    //   79: areturn
    //   80: astore_0
    //   81: aconst_null
    //   82: astore_1
    //   83: aload_1
    //   84: ifnull +7 -> 91
    //   87: aload_1
    //   88: invokevirtual 517	java/io/InputStream:close	()V
    //   91: aload_0
    //   92: athrow
    //   93: astore_0
    //   94: goto -52 -> 42
    //   97: astore_0
    //   98: goto -20 -> 78
    //   101: astore_1
    //   102: goto -11 -> 91
    //   105: astore_0
    //   106: goto -23 -> 83
    //   109: astore_0
    //   110: goto -27 -> 83
    //   113: astore_3
    //   114: goto -67 -> 47
    //   117: aload_1
    //   118: astore 4
    //   120: goto -107 -> 13
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	123	0	paramString	String
    //   0	123	1	paramOptions	BitmapFactory.Options
    //   0	123	2	paramInt	int
    //   0	123	3	paramVarArgs	int[]
    //   11	108	4	localOptions	BitmapFactory.Options
    // Exception table:
    //   from	to	target	type
    //   13	18	44	java/io/IOException
    //   13	18	80	finally
    //   38	42	93	java/io/IOException
    //   74	78	97	java/io/IOException
    //   87	91	101	java/io/IOException
    //   18	34	105	finally
    //   47	70	109	finally
    //   18	34	113	java/io/IOException
  }
  
  public static Bitmap a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int... paramVarArgs)
  {
    if (bi.bC(paramArrayOfByte))
    {
      x.w("MicroMsg.BitmapUtil", "error input: data is null");
      return null;
    }
    if ((paramInt1 < 0) || (paramInt2 < 0))
    {
      x.w("MicroMsg.BitmapUtil", "error input: targetWidth %d, targetHeight %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      return null;
    }
    return a(0, null, paramArrayOfByte, null, false, 0.0F, paramInt1, paramInt2, null, 0, paramVarArgs);
  }
  
  public static BitmapFactory.Options a(InputStream paramInputStream, MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger, boolean paramBoolean)
  {
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    c(localOptions);
    if (paramInputStream == null)
    {
      x.e("MicroMsg.BitmapUtil", "getImageOptions decode stream is null!!");
      return localOptions;
    }
    if (!paramBoolean)
    {
      Object localObject = paramInputStream;
      if (!paramInputStream.markSupported())
      {
        if (!(paramInputStream instanceof FileInputStream)) {
          break label141;
        }
        localObject = new i((FileInputStream)paramInputStream);
      }
      for (;;)
      {
        ((InputStream)localObject).mark(8388608);
        paramInputStream = (InputStream)localObject;
        try
        {
          for (;;)
          {
            paramDecodeResultLogger = MMBitmapFactory.decodeStream(paramInputStream, null, localOptions, paramDecodeResultLogger, 0, new int[0]);
            if (paramDecodeResultLogger != null)
            {
              x.i("MicroMsg.BitmapUtil", "getImageOptions bitmap recycle. %s", new Object[] { paramDecodeResultLogger });
              paramDecodeResultLogger.recycle();
            }
            if (paramBoolean)
            {
              try
              {
                paramInputStream.close();
                return localOptions;
              }
              catch (IOException paramInputStream)
              {
                x.printErrStackTrace("MicroMsg.BitmapUtil", paramInputStream, "hy: stream close failed ", new Object[0]);
                return localOptions;
              }
              label141:
              localObject = new BufferedInputStream(paramInputStream);
              break;
            }
            x.w("MicroMsg.BitmapUtil", "hy: not auto close. reset for invoker");
            try
            {
              paramInputStream.reset();
              return localOptions;
            }
            catch (Exception paramInputStream)
            {
              x.printErrStackTrace("MicroMsg.BitmapUtil", paramInputStream, "hy: stream reset failed", new Object[0]);
              return localOptions;
            }
          }
        }
        catch (OutOfMemoryError paramDecodeResultLogger)
        {
          x.printErrStackTrace("MicroMsg.BitmapUtil", paramDecodeResultLogger, "Decode bitmap failed.", new Object[0]);
          if (paramBoolean) {
            try
            {
              paramInputStream.close();
              return localOptions;
            }
            catch (IOException paramInputStream)
            {
              x.printErrStackTrace("MicroMsg.BitmapUtil", paramInputStream, "hy: stream close failed ", new Object[0]);
              return localOptions;
            }
          }
          x.w("MicroMsg.BitmapUtil", "hy: not auto close. reset for invoker");
          try
          {
            paramInputStream.reset();
            return localOptions;
          }
          catch (Exception paramInputStream)
          {
            x.printErrStackTrace("MicroMsg.BitmapUtil", paramInputStream, "hy: stream reset failed", new Object[0]);
            return localOptions;
          }
        }
        finally
        {
          if (paramBoolean) {}
          for (;;)
          {
            try
            {
              paramInputStream.close();
              throw paramDecodeResultLogger;
            }
            catch (IOException paramInputStream)
            {
              x.printErrStackTrace("MicroMsg.BitmapUtil", paramInputStream, "hy: stream close failed ", new Object[0]);
              continue;
            }
            x.w("MicroMsg.BitmapUtil", "hy: not auto close. reset for invoker");
            try
            {
              paramInputStream.reset();
            }
            catch (Exception paramInputStream)
            {
              x.printErrStackTrace("MicroMsg.BitmapUtil", paramInputStream, "hy: stream reset failed", new Object[0]);
            }
          }
        }
      }
    }
  }
  
  public static void a(Bitmap paramBitmap, int paramInt, Bitmap.CompressFormat paramCompressFormat, OutputStream paramOutputStream, boolean paramBoolean)
  {
    a(paramBitmap, paramCompressFormat, paramInt, paramOutputStream);
    if (paramBoolean)
    {
      x.i("MicroMsg.BitmapUtil", "saveBitmapToStream bitmap recycle. %s", new Object[] { paramBitmap });
      paramBitmap.recycle();
    }
  }
  
  /* Error */
  public static void a(Bitmap paramBitmap, int paramInt, Bitmap.CompressFormat paramCompressFormat, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aconst_null
    //   4: astore 7
    //   6: aload_3
    //   7: invokestatic 177	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   10: ifeq +14 -> 24
    //   13: new 221	java/io/IOException
    //   16: dup
    //   17: ldc_w 634
    //   20: invokespecial 635	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   23: athrow
    //   24: ldc 40
    //   26: new 42	java/lang/StringBuilder
    //   29: dup
    //   30: ldc_w 637
    //   33: invokespecial 47	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   36: aload_3
    //   37: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: invokevirtual 60	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   43: invokestatic 66	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   46: new 639	com/tencent/mm/vfs/b
    //   49: dup
    //   50: new 639	com/tencent/mm/vfs/b
    //   53: dup
    //   54: aload_3
    //   55: invokespecial 640	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   58: invokevirtual 644	com/tencent/mm/vfs/b:cBX	()Landroid/net/Uri;
    //   61: invokespecial 647	com/tencent/mm/vfs/b:<init>	(Landroid/net/Uri;)V
    //   64: invokevirtual 650	com/tencent/mm/vfs/b:cBV	()Landroid/net/Uri;
    //   67: astore 5
    //   69: aload 5
    //   71: ifnonnull +51 -> 122
    //   74: aconst_null
    //   75: astore 5
    //   77: aload 5
    //   79: invokestatic 653	com/tencent/mm/vfs/d:mL	(Ljava/lang/String;)Z
    //   82: pop
    //   83: aload 7
    //   85: astore 5
    //   87: aload_3
    //   88: invokestatic 657	com/tencent/mm/vfs/d:mG	(Ljava/lang/String;)Ljava/io/OutputStream;
    //   91: astore 7
    //   93: aload 7
    //   95: astore 5
    //   97: aload 7
    //   99: astore 6
    //   101: aload_0
    //   102: iload_1
    //   103: aload_2
    //   104: aload 7
    //   106: iload 4
    //   108: invokestatic 659	com/tencent/mm/sdk/platformtools/c:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/io/OutputStream;Z)V
    //   111: aload 7
    //   113: ifnull +8 -> 121
    //   116: aload 7
    //   118: invokevirtual 662	java/io/OutputStream:close	()V
    //   121: return
    //   122: aload 5
    //   124: invokevirtual 665	android/net/Uri:toString	()Ljava/lang/String;
    //   127: astore 5
    //   129: goto -52 -> 77
    //   132: astore_0
    //   133: aload 5
    //   135: astore 6
    //   137: ldc 40
    //   139: aload_0
    //   140: ldc_w 667
    //   143: iconst_1
    //   144: anewarray 4	java/lang/Object
    //   147: dup
    //   148: iconst_0
    //   149: aload_3
    //   150: aastore
    //   151: invokestatic 119	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   154: aload 5
    //   156: astore 6
    //   158: new 221	java/io/IOException
    //   161: dup
    //   162: aload_0
    //   163: invokespecial 670	java/io/IOException:<init>	(Ljava/lang/Throwable;)V
    //   166: athrow
    //   167: astore_0
    //   168: aload 6
    //   170: ifnull +8 -> 178
    //   173: aload 6
    //   175: invokevirtual 662	java/io/OutputStream:close	()V
    //   178: aload_0
    //   179: athrow
    //   180: astore_0
    //   181: return
    //   182: astore_2
    //   183: goto -5 -> 178
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	186	0	paramBitmap	Bitmap
    //   0	186	1	paramInt	int
    //   0	186	2	paramCompressFormat	Bitmap.CompressFormat
    //   0	186	3	paramString	String
    //   0	186	4	paramBoolean	boolean
    //   67	88	5	localObject1	Object
    //   1	173	6	localObject2	Object
    //   4	113	7	localOutputStream	OutputStream
    // Exception table:
    //   from	to	target	type
    //   87	93	132	java/lang/Exception
    //   101	111	132	java/lang/Exception
    //   87	93	167	finally
    //   101	111	167	finally
    //   137	154	167	finally
    //   158	167	167	finally
    //   116	121	180	java/io/IOException
    //   173	178	182	java/io/IOException
  }
  
  public static void a(Canvas paramCanvas, View paramView)
  {
    paramView.draw(paramCanvas);
    paramView = j(paramView, (int)paramView.getX(), (int)paramView.getY());
    if (paramView.size() > 0)
    {
      paramView = paramView.iterator();
      while (paramView.hasNext())
      {
        r localr = (r)paramView.next();
        if ((localr != null) && (localr.sFP != null))
        {
          Object localObject = localr.sFP;
          localObject = ((TextureView)localObject).getBitmap(((TextureView)localObject).getWidth(), ((TextureView)localObject).getHeight());
          if ((localObject == null) || (((Bitmap)localObject).isRecycled())) {
            x.e("MicroMsg.BitmapUtil", "get thumb bitmap null or is recycled");
          } else {
            paramCanvas.drawBitmap((Bitmap)localObject, localr.left, localr.top, null);
          }
        }
      }
    }
  }
  
  private static boolean a(Bitmap paramBitmap, Bitmap.CompressFormat paramCompressFormat, int paramInt, OutputStream paramOutputStream)
  {
    if (paramBitmap == null)
    {
      x.e("MicroMsg.BitmapUtil", "bitmap error %s", new Object[] { paramBitmap });
      return false;
    }
    boolean bool = paramBitmap.compress(paramCompressFormat, paramInt, paramOutputStream);
    if (!bool) {
      x.e("MicroMsg.BitmapUtil", "compress error %s", new Object[] { bi.cjd().toString() });
    }
    return bool;
  }
  
  public static boolean a(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2)
  {
    return b(paramString1, paramInt1, paramInt2, paramCompressFormat, paramInt3, paramString2);
  }
  
  public static boolean a(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2, String paramString3)
  {
    return b(paramString1, paramInt1, paramInt2, paramCompressFormat, paramInt3, paramString2 + paramString3);
  }
  
  private static boolean a(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2, boolean paramBoolean, PInt paramPInt1, PInt paramPInt2)
  {
    return a(paramString1, paramInt1, paramInt2, paramCompressFormat, paramInt3, paramString2, paramBoolean, paramPInt1, paramPInt2, false);
  }
  
  private static boolean a(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2, boolean paramBoolean1, PInt paramPInt1, PInt paramPInt2, boolean paramBoolean2)
  {
    Bitmap localBitmap = e(paramString1, paramInt1, paramInt2, paramBoolean2);
    if (localBitmap == null) {
      return false;
    }
    if (paramBoolean1)
    {
      paramInt1 = 0;
      Exif localExif = new Exif();
      try
      {
        paramInt2 = localExif.parseFromFile(paramString1);
        x.e("EXIFTEST", "parseFromFile ret = " + paramInt2);
        paramInt2 = localExif.getOrientationInDegree();
        paramInt1 = paramInt2;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          try
          {
            paramPInt1.value = paramString1.getWidth();
            paramPInt2.value = paramString1.getHeight();
            a(paramString1, paramInt3, paramCompressFormat, paramString2, true);
            return true;
          }
          catch (IOException paramString1)
          {
            x.e("MicroMsg.BitmapUtil", "create thumbnail from orig failed: " + paramString2);
            return false;
          }
          localIOException = localIOException;
          x.printErrStackTrace("MicroMsg.BitmapUtil", localIOException, "Can't read EXIF from " + paramString1, new Object[0]);
        }
      }
    }
    for (paramString1 = b(localBitmap, paramInt1);; paramString1 = localBitmap) {}
  }
  
  public static boolean a(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, String paramString2, PInt paramPInt1, PInt paramPInt2)
  {
    return a(paramString1, paramInt1, paramInt2, paramCompressFormat, 80, paramString2, true, paramPInt1, paramPInt2, true);
  }
  
  public static boolean a(String paramString1, int paramInt1, Bitmap.CompressFormat paramCompressFormat, int paramInt2, String paramString2)
  {
    paramString1 = cU(paramString1, 1);
    if (paramString1 == null)
    {
      x.e("MicroMsg.BitmapUtil", "rotate: create bitmap fialed");
      return false;
    }
    float f1 = paramString1.getWidth();
    float f2 = paramString1.getHeight();
    Object localObject = new Matrix();
    ((Matrix)localObject).setRotate(paramInt1, f1 / 2.0F, f2 / 2.0F);
    localObject = Bitmap.createBitmap(paramString1, 0, 0, (int)f1, (int)f2, (Matrix)localObject, true);
    if (paramString1 != localObject)
    {
      x.i("MicroMsg.BitmapUtil", "rotate bitmap recycle adjfjads fadsj fsadjf dsa. %s", new Object[] { paramString1.toString() });
      paramString1.recycle();
    }
    try
    {
      a((Bitmap)localObject, paramInt2, paramCompressFormat, paramString2, true);
      return true;
    }
    catch (IOException paramString1)
    {
      x.printErrStackTrace("MicroMsg.BitmapUtil", paramString1, "create thumbnail from orig failed: " + paramString2, new Object[0]);
    }
    return false;
  }
  
  public static boolean a(String paramString1, int paramInt, Bitmap.CompressFormat paramCompressFormat, String paramString2, String paramString3)
  {
    return a(paramString1, paramInt, paramCompressFormat, 90, paramString2 + paramString3);
  }
  
  public static Bitmap ah(int paramInt1, int paramInt2, int paramInt3)
  {
    Bitmap localBitmap = createBitmap(paramInt2, paramInt3, Bitmap.Config.ARGB_8888, false);
    new Canvas(localBitmap).drawColor(paramInt1);
    return localBitmap;
  }
  
  public static int ai(int paramInt1, int paramInt2, int paramInt3)
  {
    int j = 1;
    if ((paramInt1 > 144) || (paramInt2 > paramInt3))
    {
      if (paramInt2 > paramInt1) {}
      for (int i = Math.round(paramInt1 / 144.0F + 0.5F);; i = Math.round(paramInt2 / paramInt3 + 0.5F))
      {
        float f1 = paramInt2 * paramInt1;
        float f2 = paramInt3 * 144 * 2;
        for (;;)
        {
          j = i;
          if (f1 / (i * i) <= f2) {
            break;
          }
          i += 1;
        }
      }
    }
    return j;
  }
  
  public static Bitmap ai(String paramString, int paramInt1, int paramInt2)
  {
    return j(paramString, paramInt1, paramInt2, 1);
  }
  
  public static Bitmap aj(int paramInt1, int paramInt2, int paramInt3)
  {
    return a(paramInt1, null, false, 0.0F, paramInt2, paramInt3);
  }
  
  public static Bitmap aj(String paramString, int paramInt1, int paramInt2)
  {
    return a(paramString, paramInt1, paramInt2, null, 1, new int[0]);
  }
  
  public static Bitmap ak(String paramString, int paramInt1, int paramInt2)
  {
    return a(0, paramString, true, 0.0F, paramInt1, paramInt2);
  }
  
  public static Bitmap b(Bitmap paramBitmap, float paramFloat)
  {
    if (paramFloat % 360.0F == 0.0F) {
      return paramBitmap;
    }
    Object localObject = new Matrix();
    ((Matrix)localObject).reset();
    ((Matrix)localObject).setRotate(paramFloat, paramBitmap.getWidth() / 2, paramBitmap.getHeight() / 2);
    for (;;)
    {
      try
      {
        localObject = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), (Matrix)localObject, true);
        StringBuilder localStringBuilder = new StringBuilder("resultBmp is null: ");
        if (localObject == null)
        {
          bool = true;
          x.d("MicroMsg.BitmapUtil", bool + "  degree:" + paramFloat);
          if (paramBitmap != localObject)
          {
            x.i("MicroMsg.BitmapUtil", "rotate bitmap recycle ajsdfasdf adsf. %s", new Object[] { paramBitmap });
            paramBitmap.recycle();
          }
          return (Bitmap)localObject;
        }
      }
      catch (Throwable localThrowable)
      {
        x.d("MicroMsg.BitmapUtil", "createBitmap failed : %s ", new Object[] { bi.i(localThrowable) });
        return paramBitmap;
      }
      boolean bool = false;
    }
  }
  
  public static Bitmap b(String paramString, float paramFloat, int paramInt)
  {
    return a(paramString, 0, 0, paramFloat, null, paramInt, new int[0]);
  }
  
  private static boolean b(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2)
  {
    return a(paramString1, paramInt1, paramInt2, paramCompressFormat, paramInt3, paramString2, false, new PInt(), new PInt());
  }
  
  public static boolean b(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, String paramString2, PInt paramPInt1, PInt paramPInt2)
  {
    if (bi.oW(paramString1)) {
      x.w("MicroMsg.BitmapUtil", "file path is null.");
    }
    for (;;)
    {
      return false;
      if (!d.cn(paramString1))
      {
        x.w("MicroMsg.BitmapUtil", "file did not exists.");
        return false;
      }
      Exif localExif = new Exif();
      try
      {
        i = localExif.parseFromFile(paramString1);
        x.e("EXIFTEST", "parseFromFile ret = " + i);
        i = localExif.getOrientationInDegree();
        x.d("MicroMsg.BitmapUtil", "degress:%d", new Object[] { Integer.valueOf(i) });
        if ((i == 90) || (i == 270))
        {
          paramString1 = b(e(paramString1, paramInt2, paramInt1, true), i);
          if (paramString1 == null) {
            continue;
          }
        }
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          try
          {
            paramPInt1.value = paramString1.getWidth();
            paramPInt2.value = paramString1.getHeight();
            a(paramString1, 80, paramCompressFormat, paramString2, true);
            return true;
          }
          catch (IOException paramString1)
          {
            int i;
            x.e("MicroMsg.BitmapUtil", "create thumbnail from orig failed: " + paramString2);
          }
          localIOException = localIOException;
          x.printErrStackTrace("MicroMsg.BitmapUtil", localIOException, "Can't read EXIF from " + paramString1, new Object[0]);
          i = 0;
          continue;
          paramString1 = b(e(paramString1, paramInt1, paramInt2, true), i);
        }
      }
    }
    return false;
  }
  
  public static Bitmap bs(byte[] paramArrayOfByte)
  {
    return decodeByteArray(paramArrayOfByte, 0, 0);
  }
  
  public static Bitmap bt(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, 0, 0, new int[0]);
  }
  
  public static String bu(byte[] paramArrayOfByte)
  {
    int i = 0;
    if (i < paramArrayOfByte.length - 1)
    {
      if ((paramArrayOfByte[i] & 0xFF) != 255) {
        break label161;
      }
      j = paramArrayOfByte[(i + 1)];
      if (((j & 0xFF) < 192) || ((j & 0xFF) > 207)) {
        break label161;
      }
      x.d("MicroMsg.BitmapUtil", "match 0xff-" + Integer.toHexString(j & 0xFF) + "  at:" + i);
      if (i + 1 + 17 >= paramArrayOfByte.length) {
        x.d("MicroMsg.BitmapUtil", "not engouht len at " + i);
      }
    }
    else
    {
      return null;
    }
    int j = i + 2;
    if (paramArrayOfByte[(j + 7)] != 3) {
      x.d("MicroMsg.BitmapUtil", "num != 3 at " + i);
    }
    label161:
    int k;
    int m;
    label233:
    int i1;
    do
    {
      int n;
      int i2;
      do
      {
        do
        {
          for (;;)
          {
            i += 1;
            break;
            k = paramArrayOfByte[(j + 8)];
            m = paramArrayOfByte[(j + 11)];
            n = paramArrayOfByte[(j + 14)];
            if ((k == 1) || (m == 2) || (n == 3)) {
              break label233;
            }
            x.d("MicroMsg.BitmapUtil", "Y/Cb/Cr Tag is not right at " + i);
          }
          m = paramArrayOfByte[(j + 9)];
          i1 = paramArrayOfByte[(j + 12)];
          k = paramArrayOfByte[(j + 15)];
        } while ((m == 0) || (i1 == 0) || (k == 0));
        if ((m == i1) && (m == k)) {
          return "YUV444";
        }
        j = (m & 0xFF) >> 4 & 0xF;
        m &= 0xF;
        n = (i1 & 0xFF) >> 4 & 0xF;
        i1 &= 0xF;
        i2 = (k & 0xFF) >> 4 & 0xF;
        k &= 0xF;
      } while ((n == 0) || (i2 == 0) || (i1 == 0) || (k == 0) || (j / n != 2) || (j / i2 != 2));
      if ((m / i1 == 2) && (m / k == 2)) {
        return "YUV420";
      }
    } while ((m != i1) || (m != k));
    return "YUV422";
  }
  
  public static Bitmap c(Bitmap paramBitmap, float paramFloat)
  {
    Bitmap localBitmap = Bitmap.createBitmap(paramBitmap.getWidth(), paramBitmap.getHeight(), Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    localCanvas.drawARGB(0, 0, 0, 0);
    Paint localPaint = new Paint();
    localPaint.setAlpha((int)(255.0F * paramFloat));
    localCanvas.drawBitmap(paramBitmap, 0.0F, 0.0F, localPaint);
    return localBitmap;
  }
  
  public static void c(BitmapFactory.Options paramOptions)
  {
    if ((Build.VERSION.SDK_INT < 14) && (!sFw)) {}
    try
    {
      BitmapFactory.Options.class.getField("inNativeAlloc").setBoolean(paramOptions, true);
      return;
    }
    catch (Exception paramOptions)
    {
      x.printErrStackTrace("MicroMsg.BitmapUtil", paramOptions, "", new Object[0]);
      sFw = true;
    }
  }
  
  public static void c(String paramString, PInt paramPInt1, PInt paramPInt2)
  {
    Object localObject = null;
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    c(localOptions);
    try
    {
      paramString = MMBitmapFactory.decodeStream(d.openRead(paramString), null, localOptions, 0);
      if (paramString != null)
      {
        x.i("MicroMsg.BitmapUtil", "getRent bitmap recycle %s", new Object[] { paramString });
        paramString.recycle();
      }
      paramPInt1.value = localOptions.outWidth;
      paramPInt2.value = localOptions.outHeight;
      return;
    }
    catch (FileNotFoundException paramString)
    {
      for (;;)
      {
        paramString = (String)localObject;
      }
    }
  }
  
  public static boolean c(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2)
  {
    return a(paramString1, paramInt1, paramInt2, paramCompressFormat, paramInt3, paramString2, true, new PInt(), new PInt());
  }
  
  public static Bitmap cU(String paramString, int paramInt)
  {
    return a(paramString, 0, 0, 0.0F, null, paramInt, new int[0]);
  }
  
  public static DisplayMetrics chu()
  {
    if (ewi == null) {
      ewi = ad.getContext().getResources().getDisplayMetrics();
    }
    return ewi;
  }
  
  public static Bitmap createBitmap(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    return createBitmap(paramInt1, paramInt2, paramConfig, false);
  }
  
  private static Bitmap createBitmap(int paramInt1, int paramInt2, Bitmap.Config paramConfig, boolean paramBoolean)
  {
    Object localObject = null;
    try
    {
      paramConfig = Bitmap.createBitmap(paramInt1, paramInt2, paramConfig);
      return paramConfig;
    }
    catch (Throwable paramConfig)
    {
      do
      {
        paramConfig = (Bitmap.Config)localObject;
      } while (paramBoolean);
      try
      {
        paramConfig = chu();
        int j = paramInt1;
        int i = paramInt2;
        if (paramInt1 > paramConfig.widthPixels)
        {
          j = paramInt1;
          i = paramInt2;
          if (paramInt2 > paramConfig.heightPixels)
          {
            j = paramConfig.widthPixels;
            i = paramConfig.heightPixels;
          }
        }
        paramConfig = Bitmap.createBitmap(j, i, Bitmap.Config.RGB_565);
        return paramConfig;
      }
      catch (Throwable paramConfig) {}
    }
    return null;
  }
  
  public static Bitmap d(Bitmap paramBitmap, int paramInt)
  {
    x.d("MicroMsg.BitmapUtil", "begin createChattingImage");
    long l1 = System.currentTimeMillis();
    if (paramBitmap == null)
    {
      x.w("MicroMsg.BitmapUtil", "sourceBitmap is null .");
      return null;
    }
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    if ((i <= 0) || (j <= 0))
    {
      x.w("MicroMsg.BitmapUtil", "sourceBitmap width or height is 0.");
      return null;
    }
    long l2 = System.currentTimeMillis();
    Bitmap localBitmap;
    try
    {
      localBitmap = createBitmap(i, j, Bitmap.Config.ARGB_8888, false);
      localObject = (NinePatchDrawable)ad.getContext().getResources().getDrawable(paramInt);
      ((NinePatchDrawable)localObject).setBounds(0, 0, i, j);
      ((NinePatchDrawable)localObject).draw(new Canvas(localBitmap));
      x.d("MicroMsg.BitmapUtil", "create nine patch bitmap " + (System.currentTimeMillis() - l2));
      if (localBitmap == null)
      {
        x.e("MicroMsg.BitmapUtil", "[createChattingImage] maskBitmap is null.");
        return null;
      }
    }
    catch (Exception paramBitmap)
    {
      x.e("MicroMsg.BitmapUtil", "[createChattingImage] create nine pathc bitmap faild.");
      return null;
    }
    paramInt = localBitmap.getWidth();
    int k = localBitmap.getHeight();
    if ((paramInt <= 0) || (k <= 0))
    {
      x.w("MicroMsg.BitmapUtil", "maskBitmap width or height is 0.");
      return null;
    }
    if ((k != j) || (paramInt != i))
    {
      x.e("MicroMsg.BitmapUtil", "maskHeiht maskWidth != height width.");
      return null;
    }
    Object localObject = new int[i * j];
    int[] arrayOfInt = new int[paramInt * k];
    paramBitmap.getPixels((int[])localObject, 0, i, 0, 0, i, j);
    localBitmap.getPixels(arrayOfInt, 0, i, 0, 0, i, j);
    l2 = System.currentTimeMillis();
    paramInt = 0;
    for (;;)
    {
      try
      {
        if (paramInt < arrayOfInt.length)
        {
          if (arrayOfInt[paramInt] == -16777216) {
            break label430;
          }
          if (arrayOfInt[paramInt] == 0) {
            localObject[paramInt] = 0;
          } else if (arrayOfInt[paramInt] != -1) {
            localObject[paramInt] &= arrayOfInt[paramInt];
          }
        }
      }
      catch (Exception paramBitmap)
      {
        x.e("MicroMsg.BitmapUtil", paramBitmap.toString());
        x.d("MicroMsg.BitmapUtil", "meger pixels  " + (System.currentTimeMillis() - l2));
        l2 = System.currentTimeMillis();
        localBitmap.setPixels((int[])localObject, 0, i, 0, 0, i, j);
        x.d("MicroMsg.BitmapUtil", "setPixels " + (System.currentTimeMillis() - l2));
        x.d("MicroMsg.BitmapUtil", "createTime" + (System.currentTimeMillis() - l1));
        return localBitmap;
      }
      label430:
      paramInt += 1;
    }
  }
  
  public static Bitmap decodeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return a(paramArrayOfByte, paramInt1, paramInt2, new int[0]);
  }
  
  public static Bitmap decodeFile(String paramString, BitmapFactory.Options paramOptions)
  {
    return a(paramString, paramOptions, 1, new int[0]);
  }
  
  public static Bitmap decodeStream(InputStream paramInputStream)
  {
    return a(paramInputStream, 0.0F, 0, 0);
  }
  
  public static Bitmap dk(View paramView)
  {
    if (paramView == null) {
      return null;
    }
    Bitmap localBitmap = Bitmap.createBitmap(paramView.getWidth(), paramView.getHeight(), Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Drawable localDrawable = paramView.getBackground();
    if (localDrawable != null) {
      localDrawable.draw(localCanvas);
    }
    paramView.draw(localCanvas);
    return localBitmap;
  }
  
  public static Bitmap e(Bitmap paramBitmap, int paramInt)
  {
    if (paramBitmap == null)
    {
      x.w("MicroMsg.BitmapUtil", "fastblur: but sentBitmap is null");
      return null;
    }
    paramBitmap = paramBitmap.copy(paramBitmap.getConfig(), true);
    if (paramInt <= 0) {
      return null;
    }
    int i12 = paramBitmap.getWidth();
    int i13 = paramBitmap.getHeight();
    int[] arrayOfInt1 = new int[i12 * i13];
    x.e("pix", i12 + " " + i13 + " " + arrayOfInt1.length);
    paramBitmap.getPixels(arrayOfInt1, 0, i12, 0, 0, i12, i13);
    int i18 = i12 - 1;
    int i14 = i13 - 1;
    int i15 = i12 * i13;
    int i16 = paramInt + paramInt + 1;
    int[] arrayOfInt2 = new int[i15];
    int[] arrayOfInt3 = new int[i15];
    int[] arrayOfInt4 = new int[i15];
    int[] arrayOfInt5 = new int[Math.max(i12, i13)];
    int i = i16 + 1 >> 1;
    int j = i * i;
    int[] arrayOfInt6 = new int[j * 256];
    i = 0;
    while (i < j * 256)
    {
      arrayOfInt6[i] = (i / j);
      i += 1;
    }
    int[][] arrayOfInt = (int[][])Array.newInstance(Integer.TYPE, new int[] { i16, 3 });
    int i17 = paramInt + 1;
    int i6 = 0;
    int i7 = 0;
    int i5 = 0;
    int i8;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    int i3;
    int i4;
    int i9;
    int[] arrayOfInt7;
    int i11;
    int i10;
    while (i5 < i13)
    {
      i8 = -paramInt;
      i = 0;
      j = 0;
      k = 0;
      m = 0;
      n = 0;
      i1 = 0;
      i2 = 0;
      i3 = 0;
      i4 = 0;
      if (i8 <= paramInt)
      {
        i9 = arrayOfInt1[(Math.min(i18, Math.max(i8, 0)) + i7)];
        arrayOfInt7 = arrayOfInt[(i8 + paramInt)];
        arrayOfInt7[0] = ((0xFF0000 & i9) >> 16);
        arrayOfInt7[1] = ((0xFF00 & i9) >> 8);
        arrayOfInt7[2] = (i9 & 0xFF);
        i9 = i17 - Math.abs(i8);
        i4 += arrayOfInt7[0] * i9;
        i3 += arrayOfInt7[1] * i9;
        i2 += i9 * arrayOfInt7[2];
        if (i8 > 0)
        {
          k += arrayOfInt7[0];
          j += arrayOfInt7[1];
          i += arrayOfInt7[2];
        }
        for (;;)
        {
          i8 += 1;
          break;
          i1 += arrayOfInt7[0];
          n += arrayOfInt7[1];
          m += arrayOfInt7[2];
        }
      }
      i11 = 0;
      i10 = paramInt;
      i9 = i4;
      i8 = i3;
      i4 = i2;
      i2 = i11;
      i3 = i10;
      while (i2 < i12)
      {
        arrayOfInt2[i7] = arrayOfInt6[i9];
        arrayOfInt3[i7] = arrayOfInt6[i8];
        arrayOfInt4[i7] = arrayOfInt6[i4];
        arrayOfInt7 = arrayOfInt[((i3 - paramInt + i16) % i16)];
        int i19 = arrayOfInt7[0];
        i11 = arrayOfInt7[1];
        i10 = arrayOfInt7[2];
        if (i5 == 0) {
          arrayOfInt5[i2] = Math.min(i2 + paramInt + 1, i18);
        }
        int i20 = arrayOfInt1[(arrayOfInt5[i2] + i6)];
        arrayOfInt7[0] = ((0xFF0000 & i20) >> 16);
        arrayOfInt7[1] = ((0xFF00 & i20) >> 8);
        arrayOfInt7[2] = (i20 & 0xFF);
        k += arrayOfInt7[0];
        j += arrayOfInt7[1];
        i += arrayOfInt7[2];
        i9 = i9 - i1 + k;
        i8 = i8 - n + j;
        i4 = i4 - m + i;
        i3 = (i3 + 1) % i16;
        arrayOfInt7 = arrayOfInt[(i3 % i16)];
        i1 = i1 - i19 + arrayOfInt7[0];
        n = n - i11 + arrayOfInt7[1];
        m = m - i10 + arrayOfInt7[2];
        k -= arrayOfInt7[0];
        j -= arrayOfInt7[1];
        i -= arrayOfInt7[2];
        i7 += 1;
        i2 += 1;
      }
      i6 += i12;
      i5 += 1;
    }
    i = 0;
    while (i < i12)
    {
      i7 = -paramInt * i12;
      i6 = -paramInt;
      i2 = 0;
      j = 0;
      k = 0;
      m = 0;
      n = 0;
      i1 = 0;
      i3 = 0;
      i4 = 0;
      i5 = 0;
      if (i6 <= paramInt)
      {
        i8 = Math.max(0, i7) + i;
        arrayOfInt7 = arrayOfInt[(i6 + paramInt)];
        arrayOfInt7[0] = arrayOfInt2[i8];
        arrayOfInt7[1] = arrayOfInt3[i8];
        arrayOfInt7[2] = arrayOfInt4[i8];
        i9 = i17 - Math.abs(i6);
        i5 += arrayOfInt2[i8] * i9;
        i4 += arrayOfInt3[i8] * i9;
        i8 = i3 + arrayOfInt4[i8] * i9;
        if (i6 > 0)
        {
          k += arrayOfInt7[0];
          j += arrayOfInt7[1];
          i2 += arrayOfInt7[2];
        }
        for (;;)
        {
          i3 = i7;
          if (i6 < i14) {
            i3 = i7 + i12;
          }
          i6 += 1;
          i7 = i3;
          i3 = i8;
          break;
          i1 += arrayOfInt7[0];
          n += arrayOfInt7[1];
          m += arrayOfInt7[2];
        }
      }
      i11 = 0;
      i9 = i2;
      i8 = i;
      i10 = paramInt;
      i7 = i5;
      i6 = i4;
      i5 = i3;
      i2 = i11;
      i4 = i10;
      i3 = i8;
      i8 = k;
      k = j;
      j = i9;
      while (i2 < i13)
      {
        arrayOfInt1[i3] = (0xFF000000 & arrayOfInt1[i3] | arrayOfInt6[i7] << 16 | arrayOfInt6[i6] << 8 | arrayOfInt6[i5]);
        arrayOfInt7 = arrayOfInt[((i4 - paramInt + i16) % i16)];
        i11 = arrayOfInt7[0];
        i10 = arrayOfInt7[1];
        i9 = arrayOfInt7[2];
        if (i == 0) {
          arrayOfInt5[i2] = (Math.min(i2 + i17, i14) * i12);
        }
        i18 = arrayOfInt5[i2] + i;
        arrayOfInt7[0] = arrayOfInt2[i18];
        arrayOfInt7[1] = arrayOfInt3[i18];
        arrayOfInt7[2] = arrayOfInt4[i18];
        i8 += arrayOfInt7[0];
        k += arrayOfInt7[1];
        j += arrayOfInt7[2];
        i7 = i7 - i1 + i8;
        i6 = i6 - n + k;
        i5 = i5 - m + j;
        i4 = (i4 + 1) % i16;
        arrayOfInt7 = arrayOfInt[i4];
        i1 = i1 - i11 + arrayOfInt7[0];
        n = n - i10 + arrayOfInt7[1];
        m = m - i9 + arrayOfInt7[2];
        i8 -= arrayOfInt7[0];
        i9 = arrayOfInt7[1];
        j -= arrayOfInt7[2];
        i3 += i12;
        i2 += 1;
        k -= i9;
      }
      i += 1;
    }
    x.e("pix", i12 + " " + i13 + " " + i15);
    paramBitmap.setPixels(arrayOfInt1, 0, i12, 0, 0, i12, i13);
    return paramBitmap;
  }
  
  public static Bitmap e(String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return a(paramString, paramInt1, paramInt2, paramBoolean, null, 0);
  }
  
  public static Bitmap f(String paramString, float paramFloat)
  {
    return b(paramString, paramFloat, 1);
  }
  
  public static Bitmap j(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    Bitmap localBitmap = a(paramString, paramInt1, paramInt2, false, null, paramInt3);
    if (localBitmap == null) {
      return null;
    }
    Exif localExif = new Exif();
    try
    {
      paramInt1 = localExif.parseFromFile(paramString);
      x.e("EXIFTEST", "parseFromFile ret = " + paramInt1);
      paramInt1 = localExif.getOrientationInDegree();
      x.d("MicroMsg.BitmapUtil", "degress:%d", new Object[] { Integer.valueOf(paramInt1) });
      return b(localBitmap, paramInt1);
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.BitmapUtil", localIOException, "Can't read EXIF from " + paramString, new Object[0]);
        paramInt1 = 0;
      }
    }
  }
  
  private static List<r> j(View paramView, int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramView instanceof TextureView))
    {
      r localr = new r();
      localr.sFP = ((TextureView)paramView);
      localr.left = paramInt1;
      localr.top = paramInt2;
      localArrayList.add(localr);
    }
    for (;;)
    {
      return localArrayList;
      if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        int i = 0;
        while (i < paramView.getChildCount())
        {
          localArrayList.addAll(j(paramView.getChildAt(i), (int)(paramView.getX() + paramInt1), (int)(paramView.getY() + paramInt2)));
          i += 1;
        }
      }
    }
  }
  
  public static Bitmap k(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramString == null) || (paramString.equals("")) || (paramInt1 < 0) || (paramInt2 < 0) || (paramInt3 < 0)) {
      x.w("MicroMsg.BitmapUtil", "createLocation fail. srcResId or maskResId is null,or width/height <0");
    }
    do
    {
      return null;
      paramString = decodeByteArray(d.dv(paramString, -1), 0, 0);
    } while ((paramString == null) || (paramString.isRecycled()));
    long l = System.currentTimeMillis();
    Bitmap localBitmap = createBitmap(paramInt2, paramInt3, Bitmap.Config.ARGB_8888, false);
    Canvas localCanvas = new Canvas(localBitmap);
    x.d("MicroMsg.BitmapUtil", "bm size w %d h %d target w %d h %d", new Object[] { Integer.valueOf(paramString.getWidth()), Integer.valueOf(paramString.getHeight()), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    localCanvas.drawBitmap(paramString, null, new Rect(0, 0, paramInt2, paramInt3), new Paint());
    x.d("MicroMsg.BitmapUtil", "create nine patch bitmap " + (System.currentTimeMillis() - l));
    return d(localBitmap, paramInt1);
  }
  
  public static Bitmap m(Uri paramUri)
  {
    return a(0, null, null, paramUri, false, 0.0F, 0, 0, null, 1, new int[0]);
  }
  
  public static Bitmap s(Drawable paramDrawable)
  {
    if ((paramDrawable instanceof BitmapDrawable)) {
      return ((BitmapDrawable)paramDrawable).getBitmap();
    }
    Bitmap localBitmap = createBitmap(paramDrawable.getIntrinsicWidth(), paramDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888, false);
    Canvas localCanvas = new Canvas(localBitmap);
    paramDrawable.setBounds(0, 0, localCanvas.getWidth(), localCanvas.getHeight());
    paramDrawable.draw(localCanvas);
    return localBitmap;
  }
  
  public static Bitmap y(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt1 < 0) || (paramInt2 < 0) || (paramInt3 < 0) || (paramInt4 < 0))
    {
      x.w("MicroMsg.BitmapUtil", "createLocation fail. srcResId or maskResId is null,or width/height <0");
      return null;
    }
    long l = System.currentTimeMillis();
    Bitmap localBitmap = createBitmap(paramInt3, paramInt4, Bitmap.Config.ARGB_8888, false);
    NinePatchDrawable localNinePatchDrawable = (NinePatchDrawable)ad.getContext().getResources().getDrawable(paramInt1);
    localNinePatchDrawable.setBounds(0, 0, paramInt3, paramInt4);
    localNinePatchDrawable.draw(new Canvas(localBitmap));
    x.d("MicroMsg.BitmapUtil", "create nine patch bitmap " + (System.currentTimeMillis() - l));
    return d(localBitmap, paramInt2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */