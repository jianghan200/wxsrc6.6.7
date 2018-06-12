package com.tencent.mm.plugin.sns.data;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.a.g;
import com.tencent.mm.compatible.util.Exif;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsfs.f;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.pluginsdk.ui.d.o;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.KVStatHelper;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.ah;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TimeZone;

public final class i
{
  public static String gVL = "<TimelineObject>";
  public static String gVM = "</TimelineObject>";
  public static int nle = Integer.MAX_VALUE;
  public static String nlf = "/";
  private static String nlg = "snsb";
  private static int nlh = -1;
  private static int nli = -1;
  public static int nlj = 4194304;
  public static int nlk = 1048576;
  
  private static Rect G(Bitmap paramBitmap)
  {
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    return new Rect(i / 4, 0, (int)(i * 3 / 4.0D), j);
  }
  
  private static Rect H(Bitmap paramBitmap)
  {
    return new Rect(0, 0, paramBitmap.getWidth(), paramBitmap.getHeight());
  }
  
  public static String LA(String paramString)
  {
    return "snst_" + LL(paramString);
  }
  
  public static String LB(String paramString)
  {
    return "snsu_" + LL(paramString);
  }
  
  public static String LC(String paramString)
  {
    return "snsb_" + LL(paramString);
  }
  
  public static String LD(String paramString)
  {
    return "snsu_" + LL(paramString);
  }
  
  public static String LE(String paramString)
  {
    return "sns_tmpb_" + LL(paramString);
  }
  
  public static String LF(String paramString)
  {
    return "sns_tmpt_" + LL(paramString);
  }
  
  public static String LG(String paramString)
  {
    return "sns_tmps_" + LL(paramString);
  }
  
  public static com.tencent.mm.memory.n LH(String paramString)
  {
    try
    {
      x.i("MicroMsg.SnsUtil", "decodeFileToBlurThumbBitmap " + FileOp.cn(paramString));
      if (!FileOp.cn(paramString)) {
        return null;
      }
      paramString = LJ(paramString);
      return paramString;
    }
    catch (Exception paramString)
    {
      x.printErrStackTrace("MicroMsg.SnsUtil", paramString, "snsdecode error", new Object[0]);
    }
    return null;
  }
  
  /* Error */
  public static Bitmap LI(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 117	com/tencent/mm/modelsfs/FileOp:cn	(Ljava/lang/String;)Z
    //   4: ifne +5 -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: new 143	android/graphics/BitmapFactory$Options
    //   12: dup
    //   13: invokespecial 145	android/graphics/BitmapFactory$Options:<init>	()V
    //   16: astore 8
    //   18: aload 8
    //   20: invokestatic 151	com/tencent/mm/sdk/platformtools/c:c	(Landroid/graphics/BitmapFactory$Options;)V
    //   23: aload 8
    //   25: iconst_1
    //   26: putfield 154	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   29: aload 8
    //   31: getfield 154	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   34: istore_1
    //   35: iload_1
    //   36: bipush 10
    //   38: if_icmple +5 -> 43
    //   41: aconst_null
    //   42: areturn
    //   43: aload_0
    //   44: invokestatic 158	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   47: astore 5
    //   49: aload 5
    //   51: astore 4
    //   53: new 160	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger
    //   56: dup
    //   57: invokespecial 161	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:<init>	()V
    //   60: astore 9
    //   62: aload 5
    //   64: astore 4
    //   66: invokestatic 167	com/tencent/mm/sdk/platformtools/bi:VG	()J
    //   69: lstore_2
    //   70: aload 5
    //   72: astore 4
    //   74: aload 5
    //   76: aconst_null
    //   77: aload 8
    //   79: aload 9
    //   81: iconst_0
    //   82: iconst_0
    //   83: newarray <illegal type>
    //   85: invokestatic 173	com/tencent/mm/sdk/platformtools/MMBitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;I[I)Landroid/graphics/Bitmap;
    //   88: astore 7
    //   90: aload 5
    //   92: astore 4
    //   94: lload_2
    //   95: invokestatic 177	com/tencent/mm/sdk/platformtools/bi:bI	(J)J
    //   98: lstore_2
    //   99: aload 5
    //   101: astore 4
    //   103: aload 8
    //   105: getfield 154	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   108: iconst_1
    //   109: if_icmple +32 -> 141
    //   112: aload 5
    //   114: astore 4
    //   116: ldc 109
    //   118: new 71	java/lang/StringBuilder
    //   121: dup
    //   122: ldc -77
    //   124: invokespecial 76	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   127: aload 8
    //   129: getfield 154	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   132: invokevirtual 182	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   135: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   138: invokestatic 185	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   141: aload 7
    //   143: ifnull +41 -> 184
    //   146: aload 5
    //   148: astore 4
    //   150: aload_0
    //   151: aload 7
    //   153: invokestatic 189	com/tencent/mm/plugin/sns/data/i:s	(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //   156: astore 6
    //   158: aload 5
    //   160: astore 4
    //   162: aload_0
    //   163: lload_2
    //   164: invokestatic 195	com/tencent/mm/plugin/sns/h/c:ag	(Ljava/lang/String;J)V
    //   167: aload 5
    //   169: ifnull +154 -> 323
    //   172: aload 5
    //   174: invokevirtual 200	java/io/InputStream:close	()V
    //   177: aload 6
    //   179: areturn
    //   180: astore_0
    //   181: aload 6
    //   183: areturn
    //   184: aload 7
    //   186: astore 6
    //   188: aload 5
    //   190: astore 4
    //   192: aload 9
    //   194: invokevirtual 203	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:getDecodeResult	()I
    //   197: sipush 2000
    //   200: if_icmplt -33 -> 167
    //   203: aload 5
    //   205: astore 4
    //   207: aload_0
    //   208: bipush 10
    //   210: aload 9
    //   212: invokestatic 209	com/tencent/mm/sdk/platformtools/MMBitmapFactory$KVStatHelper:getKVStatString	(Ljava/lang/Object;ILcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;)Ljava/lang/String;
    //   215: astore 6
    //   217: aload 5
    //   219: astore 4
    //   221: getstatic 215	com/tencent/mm/plugin/report/service/h:mEJ	Lcom/tencent/mm/plugin/report/service/h;
    //   224: sipush 12712
    //   227: aload 6
    //   229: invokevirtual 219	com/tencent/mm/plugin/report/service/h:k	(ILjava/lang/String;)V
    //   232: aload 7
    //   234: astore 6
    //   236: goto -69 -> 167
    //   239: astore 4
    //   241: aload 5
    //   243: astore 4
    //   245: aload 8
    //   247: aload 8
    //   249: getfield 154	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   252: iconst_1
    //   253: iadd
    //   254: putfield 154	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   257: aload 5
    //   259: ifnull -230 -> 29
    //   262: aload 5
    //   264: invokevirtual 200	java/io/InputStream:close	()V
    //   267: goto -238 -> 29
    //   270: astore 4
    //   272: goto -243 -> 29
    //   275: astore_0
    //   276: aconst_null
    //   277: astore 4
    //   279: aload 4
    //   281: ifnull +8 -> 289
    //   284: aload 4
    //   286: invokevirtual 200	java/io/InputStream:close	()V
    //   289: aload_0
    //   290: athrow
    //   291: astore_0
    //   292: ldc 109
    //   294: aload_0
    //   295: ldc -125
    //   297: iconst_0
    //   298: anewarray 4	java/lang/Object
    //   301: invokestatic 135	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   304: aconst_null
    //   305: areturn
    //   306: astore 4
    //   308: goto -19 -> 289
    //   311: astore_0
    //   312: goto -33 -> 279
    //   315: astore 4
    //   317: aconst_null
    //   318: astore 5
    //   320: goto -79 -> 241
    //   323: aload 6
    //   325: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	326	0	paramString	String
    //   34	5	1	i	int
    //   69	95	2	l	long
    //   51	169	4	localInputStream1	java.io.InputStream
    //   239	1	4	localOutOfMemoryError1	OutOfMemoryError
    //   243	1	4	localInputStream2	java.io.InputStream
    //   270	1	4	localIOException1	java.io.IOException
    //   277	8	4	localObject1	Object
    //   306	1	4	localIOException2	java.io.IOException
    //   315	1	4	localOutOfMemoryError2	OutOfMemoryError
    //   47	272	5	localInputStream3	java.io.InputStream
    //   156	168	6	localObject2	Object
    //   88	145	7	localBitmap	Bitmap
    //   16	232	8	localOptions	BitmapFactory.Options
    //   60	151	9	localDecodeResultLogger	MMBitmapFactory.DecodeResultLogger
    // Exception table:
    //   from	to	target	type
    //   172	177	180	java/io/IOException
    //   53	62	239	java/lang/OutOfMemoryError
    //   66	70	239	java/lang/OutOfMemoryError
    //   74	90	239	java/lang/OutOfMemoryError
    //   94	99	239	java/lang/OutOfMemoryError
    //   103	112	239	java/lang/OutOfMemoryError
    //   116	141	239	java/lang/OutOfMemoryError
    //   150	158	239	java/lang/OutOfMemoryError
    //   162	167	239	java/lang/OutOfMemoryError
    //   192	203	239	java/lang/OutOfMemoryError
    //   207	217	239	java/lang/OutOfMemoryError
    //   221	232	239	java/lang/OutOfMemoryError
    //   262	267	270	java/io/IOException
    //   43	49	275	finally
    //   0	7	291	java/lang/Exception
    //   9	29	291	java/lang/Exception
    //   29	35	291	java/lang/Exception
    //   172	177	291	java/lang/Exception
    //   262	267	291	java/lang/Exception
    //   284	289	291	java/lang/Exception
    //   289	291	291	java/lang/Exception
    //   284	289	306	java/io/IOException
    //   53	62	311	finally
    //   66	70	311	finally
    //   74	90	311	finally
    //   94	99	311	finally
    //   103	112	311	finally
    //   116	141	311	finally
    //   150	158	311	finally
    //   162	167	311	finally
    //   192	203	311	finally
    //   207	217	311	finally
    //   221	232	311	finally
    //   245	257	311	finally
    //   43	49	315	java/lang/OutOfMemoryError
  }
  
  public static com.tencent.mm.memory.n LJ(String paramString)
  {
    try
    {
      if (!FileOp.cn(paramString)) {
        return null;
      }
      BitmapFactory.Options localOptions = new BitmapFactory.Options();
      com.tencent.mm.sdk.platformtools.c.c(localOptions);
      localOptions.inSampleSize = 1;
      for (;;)
      {
        int i = localOptions.inSampleSize;
        if (i > 10) {
          break;
        }
        try
        {
          Object localObject = new MMBitmapFactory.DecodeResultLogger();
          long l = bi.VG();
          com.tencent.mm.memory.n localn = com.tencent.mm.plugin.sns.d.a.c(paramString, localOptions, (MMBitmapFactory.DecodeResultLogger)localObject);
          l = bi.bI(l);
          if (localn != null)
          {
            com.tencent.mm.plugin.sns.h.c.ag(paramString, l);
          }
          else if (((MMBitmapFactory.DecodeResultLogger)localObject).getDecodeResult() >= 2000)
          {
            localObject = MMBitmapFactory.KVStatHelper.getKVStatString(paramString, 10, (MMBitmapFactory.DecodeResultLogger)localObject);
            h.mEJ.k(12712, (String)localObject);
          }
        }
        catch (OutOfMemoryError localOutOfMemoryError)
        {
          localOptions.inSampleSize += 1;
        }
      }
      return null;
    }
    catch (Exception paramString)
    {
      x.printErrStackTrace("MicroMsg.SnsUtil", paramString, "snsdecode error", new Object[0]);
    }
    return localOutOfMemoryError;
  }
  
  public static String LK(String paramString)
  {
    paramString = new StringBuffer(paramString);
    while (paramString.length() < 25) {
      paramString.insert(0, "0");
    }
    return paramString.toString();
  }
  
  private static String LL(String paramString)
  {
    if (paramString == null) {
      return "";
    }
    int j = paramString.length();
    int i = 0;
    while ((i < j) && (paramString.charAt(i) == '0')) {
      i += 1;
    }
    return paramString.substring(i);
  }
  
  public static boolean LM(String paramString)
  {
    return paramString.startsWith(e.bnC);
  }
  
  public static boolean LN(String paramString)
  {
    boolean bool = false;
    try
    {
      BitmapFactory.Options localOptions = new BitmapFactory.Options();
      localOptions.inJustDecodeBounds = true;
      BitmapFactory.decodeFile(paramString, localOptions);
      int i = localOptions.outWidth;
      int j = localOptions.outHeight;
      if ((j >= i * 2) || (i >= j * 2)) {
        bool = true;
      }
      return bool;
    }
    catch (Exception paramString)
    {
      x.e("MicroMsg.SnsUtil", "get error setImageExtInfo");
    }
    return false;
  }
  
  public static boolean LO(String paramString)
  {
    int i = nlj;
    int j;
    int k;
    do
    {
      try
      {
        paramString = com.tencent.mm.sdk.platformtools.c.VZ(paramString);
        j = paramString.outWidth;
        k = paramString.outHeight;
        if ((k <= 0) && (j <= 0)) {
          return false;
        }
      }
      catch (Exception paramString)
      {
        x.e("MicroMsg.SnsUtil", "get error setImageExtInfo");
        return false;
      }
    } while ((k >= j * 2) || (j >= k * 2) || (k * j <= i));
    return true;
  }
  
  public static long LP(String paramString)
  {
    long l1 = 0L;
    if (TextUtils.isEmpty(paramString)) {
      return 0L;
    }
    try
    {
      long l2 = new BigInteger(paramString).longValue();
      l1 = l2;
      x.i("MicroMsg.SnsUtil", "seq %s to snsId %d ", new Object[] { paramString, Long.valueOf(l2) });
      return l2;
    }
    catch (Exception paramString) {}
    return l1;
  }
  
  /* Error */
  public static int LQ(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 319	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   4: ifeq +5 -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: ldc 109
    //   11: ldc_w 321
    //   14: iconst_1
    //   15: anewarray 4	java/lang/Object
    //   18: dup
    //   19: iconst_0
    //   20: aload_0
    //   21: aastore
    //   22: invokestatic 312	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   25: new 323	android/media/MediaMetadataRetriever
    //   28: dup
    //   29: invokespecial 324	android/media/MediaMetadataRetriever:<init>	()V
    //   32: astore_3
    //   33: aload_3
    //   34: astore_2
    //   35: aload_3
    //   36: aload_0
    //   37: invokevirtual 327	android/media/MediaMetadataRetriever:setDataSource	(Ljava/lang/String;)V
    //   40: aload_3
    //   41: astore_2
    //   42: aload_3
    //   43: bipush 9
    //   45: invokevirtual 330	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   48: iconst_0
    //   49: invokestatic 334	com/tencent/mm/sdk/platformtools/bi:getInt	(Ljava/lang/String;I)I
    //   52: i2l
    //   53: invokestatic 338	com/tencent/mm/sdk/platformtools/bi:ge	(J)I
    //   56: istore_1
    //   57: aload_3
    //   58: invokevirtual 341	android/media/MediaMetadataRetriever:release	()V
    //   61: iload_1
    //   62: ireturn
    //   63: astore_2
    //   64: aconst_null
    //   65: astore_3
    //   66: aload_3
    //   67: astore_2
    //   68: ldc 109
    //   70: ldc_w 343
    //   73: iconst_1
    //   74: anewarray 4	java/lang/Object
    //   77: dup
    //   78: iconst_0
    //   79: aload_0
    //   80: aastore
    //   81: invokestatic 345	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   84: aload_3
    //   85: ifnull +30 -> 115
    //   88: aload_3
    //   89: invokevirtual 341	android/media/MediaMetadataRetriever:release	()V
    //   92: iconst_0
    //   93: ireturn
    //   94: astore_0
    //   95: aconst_null
    //   96: astore_2
    //   97: aload_2
    //   98: ifnull +7 -> 105
    //   101: aload_2
    //   102: invokevirtual 341	android/media/MediaMetadataRetriever:release	()V
    //   105: aload_0
    //   106: athrow
    //   107: astore_0
    //   108: goto -11 -> 97
    //   111: astore_2
    //   112: goto -46 -> 66
    //   115: iconst_0
    //   116: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	117	0	paramString	String
    //   56	6	1	i	int
    //   34	8	2	localMediaMetadataRetriever1	android.media.MediaMetadataRetriever
    //   63	1	2	localThrowable1	Throwable
    //   67	35	2	localMediaMetadataRetriever2	android.media.MediaMetadataRetriever
    //   111	1	2	localThrowable2	Throwable
    //   32	57	3	localMediaMetadataRetriever3	android.media.MediaMetadataRetriever
    // Exception table:
    //   from	to	target	type
    //   0	7	63	java/lang/Throwable
    //   9	33	63	java/lang/Throwable
    //   0	7	94	finally
    //   9	33	94	finally
    //   35	40	107	finally
    //   42	57	107	finally
    //   68	84	107	finally
    //   35	40	111	java/lang/Throwable
    //   42	57	111	java/lang/Throwable
  }
  
  public static long NL()
  {
    return (int)(TimeZone.getDefault().getRawOffset() / 60000L) / 60L;
  }
  
  public static SpannableString a(String paramString, Context paramContext, TextView paramTextView)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder("<img src=\"original_label.png\"/>  ");
    localStringBuilder.append(paramString);
    return new SpannableString(j.c(paramContext, localStringBuilder.toString(), (int)paramTextView.getTextSize()));
  }
  
  public static String aE(int paramInt, String paramString)
  {
    return paramInt + "-" + paramString;
  }
  
  public static String aF(int paramInt, String paramString)
  {
    return paramInt + "-" + paramString;
  }
  
  public static void af(String paramString, long paramLong)
  {
    long l = System.currentTimeMillis();
    x.d("MicroMsg.SnsUtil", " name " + paramString + " allTime " + (l - paramLong));
  }
  
  public static void b(View paramView, Context paramContext)
  {
    ViewGroup.LayoutParams localLayoutParams;
    int i;
    int k;
    if ((paramView != null) && (ah.fe(paramContext) > 1.0F))
    {
      float f = ah.fe(paramContext);
      localLayoutParams = paramView.getLayoutParams();
      i = com.tencent.mm.bp.a.fromDPToPix(paramContext, 60);
      if ((localLayoutParams.width >= 0) && (localLayoutParams.height >= 0))
      {
        int m = (int)(localLayoutParams.width * f);
        k = (int)(f * localLayoutParams.height);
        int j = m;
        if (m > i) {
          j = i;
        }
        localLayoutParams.width = j;
        if (k <= i) {
          break label108;
        }
      }
    }
    for (;;)
    {
      localLayoutParams.height = i;
      paramView.setLayoutParams(localLayoutParams);
      return;
      label108:
      i = k;
    }
  }
  
  public static boolean b(com.tencent.mm.memory.n paramn)
  {
    return (paramn != null) && (!paramn.isRecycled());
  }
  
  public static int bwY()
  {
    return ad.getContext().getSharedPreferences(ad.chY(), 0).getInt("sns_control_flag", 0);
  }
  
  public static int bwZ()
  {
    return ad.getContext().getSharedPreferences(ad.chY(), 0).getInt("sns_respone_count", 20);
  }
  
  public static int bxa()
  {
    Context localContext = ad.getContext();
    if (ao.is2G(localContext)) {
      return 1;
    }
    if (ao.is3G(localContext)) {
      return 2;
    }
    if (ao.is4G(localContext)) {
      return 3;
    }
    if (ao.isWifi(localContext)) {
      return 4;
    }
    return 0;
  }
  
  private static String c(ate paramate)
  {
    if (!bi.oW(paramate.rVS)) {
      return paramate.rVS;
    }
    try
    {
      paramate = g.u(paramate.toByteArray());
      return paramate;
    }
    catch (Exception paramate) {}
    return "";
  }
  
  public static String cf(List<ate> paramList)
  {
    if ((paramList == null) || (paramList.size() == 0))
    {
      localObject = "";
      return (String)localObject;
    }
    Object localObject = "";
    Iterator localIterator = paramList.iterator();
    int i = 0;
    paramList = (List<ate>)localObject;
    for (;;)
    {
      localObject = paramList;
      if (!localIterator.hasNext()) {
        break;
      }
      ate localate = (ate)localIterator.next();
      localObject = paramList;
      if (paramList.length() > 0) {
        localObject = paramList + "-";
      }
      paramList = (String)localObject + localate.ksA;
      i += 1;
      localObject = paramList;
      if (i >= 4) {
        break;
      }
    }
  }
  
  public static String d(ate paramate)
  {
    String str2 = "snsb_" + LL(paramate.ksA);
    String str1 = str2;
    if (paramate.rVQ == 1) {
      str1 = f.q(str2 + c(paramate), paramate.rVR);
    }
    return str1;
  }
  
  public static String e(ate paramate)
  {
    String str2 = "snst_" + LL(paramate.ksA);
    String str1 = str2;
    if (paramate.rVQ == 1) {
      str1 = f.q(str2 + c(paramate), paramate.rVR);
    }
    return str1;
  }
  
  public static String eF(long paramLong)
  {
    return new BigInteger(Long.toBinaryString(paramLong), 2).toString();
  }
  
  public static String eG(long paramLong)
  {
    if (paramLong == 0L) {
      return "";
    }
    return LK(new BigInteger(Long.toBinaryString(paramLong), 2).toString());
  }
  
  public static String f(ate paramate)
  {
    String str2 = "snsu_" + LL(paramate.ksA);
    String str1 = str2;
    if (paramate.rVQ == 1) {
      str1 = f.q(str2 + c(paramate), paramate.rVR);
    }
    return str1;
  }
  
  public static boolean f(com.tencent.mm.plugin.sns.storage.n paramn)
  {
    return (paramn.field_type == 3) || (paramn.field_type == 4) || (paramn.field_type == 5) || (paramn.field_type == 6) || (paramn.field_type == 9) || (paramn.field_type == 10) || (paramn.field_type == 11) || (paramn.field_type == 12) || (paramn.field_type == 13) || (paramn.field_type == 14) || (paramn.field_type == 17) || (paramn.field_type == 22) || (paramn.field_type == 23);
  }
  
  public static String g(com.tencent.mm.plugin.sns.storage.n paramn)
  {
    if (paramn == null) {
      return "0";
    }
    return eF(paramn.field_snsId);
  }
  
  public static String g(ate paramate)
  {
    String str2 = "snsblurt_" + LL(paramate.ksA);
    String str1 = str2;
    if (paramate.rVQ == 1) {
      str1 = f.q(str2 + c(paramate), paramate.rVR);
    }
    return str1;
  }
  
  public static String h(ate paramate)
  {
    String str2 = "snsblurs_" + LL(paramate.ksA);
    String str1 = str2;
    if (paramate.rVQ == 1) {
      str1 = f.q(str2 + c(paramate), paramate.rVR);
    }
    return str1;
  }
  
  public static Bitmap i(List<com.tencent.mm.memory.n> paramList, int paramInt)
  {
    Object localObject1 = paramList.iterator();
    while (((Iterator)localObject1).hasNext()) {
      if (!b((com.tencent.mm.memory.n)((Iterator)localObject1).next())) {
        return null;
      }
    }
    if (paramInt <= 0) {
      return null;
    }
    Bitmap localBitmap = Bitmap.createBitmap(paramInt, paramInt, Bitmap.Config.ARGB_8888);
    int i = paramList.size();
    LinkedList localLinkedList = new LinkedList();
    int k = paramInt >> 1;
    int j = k + 2;
    k -= 2;
    Object localObject2;
    label157:
    Object localObject3;
    Rect localRect;
    if (i == 2)
    {
      localObject1 = new Rect(0, 0, k, paramInt);
      localObject2 = new Rect(j, 0, paramInt, paramInt);
      localLinkedList.add(localObject1);
      localLinkedList.add(localObject2);
      localObject2 = new Canvas(localBitmap);
      ((Canvas)localObject2).drawColor(-1);
      i = 0;
      paramInt = 0;
      if ((paramInt >= paramList.size()) || (i >= 4)) {
        break label489;
      }
      localObject3 = ((com.tencent.mm.memory.n)paramList.get(paramInt)).Fx();
      localRect = (Rect)localLinkedList.get(paramInt);
      switch (paramList.size())
      {
      default: 
        localObject1 = H((Bitmap)localObject3);
      }
    }
    for (;;)
    {
      ((Canvas)localObject2).drawBitmap((Bitmap)localObject3, (Rect)localObject1, localRect, null);
      i += 1;
      paramInt += 1;
      break label157;
      if (i == 3)
      {
        localObject1 = new Rect(0, 0, k, paramInt);
        localObject2 = new Rect(j, 0, paramInt, k);
        localObject3 = new Rect(j, j, paramInt, paramInt);
        localLinkedList.add(localObject1);
        localLinkedList.add(localObject2);
        localLinkedList.add(localObject3);
        break;
      }
      if (i < 4) {
        break;
      }
      localObject1 = new Rect(0, 0, k, k);
      localObject2 = new Rect(0, j, k, paramInt);
      localObject3 = new Rect(j, 0, paramInt, k);
      localRect = new Rect(j, j, paramInt, paramInt);
      localLinkedList.add(localObject1);
      localLinkedList.add(localObject2);
      localLinkedList.add(localObject3);
      localLinkedList.add(localRect);
      break;
      localObject1 = H((Bitmap)localObject3);
      continue;
      localObject1 = G((Bitmap)localObject3);
      continue;
      if (paramInt == 0) {
        localObject1 = G((Bitmap)localObject3);
      } else {
        localObject1 = H((Bitmap)localObject3);
      }
    }
    label489:
    ((Canvas)localObject2).save(31);
    ((Canvas)localObject2).restore();
    return localBitmap;
  }
  
  public static String i(ate paramate)
  {
    String str2 = "snstblur_src_" + LL(paramate.ksA);
    String str1 = str2;
    if (paramate.rVQ == 1) {
      str1 = f.q(str2 + c(paramate), paramate.rVR);
    }
    return str1;
  }
  
  public static String j(ate paramate)
  {
    String str2 = "sight_" + LL(paramate.ksA);
    String str1 = str2;
    if (paramate.rVQ == 1) {
      str1 = f.q(str2 + c(paramate), paramate.rVR);
    }
    return str1;
  }
  
  public static String k(ate paramate)
  {
    String str2 = "sightad_" + LL(paramate.ksA);
    String str1 = str2;
    if (paramate.rVQ == 1) {
      str1 = f.q(str2, paramate.rVR);
    }
    return str1;
  }
  
  public static String l(ate paramate)
  {
    String str2 = "snsb_" + LL(paramate.ksA);
    String str1 = str2;
    if (paramate.rVQ == 1) {
      str1 = f.q(str2 + c(paramate), paramate.rVR);
    }
    return str1;
  }
  
  public static String m(ate paramate)
  {
    String str2 = "sns_tmpb_" + LL(paramate.ksA);
    String str1 = str2;
    if (paramate.rVQ == 1) {
      str1 = f.q(str2 + c(paramate), paramate.rVR);
    }
    return str1;
  }
  
  public static String n(ate paramate)
  {
    String str2 = "sns_tmpt_" + LL(paramate.ksA);
    String str1 = str2;
    if (paramate.rVQ == 1) {
      str1 = f.q(str2 + c(paramate), paramate.rVR);
    }
    return str1;
  }
  
  public static String o(ate paramate)
  {
    String str2 = "sns_tmpu_" + LL(paramate.ksA);
    String str1 = str2;
    if (paramate.rVQ == 1) {
      str1 = f.q(str2 + c(paramate), paramate.rVR);
    }
    return str1;
  }
  
  public static String p(ate paramate)
  {
    String str2 = "sns_tmps_" + LL(paramate.ksA);
    String str1 = str2;
    if (paramate.rVQ == 1) {
      str1 = f.q(str2 + c(paramate), paramate.rVR);
    }
    return str1;
  }
  
  public static String q(ate paramate)
  {
    String str2 = "sns_tmpsad_" + LL(paramate.ksA);
    String str1 = str2;
    if (paramate.rVQ == 1) {
      str1 = f.q(str2 + c(paramate), paramate.rVR);
    }
    return str1;
  }
  
  public static boolean q(Bitmap paramBitmap)
  {
    return (paramBitmap != null) && (!paramBitmap.isRecycled());
  }
  
  public static Bitmap s(String paramString, Bitmap paramBitmap)
  {
    Bitmap localBitmap;
    if (paramBitmap == null) {
      localBitmap = null;
    }
    String str;
    do
    {
      return localBitmap;
      if (!bi.oW(paramString)) {
        break;
      }
      str = "";
      localBitmap = paramBitmap;
    } while (bi.oW(str));
    for (;;)
    {
      try
      {
        x.i("MicroMsg.SnsUtil", "[changes below by tomys]parsing jpg, path: %s, size: %s", new Object[] { paramString, Long.valueOf(FileOp.mI(paramString)) });
        paramString = Exif.fromFile(paramString);
        if (paramString == null) {
          break label223;
        }
        i = paramString.getOrientationInDegree() % 360;
      }
      catch (Exception paramString)
      {
        paramString = paramString;
        x.printErrStackTrace("MicroMsg.SnsUtil", paramString, "Failed parsing JPEG file: " + str, new Object[0]);
        i = 0;
        continue;
      }
      finally {}
      x.d("MicroMsg.SnsUtil", "exifPath : %s degree : %d", new Object[] { str, Integer.valueOf(i) });
      return com.tencent.mm.sdk.platformtools.c.b(paramBitmap, i);
      int i = paramString.lastIndexOf(nlf);
      if ((i > 0) && (i + 1 < paramString.length()))
      {
        str = paramString.substring(i + 1);
        if ((str.startsWith(nlg)) || (str.startsWith("sns_tmpb_")))
        {
          str = paramString;
          break;
        }
        if ((str.startsWith("snst_")) || (str.startsWith("snsu_")))
        {
          str = "";
          break;
        }
      }
      str = paramString;
      break;
      label223:
      i = 0;
    }
  }
  
  public static boolean wl(int paramInt)
  {
    ad.getContext().getSharedPreferences(ad.chY(), 0).edit().putInt("sns_control_flag", paramInt).commit();
    return true;
  }
  
  public static boolean wm(int paramInt)
  {
    ad.getContext().getSharedPreferences(ad.chY(), 0).edit().putInt("sns_respone_count", paramInt).commit();
    return true;
  }
  
  public static String y(CharSequence paramCharSequence)
  {
    int i = 0;
    if (paramCharSequence == null) {
      return "";
    }
    paramCharSequence = new SpannableString(paramCharSequence);
    o[] arrayOfo = (o[])paramCharSequence.getSpans(0, paramCharSequence.length(), o.class);
    x.d("MicroMsg.SnsUtil", "removeClickSpanInString, clickSpans.length:%d", new Object[] { Integer.valueOf(arrayOfo.length) });
    while (i < arrayOfo.length)
    {
      paramCharSequence.removeSpan(arrayOfo[i]);
      i += 1;
    }
    return paramCharSequence.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/data/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */