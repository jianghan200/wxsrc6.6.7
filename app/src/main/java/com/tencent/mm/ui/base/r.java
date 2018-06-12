package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.os.Environment;
import android.os.StatFs;
import android.util.StringBuilderPrinter;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@TargetApi(16)
final class r
  extends SurfaceTexture
{
  public SurfaceTexture iSV = null;
  
  public r()
  {
    super(0);
  }
  
  private static String JB()
  {
    StringBuilder localStringBuilder = new StringBuilder(256);
    StringBuilderPrinter localStringBuilderPrinter = new StringBuilderPrinter(localStringBuilder);
    Object localObject2 = ad.getContext();
    localStringBuilderPrinter.println("#accinfo.revision=" + d.REV);
    localStringBuilderPrinter.println("#accinfo.build=" + d.TIME + ":" + d.HOSTNAME + ":" + com.tencent.mm.sdk.platformtools.e.bxk);
    Object localObject3 = new StringBuilder("#accinfo.env=");
    Object localObject1;
    if (b.foreground) {
      localObject1 = "f";
    }
    for (;;)
    {
      localStringBuilderPrinter.println((String)localObject1 + ":" + Thread.currentThread().getName() + ":" + b.sFc);
      try
      {
        localObject1 = Environment.getDataDirectory();
        localObject3 = new StatFs(((File)localObject1).getPath());
        StatFs localStatFs = new StatFs(com.tencent.mm.compatible.util.e.bnC);
        localObject1 = String.format("%dMB %s:%d:%d:%d %s:%d:%d:%d", new Object[] { Integer.valueOf(((ActivityManager)((Context)localObject2).getSystemService("activity")).getMemoryClass()), ((File)localObject1).getAbsolutePath(), Integer.valueOf(((StatFs)localObject3).getBlockSize()), Integer.valueOf(((StatFs)localObject3).getBlockCount()), Integer.valueOf(((StatFs)localObject3).getAvailableBlocks()), com.tencent.mm.compatible.util.e.bnC, Integer.valueOf(localStatFs.getBlockSize()), Integer.valueOf(localStatFs.getBlockCount()), Integer.valueOf(localStatFs.getAvailableBlocks()) });
        localStringBuilderPrinter.println("#accinfo.data=" + (String)localObject1);
        localObject1 = new Date();
        localObject2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.getDefault());
        localStringBuilderPrinter.println("#accinfo.crashTime=" + ((SimpleDateFormat)localObject2).format((Date)localObject1));
        localStringBuilderPrinter.println("#crashContent=");
        return localStringBuilder.toString();
        localObject1 = "b";
      }
      catch (Exception localException)
      {
        for (;;)
        {
          x.e("MicroMsg.MMSurfaceTextureWrap", "check data size failed :%s", new Object[] { localException.getMessage() });
          String str = "";
        }
      }
    }
  }
  
  public final void attachToGLContext(int paramInt)
  {
    x.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, attachToGLContext");
    this.iSV.attachToGLContext(paramInt);
  }
  
  /* Error */
  public final void detachFromGLContext()
  {
    // Byte code:
    //   0: ldc -68
    //   2: ldc -35
    //   4: invokestatic 208	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   7: aload_0
    //   8: getfield 16	com/tencent/mm/ui/base/r:iSV	Landroid/graphics/SurfaceTexture;
    //   11: invokevirtual 223	android/graphics/SurfaceTexture:detachFromGLContext	()V
    //   14: iconst_0
    //   15: istore_2
    //   16: iload_2
    //   17: ifeq +127 -> 144
    //   20: ldc 4
    //   22: ldc -31
    //   24: iconst_0
    //   25: anewarray 227	java/lang/Class
    //   28: invokevirtual 231	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   31: astore_3
    //   32: aload_3
    //   33: iconst_1
    //   34: invokevirtual 237	java/lang/reflect/Method:setAccessible	(Z)V
    //   37: aload_3
    //   38: aload_0
    //   39: getfield 16	com/tencent/mm/ui/base/r:iSV	Landroid/graphics/SurfaceTexture;
    //   42: iconst_0
    //   43: anewarray 120	java/lang/Object
    //   46: invokevirtual 241	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   49: checkcast 136	java/lang/Integer
    //   52: invokevirtual 244	java/lang/Integer:intValue	()I
    //   55: istore_1
    //   56: new 23	java/lang/StringBuilder
    //   59: dup
    //   60: invokespecial 245	java/lang/StringBuilder:<init>	()V
    //   63: invokestatic 247	com/tencent/mm/ui/base/r:JB	()Ljava/lang/String;
    //   66: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: ldc -7
    //   71: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: iload_1
    //   75: invokevirtual 75	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   78: ldc -5
    //   80: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: iload_2
    //   84: invokevirtual 254	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   87: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   90: astore_3
    //   91: aload_3
    //   92: invokevirtual 258	java/lang/String:getBytes	()[B
    //   95: iconst_2
    //   96: invokestatic 264	android/util/Base64:encodeToString	([BI)Ljava/lang/String;
    //   99: ldc_w 266
    //   102: invokestatic 269	com/tencent/mm/sdk/a/b:A	(Ljava/lang/String;Ljava/lang/String;)V
    //   105: ldc -68
    //   107: aload_3
    //   108: invokestatic 272	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   111: ldc -68
    //   113: ldc_w 274
    //   116: iconst_3
    //   117: anewarray 120	java/lang/Object
    //   120: dup
    //   121: iconst_0
    //   122: iload_1
    //   123: invokestatic 140	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   126: aastore
    //   127: dup
    //   128: iconst_1
    //   129: iconst_1
    //   130: invokestatic 279	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   133: aastore
    //   134: dup
    //   135: iconst_2
    //   136: iload_2
    //   137: invokestatic 279	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   140: aastore
    //   141: invokestatic 281	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   144: return
    //   145: astore_3
    //   146: ldc -68
    //   148: aload_3
    //   149: ldc_w 283
    //   152: iconst_1
    //   153: anewarray 120	java/lang/Object
    //   156: dup
    //   157: iconst_0
    //   158: ldc_w 285
    //   161: aastore
    //   162: invokestatic 289	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   165: iconst_1
    //   166: istore_2
    //   167: goto -151 -> 16
    //   170: astore_3
    //   171: ldc -68
    //   173: aload_3
    //   174: ldc_w 283
    //   177: iconst_1
    //   178: anewarray 120	java/lang/Object
    //   181: dup
    //   182: iconst_0
    //   183: ldc_w 291
    //   186: aastore
    //   187: invokestatic 289	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   190: new 23	java/lang/StringBuilder
    //   193: dup
    //   194: invokespecial 245	java/lang/StringBuilder:<init>	()V
    //   197: invokestatic 247	com/tencent/mm/ui/base/r:JB	()Ljava/lang/String;
    //   200: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   203: ldc_w 293
    //   206: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: iload_2
    //   210: invokevirtual 254	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   213: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   216: astore_3
    //   217: aload_3
    //   218: invokevirtual 258	java/lang/String:getBytes	()[B
    //   221: iconst_2
    //   222: invokestatic 264	android/util/Base64:encodeToString	([BI)Ljava/lang/String;
    //   225: ldc_w 266
    //   228: invokestatic 269	com/tencent/mm/sdk/a/b:A	(Ljava/lang/String;Ljava/lang/String;)V
    //   231: ldc -68
    //   233: aload_3
    //   234: invokestatic 272	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   237: ldc -68
    //   239: ldc_w 274
    //   242: iconst_3
    //   243: anewarray 120	java/lang/Object
    //   246: dup
    //   247: iconst_0
    //   248: iconst_0
    //   249: invokestatic 140	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   252: aastore
    //   253: dup
    //   254: iconst_1
    //   255: iconst_0
    //   256: invokestatic 279	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   259: aastore
    //   260: dup
    //   261: iconst_2
    //   262: iload_2
    //   263: invokestatic 279	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   266: aastore
    //   267: invokestatic 281	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   270: return
    //   271: astore_3
    //   272: ldc -68
    //   274: aload_3
    //   275: ldc_w 283
    //   278: iconst_1
    //   279: anewarray 120	java/lang/Object
    //   282: dup
    //   283: iconst_0
    //   284: ldc_w 295
    //   287: aastore
    //   288: invokestatic 289	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   291: new 23	java/lang/StringBuilder
    //   294: dup
    //   295: invokespecial 245	java/lang/StringBuilder:<init>	()V
    //   298: invokestatic 247	com/tencent/mm/ui/base/r:JB	()Ljava/lang/String;
    //   301: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   304: ldc_w 293
    //   307: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   310: iload_2
    //   311: invokevirtual 254	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   314: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   317: astore_3
    //   318: aload_3
    //   319: invokevirtual 258	java/lang/String:getBytes	()[B
    //   322: iconst_2
    //   323: invokestatic 264	android/util/Base64:encodeToString	([BI)Ljava/lang/String;
    //   326: ldc_w 266
    //   329: invokestatic 269	com/tencent/mm/sdk/a/b:A	(Ljava/lang/String;Ljava/lang/String;)V
    //   332: ldc -68
    //   334: aload_3
    //   335: invokestatic 272	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   338: ldc -68
    //   340: ldc_w 274
    //   343: iconst_3
    //   344: anewarray 120	java/lang/Object
    //   347: dup
    //   348: iconst_0
    //   349: iconst_0
    //   350: invokestatic 140	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   353: aastore
    //   354: dup
    //   355: iconst_1
    //   356: iconst_0
    //   357: invokestatic 279	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   360: aastore
    //   361: dup
    //   362: iconst_2
    //   363: iload_2
    //   364: invokestatic 279	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   367: aastore
    //   368: invokestatic 281	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   371: return
    //   372: astore_3
    //   373: ldc -68
    //   375: aload_3
    //   376: ldc_w 283
    //   379: iconst_1
    //   380: anewarray 120	java/lang/Object
    //   383: dup
    //   384: iconst_0
    //   385: ldc_w 297
    //   388: aastore
    //   389: invokestatic 289	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   392: new 23	java/lang/StringBuilder
    //   395: dup
    //   396: invokespecial 245	java/lang/StringBuilder:<init>	()V
    //   399: invokestatic 247	com/tencent/mm/ui/base/r:JB	()Ljava/lang/String;
    //   402: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   405: ldc_w 293
    //   408: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   411: iload_2
    //   412: invokevirtual 254	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   415: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   418: astore_3
    //   419: aload_3
    //   420: invokevirtual 258	java/lang/String:getBytes	()[B
    //   423: iconst_2
    //   424: invokestatic 264	android/util/Base64:encodeToString	([BI)Ljava/lang/String;
    //   427: ldc_w 266
    //   430: invokestatic 269	com/tencent/mm/sdk/a/b:A	(Ljava/lang/String;Ljava/lang/String;)V
    //   433: ldc -68
    //   435: aload_3
    //   436: invokestatic 272	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   439: ldc -68
    //   441: ldc_w 274
    //   444: iconst_3
    //   445: anewarray 120	java/lang/Object
    //   448: dup
    //   449: iconst_0
    //   450: iconst_0
    //   451: invokestatic 140	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   454: aastore
    //   455: dup
    //   456: iconst_1
    //   457: iconst_0
    //   458: invokestatic 279	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   461: aastore
    //   462: dup
    //   463: iconst_2
    //   464: iload_2
    //   465: invokestatic 279	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   468: aastore
    //   469: invokestatic 281	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   472: return
    //   473: astore_3
    //   474: ldc -68
    //   476: aload_3
    //   477: ldc_w 283
    //   480: iconst_1
    //   481: anewarray 120	java/lang/Object
    //   484: dup
    //   485: iconst_0
    //   486: ldc_w 299
    //   489: aastore
    //   490: invokestatic 289	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   493: new 23	java/lang/StringBuilder
    //   496: dup
    //   497: invokespecial 245	java/lang/StringBuilder:<init>	()V
    //   500: invokestatic 247	com/tencent/mm/ui/base/r:JB	()Ljava/lang/String;
    //   503: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   506: ldc_w 293
    //   509: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   512: iload_2
    //   513: invokevirtual 254	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   516: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   519: astore_3
    //   520: aload_3
    //   521: invokevirtual 258	java/lang/String:getBytes	()[B
    //   524: iconst_2
    //   525: invokestatic 264	android/util/Base64:encodeToString	([BI)Ljava/lang/String;
    //   528: ldc_w 266
    //   531: invokestatic 269	com/tencent/mm/sdk/a/b:A	(Ljava/lang/String;Ljava/lang/String;)V
    //   534: ldc -68
    //   536: aload_3
    //   537: invokestatic 272	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   540: ldc -68
    //   542: ldc_w 274
    //   545: iconst_3
    //   546: anewarray 120	java/lang/Object
    //   549: dup
    //   550: iconst_0
    //   551: iconst_0
    //   552: invokestatic 140	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   555: aastore
    //   556: dup
    //   557: iconst_1
    //   558: iconst_0
    //   559: invokestatic 279	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   562: aastore
    //   563: dup
    //   564: iconst_2
    //   565: iload_2
    //   566: invokestatic 279	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   569: aastore
    //   570: invokestatic 281	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   573: return
    //   574: astore_3
    //   575: ldc -68
    //   577: aload_3
    //   578: ldc_w 283
    //   581: iconst_1
    //   582: anewarray 120	java/lang/Object
    //   585: dup
    //   586: iconst_0
    //   587: ldc_w 301
    //   590: aastore
    //   591: invokestatic 289	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   594: new 23	java/lang/StringBuilder
    //   597: dup
    //   598: invokespecial 245	java/lang/StringBuilder:<init>	()V
    //   601: invokestatic 247	com/tencent/mm/ui/base/r:JB	()Ljava/lang/String;
    //   604: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   607: ldc_w 293
    //   610: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   613: iload_2
    //   614: invokevirtual 254	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   617: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   620: astore_3
    //   621: aload_3
    //   622: invokevirtual 258	java/lang/String:getBytes	()[B
    //   625: iconst_2
    //   626: invokestatic 264	android/util/Base64:encodeToString	([BI)Ljava/lang/String;
    //   629: ldc_w 266
    //   632: invokestatic 269	com/tencent/mm/sdk/a/b:A	(Ljava/lang/String;Ljava/lang/String;)V
    //   635: ldc -68
    //   637: aload_3
    //   638: invokestatic 272	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   641: ldc -68
    //   643: ldc_w 274
    //   646: iconst_3
    //   647: anewarray 120	java/lang/Object
    //   650: dup
    //   651: iconst_0
    //   652: iconst_0
    //   653: invokestatic 140	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   656: aastore
    //   657: dup
    //   658: iconst_1
    //   659: iconst_0
    //   660: invokestatic 279	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   663: aastore
    //   664: dup
    //   665: iconst_2
    //   666: iload_2
    //   667: invokestatic 279	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   670: aastore
    //   671: invokestatic 281	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   674: return
    //   675: astore_3
    //   676: new 23	java/lang/StringBuilder
    //   679: dup
    //   680: invokespecial 245	java/lang/StringBuilder:<init>	()V
    //   683: invokestatic 247	com/tencent/mm/ui/base/r:JB	()Ljava/lang/String;
    //   686: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   689: ldc_w 293
    //   692: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   695: iload_2
    //   696: invokevirtual 254	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   699: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   702: astore 4
    //   704: aload 4
    //   706: invokevirtual 258	java/lang/String:getBytes	()[B
    //   709: iconst_2
    //   710: invokestatic 264	android/util/Base64:encodeToString	([BI)Ljava/lang/String;
    //   713: ldc_w 266
    //   716: invokestatic 269	com/tencent/mm/sdk/a/b:A	(Ljava/lang/String;Ljava/lang/String;)V
    //   719: ldc -68
    //   721: aload 4
    //   723: invokestatic 272	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   726: ldc -68
    //   728: ldc_w 274
    //   731: iconst_3
    //   732: anewarray 120	java/lang/Object
    //   735: dup
    //   736: iconst_0
    //   737: iconst_0
    //   738: invokestatic 140	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   741: aastore
    //   742: dup
    //   743: iconst_1
    //   744: iconst_0
    //   745: invokestatic 279	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   748: aastore
    //   749: dup
    //   750: iconst_2
    //   751: iload_2
    //   752: invokestatic 279	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   755: aastore
    //   756: invokestatic 281	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   759: aload_3
    //   760: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	761	0	this	r
    //   55	68	1	i	int
    //   15	737	2	bool	boolean
    //   31	77	3	localObject1	Object
    //   145	4	3	localException1	Exception
    //   170	4	3	localIllegalArgumentException	IllegalArgumentException
    //   216	18	3	str1	String
    //   271	4	3	localIllegalAccessException	IllegalAccessException
    //   317	18	3	str2	String
    //   372	4	3	localInvocationTargetException	java.lang.reflect.InvocationTargetException
    //   418	18	3	str3	String
    //   473	4	3	localNoSuchMethodException	NoSuchMethodException
    //   519	18	3	str4	String
    //   574	4	3	localException2	Exception
    //   620	18	3	str5	String
    //   675	85	3	localObject2	Object
    //   702	20	4	str6	String
    // Exception table:
    //   from	to	target	type
    //   7	14	145	java/lang/Exception
    //   20	56	170	java/lang/IllegalArgumentException
    //   20	56	271	java/lang/IllegalAccessException
    //   20	56	372	java/lang/reflect/InvocationTargetException
    //   20	56	473	java/lang/NoSuchMethodException
    //   20	56	574	java/lang/Exception
    //   20	56	675	finally
    //   171	190	675	finally
    //   272	291	675	finally
    //   373	392	675	finally
    //   474	493	675	finally
    //   575	594	675	finally
  }
  
  public final boolean equals(Object paramObject)
  {
    return this.iSV.equals(paramObject);
  }
  
  public final long getTimestamp()
  {
    x.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, getTimestamp");
    return this.iSV.getTimestamp();
  }
  
  public final void getTransformMatrix(float[] paramArrayOfFloat)
  {
    x.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, getTransformMatrix");
    this.iSV.getTransformMatrix(paramArrayOfFloat);
  }
  
  public final int hashCode()
  {
    return this.iSV.hashCode();
  }
  
  public final void release()
  {
    super.release();
    x.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, release");
    this.iSV.release();
  }
  
  @TargetApi(19)
  public final void releaseTexImage()
  {
    x.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, releaseTexImage");
    this.iSV.releaseTexImage();
  }
  
  public final void setDefaultBufferSize(int paramInt1, int paramInt2)
  {
    x.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, setDefaultBufferSize");
    this.iSV.setDefaultBufferSize(paramInt1, paramInt2);
  }
  
  public final void setOnFrameAvailableListener(SurfaceTexture.OnFrameAvailableListener paramOnFrameAvailableListener)
  {
    x.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, setOnFrameAvailableListener");
    this.iSV.setOnFrameAvailableListener(paramOnFrameAvailableListener);
  }
  
  public final String toString()
  {
    return this.iSV.toString();
  }
  
  public final void updateTexImage()
  {
    x.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, updateTexImage");
    this.iSV.updateTexImage();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/base/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */