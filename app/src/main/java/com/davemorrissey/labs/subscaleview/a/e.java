package com.davemorrissey.labs.subscaleview.a;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView;
import com.tencent.mm.sdk.platformtools.bi;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class e
  implements d
{
  private final ReadWriteLock YA = new ReentrantReadWriteLock(true);
  private final Bitmap.Config Yx;
  private BitmapRegionDecoder Yz;
  
  public e()
  {
    this((byte)0);
  }
  
  private e(byte paramByte)
  {
    Bitmap.Config localConfig = SubsamplingScaleImageView.getPreferredBitmapConfig();
    if (localConfig != null)
    {
      this.Yx = localConfig;
      return;
    }
    this.Yx = Bitmap.Config.RGB_565;
  }
  
  private Lock hw()
  {
    if (Build.VERSION.SDK_INT < 21) {
      return this.YA.writeLock();
    }
    return this.YA.readLock();
  }
  
  public final Bitmap b(Rect paramRect, int paramInt)
  {
    hw().lock();
    try
    {
      if ((this.Yz == null) || (this.Yz.isRecycled())) {
        break label94;
      }
      BitmapFactory.Options localOptions = new BitmapFactory.Options();
      localOptions.inSampleSize = paramInt;
      localOptions.inPreferredConfig = this.Yx;
      paramRect = this.Yz.decodeRegion(paramRect, localOptions);
      if (paramRect == null) {
        throw new RuntimeException("Skia image decoder returned null bitmap - image format may not be supported");
      }
    }
    finally
    {
      hw().unlock();
    }
    hw().unlock();
    return paramRect;
    label94:
    throw new IllegalStateException("Cannot decode region after decoder has been recycled");
  }
  
  public final Point b(Context paramContext, Uri paramUri)
  {
    Object localObject = paramUri.toString();
    String str;
    int i;
    if (((String)localObject).startsWith("android.resource://"))
    {
      str = paramUri.getAuthority();
      if (paramContext.getPackageName().equals(str))
      {
        localObject = paramContext.getResources();
        paramUri = paramUri.getPathSegments();
        i = paramUri.size();
        if ((i != 2) || (!((String)paramUri.get(0)).equals("drawable"))) {
          break label147;
        }
        i = ((Resources)localObject).getIdentifier((String)paramUri.get(1), "drawable", str);
        label95:
        this.Yz = BitmapRegionDecoder.newInstance(paramContext.getResources().openRawResource(i), false);
      }
    }
    for (;;)
    {
      return new Point(this.Yz.getWidth(), this.Yz.getHeight());
      localObject = paramContext.getPackageManager().getResourcesForApplication(str);
      break;
      label147:
      if ((i == 1) && (TextUtils.isDigitsOnly((CharSequence)paramUri.get(0)))) {
        try
        {
          i = bi.getInt((String)paramUri.get(0), 0);
        }
        catch (NumberFormatException paramUri) {}
      }
      i = 0;
      break label95;
      if (((String)localObject).startsWith("file:///android_asset/"))
      {
        paramUri = ((String)localObject).substring(22);
        this.Yz = BitmapRegionDecoder.newInstance(paramContext.getAssets().open(paramUri, 1), false);
      }
      else if (((String)localObject).startsWith("file://"))
      {
        this.Yz = BitmapRegionDecoder.newInstance(((String)localObject).substring(7), false);
      }
      else
      {
        localObject = null;
        try
        {
          paramContext = paramContext.getContentResolver().openInputStream(paramUri);
          localObject = paramContext;
          this.Yz = BitmapRegionDecoder.newInstance(paramContext, false);
          if (paramContext != null) {
            try
            {
              paramContext.close();
            }
            catch (Exception paramContext) {}
          }
        }
        finally
        {
          if (localObject == null) {}
        }
      }
    }
    try
    {
      ((InputStream)localObject).close();
      throw paramContext;
    }
    catch (Exception paramUri)
    {
      for (;;) {}
    }
  }
  
  /* Error */
  public final boolean hv()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 67	com/davemorrissey/labs/subscaleview/a/e:Yz	Landroid/graphics/BitmapRegionDecoder;
    //   6: ifnull +21 -> 27
    //   9: aload_0
    //   10: getfield 67	com/davemorrissey/labs/subscaleview/a/e:Yz	Landroid/graphics/BitmapRegionDecoder;
    //   13: invokevirtual 73	android/graphics/BitmapRegionDecoder:isRecycled	()Z
    //   16: istore_1
    //   17: iload_1
    //   18: ifne +9 -> 27
    //   21: iconst_1
    //   22: istore_1
    //   23: aload_0
    //   24: monitorexit
    //   25: iload_1
    //   26: ireturn
    //   27: iconst_0
    //   28: istore_1
    //   29: goto -6 -> 23
    //   32: astore_2
    //   33: aload_0
    //   34: monitorexit
    //   35: aload_2
    //   36: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	37	0	this	e
    //   16	13	1	bool	boolean
    //   32	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	17	32	finally
  }
  
  /* Error */
  public final void recycle()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 27	com/davemorrissey/labs/subscaleview/a/e:YA	Ljava/util/concurrent/locks/ReadWriteLock;
    //   6: invokeinterface 53 1 0
    //   11: invokeinterface 65 1 0
    //   16: aload_0
    //   17: getfield 67	com/davemorrissey/labs/subscaleview/a/e:Yz	Landroid/graphics/BitmapRegionDecoder;
    //   20: invokevirtual 241	android/graphics/BitmapRegionDecoder:recycle	()V
    //   23: aload_0
    //   24: aconst_null
    //   25: putfield 67	com/davemorrissey/labs/subscaleview/a/e:Yz	Landroid/graphics/BitmapRegionDecoder;
    //   28: aload_0
    //   29: getfield 27	com/davemorrissey/labs/subscaleview/a/e:YA	Ljava/util/concurrent/locks/ReadWriteLock;
    //   32: invokeinterface 53 1 0
    //   37: invokeinterface 96 1 0
    //   42: aload_0
    //   43: monitorexit
    //   44: return
    //   45: astore_1
    //   46: aload_0
    //   47: getfield 27	com/davemorrissey/labs/subscaleview/a/e:YA	Ljava/util/concurrent/locks/ReadWriteLock;
    //   50: invokeinterface 53 1 0
    //   55: invokeinterface 96 1 0
    //   60: aload_1
    //   61: athrow
    //   62: astore_1
    //   63: aload_0
    //   64: monitorexit
    //   65: aload_1
    //   66: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	67	0	this	e
    //   45	16	1	localObject1	Object
    //   62	4	1	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   16	28	45	finally
    //   2	16	62	finally
    //   28	42	62	finally
    //   46	62	62	finally
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/davemorrissey/labs/subscaleview/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */