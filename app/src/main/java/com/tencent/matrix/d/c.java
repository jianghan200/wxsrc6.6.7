package com.tencent.matrix.d;

import android.content.Context;
import android.os.Looper;
import java.io.Closeable;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class c
{
  private static char[] buX = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  private static final ThreadLocal<MessageDigest> buY = new ThreadLocal()
  {
    private static MessageDigest tK()
    {
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
        return localMessageDigest;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        throw new RuntimeException("Initialize MD5 failed.", localNoSuchAlgorithmException);
      }
    }
  };
  private static String processName = null;
  
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
    //   0: invokestatic 54	android/os/Process:myPid	()I
    //   3: istore_1
    //   4: aload_0
    //   5: ifnull +7 -> 12
    //   8: iload_1
    //   9: ifgt +6 -> 15
    //   12: ldc 56
    //   14: areturn
    //   15: aload_0
    //   16: ldc 58
    //   18: invokevirtual 64	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   21: checkcast 66	android/app/ActivityManager
    //   24: astore_0
    //   25: aload_0
    //   26: ifnull +88 -> 114
    //   29: aload_0
    //   30: invokevirtual 70	android/app/ActivityManager:getRunningAppProcesses	()Ljava/util/List;
    //   33: astore_0
    //   34: aload_0
    //   35: ifnull +79 -> 114
    //   38: aload_0
    //   39: invokeinterface 76 1 0
    //   44: astore 4
    //   46: aload 4
    //   48: invokeinterface 82 1 0
    //   53: ifeq +33 -> 86
    //   56: aload 4
    //   58: invokeinterface 86 1 0
    //   63: checkcast 88	android/app/ActivityManager$RunningAppProcessInfo
    //   66: astore_0
    //   67: aload_0
    //   68: getfield 92	android/app/ActivityManager$RunningAppProcessInfo:pid	I
    //   71: istore_2
    //   72: iload_2
    //   73: iload_1
    //   74: if_icmpne -28 -> 46
    //   77: aload_0
    //   78: ifnull +36 -> 114
    //   81: aload_0
    //   82: getfield 93	android/app/ActivityManager$RunningAppProcessInfo:processName	Ljava/lang/String;
    //   85: areturn
    //   86: aconst_null
    //   87: astore_0
    //   88: goto -11 -> 77
    //   91: astore_0
    //   92: new 95	java/lang/StringBuilder
    //   95: dup
    //   96: ldc 97
    //   98: invokespecial 100	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   101: aload_0
    //   102: invokevirtual 104	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   105: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: pop
    //   109: aconst_null
    //   110: astore_0
    //   111: goto -34 -> 77
    //   114: sipush 128
    //   117: newarray <illegal type>
    //   119: astore 5
    //   121: new 110	java/io/FileInputStream
    //   124: dup
    //   125: new 95	java/lang/StringBuilder
    //   128: dup
    //   129: ldc 112
    //   131: invokespecial 100	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   134: iload_1
    //   135: invokevirtual 115	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   138: ldc 117
    //   140: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   146: invokespecial 121	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   149: astore 4
    //   151: aload 4
    //   153: astore_0
    //   154: aload 4
    //   156: aload 5
    //   158: invokevirtual 125	java/io/FileInputStream:read	([B)I
    //   161: istore_3
    //   162: iload_3
    //   163: ifle +48 -> 211
    //   166: iconst_0
    //   167: istore_1
    //   168: goto +127 -> 295
    //   171: aload 4
    //   173: astore_0
    //   174: new 127	java/lang/String
    //   177: dup
    //   178: aload 5
    //   180: iconst_0
    //   181: iload_2
    //   182: ldc -127
    //   184: invokestatic 135	java/nio/charset/Charset:forName	(Ljava/lang/String;)Ljava/nio/charset/Charset;
    //   187: invokespecial 138	java/lang/String:<init>	([BIILjava/nio/charset/Charset;)V
    //   190: astore 5
    //   192: aload 4
    //   194: invokevirtual 141	java/io/FileInputStream:close	()V
    //   197: aload 5
    //   199: areturn
    //   200: astore_0
    //   201: aload 5
    //   203: areturn
    //   204: iload_1
    //   205: iconst_1
    //   206: iadd
    //   207: istore_1
    //   208: goto +87 -> 295
    //   211: aload 4
    //   213: invokevirtual 141	java/io/FileInputStream:close	()V
    //   216: ldc 56
    //   218: areturn
    //   219: astore 5
    //   221: aconst_null
    //   222: astore 4
    //   224: aload 4
    //   226: astore_0
    //   227: new 95	java/lang/StringBuilder
    //   230: dup
    //   231: ldc 97
    //   233: invokespecial 100	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   236: aload 5
    //   238: invokevirtual 104	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   241: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   244: pop
    //   245: aload 4
    //   247: ifnull -31 -> 216
    //   250: aload 4
    //   252: invokevirtual 141	java/io/FileInputStream:close	()V
    //   255: goto -39 -> 216
    //   258: astore_0
    //   259: goto -43 -> 216
    //   262: astore 4
    //   264: aconst_null
    //   265: astore_0
    //   266: aload_0
    //   267: ifnull +7 -> 274
    //   270: aload_0
    //   271: invokevirtual 141	java/io/FileInputStream:close	()V
    //   274: aload 4
    //   276: athrow
    //   277: astore_0
    //   278: goto -62 -> 216
    //   281: astore_0
    //   282: goto -8 -> 274
    //   285: astore 4
    //   287: goto -21 -> 266
    //   290: astore 5
    //   292: goto -68 -> 224
    //   295: iload_3
    //   296: istore_2
    //   297: iload_1
    //   298: iload_3
    //   299: if_icmpge -128 -> 171
    //   302: aload 5
    //   304: iload_1
    //   305: baload
    //   306: ifgt -102 -> 204
    //   309: iload_1
    //   310: istore_2
    //   311: goto -140 -> 171
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	314	0	paramContext	Context
    //   3	307	1	i	int
    //   71	240	2	j	int
    //   161	139	3	k	int
    //   44	207	4	localObject1	Object
    //   262	13	4	localObject2	Object
    //   285	1	4	localObject3	Object
    //   119	83	5	localObject4	Object
    //   219	18	5	localException1	Exception
    //   290	13	5	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   38	46	91	java/lang/Exception
    //   46	72	91	java/lang/Exception
    //   192	197	200	java/lang/Exception
    //   121	151	219	java/lang/Exception
    //   250	255	258	java/lang/Exception
    //   121	151	262	finally
    //   211	216	277	java/lang/Exception
    //   270	274	281	java/lang/Exception
    //   154	162	285	finally
    //   174	192	285	finally
    //   227	245	285	finally
    //   154	162	290	java/lang/Exception
    //   174	192	290	java/lang/Exception
  }
  
  public static boolean aj(long paramLong)
  {
    return Looper.getMainLooper().getThread().getId() == paramLong;
  }
  
  public static void b(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException paramCloseable) {}
  }
  
  public static String ce(String paramString)
  {
    paramString = paramString.getBytes();
    paramString = ((MessageDigest)buY.get()).digest(paramString);
    int j = paramString.length;
    StringBuffer localStringBuffer = new StringBuffer(j * 2);
    int i = 0;
    while (i < j + 0)
    {
      int k = paramString[i];
      char c1 = buX[((k & 0xF0) >> 4)];
      char c2 = buX[(k & 0xF)];
      localStringBuffer.append(c1);
      localStringBuffer.append(c2);
      i += 1;
    }
    return localStringBuffer.toString();
  }
  
  public static String h(String paramString, long paramLong)
  {
    return new SimpleDateFormat(paramString).format(new Date(paramLong));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */