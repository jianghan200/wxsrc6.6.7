package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class sz
{
  private static final int a;
  private static final int b;
  
  static
  {
    Double.doubleToRawLongBits(0.0D);
    Double.doubleToRawLongBits(0.0D);
    a = Float.floatToRawIntBits(0.0F);
    b = Float.floatToRawIntBits(0.0F);
    Double.longBitsToDouble(4368491638549381120L);
    Double.longBitsToDouble(4503599627370496L);
  }
  
  public static int a(Object[] paramArrayOfObject)
  {
    return Arrays.hashCode(paramArrayOfObject);
  }
  
  public static Bitmap a(Bitmap paramBitmap, float paramFloat)
  {
    if ((paramBitmap == null) || (paramBitmap.isRecycled())) {
      return null;
    }
    int i = (int)(paramBitmap.getWidth() * paramFloat);
    int j = (int)(paramBitmap.getHeight() * paramFloat);
    try
    {
      paramBitmap = Bitmap.createScaledBitmap(paramBitmap, i, j, true);
      return paramBitmap;
    }
    catch (Exception paramBitmap) {}
    return null;
  }
  
  public static qv a(qw paramqw)
  {
    return new qv((int)(paramqw.b() * 1000000.0D), (int)(paramqw.c() * 1000000.0D));
  }
  
  public static String a(Context paramContext)
  {
    if (paramContext == null) {
      paramContext = "";
    }
    String str1;
    for (;;)
    {
      return paramContext;
      String str2 = "";
      str1 = str2;
      try
      {
        ApplicationInfo localApplicationInfo = paramContext.getPackageManager().getApplicationInfo(sl.a().getPackageName(), 128);
        str1 = str2;
        str2 = localApplicationInfo.metaData.getString("com.tencent.map.api_key");
        paramContext = str2;
        str1 = str2;
        if (TextUtils.isEmpty(str2))
        {
          str1 = str2;
          paramContext = localApplicationInfo.metaData.getString("TencentMapSDK");
          return paramContext;
        }
      }
      catch (Exception paramContext)
      {
        new StringBuilder("error get mapkey:").append(paramContext.getMessage());
      }
    }
    return str1;
  }
  
  public static String a(String paramString, Object paramObject)
  {
    return paramString + "=" + String.valueOf(paramObject);
  }
  
  public static String a(String... paramVarArgs)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int k = paramVarArgs.length;
    int j = 0;
    int i = 0;
    while (j < k)
    {
      localStringBuilder.append(paramVarArgs[j]);
      if (i != paramVarArgs.length - 1) {
        localStringBuilder.append(",");
      }
      j += 1;
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  public static void a(View paramView, int paramInt)
  {
    Field localField = null;
    Object localObject2 = View.class.getMethods();
    int j = localObject2.length;
    int i = 0;
    for (;;)
    {
      Object localObject1;
      if (i < j)
      {
        localObject1 = localObject2[i];
        if (!((Method)localObject1).getName().equals("setLayerType")) {}
      }
      else
      {
        while (localObject1 != null)
        {
          switch (paramInt)
          {
          }
          for (;;)
          {
            localObject2 = localField;
            if (localField == null) {}
            try
            {
              localObject2 = View.class.getField("LAYER_TYPE_SOFTWARE");
              ((Method)localObject1).invoke(paramView, new Object[] { Integer.valueOf(((Field)localObject2).getInt(null)), null });
              return;
            }
            catch (Exception paramView)
            {
              return;
            }
            localField = View.class.getField("LAYER_TYPE_NONE");
            continue;
            localField = View.class.getField("LAYER_TYPE_SOFTWARE");
            continue;
            localField = View.class.getField("LAYER_TYPE_HARDWARE");
          }
          localObject1 = null;
        }
        return;
      }
      i += 1;
    }
  }
  
  public static boolean a(float paramFloat1, float paramFloat2)
  {
    int j = Float.floatToRawIntBits(paramFloat1);
    int k = Float.floatToRawIntBits(0.0F);
    int i;
    if (((j ^ k) & 0x80000000) == 0) {
      if (Math.abs(j - k) <= 1) {
        i = 1;
      }
    }
    while ((i != 0) && (!Float.isNaN(paramFloat1)) && (!Float.isNaN(0.0F)))
    {
      return true;
      i = 0;
      continue;
      if (j < k)
      {
        i = k - a;
        j -= b;
      }
      for (;;)
      {
        if ((i > 1) || (j > 1 - i)) {
          break label111;
        }
        i = 1;
        break;
        i = j - a;
        j = k - b;
      }
      label111:
      i = 0;
    }
    return false;
  }
  
  public static boolean a(qw paramqw, List<qw> paramList)
  {
    boolean bool;
    if ((paramList == null) || (paramList.size() < 3) || (paramqw == null)) {
      bool = false;
    }
    int i;
    int k;
    int j;
    do
    {
      return bool;
      i = paramList.size();
      k = 0;
      j = i - 1;
      i = 0;
      bool = k;
    } while (i >= paramList.size());
    if (((((qw)paramList.get(i)).b() < paramqw.b()) && (((qw)paramList.get(j)).b() >= paramqw.b())) || ((((qw)paramList.get(j)).b() < paramqw.b()) && (((qw)paramList.get(i)).b() >= paramqw.b()) && ((((qw)paramList.get(i)).c() <= paramqw.c()) || (((qw)paramList.get(j)).c() <= paramqw.c())))) {
      if (((qw)paramList.get(i)).c() + (paramqw.b() - ((qw)paramList.get(i)).b()) / (((qw)paramList.get(j)).b() - ((qw)paramList.get(i)).b()) * (((qw)paramList.get(j)).c() - ((qw)paramList.get(i)).c()) < paramqw.c())
      {
        j = 1;
        label278:
        k ^= j;
      }
    }
    for (;;)
    {
      j = i;
      i += 1;
      break;
      j = 0;
      break label278;
    }
  }
  
  public static final boolean a(Collection<?> paramCollection)
  {
    return (paramCollection == null) || (paramCollection.size() <= 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/sz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */