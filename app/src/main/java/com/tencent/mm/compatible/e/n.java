package com.tencent.mm.compatible.e;

import android.os.Build.VERSION;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.io.FileFilter;
import java.util.Map;
import java.util.regex.Pattern;

public final class n
{
  private static Map<String, String> dex = null;
  
  private static String c(Map<String, String> paramMap, String paramString)
  {
    return (String)paramMap.get(paramString);
  }
  
  private static boolean f(char paramChar)
  {
    return (paramChar >= '0') && (paramChar <= '9');
  }
  
  private static String fb(String paramString)
  {
    localObject = paramString;
    if (paramString != null)
    {
      String str = paramString;
      localObject = paramString;
      try
      {
        if (paramString.length() > 0) {
          for (;;)
          {
            str = paramString;
            localObject = paramString;
            if (f(paramString.charAt(0))) {
              break;
            }
            str = paramString;
            if (paramString.length() == 1) {
              return null;
            }
            str = paramString;
            paramString = paramString.substring(1);
          }
        }
        return (String)localObject;
      }
      catch (Exception paramString)
      {
        x.printErrStackTrace("CpuFeatures", paramString, "", new Object[0]);
        localObject = str;
      }
    }
  }
  
  private static String fc(String paramString)
  {
    int j;
    for (int i = 0;; i = j)
    {
      j = i + 1;
      try
      {
        if ((!f(paramString.charAt(i))) || (paramString.length() <= j))
        {
          i = j - 1;
          String str = paramString;
          if (paramString.length() > i + 1)
          {
            str = paramString;
            if (i > 0) {
              str = paramString.substring(0, i);
            }
          }
          return str;
        }
      }
      catch (Exception localException)
      {
        x.printErrStackTrace("CpuFeatures", localException, "", new Object[0]);
        return paramString;
      }
    }
  }
  
  public static Map<String, String> zn()
  {
    if (dex == null) {
      dex = zt();
    }
    return dex;
  }
  
  public static String zo()
  {
    if (dex == null) {
      dex = zt();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(": ");
    localStringBuilder.append(c(dex, "Features"));
    localStringBuilder.append(": ");
    localStringBuilder.append(c(dex, "Processor"));
    localStringBuilder.append(": ");
    localStringBuilder.append(c(dex, "CPU architecture"));
    localStringBuilder.append(": ");
    localStringBuilder.append(c(dex, "Hardware"));
    localStringBuilder.append(": ");
    localStringBuilder.append(c(dex, "Serial"));
    return localStringBuilder.toString();
  }
  
  public static boolean zp()
  {
    if (dex == null) {
      dex = zt();
    }
    if (dex != null)
    {
      String str = c(dex, "Features");
      if ((str != null) && (str.contains("neon"))) {}
      while ((str != null) && (str.contains("asimd"))) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean zq()
  {
    try
    {
      if (Build.VERSION.SDK_INT >= 4) {}
      for (int i = 1; i != 0; i = 0)
      {
        boolean bool = zp();
        if (!bool) {
          break;
        }
        return true;
      }
      return false;
    }
    catch (IncompatibleClassChangeError localIncompatibleClassChangeError)
    {
      x.printErrStackTrace("MicroMsg.Crash", localIncompatibleClassChangeError, "May cause dvmFindCatchBlock crash!", new Object[0]);
      throw ((IncompatibleClassChangeError)new IncompatibleClassChangeError("May cause dvmFindCatchBlock crash!").initCause(localIncompatibleClassChangeError));
    }
    catch (Throwable localThrowable) {}
    return false;
  }
  
  public static boolean zr()
  {
    boolean bool2 = false;
    if (dex == null) {
      dex = zt();
    }
    boolean bool1 = bool2;
    String str;
    if (dex != null)
    {
      str = c(dex, "CPU architecture");
      x.d("CpuFeatures", "arch " + str);
      bool1 = bool2;
      if (str != null) {
        bool1 = bool2;
      }
    }
    try
    {
      if (str.length() > 0)
      {
        int i = bi.getInt(fc(fb(str)), 0);
        x.d("CpuFeatures", "armarch " + i);
        bool1 = bool2;
        if (i >= 6) {
          bool1 = true;
        }
      }
      return bool1;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("CpuFeatures", localException, "", new Object[0]);
    }
    return false;
  }
  
  public static int zs()
  {
    try
    {
      int i = new File("/sys/devices/system/cpu/").listFiles(new a()).length;
      return i;
    }
    catch (Exception localException) {}
    return 1;
  }
  
  /* Error */
  public static java.util.HashMap<String, String> zt()
  {
    // Byte code:
    //   0: new 168	java/util/HashMap
    //   3: dup
    //   4: invokespecial 169	java/util/HashMap:<init>	()V
    //   7: astore_3
    //   8: new 171	java/io/BufferedReader
    //   11: dup
    //   12: new 173	java/io/InputStreamReader
    //   15: dup
    //   16: new 175	java/io/FileInputStream
    //   19: dup
    //   20: ldc -79
    //   22: invokespecial 178	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   25: ldc -76
    //   27: invokespecial 183	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   30: invokespecial 186	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   33: astore_1
    //   34: aload_1
    //   35: astore_0
    //   36: aload_1
    //   37: invokevirtual 189	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   40: astore_2
    //   41: aload_2
    //   42: ifnull +93 -> 135
    //   45: aload_1
    //   46: astore_0
    //   47: aload_2
    //   48: ldc -65
    //   50: iconst_2
    //   51: invokevirtual 195	java/lang/String:split	(Ljava/lang/String;I)[Ljava/lang/String;
    //   54: astore 4
    //   56: aload 4
    //   58: ifnull -24 -> 34
    //   61: aload_1
    //   62: astore_0
    //   63: aload 4
    //   65: arraylength
    //   66: iconst_2
    //   67: if_icmplt -33 -> 34
    //   70: aload_1
    //   71: astore_0
    //   72: aload 4
    //   74: iconst_0
    //   75: aaload
    //   76: invokevirtual 198	java/lang/String:trim	()Ljava/lang/String;
    //   79: astore_2
    //   80: aload_1
    //   81: astore_0
    //   82: aload 4
    //   84: iconst_1
    //   85: aaload
    //   86: invokevirtual 198	java/lang/String:trim	()Ljava/lang/String;
    //   89: astore 4
    //   91: aload_1
    //   92: astore_0
    //   93: aload_3
    //   94: aload_2
    //   95: invokevirtual 199	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   98: ifnonnull -64 -> 34
    //   101: aload_1
    //   102: astore_0
    //   103: aload_3
    //   104: aload_2
    //   105: aload 4
    //   107: invokevirtual 203	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   110: pop
    //   111: goto -77 -> 34
    //   114: astore_2
    //   115: aload_1
    //   116: astore_0
    //   117: ldc 49
    //   119: aload_2
    //   120: ldc -51
    //   122: iconst_0
    //   123: anewarray 4	java/lang/Object
    //   126: invokestatic 57	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   129: aload_1
    //   130: invokestatic 208	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   133: aload_3
    //   134: areturn
    //   135: aload_1
    //   136: invokestatic 208	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   139: aload_3
    //   140: areturn
    //   141: astore_1
    //   142: aconst_null
    //   143: astore_0
    //   144: aload_0
    //   145: invokestatic 208	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   148: aload_1
    //   149: athrow
    //   150: astore_1
    //   151: goto -7 -> 144
    //   154: astore_2
    //   155: aconst_null
    //   156: astore_1
    //   157: goto -42 -> 115
    // Local variable table:
    //   start	length	slot	name	signature
    //   35	110	0	localBufferedReader1	java.io.BufferedReader
    //   33	103	1	localBufferedReader2	java.io.BufferedReader
    //   141	8	1	localObject1	Object
    //   150	1	1	localObject2	Object
    //   156	1	1	localObject3	Object
    //   40	65	2	str	String
    //   114	6	2	localIOException1	java.io.IOException
    //   154	1	2	localIOException2	java.io.IOException
    //   7	133	3	localHashMap	java.util.HashMap
    //   54	52	4	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   36	41	114	java/io/IOException
    //   47	56	114	java/io/IOException
    //   63	70	114	java/io/IOException
    //   72	80	114	java/io/IOException
    //   82	91	114	java/io/IOException
    //   93	101	114	java/io/IOException
    //   103	111	114	java/io/IOException
    //   8	34	141	finally
    //   36	41	150	finally
    //   47	56	150	finally
    //   63	70	150	finally
    //   72	80	150	finally
    //   82	91	150	finally
    //   93	101	150	finally
    //   103	111	150	finally
    //   117	129	150	finally
    //   8	34	154	java/io/IOException
  }
  
  final class a
    implements FileFilter
  {
    public final boolean accept(File paramFile)
    {
      return Pattern.matches("cpu[0-9]", paramFile.getName());
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/compatible/e/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */