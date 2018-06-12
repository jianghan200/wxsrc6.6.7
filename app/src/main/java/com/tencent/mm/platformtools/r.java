package com.tencent.mm.platformtools;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;

public final class r
{
  public static String Vs()
  {
    String str = com.tencent.mm.compatible.util.e.dgl;
    return str.substring(str.indexOf("tencent/MicroMsg"));
  }
  
  public static void a(String paramString, Context paramContext)
  {
    if (bi.oW(paramString)) {
      return;
    }
    paramContext.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(new File(paramString))));
    x.i("MicroMsg.ExportImgUtil", "refreshing media scanner on path=%s", new Object[] { paramString });
  }
  
  public static boolean a(String paramString, Context paramContext, int paramInt)
  {
    if (o.Wf(paramString))
    {
      if (!bi.oW(paramString))
      {
        String str = oN("gif");
        com.tencent.mm.a.e.cs(str);
        if (FileOp.y(paramString, str) >= 0L)
        {
          a(str, paramContext);
          Toast.makeText(paramContext, paramContext.getString(paramInt, new Object[] { Vs() }), 1).show();
          return true;
        }
      }
      return false;
    }
    return a(paramString, paramContext, true, paramInt);
  }
  
  /* Error */
  public static boolean a(String paramString, Context paramContext, boolean paramBoolean, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +35 -> 36
    //   4: aload_0
    //   5: ldc 116
    //   7: invokevirtual 120	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   10: ifne +26 -> 36
    //   13: ldc 122
    //   15: invokestatic 80	com/tencent/mm/platformtools/r:oN	(Ljava/lang/String;)Ljava/lang/String;
    //   18: astore 8
    //   20: aload 8
    //   22: invokestatic 85	com/tencent/mm/a/e:cs	(Ljava/lang/String;)V
    //   25: aload_0
    //   26: aload 8
    //   28: invokestatic 91	com/tencent/mm/modelsfs/FileOp:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   31: lconst_0
    //   32: lcmp
    //   33: ifge +5 -> 38
    //   36: iconst_0
    //   37: ireturn
    //   38: aload 8
    //   40: invokestatic 127	com/tencent/mm/sdk/platformtools/MMNativeJpeg:isProgressive	(Ljava/lang/String;)Z
    //   43: ifeq +75 -> 118
    //   46: aconst_null
    //   47: astore 7
    //   49: aload 8
    //   51: invokestatic 132	com/tencent/mm/sdk/platformtools/BackwardSupportUtil$ExifHelper:VX	(Ljava/lang/String;)I
    //   54: istore 5
    //   56: aload 8
    //   58: invokestatic 136	com/tencent/mm/sdk/platformtools/MMNativeJpeg:decodeAsBitmap	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   61: astore 6
    //   63: aload 6
    //   65: ifnull +172 -> 237
    //   68: iload 5
    //   70: i2f
    //   71: fstore 4
    //   73: aload 6
    //   75: fload 4
    //   77: invokestatic 142	com/tencent/mm/sdk/platformtools/c:b	(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;
    //   80: astore_0
    //   81: aload_0
    //   82: astore 6
    //   84: getstatic 148	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   87: astore 9
    //   89: new 150	java/io/FileOutputStream
    //   92: dup
    //   93: aload 8
    //   95: invokespecial 151	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   98: astore_0
    //   99: aload 6
    //   101: aload 9
    //   103: bipush 80
    //   105: aload_0
    //   106: invokevirtual 157	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   109: pop
    //   110: aload_0
    //   111: ifnull +7 -> 118
    //   114: aload_0
    //   115: invokevirtual 160	java/io/FileOutputStream:close	()V
    //   118: aload 8
    //   120: aload_1
    //   121: invokestatic 93	com/tencent/mm/platformtools/r:a	(Ljava/lang/String;Landroid/content/Context;)V
    //   124: iload_2
    //   125: ifeq +26 -> 151
    //   128: aload_1
    //   129: aload_1
    //   130: iload_3
    //   131: iconst_1
    //   132: anewarray 4	java/lang/Object
    //   135: dup
    //   136: iconst_0
    //   137: invokestatic 95	com/tencent/mm/platformtools/r:Vs	()Ljava/lang/String;
    //   140: aastore
    //   141: invokevirtual 99	android/content/Context:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   144: iconst_1
    //   145: invokestatic 105	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   148: invokevirtual 109	android/widget/Toast:show	()V
    //   151: iconst_1
    //   152: ireturn
    //   153: astore_0
    //   154: ldc 60
    //   156: aload_0
    //   157: ldc -94
    //   159: iconst_0
    //   160: anewarray 4	java/lang/Object
    //   163: invokestatic 166	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   166: goto -82 -> 84
    //   169: astore_0
    //   170: aconst_null
    //   171: astore_0
    //   172: aload 8
    //   174: invokestatic 169	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
    //   177: pop
    //   178: aload_0
    //   179: ifnull -143 -> 36
    //   182: aload_0
    //   183: invokevirtual 160	java/io/FileOutputStream:close	()V
    //   186: iconst_0
    //   187: ireturn
    //   188: astore_0
    //   189: iconst_0
    //   190: ireturn
    //   191: astore_0
    //   192: aload 7
    //   194: astore_1
    //   195: aload_1
    //   196: ifnull +7 -> 203
    //   199: aload_1
    //   200: invokevirtual 160	java/io/FileOutputStream:close	()V
    //   203: aload_0
    //   204: athrow
    //   205: astore_0
    //   206: goto -88 -> 118
    //   209: astore_1
    //   210: goto -7 -> 203
    //   213: astore 6
    //   215: aload_0
    //   216: astore_1
    //   217: aload 6
    //   219: astore_0
    //   220: goto -25 -> 195
    //   223: astore 6
    //   225: aload_0
    //   226: astore_1
    //   227: aload 6
    //   229: astore_0
    //   230: goto -35 -> 195
    //   233: astore_1
    //   234: goto -62 -> 172
    //   237: aconst_null
    //   238: astore_0
    //   239: goto -129 -> 110
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	242	0	paramString	String
    //   0	242	1	paramContext	Context
    //   0	242	2	paramBoolean	boolean
    //   0	242	3	paramInt	int
    //   71	5	4	f	float
    //   54	15	5	i	int
    //   61	39	6	localObject1	Object
    //   213	5	6	localObject2	Object
    //   223	5	6	localObject3	Object
    //   47	146	7	localObject4	Object
    //   18	155	8	str	String
    //   87	15	9	localCompressFormat	android.graphics.Bitmap.CompressFormat
    // Exception table:
    //   from	to	target	type
    //   73	81	153	java/lang/Exception
    //   49	63	169	java/lang/Exception
    //   84	99	169	java/lang/Exception
    //   154	166	169	java/lang/Exception
    //   182	186	188	java/lang/Exception
    //   49	63	191	finally
    //   73	81	191	finally
    //   84	99	191	finally
    //   154	166	191	finally
    //   114	118	205	java/lang/Exception
    //   199	203	209	java/lang/Exception
    //   99	110	213	finally
    //   172	178	223	finally
    //   99	110	233	java/lang/Exception
  }
  
  public static String oN(String paramString)
  {
    return com.tencent.mm.compatible.util.e.dgl + String.format("%s%d.%s", new Object[] { "mmexport", Long.valueOf(System.currentTimeMillis()), paramString });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/platformtools/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */