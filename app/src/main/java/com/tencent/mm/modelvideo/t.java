package com.tencent.mm.modelvideo;

import android.content.ContentValues;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.modelcontrol.d;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.aso;
import com.tencent.mm.protocal.c.bri;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.j;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class t
{
  public static boolean U(String paramString, int paramInt)
  {
    int i = 0;
    r localr = nW(paramString);
    if (localr == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.Ac() + " getinfo failed: " + paramString);
      return false;
    }
    if (paramInt != localr.dHI)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.VideoLogic", "download video finish, but file size is not equals db size[%d, %d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(localr.dHI) });
      localr.dHI = paramInt;
      i = 32;
    }
    localr.enH = paramInt;
    localr.enK = bi.VE();
    d(localr);
    localr.status = 199;
    localr.bWA = (i | 0x510);
    boolean bool = e(localr);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoLogic", "END!!!  updateRecv  file:" + paramString + " newsize:" + paramInt + " total:" + localr.dHI + " status:" + localr.status + " netTimes:" + localr.enO + " update ret: " + bool);
    return bool;
  }
  
  public static void V(String paramString, int paramInt)
  {
    paramString = nW(paramString);
    if (paramString != null)
    {
      paramString.status = 122;
      paramString.enL = bi.VE();
      paramString.enK = bi.VE();
      paramString.dQo = paramInt;
      paramString.bWA = 268438784;
      boolean bool = o.Ta().b(paramString);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoLogic", "set online video Completion ret: " + bool + " status: " + paramString.status);
    }
  }
  
  public static boolean W(String paramString, int paramInt)
  {
    return b(nW(paramString), paramInt);
  }
  
  public static long a(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    long l;
    if (bi.oW(paramString1))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.VideoLogic", "do prepare, but file name is null, type %d", new Object[] { Integer.valueOf(paramInt) });
      l = -1L;
      return l;
    }
    if (bi.oW(paramString2))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.VideoLogic", "do prepare, but toUser is null, type %d", new Object[] { Integer.valueOf(paramInt) });
      return -1L;
    }
    r localr = new r();
    localr.fileName = paramString1;
    localr.enM = 1;
    localr.bWJ = paramString2;
    localr.enF = ((String)com.tencent.mm.kernel.g.Ei().DT().get(2, ""));
    localr.createTime = bi.VE();
    localr.enK = bi.VE();
    localr.enS = null;
    localr.elu = paramString3;
    if (!bi.oW(paramString3)) {
      localr.enQ = 1;
    }
    int i;
    if (62 == paramInt)
    {
      localr.enQ = 0;
      i = 3;
    }
    for (;;)
    {
      localr.enT = i;
      localr.dHI = 0;
      localr.status = 106;
      paramString2 = new com.tencent.mm.storage.bd();
      paramString2.ep(localr.Tj());
      paramString2.setType(paramInt);
      paramString2.eX(1);
      paramString2.eq(paramString1);
      paramString2.setStatus(8);
      paramString2.ay(com.tencent.mm.model.bd.iD(localr.Tj()));
      l = com.tencent.mm.model.bd.i(paramString2);
      localr.enN = ((int)l);
      if (o.Ta().a(localr)) {
        break;
      }
      return -1L;
      if (localr.enQ == 0) {
        i = 1;
      } else {
        i = -1;
      }
    }
  }
  
  public static boolean a(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, String paramString4, int paramInt3)
  {
    return a(paramString1, paramInt1, paramString2, paramString3, paramInt2, paramString4, paramInt3, null, "");
  }
  
  public static boolean a(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, String paramString4, int paramInt3, bri parambri, String paramString5)
  {
    r localr = new r();
    localr.fileName = paramString1;
    localr.enM = paramInt1;
    localr.bWJ = paramString2;
    localr.enF = ((String)com.tencent.mm.kernel.g.Ei().DT().get(2, ""));
    localr.createTime = bi.VE();
    localr.enK = bi.VE();
    localr.enS = paramString4;
    localr.elu = paramString3;
    localr.enV = parambri;
    localr.bZN = paramString5;
    if (!bi.oW(paramString3)) {
      localr.enQ = 1;
    }
    if (paramInt2 > 0) {
      localr.enQ = 1;
    }
    if (62 == paramInt3) {
      localr.enT = 3;
    }
    for (;;)
    {
      o.Ta();
      paramInt1 = s.nM(s.nK(paramString1));
      if (paramInt1 > 0) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoLogic", "get Video size failed :" + paramString1);
      return false;
      if (paramInt2 > 0) {
        localr.enT = 2;
      } else {
        localr.enT = 1;
      }
    }
    localr.dHI = paramInt1;
    o.Ta();
    paramString2 = s.nL(paramString1);
    paramInt1 = s.nM(paramString2);
    if (paramInt1 <= 0)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoLogic", "get Thumb size failed :" + paramString2 + " size:" + paramInt1);
      return false;
    }
    localr.enJ = paramInt1;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoLogic", "init record file:" + paramString1 + " thumbsize:" + localr.enJ + " videosize:" + localr.dHI + " msgType:" + paramInt3);
    localr.status = 102;
    paramString2 = new com.tencent.mm.storage.bd();
    paramString2.ep(localr.Tj());
    paramString2.setType(paramInt3);
    paramString2.eX(1);
    paramString2.eq(paramString1);
    paramString2.setStatus(1);
    paramString2.ay(com.tencent.mm.model.bd.iD(localr.Tj()));
    localr.enN = ((int)com.tencent.mm.model.bd.i(paramString2));
    return o.Ta().a(localr);
  }
  
  /* Error */
  public static boolean a(String paramString, PInt paramPInt1, PInt paramPInt2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 143	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   4: ifeq +13 -> 17
    //   7: ldc 12
    //   9: ldc_w 286
    //   12: invokestatic 288	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   15: iconst_0
    //   16: ireturn
    //   17: new 290	android/media/MediaMetadataRetriever
    //   20: dup
    //   21: invokespecial 291	android/media/MediaMetadataRetriever:<init>	()V
    //   24: astore 4
    //   26: aload 4
    //   28: astore_3
    //   29: aload 4
    //   31: aload_0
    //   32: invokevirtual 294	android/media/MediaMetadataRetriever:setDataSource	(Ljava/lang/String;)V
    //   35: aload 4
    //   37: astore_3
    //   38: aload_1
    //   39: aload 4
    //   41: bipush 9
    //   43: invokevirtual 298	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   46: iconst_0
    //   47: invokestatic 302	com/tencent/mm/sdk/platformtools/bi:getInt	(Ljava/lang/String;I)I
    //   50: i2l
    //   51: invokestatic 306	com/tencent/mm/sdk/platformtools/bi:ge	(J)I
    //   54: putfield 311	com/tencent/mm/pointers/PInt:value	I
    //   57: aload 4
    //   59: astore_3
    //   60: aload_2
    //   61: aload 4
    //   63: bipush 20
    //   65: invokevirtual 298	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   68: iconst_0
    //   69: invokestatic 302	com/tencent/mm/sdk/platformtools/bi:getInt	(Ljava/lang/String;I)I
    //   72: sipush 1000
    //   75: idiv
    //   76: putfield 311	com/tencent/mm/pointers/PInt:value	I
    //   79: aload 4
    //   81: invokevirtual 314	android/media/MediaMetadataRetriever:release	()V
    //   84: ldc 12
    //   86: ldc_w 316
    //   89: iconst_3
    //   90: anewarray 4	java/lang/Object
    //   93: dup
    //   94: iconst_0
    //   95: aload_2
    //   96: getfield 311	com/tencent/mm/pointers/PInt:value	I
    //   99: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   102: aastore
    //   103: dup
    //   104: iconst_1
    //   105: aload_1
    //   106: getfield 311	com/tencent/mm/pointers/PInt:value	I
    //   109: invokestatic 55	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   112: aastore
    //   113: dup
    //   114: iconst_2
    //   115: aload_0
    //   116: aastore
    //   117: invokestatic 318	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   120: iconst_1
    //   121: ireturn
    //   122: astore 5
    //   124: aconst_null
    //   125: astore 4
    //   127: aload 4
    //   129: astore_3
    //   130: ldc 12
    //   132: aload 5
    //   134: ldc_w 320
    //   137: iconst_1
    //   138: anewarray 4	java/lang/Object
    //   141: dup
    //   142: iconst_0
    //   143: aload_0
    //   144: aastore
    //   145: invokestatic 324	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   148: aload 4
    //   150: ifnull -66 -> 84
    //   153: aload 4
    //   155: invokevirtual 314	android/media/MediaMetadataRetriever:release	()V
    //   158: goto -74 -> 84
    //   161: astore_0
    //   162: aconst_null
    //   163: astore_3
    //   164: aload_3
    //   165: ifnull +7 -> 172
    //   168: aload_3
    //   169: invokevirtual 314	android/media/MediaMetadataRetriever:release	()V
    //   172: aload_0
    //   173: athrow
    //   174: astore_0
    //   175: goto -11 -> 164
    //   178: astore 5
    //   180: goto -53 -> 127
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	183	0	paramString	String
    //   0	183	1	paramPInt1	PInt
    //   0	183	2	paramPInt2	PInt
    //   28	141	3	localMediaMetadataRetriever1	android.media.MediaMetadataRetriever
    //   24	130	4	localMediaMetadataRetriever2	android.media.MediaMetadataRetriever
    //   122	11	5	localException1	Exception
    //   178	1	5	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   17	26	122	java/lang/Exception
    //   17	26	161	finally
    //   29	35	174	finally
    //   38	57	174	finally
    //   60	79	174	finally
    //   130	148	174	finally
    //   29	35	178	java/lang/Exception
    //   38	57	178	java/lang/Exception
    //   60	79	178	java/lang/Exception
  }
  
  public static boolean b(r paramr, int paramInt)
  {
    if (paramr != null)
    {
      paramr.dQo = paramInt;
      paramr.bWA = 268435456;
      return e(paramr);
    }
    return false;
  }
  
  public static boolean b(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    return a(paramString1, paramInt, paramString2, paramString3, 0, "", 43);
  }
  
  public static int bC(long paramLong)
  {
    Object localObject = o.Ta().bB(paramLong).iterator();
    while (((Iterator)localObject).hasNext())
    {
      r localr = (r)((Iterator)localObject).next();
      int i = localr.status;
      localr.status = 200;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VideoLogic", com.tencent.mm.compatible.util.g.Ac() + "startSend file:" + localr.getFileName() + " status:[" + i + "->" + localr.status + "]");
      localr.enL = bi.VE();
      localr.enK = bi.VE();
      localr.bWA = 3328;
      if (!e(localr))
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoLogic", "ERR on start MassSend:" + com.tencent.mm.compatible.util.g.Ac() + " update failed: " + localr.getFileName());
        return 0 - com.tencent.mm.compatible.util.g.getLine();
      }
    }
    localObject = o.Tg();
    com.tencent.mm.kernel.g.Em().H(new m.3((m)localObject));
    return 0;
  }
  
  public static void c(r paramr)
  {
    if (paramr == null) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoLogic", "video info is null");
    }
    com.tencent.mm.storage.bd localbd;
    int i;
    do
    {
      return;
      localbd = ((i)com.tencent.mm.kernel.g.l(i.class)).bcY().dW(paramr.enN);
      i = localbd.getType();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoLogic", "ashutest::updateWriteFinMsgInfo, msg type %d", new Object[] { Integer.valueOf(i) });
    } while ((43 != i) && (62 != i));
    localbd.eX(1);
    localbd.ep(paramr.Tj());
    localbd.ax(paramr.bYu);
    localbd.setStatus(2);
    localbd.setContent(p.b(paramr.Tk(), paramr.enM, false));
    ((i)com.tencent.mm.kernel.g.l(i.class)).bcY().a(paramr.enN, localbd);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VideoLogic", "[oneliang][updateWriteFinMsgInfo], msgId:%d", new Object[] { Long.valueOf(localbd.field_msgId) });
  }
  
  public static void c(String paramString, int paramInt, boolean paramBoolean)
  {
    if (bi.oW(paramString))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.VideoLogic", "noteVideoPlayHistory error filename[%s]", new Object[] { paramString });
      return;
    }
    int i = paramInt;
    if (paramInt < 0) {
      i = 0;
    }
    i /= 1000;
    long l1 = bi.VG();
    w localw;
    ContentValues localContentValues;
    long l2;
    boolean bool;
    if (!o.Td().oc(paramString))
    {
      localw = o.Td();
      int j = (int)(bi.VF() / 1000L);
      if (paramBoolean)
      {
        paramInt = 1;
        if (bi.oW(paramString)) {
          break label245;
        }
        localContentValues = new ContentValues();
        localContentValues.put("filename", paramString);
        localContentValues.put("starttime", Integer.valueOf(j));
        localContentValues.put("playduration", Integer.valueOf(i));
        localContentValues.put("downloadway", Integer.valueOf(paramInt));
        l2 = localw.diF.insert("VideoPlayHistory", "filename", localContentValues);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoPlayHistoryStorage", "insert video play history ret : " + l2);
        if (l2 <= 0L) {
          break label245;
        }
        bool = true;
      }
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VideoLogic", "noteVideoPlayHistory ret %b filename %s playDuration %d isOnlinePlay %b cost %d", new Object[] { Boolean.valueOf(bool), paramString, Integer.valueOf(i), Boolean.valueOf(paramBoolean), Long.valueOf(bi.bI(l1)) });
      return;
      paramInt = 0;
      break;
      label245:
      bool = false;
      continue;
      localw = o.Td();
      paramInt = (int)(bi.VF() / 1000L);
      if (!bi.oW(paramString))
      {
        localContentValues = new ContentValues();
        localContentValues.put("starttime", Integer.valueOf(paramInt));
        localContentValues.put("playduration", Integer.valueOf(i));
        l2 = localw.diF.update("VideoPlayHistory", localContentValues, "filename=?", new String[] { paramString });
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoPlayHistoryStorage", "update video play history ret : " + l2);
        if (l2 > 0L)
        {
          bool = true;
          continue;
        }
      }
      bool = false;
    }
  }
  
  static boolean d(r paramr)
  {
    com.tencent.mm.storage.bd localbd = ((i)com.tencent.mm.kernel.g.l(i.class)).bcY().dW(paramr.enN);
    int i = localbd.getType();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoLogic", "ashutest::update read fin msg info, msg type %d", new Object[] { Integer.valueOf(i) });
    if ((43 != i) && (62 != i)) {
      return false;
    }
    localbd.ax(paramr.bYu);
    localbd.setContent(p.b(paramr.Tk(), paramr.enM, false));
    localbd.ep(paramr.Tj());
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VideoLogic", "set msg content :" + localbd.field_content);
    ((i)com.tencent.mm.kernel.g.l(i.class)).bcY().b(paramr.bYu, localbd);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VideoLogic", "[oneliang][updateReadFinMsgInfo], msgId:%d", new Object[] { Long.valueOf(localbd.field_msgId) });
    if (localbd.cmk()) {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoLogic", "on receive sight, sightFileSize %d bytes", new Object[] { Integer.valueOf(paramr.dHI) });
    }
    return true;
  }
  
  public static int e(long paramLong, String paramString)
  {
    if (bi.oW(paramString)) {}
    for (;;)
    {
      return -1;
      try
      {
        paramString = paramString.split("_");
        if ((paramString != null) && (paramString.length == 2) && (bi.getLong(paramString[0], 0L) == paramLong))
        {
          int i = bi.getInt(paramString[1], 0);
          return i;
        }
      }
      catch (Exception paramString)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoLogic", "parseEnterVideoOpTips error: " + paramString.toString());
      }
    }
    return -1;
  }
  
  public static String e(long paramLong, int paramInt)
  {
    return paramLong + "_" + paramInt;
  }
  
  public static boolean e(r paramr)
  {
    if (paramr == null) {}
    while (((paramr.getFileName() == null) || (paramr.getFileName().length() <= 0)) && (paramr.bWA == -1)) {
      return false;
    }
    return o.Ta().b(paramr);
  }
  
  public static int f(r paramr)
  {
    if (paramr.dHI == 0) {
      return 0;
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VideoLogic", "cdntra getDownloadProgress :" + paramr.enH + " " + paramr.dHI);
    return paramr.enH * 100 / paramr.dHI;
  }
  
  public static int g(r paramr)
  {
    if (paramr.dHI == 0) {
      return 0;
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VideoLogic", "cdntra getUploadProgress :" + paramr.emu + " " + paramr.dHI);
    return paramr.emu * 100 / paramr.dHI;
  }
  
  public static void l(String paramString, int paramInt1, int paramInt2)
  {
    r localr = nW(paramString);
    if (localr == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.VideoLogic", "update, but video info is null, fileName %s, msgType %d", new Object[] { paramString, Integer.valueOf(paramInt2) });
      return;
    }
    o.Ta();
    int i = s.nM(s.nK(paramString));
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoLogic", "update, video size %d, msgType %d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt2) });
    localr.dHI = i;
    localr.enM = paramInt1;
    Object localObject = localr.enW;
    ((aso)localObject).rUO = false;
    localr.enW = ((aso)localObject);
    localr.status = 102;
    o.Ta();
    localr.enJ = s.nM(s.nL(paramString));
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoLogic", "update prepare:" + paramString + " thumbsize:" + localr.enJ);
    localr.bWA = 4512;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoLogic", "update to db, result %B, msgType %d", new Object[] { Boolean.valueOf(e(localr)), Integer.valueOf(paramInt2) });
    localObject = ((i)com.tencent.mm.kernel.g.l(i.class)).bcY().dW(localr.enN);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoLogic", "before update msgInfo, localId[%d] svrId[%d] talker[%s] type[%d] isSend[%d] imgPath[%s], status[%d] createTime[%d]", new Object[] { Long.valueOf(((cm)localObject).field_msgId), Long.valueOf(((cm)localObject).field_msgSvrId), ((cm)localObject).field_talker, Integer.valueOf(((com.tencent.mm.storage.bd)localObject).getType()), Integer.valueOf(((cm)localObject).field_isSend), ((cm)localObject).field_imgPath, Integer.valueOf(((cm)localObject).field_status), Long.valueOf(((cm)localObject).field_createTime) });
    ((com.tencent.mm.storage.bd)localObject).ep(localr.Tj());
    ((com.tencent.mm.storage.bd)localObject).setType(paramInt2);
    ((com.tencent.mm.storage.bd)localObject).eX(1);
    ((com.tencent.mm.storage.bd)localObject).eq(paramString);
    ((com.tencent.mm.storage.bd)localObject).setStatus(1);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoLogic", "after update msgInfo, localId[%d] svrId[%d] talker[%s] type[%d] isSend[%d] imgPath[%s], status[%d] createTime[%d]", new Object[] { Long.valueOf(((cm)localObject).field_msgId), Long.valueOf(((cm)localObject).field_msgSvrId), ((cm)localObject).field_talker, Integer.valueOf(((com.tencent.mm.storage.bd)localObject).getType()), Integer.valueOf(((cm)localObject).field_isSend), ((cm)localObject).field_imgPath, Integer.valueOf(((cm)localObject).field_status), Long.valueOf(((cm)localObject).field_createTime) });
    ((i)com.tencent.mm.kernel.g.l(i.class)).bcY().a(localr.enN, (com.tencent.mm.storage.bd)localObject);
  }
  
  public static boolean nO(String paramString)
  {
    if (paramString == null) {}
    do
    {
      return false;
      paramString = nW(paramString);
    } while ((paramString == null) || (paramString.enO >= 2500));
    paramString.enO += 1;
    paramString.bWA = 16384;
    return e(paramString);
  }
  
  public static boolean nP(String paramString)
  {
    h.mEJ.a(111L, 218L, 1L, false);
    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.VideoLogic", "setError file:%s stack:[%s]", new Object[] { paramString, bi.cjd() });
    o.Tf().bFf.remove(paramString);
    if (paramString == null) {
      return false;
    }
    r localr = nW(paramString);
    if (localr == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoLogic", "Set error failed file:" + paramString);
      return false;
    }
    localr.status = 198;
    localr.enK = (System.currentTimeMillis() / 1000L);
    localr.bWA = 1280;
    aso localaso = localr.enW;
    localaso.rUQ = 0;
    localr.enW = localaso;
    boolean bool = e(localr);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VideoLogic", "setError file:" + paramString + " msgid:" + localr.enN + " old stat:" + localr.status);
    if ((localr == null) || (localr.enN == 0)) {
      return bool;
    }
    paramString = ((i)com.tencent.mm.kernel.g.l(i.class)).bcY().dW(localr.enN);
    int i = paramString.getType();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoLogic", "set error, msg type %d", new Object[] { Integer.valueOf(i) });
    if ((43 != i) && (62 != i)) {
      return bool;
    }
    com.tencent.mm.plugin.report.f.mDy.a(111L, 32L, 1L, true);
    paramString.ep(localr.Tj());
    paramString.setContent(p.b(localr.Tk(), -1L, true));
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VideoLogic", "[oneliang][setError]");
    ((i)com.tencent.mm.kernel.g.l(i.class)).bcY().a(paramString.field_msgId, paramString);
    return bool;
  }
  
  public static boolean nQ(String paramString)
  {
    paramString = nW(paramString);
    if ((paramString == null) || (paramString.enN == 0)) {
      return false;
    }
    com.tencent.mm.storage.bd localbd = ((i)com.tencent.mm.kernel.g.l(i.class)).bcY().dW(paramString.enN);
    int i = localbd.getType();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoLogic", "ashutest::setBlack, msg type %d", new Object[] { Integer.valueOf(i) });
    if ((43 != i) && (62 != i)) {
      return false;
    }
    localbd.setContent(p.b(paramString.Tk(), paramString.enM, false));
    localbd.setStatus(2);
    ((i)com.tencent.mm.kernel.g.l(i.class)).bcY().a(paramString.enN, localbd);
    paramString.status = 197;
    paramString.enK = bi.VE();
    paramString.bWA = 1280;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VideoLogic", "[oneliang][setBlack]");
    return e(paramString);
  }
  
  public static int nR(String paramString)
  {
    r localr = nW(paramString);
    if (localr == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.Ac() + " getinfo failed: " + paramString);
      return 0 - com.tencent.mm.compatible.util.g.getLine();
    }
    if ((localr.status != 102) && (localr.status != 105))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.Ac() + " get status failed: " + paramString + " status:" + localr.status);
      return 0 - com.tencent.mm.compatible.util.g.getLine();
    }
    int i = localr.status;
    if ((localr.status != 102) && (localr.enJ == localr.enI)) {}
    for (localr.status = 104;; localr.status = 103)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VideoLogic", com.tencent.mm.compatible.util.g.Ac() + "startSend file:" + paramString + " status:[" + i + "->" + localr.status + "]");
      localr.enL = bi.VE();
      localr.enK = bi.VE();
      localr.bWA = 3328;
      if (e(localr)) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.Ac() + " update failed: " + paramString);
      return 0 - com.tencent.mm.compatible.util.g.getLine();
    }
    o.Tf().run();
    return 0;
  }
  
  public static int nS(String paramString)
  {
    r localr = nW(paramString);
    if (localr == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.Ac() + " getinfo failed: " + paramString);
      return 0 - com.tencent.mm.compatible.util.g.getLine();
    }
    if ((localr.status != 111) && (localr.status != 113) && (localr.status != 121) && (localr.status != 122) && (localr.status != 123))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.Ac() + " get status failed: " + paramString + " status:" + localr.status);
      return 0 - com.tencent.mm.compatible.util.g.getLine();
    }
    localr.status = 112;
    localr.enL = bi.VE();
    localr.enK = bi.VE();
    localr.bWA = 3328;
    if (!e(localr))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.Ac() + " update failed: " + paramString);
      return 0 - com.tencent.mm.compatible.util.g.getLine();
    }
    o.Tf().Tx();
    o.Tf().run();
    return 0;
  }
  
  public static int nT(String paramString)
  {
    r localr = nW(paramString);
    if (localr == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.Ac() + " getinfo failed: " + paramString);
      return 0 - com.tencent.mm.compatible.util.g.getLine();
    }
    if ((localr.status != 112) && (localr.status != 120) && (localr.status != 122) && (localr.status != 123))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.Ac() + " get status failed: " + paramString + " status:" + localr.status);
      return 0 - com.tencent.mm.compatible.util.g.getLine();
    }
    localr.status = 113;
    localr.enK = bi.VE();
    localr.bWA = 1280;
    if (!e(localr))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.Ac() + " update failed: " + paramString);
      return 0 - com.tencent.mm.compatible.util.g.getLine();
    }
    return 0;
  }
  
  public static boolean nU(String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoLogic", "resetMsgRecv fileName : " + paramString);
    r localr = new r();
    localr.status = 112;
    localr.enK = bi.VE();
    localr.enL = bi.VE();
    localr.fileName = paramString;
    localr.bWA = 3328;
    if (!e(localr)) {
      return false;
    }
    o.Tf().run();
    return true;
  }
  
  public static boolean nV(String paramString)
  {
    r localr = nW(paramString);
    if (localr == null) {
      return false;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoLogic", "rsetMsgSend %s", new Object[] { paramString });
    paramString = localr.enW;
    if (paramString != null)
    {
      paramString.rUQ = 0;
      localr.enW = paramString;
    }
    if (localr.enI < localr.enJ) {}
    for (localr.status = 103;; localr.status = 104)
    {
      localr.createTime = bi.VE();
      localr.enK = bi.VE();
      localr.enL = bi.VE();
      localr.bWA = 536874752;
      if (!e(localr)) {
        break;
      }
      o.Tf().run();
      return true;
    }
  }
  
  public static r nW(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    return o.Ta().nI(paramString);
  }
  
  public static String nX(String paramString)
  {
    String str2 = com.tencent.mm.compatible.util.e.dgl + bi.VF() + ".mp4";
    String str1 = str2;
    if (!j.fN(paramString, str2)) {
      str1 = null;
    }
    return str1;
  }
  
  public static boolean nY(String paramString)
  {
    if (bi.oW(paramString)) {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.VideoLogic", "check short video was replaced, but filename is null.");
    }
    Object localObject;
    int i;
    int j;
    do
    {
      do
      {
        return false;
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VideoLogic", "checkShortVideoWasReplaced filename: " + paramString);
        localObject = nW(paramString);
      } while ((localObject == null) || (((r)localObject).status != 199));
      i = ((r)localObject).dHI;
      o.Ta();
      j = com.tencent.mm.a.e.cm(s.nK(paramString));
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VideoLogic", "it short video file size[%d] infoLen[%d]", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
    } while ((j <= 0) || (Math.abs(j - i) <= 16));
    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.VideoLogic", "it error short video can not retransmit. file size[%d], video info size[%d]", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
    paramString = ((r)localObject).getFileName();
    h.mEJ.a(111L, 217L, 1L, false);
    paramString = nW(paramString);
    if (paramString != null)
    {
      localObject = ((i)com.tencent.mm.kernel.g.l(i.class)).bcY().dW(paramString.enN);
      i = ((com.tencent.mm.storage.bd)localObject).getType();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VideoLogic", "ashutest::setBroken, msg type %d", new Object[] { Integer.valueOf(i) });
      if ((43 == i) || (62 == i))
      {
        ((com.tencent.mm.storage.bd)localObject).setContent(p.b(paramString.Tk(), paramString.enM, false));
        ((com.tencent.mm.storage.bd)localObject).setStatus(2);
        ((i)com.tencent.mm.kernel.g.l(i.class)).bcY().a(paramString.enN, (com.tencent.mm.storage.bd)localObject);
        paramString.status = 196;
        paramString.enK = bi.VE();
        paramString.bWA = 1280;
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VideoLogic", "[oneliang][setBroken]");
        e(paramString);
      }
    }
    return true;
  }
  
  public static void nZ(String paramString)
  {
    boolean bool = true;
    if (bi.oW(paramString)) {
      return;
    }
    if (o.Td().diF.delete("VideoPlayHistory", "filename= ?", new String[] { paramString }) > 0) {}
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VideoLogic", "delete video play history ret : " + bool + " filename : " + paramString);
      return;
      bool = false;
    }
  }
  
  public static int oa(String paramString)
  {
    r localr = nW(paramString);
    if (localr == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.Ac() + " getinfo failed: " + paramString);
      return 0 - com.tencent.mm.compatible.util.g.getLine();
    }
    if ((localr.status != 111) && (localr.status != 113) && (localr.status != 121) && (localr.status != 122) && (localr.status != 123))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.Ac() + " get status failed: " + paramString + " status:" + localr.status);
      return 0 - com.tencent.mm.compatible.util.g.getLine();
    }
    int i = 256;
    d.NP();
    if (d.NU()) {
      localr.status = 122;
    }
    for (;;)
    {
      localr.enL = bi.VE();
      localr.enK = bi.VE();
      localr.bWA = (i | 0x800 | 0x400);
      if (e(localr)) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.Ac() + " update failed: " + paramString);
      return 0 - com.tencent.mm.compatible.util.g.getLine();
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.VideoLogic", "start complete online video, but can not stream video now!");
      localr.status = 112;
      localr.enH = 0;
      i = 272;
    }
    o.Tf().Tx();
    o.Tf().run();
    return 0;
  }
  
  public static int w(int paramInt, String paramString)
  {
    long l = bi.VG();
    PInt localPInt1 = new PInt();
    PInt localPInt2 = new PInt();
    if ((o.Td().b(paramString, localPInt1, localPInt2)) && (bi.bG(localPInt1.value) < 300L)) {}
    for (int i = localPInt2.value;; i = 0)
    {
      int j;
      if (i >= 0)
      {
        j = i;
        if (i < paramInt - 1) {}
      }
      else
      {
        j = 0;
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VideoLogic", "check last play duration result[%d] startTime[%d] filename[%s] cost %d", new Object[] { Integer.valueOf(j), Integer.valueOf(localPInt1.value), paramString, Long.valueOf(bi.bI(l)) });
      return j;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/modelvideo/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */