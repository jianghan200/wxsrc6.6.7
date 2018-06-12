package com.tencent.mm.compatible.util;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.compatible.e.y;
import com.tencent.mm.loader.stub.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.app.ApplicationLike;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class k
{
  private static String dgF = null;
  private static boolean dgG = false;
  private static HashMap<String, String> dgH = null;
  private static final HashMap<String, WeakReference<ClassLoader>> mLoadedLibs = new HashMap();
  
  private static boolean a(String paramString, ClassLoader paramClassLoader)
  {
    if (!a.patchEnabled()) {
      return false;
    }
    Object localObject2;
    if (!dgG)
    {
      localObject2 = com.tencent.mm.app.b.applicationLike;
      if (localObject2 == null) {
        throw new RuntimeException("tinker application is null when try to load from patch libs");
      }
      dgG = true;
      if ((localObject2 == null) || (((ApplicationLike)localObject2).getApplication() == null)) {
        throw new TinkerRuntimeException("tinkerApplication is null");
      }
      ??? = ((ApplicationLike)localObject2).getTinkerResultIntent();
      if ((??? != null) && (ShareIntentUtil.aE((Intent)???) == 0))
      {
        ??? = ShareIntentUtil.aJ((Intent)???);
        dgH = (HashMap)???;
        ??? = com.tencent.tinker.lib.e.b.e((ApplicationLike)localObject2);
        if (!ShareTinkerInternals.oW((String)???)) {
          break label298;
        }
        dgF = null;
      }
    }
    else
    {
      label98:
      if (!paramString.startsWith("lib")) {
        break label381;
      }
      label107:
      if (!paramString.endsWith(".so")) {
        break label401;
      }
    }
    String str2;
    for (;;)
    {
      ??? = "lib/armeabi/" + paramString;
      localObject2 = com.tencent.mm.app.b.applicationLike;
      if ((!com.tencent.tinker.lib.e.b.c((ApplicationLike)localObject2)) || (!com.tencent.tinker.lib.e.b.d((ApplicationLike)localObject2)) || (dgH == null)) {
        break label544;
      }
      Iterator localIterator = dgH.keySet().iterator();
      for (;;)
      {
        if (!localIterator.hasNext()) {
          break label544;
        }
        String str1 = (String)localIterator.next();
        if (str1.equals(???))
        {
          str2 = dgF + "/" + str1;
          File localFile = new File(str2);
          if (localFile.exists())
          {
            if ((!((ApplicationLike)localObject2).getTinkerLoadVerifyFlag()) || (SharePatchFileUtil.f(localFile, (String)dgH.get(str1)))) {
              break;
            }
            x.e("MicroMsg.LoadLibrary", "loadLibraryFromTinker md5mismatch fail: %s", new Object[] { str2 });
          }
        }
      }
      ??? = null;
      break;
      label298:
      localObject2 = SharePatchFileUtil.hV(((ApplicationLike)localObject2).getApplication());
      ??? = SharePatchFileUtil.acV((String)???);
      if ((localObject2 == null) || (??? == null)) {
        break label98;
      }
      ??? = new File(((File)localObject2).getAbsolutePath() + "/" + (String)???);
      dgF = ((File)???).getAbsolutePath() + "/lib";
      break label98;
      label381:
      paramString = "lib" + paramString;
      break label107;
      label401:
      paramString = paramString + ".so";
    }
    try
    {
      x.w("MicroMsg.LoadLibrary", "succ load from patch path: %s", new Object[] { str2 });
      reflectSystemLoad(str2, paramClassLoader);
      synchronized (mLoadedLibs)
      {
        mLoadedLibs.put(paramString, new WeakReference(paramClassLoader));
        return true;
      }
      return false;
    }
    catch (InvocationTargetException paramClassLoader)
    {
      throw ((UnsatisfiedLinkError)new UnsatisfiedLinkError("Failed loading library: " + paramString).initCause(paramClassLoader.getCause()));
    }
    catch (Exception paramClassLoader)
    {
      throw ((UnsatisfiedLinkError)new UnsatisfiedLinkError("Failed loading library: " + paramString).initCause(paramClassLoader));
    }
  }
  
  /* Error */
  public static void b(String paramString, ClassLoader paramClassLoader)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 232	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   4: ifne +7 -> 11
    //   7: aload_1
    //   8: ifnonnull +864 -> 872
    //   11: iconst_1
    //   12: istore_2
    //   13: ldc -22
    //   15: iload_2
    //   16: invokestatic 240	junit/framework/Assert:assertFalse	(Ljava/lang/String;Z)V
    //   19: getstatic 25	com/tencent/mm/compatible/util/k:mLoadedLibs	Ljava/util/HashMap;
    //   22: astore 4
    //   24: aload 4
    //   26: monitorenter
    //   27: ldc -83
    //   29: new 108	java/lang/StringBuilder
    //   32: dup
    //   33: ldc -14
    //   35: invokespecial 111	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   38: aload_0
    //   39: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   45: invokestatic 246	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   48: getstatic 25	com/tencent/mm/compatible/util/k:mLoadedLibs	Ljava/util/HashMap;
    //   51: aload_0
    //   52: invokevirtual 165	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   55: checkcast 204	java/lang/ref/WeakReference
    //   58: astore_3
    //   59: aload_3
    //   60: ifnull +806 -> 866
    //   63: aload_3
    //   64: invokevirtual 248	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   67: checkcast 250	java/lang/ClassLoader
    //   70: astore_3
    //   71: aload_3
    //   72: ifnull +55 -> 127
    //   75: aload_3
    //   76: aload_1
    //   77: if_acmpne +14 -> 91
    //   80: ldc -83
    //   82: ldc -4
    //   84: invokestatic 246	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   87: aload 4
    //   89: monitorexit
    //   90: return
    //   91: new 213	java/lang/UnsatisfiedLinkError
    //   94: dup
    //   95: new 108	java/lang/StringBuilder
    //   98: dup
    //   99: ldc -2
    //   101: invokespecial 111	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   104: aload_0
    //   105: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: ldc_w 256
    //   111: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   117: invokespecial 216	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   120: athrow
    //   121: astore_0
    //   122: aload 4
    //   124: monitorexit
    //   125: aload_0
    //   126: athrow
    //   127: aload 4
    //   129: monitorexit
    //   130: ldc -83
    //   132: new 108	java/lang/StringBuilder
    //   135: dup
    //   136: ldc_w 258
    //   139: invokespecial 111	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   142: aload_0
    //   143: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   149: invokestatic 246	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   152: aload_0
    //   153: aload_1
    //   154: invokestatic 260	com/tencent/mm/compatible/util/k:a	(Ljava/lang/String;Ljava/lang/ClassLoader;)Z
    //   157: ifne +714 -> 871
    //   160: invokestatic 266	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   163: astore 5
    //   165: aload 5
    //   167: ifnull +15 -> 182
    //   170: invokestatic 271	com/tencent/mm/sdk/platformtools/bj:cjh	()Z
    //   173: ifne +9 -> 182
    //   176: getstatic 274	com/tencent/mm/loader/stub/a:DEBUG	Z
    //   179: ifeq +105 -> 284
    //   182: aload_0
    //   183: aload_1
    //   184: invokestatic 277	com/tencent/mm/compatible/util/k:reflectSystemLoadlibrary	(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   187: getstatic 25	com/tencent/mm/compatible/util/k:mLoadedLibs	Ljava/util/HashMap;
    //   190: astore_3
    //   191: aload_3
    //   192: monitorenter
    //   193: getstatic 25	com/tencent/mm/compatible/util/k:mLoadedLibs	Ljava/util/HashMap;
    //   196: aload_0
    //   197: new 204	java/lang/ref/WeakReference
    //   200: dup
    //   201: aload_1
    //   202: invokespecial 207	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   205: invokevirtual 211	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   208: pop
    //   209: aload_3
    //   210: monitorexit
    //   211: return
    //   212: astore_1
    //   213: aload_3
    //   214: monitorexit
    //   215: aload_1
    //   216: athrow
    //   217: astore_1
    //   218: new 213	java/lang/UnsatisfiedLinkError
    //   221: dup
    //   222: new 108	java/lang/StringBuilder
    //   225: dup
    //   226: ldc -41
    //   228: invokespecial 111	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   231: aload_0
    //   232: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   235: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   238: invokespecial 216	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   241: aload_1
    //   242: invokevirtual 220	java/lang/reflect/InvocationTargetException:getCause	()Ljava/lang/Throwable;
    //   245: invokevirtual 224	java/lang/UnsatisfiedLinkError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   248: checkcast 213	java/lang/UnsatisfiedLinkError
    //   251: athrow
    //   252: astore_1
    //   253: new 213	java/lang/UnsatisfiedLinkError
    //   256: dup
    //   257: new 108	java/lang/StringBuilder
    //   260: dup
    //   261: ldc -41
    //   263: invokespecial 111	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   266: aload_0
    //   267: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   273: invokespecial 216	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   276: aload_1
    //   277: invokevirtual 224	java/lang/UnsatisfiedLinkError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   280: checkcast 213	java/lang/UnsatisfiedLinkError
    //   283: athrow
    //   284: new 154	java/io/File
    //   287: dup
    //   288: aload 5
    //   290: ldc_w 279
    //   293: iconst_0
    //   294: invokevirtual 285	android/content/Context:getDir	(Ljava/lang/String;I)Ljava/io/File;
    //   297: new 108	java/lang/StringBuilder
    //   300: dup
    //   301: ldc 96
    //   303: invokespecial 111	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   306: aload_0
    //   307: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   310: ldc 103
    //   312: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   315: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   318: invokespecial 288	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   321: astore 6
    //   323: aload 6
    //   325: invokevirtual 291	java/io/File:isFile	()Z
    //   328: ifeq +533 -> 861
    //   331: aload 6
    //   333: invokevirtual 191	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   336: aload_1
    //   337: invokestatic 202	com/tencent/mm/compatible/util/k:reflectSystemLoad	(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   340: getstatic 25	com/tencent/mm/compatible/util/k:mLoadedLibs	Ljava/util/HashMap;
    //   343: astore_3
    //   344: aload_3
    //   345: monitorenter
    //   346: getstatic 25	com/tencent/mm/compatible/util/k:mLoadedLibs	Ljava/util/HashMap;
    //   349: aload_0
    //   350: new 204	java/lang/ref/WeakReference
    //   353: dup
    //   354: aload_1
    //   355: invokespecial 207	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   358: invokevirtual 211	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   361: pop
    //   362: aload_3
    //   363: monitorexit
    //   364: return
    //   365: astore 4
    //   367: aload_3
    //   368: monitorexit
    //   369: aload 4
    //   371: athrow
    //   372: astore_3
    //   373: aload 6
    //   375: invokevirtual 294	java/io/File:delete	()Z
    //   378: pop
    //   379: aload_0
    //   380: aload_1
    //   381: invokestatic 277	com/tencent/mm/compatible/util/k:reflectSystemLoadlibrary	(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   384: getstatic 25	com/tencent/mm/compatible/util/k:mLoadedLibs	Ljava/util/HashMap;
    //   387: astore 4
    //   389: aload 4
    //   391: monitorenter
    //   392: getstatic 25	com/tencent/mm/compatible/util/k:mLoadedLibs	Ljava/util/HashMap;
    //   395: aload_0
    //   396: new 204	java/lang/ref/WeakReference
    //   399: dup
    //   400: aload_1
    //   401: invokespecial 207	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   404: invokevirtual 211	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   407: pop
    //   408: aload 4
    //   410: monitorexit
    //   411: return
    //   412: astore 7
    //   414: aload 4
    //   416: monitorexit
    //   417: aload 7
    //   419: athrow
    //   420: astore 4
    //   422: aload_3
    //   423: ifnonnull +435 -> 858
    //   426: aload 4
    //   428: astore_3
    //   429: new 296	java/util/zip/ZipFile
    //   432: dup
    //   433: aload 5
    //   435: invokevirtual 300	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   438: getfield 305	android/content/pm/ApplicationInfo:sourceDir	Ljava/lang/String;
    //   441: invokespecial 306	java/util/zip/ZipFile:<init>	(Ljava/lang/String;)V
    //   444: astore 5
    //   446: aload 5
    //   448: astore 4
    //   450: aload 5
    //   452: aload_0
    //   453: invokestatic 310	com/tencent/mm/compatible/util/k:generateAbiList	()Ljava/util/List;
    //   456: aload 6
    //   458: invokestatic 314	com/tencent/mm/compatible/util/k:extractLibrary	(Ljava/util/zip/ZipFile;Ljava/lang/String;Ljava/util/List;Ljava/io/File;)Z
    //   461: ifne +259 -> 720
    //   464: aload 5
    //   466: astore 4
    //   468: new 52	java/lang/RuntimeException
    //   471: dup
    //   472: new 108	java/lang/StringBuilder
    //   475: dup
    //   476: ldc_w 316
    //   479: invokespecial 111	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   482: aload_0
    //   483: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   486: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   489: invokespecial 57	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   492: athrow
    //   493: astore_0
    //   494: aload 5
    //   496: astore 4
    //   498: new 213	java/lang/UnsatisfiedLinkError
    //   501: dup
    //   502: ldc_w 318
    //   505: invokespecial 216	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   508: aload_0
    //   509: invokevirtual 224	java/lang/UnsatisfiedLinkError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   512: checkcast 213	java/lang/UnsatisfiedLinkError
    //   515: athrow
    //   516: astore_0
    //   517: aload 4
    //   519: ifnull +8 -> 527
    //   522: aload 4
    //   524: invokevirtual 321	java/util/zip/ZipFile:close	()V
    //   527: aload_0
    //   528: athrow
    //   529: astore_3
    //   530: aload_3
    //   531: invokevirtual 220	java/lang/reflect/InvocationTargetException:getCause	()Ljava/lang/Throwable;
    //   534: instanceof 213
    //   537: ifeq +14 -> 551
    //   540: aload_3
    //   541: invokevirtual 220	java/lang/reflect/InvocationTargetException:getCause	()Ljava/lang/Throwable;
    //   544: checkcast 213	java/lang/UnsatisfiedLinkError
    //   547: astore_3
    //   548: goto -175 -> 373
    //   551: new 213	java/lang/UnsatisfiedLinkError
    //   554: dup
    //   555: new 108	java/lang/StringBuilder
    //   558: dup
    //   559: ldc_w 323
    //   562: invokespecial 111	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   565: aload_0
    //   566: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   569: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   572: invokespecial 216	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   575: aload_3
    //   576: invokevirtual 220	java/lang/reflect/InvocationTargetException:getCause	()Ljava/lang/Throwable;
    //   579: invokevirtual 224	java/lang/UnsatisfiedLinkError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   582: checkcast 213	java/lang/UnsatisfiedLinkError
    //   585: athrow
    //   586: astore_1
    //   587: new 213	java/lang/UnsatisfiedLinkError
    //   590: dup
    //   591: new 108	java/lang/StringBuilder
    //   594: dup
    //   595: ldc_w 323
    //   598: invokespecial 111	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   601: aload_0
    //   602: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   605: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   608: invokespecial 216	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   611: aload_1
    //   612: invokevirtual 224	java/lang/UnsatisfiedLinkError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   615: checkcast 213	java/lang/UnsatisfiedLinkError
    //   618: athrow
    //   619: astore 4
    //   621: aload 4
    //   623: invokevirtual 220	java/lang/reflect/InvocationTargetException:getCause	()Ljava/lang/Throwable;
    //   626: instanceof 213
    //   629: ifeq +19 -> 648
    //   632: aload_3
    //   633: ifnonnull +51 -> 684
    //   636: aload 4
    //   638: invokevirtual 220	java/lang/reflect/InvocationTargetException:getCause	()Ljava/lang/Throwable;
    //   641: checkcast 213	java/lang/UnsatisfiedLinkError
    //   644: astore_3
    //   645: goto -216 -> 429
    //   648: new 213	java/lang/UnsatisfiedLinkError
    //   651: dup
    //   652: new 108	java/lang/StringBuilder
    //   655: dup
    //   656: ldc_w 323
    //   659: invokespecial 111	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   662: aload_0
    //   663: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   666: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   669: invokespecial 216	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   672: aload 4
    //   674: invokevirtual 220	java/lang/reflect/InvocationTargetException:getCause	()Ljava/lang/Throwable;
    //   677: invokevirtual 224	java/lang/UnsatisfiedLinkError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   680: checkcast 213	java/lang/UnsatisfiedLinkError
    //   683: athrow
    //   684: goto -255 -> 429
    //   687: astore_1
    //   688: new 213	java/lang/UnsatisfiedLinkError
    //   691: dup
    //   692: new 108	java/lang/StringBuilder
    //   695: dup
    //   696: ldc_w 323
    //   699: invokespecial 111	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   702: aload_0
    //   703: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   706: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   709: invokespecial 216	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   712: aload_1
    //   713: invokevirtual 224	java/lang/UnsatisfiedLinkError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   716: checkcast 213	java/lang/UnsatisfiedLinkError
    //   719: athrow
    //   720: aload 5
    //   722: invokevirtual 321	java/util/zip/ZipFile:close	()V
    //   725: aload 6
    //   727: invokevirtual 191	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   730: aload_1
    //   731: invokestatic 202	com/tencent/mm/compatible/util/k:reflectSystemLoad	(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   734: getstatic 25	com/tencent/mm/compatible/util/k:mLoadedLibs	Ljava/util/HashMap;
    //   737: astore 4
    //   739: aload 4
    //   741: monitorenter
    //   742: getstatic 25	com/tencent/mm/compatible/util/k:mLoadedLibs	Ljava/util/HashMap;
    //   745: aload_0
    //   746: new 204	java/lang/ref/WeakReference
    //   749: dup
    //   750: aload_1
    //   751: invokespecial 207	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   754: invokevirtual 211	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   757: pop
    //   758: aload 4
    //   760: monitorexit
    //   761: return
    //   762: astore_1
    //   763: aload 4
    //   765: monitorexit
    //   766: aload_1
    //   767: athrow
    //   768: astore_1
    //   769: aload_3
    //   770: ifnonnull +38 -> 808
    //   773: new 213	java/lang/UnsatisfiedLinkError
    //   776: dup
    //   777: new 108	java/lang/StringBuilder
    //   780: dup
    //   781: ldc_w 323
    //   784: invokespecial 111	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   787: aload_0
    //   788: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   791: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   794: invokespecial 216	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   797: aload_1
    //   798: invokevirtual 220	java/lang/reflect/InvocationTargetException:getCause	()Ljava/lang/Throwable;
    //   801: invokevirtual 224	java/lang/UnsatisfiedLinkError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   804: checkcast 213	java/lang/UnsatisfiedLinkError
    //   807: athrow
    //   808: aload_3
    //   809: athrow
    //   810: astore_0
    //   811: aload_3
    //   812: ifnonnull +21 -> 833
    //   815: new 213	java/lang/UnsatisfiedLinkError
    //   818: dup
    //   819: ldc_w 318
    //   822: invokespecial 216	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   825: aload_0
    //   826: invokevirtual 224	java/lang/UnsatisfiedLinkError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   829: checkcast 213	java/lang/UnsatisfiedLinkError
    //   832: athrow
    //   833: aload_3
    //   834: athrow
    //   835: astore 4
    //   837: goto -112 -> 725
    //   840: astore_1
    //   841: goto -314 -> 527
    //   844: astore_0
    //   845: aconst_null
    //   846: astore 4
    //   848: goto -331 -> 517
    //   851: astore_0
    //   852: aconst_null
    //   853: astore 4
    //   855: goto -357 -> 498
    //   858: goto -429 -> 429
    //   861: aconst_null
    //   862: astore_3
    //   863: goto -484 -> 379
    //   866: aconst_null
    //   867: astore_3
    //   868: goto -797 -> 71
    //   871: return
    //   872: iconst_0
    //   873: istore_2
    //   874: goto -861 -> 13
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	877	0	paramString	String
    //   0	877	1	paramClassLoader	ClassLoader
    //   12	862	2	bool	boolean
    //   58	310	3	localObject1	Object
    //   372	51	3	localUnsatisfiedLinkError1	UnsatisfiedLinkError
    //   428	1	3	localUnsatisfiedLinkError2	UnsatisfiedLinkError
    //   529	12	3	localInvocationTargetException1	InvocationTargetException
    //   547	321	3	localUnsatisfiedLinkError3	UnsatisfiedLinkError
    //   22	106	4	localHashMap1	HashMap
    //   365	5	4	localObject2	Object
    //   387	28	4	localHashMap2	HashMap
    //   420	7	4	localUnsatisfiedLinkError4	UnsatisfiedLinkError
    //   448	75	4	localObject3	Object
    //   619	54	4	localInvocationTargetException2	InvocationTargetException
    //   835	1	4	localIOException	java.io.IOException
    //   846	8	4	localObject4	Object
    //   163	558	5	localObject5	Object
    //   321	405	6	localFile	File
    //   412	6	7	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   27	59	121	finally
    //   63	71	121	finally
    //   80	90	121	finally
    //   91	121	121	finally
    //   122	125	121	finally
    //   127	130	121	finally
    //   193	211	212	finally
    //   213	215	212	finally
    //   182	193	217	java/lang/reflect/InvocationTargetException
    //   215	217	217	java/lang/reflect/InvocationTargetException
    //   182	193	252	java/lang/Exception
    //   215	217	252	java/lang/Exception
    //   346	364	365	finally
    //   367	369	365	finally
    //   331	346	372	java/lang/UnsatisfiedLinkError
    //   369	372	372	java/lang/UnsatisfiedLinkError
    //   392	411	412	finally
    //   414	417	412	finally
    //   379	392	420	java/lang/UnsatisfiedLinkError
    //   417	420	420	java/lang/UnsatisfiedLinkError
    //   450	464	493	java/lang/Exception
    //   468	493	493	java/lang/Exception
    //   450	464	516	finally
    //   468	493	516	finally
    //   498	516	516	finally
    //   331	346	529	java/lang/reflect/InvocationTargetException
    //   369	372	529	java/lang/reflect/InvocationTargetException
    //   331	346	586	java/lang/Throwable
    //   369	372	586	java/lang/Throwable
    //   379	392	619	java/lang/reflect/InvocationTargetException
    //   417	420	619	java/lang/reflect/InvocationTargetException
    //   379	392	687	java/lang/Throwable
    //   417	420	687	java/lang/Throwable
    //   742	761	762	finally
    //   763	766	762	finally
    //   725	742	768	java/lang/reflect/InvocationTargetException
    //   766	768	768	java/lang/reflect/InvocationTargetException
    //   725	742	810	java/lang/Exception
    //   766	768	810	java/lang/Exception
    //   720	725	835	java/io/IOException
    //   522	527	840	java/io/IOException
    //   429	446	844	finally
    //   429	446	851	java/lang/Exception
  }
  
  private static boolean extractLibrary(ZipFile paramZipFile, String paramString, List<String> paramList, File paramFile)
  {
    if (paramFile.isFile()) {
      return true;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Object localObject = (String)paramList.next();
      localObject = paramZipFile.getEntry("lib/" + (String)localObject + "/lib" + paramString + ".so");
      if (localObject != null)
      {
        paramZipFile = paramZipFile.getInputStream((ZipEntry)localObject);
        paramString = new FileOutputStream(paramFile);
        paramList = new byte['ࠀ'];
        try
        {
          for (;;)
          {
            int i = paramZipFile.read(paramList, 0, 2048);
            if (i == -1) {
              break;
            }
            paramString.write(paramList, 0, i);
          }
          paramZipFile.close();
        }
        finally
        {
          paramZipFile.close();
          paramString.close();
        }
        paramString.close();
        paramFile.setReadOnly();
        return true;
      }
    }
    return false;
  }
  
  public static boolean fg(String paramString)
  {
    synchronized (mLoadedLibs)
    {
      boolean bool = mLoadedLibs.containsKey(paramString);
      return bool;
    }
  }
  
  public static String fh(String paramString)
  {
    try
    {
      Object localObject1 = k.class.getClassLoader();
      Object localObject3 = ClassLoader.class.getDeclaredMethod("findLibrary", new Class[] { String.class });
      ((Method)localObject3).setAccessible(true);
      localObject1 = (String)((Method)localObject3).invoke(localObject1, new Object[] { paramString });
      localObject3 = localObject1;
      if (localObject1 == null)
      {
        paramString = new File(ad.getContext().getDir("recover_lib", 0), "lib" + paramString + ".so");
        localObject3 = localObject1;
        if (paramString.canRead()) {
          localObject3 = paramString.getAbsolutePath();
        }
      }
      return (String)localObject3;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2 = null;
      }
    }
  }
  
  private static List<String> generateAbiList()
  {
    ArrayList localArrayList = new ArrayList(3);
    String str = y.get("ro.product.cpu.abi");
    if ((str != null) && (str.length() > 0)) {
      localArrayList.add(str);
    }
    str = y.get("ro.product.cpu.abi2");
    if ((str != null) && (str.length() > 0)) {
      localArrayList.add(str);
    }
    localArrayList.add("armeabi");
    return localArrayList;
  }
  
  private static void reflectSystemLoad(String paramString, ClassLoader paramClassLoader)
  {
    Runtime localRuntime = Runtime.getRuntime();
    Method localMethod = localRuntime.getClass().getDeclaredMethod("load", new Class[] { String.class, ClassLoader.class });
    localMethod.setAccessible(true);
    localMethod.invoke(localRuntime, new Object[] { paramString, paramClassLoader });
  }
  
  private static void reflectSystemLoadlibrary(String paramString, ClassLoader paramClassLoader)
  {
    Runtime localRuntime = Runtime.getRuntime();
    Method localMethod = localRuntime.getClass().getDeclaredMethod("loadLibrary", new Class[] { String.class, ClassLoader.class });
    localMethod.setAccessible(true);
    localMethod.invoke(localRuntime, new Object[] { paramString, paramClassLoader });
  }
  
  public static void setupBrokenLibraryHandler()
  {
    Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
  }
  
  private static final class a
    implements Thread.UncaughtExceptionHandler
  {
    private Thread.UncaughtExceptionHandler mParent;
    
    public a(Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler)
    {
      this.mParent = paramUncaughtExceptionHandler;
    }
    
    public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
    {
      int j = 1;
      int i;
      if (((paramThrowable instanceof UnsatisfiedLinkError)) || (((paramThrowable instanceof NoSuchMethodError)) && (paramThrowable.getMessage().matches(".*sig(nature)?[=:].*"))))
      {
        i = 1;
        if (i == 0) {
          break label83;
        }
      }
      for (;;)
      {
        try
        {
          k.vg();
          i = j;
          Throwable localThrowable = paramThrowable;
          if (i != 0) {
            localThrowable = new UnsatisfiedLinkError("Invalid JNI libraries detected and recovered.").initCause(paramThrowable);
          }
          this.mParent.uncaughtException(paramThread, localThrowable);
          return;
        }
        catch (Exception localException) {}
        i = 0;
        break;
        label83:
        i = 0;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/compatible/util/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */