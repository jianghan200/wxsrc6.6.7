package com.tencent.mm.compatible.g;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;

public final class a
  extends BitmapFactory
{
  private static a dfW = null;
  
  /* Error */
  private static Bitmap a(Resources paramResources, int paramInt, BitmapFactory.Options paramOptions)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aload_2
    //   4: invokestatic 25	com/tencent/mm/sdk/platformtools/c:c	(Landroid/graphics/BitmapFactory$Options;)V
    //   7: new 27	android/util/TypedValue
    //   10: dup
    //   11: invokespecial 30	android/util/TypedValue:<init>	()V
    //   14: astore 5
    //   16: aload_0
    //   17: iload_1
    //   18: aload 5
    //   20: invokevirtual 36	android/content/res/Resources:openRawResource	(ILandroid/util/TypedValue;)Ljava/io/InputStream;
    //   23: astore_3
    //   24: aload_0
    //   25: aload 5
    //   27: aload_3
    //   28: aconst_null
    //   29: aload_2
    //   30: invokestatic 40	com/tencent/mm/compatible/g/a:decodeResourceStream	(Landroid/content/res/Resources;Landroid/util/TypedValue;Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   33: astore_0
    //   34: aload_0
    //   35: ifnonnull +119 -> 154
    //   38: aload_3
    //   39: invokestatic 44	com/tencent/mm/compatible/g/a:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   42: astore 4
    //   44: aload 4
    //   46: astore_0
    //   47: aload_0
    //   48: astore 4
    //   50: aload_3
    //   51: ifnull +10 -> 61
    //   54: aload_3
    //   55: invokevirtual 49	java/io/InputStream:close	()V
    //   58: aload_0
    //   59: astore 4
    //   61: aload 4
    //   63: ifnonnull +77 -> 140
    //   66: aload_2
    //   67: ifnull +73 -> 140
    //   70: new 51	java/lang/IllegalArgumentException
    //   73: dup
    //   74: ldc 53
    //   76: invokespecial 56	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   79: athrow
    //   80: astore_0
    //   81: aconst_null
    //   82: astore_3
    //   83: aconst_null
    //   84: astore_0
    //   85: aload_0
    //   86: astore 4
    //   88: aload_3
    //   89: ifnull -28 -> 61
    //   92: aload_3
    //   93: invokevirtual 49	java/io/InputStream:close	()V
    //   96: aload_0
    //   97: astore 4
    //   99: goto -38 -> 61
    //   102: astore_3
    //   103: aload_0
    //   104: astore 4
    //   106: goto -45 -> 61
    //   109: astore_0
    //   110: aconst_null
    //   111: astore_2
    //   112: aload_2
    //   113: ifnull +7 -> 120
    //   116: aload_2
    //   117: invokevirtual 49	java/io/InputStream:close	()V
    //   120: aload_0
    //   121: athrow
    //   122: astore_0
    //   123: aload 4
    //   125: astore_0
    //   126: goto -92 -> 34
    //   129: astore_3
    //   130: aload_0
    //   131: astore 4
    //   133: goto -72 -> 61
    //   136: astore_2
    //   137: goto -17 -> 120
    //   140: aload 4
    //   142: areturn
    //   143: astore_0
    //   144: aload_3
    //   145: astore_2
    //   146: goto -34 -> 112
    //   149: astore 4
    //   151: goto -66 -> 85
    //   154: goto -107 -> 47
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	157	0	paramResources	Resources
    //   0	157	1	paramInt	int
    //   0	157	2	paramOptions	BitmapFactory.Options
    //   23	70	3	localInputStream	java.io.InputStream
    //   102	1	3	localIOException1	java.io.IOException
    //   129	16	3	localIOException2	java.io.IOException
    //   1	140	4	localObject	Object
    //   149	1	4	localException	Exception
    //   14	12	5	localTypedValue	android.util.TypedValue
    // Exception table:
    //   from	to	target	type
    //   7	24	80	java/lang/Exception
    //   92	96	102	java/io/IOException
    //   7	24	109	finally
    //   24	34	122	java/lang/Exception
    //   54	58	129	java/io/IOException
    //   116	120	136	java/io/IOException
    //   24	34	143	finally
    //   38	44	143	finally
    //   38	44	149	java/lang/Exception
  }
  
  public static void a(a parama)
  {
    dfW = parama;
  }
  
  public static Bitmap decodeResource(Resources paramResources, int paramInt)
  {
    return decodeResource(paramResources, paramInt, null);
  }
  
  public static Bitmap decodeResource(Resources paramResources, int paramInt, BitmapFactory.Options paramOptions)
  {
    if (dfW != null)
    {
      Bitmap localBitmap = dfW.decodeResource(paramResources, paramInt, paramOptions);
      if (localBitmap != null) {
        return localBitmap;
      }
    }
    return a(paramResources, paramInt, paramOptions);
  }
  
  public static abstract interface a
  {
    public abstract Bitmap decodeResource(Resources paramResources, int paramInt, BitmapFactory.Options paramOptions);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/compatible/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */