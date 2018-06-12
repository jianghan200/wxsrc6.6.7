package c.t.m.g;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;
import org.eclipse.jdt.annotation.Nullable;

public final class j
  implements f
{
  private aj a;
  
  public j(aj paramaj)
  {
    this.a = paramaj;
  }
  
  public static int a(Context paramContext)
  {
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (paramContext == null) {}
    for (int i = 1; i != 0; i = 0) {
      return -1;
    }
    try
    {
      paramContext = paramContext.getActiveNetworkInfo();
      if (paramContext != null)
      {
        i = paramContext.getType();
        return i;
      }
    }
    catch (Exception paramContext) {}
    return -1;
  }
  
  public static void a(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException paramCloseable) {}
  }
  
  public static boolean a(Object paramObject)
  {
    return (paramObject != null) && (((WeakReference)paramObject).get() != null);
  }
  
  /* Error */
  public static byte[] a(File paramFile)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 61	java/io/File:exists	()Z
    //   4: ifne +7 -> 11
    //   7: iconst_0
    //   8: newarray <illegal type>
    //   10: areturn
    //   11: new 63	java/io/ByteArrayOutputStream
    //   14: dup
    //   15: invokespecial 64	java/io/ByteArrayOutputStream:<init>	()V
    //   18: astore 4
    //   20: sipush 4096
    //   23: newarray <illegal type>
    //   25: astore_3
    //   26: new 66	java/io/BufferedInputStream
    //   29: dup
    //   30: new 68	java/io/FileInputStream
    //   33: dup
    //   34: aload_0
    //   35: invokespecial 71	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   38: invokespecial 74	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   41: astore_2
    //   42: aload_2
    //   43: astore_0
    //   44: aload_2
    //   45: aload_3
    //   46: invokevirtual 78	java/io/BufferedInputStream:read	([B)I
    //   49: istore_1
    //   50: iload_1
    //   51: iconst_m1
    //   52: if_icmpeq +39 -> 91
    //   55: aload_2
    //   56: astore_0
    //   57: aload 4
    //   59: aload_3
    //   60: iconst_0
    //   61: iload_1
    //   62: invokevirtual 82	java/io/ByteArrayOutputStream:write	([BII)V
    //   65: goto -23 -> 42
    //   68: astore_3
    //   69: aload_2
    //   70: astore_0
    //   71: aload_3
    //   72: astore_2
    //   73: aload_2
    //   74: athrow
    //   75: astore_3
    //   76: aload_0
    //   77: astore_2
    //   78: aload_3
    //   79: astore_0
    //   80: aload_2
    //   81: invokestatic 84	c/t/m/g/j:a	(Ljava/io/Closeable;)V
    //   84: aload 4
    //   86: invokestatic 84	c/t/m/g/j:a	(Ljava/io/Closeable;)V
    //   89: aload_0
    //   90: athrow
    //   91: aload_2
    //   92: astore_0
    //   93: aload 4
    //   95: invokevirtual 88	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   98: astore_3
    //   99: aload_2
    //   100: invokestatic 84	c/t/m/g/j:a	(Ljava/io/Closeable;)V
    //   103: aload 4
    //   105: invokestatic 84	c/t/m/g/j:a	(Ljava/io/Closeable;)V
    //   108: aload_3
    //   109: areturn
    //   110: astore_0
    //   111: aconst_null
    //   112: astore_2
    //   113: goto -33 -> 80
    //   116: astore_2
    //   117: aconst_null
    //   118: astore_0
    //   119: goto -46 -> 73
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	122	0	paramFile	File
    //   49	13	1	i	int
    //   41	72	2	localObject1	Object
    //   116	1	2	localIOException1	IOException
    //   25	35	3	arrayOfByte1	byte[]
    //   68	4	3	localIOException2	IOException
    //   75	4	3	localObject2	Object
    //   98	11	3	arrayOfByte2	byte[]
    //   18	86	4	localByteArrayOutputStream	ByteArrayOutputStream
    // Exception table:
    //   from	to	target	type
    //   44	50	68	java/io/IOException
    //   57	65	68	java/io/IOException
    //   93	99	68	java/io/IOException
    //   44	50	75	finally
    //   57	65	75	finally
    //   73	75	75	finally
    //   93	99	75	finally
    //   26	42	110	finally
    //   26	42	116	java/io/IOException
  }
  
  public static byte[] a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    DeflaterOutputStream localDeflaterOutputStream = new DeflaterOutputStream(localByteArrayOutputStream);
    try
    {
      localDeflaterOutputStream.write(paramArrayOfByte, 0, paramArrayOfByte.length);
      localDeflaterOutputStream.finish();
      localDeflaterOutputStream.flush();
      localDeflaterOutputStream.close();
      return localByteArrayOutputStream.toByteArray();
    }
    catch (Exception paramArrayOfByte) {}
    return null;
  }
  
  public static String b(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    return str;
  }
  
  public static boolean b(Context paramContext)
  {
    int i = 1;
    Object localObject = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (localObject == null) {}
    while (i != 0)
    {
      return false;
      i = 0;
    }
    for (;;)
    {
      try
      {
        paramContext = ((ConnectivityManager)localObject).getNetworkInfo(0);
        localObject = ((ConnectivityManager)localObject).getNetworkInfo(1);
        if (localObject != null)
        {
          boolean bool2 = ((NetworkInfo)localObject).isConnected();
          bool1 = bool2;
          if (!bool2)
          {
            bool1 = bool2;
            if (paramContext != null) {
              bool1 = paramContext.isConnected();
            }
          }
          return bool1;
        }
      }
      catch (Exception paramContext)
      {
        return false;
      }
      boolean bool1 = false;
    }
  }
  
  @Nullable
  public static byte[] b(byte[] paramArrayOfByte)
  {
    int i = 0;
    if (paramArrayOfByte == null) {
      return null;
    }
    ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(paramArrayOfByte);
    InflaterInputStream localInflaterInputStream = new InflaterInputStream(localByteArrayInputStream);
    paramArrayOfByte = new byte[0];
    byte[] arrayOfByte2 = new byte['Ѐ'];
    for (;;)
    {
      try
      {
        int j = localInflaterInputStream.read(arrayOfByte2);
        if (j > 0)
        {
          i += j;
          byte[] arrayOfByte1 = new byte[i];
          System.arraycopy(paramArrayOfByte, 0, arrayOfByte1, 0, paramArrayOfByte.length);
          System.arraycopy(arrayOfByte2, 0, arrayOfByte1, paramArrayOfByte.length, j);
          paramArrayOfByte = arrayOfByte1;
          if (j <= 0) {
            try
            {
              localByteArrayInputStream.close();
              localInflaterInputStream.close();
              return paramArrayOfByte;
            }
            catch (IOException paramArrayOfByte)
            {
              return null;
            }
          }
        }
      }
      catch (Exception paramArrayOfByte)
      {
        return null;
      }
    }
  }
  
  public static int c(Context paramContext)
  {
    try
    {
      Object localObject2 = paramContext.getPackageManager().getInstalledPackages(8192);
      Object localObject1 = "B2E6AD38C9EA55FC,8B51908CDE852ABE,6F350C90F0B8C2F7,18A9EF1D9AFDB74D,B0F7B644A29E1C82,2E0111E09CC76BBD,8FFA91856B5C9ED1,569EA369CE0CE6BE,490A7AD1901C1407,15A805FD6A78BF07,92DFF18D49ED5200,D80FF7253FEDC748,2044A6443164DDC8,488324C2DC64A6D5,E0EC01B2D80C2E57".split(",");
      localObject2 = ((List)localObject2).iterator();
      PackageInfo localPackageInfo;
      int j;
      int i;
      boolean bool;
      while (((Iterator)localObject2).hasNext())
      {
        localPackageInfo = (PackageInfo)((Iterator)localObject2).next();
        j = localObject1.length;
        i = 0;
        while (i < j)
        {
          String str = localObject1[i];
          bool = d(localPackageInfo.packageName).equalsIgnoreCase(str);
          if (bool) {
            return 1;
          }
          i += 1;
        }
      }
      try
      {
        paramContext.getPackageManager();
        paramContext = "B2E6AD38C9EA55FC,8B51908CDE852ABE,6F350C90F0B8C2F7,18A9EF1D9AFDB74D,B0F7B644A29E1C82,2E0111E09CC76BBD,8FFA91856B5C9ED1,569EA369CE0CE6BE,490A7AD1901C1407,15A805FD6A78BF07,92DFF18D49ED5200,D80FF7253FEDC748,2044A6443164DDC8,488324C2DC64A6D5,E0EC01B2D80C2E57".split(",");
        localObject1 = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + File.separatorChar + "Android" + File.separatorChar + "data").listFiles();
        int k = localObject1.length;
        i = 0;
        while (i < k)
        {
          localObject2 = localObject1[i];
          int m = paramContext.length;
          j = 0;
          while (j < m)
          {
            localPackageInfo = paramContext[j];
            bool = d(((File)localObject2).getName()).equalsIgnoreCase(localPackageInfo);
            if (bool) {
              return 1;
            }
            j += 1;
          }
          i += 1;
        }
        return 2;
      }
      catch (Throwable paramContext)
      {
        return 3;
      }
    }
    catch (Throwable paramContext)
    {
      return 3;
    }
  }
  
  public static String c(String paramString)
  {
    try
    {
      Object localObject = MessageDigest.getInstance("MD5");
      ((MessageDigest)localObject).update(paramString.getBytes());
      localObject = ((MessageDigest)localObject).digest();
      StringBuilder localStringBuilder = new StringBuilder();
      int j = localObject.length;
      int i = 0;
      while (i < j)
      {
        localStringBuilder.append(Integer.toHexString(localObject[i] & 0xFF)).append("");
        i += 1;
      }
      localObject = localStringBuilder.toString();
      return (String)localObject;
    }
    catch (Exception localException) {}
    return paramString;
  }
  
  private static String d(String paramString)
  {
    try
    {
      Object localObject = MessageDigest.getInstance("MD5");
      ((MessageDigest)localObject).update(paramString.getBytes());
      byte[] arrayOfByte = ((MessageDigest)localObject).digest();
      StringBuilder localStringBuilder = new StringBuilder();
      int j = arrayOfByte.length;
      int i = 0;
      while (i < j)
      {
        String str = Integer.toHexString(arrayOfByte[i] & 0xFF);
        localObject = str;
        if (str.length() != 2) {
          localObject = "0" + str;
        }
        localStringBuilder.append((String)localObject).append("");
        i += 1;
      }
      localObject = localStringBuilder.toString().substring(8, 24);
      return (String)localObject;
    }
    catch (Exception localException) {}
    return paramString;
  }
  
  public final int a()
  {
    return this.a.a;
  }
  
  public final String a(String paramString)
  {
    return this.a.a(paramString);
  }
  
  public final String b()
  {
    return this.a.b;
  }
  
  public final int c()
  {
    return this.a.c;
  }
  
  public final byte[] d()
  {
    return this.a.d;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/c/t/m/g/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */