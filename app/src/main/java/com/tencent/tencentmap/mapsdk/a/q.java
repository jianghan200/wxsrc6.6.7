package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Stack;

public class q
{
  /* Error */
  public static int a(byte[] paramArrayOfByte, File paramFile, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +19 -> 20
    //   4: aload_0
    //   5: arraylength
    //   6: ifeq +14 -> 20
    //   9: aload_1
    //   10: ifnull +10 -> 20
    //   13: aload_1
    //   14: invokevirtual 14	java/io/File:isDirectory	()Z
    //   17: ifeq +5 -> 22
    //   20: iconst_0
    //   21: ireturn
    //   22: aconst_null
    //   23: astore 5
    //   25: aconst_null
    //   26: astore 4
    //   28: aload_1
    //   29: invokevirtual 17	java/io/File:exists	()Z
    //   32: ifne +8 -> 40
    //   35: aload_1
    //   36: invokevirtual 20	java/io/File:createNewFile	()Z
    //   39: pop
    //   40: new 22	java/io/FileOutputStream
    //   43: dup
    //   44: aload_1
    //   45: iload_2
    //   46: invokespecial 26	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   49: astore_1
    //   50: aload_1
    //   51: aload_0
    //   52: invokevirtual 30	java/io/FileOutputStream:write	([B)V
    //   55: aload_1
    //   56: invokevirtual 34	java/io/FileOutputStream:flush	()V
    //   59: aload_0
    //   60: arraylength
    //   61: istore_3
    //   62: aload_1
    //   63: invokestatic 37	com/tencent/tencentmap/mapsdk/a/q:a	(Ljava/io/Closeable;)V
    //   66: iload_3
    //   67: ireturn
    //   68: astore_0
    //   69: aload 4
    //   71: astore_0
    //   72: aload_0
    //   73: invokestatic 37	com/tencent/tencentmap/mapsdk/a/q:a	(Ljava/io/Closeable;)V
    //   76: iconst_0
    //   77: ireturn
    //   78: astore_0
    //   79: aload 5
    //   81: astore_1
    //   82: aload_1
    //   83: invokestatic 37	com/tencent/tencentmap/mapsdk/a/q:a	(Ljava/io/Closeable;)V
    //   86: aload_0
    //   87: athrow
    //   88: astore_0
    //   89: goto -7 -> 82
    //   92: astore_0
    //   93: aload_1
    //   94: astore_0
    //   95: goto -23 -> 72
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	paramArrayOfByte	byte[]
    //   0	98	1	paramFile	File
    //   0	98	2	paramBoolean	boolean
    //   61	6	3	i	int
    //   26	44	4	localObject1	Object
    //   23	57	5	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   28	40	68	java/io/IOException
    //   40	50	68	java/io/IOException
    //   28	40	78	finally
    //   40	50	78	finally
    //   50	62	88	finally
    //   50	62	92	java/io/IOException
  }
  
  public static int a(byte[] paramArrayOfByte, String paramString, boolean paramBoolean)
  {
    if (TextUtils.isEmpty(paramString)) {
      return 0;
    }
    return a(paramArrayOfByte, new File(paramString), paramBoolean);
  }
  
  public static final long a(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    long l2;
    if ((paramInputStream == null) || (paramOutputStream == null)) {
      l2 = -1L;
    }
    for (;;)
    {
      return l2;
      try
      {
        byte[] arrayOfByte = new byte['က'];
        int i;
        for (long l1 = 0L;; l1 += i)
        {
          i = paramInputStream.read(arrayOfByte);
          l2 = l1;
          if (i <= 0) {
            break;
          }
          paramOutputStream.write(arrayOfByte, 0, i);
        }
        return -1L;
      }
      catch (IOException paramInputStream) {}
    }
  }
  
  public static void a(Bitmap paramBitmap)
  {
    if ((paramBitmap != null) && (!paramBitmap.isRecycled())) {
      paramBitmap.recycle();
    }
  }
  
  public static final void a(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException paramCloseable) {}
  }
  
  public static boolean a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    try
    {
      paramString = new File(paramString);
      if ((paramString.exists()) && (paramString.isDirectory())) {
        return true;
      }
      if ((paramString.exists()) && (paramString.isFile())) {
        paramString.delete();
      }
      boolean bool = paramString.mkdirs();
      return bool;
    }
    catch (Exception paramString) {}
    return false;
  }
  
  /* Error */
  public static final byte[] a(InputStream paramInputStream)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: new 95	java/io/ByteArrayOutputStream
    //   9: dup
    //   10: invokespecial 97	java/io/ByteArrayOutputStream:<init>	()V
    //   13: astore_2
    //   14: sipush 4096
    //   17: newarray <illegal type>
    //   19: astore_3
    //   20: aload_0
    //   21: aload_3
    //   22: iconst_0
    //   23: sipush 4096
    //   26: invokevirtual 100	java/io/InputStream:read	([BII)I
    //   29: istore_1
    //   30: iload_1
    //   31: iconst_m1
    //   32: if_icmpeq +20 -> 52
    //   35: aload_2
    //   36: aload_3
    //   37: iconst_0
    //   38: iload_1
    //   39: invokevirtual 101	java/io/ByteArrayOutputStream:write	([BII)V
    //   42: goto -22 -> 20
    //   45: astore_0
    //   46: aload_2
    //   47: invokestatic 37	com/tencent/tencentmap/mapsdk/a/q:a	(Ljava/io/Closeable;)V
    //   50: aconst_null
    //   51: areturn
    //   52: aload_2
    //   53: invokevirtual 102	java/io/ByteArrayOutputStream:flush	()V
    //   56: aload_2
    //   57: invokevirtual 106	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   60: astore_0
    //   61: aload_2
    //   62: invokestatic 37	com/tencent/tencentmap/mapsdk/a/q:a	(Ljava/io/Closeable;)V
    //   65: aload_0
    //   66: areturn
    //   67: astore_0
    //   68: aconst_null
    //   69: astore_2
    //   70: aload_2
    //   71: invokestatic 37	com/tencent/tencentmap/mapsdk/a/q:a	(Ljava/io/Closeable;)V
    //   74: aload_0
    //   75: athrow
    //   76: astore_0
    //   77: goto -7 -> 70
    //   80: astore_0
    //   81: aconst_null
    //   82: astore_2
    //   83: goto -37 -> 46
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	paramInputStream	InputStream
    //   29	10	1	i	int
    //   13	70	2	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   19	18	3	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   14	20	45	java/lang/Throwable
    //   20	30	45	java/lang/Throwable
    //   35	42	45	java/lang/Throwable
    //   52	61	45	java/lang/Throwable
    //   6	14	67	finally
    //   14	20	76	finally
    //   20	30	76	finally
    //   35	42	76	finally
    //   52	61	76	finally
    //   6	14	80	java/lang/Throwable
  }
  
  public static final InputStream b(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      return null;
      try
      {
        paramString = new File(paramString);
        if ((paramString.exists()) && (paramString.isFile()) && (paramString.canRead()))
        {
          paramString = new FileInputStream(paramString);
          return paramString;
        }
      }
      catch (IOException paramString) {}
    }
    return null;
  }
  
  public static boolean c(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    Stack localStack = new Stack();
    localStack.push(paramString);
    while (!localStack.isEmpty())
    {
      File localFile = new File((String)localStack.peek());
      if (localFile.exists())
      {
        if (localFile.isDirectory())
        {
          paramString = localFile.listFiles();
          if ((paramString == null) || (paramString.length == 0))
          {
            localFile.delete();
            localStack.pop();
          }
          else
          {
            int j = paramString.length;
            int i = 0;
            label96:
            if (i < j)
            {
              localFile = paramString[i];
              if (!localFile.isDirectory()) {
                break label131;
              }
              localStack.push(localFile.getAbsolutePath());
            }
            for (;;)
            {
              i += 1;
              break label96;
              break;
              label131:
              localFile.delete();
            }
          }
        }
        else
        {
          localFile.delete();
          localStack.pop();
        }
      }
      else {
        localStack.pop();
      }
    }
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */