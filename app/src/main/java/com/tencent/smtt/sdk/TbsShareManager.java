package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.b;
import com.tencent.smtt.utils.j;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class TbsShareManager
{
  private static Context a;
  private static boolean b;
  private static String c = null;
  private static String d = null;
  private static int e = 0;
  private static String f = null;
  private static boolean g = false;
  private static boolean h = false;
  private static String i = null;
  private static boolean j = false;
  private static boolean k = false;
  public static boolean mHasQueryed = false;
  
  static int a(Context paramContext, boolean paramBoolean)
  {
    b(paramContext, paramBoolean);
    return e;
  }
  
  static Context a(Context paramContext, String paramString)
  {
    try
    {
      paramContext = paramContext.createPackageContext(paramString, 2);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      return null;
    }
    catch (Exception paramContext) {}
    return null;
  }
  
  static String a()
  {
    return d;
  }
  
  static void a(Context paramContext)
  {
    try
    {
      TbsLinuxToolsJni localTbsLinuxToolsJni = new TbsLinuxToolsJni(paramContext);
      a(paramContext, localTbsLinuxToolsJni, an.a().q(paramContext));
      localTbsLinuxToolsJni.a(an.a().r(paramContext).getAbsolutePath(), "755");
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  private static void a(Context paramContext, TbsLinuxToolsJni paramTbsLinuxToolsJni, File paramFile)
  {
    if ((paramFile == null) || (!paramFile.exists()) || (!paramFile.isDirectory())) {
      return;
    }
    paramTbsLinuxToolsJni.a(paramFile.getAbsolutePath(), "755");
    paramFile = paramFile.listFiles();
    int n = paramFile.length;
    int m = 0;
    label41:
    File localFile;
    if (m < n)
    {
      localFile = paramFile[m];
      if (!localFile.isFile()) {
        break label107;
      }
      if (localFile.getAbsolutePath().indexOf(".so") <= 0) {
        break label92;
      }
      paramTbsLinuxToolsJni.a(localFile.getAbsolutePath(), "755");
    }
    for (;;)
    {
      m += 1;
      break label41;
      break;
      label92:
      paramTbsLinuxToolsJni.a(localFile.getAbsolutePath(), "644");
      continue;
      label107:
      if (localFile.isDirectory()) {
        a(paramContext, paramTbsLinuxToolsJni, localFile);
      } else {
        TbsLog.e("TbsShareManager", "unknown file type.", true);
      }
    }
  }
  
  private static File b(Context paramContext, String paramString)
  {
    paramContext = an.a().r(paramContext);
    if (paramContext == null) {
      return null;
    }
    paramContext = new File(paramContext, paramString);
    if (paramContext.exists()) {
      return paramContext;
    }
    try
    {
      paramContext.createNewFile();
      return paramContext;
    }
    catch (IOException paramContext) {}
    return null;
  }
  
  static void b(Context paramContext)
  {
    try
    {
      a(paramContext, new TbsLinuxToolsJni(paramContext), an.a().p(paramContext));
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  static boolean b(Context paramContext, boolean paramBoolean)
  {
    if (i(paramContext)) {
      return true;
    }
    if (paramBoolean) {
      QbSdk.a(paramContext, "TbsShareManager::isShareTbsCoreAvailable forceSysWebViewInner!");
    }
    return false;
  }
  
  static String c(Context paramContext)
  {
    j(paramContext);
    return d;
  }
  
  /* Error */
  private static void c(Context paramContext, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc -101
    //   3: invokestatic 157	com/tencent/smtt/sdk/TbsShareManager:b	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    //   6: astore 5
    //   8: aload 5
    //   10: ifnonnull +28 -> 38
    //   13: iconst_0
    //   14: ifeq +11 -> 25
    //   17: new 159	java/lang/NullPointerException
    //   20: dup
    //   21: invokespecial 160	java/lang/NullPointerException:<init>	()V
    //   24: athrow
    //   25: iconst_0
    //   26: ifeq +11 -> 37
    //   29: new 159	java/lang/NullPointerException
    //   32: dup
    //   33: invokespecial 160	java/lang/NullPointerException:<init>	()V
    //   36: athrow
    //   37: return
    //   38: new 162	java/io/BufferedInputStream
    //   41: dup
    //   42: new 164	java/io/FileInputStream
    //   45: dup
    //   46: aload 5
    //   48: invokespecial 167	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   51: invokespecial 170	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   54: astore_3
    //   55: new 172	java/util/Properties
    //   58: dup
    //   59: invokespecial 173	java/util/Properties:<init>	()V
    //   62: astore 4
    //   64: aload 4
    //   66: aload_3
    //   67: invokevirtual 176	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   70: aload 4
    //   72: ldc -78
    //   74: ldc -76
    //   76: invokevirtual 184	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   79: pop
    //   80: iload_1
    //   81: ifeq +61 -> 142
    //   84: invokestatic 74	com/tencent/smtt/sdk/an:a	()Lcom/tencent/smtt/sdk/an;
    //   87: aload_0
    //   88: invokevirtual 78	com/tencent/smtt/sdk/an:q	(Landroid/content/Context;)Ljava/io/File;
    //   91: invokevirtual 89	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   94: astore 6
    //   96: aload_0
    //   97: invokevirtual 188	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   100: invokevirtual 191	android/content/Context:getPackageName	()Ljava/lang/String;
    //   103: astore 7
    //   105: aload_0
    //   106: invokestatic 196	com/tencent/smtt/utils/b:b	(Landroid/content/Context;)I
    //   109: istore_2
    //   110: aload 4
    //   112: ldc -58
    //   114: aload 7
    //   116: invokevirtual 184	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   119: pop
    //   120: aload 4
    //   122: ldc -56
    //   124: aload 6
    //   126: invokevirtual 184	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   129: pop
    //   130: aload 4
    //   132: ldc -54
    //   134: iload_2
    //   135: invokestatic 206	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   138: invokevirtual 184	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   141: pop
    //   142: new 208	java/io/BufferedOutputStream
    //   145: dup
    //   146: new 210	java/io/FileOutputStream
    //   149: dup
    //   150: aload 5
    //   152: invokespecial 211	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   155: invokespecial 214	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   158: astore_0
    //   159: aload 4
    //   161: aload_0
    //   162: aconst_null
    //   163: invokevirtual 218	java/util/Properties:store	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   166: aload_3
    //   167: ifnull +7 -> 174
    //   170: aload_3
    //   171: invokevirtual 221	java/io/BufferedInputStream:close	()V
    //   174: aload_0
    //   175: ifnull -138 -> 37
    //   178: aload_0
    //   179: invokevirtual 222	java/io/BufferedOutputStream:close	()V
    //   182: return
    //   183: astore_0
    //   184: return
    //   185: astore_0
    //   186: aconst_null
    //   187: astore_3
    //   188: aconst_null
    //   189: astore 4
    //   191: aload 4
    //   193: ifnull +8 -> 201
    //   196: aload 4
    //   198: invokevirtual 221	java/io/BufferedInputStream:close	()V
    //   201: aload_3
    //   202: ifnull +7 -> 209
    //   205: aload_3
    //   206: invokevirtual 222	java/io/BufferedOutputStream:close	()V
    //   209: aload_0
    //   210: athrow
    //   211: astore_0
    //   212: aconst_null
    //   213: astore_0
    //   214: aconst_null
    //   215: astore_3
    //   216: aload_3
    //   217: ifnull +7 -> 224
    //   220: aload_3
    //   221: invokevirtual 221	java/io/BufferedInputStream:close	()V
    //   224: aload_0
    //   225: ifnull -188 -> 37
    //   228: aload_0
    //   229: invokevirtual 222	java/io/BufferedOutputStream:close	()V
    //   232: return
    //   233: astore_3
    //   234: goto -10 -> 224
    //   237: astore 4
    //   239: goto -38 -> 201
    //   242: astore_3
    //   243: goto -34 -> 209
    //   246: astore_0
    //   247: goto -222 -> 25
    //   250: astore_3
    //   251: goto -77 -> 174
    //   254: astore_0
    //   255: aconst_null
    //   256: astore 5
    //   258: aload_3
    //   259: astore 4
    //   261: aload 5
    //   263: astore_3
    //   264: goto -73 -> 191
    //   267: astore 5
    //   269: aload_0
    //   270: astore 6
    //   272: aload_3
    //   273: astore 4
    //   275: aload 5
    //   277: astore_0
    //   278: aload 6
    //   280: astore_3
    //   281: goto -90 -> 191
    //   284: astore_0
    //   285: aconst_null
    //   286: astore_0
    //   287: goto -71 -> 216
    //   290: astore 4
    //   292: goto -76 -> 216
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	295	0	paramContext	Context
    //   0	295	1	paramBoolean	boolean
    //   109	26	2	m	int
    //   54	167	3	localBufferedInputStream	java.io.BufferedInputStream
    //   233	1	3	localException1	Exception
    //   242	1	3	localException2	Exception
    //   250	9	3	localException3	Exception
    //   263	18	3	localObject1	Object
    //   62	135	4	localProperties	java.util.Properties
    //   237	1	4	localException4	Exception
    //   259	15	4	localObject2	Object
    //   290	1	4	localThrowable	Throwable
    //   6	256	5	localFile	File
    //   267	9	5	localObject3	Object
    //   94	185	6	localObject4	Object
    //   103	12	7	str	String
    // Exception table:
    //   from	to	target	type
    //   29	37	183	java/lang/Exception
    //   178	182	183	java/lang/Exception
    //   228	232	183	java/lang/Exception
    //   0	8	185	finally
    //   38	55	185	finally
    //   0	8	211	java/lang/Throwable
    //   38	55	211	java/lang/Throwable
    //   220	224	233	java/lang/Exception
    //   196	201	237	java/lang/Exception
    //   205	209	242	java/lang/Exception
    //   17	25	246	java/lang/Exception
    //   170	174	250	java/lang/Exception
    //   55	80	254	finally
    //   84	142	254	finally
    //   142	159	254	finally
    //   159	166	267	finally
    //   55	80	284	java/lang/Throwable
    //   84	142	284	java/lang/Throwable
    //   142	159	284	java/lang/Throwable
    //   159	166	290	java/lang/Throwable
  }
  
  static int d(Context paramContext)
  {
    return a(paramContext, true);
  }
  
  static Context e(Context paramContext)
  {
    j(paramContext);
    if (f != null)
    {
      paramContext = a(paramContext, f);
      if (an.a().f(paramContext)) {}
    }
    else
    {
      return null;
    }
    return paramContext;
  }
  
  /* Error */
  static String f(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_0
    //   4: ldc -101
    //   6: invokestatic 157	com/tencent/smtt/sdk/TbsShareManager:b	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    //   9: astore_0
    //   10: aload_0
    //   11: ifnonnull +22 -> 33
    //   14: iconst_0
    //   15: ifeq +11 -> 26
    //   18: new 159	java/lang/NullPointerException
    //   21: dup
    //   22: invokespecial 160	java/lang/NullPointerException:<init>	()V
    //   25: athrow
    //   26: aconst_null
    //   27: astore_0
    //   28: ldc 2
    //   30: monitorexit
    //   31: aload_0
    //   32: areturn
    //   33: new 162	java/io/BufferedInputStream
    //   36: dup
    //   37: new 164	java/io/FileInputStream
    //   40: dup
    //   41: aload_0
    //   42: invokespecial 167	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   45: invokespecial 170	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   48: astore_2
    //   49: new 172	java/util/Properties
    //   52: dup
    //   53: invokespecial 173	java/util/Properties:<init>	()V
    //   56: astore_0
    //   57: aload_0
    //   58: aload_2
    //   59: invokevirtual 176	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   62: aload_0
    //   63: ldc -58
    //   65: ldc -25
    //   67: invokevirtual 235	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   70: astore_3
    //   71: ldc -25
    //   73: aload_3
    //   74: invokevirtual 239	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   77: istore_1
    //   78: iload_1
    //   79: ifne +24 -> 103
    //   82: aload_3
    //   83: astore_0
    //   84: aload_2
    //   85: ifnull -57 -> 28
    //   88: aload_2
    //   89: invokevirtual 221	java/io/BufferedInputStream:close	()V
    //   92: aload_3
    //   93: astore_0
    //   94: goto -66 -> 28
    //   97: astore_0
    //   98: aload_3
    //   99: astore_0
    //   100: goto -72 -> 28
    //   103: aload_2
    //   104: ifnull +7 -> 111
    //   107: aload_2
    //   108: invokevirtual 221	java/io/BufferedInputStream:close	()V
    //   111: aconst_null
    //   112: astore_0
    //   113: goto -85 -> 28
    //   116: astore_0
    //   117: aconst_null
    //   118: astore_2
    //   119: aload_2
    //   120: ifnull +7 -> 127
    //   123: aload_2
    //   124: invokevirtual 221	java/io/BufferedInputStream:close	()V
    //   127: aload_0
    //   128: athrow
    //   129: astore_0
    //   130: ldc 2
    //   132: monitorexit
    //   133: aload_0
    //   134: athrow
    //   135: astore_0
    //   136: aconst_null
    //   137: astore_0
    //   138: aload_0
    //   139: ifnull +7 -> 146
    //   142: aload_0
    //   143: invokevirtual 221	java/io/BufferedInputStream:close	()V
    //   146: aconst_null
    //   147: astore_0
    //   148: goto -120 -> 28
    //   151: astore_0
    //   152: goto -6 -> 146
    //   155: astore_2
    //   156: goto -29 -> 127
    //   159: astore_0
    //   160: goto -134 -> 26
    //   163: astore_0
    //   164: goto -53 -> 111
    //   167: astore_0
    //   168: goto -49 -> 119
    //   171: astore_0
    //   172: aload_2
    //   173: astore_0
    //   174: goto -36 -> 138
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	177	0	paramContext	Context
    //   77	2	1	bool	boolean
    //   48	76	2	localBufferedInputStream	java.io.BufferedInputStream
    //   155	18	2	localException	Exception
    //   70	29	3	str	String
    // Exception table:
    //   from	to	target	type
    //   88	92	97	java/lang/Exception
    //   3	10	116	finally
    //   33	49	116	finally
    //   18	26	129	finally
    //   88	92	129	finally
    //   107	111	129	finally
    //   123	127	129	finally
    //   127	129	129	finally
    //   142	146	129	finally
    //   3	10	135	java/lang/Throwable
    //   33	49	135	java/lang/Throwable
    //   142	146	151	java/lang/Exception
    //   123	127	155	java/lang/Exception
    //   18	26	159	java/lang/Exception
    //   107	111	163	java/lang/Exception
    //   49	78	167	finally
    //   49	78	171	java/lang/Throwable
  }
  
  public static int findCoreForThirdPartyApp(Context paramContext)
  {
    n(paramContext);
    TbsLog.i("TbsShareManager", "core_info mAvailableCoreVersion is " + e + " mAvailableCorePath is " + d + " mSrcPackageName is " + f);
    if (f == null) {
      TbsLog.e("TbsShareManager", "mSrcPackageName is null !!!");
    }
    int m;
    if ((f != null) && (f.equals("AppDefined")))
    {
      if (e != an.a().a(c))
      {
        e = 0;
        d = null;
        f = null;
        TbsLog.i("TbsShareManager", "check AppDefined core is error src is " + e + " dest is " + an.a().a(c));
      }
      if (e > 0)
      {
        ApplicationInfo localApplicationInfo = paramContext.getApplicationInfo();
        if ((!"com.tencent.android.qqdownloader".equals(localApplicationInfo.packageName)) && (!"com.jd.jrapp".equals(localApplicationInfo.packageName))) {
          break label274;
        }
        m = 1;
        label191:
        if (m != 0) {
          break label279;
        }
      }
    }
    label274:
    label279:
    for (boolean bool = QbSdk.a(paramContext, e);; bool = false)
    {
      if ((bool) || (g))
      {
        e = 0;
        d = null;
        f = null;
        TbsLog.i("TbsShareManager", "core_info error QbSdk.isX5Disabled ");
      }
      return e;
      if ((k(paramContext)) || (l(paramContext))) {
        break;
      }
      e = 0;
      d = null;
      f = null;
      TbsLog.i("TbsShareManager", "core_info error checkCoreInfo is false and checkCoreInOthers is false ");
      break;
      m = 0;
      break label191;
    }
  }
  
  public static boolean forceLoadX5FromTBSDemo(Context paramContext)
  {
    return false;
  }
  
  public static void forceToLoadX5ForThirdApp(Context paramContext, boolean paramBoolean) {}
  
  static String g(Context paramContext)
  {
    try
    {
      n(paramContext);
      if (d != null)
      {
        if (TextUtils.isEmpty(d)) {
          return null;
        }
        paramContext = new StringBuilder(d);
        paramContext.append(File.separator);
        paramContext.append("res.apk");
        return paramContext.toString();
      }
    }
    catch (Throwable paramContext)
    {
      new StringBuilder("getTbsResourcesPath exception: ").append(Log.getStackTraceString(paramContext));
    }
    return null;
  }
  
  public static boolean getCoreDisabled()
  {
    return g;
  }
  
  public static boolean getCoreFormOwn()
  {
    return j;
  }
  
  public static String[] getCoreProviderAppList()
  {
    return new String[] { "com.tencent.tbs", "com.tencent.mm", "com.tencent.mobileqq", "com.qzone" };
  }
  
  public static int getCoreShareDecoupleCoreVersion(Context paramContext, String paramString)
  {
    return 0;
  }
  
  public static String getHostCorePathAppDefined()
  {
    return c;
  }
  
  public static long getHostCoreVersions(Context paramContext)
  {
    long l2 = 0L;
    String[] arrayOfString = getCoreProviderAppList();
    int n = arrayOfString.length;
    int m = 0;
    if (m < n)
    {
      String str = arrayOfString[m];
      long l1;
      if (str.equalsIgnoreCase("com.tencent.mm")) {
        l1 = l2 + getSharedTbsCoreVersion(paramContext, str) * 10000000000L;
      }
      for (;;)
      {
        m += 1;
        l2 = l1;
        break;
        if (str.equalsIgnoreCase("com.tencent.mobileqq"))
        {
          l1 = l2 + getSharedTbsCoreVersion(paramContext, str) * 100000L;
        }
        else
        {
          l1 = l2;
          if (str.equalsIgnoreCase("com.qzone")) {
            l1 = l2 + getSharedTbsCoreVersion(paramContext, str);
          }
        }
      }
    }
    return l2;
  }
  
  public static int getSharedTbsCoreVersion(Context paramContext, String paramString)
  {
    paramContext = a(paramContext, paramString);
    if (paramContext != null) {
      return an.a().i(paramContext);
    }
    return 0;
  }
  
  /* Error */
  static int h(Context paramContext)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: iconst_0
    //   3: istore_2
    //   4: ldc 2
    //   6: monitorenter
    //   7: ldc 120
    //   9: ldc_w 359
    //   12: invokestatic 267	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   15: aload_0
    //   16: ldc -101
    //   18: invokestatic 157	com/tencent/smtt/sdk/TbsShareManager:b	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    //   21: astore_0
    //   22: aload_0
    //   23: ifnonnull +32 -> 55
    //   26: ldc 120
    //   28: ldc_w 361
    //   31: invokestatic 267	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   34: iload_2
    //   35: istore_1
    //   36: iconst_0
    //   37: ifeq +13 -> 50
    //   40: iload_3
    //   41: istore_1
    //   42: new 159	java/lang/NullPointerException
    //   45: dup
    //   46: invokespecial 160	java/lang/NullPointerException:<init>	()V
    //   49: athrow
    //   50: ldc 2
    //   52: monitorexit
    //   53: iload_1
    //   54: ireturn
    //   55: new 162	java/io/BufferedInputStream
    //   58: dup
    //   59: new 164	java/io/FileInputStream
    //   62: dup
    //   63: aload_0
    //   64: invokespecial 167	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   67: invokespecial 170	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   70: astore_0
    //   71: new 172	java/util/Properties
    //   74: dup
    //   75: invokespecial 173	java/util/Properties:<init>	()V
    //   78: astore 4
    //   80: aload 4
    //   82: aload_0
    //   83: invokevirtual 176	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   86: aload 4
    //   88: ldc_w 363
    //   91: ldc -25
    //   93: invokevirtual 235	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   96: astore 4
    //   98: ldc -25
    //   100: aload 4
    //   102: invokevirtual 239	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   105: ifne +42 -> 147
    //   108: ldc 120
    //   110: ldc_w 365
    //   113: invokestatic 267	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   116: aload 4
    //   118: invokestatic 370	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   121: iconst_0
    //   122: invokestatic 376	java/lang/Math:max	(II)I
    //   125: istore_2
    //   126: iload_2
    //   127: istore_1
    //   128: aload_0
    //   129: ifnull -79 -> 50
    //   132: iload_2
    //   133: istore_1
    //   134: aload_0
    //   135: invokevirtual 221	java/io/BufferedInputStream:close	()V
    //   138: iload_2
    //   139: istore_1
    //   140: goto -90 -> 50
    //   143: astore_0
    //   144: goto -94 -> 50
    //   147: ldc 120
    //   149: ldc_w 378
    //   152: invokestatic 267	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   155: iload_2
    //   156: istore_1
    //   157: aload_0
    //   158: ifnull -108 -> 50
    //   161: iload_3
    //   162: istore_1
    //   163: aload_0
    //   164: invokevirtual 221	java/io/BufferedInputStream:close	()V
    //   167: iload_2
    //   168: istore_1
    //   169: goto -119 -> 50
    //   172: astore_0
    //   173: ldc 2
    //   175: monitorexit
    //   176: aload_0
    //   177: athrow
    //   178: astore 4
    //   180: aconst_null
    //   181: astore_0
    //   182: aload_0
    //   183: ifnull +7 -> 190
    //   186: aload_0
    //   187: invokevirtual 221	java/io/BufferedInputStream:close	()V
    //   190: aload 4
    //   192: athrow
    //   193: astore_0
    //   194: aconst_null
    //   195: astore_0
    //   196: aload_0
    //   197: ifnull +7 -> 204
    //   200: aload_0
    //   201: invokevirtual 221	java/io/BufferedInputStream:close	()V
    //   204: ldc 120
    //   206: ldc_w 380
    //   209: invokestatic 267	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   212: bipush -2
    //   214: istore_1
    //   215: goto -165 -> 50
    //   218: astore_0
    //   219: goto -15 -> 204
    //   222: astore_0
    //   223: goto -33 -> 190
    //   226: astore 4
    //   228: goto -46 -> 182
    //   231: astore 4
    //   233: goto -37 -> 196
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	236	0	paramContext	Context
    //   35	180	1	m	int
    //   3	165	2	n	int
    //   1	161	3	i1	int
    //   78	39	4	localObject1	Object
    //   178	13	4	localObject2	Object
    //   226	1	4	localObject3	Object
    //   231	1	4	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   42	50	143	java/lang/Exception
    //   134	138	143	java/lang/Exception
    //   163	167	143	java/lang/Exception
    //   7	15	172	finally
    //   42	50	172	finally
    //   134	138	172	finally
    //   163	167	172	finally
    //   186	190	172	finally
    //   190	193	172	finally
    //   200	204	172	finally
    //   204	212	172	finally
    //   15	22	178	finally
    //   26	34	178	finally
    //   55	71	178	finally
    //   15	22	193	java/lang/Throwable
    //   26	34	193	java/lang/Throwable
    //   55	71	193	java/lang/Throwable
    //   200	204	218	java/lang/Exception
    //   186	190	222	java/lang/Exception
    //   71	126	226	finally
    //   147	155	226	finally
    //   71	126	231	java/lang/Throwable
    //   147	155	231	java/lang/Throwable
  }
  
  static boolean i(Context paramContext)
  {
    try
    {
      if (e == 0) {
        findCoreForThirdPartyApp(paramContext);
      }
      if (e == 0)
      {
        TbsLog.addLog(994, null, new Object[0]);
        return false;
      }
      if (c == null)
      {
        if ((e != 0) && (getSharedTbsCoreVersion(paramContext, f) == e)) {
          return true;
        }
      }
      else if ((e != 0) && (an.a().a(c) == e)) {
        return true;
      }
      if (l(paramContext)) {
        return true;
      }
      TbsCoreLoadStat.getInstance().a(paramContext, 418, new Throwable("mAvailableCoreVersion=" + e + "; mSrcPackageName=" + f + "; getSharedTbsCoreVersion(ctx, mSrcPackageName) is " + getSharedTbsCoreVersion(paramContext, f) + "; getHostCoreVersions is " + getHostCoreVersions(paramContext)));
      d = null;
      e = 0;
      TbsLog.addLog(993, null, new Object[0]);
      QbSdk.a(paramContext, "TbsShareManager::isShareTbsCoreAvailableInner forceSysWebViewInner!");
      return false;
    }
    catch (Throwable paramContext)
    {
      TbsLog.addLog(992, null, new Object[0]);
    }
    return false;
  }
  
  public static boolean isThirdPartyApp(Context paramContext)
  {
    for (;;)
    {
      int m;
      try
      {
        if ((a != null) && (a.equals(paramContext.getApplicationContext()))) {
          return b;
        }
        paramContext = paramContext.getApplicationContext();
        a = paramContext;
        paramContext = paramContext.getPackageName();
        String[] arrayOfString = getCoreProviderAppList();
        int n = arrayOfString.length;
        m = 0;
        if (m < n)
        {
          if (!paramContext.equals(arrayOfString[m])) {
            break label74;
          }
          b = false;
          return false;
        }
      }
      catch (Throwable paramContext)
      {
        b = true;
        return true;
      }
      label74:
      m += 1;
    }
  }
  
  static boolean j(Context paramContext)
  {
    return b(paramContext, true);
  }
  
  private static boolean k(Context paramContext)
  {
    if (f == null) {}
    while (e != getSharedTbsCoreVersion(paramContext, f)) {
      return false;
    }
    return true;
  }
  
  private static boolean l(Context paramContext)
  {
    if (QbSdk.getOnlyDownload()) {}
    for (;;)
    {
      return false;
      String[] arrayOfString = getCoreProviderAppList();
      int n = arrayOfString.length;
      int m = 0;
      while (m < n)
      {
        String str = arrayOfString[m];
        if ((e > 0) && (e == getSharedTbsCoreVersion(paramContext, str)))
        {
          Context localContext = a(paramContext, str);
          if (an.a().f(paramContext))
          {
            d = an.a().b(paramContext, localContext).getAbsolutePath();
            f = str;
            return true;
          }
        }
        m += 1;
      }
    }
  }
  
  private static boolean m(Context paramContext)
  {
    if (paramContext == null) {
      return false;
    }
    writeProperties(paramContext, Integer.toString(0), "", "", Integer.toString(0));
    return true;
  }
  
  /* Error */
  private static void n(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 42	com/tencent/smtt/sdk/TbsShareManager:k	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +7 -> 15
    //   11: ldc 2
    //   13: monitorexit
    //   14: return
    //   15: aload_0
    //   16: ldc -101
    //   18: invokestatic 157	com/tencent/smtt/sdk/TbsShareManager:b	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    //   21: astore_0
    //   22: aload_0
    //   23: ifnonnull +19 -> 42
    //   26: iconst_0
    //   27: ifeq -16 -> 11
    //   30: new 159	java/lang/NullPointerException
    //   33: dup
    //   34: invokespecial 160	java/lang/NullPointerException:<init>	()V
    //   37: athrow
    //   38: astore_0
    //   39: goto -28 -> 11
    //   42: new 162	java/io/BufferedInputStream
    //   45: dup
    //   46: new 164	java/io/FileInputStream
    //   49: dup
    //   50: aload_0
    //   51: invokespecial 167	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   54: invokespecial 170	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   57: astore_0
    //   58: new 172	java/util/Properties
    //   61: dup
    //   62: invokespecial 173	java/util/Properties:<init>	()V
    //   65: astore_2
    //   66: aload_2
    //   67: aload_0
    //   68: invokevirtual 176	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   71: aload_2
    //   72: ldc_w 363
    //   75: ldc -25
    //   77: invokevirtual 235	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   80: astore_3
    //   81: ldc -25
    //   83: aload_3
    //   84: invokevirtual 239	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   87: ifne +14 -> 101
    //   90: aload_3
    //   91: invokestatic 370	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   94: iconst_0
    //   95: invokestatic 376	java/lang/Math:max	(II)I
    //   98: putstatic 30	com/tencent/smtt/sdk/TbsShareManager:e	I
    //   101: aload_2
    //   102: ldc -58
    //   104: ldc -25
    //   106: invokevirtual 235	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   109: astore_3
    //   110: ldc -25
    //   112: aload_3
    //   113: invokevirtual 239	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   116: ifne +7 -> 123
    //   119: aload_3
    //   120: putstatic 32	com/tencent/smtt/sdk/TbsShareManager:f	Ljava/lang/String;
    //   123: getstatic 32	com/tencent/smtt/sdk/TbsShareManager:f	Ljava/lang/String;
    //   126: ifnull +28 -> 154
    //   129: getstatic 414	com/tencent/smtt/sdk/TbsShareManager:a	Landroid/content/Context;
    //   132: ifnull +22 -> 154
    //   135: getstatic 32	com/tencent/smtt/sdk/TbsShareManager:f	Ljava/lang/String;
    //   138: getstatic 414	com/tencent/smtt/sdk/TbsShareManager:a	Landroid/content/Context;
    //   141: invokevirtual 191	android/content/Context:getPackageName	()Ljava/lang/String;
    //   144: invokevirtual 239	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   147: ifeq +86 -> 233
    //   150: iconst_1
    //   151: putstatic 40	com/tencent/smtt/sdk/TbsShareManager:j	Z
    //   154: aload_2
    //   155: ldc -56
    //   157: ldc -25
    //   159: invokevirtual 235	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   162: astore_3
    //   163: ldc -25
    //   165: aload_3
    //   166: invokevirtual 239	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   169: ifne +7 -> 176
    //   172: aload_3
    //   173: putstatic 28	com/tencent/smtt/sdk/TbsShareManager:d	Ljava/lang/String;
    //   176: aload_2
    //   177: ldc -54
    //   179: ldc -25
    //   181: invokevirtual 235	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   184: astore_3
    //   185: ldc -25
    //   187: aload_3
    //   188: invokevirtual 239	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   191: ifne +7 -> 198
    //   194: aload_3
    //   195: putstatic 38	com/tencent/smtt/sdk/TbsShareManager:i	Ljava/lang/String;
    //   198: aload_2
    //   199: ldc -78
    //   201: ldc -76
    //   203: invokevirtual 235	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   206: invokestatic 435	java/lang/Boolean:parseBoolean	(Ljava/lang/String;)Z
    //   209: putstatic 34	com/tencent/smtt/sdk/TbsShareManager:g	Z
    //   212: iconst_1
    //   213: putstatic 42	com/tencent/smtt/sdk/TbsShareManager:k	Z
    //   216: aload_0
    //   217: ifnull -206 -> 11
    //   220: aload_0
    //   221: invokevirtual 221	java/io/BufferedInputStream:close	()V
    //   224: goto -213 -> 11
    //   227: astore_0
    //   228: ldc 2
    //   230: monitorexit
    //   231: aload_0
    //   232: athrow
    //   233: iconst_0
    //   234: putstatic 40	com/tencent/smtt/sdk/TbsShareManager:j	Z
    //   237: goto -83 -> 154
    //   240: astore_2
    //   241: aload_0
    //   242: ifnull -231 -> 11
    //   245: aload_0
    //   246: invokevirtual 221	java/io/BufferedInputStream:close	()V
    //   249: goto -238 -> 11
    //   252: astore_0
    //   253: aconst_null
    //   254: astore_3
    //   255: aload_3
    //   256: ifnull +7 -> 263
    //   259: aload_3
    //   260: invokevirtual 221	java/io/BufferedInputStream:close	()V
    //   263: aload_0
    //   264: athrow
    //   265: astore_2
    //   266: goto -3 -> 263
    //   269: astore_2
    //   270: aload_0
    //   271: astore_3
    //   272: aload_2
    //   273: astore_0
    //   274: goto -19 -> 255
    //   277: astore_0
    //   278: aconst_null
    //   279: astore_0
    //   280: goto -39 -> 241
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	283	0	paramContext	Context
    //   6	2	1	bool	boolean
    //   65	134	2	localProperties	java.util.Properties
    //   240	1	2	localThrowable	Throwable
    //   265	1	2	localException	Exception
    //   269	4	2	localObject1	Object
    //   80	192	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   30	38	38	java/lang/Exception
    //   220	224	38	java/lang/Exception
    //   245	249	38	java/lang/Exception
    //   3	7	227	finally
    //   30	38	227	finally
    //   220	224	227	finally
    //   245	249	227	finally
    //   259	263	227	finally
    //   263	265	227	finally
    //   58	101	240	java/lang/Throwable
    //   101	123	240	java/lang/Throwable
    //   123	154	240	java/lang/Throwable
    //   154	176	240	java/lang/Throwable
    //   176	198	240	java/lang/Throwable
    //   198	216	240	java/lang/Throwable
    //   233	237	240	java/lang/Throwable
    //   15	22	252	finally
    //   42	58	252	finally
    //   259	263	265	java/lang/Exception
    //   58	101	269	finally
    //   101	123	269	finally
    //   123	154	269	finally
    //   154	176	269	finally
    //   176	198	269	finally
    //   198	216	269	finally
    //   233	237	269	finally
    //   15	22	277	java/lang/Throwable
    //   42	58	277	java/lang/Throwable
  }
  
  public static void setHostCorePathAppDefined(String paramString)
  {
    c = paramString;
  }
  
  public static void writeCoreInfoForThirdPartyApp(Context paramContext, int paramInt, boolean paramBoolean)
  {
    int n = 0;
    int m;
    for (;;)
    {
      try
      {
        TbsLog.i("TbsShareManager", "writeCoreInfoForThirdPartyApp coreVersion is " + paramInt);
        if (paramInt == 0)
        {
          m(paramContext);
          TbsDownloadConfig.getInstance(a).setDownloadInterruptCode(65135);
          return;
        }
        m = h(paramContext);
        TbsLog.i("TbsShareManager", "writeCoreInfoForThirdPartyApp coreVersionFromConfig is " + m);
        if (m < 0)
        {
          TbsDownloadConfig.getInstance(a).setDownloadInterruptCode(65134);
          continue;
        }
        if (paramInt != m) {
          break label130;
        }
      }
      finally {}
      c(paramContext, paramBoolean);
      TbsDownloadConfig.getInstance(a).setDownloadInterruptCode(65133);
      continue;
      label130:
      if (paramInt < m)
      {
        m(paramContext);
        TbsDownloadConfig.getInstance(a).setDownloadInterruptCode(65132);
      }
      else
      {
        m = an.a().i(paramContext);
        TbsLog.i("TbsShareManager", "writeCoreInfoForThirdPartyApp coreVersionFromCoreShare is " + m);
        if (paramInt >= m) {
          break;
        }
        m(paramContext);
        TbsDownloadConfig.getInstance(a).setDownloadInterruptCode(65132);
      }
    }
    Object localObject1;
    if (QbSdk.getOnlyDownload()) {
      localObject1 = new String[] { paramContext.getApplicationContext().getPackageName() };
    }
    label589:
    label818:
    for (;;)
    {
      Object localObject3;
      if (c != null)
      {
        if (paramInt == an.a().a(c))
        {
          writeProperties(paramContext, Integer.toString(paramInt), "AppDefined", c, Integer.toString(1));
          try
          {
            localObject1 = b(paramContext, "core_info");
            if ((h) || (localObject1 == null)) {
              break;
            }
            localObject2 = new TbsLinuxToolsJni(a);
            ((TbsLinuxToolsJni)localObject2).a(((File)localObject1).getAbsolutePath(), "644");
            ((TbsLinuxToolsJni)localObject2).a(an.a().r(paramContext).getAbsolutePath(), "755");
            h = true;
          }
          catch (Throwable paramContext) {}
          break;
          localObject1 = getCoreProviderAppList();
          if (!paramBoolean) {
            break label818;
          }
          localObject1 = new String[] { paramContext.getApplicationContext().getPackageName() };
          continue;
        }
        if (paramInt > an.a().a(c))
        {
          i1 = localObject1.length;
          m = 0;
          for (;;)
          {
            if (m >= i1) {
              break label589;
            }
            localObject2 = localObject1[m];
            if (paramInt == getSharedTbsCoreVersion(paramContext, (String)localObject2))
            {
              localObject3 = a(paramContext, (String)localObject2);
              localObject2 = an.a().q((Context)localObject3).getAbsolutePath();
              b.b(paramContext);
              if (an.a().f((Context)localObject3))
              {
                localObject1 = new File(c);
                localObject2 = new File((String)localObject2);
                localObject3 = new bc();
                try
                {
                  j.a((File)localObject2, (File)localObject1, (FileFilter)localObject3);
                  writeProperties(paramContext, Integer.toString(paramInt), "AppDefined", c, Integer.toString(1));
                  localObject1 = b(paramContext, "core_info");
                  if ((h) || (localObject1 == null)) {
                    break;
                  }
                  localObject2 = new TbsLinuxToolsJni(a);
                  ((TbsLinuxToolsJni)localObject2).a(((File)localObject1).getAbsolutePath(), "644");
                  ((TbsLinuxToolsJni)localObject2).a(an.a().r(paramContext).getAbsolutePath(), "755");
                  h = true;
                }
                catch (Throwable paramContext) {}
                break;
              }
            }
            m += 1;
          }
        }
      }
      int i1 = localObject1.length;
      m = n;
      if (m >= i1) {
        break;
      }
      Object localObject2 = localObject1[m];
      if (paramInt == getSharedTbsCoreVersion(paramContext, (String)localObject2))
      {
        Context localContext = a(paramContext, (String)localObject2);
        localObject3 = an.a().q(localContext).getAbsolutePath();
        n = b.b(paramContext);
        if (an.a().f(localContext)) {
          if (!((String)localObject2).equals(paramContext.getApplicationContext().getPackageName()))
          {
            TbsLog.i("TbsShareManager", "thirdAPP pre--> delete old core_share Directory:" + paramInt);
            localObject1 = an.a().q(paramContext);
          }
        }
      }
      try
      {
        j.b((File)localObject1);
        TbsLog.i("TbsShareManager", "thirdAPP success--> delete old core_share Directory");
        writeProperties(paramContext, Integer.toString(paramInt), (String)localObject2, (String)localObject3, Integer.toString(n));
        try
        {
          localObject1 = b(paramContext, "core_info");
          if ((h) || (localObject1 == null)) {
            break;
          }
          localObject2 = new TbsLinuxToolsJni(a);
          ((TbsLinuxToolsJni)localObject2).a(((File)localObject1).getAbsolutePath(), "644");
          ((TbsLinuxToolsJni)localObject2).a(an.a().r(paramContext).getAbsolutePath(), "755");
          h = true;
        }
        catch (Throwable paramContext) {}
        break;
        m += 1;
      }
      catch (Throwable localThrowable)
      {
        for (;;) {}
      }
    }
  }
  
  /* Error */
  public static void writeProperties(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 6
    //   3: ldc 120
    //   5: new 245	java/lang/StringBuilder
    //   8: dup
    //   9: ldc_w 476
    //   12: invokespecial 250	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   15: aload_1
    //   16: invokevirtual 259	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   19: ldc_w 478
    //   22: invokevirtual 259	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: aload_2
    //   26: invokevirtual 259	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: ldc_w 480
    //   32: invokevirtual 259	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: aload_3
    //   36: invokevirtual 259	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   42: invokestatic 267	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   45: ldc 120
    //   47: new 245	java/lang/StringBuilder
    //   50: dup
    //   51: ldc_w 482
    //   54: invokespecial 250	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   57: new 65	java/lang/Throwable
    //   60: dup
    //   61: ldc_w 484
    //   64: invokespecial 406	java/lang/Throwable:<init>	(Ljava/lang/String;)V
    //   67: invokestatic 325	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   70: invokevirtual 259	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   76: invokestatic 267	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   79: aload_0
    //   80: ldc -101
    //   82: invokestatic 157	com/tencent/smtt/sdk/TbsShareManager:b	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    //   85: astore 9
    //   87: aload 9
    //   89: ifnonnull +40 -> 129
    //   92: getstatic 414	com/tencent/smtt/sdk/TbsShareManager:a	Landroid/content/Context;
    //   95: invokestatic 447	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   98: sipush 65131
    //   101: invokevirtual 451	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   104: iconst_0
    //   105: ifeq +11 -> 116
    //   108: new 159	java/lang/NullPointerException
    //   111: dup
    //   112: invokespecial 160	java/lang/NullPointerException:<init>	()V
    //   115: athrow
    //   116: iconst_0
    //   117: ifeq +11 -> 128
    //   120: new 159	java/lang/NullPointerException
    //   123: dup
    //   124: invokespecial 160	java/lang/NullPointerException:<init>	()V
    //   127: athrow
    //   128: return
    //   129: new 162	java/io/BufferedInputStream
    //   132: dup
    //   133: new 164	java/io/FileInputStream
    //   136: dup
    //   137: aload 9
    //   139: invokespecial 167	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   142: invokespecial 170	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   145: astore 7
    //   147: new 172	java/util/Properties
    //   150: dup
    //   151: invokespecial 173	java/util/Properties:<init>	()V
    //   154: astore 8
    //   156: aload 8
    //   158: aload 7
    //   160: invokevirtual 176	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   163: aload_1
    //   164: invokestatic 370	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   167: istore 5
    //   169: iload 5
    //   171: ifeq +112 -> 283
    //   174: aload 8
    //   176: ldc_w 363
    //   179: aload_1
    //   180: invokevirtual 184	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   183: pop
    //   184: aload 8
    //   186: ldc -78
    //   188: ldc -76
    //   190: invokevirtual 184	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   193: pop
    //   194: aload 8
    //   196: ldc -58
    //   198: aload_2
    //   199: invokevirtual 184	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   202: pop
    //   203: aload 8
    //   205: ldc -56
    //   207: aload_3
    //   208: invokevirtual 184	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   211: pop
    //   212: aload 8
    //   214: ldc -54
    //   216: aload 4
    //   218: invokevirtual 184	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   221: pop
    //   222: new 208	java/io/BufferedOutputStream
    //   225: dup
    //   226: new 210	java/io/FileOutputStream
    //   229: dup
    //   230: aload 9
    //   232: invokespecial 211	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   235: invokespecial 214	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   238: astore_0
    //   239: aload 8
    //   241: aload_0
    //   242: aconst_null
    //   243: invokevirtual 218	java/util/Properties:store	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   246: iconst_0
    //   247: putstatic 42	com/tencent/smtt/sdk/TbsShareManager:k	Z
    //   250: getstatic 414	com/tencent/smtt/sdk/TbsShareManager:a	Landroid/content/Context;
    //   253: invokestatic 447	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   256: sipush 65130
    //   259: invokevirtual 451	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   262: aload 7
    //   264: ifnull +8 -> 272
    //   267: aload 7
    //   269: invokevirtual 221	java/io/BufferedInputStream:close	()V
    //   272: aload_0
    //   273: ifnull -145 -> 128
    //   276: aload_0
    //   277: invokevirtual 222	java/io/BufferedOutputStream:close	()V
    //   280: return
    //   281: astore_0
    //   282: return
    //   283: aload 8
    //   285: ldc -78
    //   287: ldc_w 486
    //   290: invokevirtual 184	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   293: pop
    //   294: goto -72 -> 222
    //   297: astore_0
    //   298: aconst_null
    //   299: astore_0
    //   300: aload 7
    //   302: ifnull +8 -> 310
    //   305: aload 7
    //   307: invokevirtual 221	java/io/BufferedInputStream:close	()V
    //   310: aload_0
    //   311: ifnull -183 -> 128
    //   314: aload_0
    //   315: invokevirtual 222	java/io/BufferedOutputStream:close	()V
    //   318: return
    //   319: astore_0
    //   320: aconst_null
    //   321: astore_1
    //   322: aconst_null
    //   323: astore 7
    //   325: aload 7
    //   327: ifnull +8 -> 335
    //   330: aload 7
    //   332: invokevirtual 221	java/io/BufferedInputStream:close	()V
    //   335: aload_1
    //   336: ifnull +7 -> 343
    //   339: aload_1
    //   340: invokevirtual 222	java/io/BufferedOutputStream:close	()V
    //   343: aload_0
    //   344: athrow
    //   345: astore_0
    //   346: iload 6
    //   348: istore 5
    //   350: goto -181 -> 169
    //   353: astore_1
    //   354: goto -44 -> 310
    //   357: astore_2
    //   358: goto -23 -> 335
    //   361: astore_1
    //   362: goto -19 -> 343
    //   365: astore_0
    //   366: goto -250 -> 116
    //   369: astore_1
    //   370: goto -98 -> 272
    //   373: astore_0
    //   374: aconst_null
    //   375: astore_1
    //   376: goto -51 -> 325
    //   379: astore_2
    //   380: aload_0
    //   381: astore_1
    //   382: aload_2
    //   383: astore_0
    //   384: goto -59 -> 325
    //   387: astore_0
    //   388: aconst_null
    //   389: astore_0
    //   390: aconst_null
    //   391: astore 7
    //   393: goto -93 -> 300
    //   396: astore_1
    //   397: goto -97 -> 300
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	400	0	paramContext	Context
    //   0	400	1	paramString1	String
    //   0	400	2	paramString2	String
    //   0	400	3	paramString3	String
    //   0	400	4	paramString4	String
    //   167	182	5	m	int
    //   1	346	6	n	int
    //   145	247	7	localBufferedInputStream	java.io.BufferedInputStream
    //   154	130	8	localProperties	java.util.Properties
    //   85	146	9	localFile	File
    // Exception table:
    //   from	to	target	type
    //   120	128	281	java/lang/Exception
    //   276	280	281	java/lang/Exception
    //   314	318	281	java/lang/Exception
    //   147	163	297	java/lang/Throwable
    //   163	169	297	java/lang/Throwable
    //   174	222	297	java/lang/Throwable
    //   222	239	297	java/lang/Throwable
    //   283	294	297	java/lang/Throwable
    //   79	87	319	finally
    //   92	104	319	finally
    //   129	147	319	finally
    //   163	169	345	java/lang/Exception
    //   305	310	353	java/lang/Exception
    //   330	335	357	java/lang/Exception
    //   339	343	361	java/lang/Exception
    //   108	116	365	java/lang/Exception
    //   267	272	369	java/lang/Exception
    //   147	163	373	finally
    //   163	169	373	finally
    //   174	222	373	finally
    //   222	239	373	finally
    //   283	294	373	finally
    //   239	262	379	finally
    //   79	87	387	java/lang/Throwable
    //   92	104	387	java/lang/Throwable
    //   129	147	387	java/lang/Throwable
    //   239	262	396	java/lang/Throwable
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/smtt/sdk/TbsShareManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */