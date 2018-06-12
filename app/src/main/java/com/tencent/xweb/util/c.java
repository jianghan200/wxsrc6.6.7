package com.tencent.xweb.util;

import java.io.File;
import java.io.InputStream;
import java.security.MessageDigest;

public final class c
{
  private static String b(InputStream paramInputStream, int paramInt)
  {
    int i = 0;
    if (paramInt <= 0) {
      return null;
    }
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      StringBuilder localStringBuilder = new StringBuilder(32);
      byte[] arrayOfByte = new byte[paramInt];
      for (;;)
      {
        paramInt = paramInputStream.read(arrayOfByte);
        if (paramInt == -1) {
          break;
        }
        localMessageDigest.update(arrayOfByte, 0, paramInt);
      }
      paramInputStream = localMessageDigest.digest();
      paramInt = i;
      while (paramInt < paramInputStream.length)
      {
        localStringBuilder.append(Integer.toString((paramInputStream[paramInt] & 0xFF) + 256, 16).substring(1));
        paramInt += 1;
      }
      paramInputStream = localStringBuilder.toString();
      return paramInputStream;
    }
    catch (Exception paramInputStream) {}
    return null;
  }
  
  public static boolean gw(String paramString1, String paramString2)
  {
    if (paramString1 != null)
    {
      paramString1 = new File(paramString1);
      if (!paramString1.exists()) {}
    }
    for (paramString1 = m(paramString1); (paramString1 != null) && (paramString2 != null) && (paramString2.equalsIgnoreCase(paramString1)); paramString1 = null) {
      return true;
    }
    return false;
  }
  
  /* Error */
  public static String m(File paramFile)
  {
    // Byte code:
    //   0: ldc2_w 78
    //   3: lstore_1
    //   4: aload_0
    //   5: invokevirtual 67	java/io/File:exists	()Z
    //   8: ifne +5 -> 13
    //   11: aconst_null
    //   12: areturn
    //   13: new 81	java/io/FileInputStream
    //   16: dup
    //   17: aload_0
    //   18: invokespecial 84	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   21: astore_3
    //   22: ldc2_w 78
    //   25: aload_0
    //   26: invokevirtual 88	java/io/File:length	()J
    //   29: lcmp
    //   30: ifgt +20 -> 50
    //   33: aload_3
    //   34: lload_1
    //   35: l2i
    //   36: invokestatic 90	com/tencent/xweb/util/c:b	(Ljava/io/InputStream;I)Ljava/lang/String;
    //   39: astore_0
    //   40: aload_3
    //   41: invokevirtual 94	java/io/FileInputStream:close	()V
    //   44: aload_3
    //   45: invokevirtual 94	java/io/FileInputStream:close	()V
    //   48: aload_0
    //   49: areturn
    //   50: aload_0
    //   51: invokevirtual 88	java/io/File:length	()J
    //   54: lstore_1
    //   55: goto -22 -> 33
    //   58: astore_0
    //   59: aconst_null
    //   60: astore_0
    //   61: aload_0
    //   62: ifnull -51 -> 11
    //   65: aload_0
    //   66: invokevirtual 94	java/io/FileInputStream:close	()V
    //   69: aconst_null
    //   70: areturn
    //   71: astore_0
    //   72: aconst_null
    //   73: areturn
    //   74: astore_0
    //   75: aconst_null
    //   76: astore_3
    //   77: aload_3
    //   78: ifnull +7 -> 85
    //   81: aload_3
    //   82: invokevirtual 94	java/io/FileInputStream:close	()V
    //   85: aload_0
    //   86: athrow
    //   87: astore_3
    //   88: goto -40 -> 48
    //   91: astore_3
    //   92: goto -7 -> 85
    //   95: astore_0
    //   96: goto -19 -> 77
    //   99: astore_0
    //   100: aload_3
    //   101: astore_0
    //   102: goto -41 -> 61
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	paramFile	File
    //   3	52	1	l	long
    //   21	61	3	localFileInputStream	java.io.FileInputStream
    //   87	1	3	localIOException1	java.io.IOException
    //   91	10	3	localIOException2	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   13	22	58	java/lang/Exception
    //   65	69	71	java/io/IOException
    //   13	22	74	finally
    //   44	48	87	java/io/IOException
    //   81	85	91	java/io/IOException
    //   22	33	95	finally
    //   33	44	95	finally
    //   50	55	95	finally
    //   22	33	99	java/lang/Exception
    //   33	44	99	java/lang/Exception
    //   50	55	99	java/lang/Exception
  }
  
  public static final String u(byte[] paramArrayOfByte)
  {
    char[] arrayOfChar = new char[16];
    char[] tmp8_6 = arrayOfChar;
    tmp8_6[0] = 48;
    char[] tmp13_8 = tmp8_6;
    tmp13_8[1] = 49;
    char[] tmp18_13 = tmp13_8;
    tmp18_13[2] = 50;
    char[] tmp23_18 = tmp18_13;
    tmp23_18[3] = 51;
    char[] tmp28_23 = tmp23_18;
    tmp28_23[4] = 52;
    char[] tmp33_28 = tmp28_23;
    tmp33_28[5] = 53;
    char[] tmp38_33 = tmp33_28;
    tmp38_33[6] = 54;
    char[] tmp44_38 = tmp38_33;
    tmp44_38[7] = 55;
    char[] tmp50_44 = tmp44_38;
    tmp50_44[8] = 56;
    char[] tmp56_50 = tmp50_44;
    tmp56_50[9] = 57;
    char[] tmp62_56 = tmp56_50;
    tmp62_56[10] = 97;
    char[] tmp68_62 = tmp62_56;
    tmp68_62[11] = 98;
    char[] tmp74_68 = tmp68_62;
    tmp74_68[12] = 99;
    char[] tmp80_74 = tmp74_68;
    tmp80_74[13] = 100;
    char[] tmp86_80 = tmp80_74;
    tmp86_80[14] = 101;
    char[] tmp92_86 = tmp86_80;
    tmp92_86[15] = 102;
    tmp92_86;
    for (;;)
    {
      Object localObject;
      int k;
      int i;
      int j;
      try
      {
        localObject = MessageDigest.getInstance("MD5");
        ((MessageDigest)localObject).update(paramArrayOfByte);
        paramArrayOfByte = ((MessageDigest)localObject).digest();
        k = paramArrayOfByte.length;
        localObject = new char[k * 2];
        i = 0;
        j = 0;
      }
      catch (Exception paramArrayOfByte)
      {
        return null;
      }
      paramArrayOfByte = new String((char[])localObject);
      return paramArrayOfByte;
      while (i < k)
      {
        int n = paramArrayOfByte[i];
        int m = j + 1;
        localObject[j] = arrayOfChar[(n >>> 4 & 0xF)];
        localObject[m] = arrayOfChar[(n & 0xF)];
        i += 1;
        j = m + 1;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/xweb/util/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */