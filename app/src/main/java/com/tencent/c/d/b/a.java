package com.tencent.c.d.b;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class a
{
  private static final byte[] vjr = { 127, 69, 76, 70 };
  
  public static boolean aco(String paramString)
  {
    byte[] arrayOfByte = new byte[vjr.length];
    try
    {
      localFileInputStream = new FileInputStream(paramString);
      try
      {
        if (localFileInputStream.read(arrayOfByte, 0, vjr.length) == arrayOfByte.length) {
          break label70;
        }
        throw new IOException("Read bytes less than " + arrayOfByte.length);
      }
      finally {}
    }
    finally
    {
      for (;;)
      {
        int i;
        FileInputStream localFileInputStream = null;
      }
    }
    b.b(localFileInputStream);
    throw paramString;
    label70:
    i = 0;
    while (i < vjr.length)
    {
      int j = vjr[i];
      int k = arrayOfByte[i];
      if (j != k)
      {
        b.b(localFileInputStream);
        return false;
      }
      i += 1;
    }
    b.b(localFileInputStream);
    return true;
  }
  
  /* Error */
  public static byte[] acq(String paramString)
  {
    // Byte code:
    //   0: new 19	java/io/FileInputStream
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 23	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   8: astore_2
    //   9: new 55	java/io/ByteArrayOutputStream
    //   12: dup
    //   13: aload_2
    //   14: invokevirtual 59	java/io/FileInputStream:available	()I
    //   17: invokespecial 62	java/io/ByteArrayOutputStream:<init>	(I)V
    //   20: astore_1
    //   21: aload_2
    //   22: aload_1
    //   23: invokestatic 66	com/tencent/c/d/b/b:f	(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    //   26: pop2
    //   27: aload_1
    //   28: invokevirtual 70	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   31: astore_0
    //   32: aload_0
    //   33: ifnull +13 -> 46
    //   36: aload_2
    //   37: invokestatic 51	com/tencent/c/d/b/b:b	(Ljava/io/Closeable;)V
    //   40: aload_1
    //   41: invokestatic 51	com/tencent/c/d/b/b:b	(Ljava/io/Closeable;)V
    //   44: aload_0
    //   45: areturn
    //   46: ldc 72
    //   48: invokevirtual 77	java/lang/String:getBytes	()[B
    //   51: astore_0
    //   52: goto -16 -> 36
    //   55: astore_0
    //   56: aconst_null
    //   57: astore_1
    //   58: aconst_null
    //   59: astore_2
    //   60: aload_2
    //   61: invokestatic 51	com/tencent/c/d/b/b:b	(Ljava/io/Closeable;)V
    //   64: aload_1
    //   65: invokestatic 51	com/tencent/c/d/b/b:b	(Ljava/io/Closeable;)V
    //   68: aload_0
    //   69: athrow
    //   70: astore_0
    //   71: aconst_null
    //   72: astore_1
    //   73: goto -13 -> 60
    //   76: astore_0
    //   77: goto -17 -> 60
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	80	0	paramString	String
    //   20	53	1	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   8	53	2	localFileInputStream	FileInputStream
    // Exception table:
    //   from	to	target	type
    //   0	9	55	finally
    //   9	21	70	finally
    //   21	32	76	finally
    //   46	52	76	finally
  }
  
  /* Error */
  public static byte[] dB(String paramString, int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: new 83	java/io/File
    //   5: dup
    //   6: aload_0
    //   7: invokespecial 84	java/io/File:<init>	(Ljava/lang/String;)V
    //   10: astore_0
    //   11: aload_0
    //   12: invokevirtual 88	java/io/File:exists	()Z
    //   15: ifne +5 -> 20
    //   18: aconst_null
    //   19: areturn
    //   20: new 19	java/io/FileInputStream
    //   23: dup
    //   24: aload_0
    //   25: invokespecial 91	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   28: astore_0
    //   29: iload_1
    //   30: newarray <illegal type>
    //   32: astore 5
    //   34: aload_0
    //   35: aload 5
    //   37: iload_2
    //   38: iload_1
    //   39: iload_2
    //   40: isub
    //   41: invokevirtual 92	java/io/FileInputStream:read	([BII)I
    //   44: istore 4
    //   46: iload_2
    //   47: istore_3
    //   48: iload 4
    //   50: iconst_m1
    //   51: if_icmpeq +15 -> 66
    //   54: iload_2
    //   55: iload 4
    //   57: iadd
    //   58: istore_3
    //   59: iload_3
    //   60: istore_2
    //   61: iload_3
    //   62: iload_1
    //   63: if_icmplt -29 -> 34
    //   66: iload_3
    //   67: ifne +9 -> 76
    //   70: aload_0
    //   71: invokestatic 51	com/tencent/c/d/b/b:b	(Ljava/io/Closeable;)V
    //   74: aconst_null
    //   75: areturn
    //   76: iload_3
    //   77: iload_1
    //   78: if_icmpge +59 -> 137
    //   81: iload_3
    //   82: newarray <illegal type>
    //   84: astore 6
    //   86: aload 5
    //   88: iconst_0
    //   89: aload 6
    //   91: iconst_0
    //   92: iload_3
    //   93: invokestatic 98	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   96: aload 6
    //   98: astore 5
    //   100: aload_0
    //   101: invokestatic 51	com/tencent/c/d/b/b:b	(Ljava/io/Closeable;)V
    //   104: aload 5
    //   106: areturn
    //   107: astore_0
    //   108: aconst_null
    //   109: astore_0
    //   110: aload_0
    //   111: invokestatic 51	com/tencent/c/d/b/b:b	(Ljava/io/Closeable;)V
    //   114: aconst_null
    //   115: areturn
    //   116: astore 5
    //   118: aconst_null
    //   119: astore_0
    //   120: aload_0
    //   121: invokestatic 51	com/tencent/c/d/b/b:b	(Ljava/io/Closeable;)V
    //   124: aload 5
    //   126: athrow
    //   127: astore 5
    //   129: goto -9 -> 120
    //   132: astore 5
    //   134: goto -24 -> 110
    //   137: goto -37 -> 100
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	140	0	paramString	String
    //   0	140	1	paramInt	int
    //   1	60	2	i	int
    //   47	46	3	j	int
    //   44	14	4	k	int
    //   32	73	5	localObject1	Object
    //   116	9	5	localObject2	Object
    //   127	1	5	localObject3	Object
    //   132	1	5	localThrowable	Throwable
    //   84	13	6	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   20	29	107	java/lang/Throwable
    //   20	29	116	finally
    //   29	34	127	finally
    //   34	46	127	finally
    //   81	96	127	finally
    //   29	34	132	java/lang/Throwable
    //   34	46	132	java/lang/Throwable
    //   81	96	132	java/lang/Throwable
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/c/d/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */