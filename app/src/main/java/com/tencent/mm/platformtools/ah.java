package com.tencent.mm.platformtools;

public final class ah
{
  public final int action;
  public final int bJL;
  public final String content;
  public final int errorCode;
  public final int eyp;
  public final String title;
  public final int type;
  public final String url;
  
  /* Error */
  public ah(int paramInt1, int paramInt2, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 21	java/lang/Object:<init>	()V
    //   4: ldc 23
    //   6: astore 10
    //   8: iconst_5
    //   9: istore 4
    //   11: aload_3
    //   12: ldc 25
    //   14: invokestatic 31	com/tencent/mm/sdk/platformtools/bl:z	(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    //   17: astore 9
    //   19: aload 9
    //   21: ifnonnull +88 -> 109
    //   24: new 33	java/lang/IllegalArgumentException
    //   27: dup
    //   28: ldc 35
    //   30: invokespecial 38	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   33: athrow
    //   34: astore 9
    //   36: ldc 23
    //   38: astore 8
    //   40: ldc 23
    //   42: astore_3
    //   43: iconst_0
    //   44: istore 5
    //   46: iconst_0
    //   47: istore 6
    //   49: ldc 40
    //   51: aload 9
    //   53: invokevirtual 44	java/lang/Exception:toString	()Ljava/lang/String;
    //   56: invokestatic 49	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   59: aload 10
    //   61: astore 9
    //   63: aload_0
    //   64: iload_2
    //   65: putfield 51	com/tencent/mm/platformtools/ah:errorCode	I
    //   68: aload_0
    //   69: iload_1
    //   70: putfield 53	com/tencent/mm/platformtools/ah:bJL	I
    //   73: aload_0
    //   74: iload 6
    //   76: putfield 55	com/tencent/mm/platformtools/ah:type	I
    //   79: aload_0
    //   80: iload 5
    //   82: putfield 57	com/tencent/mm/platformtools/ah:action	I
    //   85: aload_0
    //   86: aload 9
    //   88: putfield 59	com/tencent/mm/platformtools/ah:content	Ljava/lang/String;
    //   91: aload_0
    //   92: iload 4
    //   94: putfield 61	com/tencent/mm/platformtools/ah:eyp	I
    //   97: aload_0
    //   98: aload 8
    //   100: putfield 63	com/tencent/mm/platformtools/ah:title	Ljava/lang/String;
    //   103: aload_0
    //   104: aload_3
    //   105: putfield 65	com/tencent/mm/platformtools/ah:url	Ljava/lang/String;
    //   108: return
    //   109: aload 9
    //   111: ldc 67
    //   113: invokeinterface 73 2 0
    //   118: checkcast 75	java/lang/String
    //   121: invokestatic 81	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   124: invokevirtual 85	java/lang/Integer:intValue	()I
    //   127: istore 6
    //   129: aload 9
    //   131: ldc 87
    //   133: invokeinterface 73 2 0
    //   138: checkcast 75	java/lang/String
    //   141: invokestatic 81	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   144: invokevirtual 85	java/lang/Integer:intValue	()I
    //   147: istore 5
    //   149: aload 9
    //   151: ldc 89
    //   153: invokeinterface 73 2 0
    //   158: checkcast 75	java/lang/String
    //   161: invokestatic 81	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   164: invokevirtual 85	java/lang/Integer:intValue	()I
    //   167: istore 7
    //   169: iload 7
    //   171: istore 4
    //   173: aload 9
    //   175: ldc 91
    //   177: invokeinterface 73 2 0
    //   182: checkcast 75	java/lang/String
    //   185: astore 8
    //   187: aload 9
    //   189: ldc 93
    //   191: invokeinterface 73 2 0
    //   196: checkcast 75	java/lang/String
    //   199: astore_3
    //   200: aload 9
    //   202: ldc 95
    //   204: invokeinterface 73 2 0
    //   209: checkcast 75	java/lang/String
    //   212: astore 9
    //   214: goto -151 -> 63
    //   217: astore 9
    //   219: ldc 23
    //   221: astore 8
    //   223: ldc 23
    //   225: astore_3
    //   226: iconst_0
    //   227: istore 5
    //   229: goto -180 -> 49
    //   232: astore 9
    //   234: ldc 23
    //   236: astore 8
    //   238: ldc 23
    //   240: astore_3
    //   241: goto -192 -> 49
    //   244: astore 9
    //   246: ldc 23
    //   248: astore 8
    //   250: ldc 23
    //   252: astore_3
    //   253: goto -204 -> 49
    //   256: astore 9
    //   258: ldc 23
    //   260: astore_3
    //   261: goto -212 -> 49
    //   264: astore 9
    //   266: goto -217 -> 49
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	269	0	this	ah
    //   0	269	1	paramInt1	int
    //   0	269	2	paramInt2	int
    //   0	269	3	paramString	String
    //   9	163	4	i	int
    //   44	184	5	j	int
    //   47	81	6	k	int
    //   167	3	7	m	int
    //   38	211	8	str1	String
    //   17	3	9	localMap	java.util.Map
    //   34	18	9	localException1	Exception
    //   61	152	9	str2	String
    //   217	1	9	localException2	Exception
    //   232	1	9	localException3	Exception
    //   244	1	9	localException4	Exception
    //   256	1	9	localException5	Exception
    //   264	1	9	localException6	Exception
    //   6	54	10	str3	String
    // Exception table:
    //   from	to	target	type
    //   11	19	34	java/lang/Exception
    //   24	34	34	java/lang/Exception
    //   109	129	34	java/lang/Exception
    //   129	149	217	java/lang/Exception
    //   149	169	232	java/lang/Exception
    //   173	187	244	java/lang/Exception
    //   187	200	256	java/lang/Exception
    //   200	214	264	java/lang/Exception
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/platformtools/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */