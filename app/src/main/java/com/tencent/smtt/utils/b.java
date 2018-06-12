package com.tencent.smtt.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class b
{
  public static String a = "";
  public static String b = "";
  public static String c = "";
  public static String d = "";
  public static String e = "";
  
  private static PackageInfo a(String paramString, int paramInt)
  {
    for (;;)
    {
      int i;
      try
      {
        Object localObject2 = Class.forName("android.content.pm.PackageParser");
        Object localObject1 = ((Class)localObject2).getDeclaredClasses();
        int j = localObject1.length;
        i = 0;
        if (i < j)
        {
          localMethod1 = localObject1[i];
          if (localMethod1.getName().compareTo("android.content.pm.PackageParser$Package") != 0) {
            break label341;
          }
          Object localObject3 = ((Class)localObject2).getConstructor(new Class[] { String.class });
          Method localMethod2 = ((Class)localObject2).getDeclaredMethod("parsePackage", new Class[] { File.class, String.class, DisplayMetrics.class, Integer.TYPE });
          localObject1 = ((Class)localObject2).getDeclaredMethod("collectCertificates", new Class[] { localMethod1, Integer.TYPE });
          localMethod1 = ((Class)localObject2).getDeclaredMethod("generatePackageInfo", new Class[] { localMethod1, int[].class, Integer.TYPE, Long.TYPE, Long.TYPE });
          ((Constructor)localObject3).setAccessible(true);
          localMethod2.setAccessible(true);
          ((Method)localObject1).setAccessible(true);
          localMethod1.setAccessible(true);
          localObject2 = ((Constructor)localObject3).newInstance(new Object[] { paramString });
          localObject3 = new DisplayMetrics();
          ((DisplayMetrics)localObject3).setToDefaults();
          paramString = localMethod2.invoke(localObject2, new Object[] { new File(paramString), paramString, localObject3, Integer.valueOf(0) });
          if (paramString == null) {
            return null;
          }
          if ((paramInt & 0x40) != 0) {
            ((Method)localObject1).invoke(localObject2, new Object[] { paramString, Integer.valueOf(0) });
          }
          paramString = (PackageInfo)localMethod1.invoke(null, new Object[] { paramString, null, Integer.valueOf(paramInt), Integer.valueOf(0), Integer.valueOf(0) });
          return paramString;
        }
      }
      catch (Exception paramString)
      {
        return null;
      }
      Method localMethod1 = null;
      continue;
      label341:
      i += 1;
    }
  }
  
  /* Error */
  public static String a()
  {
    // Byte code:
    //   0: getstatic 20	com/tencent/smtt/utils/b:c	Ljava/lang/String;
    //   3: invokestatic 123	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   6: ifne +9 -> 15
    //   9: getstatic 20	com/tencent/smtt/utils/b:c	Ljava/lang/String;
    //   12: astore_3
    //   13: aload_3
    //   14: areturn
    //   15: new 125	java/io/InputStreamReader
    //   18: dup
    //   19: invokestatic 131	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   22: ldc -123
    //   24: invokevirtual 137	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   27: invokevirtual 143	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   30: invokespecial 146	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   33: astore_1
    //   34: new 148	java/io/BufferedReader
    //   37: dup
    //   38: aload_1
    //   39: invokespecial 151	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   42: astore 4
    //   44: aload 4
    //   46: astore_3
    //   47: aload_1
    //   48: astore_2
    //   49: aload 4
    //   51: invokevirtual 154	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   54: ldc -100
    //   56: invokevirtual 159	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   59: ifeq +41 -> 100
    //   62: aload 4
    //   64: astore_3
    //   65: aload_1
    //   66: astore_2
    //   67: ldc -95
    //   69: invokestatic 164	com/tencent/smtt/utils/b:a	(Ljava/lang/String;)Ljava/lang/String;
    //   72: astore_0
    //   73: aload 4
    //   75: ifnull +8 -> 83
    //   78: aload 4
    //   80: invokevirtual 167	java/io/BufferedReader:close	()V
    //   83: aload_0
    //   84: astore_3
    //   85: aload_1
    //   86: ifnull -73 -> 13
    //   89: aload_0
    //   90: astore_3
    //   91: aload_1
    //   92: invokevirtual 168	java/io/InputStreamReader:close	()V
    //   95: aload_0
    //   96: areturn
    //   97: astore_0
    //   98: aload_3
    //   99: areturn
    //   100: aload 4
    //   102: astore_3
    //   103: aload_1
    //   104: astore_2
    //   105: ldc -86
    //   107: invokestatic 175	java/lang/System:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   110: invokestatic 164	com/tencent/smtt/utils/b:a	(Ljava/lang/String;)Ljava/lang/String;
    //   113: astore_0
    //   114: goto -41 -> 73
    //   117: astore_0
    //   118: aconst_null
    //   119: astore_0
    //   120: aconst_null
    //   121: astore_1
    //   122: aload_0
    //   123: astore_3
    //   124: aload_1
    //   125: astore_2
    //   126: ldc -86
    //   128: invokestatic 175	java/lang/System:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   131: invokestatic 164	com/tencent/smtt/utils/b:a	(Ljava/lang/String;)Ljava/lang/String;
    //   134: astore 4
    //   136: aload 4
    //   138: astore_2
    //   139: aload_0
    //   140: ifnull +7 -> 147
    //   143: aload_0
    //   144: invokevirtual 167	java/io/BufferedReader:close	()V
    //   147: aload_2
    //   148: astore_3
    //   149: aload_1
    //   150: ifnull -137 -> 13
    //   153: aload_2
    //   154: astore_3
    //   155: aload_1
    //   156: invokevirtual 168	java/io/InputStreamReader:close	()V
    //   159: aload_2
    //   160: areturn
    //   161: astore_0
    //   162: aconst_null
    //   163: astore_2
    //   164: aconst_null
    //   165: astore_1
    //   166: aload_2
    //   167: ifnull +7 -> 174
    //   170: aload_2
    //   171: invokevirtual 167	java/io/BufferedReader:close	()V
    //   174: aload_1
    //   175: ifnull +7 -> 182
    //   178: aload_1
    //   179: invokevirtual 168	java/io/InputStreamReader:close	()V
    //   182: aload_0
    //   183: athrow
    //   184: astore_2
    //   185: goto -11 -> 174
    //   188: astore_1
    //   189: goto -7 -> 182
    //   192: astore_0
    //   193: goto -46 -> 147
    //   196: astore_2
    //   197: goto -114 -> 83
    //   200: astore_0
    //   201: aconst_null
    //   202: astore_2
    //   203: goto -37 -> 166
    //   206: astore_0
    //   207: aload_2
    //   208: astore_1
    //   209: aload_3
    //   210: astore_2
    //   211: goto -45 -> 166
    //   214: astore_0
    //   215: aconst_null
    //   216: astore_0
    //   217: goto -95 -> 122
    //   220: astore_0
    //   221: aload 4
    //   223: astore_0
    //   224: goto -102 -> 122
    // Local variable table:
    //   start	length	slot	name	signature
    //   72	24	0	str1	String
    //   97	1	0	localIOException1	java.io.IOException
    //   113	1	0	str2	String
    //   117	1	0	localThrowable1	Throwable
    //   119	25	0	localObject1	Object
    //   161	22	0	localObject2	Object
    //   192	1	0	localIOException2	java.io.IOException
    //   200	1	0	localObject3	Object
    //   206	1	0	localObject4	Object
    //   214	1	0	localThrowable2	Throwable
    //   216	1	0	localObject5	Object
    //   220	1	0	localThrowable3	Throwable
    //   223	1	0	localObject6	Object
    //   33	146	1	localInputStreamReader	java.io.InputStreamReader
    //   188	1	1	localIOException3	java.io.IOException
    //   208	1	1	localObject7	Object
    //   48	123	2	localObject8	Object
    //   184	1	2	localIOException4	java.io.IOException
    //   196	1	2	localIOException5	java.io.IOException
    //   202	9	2	localObject9	Object
    //   12	198	3	localObject10	Object
    //   42	180	4	localObject11	Object
    // Exception table:
    //   from	to	target	type
    //   91	95	97	java/io/IOException
    //   155	159	97	java/io/IOException
    //   15	34	117	java/lang/Throwable
    //   15	34	161	finally
    //   170	174	184	java/io/IOException
    //   178	182	188	java/io/IOException
    //   143	147	192	java/io/IOException
    //   78	83	196	java/io/IOException
    //   34	44	200	finally
    //   49	62	206	finally
    //   67	73	206	finally
    //   105	114	206	finally
    //   126	136	206	finally
    //   34	44	214	java/lang/Throwable
    //   49	62	220	java/lang/Throwable
    //   67	73	220	java/lang/Throwable
    //   105	114	220	java/lang/Throwable
  }
  
  public static String a(Context paramContext)
  {
    try
    {
      String str = paramContext.getPackageName();
      paramContext = paramContext.getPackageManager().getPackageInfo(str, 0).versionName;
      return paramContext;
    }
    catch (Exception paramContext) {}
    return null;
  }
  
  public static String a(Context paramContext, File paramFile)
  {
    try
    {
      if (!paramContext.getApplicationContext().getPackageName().contains("com.jd.jrapp")) {
        break label48;
      }
      TbsLog.i("AppUtil", "[AppUtil.getSignatureFromApk]  #1");
      localObject2 = a(paramFile);
      if (localObject2 == null) {
        break label48;
      }
      TbsLog.i("AppUtil", "[AppUtil.getSignatureFromApk]  #2");
    }
    catch (Throwable localThrowable)
    {
      label48:
      Object localObject1;
      do
      {
        TbsLog.i("AppUtil", "[AppUtil.getSignatureFromApk]  #3");
        TbsLog.i("AppUtil", "[AppUtil.getSignatureFromApk]  #4");
        Object localObject2 = a(paramContext, paramFile, false);
        TbsLog.i("AppUtil", "[AppUtil.getSignatureFromApk]  android api signature=" + (String)localObject2);
        localObject1 = localObject2;
        if (localObject2 == null)
        {
          localObject1 = a(paramFile);
          TbsLog.i("AppUtil", "[AppUtil.getSignatureFromApk]  java get signature=" + (String)localObject1);
        }
        localObject2 = localObject1;
      } while (localObject1 != null);
      paramContext = a(paramContext, paramFile, true);
      TbsLog.i("AppUtil", "[AppUtil.getSignatureFromApk]  android reflection signature=" + paramContext);
    }
    return (String)localObject2;
    return paramContext;
  }
  
  private static String a(Context paramContext, File paramFile, boolean paramBoolean)
  {
    Object localObject = null;
    if (paramBoolean)
    {
      paramContext = a(paramFile.getAbsolutePath(), 65);
      if (paramContext == null) {
        break label80;
      }
      if ((paramContext.signatures == null) || (paramContext.signatures.length <= 0)) {
        break label72;
      }
    }
    label72:
    label80:
    for (paramContext = paramContext.signatures[0];; paramContext = null)
    {
      paramFile = (File)localObject;
      if (paramContext != null) {
        paramFile = paramContext.toCharsString();
      }
      return paramFile;
      paramContext = paramContext.getPackageManager().getPackageArchiveInfo(paramFile.getAbsolutePath(), 65);
      break;
      TbsLog.w("AppUtil", "[getSignatureFromApk] pkgInfo is not null BUT signatures is null!");
    }
  }
  
  /* Error */
  public static String a(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 181	android/content/Context:getPackageName	()Ljava/lang/String;
    //   4: astore_2
    //   5: aload_0
    //   6: invokevirtual 185	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   9: aload_2
    //   10: sipush 128
    //   13: invokevirtual 265	android/content/pm/PackageManager:getApplicationInfo	(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   16: getfield 271	android/content/pm/ApplicationInfo:metaData	Landroid/os/Bundle;
    //   19: aload_1
    //   20: invokevirtual 277	android/os/Bundle:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   23: invokestatic 280	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   26: astore_0
    //   27: aload_0
    //   28: invokestatic 283	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   31: invokestatic 287	java/lang/Integer:toHexString	(I)Ljava/lang/String;
    //   34: invokestatic 280	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   37: astore_1
    //   38: aload_1
    //   39: areturn
    //   40: astore_0
    //   41: aconst_null
    //   42: areturn
    //   43: astore_1
    //   44: aload_0
    //   45: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	46	0	paramContext	Context
    //   0	46	1	paramString	String
    //   4	6	2	str	String
    // Exception table:
    //   from	to	target	type
    //   0	27	40	java/lang/Exception
    //   27	38	43	java/lang/Exception
  }
  
  private static String a(File paramFile)
  {
    for (;;)
    {
      try
      {
        JarFile localJarFile = new JarFile(paramFile);
        paramFile = localJarFile.getJarEntry("AndroidManifest.xml");
        byte[] arrayOfByte = new byte[' '];
        String str1 = a(a(localJarFile, paramFile, arrayOfByte)[0].getEncoded());
        Enumeration localEnumeration = localJarFile.entries();
        if (localEnumeration.hasMoreElements())
        {
          paramFile = (JarEntry)localEnumeration.nextElement();
          String str2 = paramFile.getName();
          if (str2 == null) {
            continue;
          }
          paramFile = a(localJarFile, paramFile, arrayOfByte);
          if (paramFile != null)
          {
            paramFile = a(paramFile[0].getEncoded());
            if (paramFile == null)
            {
              if (str2.startsWith("META-INF/")) {
                continue;
              }
              return null;
            }
            boolean bool = paramFile.equals(str1);
            if (bool) {
              continue;
            }
            return null;
          }
        }
        else
        {
          return str1;
        }
      }
      catch (Exception paramFile)
      {
        return null;
      }
      paramFile = null;
    }
  }
  
  private static String a(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    return str;
  }
  
  private static String a(byte[] paramArrayOfByte)
  {
    int k = paramArrayOfByte.length;
    char[] arrayOfChar = new char[k * 2];
    int i = 0;
    if (i < k)
    {
      int m = paramArrayOfByte[i];
      int j = m >> 4 & 0xF;
      if (j >= 10)
      {
        j = j + 97 - 10;
        label44:
        arrayOfChar[(i * 2)] = ((char)j);
        j = m & 0xF;
        if (j < 10) {
          break label97;
        }
        j = j + 97 - 10;
      }
      for (;;)
      {
        arrayOfChar[(i * 2 + 1)] = ((char)j);
        i += 1;
        break;
        j += 48;
        break label44;
        label97:
        j += 48;
      }
    }
    return new String(arrayOfChar);
  }
  
  private static Certificate[] a(JarFile paramJarFile, JarEntry paramJarEntry, byte[] paramArrayOfByte)
  {
    paramJarFile = paramJarFile.getInputStream(paramJarEntry);
    while (paramJarFile.read(paramArrayOfByte, 0, paramArrayOfByte.length) != -1) {}
    paramJarFile.close();
    if (paramJarEntry != null) {
      return paramJarEntry.getCertificates();
    }
    return null;
  }
  
  public static int b(Context paramContext)
  {
    try
    {
      String str = paramContext.getPackageName();
      int i = paramContext.getPackageManager().getPackageInfo(str, 0).versionCode;
      return i;
    }
    catch (Exception paramContext) {}
    return 0;
  }
  
  public static String c(Context paramContext)
  {
    if (!TextUtils.isEmpty(a)) {
      return a;
    }
    try
    {
      paramContext = ((TelephonyManager)paramContext.getSystemService("phone")).getDeviceId();
      return paramContext;
    }
    catch (Exception paramContext) {}
    return "";
  }
  
  public static String d(Context paramContext)
  {
    if (!TextUtils.isEmpty(b)) {
      return b;
    }
    try
    {
      paramContext = ((TelephonyManager)paramContext.getSystemService("phone")).getSubscriberId();
      return paramContext;
    }
    catch (Exception paramContext) {}
    return "";
  }
  
  public static String e(Context paramContext)
  {
    if (!TextUtils.isEmpty(d)) {
      return d;
    }
    do
    {
      try
      {
        paramContext = (WifiManager)paramContext.getApplicationContext().getSystemService("wifi");
        if (paramContext == null) {
          paramContext = null;
        } else {
          paramContext = paramContext.getConnectionInfo();
        }
      }
      catch (Exception paramContext)
      {
        return "";
      }
      paramContext = paramContext.getMacAddress();
      return paramContext;
    } while (paramContext != null);
    return "";
  }
  
  public static String f(Context paramContext)
  {
    if (!TextUtils.isEmpty(e)) {
      return e;
    }
    try
    {
      e = Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
      return e;
    }
    catch (Exception paramContext)
    {
      for (;;) {}
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/smtt/utils/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */