package com.tencent.tinker.loader.shareutil;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShareTinkerInternals
{
  private static String processName = null;
  private static final boolean vvU = ada(System.getProperty("java.vm.version"));
  private static final boolean vvV = cHi();
  private static Boolean vvW = null;
  private static String vvX = null;
  private static String vvY = null;
  
  public static boolean Ij(int paramInt)
  {
    return (paramInt & 0x1) != 0;
  }
  
  public static boolean Ik(int paramInt)
  {
    return (paramInt & 0x2) != 0;
  }
  
  public static boolean Il(int paramInt)
  {
    return (paramInt & 0x4) != 0;
  }
  
  public static String Im(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "unknown";
    case 3: 
      return "dex";
    case 4: 
      return "dex_opt";
    case 5: 
      return "lib";
    case 1: 
      return "patch_file";
    case 2: 
      return "patch_info";
    }
    return "resource";
  }
  
  public static boolean In(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static String Ws(String paramString)
  {
    if (paramString == null) {
      paramString = null;
    }
    label66:
    for (;;)
    {
      return paramString;
      char[] arrayOfChar = paramString.toCharArray();
      if (arrayOfChar == null) {
        return null;
      }
      int i = 0;
      if (i < arrayOfChar.length) {
        if (arrayOfChar[i] > '') {
          arrayOfChar[i] = '\000';
        }
      }
      for (int j = 1;; j = 0)
      {
        if (j == 0) {
          break label66;
        }
        return new String(arrayOfChar, 0, i);
        i += 1;
        break;
      }
    }
  }
  
  public static int a(Context paramContext, int paramInt, File paramFile, ShareSecurityCheck paramShareSecurityCheck)
  {
    int i;
    int j;
    if (!paramShareSecurityCheck.an(paramFile))
    {
      i = -1;
      j = i;
      if (i == 0)
      {
        if (paramInt != 7) {
          break label159;
        }
        i = 1;
      }
    }
    for (;;)
    {
      if (i == 0)
      {
        paramContext = paramShareSecurityCheck.vvS;
        if ((!Ij(paramInt)) && (paramContext.containsKey("assets/dex_meta.txt")))
        {
          j = -9;
          return j;
          paramContext = hZ(paramContext);
          if (paramContext == null)
          {
            i = -5;
            break;
          }
          paramFile = paramShareSecurityCheck.cHd();
          if (paramFile == null)
          {
            i = -2;
            break;
          }
          paramFile = (String)paramFile.get("TINKER_ID");
          if (paramFile == null)
          {
            i = -6;
            break;
          }
          if (!paramContext.equals(paramFile))
          {
            new StringBuilder("tinkerId is not equal, base is ").append(paramContext).append(", but patch is ").append(paramFile);
            i = -7;
            break;
          }
          i = 0;
          break;
          label159:
          i = 0;
          continue;
        }
        if ((!Ik(paramInt)) && (paramContext.containsKey("assets/so_meta.txt"))) {
          return -9;
        }
        if ((!Il(paramInt)) && (paramContext.containsKey("assets/res_meta.txt"))) {
          return -9;
        }
      }
    }
    return 0;
  }
  
  public static ShareDexDiffPatchInfo a(ShareDexDiffPatchInfo paramShareDexDiffPatchInfo, int paramInt)
  {
    if (paramShareDexDiffPatchInfo.vuz.startsWith("test.dex"))
    {
      if (paramInt != 1) {}
      for (String str = "classes" + paramInt + ".dex";; str = "classes.dex") {
        return new ShareDexDiffPatchInfo(str, paramShareDexDiffPatchInfo.path, paramShareDexDiffPatchInfo.vuA, paramShareDexDiffPatchInfo.vuB, paramShareDexDiffPatchInfo.vuE, paramShareDexDiffPatchInfo.vuC, paramShareDexDiffPatchInfo.vuD, paramShareDexDiffPatchInfo.vuF);
      }
    }
    return null;
  }
  
  public static String aC(Context paramContext)
  {
    if (processName != null) {
      return processName;
    }
    paramContext = aD(paramContext);
    processName = paramContext;
    return paramContext;
  }
  
  /* Error */
  private static String aD(Context paramContext)
  {
    // Byte code:
    //   0: invokestatic 198	android/os/Process:myPid	()I
    //   3: istore_1
    //   4: aload_0
    //   5: ifnull +7 -> 12
    //   8: iload_1
    //   9: ifgt +6 -> 15
    //   12: ldc -56
    //   14: areturn
    //   15: aload_0
    //   16: ldc -54
    //   18: invokevirtual 208	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   21: checkcast 210	android/app/ActivityManager
    //   24: astore_0
    //   25: aload_0
    //   26: ifnull +78 -> 104
    //   29: aload_0
    //   30: invokevirtual 214	android/app/ActivityManager:getRunningAppProcesses	()Ljava/util/List;
    //   33: astore_0
    //   34: aload_0
    //   35: ifnull +69 -> 104
    //   38: aload_0
    //   39: invokeinterface 220 1 0
    //   44: astore 4
    //   46: aload 4
    //   48: invokeinterface 225 1 0
    //   53: ifeq +227 -> 280
    //   56: aload 4
    //   58: invokeinterface 229 1 0
    //   63: checkcast 231	android/app/ActivityManager$RunningAppProcessInfo
    //   66: astore_0
    //   67: aload_0
    //   68: getfield 235	android/app/ActivityManager$RunningAppProcessInfo:pid	I
    //   71: iload_1
    //   72: if_icmpne -26 -> 46
    //   75: aload_0
    //   76: ifnull +28 -> 104
    //   79: aload_0
    //   80: getfield 236	android/app/ActivityManager$RunningAppProcessInfo:processName	Ljava/lang/String;
    //   83: astore_0
    //   84: aload_0
    //   85: areturn
    //   86: astore_0
    //   87: new 119	java/lang/StringBuilder
    //   90: dup
    //   91: ldc -18
    //   93: invokespecial 124	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   96: aload_0
    //   97: invokevirtual 241	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   100: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: pop
    //   104: sipush 128
    //   107: newarray <illegal type>
    //   109: astore 5
    //   111: new 243	java/io/FileInputStream
    //   114: dup
    //   115: new 119	java/lang/StringBuilder
    //   118: dup
    //   119: ldc -11
    //   121: invokespecial 124	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   124: iload_1
    //   125: invokevirtual 154	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   128: ldc -9
    //   130: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   133: invokevirtual 160	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   136: invokespecial 248	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   139: astore 4
    //   141: aload 4
    //   143: astore_0
    //   144: aload 4
    //   146: aload 5
    //   148: invokevirtual 252	java/io/FileInputStream:read	([B)I
    //   151: istore_3
    //   152: iload_3
    //   153: ifle +43 -> 196
    //   156: iconst_0
    //   157: istore_1
    //   158: goto +127 -> 285
    //   161: aload 4
    //   163: astore_0
    //   164: new 71	java/lang/String
    //   167: dup
    //   168: aload 5
    //   170: iconst_0
    //   171: iload_2
    //   172: invokespecial 255	java/lang/String:<init>	([BII)V
    //   175: astore 5
    //   177: aload 4
    //   179: invokevirtual 258	java/io/FileInputStream:close	()V
    //   182: aload 5
    //   184: areturn
    //   185: astore_0
    //   186: aload 5
    //   188: areturn
    //   189: iload_1
    //   190: iconst_1
    //   191: iadd
    //   192: istore_1
    //   193: goto +92 -> 285
    //   196: aload 4
    //   198: invokevirtual 258	java/io/FileInputStream:close	()V
    //   201: ldc -56
    //   203: areturn
    //   204: astore 5
    //   206: aconst_null
    //   207: astore 4
    //   209: aload 4
    //   211: astore_0
    //   212: new 119	java/lang/StringBuilder
    //   215: dup
    //   216: ldc -18
    //   218: invokespecial 124	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   221: aload 5
    //   223: invokevirtual 241	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   226: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   229: pop
    //   230: aload 4
    //   232: ifnull -31 -> 201
    //   235: aload 4
    //   237: invokevirtual 258	java/io/FileInputStream:close	()V
    //   240: goto -39 -> 201
    //   243: astore_0
    //   244: goto -43 -> 201
    //   247: astore 4
    //   249: aconst_null
    //   250: astore_0
    //   251: aload_0
    //   252: ifnull +7 -> 259
    //   255: aload_0
    //   256: invokevirtual 258	java/io/FileInputStream:close	()V
    //   259: aload 4
    //   261: athrow
    //   262: astore_0
    //   263: goto -62 -> 201
    //   266: astore_0
    //   267: goto -8 -> 259
    //   270: astore 4
    //   272: goto -21 -> 251
    //   275: astore 5
    //   277: goto -68 -> 209
    //   280: aconst_null
    //   281: astore_0
    //   282: goto -207 -> 75
    //   285: iload_3
    //   286: istore_2
    //   287: iload_1
    //   288: iload_3
    //   289: if_icmpge -128 -> 161
    //   292: aload 5
    //   294: iload_1
    //   295: baload
    //   296: sipush 255
    //   299: iand
    //   300: sipush 128
    //   303: if_icmpgt +10 -> 313
    //   306: aload 5
    //   308: iload_1
    //   309: baload
    //   310: ifgt -121 -> 189
    //   313: iload_1
    //   314: istore_2
    //   315: goto -154 -> 161
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	318	0	paramContext	Context
    //   3	311	1	i	int
    //   171	144	2	j	int
    //   151	139	3	k	int
    //   44	192	4	localObject1	Object
    //   247	13	4	localObject2	Object
    //   270	1	4	localObject3	Object
    //   109	78	5	localObject4	Object
    //   204	18	5	localException1	Exception
    //   275	32	5	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   29	34	86	java/lang/Exception
    //   38	46	86	java/lang/Exception
    //   46	75	86	java/lang/Exception
    //   79	84	86	java/lang/Exception
    //   177	182	185	java/lang/Exception
    //   111	141	204	java/lang/Exception
    //   235	240	243	java/lang/Exception
    //   111	141	247	finally
    //   196	201	262	java/lang/Exception
    //   255	259	266	java/lang/Exception
    //   144	152	270	finally
    //   164	177	270	finally
    //   212	230	270	finally
    //   144	152	275	java/lang/Exception
    //   164	177	275	java/lang/Exception
  }
  
  public static boolean acZ(String paramString)
  {
    String str = Build.FINGERPRINT;
    if ((paramString == null) || (paramString.equals("")) || (str == null) || (str.equals(""))) {
      new StringBuilder("fingerprint empty:").append(paramString).append(",current:").append(str);
    }
    while (paramString.equals(str)) {
      return false;
    }
    new StringBuilder("system OTA,fingerprint not equal:").append(paramString).append(",").append(str);
    return true;
  }
  
  private static boolean ada(String paramString)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramString != null)
    {
      paramString = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(paramString);
      bool1 = bool2;
      if (!paramString.matches()) {}
    }
    try
    {
      int i = Integer.parseInt(paramString.group(1));
      int j = Integer.parseInt(paramString.group(2));
      if (i <= 2)
      {
        bool1 = bool2;
        if (i == 2)
        {
          bool1 = bool2;
          if (j <= 0) {}
        }
      }
      else
      {
        bool1 = true;
      }
      return bool1;
    }
    catch (NumberFormatException paramString) {}
    return false;
  }
  
  /* Error */
  public static java.util.Properties ao(File paramFile)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 309	java/io/File:isFile	()Z
    //   4: ifeq +12 -> 16
    //   7: aload_0
    //   8: invokevirtual 313	java/io/File:length	()J
    //   11: lconst_0
    //   12: lcmp
    //   13: ifne +5 -> 18
    //   16: aconst_null
    //   17: areturn
    //   18: new 315	java/util/zip/ZipFile
    //   21: dup
    //   22: aload_0
    //   23: invokespecial 318	java/util/zip/ZipFile:<init>	(Ljava/io/File;)V
    //   26: astore_1
    //   27: aload_1
    //   28: ldc_w 320
    //   31: invokevirtual 324	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   34: astore_0
    //   35: aload_0
    //   36: ifnonnull +9 -> 45
    //   39: aload_1
    //   40: invokestatic 329	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   43: aconst_null
    //   44: areturn
    //   45: aload_1
    //   46: aload_0
    //   47: invokevirtual 333	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   50: astore_0
    //   51: new 335	java/util/Properties
    //   54: dup
    //   55: invokespecial 336	java/util/Properties:<init>	()V
    //   58: astore_2
    //   59: aload_2
    //   60: aload_0
    //   61: invokevirtual 340	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   64: aload_0
    //   65: invokestatic 344	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ar	(Ljava/lang/Object;)V
    //   68: aload_1
    //   69: invokestatic 329	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   72: aload_2
    //   73: areturn
    //   74: astore_2
    //   75: aconst_null
    //   76: astore_0
    //   77: aload_0
    //   78: invokestatic 344	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ar	(Ljava/lang/Object;)V
    //   81: aload_2
    //   82: athrow
    //   83: astore_2
    //   84: aload_1
    //   85: astore_0
    //   86: aload_2
    //   87: astore_1
    //   88: new 119	java/lang/StringBuilder
    //   91: dup
    //   92: ldc_w 346
    //   95: invokespecial 124	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   98: aload_1
    //   99: invokevirtual 347	java/io/IOException:getMessage	()Ljava/lang/String;
    //   102: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: pop
    //   106: aload_0
    //   107: invokestatic 329	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   110: aconst_null
    //   111: areturn
    //   112: astore_0
    //   113: aconst_null
    //   114: astore_1
    //   115: aload_1
    //   116: invokestatic 329	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   119: aload_0
    //   120: athrow
    //   121: astore_0
    //   122: goto -7 -> 115
    //   125: astore_1
    //   126: aload_0
    //   127: astore_2
    //   128: aload_1
    //   129: astore_0
    //   130: aload_2
    //   131: astore_1
    //   132: goto -17 -> 115
    //   135: astore_1
    //   136: aconst_null
    //   137: astore_0
    //   138: goto -50 -> 88
    //   141: astore_2
    //   142: goto -65 -> 77
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	145	0	paramFile	File
    //   26	90	1	localObject1	Object
    //   125	4	1	localObject2	Object
    //   131	1	1	localObject3	Object
    //   135	1	1	localIOException1	java.io.IOException
    //   58	15	2	localProperties	java.util.Properties
    //   74	8	2	localObject4	Object
    //   83	4	2	localIOException2	java.io.IOException
    //   127	4	2	localFile	File
    //   141	1	2	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   45	51	74	finally
    //   27	35	83	java/io/IOException
    //   64	68	83	java/io/IOException
    //   77	83	83	java/io/IOException
    //   18	27	112	finally
    //   27	35	121	finally
    //   64	68	121	finally
    //   77	83	121	finally
    //   88	106	125	finally
    //   18	27	135	java/io/IOException
    //   51	64	141	finally
  }
  
  public static String bS(Context paramContext, String paramString)
  {
    String str = paramString;
    if (paramString.equals("changing"))
    {
      if (ic(paramContext)) {
        str = "odex";
      }
    }
    else {
      return str;
    }
    return "interpet";
  }
  
  public static boolean cHe()
  {
    return (vvU) || (Build.VERSION.SDK_INT >= 21);
  }
  
  public static boolean cHf()
  {
    return (vvV) && (Build.VERSION.SDK_INT < 24);
  }
  
  public static boolean cHg()
  {
    return Build.VERSION.SDK_INT > 25;
  }
  
  public static String cHh()
  {
    if (vvY != null) {
      return vvY;
    }
    vvY = (String)Class.forName("dalvik.system.VMRuntime").getDeclaredMethod("getCurrentInstructionSet", new Class[0]).invoke(null, new Object[0]);
    new StringBuilder("getCurrentInstructionSet:").append(vvY);
    return vvY;
  }
  
  private static boolean cHi()
  {
    try
    {
      Object localObject = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[] { String.class });
      String str = (String)((Method)localObject).invoke(null, new Object[] { "dalvik.vm.usejit" });
      localObject = (String)((Method)localObject).invoke(null, new Object[] { "dalvik.vm.usejitprofiles" });
      if ((!oW(str)) && (oW((String)localObject)))
      {
        boolean bool = str.equals("true");
        if (bool) {
          return true;
        }
      }
    }
    catch (Throwable localThrowable)
    {
      new StringBuilder("isVmJitInternal ex:").append(localThrowable);
    }
    return false;
  }
  
  private static String hZ(Context paramContext)
  {
    if (vvX != null) {
      return vvX;
    }
    try
    {
      paramContext = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128).metaData.get("TINKER_ID");
      if (paramContext != null) {}
      for (vvX = String.valueOf(paramContext);; vvX = null) {
        return vvX;
      }
      return null;
    }
    catch (Exception paramContext)
    {
      new StringBuilder("getManifestTinkerID exception:").append(paramContext.getMessage());
    }
  }
  
  public static void ia(Context paramContext)
  {
    paramContext.getSharedPreferences("tinker_share_config", 4).edit().putBoolean("tinker_enable_1.9.7", false).commit();
  }
  
  public static boolean ib(Context paramContext)
  {
    if (paramContext == null) {
      return false;
    }
    return paramContext.getSharedPreferences("tinker_share_config", 4).getBoolean("tinker_enable_1.9.7", true);
  }
  
  public static boolean ic(Context paramContext)
  {
    String str = null;
    Object localObject = paramContext.getApplicationInfo();
    if (localObject != null) {
      str = ((ApplicationInfo)localObject).processName;
    }
    localObject = str;
    if (oW(str)) {
      localObject = paramContext.getPackageName();
    }
    str = aC(paramContext);
    if (str != null)
    {
      paramContext = str;
      if (str.length() != 0) {}
    }
    else
    {
      paramContext = "";
    }
    return ((String)localObject).equals(paramContext);
  }
  
  public static boolean id(Context paramContext)
  {
    if (vvW != null) {
      return vvW.booleanValue();
    }
    paramContext = Boolean.valueOf(aC(paramContext).endsWith(":patch"));
    vvW = paramContext;
    return paramContext.booleanValue();
  }
  
  public static void ie(Context paramContext)
  {
    paramContext = (ActivityManager)paramContext.getSystemService("activity");
    if (paramContext == null) {}
    for (;;)
    {
      return;
      paramContext = paramContext.getRunningAppProcesses();
      if (paramContext != null)
      {
        paramContext = paramContext.iterator();
        while (paramContext.hasNext())
        {
          ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)paramContext.next();
          if ((localRunningAppProcessInfo.uid == Process.myUid()) && (localRunningAppProcessInfo.pid != Process.myPid())) {
            Process.killProcess(localRunningAppProcessInfo.pid);
          }
        }
      }
    }
  }
  
  public static String j(Throwable paramThrowable)
  {
    if (paramThrowable == null) {
      return "";
    }
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    PrintStream localPrintStream = new PrintStream(localByteArrayOutputStream);
    try
    {
      for (;;)
      {
        Throwable localThrowable = paramThrowable.getCause();
        if (localThrowable == null) {
          break;
        }
        paramThrowable = localThrowable;
      }
      paramThrowable.printStackTrace(localPrintStream);
      paramThrowable = Ws(localByteArrayOutputStream.toString());
      return paramThrowable;
    }
    finally
    {
      SharePatchFileUtil.ar(localPrintStream);
    }
  }
  
  public static boolean oW(String paramString)
  {
    return (paramString == null) || (paramString.length() <= 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tinker/loader/shareutil/ShareTinkerInternals.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */