package com.tencent.mm.bt.a;

import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDirectQuery;
import com.tencent.wcdb.support.CancellationSignal;

public final class h
  extends SQLiteDirectQuery
{
  h(SQLiteDatabase paramSQLiteDatabase, String paramString, CancellationSignal paramCancellationSignal)
  {
    super(paramSQLiteDatabase, paramString, null, paramCancellationSignal);
  }
  
  /* Error */
  final int a(b paramb, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 6
    //   3: aload_0
    //   4: invokevirtual 20	com/tencent/mm/bt/a/h:acquireReference	()V
    //   7: aload_1
    //   8: invokevirtual 23	com/tencent/mm/bt/a/b:acquireReference	()V
    //   11: iload_2
    //   12: ifle +53 -> 65
    //   15: aload_0
    //   16: iload_2
    //   17: invokevirtual 27	com/tencent/mm/bt/a/h:step	(I)I
    //   20: istore 4
    //   22: iload 4
    //   24: iload_2
    //   25: if_icmpge +40 -> 65
    //   28: ldc 29
    //   30: ldc 31
    //   32: iconst_2
    //   33: anewarray 33	java/lang/Object
    //   36: dup
    //   37: iconst_0
    //   38: iload_2
    //   39: invokestatic 39	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   42: aastore
    //   43: dup
    //   44: iconst_1
    //   45: iload 4
    //   47: invokestatic 39	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   50: aastore
    //   51: invokestatic 45	com/tencent/wcdb/support/Log:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   54: aload_1
    //   55: invokevirtual 48	com/tencent/mm/bt/a/b:releaseReference	()V
    //   58: aload_0
    //   59: invokevirtual 49	com/tencent/mm/bt/a/h:releaseReference	()V
    //   62: iload 4
    //   64: ireturn
    //   65: aload_0
    //   66: invokevirtual 53	com/tencent/mm/bt/a/h:getColumnNames	()[Ljava/lang/String;
    //   69: arraylength
    //   70: istore 7
    //   72: iload_2
    //   73: istore 4
    //   75: iload 4
    //   77: iload_3
    //   78: iload_2
    //   79: iadd
    //   80: if_icmpge +321 -> 401
    //   83: iload 6
    //   85: istore 5
    //   87: aload_0
    //   88: iconst_1
    //   89: invokevirtual 27	com/tencent/mm/bt/a/h:step	(I)I
    //   92: iconst_1
    //   93: if_icmpne +263 -> 356
    //   96: aload_1
    //   97: aload_1
    //   98: invokevirtual 57	com/tencent/mm/bt/a/b:coc	()Lcom/tencent/mm/bt/a/a;
    //   101: putfield 61	com/tencent/mm/bt/a/b:tej	Lcom/tencent/mm/bt/a/a;
    //   104: iconst_0
    //   105: istore 5
    //   107: iload 5
    //   109: iload 7
    //   111: if_icmpge +229 -> 340
    //   114: aload_0
    //   115: iload 5
    //   117: invokevirtual 64	com/tencent/mm/bt/a/h:getType	(I)I
    //   120: tableswitch	default:+269->389, 0:+272->392, 1:+106->226, 2:+179->299, 3:+75->195, 4:+189->309
    //   156: aload_1
    //   157: iload 4
    //   159: iconst_1
    //   160: invokevirtual 68	com/tencent/mm/bt/a/b:eJ	(II)V
    //   163: new 16	com/tencent/wcdb/database/SQLiteException
    //   166: dup
    //   167: ldc 70
    //   169: invokespecial 73	com/tencent/wcdb/database/SQLiteException:<init>	(Ljava/lang/String;)V
    //   172: athrow
    //   173: astore 10
    //   175: aload_0
    //   176: invokevirtual 76	com/tencent/mm/bt/a/h:onCorruption	()V
    //   179: aload 10
    //   181: athrow
    //   182: astore 10
    //   184: aload_1
    //   185: invokevirtual 48	com/tencent/mm/bt/a/b:releaseReference	()V
    //   188: aload_0
    //   189: invokevirtual 49	com/tencent/mm/bt/a/h:releaseReference	()V
    //   192: aload 10
    //   194: athrow
    //   195: aload_0
    //   196: iload 5
    //   198: invokevirtual 80	com/tencent/mm/bt/a/h:getString	(I)Ljava/lang/String;
    //   201: astore 10
    //   203: aload_1
    //   204: getfield 61	com/tencent/mm/bt/a/b:tej	Lcom/tencent/mm/bt/a/a;
    //   207: ifnull +185 -> 392
    //   210: aload_1
    //   211: getfield 61	com/tencent/mm/bt/a/b:tej	Lcom/tencent/mm/bt/a/a;
    //   214: iload 5
    //   216: aload 10
    //   218: invokeinterface 86 3 0
    //   223: goto +169 -> 392
    //   226: aload_0
    //   227: iload 5
    //   229: invokevirtual 90	com/tencent/mm/bt/a/h:getLong	(I)J
    //   232: lstore 8
    //   234: aload_1
    //   235: getfield 61	com/tencent/mm/bt/a/b:tej	Lcom/tencent/mm/bt/a/a;
    //   238: ifnull +154 -> 392
    //   241: aload_1
    //   242: getfield 61	com/tencent/mm/bt/a/b:tej	Lcom/tencent/mm/bt/a/a;
    //   245: iload 5
    //   247: lload 8
    //   249: invokeinterface 94 4 0
    //   254: goto +138 -> 392
    //   257: astore 10
    //   259: ldc 29
    //   261: new 96	java/lang/StringBuilder
    //   264: dup
    //   265: ldc 98
    //   267: invokespecial 99	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   270: aload 10
    //   272: invokevirtual 103	com/tencent/wcdb/database/SQLiteException:getMessage	()Ljava/lang/String;
    //   275: invokevirtual 107	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   278: ldc 109
    //   280: invokevirtual 107	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   283: aload_0
    //   284: invokevirtual 112	com/tencent/mm/bt/a/h:getSql	()Ljava/lang/String;
    //   287: invokevirtual 107	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   290: invokevirtual 115	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   293: invokestatic 119	com/tencent/wcdb/support/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   296: aload 10
    //   298: athrow
    //   299: aload_0
    //   300: iload 5
    //   302: invokevirtual 123	com/tencent/mm/bt/a/h:getDouble	(I)D
    //   305: pop2
    //   306: goto +86 -> 392
    //   309: aload_0
    //   310: iload 5
    //   312: invokevirtual 127	com/tencent/mm/bt/a/h:getBlob	(I)[B
    //   315: astore 10
    //   317: aload_1
    //   318: getfield 61	com/tencent/mm/bt/a/b:tej	Lcom/tencent/mm/bt/a/a;
    //   321: ifnull +71 -> 392
    //   324: aload_1
    //   325: getfield 61	com/tencent/mm/bt/a/b:tej	Lcom/tencent/mm/bt/a/a;
    //   328: iload 5
    //   330: aload 10
    //   332: invokeinterface 131 3 0
    //   337: goto +55 -> 392
    //   340: aload_1
    //   341: iload 4
    //   343: iconst_0
    //   344: invokevirtual 68	com/tencent/mm/bt/a/b:eJ	(II)V
    //   347: iload 4
    //   349: iconst_1
    //   350: iadd
    //   351: istore 4
    //   353: goto -278 -> 75
    //   356: iload 4
    //   358: istore_2
    //   359: iload 5
    //   361: ifne +13 -> 374
    //   364: iload 4
    //   366: aload_0
    //   367: ldc -124
    //   369: invokevirtual 27	com/tencent/mm/bt/a/h:step	(I)I
    //   372: iadd
    //   373: istore_2
    //   374: aload_0
    //   375: iconst_1
    //   376: invokevirtual 136	com/tencent/mm/bt/a/h:reset	(Z)V
    //   379: aload_1
    //   380: invokevirtual 48	com/tencent/mm/bt/a/b:releaseReference	()V
    //   383: aload_0
    //   384: invokevirtual 49	com/tencent/mm/bt/a/h:releaseReference	()V
    //   387: iload_2
    //   388: ireturn
    //   389: goto -233 -> 156
    //   392: iload 5
    //   394: iconst_1
    //   395: iadd
    //   396: istore 5
    //   398: goto -291 -> 107
    //   401: iconst_0
    //   402: istore 5
    //   404: goto -48 -> 356
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	407	0	this	h
    //   0	407	1	paramb	b
    //   0	407	2	paramInt1	int
    //   0	407	3	paramInt2	int
    //   20	353	4	i	int
    //   85	318	5	j	int
    //   1	83	6	k	int
    //   70	42	7	m	int
    //   232	16	8	l	long
    //   173	7	10	localSQLiteDatabaseCorruptException	com.tencent.wcdb.database.SQLiteDatabaseCorruptException
    //   182	11	10	localObject	Object
    //   201	16	10	str	String
    //   257	40	10	localSQLiteException	com.tencent.wcdb.database.SQLiteException
    //   315	16	10	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   15	22	173	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   28	54	173	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   65	72	173	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   87	104	173	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   114	156	173	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   156	173	173	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   195	223	173	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   226	254	173	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   299	306	173	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   309	337	173	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   340	347	173	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   364	374	173	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   374	379	173	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   15	22	182	finally
    //   28	54	182	finally
    //   65	72	182	finally
    //   87	104	182	finally
    //   114	156	182	finally
    //   156	173	182	finally
    //   175	182	182	finally
    //   195	223	182	finally
    //   226	254	182	finally
    //   259	299	182	finally
    //   299	306	182	finally
    //   309	337	182	finally
    //   340	347	182	finally
    //   364	374	182	finally
    //   374	379	182	finally
    //   15	22	257	com/tencent/wcdb/database/SQLiteException
    //   28	54	257	com/tencent/wcdb/database/SQLiteException
    //   65	72	257	com/tencent/wcdb/database/SQLiteException
    //   87	104	257	com/tencent/wcdb/database/SQLiteException
    //   114	156	257	com/tencent/wcdb/database/SQLiteException
    //   156	173	257	com/tencent/wcdb/database/SQLiteException
    //   195	223	257	com/tencent/wcdb/database/SQLiteException
    //   226	254	257	com/tencent/wcdb/database/SQLiteException
    //   299	306	257	com/tencent/wcdb/database/SQLiteException
    //   309	337	257	com/tencent/wcdb/database/SQLiteException
    //   340	347	257	com/tencent/wcdb/database/SQLiteException
    //   364	374	257	com/tencent/wcdb/database/SQLiteException
    //   374	379	257	com/tencent/wcdb/database/SQLiteException
  }
  
  /* Error */
  final int a(c paramc, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 20	com/tencent/mm/bt/a/h:acquireReference	()V
    //   4: iload_2
    //   5: ifle +49 -> 54
    //   8: aload_0
    //   9: iload_2
    //   10: invokevirtual 27	com/tencent/mm/bt/a/h:step	(I)I
    //   13: istore 4
    //   15: iload 4
    //   17: iload_2
    //   18: if_icmpge +36 -> 54
    //   21: ldc 29
    //   23: ldc 31
    //   25: iconst_2
    //   26: anewarray 33	java/lang/Object
    //   29: dup
    //   30: iconst_0
    //   31: iload_2
    //   32: invokestatic 39	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   35: aastore
    //   36: dup
    //   37: iconst_1
    //   38: iload 4
    //   40: invokestatic 39	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   43: aastore
    //   44: invokestatic 45	com/tencent/wcdb/support/Log:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   47: aload_0
    //   48: invokevirtual 49	com/tencent/mm/bt/a/h:releaseReference	()V
    //   51: iload 4
    //   53: ireturn
    //   54: aload_0
    //   55: invokevirtual 53	com/tencent/mm/bt/a/h:getColumnNames	()[Ljava/lang/String;
    //   58: arraylength
    //   59: istore 6
    //   61: iload_2
    //   62: istore 4
    //   64: iload 4
    //   66: iload_3
    //   67: iload_2
    //   68: iadd
    //   69: if_icmpge +400 -> 469
    //   72: aload_0
    //   73: iconst_1
    //   74: invokevirtual 27	com/tencent/mm/bt/a/h:step	(I)I
    //   77: iconst_1
    //   78: if_icmpne +414 -> 492
    //   81: iload 4
    //   83: aload_1
    //   84: getfield 143	com/tencent/mm/bt/a/c:tem	I
    //   87: idiv
    //   88: istore 5
    //   90: aload_1
    //   91: getfield 147	com/tencent/mm/bt/a/c:tek	Landroid/util/SparseArray;
    //   94: iload 5
    //   96: invokevirtual 152	android/util/SparseArray:indexOfKey	(I)I
    //   99: ifge +165 -> 264
    //   102: aload_1
    //   103: getfield 143	com/tencent/mm/bt/a/c:tem	I
    //   106: aload_1
    //   107: getfield 155	com/tencent/mm/bt/a/c:columnCount	I
    //   110: imul
    //   111: anewarray 33	java/lang/Object
    //   114: astore 9
    //   116: aload_1
    //   117: getfield 147	com/tencent/mm/bt/a/c:tek	Landroid/util/SparseArray;
    //   120: iload 5
    //   122: aload 9
    //   124: invokevirtual 159	android/util/SparseArray:put	(ILjava/lang/Object;)V
    //   127: aload_1
    //   128: getfield 143	com/tencent/mm/bt/a/c:tem	I
    //   131: istore 5
    //   133: aload_1
    //   134: getfield 155	com/tencent/mm/bt/a/c:columnCount	I
    //   137: iload 4
    //   139: iload 5
    //   141: irem
    //   142: imul
    //   143: istore 7
    //   145: aload_1
    //   146: getfield 155	com/tencent/mm/bt/a/c:columnCount	I
    //   149: istore 8
    //   151: iload 4
    //   153: iconst_1
    //   154: iadd
    //   155: istore 5
    //   157: iload 5
    //   159: aload_1
    //   160: getfield 162	com/tencent/mm/bt/a/c:ten	I
    //   163: if_icmple +118 -> 281
    //   166: aload_1
    //   167: iload 5
    //   169: putfield 162	com/tencent/mm/bt/a/c:ten	I
    //   172: new 164	com/tencent/mm/bt/a/c$a
    //   175: dup
    //   176: aload_1
    //   177: iload 7
    //   179: iload 7
    //   181: iload 8
    //   183: iadd
    //   184: aload 9
    //   186: invokespecial 167	com/tencent/mm/bt/a/c$a:<init>	(Lcom/tencent/mm/bt/a/c;II[Ljava/lang/Object;)V
    //   189: astore 10
    //   191: iconst_0
    //   192: istore 5
    //   194: iload 5
    //   196: iload 6
    //   198: if_icmpge +285 -> 483
    //   201: aload_0
    //   202: iload 5
    //   204: invokevirtual 64	com/tencent/mm/bt/a/h:getType	(I)I
    //   207: tableswitch	default:+267->474, 0:+270->477, 1:+153->360, 2:+167->374, 3:+83->290, 4:+181->388
    //   240: new 16	com/tencent/wcdb/database/SQLiteException
    //   243: dup
    //   244: ldc 70
    //   246: invokespecial 73	com/tencent/wcdb/database/SQLiteException:<init>	(Ljava/lang/String;)V
    //   249: athrow
    //   250: astore_1
    //   251: aload_0
    //   252: invokevirtual 76	com/tencent/mm/bt/a/h:onCorruption	()V
    //   255: aload_1
    //   256: athrow
    //   257: astore_1
    //   258: aload_0
    //   259: invokevirtual 49	com/tencent/mm/bt/a/h:releaseReference	()V
    //   262: aload_1
    //   263: athrow
    //   264: aload_1
    //   265: getfield 147	com/tencent/mm/bt/a/c:tek	Landroid/util/SparseArray;
    //   268: iload 5
    //   270: invokevirtual 171	android/util/SparseArray:get	(I)Ljava/lang/Object;
    //   273: checkcast 173	[Ljava/lang/Object;
    //   276: astore 9
    //   278: goto -151 -> 127
    //   281: aload_1
    //   282: getfield 162	com/tencent/mm/bt/a/c:ten	I
    //   285: istore 5
    //   287: goto -121 -> 166
    //   290: aload_0
    //   291: iload 5
    //   293: invokevirtual 80	com/tencent/mm/bt/a/h:getString	(I)Ljava/lang/String;
    //   296: astore 9
    //   298: aload 10
    //   300: getfield 176	com/tencent/mm/bt/a/c$a:index	I
    //   303: aload 10
    //   305: getfield 179	com/tencent/mm/bt/a/c$a:endIndex	I
    //   308: if_icmpne +91 -> 399
    //   311: new 181	android/database/CursorIndexOutOfBoundsException
    //   314: dup
    //   315: ldc -73
    //   317: invokespecial 184	android/database/CursorIndexOutOfBoundsException:<init>	(Ljava/lang/String;)V
    //   320: athrow
    //   321: astore_1
    //   322: ldc 29
    //   324: new 96	java/lang/StringBuilder
    //   327: dup
    //   328: ldc 98
    //   330: invokespecial 99	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   333: aload_1
    //   334: invokevirtual 103	com/tencent/wcdb/database/SQLiteException:getMessage	()Ljava/lang/String;
    //   337: invokevirtual 107	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   340: ldc 109
    //   342: invokevirtual 107	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   345: aload_0
    //   346: invokevirtual 112	com/tencent/mm/bt/a/h:getSql	()Ljava/lang/String;
    //   349: invokevirtual 107	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   352: invokevirtual 115	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   355: invokestatic 119	com/tencent/wcdb/support/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   358: aload_1
    //   359: athrow
    //   360: aload_0
    //   361: iload 5
    //   363: invokevirtual 90	com/tencent/mm/bt/a/h:getLong	(I)J
    //   366: invokestatic 189	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   369: astore 9
    //   371: goto -73 -> 298
    //   374: aload_0
    //   375: iload 5
    //   377: invokevirtual 123	com/tencent/mm/bt/a/h:getDouble	(I)D
    //   380: invokestatic 194	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   383: astore 9
    //   385: goto -87 -> 298
    //   388: aload_0
    //   389: iload 5
    //   391: invokevirtual 127	com/tencent/mm/bt/a/h:getBlob	(I)[B
    //   394: astore 9
    //   396: goto -98 -> 298
    //   399: aload 10
    //   401: getfield 197	com/tencent/mm/bt/a/c$a:teo	[Ljava/lang/Object;
    //   404: astore 11
    //   406: aload 10
    //   408: getfield 176	com/tencent/mm/bt/a/c$a:index	I
    //   411: istore 7
    //   413: aload 10
    //   415: iload 7
    //   417: iconst_1
    //   418: iadd
    //   419: putfield 176	com/tencent/mm/bt/a/c$a:index	I
    //   422: aload 11
    //   424: iload 7
    //   426: aload 9
    //   428: aastore
    //   429: iload 5
    //   431: iconst_1
    //   432: iadd
    //   433: istore 5
    //   435: goto -241 -> 194
    //   438: iload_2
    //   439: ifne +24 -> 463
    //   442: aload_0
    //   443: ldc -124
    //   445: invokevirtual 27	com/tencent/mm/bt/a/h:step	(I)I
    //   448: iload 4
    //   450: iadd
    //   451: istore_2
    //   452: aload_0
    //   453: iconst_1
    //   454: invokevirtual 136	com/tencent/mm/bt/a/h:reset	(Z)V
    //   457: aload_0
    //   458: invokevirtual 49	com/tencent/mm/bt/a/h:releaseReference	()V
    //   461: iload_2
    //   462: ireturn
    //   463: iload 4
    //   465: istore_2
    //   466: goto -14 -> 452
    //   469: iconst_0
    //   470: istore_2
    //   471: goto -33 -> 438
    //   474: goto -234 -> 240
    //   477: aconst_null
    //   478: astore 9
    //   480: goto -182 -> 298
    //   483: iload 4
    //   485: iconst_1
    //   486: iadd
    //   487: istore 4
    //   489: goto -425 -> 64
    //   492: iconst_1
    //   493: istore_2
    //   494: goto -56 -> 438
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	497	0	this	h
    //   0	497	1	paramc	c
    //   0	497	2	paramInt1	int
    //   0	497	3	paramInt2	int
    //   13	475	4	i	int
    //   88	346	5	j	int
    //   59	140	6	k	int
    //   143	282	7	m	int
    //   149	35	8	n	int
    //   114	365	9	localObject	Object
    //   189	225	10	locala	c.a
    //   404	19	11	arrayOfObject	Object[]
    // Exception table:
    //   from	to	target	type
    //   8	15	250	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   21	47	250	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   54	61	250	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   72	127	250	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   127	151	250	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   157	166	250	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   166	191	250	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   201	240	250	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   240	250	250	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   264	278	250	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   281	287	250	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   290	298	250	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   298	321	250	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   360	371	250	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   374	385	250	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   388	396	250	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   399	422	250	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   442	452	250	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   452	457	250	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   8	15	257	finally
    //   21	47	257	finally
    //   54	61	257	finally
    //   72	127	257	finally
    //   127	151	257	finally
    //   157	166	257	finally
    //   166	191	257	finally
    //   201	240	257	finally
    //   240	250	257	finally
    //   251	257	257	finally
    //   264	278	257	finally
    //   281	287	257	finally
    //   290	298	257	finally
    //   298	321	257	finally
    //   322	360	257	finally
    //   360	371	257	finally
    //   374	385	257	finally
    //   388	396	257	finally
    //   399	422	257	finally
    //   442	452	257	finally
    //   452	457	257	finally
    //   8	15	321	com/tencent/wcdb/database/SQLiteException
    //   21	47	321	com/tencent/wcdb/database/SQLiteException
    //   54	61	321	com/tencent/wcdb/database/SQLiteException
    //   72	127	321	com/tencent/wcdb/database/SQLiteException
    //   127	151	321	com/tencent/wcdb/database/SQLiteException
    //   157	166	321	com/tencent/wcdb/database/SQLiteException
    //   166	191	321	com/tencent/wcdb/database/SQLiteException
    //   201	240	321	com/tencent/wcdb/database/SQLiteException
    //   240	250	321	com/tencent/wcdb/database/SQLiteException
    //   264	278	321	com/tencent/wcdb/database/SQLiteException
    //   281	287	321	com/tencent/wcdb/database/SQLiteException
    //   290	298	321	com/tencent/wcdb/database/SQLiteException
    //   298	321	321	com/tencent/wcdb/database/SQLiteException
    //   360	371	321	com/tencent/wcdb/database/SQLiteException
    //   374	385	321	com/tencent/wcdb/database/SQLiteException
    //   388	396	321	com/tencent/wcdb/database/SQLiteException
    //   399	422	321	com/tencent/wcdb/database/SQLiteException
    //   442	452	321	com/tencent/wcdb/database/SQLiteException
    //   452	457	321	com/tencent/wcdb/database/SQLiteException
  }
  
  public final String toString()
  {
    return "SQLiteNewQuery: " + getSql();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/bt/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */