package com.tencent.mm.plugin.music.model;

import com.tencent.mars.smc.IDKey;
import com.tencent.mm.an.a;
import com.tencent.mm.protocal.c.avq;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;

public final class f
{
  public static long dGw;
  public static boolean lyn;
  public static boolean lyo;
  public static int lyp;
  public static int lyq;
  private static a lyr;
  public static int scene;
  
  public static final void R(int paramInt1, int paramInt2, int paramInt3)
  {
    a locala = h.bic().bhR();
    if (locala != null)
    {
      x.v("MicroMsg.Music.MusicReportUtil", "kvReportShakeReport: %d, %d, %d, %s, %s, %s, %s, %d %s, %s", new Object[] { Integer.valueOf(13042), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), locala.field_musicId, locala.field_songName, locala.field_songAlbum, Integer.valueOf(locala.field_songId), Integer.valueOf(paramInt3), locala.field_songSinger, locala.field_appId });
      com.tencent.mm.plugin.report.service.h.mEJ.h(13042, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), locala.field_musicId, locala.field_songName, locala.field_songAlbum, Integer.valueOf(locala.field_songId), Integer.valueOf(paramInt3), locala.field_songSinger, locala.field_appId });
    }
  }
  
  public static void a(int paramInt, a parama)
  {
    if (parama == null)
    {
      x.e("MicroMsg.Music.MusicReportUtil", "kvReportMusicNotificationStat music is null, err");
      return;
    }
    x.i("MicroMsg.Music.MusicReportUtil", "kvReportMusicNotificationStat scene:%d, action:%d, src:%s, title:%s, singer:%s", new Object[] { Integer.valueOf(parama.field_musicType), Integer.valueOf(paramInt), parama.field_songWifiUrl, parama.field_songName, parama.field_songSinger });
    com.tencent.mm.plugin.report.service.h.mEJ.h(15106, new Object[] { Integer.valueOf(parama.field_musicType), Integer.valueOf(paramInt), Long.valueOf(System.currentTimeMillis()), parama.field_songWifiUrl, parama.field_songName, parama.field_songSinger });
  }
  
  public static final void a(a parama, boolean paramBoolean)
  {
    if (parama == null)
    {
      x.e("MicroMsg.Music.MusicReportUtil", "idKeyReportMusicPlayerSum music is null");
      return;
    }
    Object localObject = new ArrayList();
    IDKey localIDKey1 = new IDKey();
    localIDKey1.SetID(558);
    localIDKey1.SetKey(0);
    localIDKey1.SetValue(1L);
    IDKey localIDKey3 = new IDKey();
    localIDKey3.SetID(558);
    localIDKey3.SetValue(1L);
    IDKey localIDKey2 = new IDKey();
    localIDKey2.SetID(558);
    localIDKey2.SetValue(1L);
    avq localavq = parama.PV();
    if (paramBoolean)
    {
      localIDKey2.SetKey(10);
      ((ArrayList)localObject).add(localIDKey1);
      ((ArrayList)localObject).add(localIDKey2);
      com.tencent.mm.plugin.report.service.h.mEJ.b((ArrayList)localObject, true);
      return;
    }
    if (g.l(localavq))
    {
      i = localavq.rYj;
      x.i("MicroMsg.Music.MusicReportUtil", "idKeyReportExoMusicPlayerSum scene:%d", new Object[] { Integer.valueOf(i) });
      parama = new ArrayList();
      localObject = new IDKey();
      ((IDKey)localObject).SetID(797);
      ((IDKey)localObject).SetKey(0);
      ((IDKey)localObject).SetValue(1L);
      localIDKey1 = new IDKey();
      localIDKey1.SetID(797);
      x.i("MicroMsg.Music.ExoPlayIdkeyReport", "getExoMusicPlayerSumidKeyByMusicType, musicType:" + i);
      switch (i)
      {
      case 2: 
      case 3: 
      case 5: 
      default: 
        i = 59;
      }
      for (;;)
      {
        localIDKey1.SetKey(i);
        localIDKey1.SetValue(1L);
        parama.add(localObject);
        parama.add(localIDKey1);
        com.tencent.mm.plugin.report.service.h.mEJ.b(parama, true);
        return;
        i = 50;
        continue;
        i = 51;
        continue;
        i = 52;
        continue;
        i = 53;
        continue;
        i = 54;
        continue;
        i = 55;
        continue;
        i = 56;
        continue;
        i = 57;
        continue;
        i = 58;
      }
    }
    if (g.tB(parama.field_musicType))
    {
      localIDKey2.SetKey(2);
      i = parama.field_musicType;
      x.i("MicroMsg.Music.MusicPlayIdKeyReport", "getQQMusicPlayerSumidKeyByMusicType, musicType:" + i);
      switch (i)
      {
      case 2: 
      case 3: 
      default: 
        i = 127;
      }
      for (;;)
      {
        localIDKey3.SetKey(i);
        ((ArrayList)localObject).add(localIDKey3);
        com.tencent.mm.plugin.report.service.h.mEJ.h(14174, new Object[] { Integer.valueOf(1), Integer.valueOf(parama.field_musicType) });
        if (!com.tencent.mm.plugin.music.model.a.b.Ix(parama.playUrl)) {
          break;
        }
        parama = new IDKey();
        parama.SetID(558);
        parama.SetKey(216);
        parama.SetValue(1L);
        ((ArrayList)localObject).add(parama);
        break;
        i = 117;
        continue;
        i = 118;
        continue;
        i = 119;
        continue;
        i = 120;
        continue;
        i = 121;
        continue;
        i = 122;
        continue;
        i = 123;
        continue;
        i = 124;
        continue;
        i = 125;
        continue;
        i = 126;
      }
    }
    localIDKey2.SetKey(1);
    int i = parama.field_musicType;
    x.i("MicroMsg.Music.MusicPlayIdKeyReport", "getMusicPlayerSumidKeyByMusicType, musicType:" + i);
    switch (i)
    {
    case 2: 
    case 3: 
    default: 
      i = 113;
    }
    for (;;)
    {
      localIDKey3.SetKey(i);
      ((ArrayList)localObject).add(localIDKey3);
      com.tencent.mm.plugin.report.service.h.mEJ.h(14174, new Object[] { Integer.valueOf(0), Integer.valueOf(parama.field_musicType) });
      if (!com.tencent.mm.plugin.music.model.a.b.Ix(parama.playUrl)) {
        break;
      }
      parama = new IDKey();
      parama.SetID(558);
      parama.SetKey(215);
      parama.SetValue(1L);
      ((ArrayList)localObject).add(parama);
      break;
      i = 105;
      continue;
      i = 106;
      continue;
      i = 107;
      continue;
      i = 108;
      continue;
      i = 109;
      continue;
      i = 110;
      continue;
      i = 111;
      continue;
      i = 112;
    }
  }
  
  /* Error */
  public static final void bhZ()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: ldc 2
    //   4: monitorenter
    //   5: getstatic 196	com/tencent/mm/plugin/music/model/f:lyr	Lcom/tencent/mm/an/a;
    //   8: ifnull +328 -> 336
    //   11: invokestatic 199	com/tencent/mm/plugin/music/model/f:yL	()V
    //   14: getstatic 196	com/tencent/mm/plugin/music/model/f:lyr	Lcom/tencent/mm/an/a;
    //   17: getfield 45	com/tencent/mm/an/a:field_musicId	Ljava/lang/String;
    //   20: astore 6
    //   22: getstatic 196	com/tencent/mm/plugin/music/model/f:lyr	Lcom/tencent/mm/an/a;
    //   25: getfield 48	com/tencent/mm/an/a:field_songName	Ljava/lang/String;
    //   28: astore 7
    //   30: getstatic 196	com/tencent/mm/plugin/music/model/f:lyr	Lcom/tencent/mm/an/a;
    //   33: getfield 51	com/tencent/mm/an/a:field_songAlbum	Ljava/lang/String;
    //   36: astore 8
    //   38: getstatic 196	com/tencent/mm/plugin/music/model/f:lyr	Lcom/tencent/mm/an/a;
    //   41: getfield 54	com/tencent/mm/an/a:field_songId	I
    //   44: istore_3
    //   45: getstatic 201	com/tencent/mm/plugin/music/model/f:lyp	I
    //   48: istore 4
    //   50: getstatic 203	com/tencent/mm/plugin/music/model/f:lyq	I
    //   53: istore 5
    //   55: getstatic 205	com/tencent/mm/plugin/music/model/f:lyn	Z
    //   58: ifeq +310 -> 368
    //   61: iconst_1
    //   62: istore_0
    //   63: getstatic 207	com/tencent/mm/plugin/music/model/f:lyo	Z
    //   66: ifeq +307 -> 373
    //   69: iconst_1
    //   70: istore_1
    //   71: ldc 31
    //   73: ldc -47
    //   75: bipush 12
    //   77: anewarray 4	java/lang/Object
    //   80: dup
    //   81: iconst_0
    //   82: sipush 13044
    //   85: invokestatic 39	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   88: aastore
    //   89: dup
    //   90: iconst_1
    //   91: aload 6
    //   93: aastore
    //   94: dup
    //   95: iconst_2
    //   96: aload 7
    //   98: aastore
    //   99: dup
    //   100: iconst_3
    //   101: aload 8
    //   103: aastore
    //   104: dup
    //   105: iconst_4
    //   106: iload_3
    //   107: invokestatic 39	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   110: aastore
    //   111: dup
    //   112: iconst_5
    //   113: iload 4
    //   115: invokestatic 39	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   118: aastore
    //   119: dup
    //   120: bipush 6
    //   122: iload 5
    //   124: invokestatic 39	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   127: aastore
    //   128: dup
    //   129: bipush 7
    //   131: iload_0
    //   132: invokestatic 39	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   135: aastore
    //   136: dup
    //   137: bipush 8
    //   139: iload_1
    //   140: invokestatic 39	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   143: aastore
    //   144: dup
    //   145: bipush 9
    //   147: getstatic 211	com/tencent/mm/plugin/music/model/f:scene	I
    //   150: invokestatic 39	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   153: aastore
    //   154: dup
    //   155: bipush 10
    //   157: getstatic 196	com/tencent/mm/plugin/music/model/f:lyr	Lcom/tencent/mm/an/a;
    //   160: getfield 57	com/tencent/mm/an/a:field_songSinger	Ljava/lang/String;
    //   163: aastore
    //   164: dup
    //   165: bipush 11
    //   167: getstatic 196	com/tencent/mm/plugin/music/model/f:lyr	Lcom/tencent/mm/an/a;
    //   170: getfield 60	com/tencent/mm/an/a:field_appId	Ljava/lang/String;
    //   173: aastore
    //   174: invokestatic 66	com/tencent/mm/sdk/platformtools/x:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   177: getstatic 72	com/tencent/mm/plugin/report/service/h:mEJ	Lcom/tencent/mm/plugin/report/service/h;
    //   180: astore 6
    //   182: getstatic 196	com/tencent/mm/plugin/music/model/f:lyr	Lcom/tencent/mm/an/a;
    //   185: getfield 45	com/tencent/mm/an/a:field_musicId	Ljava/lang/String;
    //   188: astore 7
    //   190: getstatic 196	com/tencent/mm/plugin/music/model/f:lyr	Lcom/tencent/mm/an/a;
    //   193: getfield 48	com/tencent/mm/an/a:field_songName	Ljava/lang/String;
    //   196: astore 8
    //   198: getstatic 196	com/tencent/mm/plugin/music/model/f:lyr	Lcom/tencent/mm/an/a;
    //   201: getfield 51	com/tencent/mm/an/a:field_songAlbum	Ljava/lang/String;
    //   204: astore 9
    //   206: getstatic 196	com/tencent/mm/plugin/music/model/f:lyr	Lcom/tencent/mm/an/a;
    //   209: getfield 54	com/tencent/mm/an/a:field_songId	I
    //   212: istore_3
    //   213: getstatic 201	com/tencent/mm/plugin/music/model/f:lyp	I
    //   216: istore 4
    //   218: getstatic 203	com/tencent/mm/plugin/music/model/f:lyq	I
    //   221: istore 5
    //   223: getstatic 205	com/tencent/mm/plugin/music/model/f:lyn	Z
    //   226: ifeq +152 -> 378
    //   229: iconst_1
    //   230: istore_0
    //   231: getstatic 207	com/tencent/mm/plugin/music/model/f:lyo	Z
    //   234: ifeq +149 -> 383
    //   237: iload_2
    //   238: istore_1
    //   239: aload 6
    //   241: sipush 13044
    //   244: bipush 11
    //   246: anewarray 4	java/lang/Object
    //   249: dup
    //   250: iconst_0
    //   251: aload 7
    //   253: aastore
    //   254: dup
    //   255: iconst_1
    //   256: aload 8
    //   258: aastore
    //   259: dup
    //   260: iconst_2
    //   261: aload 9
    //   263: aastore
    //   264: dup
    //   265: iconst_3
    //   266: iload_3
    //   267: invokestatic 39	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   270: aastore
    //   271: dup
    //   272: iconst_4
    //   273: iload 4
    //   275: invokestatic 39	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   278: aastore
    //   279: dup
    //   280: iconst_5
    //   281: iload 5
    //   283: invokestatic 39	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   286: aastore
    //   287: dup
    //   288: bipush 6
    //   290: iload_0
    //   291: invokestatic 39	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   294: aastore
    //   295: dup
    //   296: bipush 7
    //   298: iload_1
    //   299: invokestatic 39	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   302: aastore
    //   303: dup
    //   304: bipush 8
    //   306: getstatic 211	com/tencent/mm/plugin/music/model/f:scene	I
    //   309: invokestatic 39	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   312: aastore
    //   313: dup
    //   314: bipush 9
    //   316: getstatic 196	com/tencent/mm/plugin/music/model/f:lyr	Lcom/tencent/mm/an/a;
    //   319: getfield 57	com/tencent/mm/an/a:field_songSinger	Ljava/lang/String;
    //   322: aastore
    //   323: dup
    //   324: bipush 10
    //   326: getstatic 196	com/tencent/mm/plugin/music/model/f:lyr	Lcom/tencent/mm/an/a;
    //   329: getfield 60	com/tencent/mm/an/a:field_appId	Ljava/lang/String;
    //   332: aastore
    //   333: invokevirtual 76	com/tencent/mm/plugin/report/service/h:h	(I[Ljava/lang/Object;)V
    //   336: aconst_null
    //   337: putstatic 196	com/tencent/mm/plugin/music/model/f:lyr	Lcom/tencent/mm/an/a;
    //   340: iconst_0
    //   341: putstatic 205	com/tencent/mm/plugin/music/model/f:lyn	Z
    //   344: iconst_0
    //   345: putstatic 207	com/tencent/mm/plugin/music/model/f:lyo	Z
    //   348: iconst_0
    //   349: putstatic 201	com/tencent/mm/plugin/music/model/f:lyp	I
    //   352: iconst_0
    //   353: putstatic 203	com/tencent/mm/plugin/music/model/f:lyq	I
    //   356: lconst_0
    //   357: putstatic 213	com/tencent/mm/plugin/music/model/f:dGw	J
    //   360: iconst_0
    //   361: putstatic 211	com/tencent/mm/plugin/music/model/f:scene	I
    //   364: ldc 2
    //   366: monitorexit
    //   367: return
    //   368: iconst_2
    //   369: istore_0
    //   370: goto -307 -> 63
    //   373: iconst_2
    //   374: istore_1
    //   375: goto -304 -> 71
    //   378: iconst_2
    //   379: istore_0
    //   380: goto -149 -> 231
    //   383: iconst_2
    //   384: istore_1
    //   385: goto -146 -> 239
    //   388: astore 6
    //   390: ldc 2
    //   392: monitorexit
    //   393: aload 6
    //   395: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   62	318	0	i	int
    //   70	315	1	j	int
    //   1	237	2	k	int
    //   44	223	3	m	int
    //   48	226	4	n	int
    //   53	229	5	i1	int
    //   20	220	6	localObject1	Object
    //   388	6	6	localObject2	Object
    //   28	224	7	str1	String
    //   36	221	8	str2	String
    //   204	58	9	str3	String
    // Exception table:
    //   from	to	target	type
    //   5	61	388	finally
    //   63	69	388	finally
    //   71	229	388	finally
    //   231	237	388	finally
    //   239	336	388	finally
    //   336	364	388	finally
  }
  
  public static final void bia()
  {
    com.tencent.mm.plugin.report.service.h.mEJ.a(285L, 4L, 1L, false);
  }
  
  public static final void cW(int paramInt1, int paramInt2)
  {
    a locala = h.bic().bhR();
    if (locala != null)
    {
      x.v("MicroMsg.Music.MusicReportUtil", "kvReportAction: %d, %s, %s, %s, %s, %d, %d, %s, %s", new Object[] { Integer.valueOf(13232), locala.field_musicId, locala.field_songName, locala.field_songAlbum, Integer.valueOf(locala.field_songId), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), locala.field_songSinger, locala.field_appId });
      com.tencent.mm.plugin.report.service.h.mEJ.h(13232, new Object[] { locala.field_musicId, locala.field_songName, locala.field_songAlbum, Integer.valueOf(locala.field_songId), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), locala.field_songSinger, locala.field_appId });
    }
  }
  
  public static void e(a parama)
  {
    try
    {
      lyr = parama;
      return;
    }
    finally
    {
      parama = finally;
      throw parama;
    }
  }
  
  public static final void tA(int paramInt)
  {
    a locala = h.bic().bhR();
    if (locala != null)
    {
      x.i("MicroMsg.Music.MusicReportUtil", "ReportMusicPlayerShareStat ShareType:%d, MusicId:%s, MusicTitle:%s, Singer:%s, AppId:%s", new Object[] { Integer.valueOf(paramInt), locala.field_musicId, locala.field_songName, locala.field_songSinger, locala.field_appId });
      com.tencent.mm.plugin.report.service.h.mEJ.h(12836, new Object[] { Integer.valueOf(paramInt), locala.field_musicId, locala.field_songName, locala.field_songSinger, locala.field_appId });
    }
  }
  
  public static final void ty(int paramInt)
  {
    if (paramInt == 2)
    {
      avq localavq = com.tencent.mm.an.b.Qa();
      if (localavq != null) {
        com.tencent.mm.plugin.fav.a.h.f(bi.getLong(localavq.eaZ, 0L), 1, 0);
      }
    }
  }
  
  public static final void tz(int paramInt)
  {
    if (paramInt == 2)
    {
      avq localavq = com.tencent.mm.an.b.Qa();
      if (localavq != null) {
        com.tencent.mm.plugin.fav.a.h.f(bi.getLong(localavq.eaZ, 0L), 0, 0);
      }
    }
  }
  
  public static final void yL()
  {
    if (dGw > 0L)
    {
      lyq = (int)(lyq + (System.currentTimeMillis() - dGw) / 1000L);
      dGw = 0L;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/music/model/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */