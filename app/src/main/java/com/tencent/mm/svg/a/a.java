package com.tencent.mm.svg.a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.svg.WeChatSVG;
import com.tencent.mm.svg.b.b;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.util.EncodingUtils;

public final class a
{
  private static String teL = ".svg.code.drawable";
  protected static int teM = 3;
  private static String teN = "";
  private static Map<Integer, com.tencent.mm.svg.c> teO = new ConcurrentHashMap();
  private static Map<Integer, Picture> teP = new ConcurrentHashMap();
  private static Map<String, Picture> teQ = new ConcurrentHashMap();
  private static Float teR;
  private TypedValue teJ = new TypedValue();
  private byte[] teK = new byte[0];
  
  private static Picture a(float paramFloat1, com.tencent.mm.svg.c paramc, float paramFloat2)
  {
    Picture localPicture = new Picture();
    if (paramc == null)
    {
      com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "fromCodeToPicture code is null!", new Object[0]);
      return localPicture;
    }
    if (teR == null) {
      teR = Float.valueOf(paramFloat1 / teM);
    }
    paramFloat1 = teR.floatValue() * paramFloat2;
    paramFloat2 = paramc.b(0, new Object[0]);
    float f = paramc.b(1, new Object[0]);
    Canvas localCanvas = localPicture.beginRecording((int)(paramFloat2 * paramFloat1), (int)(f * paramFloat1));
    localCanvas.save();
    localCanvas.scale(paramFloat1, paramFloat1);
    paramc.b(2, new Object[] { localCanvas, Looper.myLooper() });
    localCanvas.restore();
    localPicture.endRecording();
    return localPicture;
  }
  
  private static Drawable a(Resources paramResources, int paramInt, float paramFloat)
  {
    if (paramInt == 0)
    {
      com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "getSVGDrawable a invalid resource!!! %s", new Object[] { Integer.valueOf(paramInt) });
      com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "Why no log??", new Object[0]);
      paramResources = new Throwable().getStackTrace();
      if ((paramResources == null) || (paramResources.length < 4)) {}
      for (paramResources = "";; paramResources = ((StringBuilder)localObject).toString())
      {
        com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "The stack : %s", new Object[] { paramResources });
        return new c(new Picture(), paramInt);
        localObject = new StringBuilder();
        int i = 3;
        while (i < paramResources.length)
        {
          if ((paramResources[i].getClassName().contains("com.tencent.mm")) && (!paramResources[i].getClassName().contains("sdk.platformtools.Log")))
          {
            ((StringBuilder)localObject).append("[");
            ((StringBuilder)localObject).append(paramResources[i].getClassName().substring(15));
            ((StringBuilder)localObject).append(":");
            ((StringBuilder)localObject).append(paramResources[i].getMethodName());
            ((StringBuilder)localObject).append("(" + paramResources[i].getLineNumber() + ")]");
          }
          i += 1;
        }
      }
    }
    if (b.com()) {
      return c(paramResources, paramInt, paramFloat);
    }
    String str1 = teN + teL;
    float f2 = paramResources.getDisplayMetrics().density;
    if (paramFloat > 0.0F) {}
    for (float f1 = paramFloat; paramFloat > 0.0F; f1 = 1.0F)
    {
      String str2 = paramInt + "_scale_" + paramFloat;
      localPicture = (Picture)teQ.get(str2);
      localObject = localPicture;
      if (localPicture == null)
      {
        localObject = a(f2, a(paramResources, paramInt, str1), f1);
        teQ.put(str2, localObject);
      }
      return new c((Picture)localObject, paramInt);
    }
    Picture localPicture = (Picture)teP.get(Integer.valueOf(paramInt));
    Object localObject = localPicture;
    if (localPicture == null)
    {
      localObject = a(f2, a(paramResources, paramInt, str1), f1);
      teP.put(Integer.valueOf(paramInt), localObject);
    }
    return new c((Picture)localObject, paramInt);
  }
  
  private static com.tencent.mm.svg.c a(Resources paramResources, int paramInt, String paramString)
  {
    String str = "";
    Object localObject1 = str;
    Object localObject2 = str;
    Object localObject3 = str;
    try
    {
      if (teO.containsKey(Integer.valueOf(paramInt)))
      {
        localObject1 = str;
        localObject2 = str;
        localObject3 = str;
        return (com.tencent.mm.svg.c)teO.get(Integer.valueOf(paramInt));
      }
      localObject1 = str;
      localObject2 = str;
      localObject3 = str;
      paramResources = paramResources.getResourceName(paramInt);
      if (paramResources == null)
      {
        localObject1 = str;
        localObject2 = str;
        localObject3 = str;
        com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "Get SVGCodeDrawable failed. Reason : resource not found", new Object[0]);
        return null;
      }
      localObject1 = str;
      localObject2 = str;
      localObject3 = str;
      int i = paramResources.indexOf("/");
      if (i <= 0) {
        break label248;
      }
      localObject1 = str;
      localObject2 = str;
      localObject3 = str;
      paramResources = paramString + "." + paramResources.substring(i + 1);
    }
    catch (ClassNotFoundException paramResources)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.SVGCompat", paramResources, "", new Object[0]);
        com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "Get SVGCodeDrawable failed. Reason : ClassNotFoundException %s", new Object[] { localObject1 });
        return null;
        localObject1 = str;
        localObject2 = str;
        localObject3 = str;
        paramResources = paramString + "." + paramResources;
      }
    }
    catch (InstantiationException paramResources)
    {
      com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "Get SVGCodeDrawable failed. Reason : InstantiationException %s", new Object[] { localObject2 });
      x.printErrStackTrace("MicroMsg.SVGCompat", paramResources, "", new Object[0]);
      return null;
    }
    catch (IllegalAccessException paramResources)
    {
      com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "Get SVGCodeDrawable failed. Reason : IllegalAccessException %s", new Object[] { localObject3 });
      x.printErrStackTrace("MicroMsg.SVGCompat", paramResources, "", new Object[0]);
    }
    localObject1 = paramResources;
    localObject2 = paramResources;
    localObject3 = paramResources;
    paramString = (com.tencent.mm.svg.c)Class.forName(paramResources).newInstance();
    localObject1 = paramResources;
    localObject2 = paramResources;
    localObject3 = paramResources;
    teO.put(Integer.valueOf(paramInt), paramString);
    return paramString;
    label248:
    return null;
  }
  
  public static Bitmap b(Resources paramResources, int paramInt, float paramFloat)
  {
    paramResources = a(paramResources, paramInt, paramFloat);
    if (paramResources == null) {
      return null;
    }
    Bitmap localBitmap = Bitmap.createBitmap(paramResources.getIntrinsicWidth(), paramResources.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
    paramResources.draw(new Canvas(localBitmap));
    return localBitmap;
  }
  
  protected static boolean b(View paramView, Paint paramPaint)
  {
    if (Build.VERSION.SDK_INT > 10)
    {
      if (paramView != null)
      {
        if (paramView.getLayerType() != 1) {
          paramView.setLayerType(1, paramPaint);
        }
        if (paramView.willNotCacheDrawing())
        {
          paramView.setWillNotCacheDrawing(false);
          if (paramView.getWindowToken() != null) {
            paramView.buildLayer();
          }
        }
        return true;
      }
      return false;
    }
    return false;
  }
  
  public static Drawable c(Resources paramResources, int paramInt)
  {
    return a(paramResources, paramInt, 0.0F);
  }
  
  private static Drawable c(Resources paramResources, int paramInt, float paramFloat)
  {
    com.tencent.mm.svg.b.c.d("MicroMsg.SVGCompat", "Using wechat svg library.", new Object[0]);
    InputStream localInputStream = paramResources.openRawResource(paramInt);
    long l;
    float[] arrayOfFloat;
    float f2;
    try
    {
      byte[] arrayOfByte = new byte[localInputStream.available()];
      localInputStream.read(arrayOfByte);
      if (localInputStream != null) {}
      try
      {
        localInputStream.close();
        l = WeChatSVG.parse(EncodingUtils.getString(arrayOfByte, "UTF-8").toString());
        if (l == 0L)
        {
          com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "Parse SVG failed.", new Object[0]);
          paramResources = null;
          return paramResources;
        }
      }
      catch (IOException localIOException1)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.SVGCompat", localIOException1, "", new Object[0]);
        }
      }
      f1 = paramFloat;
    }
    catch (IOException paramResources)
    {
      x.printErrStackTrace("MicroMsg.SVGCompat", paramResources, "", new Object[0]);
      com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "Get SVGPictureDrawable failed. Reason : IOException", new Object[0]);
      if (localIOException1 != null) {}
      try
      {
        localIOException1.close();
        return null;
      }
      catch (IOException paramResources)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.SVGCompat", paramResources, "", new Object[0]);
        }
      }
    }
    finally
    {
      if (localIOException1 != null) {}
      try
      {
        localIOException1.close();
        throw paramResources;
      }
      catch (IOException localIOException2)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.SVGCompat", localIOException2, "", new Object[0]);
        }
      }
      arrayOfFloat = WeChatSVG.getViewPort(l);
      f2 = paramResources.getDisplayMetrics().density;
      f3 = arrayOfFloat[0] / teM;
      if (paramFloat <= 0.0F) {
        break label330;
      }
    }
    float f1;
    label222:
    f1 *= f3 * f2;
    float f3 = arrayOfFloat[1] / teM;
    if (paramFloat > 0.0F) {}
    for (;;)
    {
      paramFloat = f3 * f2 * paramFloat;
      paramResources = new Picture();
      int i = WeChatSVG.renderViewPort(l, paramResources.beginRecording((int)f1, (int)paramFloat), (int)f1, (int)paramFloat);
      paramResources.endRecording();
      WeChatSVG.release(l);
      paramResources = new c(paramResources, paramInt);
      if (i >= 0) {
        break;
      }
      com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "Render SVG failed. Reason : %s", new Object[] { Integer.valueOf(i) });
      return null;
      label330:
      f1 = 1.0F;
      break label222;
      paramFloat = 1.0F;
    }
  }
  
  public static void cQ(String paramString)
  {
    teN = paramString;
  }
  
  public static Map<Integer, com.tencent.mm.svg.c> cog()
  {
    return teO;
  }
  
  protected static View t(Drawable paramDrawable)
  {
    for (;;)
    {
      paramDrawable = paramDrawable.getCallback();
      if (paramDrawable == null) {
        break;
      }
      if ((paramDrawable instanceof View)) {
        return (View)paramDrawable;
      }
      if (!(paramDrawable instanceof Drawable)) {
        break;
      }
      paramDrawable = (Drawable)paramDrawable;
    }
    return null;
  }
  
  /* Error */
  public final boolean d(Resources paramResources, int paramInt)
  {
    // Byte code:
    //   0: aload_1
    //   1: iload_2
    //   2: invokevirtual 406	android/content/res/Resources:getResourceTypeName	(I)Ljava/lang/String;
    //   5: astore_3
    //   6: aload_3
    //   7: ldc_w 408
    //   10: invokevirtual 411	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   13: ifeq +93 -> 106
    //   16: aload_0
    //   17: getfield 54	com/tencent/mm/svg/a/a:teK	[B
    //   20: astore 5
    //   22: aload 5
    //   24: monitorenter
    //   25: aload_0
    //   26: getfield 52	com/tencent/mm/svg/a/a:teJ	Landroid/util/TypedValue;
    //   29: astore 4
    //   31: aload 4
    //   33: astore_3
    //   34: aload 4
    //   36: ifnonnull +16 -> 52
    //   39: new 49	android/util/TypedValue
    //   42: dup
    //   43: invokespecial 50	android/util/TypedValue:<init>	()V
    //   46: astore_3
    //   47: aload_0
    //   48: aload_3
    //   49: putfield 52	com/tencent/mm/svg/a/a:teJ	Landroid/util/TypedValue;
    //   52: aload_1
    //   53: iload_2
    //   54: aload_3
    //   55: iconst_1
    //   56: invokevirtual 415	android/content/res/Resources:getValue	(ILandroid/util/TypedValue;Z)V
    //   59: aload_3
    //   60: getfield 419	android/util/TypedValue:string	Ljava/lang/CharSequence;
    //   63: invokeinterface 422 1 0
    //   68: astore_1
    //   69: aload 5
    //   71: monitorexit
    //   72: aload_1
    //   73: ldc_w 424
    //   76: invokevirtual 428	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   79: ifeq +27 -> 106
    //   82: iconst_1
    //   83: ireturn
    //   84: astore_1
    //   85: ldc 61
    //   87: aload_1
    //   88: ldc_w 430
    //   91: iconst_0
    //   92: anewarray 4	java/lang/Object
    //   95: invokestatic 431	com/tencent/mm/svg/b/c:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   98: iconst_0
    //   99: ireturn
    //   100: astore_1
    //   101: aload 5
    //   103: monitorexit
    //   104: aload_1
    //   105: athrow
    //   106: iconst_0
    //   107: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	108	0	this	a
    //   0	108	1	paramResources	Resources
    //   0	108	2	paramInt	int
    //   5	55	3	localObject	Object
    //   29	6	4	localTypedValue	TypedValue
    // Exception table:
    //   from	to	target	type
    //   0	6	84	android/content/res/Resources$NotFoundException
    //   25	31	100	finally
    //   39	52	100	finally
    //   52	72	100	finally
    //   101	104	100	finally
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/svg/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */