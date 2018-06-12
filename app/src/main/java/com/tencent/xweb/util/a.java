package com.tencent.xweb.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.xwalk.core.Log;

public final class a
{
  public static boolean adE(String paramString)
  {
    try
    {
      ap(new File(paramString));
      return true;
    }
    catch (Exception localException)
    {
      Log.i("FileUtils", String.format("delete all files.(%s)", new Object[] { paramString }));
    }
    return false;
  }
  
  private static void ap(File paramFile)
  {
    if ((paramFile == null) || (!paramFile.exists())) {}
    do
    {
      return;
      if (paramFile.isFile())
      {
        paramFile.delete();
        return;
      }
    } while (!paramFile.isDirectory());
    File[] arrayOfFile = paramFile.listFiles();
    if ((arrayOfFile != null) && (arrayOfFile.length > 0))
    {
      int j = arrayOfFile.length;
      int i = 0;
      if (i < j)
      {
        File localFile = arrayOfFile[i];
        if ((localFile != null) && (localFile.exists()))
        {
          if (!localFile.isFile()) {
            break label95;
          }
          localFile.delete();
        }
        for (;;)
        {
          i += 1;
          break;
          label95:
          ap(localFile);
        }
      }
    }
    paramFile.delete();
  }
  
  public static boolean deleteFile(String paramString)
  {
    paramString = new File(paramString);
    if ((paramString.exists()) && (paramString.isFile()))
    {
      paramString.delete();
      return true;
    }
    return false;
  }
  
  /* Error */
  public static boolean fN(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: new 59	java/io/FileInputStream
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 60	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   8: invokevirtual 64	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   11: astore_2
    //   12: new 66	java/io/FileOutputStream
    //   15: dup
    //   16: aload_1
    //   17: invokespecial 67	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   20: invokevirtual 68	java/io/FileOutputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   23: astore_3
    //   24: aload_3
    //   25: aload_2
    //   26: lconst_0
    //   27: aload_2
    //   28: invokevirtual 74	java/nio/channels/FileChannel:size	()J
    //   31: invokevirtual 78	java/nio/channels/FileChannel:transferFrom	(Ljava/nio/channels/ReadableByteChannel;JJ)J
    //   34: pop2
    //   35: aload_2
    //   36: ifnull +7 -> 43
    //   39: aload_2
    //   40: invokevirtual 82	java/nio/channels/FileChannel:close	()V
    //   43: aload_3
    //   44: ifnull +7 -> 51
    //   47: aload_3
    //   48: invokevirtual 82	java/nio/channels/FileChannel:close	()V
    //   51: iconst_1
    //   52: ireturn
    //   53: astore 4
    //   55: aconst_null
    //   56: astore_2
    //   57: aconst_null
    //   58: astore_3
    //   59: ldc 20
    //   61: ldc 84
    //   63: iconst_4
    //   64: anewarray 4	java/lang/Object
    //   67: dup
    //   68: iconst_0
    //   69: aload 4
    //   71: invokevirtual 88	java/lang/Object:getClass	()Ljava/lang/Class;
    //   74: invokevirtual 94	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   77: aastore
    //   78: dup
    //   79: iconst_1
    //   80: aload 4
    //   82: invokevirtual 97	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   85: aastore
    //   86: dup
    //   87: iconst_2
    //   88: aload_0
    //   89: aastore
    //   90: dup
    //   91: iconst_3
    //   92: aload_1
    //   93: aastore
    //   94: invokestatic 28	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   97: invokestatic 100	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   100: aload_3
    //   101: ifnull +7 -> 108
    //   104: aload_3
    //   105: invokevirtual 82	java/nio/channels/FileChannel:close	()V
    //   108: aload_2
    //   109: ifnull +7 -> 116
    //   112: aload_2
    //   113: invokevirtual 82	java/nio/channels/FileChannel:close	()V
    //   116: iconst_0
    //   117: ireturn
    //   118: astore_0
    //   119: aconst_null
    //   120: astore_2
    //   121: aconst_null
    //   122: astore_3
    //   123: aload_3
    //   124: ifnull +7 -> 131
    //   127: aload_3
    //   128: invokevirtual 82	java/nio/channels/FileChannel:close	()V
    //   131: aload_2
    //   132: ifnull +7 -> 139
    //   135: aload_2
    //   136: invokevirtual 82	java/nio/channels/FileChannel:close	()V
    //   139: aload_0
    //   140: athrow
    //   141: astore_0
    //   142: goto -99 -> 43
    //   145: astore_0
    //   146: goto -95 -> 51
    //   149: astore_0
    //   150: goto -42 -> 108
    //   153: astore_0
    //   154: goto -38 -> 116
    //   157: astore_1
    //   158: goto -27 -> 131
    //   161: astore_1
    //   162: goto -23 -> 139
    //   165: astore_0
    //   166: aconst_null
    //   167: astore_1
    //   168: aload_2
    //   169: astore_3
    //   170: aload_1
    //   171: astore_2
    //   172: goto -49 -> 123
    //   175: astore_0
    //   176: aload_3
    //   177: astore_1
    //   178: aload_2
    //   179: astore_3
    //   180: aload_1
    //   181: astore_2
    //   182: goto -59 -> 123
    //   185: astore_0
    //   186: goto -63 -> 123
    //   189: astore 4
    //   191: aconst_null
    //   192: astore 5
    //   194: aload_2
    //   195: astore_3
    //   196: aload 5
    //   198: astore_2
    //   199: goto -140 -> 59
    //   202: astore 4
    //   204: aload_3
    //   205: astore 5
    //   207: aload_2
    //   208: astore_3
    //   209: aload 5
    //   211: astore_2
    //   212: goto -153 -> 59
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	215	0	paramString1	String
    //   0	215	1	paramString2	String
    //   11	201	2	localObject1	Object
    //   23	186	3	localObject2	Object
    //   53	28	4	localException1	Exception
    //   189	1	4	localException2	Exception
    //   202	1	4	localException3	Exception
    //   192	18	5	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   0	12	53	java/lang/Exception
    //   0	12	118	finally
    //   39	43	141	java/io/IOException
    //   47	51	145	java/io/IOException
    //   104	108	149	java/io/IOException
    //   112	116	153	java/io/IOException
    //   127	131	157	java/io/IOException
    //   135	139	161	java/io/IOException
    //   12	24	165	finally
    //   24	35	175	finally
    //   59	100	185	finally
    //   12	24	189	java/lang/Exception
    //   24	35	202	java/lang/Exception
  }
  
  public static boolean gv(String paramString1, String paramString2)
  {
    Object localObject = new File(paramString2);
    if ((!((File)localObject).isDirectory()) || (!((File)localObject).exists())) {
      ((File)localObject).mkdirs();
    }
    localObject = new File(paramString1).listFiles();
    int i = 0;
    while (i < localObject.length)
    {
      if ((localObject[i].isFile()) && (!o(localObject[i], new File(new File(paramString2).getAbsolutePath() + File.separator + localObject[i].getName())))) {}
      while ((localObject[i].isDirectory()) && (gv(paramString1 + "/" + localObject[i].getName(), paramString2 + "/" + localObject[i].getName()))) {
        return false;
      }
      i += 1;
    }
    return true;
  }
  
  private static boolean o(File paramFile1, File paramFile2)
  {
    BufferedInputStream localBufferedInputStream;
    BufferedOutputStream localBufferedOutputStream;
    try
    {
      paramFile1 = new FileInputStream(paramFile1);
      localBufferedInputStream = new BufferedInputStream(paramFile1);
      paramFile2 = new FileOutputStream(paramFile2);
      localBufferedOutputStream = new BufferedOutputStream(paramFile2);
      byte[] arrayOfByte = new byte['᐀'];
      for (;;)
      {
        int i = localBufferedInputStream.read(arrayOfByte);
        if (i == -1) {
          break;
        }
        localBufferedOutputStream.write(arrayOfByte, 0, i);
      }
      localBufferedOutputStream.flush();
    }
    catch (Exception paramFile1)
    {
      Log.e("FileUtils", "copyFile error:" + paramFile1.getMessage());
      return false;
    }
    localBufferedInputStream.close();
    localBufferedOutputStream.close();
    paramFile2.close();
    paramFile1.close();
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/xweb/util/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */