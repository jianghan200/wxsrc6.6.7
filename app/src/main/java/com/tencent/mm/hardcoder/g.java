package com.tencent.mm.hardcoder;

public final class g
{
  /* Error */
  public static void a(java.io.InputStream paramInputStream, a parama)
  {
    // Byte code:
    //   0: new 12	java/io/BufferedReader
    //   3: dup
    //   4: new 14	java/io/InputStreamReader
    //   7: dup
    //   8: aload_0
    //   9: invokespecial 18	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   12: invokespecial 21	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   15: astore_3
    //   16: aload_3
    //   17: astore_0
    //   18: aload_3
    //   19: invokevirtual 25	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   22: astore 4
    //   24: aload 4
    //   26: ifnull +18 -> 44
    //   29: aload_3
    //   30: astore_0
    //   31: aload_1
    //   32: aload 4
    //   34: invokeinterface 29 2 0
    //   39: istore_2
    //   40: iload_2
    //   41: ifne -25 -> 16
    //   44: aload_3
    //   45: invokevirtual 33	java/io/BufferedReader:close	()V
    //   48: return
    //   49: astore_0
    //   50: ldc 35
    //   52: new 37	java/lang/StringBuilder
    //   55: dup
    //   56: ldc 39
    //   58: invokespecial 42	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   61: aload_0
    //   62: invokevirtual 45	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   65: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   71: invokestatic 58	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   74: return
    //   75: astore 4
    //   77: aconst_null
    //   78: astore_1
    //   79: aload_1
    //   80: astore_0
    //   81: ldc 35
    //   83: new 37	java/lang/StringBuilder
    //   86: dup
    //   87: ldc 39
    //   89: invokespecial 42	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   92: aload 4
    //   94: invokevirtual 45	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   97: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   103: invokestatic 58	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   106: aload_1
    //   107: ifnull -59 -> 48
    //   110: aload_1
    //   111: invokevirtual 33	java/io/BufferedReader:close	()V
    //   114: return
    //   115: astore_0
    //   116: ldc 35
    //   118: new 37	java/lang/StringBuilder
    //   121: dup
    //   122: ldc 39
    //   124: invokespecial 42	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   127: aload_0
    //   128: invokevirtual 45	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   131: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   137: invokestatic 58	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   140: return
    //   141: astore_1
    //   142: aconst_null
    //   143: astore_0
    //   144: aload_0
    //   145: ifnull +7 -> 152
    //   148: aload_0
    //   149: invokevirtual 33	java/io/BufferedReader:close	()V
    //   152: aload_1
    //   153: athrow
    //   154: astore_0
    //   155: ldc 35
    //   157: new 37	java/lang/StringBuilder
    //   160: dup
    //   161: ldc 39
    //   163: invokespecial 42	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   166: aload_0
    //   167: invokevirtual 45	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   170: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   176: invokestatic 58	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   179: goto -27 -> 152
    //   182: astore_1
    //   183: goto -39 -> 144
    //   186: astore 4
    //   188: aload_3
    //   189: astore_1
    //   190: goto -111 -> 79
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	193	0	paramInputStream	java.io.InputStream
    //   0	193	1	parama	a
    //   39	2	2	bool	boolean
    //   15	174	3	localBufferedReader	java.io.BufferedReader
    //   22	11	4	str	String
    //   75	18	4	localException1	Exception
    //   186	1	4	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   44	48	49	java/lang/Exception
    //   0	16	75	java/lang/Exception
    //   110	114	115	java/lang/Exception
    //   0	16	141	finally
    //   148	152	154	java/lang/Exception
    //   18	24	182	finally
    //   31	40	182	finally
    //   81	106	182	finally
    //   18	24	186	java/lang/Exception
    //   31	40	186	java/lang/Exception
  }
  
  public static abstract interface a
  {
    public abstract boolean fx(String paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/hardcoder/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */