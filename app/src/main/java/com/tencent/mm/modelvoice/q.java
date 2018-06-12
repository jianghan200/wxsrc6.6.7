package com.tencent.mm.modelvoice;

import android.database.Cursor;
import com.tencent.mm.ab.d.a;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.g.a.iu;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.j.a.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.bd.b;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public final class q
{
  private static HashMap<String, WeakReference<com.tencent.mm.ab.i>> epL = new HashMap();
  public static volatile HashMap<String, Integer> epM = new HashMap();
  public static volatile HashMap<String, Integer> epN = new HashMap();
  public static volatile HashMap<String, Integer> epO = new HashMap();
  
  public static float E(com.tencent.mm.storage.bd parambd)
  {
    if ((parambd != null) && (parambd.ckz())) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      float f2 = (float)new n(parambd.field_content).time / 1000.0F;
      float f1 = f2;
      if (f2 < 1.0F) {
        f1 = 1.0F;
      }
      return Math.round(f1 * 10.0F) / 10.0F;
    }
  }
  
  public static boolean F(com.tencent.mm.storage.bd parambd)
  {
    if ((parambd == null) || (!parambd.ckz())) {
      return false;
    }
    return new n(parambd.field_content).enG;
  }
  
  public static boolean G(com.tencent.mm.storage.bd parambd)
  {
    boolean bool = true;
    if ((parambd == null) || (!parambd.ckz()) || (parambd.field_isSend == 1)) {
      bool = false;
    }
    while (new n(parambd.field_content).time == 0L) {
      return bool;
    }
    return false;
  }
  
  public static String Gd()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    com.tencent.mm.kernel.g.Ek();
    return com.tencent.mm.kernel.g.Ei().dqp + "voice2/";
  }
  
  public static void H(com.tencent.mm.storage.bd parambd)
  {
    if ((parambd == null) || (!parambd.ckz())) {}
    Object localObject;
    do
    {
      do
      {
        return;
        localObject = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().dW(parambd.field_msgId);
      } while (((cm)localObject).field_msgId != parambd.field_msgId);
      localObject = new n(((cm)localObject).field_content);
    } while (((n)localObject).enG);
    ((n)localObject).enG = true;
    StringBuilder localStringBuilder = new StringBuilder().append(((n)localObject).enF).append(":").append(((n)localObject).time).append(":");
    if (((n)localObject).enG) {}
    for (int i = 1;; i = 0)
    {
      parambd.setContent(i + "\n");
      ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().a(parambd.field_msgId, parambd);
      return;
    }
  }
  
  public static String O(String paramString, boolean paramBoolean)
  {
    Object localObject = new g.a();
    String str = com.tencent.mm.sdk.platformtools.h.b(Gd(), "msg_", paramString, ".amr", 2);
    x.i("MicroMsg.VoiceLogic", "getAmrFullPath cost: " + ((g.a)localObject).Ad() + " " + str);
    if (bi.oW(str)) {
      localObject = null;
    }
    do
    {
      do
      {
        do
        {
          return (String)localObject;
          localObject = str;
        } while (paramBoolean);
        localObject = str;
      } while (new File(str).exists());
      paramString = TO() + paramString;
      if (new File(paramString + ".amr").exists())
      {
        j.q(paramString + ".amr", str, true);
        return str;
      }
      localObject = str;
    } while (!new File(paramString).exists());
    j.q(paramString, str, true);
    return str;
  }
  
  public static List<p> TN()
  {
    ArrayList localArrayList = null;
    Object localObject1 = m.TI();
    Object localObject2 = "SELECT FileName, User, MsgId, NetOffset, FileNowSize, TotalLen, Status, CreateTime, LastModifyTime, ClientId, VoiceLength, MsgLocalId, Human, reserved1, reserved2, MsgSource, MsgFlag, MsgSeq, MasterBufId, checksum" + " FROM voiceinfo";
    localObject2 = (String)localObject2 + " WHERE Status<97 and User!=\"_USER_FOR_THROWBOTTLE_\"   order by CreateTime";
    localObject1 = ((u)localObject1).dCZ.b((String)localObject2, null, 2);
    int j = 0;
    int i = 0;
    if (((Cursor)localObject1).moveToFirst())
    {
      localArrayList = new ArrayList();
      do
      {
        localObject2 = new p();
        ((p)localObject2).d((Cursor)localObject1);
        localArrayList.add(localObject2);
        j = i + 1;
        i = j;
      } while (((Cursor)localObject1).moveToNext());
    }
    x.d("MicroMsg.VoiceStorage", "getUnfinishInfo resCount:" + j);
    ((Cursor)localObject1).close();
    return localArrayList;
  }
  
  public static String TO()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    com.tencent.mm.kernel.g.Ek();
    return com.tencent.mm.kernel.g.Ei().dqp + "voice/";
  }
  
  public static boolean X(String paramString, int paramInt)
  {
    return m(paramString, paramInt, 0);
  }
  
  /* Error */
  public static int a(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: ldc 2
    //   4: monitorenter
    //   5: aload_1
    //   6: ifnull +12 -> 18
    //   9: aload_1
    //   10: arraylength
    //   11: istore 4
    //   13: iload 4
    //   15: ifne +12 -> 27
    //   18: iconst_0
    //   19: istore 4
    //   21: ldc 2
    //   23: monitorexit
    //   24: iload 4
    //   26: ireturn
    //   27: iload_0
    //   28: istore 4
    //   30: iload_3
    //   31: iload_2
    //   32: if_icmpge -11 -> 21
    //   35: iload_0
    //   36: aload_1
    //   37: iload_3
    //   38: iconst_0
    //   39: iadd
    //   40: baload
    //   41: iadd
    //   42: istore_0
    //   43: iload_3
    //   44: iconst_1
    //   45: iadd
    //   46: istore_3
    //   47: goto -20 -> 27
    //   50: astore_1
    //   51: ldc 2
    //   53: monitorexit
    //   54: aload_1
    //   55: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	56	0	paramInt1	int
    //   0	56	1	paramArrayOfByte	byte[]
    //   0	56	2	paramInt2	int
    //   1	46	3	i	int
    //   11	18	4	j	int
    // Exception table:
    //   from	to	target	type
    //   9	13	50	finally
  }
  
  public static int a(p paramp, byte[] paramArrayOfByte, int paramInt, String paramString1, String paramString2, d.a parama)
  {
    g.a locala = new g.a();
    p localp = m.TI().bE(paramp.bYu);
    if ((localp != null) && (localp.status == 99)) {
      return 0;
    }
    if ((((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().I(paramp.bWJ, paramp.bYu).field_msgSvrId == paramp.bYu) && (localp == null)) {
      return 0;
    }
    boolean bool1;
    String str1;
    String str2;
    int i;
    if (localp != null)
    {
      paramp.fileName = localp.fileName;
      paramp.bWA |= 0x1;
      x.d("MicroMsg.VoiceLogic", com.tencent.mm.compatible.util.g.Ac() + "checktime :" + locala.Ad());
      boolean bool2 = false;
      bool1 = bool2;
      if (paramArrayOfByte != null)
      {
        bool1 = bool2;
        if (paramArrayOfByte.length > 1)
        {
          if (localp != null) {
            x.e("MicroMsg.VoiceLogic", "Sync Voice Buf , But VoiceInfo is not new!");
          }
          str1 = paramp.eoB;
          str2 = paramp.fileName;
          i = aC(str1, str2).write(paramArrayOfByte, paramArrayOfByte.length, 0);
          if (i >= 0) {
            break label620;
          }
          x.e("MicroMsg.VoiceLogic", "Write Failed File:" + str2 + " newOffset:" + i + " voiceFormat:" + str1);
          bool1 = false;
          label258:
          paramp.epK = b(paramp.epK, paramArrayOfByte, paramArrayOfByte.length);
          paramp.bWA |= 0x80000;
        }
      }
      x.d("MicroMsg.VoiceLogic", com.tencent.mm.compatible.util.g.Ac() + "checktime :" + locala.Ad());
      paramp.enK = (System.currentTimeMillis() / 1000L);
      paramp.bWA |= 0x100;
      if (!bool1) {
        break label745;
      }
      paramp.status = 99;
    }
    for (;;)
    {
      paramp.bWA |= 0x40;
      if (localp != null) {
        break label811;
      }
      if (bool1) {
        paramp.enN = ((int)a(paramp, bool1, paramInt, paramString1, paramString2, parama));
      }
      if (parama != null)
      {
        paramp.cqa = com.tencent.mm.model.bd.c(parama);
        if (parama.dIN != null) {
          paramp.dYP = parama.dIN.rcr;
        }
      }
      x.d("MicroMsg.VoiceLogic", com.tencent.mm.compatible.util.g.Ac() + "checktime :" + locala.Ad());
      paramp.bWA = -1;
      x.d("MicroMsg.VoiceLogic", "Insert fileName:" + paramp.fileName + " stat:" + paramp.status + " net:" + paramp.emu + " total:" + paramp.dHI);
      if (m.TI().b(paramp)) {
        break label769;
      }
      x.d("MicroMsg.VoiceLogic", "Insert Error fileName:" + paramp.fileName + " stat:" + paramp.status + " net:" + paramp.emu + " total:" + paramp.dHI);
      return -2;
      paramp.fileName = u.ov(paramp.enF);
      break;
      label620:
      if (paramArrayOfByte.length != i)
      {
        x.e("MicroMsg.VoiceLogic", "Write File:" + str2 + " fileOff:" + i + " bufLen:" + paramArrayOfByte.length + " voiceFormat:" + str1);
        bool1 = false;
        break label258;
      }
      x.i("MicroMsg.VoiceLogic", "writeVoiceFile file:[" + str2 + "] + buf:" + paramArrayOfByte.length + " voiceFormat:" + str1);
      ol(str2);
      bool1 = true;
      break label258;
      label745:
      if (paramp.dHI == 0) {
        paramp.status = 5;
      } else {
        paramp.status = 6;
      }
    }
    label769:
    x.d("MicroMsg.VoiceLogic", com.tencent.mm.compatible.util.g.Ac() + "checktime :" + locala.Ad());
    if (bool1)
    {
      return 1;
      label811:
      x.d("MicroMsg.VoiceLogic", "Sync Update file:" + paramp.fileName + " stat:" + paramp.status);
      if (!a(paramp)) {
        return -44;
      }
      if (bool1)
      {
        a(paramp, parama);
        return 1;
      }
    }
    if ((localp != null) && (localp.enH == paramp.dHI))
    {
      a(localp.fileName, localp.enH, parama);
      x.w("MicroMsg.VoiceLogic", "Sync TotalLen not Change (send endflag but TotoalLen == FileLen) :" + localp.fileName);
    }
    x.i("MicroMsg.VoiceLogic", "summerbadcr setRecvSync end ret 0 and start run addMsgInfo[%s], syncWithBufSucc[%b], stack[%s]", new Object[] { parama, Boolean.valueOf(bool1), bi.cjd() });
    m.TK().run();
    return 0;
  }
  
  public static int a(String paramString1, int paramInt1, long paramLong, String paramString2, int paramInt2, int paramInt3)
  {
    int i;
    if (paramString1 == null) {
      i = -1;
    }
    p localp;
    do
    {
      return i;
      x.d("MicroMsg.VoiceLogic", "dkmsgid UpdateAfterSend file:[" + paramString1 + "] newOff:" + paramInt1 + " SvrID:" + paramLong + " clientID:" + paramString2 + " hasSendEndFlag " + paramInt2);
      localp = m.TI().ow(paramString1);
      if (localp == null) {
        return -1;
      }
      localp.emu = paramInt1;
      localp.enK = (System.currentTimeMillis() / 1000L);
      localp.bWA = 264;
      if ((bi.oW(localp.clientId)) && (paramString2 != null))
      {
        localp.clientId = paramString2;
        localp.bWA |= 0x200;
      }
      if ((localp.bYu == 0L) && (paramLong != 0L))
      {
        localp.bYu = paramLong;
        localp.bWA |= 0x4;
      }
      int j = 0;
      i = j;
      if (localp.dHI <= paramInt1)
      {
        i = j;
        if (localp.status == 3)
        {
          i = j;
          if (paramInt2 == 1)
          {
            localp.status = 99;
            localp.bWA |= 0x40;
            paramString2 = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().dW(localp.enN);
            paramString2.ep(localp.bWJ);
            paramString2.ax(localp.bYu);
            paramString2.setStatus(2);
            paramString2.setContent(n.b(localp.enF, localp.epI, false));
            paramString2.Dn(paramInt3);
            Integer localInteger = (Integer)epM.get(getFullPath(paramString1));
            if (localInteger != null)
            {
              localp.epK = localInteger.intValue();
              localp.bWA |= 0x80000;
            }
            ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().a(localp.enN, paramString2);
            x.d("MicroMsg.VoiceLogic", "END!!! updateSend  file:" + paramString1 + " total:" + localp.dHI + " status:" + localp.status + " netTimes:" + localp.enO + " msgId:" + paramString2.field_msgId);
            i = 1;
            ol(paramString1);
          }
        }
      }
    } while (a(localp));
    return -4;
  }
  
  public static int a(String paramString, int paramInt, d.a parama)
  {
    int i = -1;
    if (paramString == null) {}
    p localp;
    do
    {
      do
      {
        return i;
        localp = m.TI().ow(paramString);
      } while (localp == null);
      localp.enH = paramInt;
      localp.enK = (System.currentTimeMillis() / 1000L);
      localp.bWA = 272;
      int j = 0;
      i = j;
      if (localp.dHI > 0)
      {
        i = j;
        if (paramInt >= localp.dHI)
        {
          a(localp, parama);
          localp.status = 99;
          localp.bWA |= 0x40;
          x.d("MicroMsg.VoiceLogic", "END!!! updateRecv  file:" + paramString + " newsize:" + paramInt + " total:" + localp.dHI + " status:" + localp.status + " netTimes:" + localp.enO);
          i = 1;
          ol(paramString);
        }
      }
      x.d("MicroMsg.VoiceLogic", "updateRecv file:" + paramString + " newsize:" + paramInt + " total:" + localp.dHI + " status:" + localp.status);
    } while (a(localp));
    return -3;
  }
  
  private static long a(p paramp, boolean paramBoolean, int paramInt, String paramString1, String paramString2, d.a parama)
  {
    if (((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().dY(paramp.bYu))
    {
      x.i("MicroMsg.VoiceLogic", "[oneliang] msg svrid:%s,it is in delete msg list,may be revoke msg come first,msg info insert last,so no need to add msg info and delete voice info", new Object[] { Long.valueOf(paramp.bYu) });
      if (bi.oV(paramp.fileName).length() > 0) {
        m.TI().jy(paramp.fileName);
      }
      for (;;)
      {
        return -1L;
        x.i("MicroMsg.VoiceLogic", "[oneliang] the length of voice info file name is zero");
      }
    }
    com.tencent.mm.storage.bd localbd = new com.tencent.mm.storage.bd();
    localbd.ax(paramp.bYu);
    localbd.eq(paramp.fileName);
    localbd.ay(com.tencent.mm.model.bd.o(paramp.bWJ, paramp.createTime));
    localbd.ep(paramp.bWJ);
    int i;
    if (com.tencent.mm.model.q.gQ(paramp.enF))
    {
      i = 1;
      localbd.eX(i);
      localbd.setType(34);
      localbd.eu(paramString1);
      localbd.Dn(paramp.eoI);
      localbd.setStatus(paramInt);
      if (parama != null) {
        break label535;
      }
      paramInt = paramp.cqa;
      if (paramInt != 0)
      {
        x.i("MicroMsg.VoiceLogic", "summerbadcr createMsgInfo flag has set[%d]", new Object[] { Integer.valueOf(paramInt) });
        localbd.fg(paramInt);
        if ((localbd.field_msgId == 0L) && (localbd.field_isSend == 0) && ((paramInt & 0x2) != 0)) {
          localbd.ay(com.tencent.mm.model.bd.g(localbd.field_talker, paramp.createTime, localbd.field_msgSeq));
        }
      }
      if (paramp.dYP != 0) {
        localbd.aA(paramp.dYP);
      }
      x.i("MicroMsg.VoiceLogic", "summerbadcr insert voice addMsgInfo is null but flag[%d], msgSeq[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramp.dYP) });
      label317:
      x.i("MicroMsg.VoiceLogic", "summerbadcr create voice msg info, msgSource : %s", new Object[] { paramString2 });
      if (!bi.oW(paramString2))
      {
        localbd.dt(paramString2);
        localbd.ev(com.tencent.mm.model.bd.iG(paramString2));
      }
      if (paramBoolean) {
        break label545;
      }
      localbd.setContent(n.b(paramp.enF, 0L, false));
    }
    for (;;)
    {
      if (!bi.oW(paramString2))
      {
        localbd.dt(paramString2);
        localbd.ev(com.tencent.mm.model.bd.iG(paramString2));
        paramp = com.tencent.mm.model.bd.iF(paramString2);
        if (paramp != null)
        {
          localbd.ev(paramp.dCq);
          localbd.et(paramp.dCp);
          x.i("MicroMsg.VoiceLogic", "bizClientMsgId = %s", new Object[] { paramp.dCp });
          if (paramp.dCs != null)
          {
            paramString1 = new iu();
            paramString1.bSn.bGS = localbd;
            paramString1.bSn.bSo = paramp;
            com.tencent.mm.sdk.b.a.sFg.m(paramString1);
          }
        }
      }
      x.i("MicroMsg.VoiceLogic", "summerbadcr parseVoiceMsg svrId[%d], msgseq[%d]", new Object[] { Long.valueOf(localbd.field_msgSvrId), Long.valueOf(localbd.field_msgSeq) });
      return com.tencent.mm.model.bd.i(localbd);
      i = 0;
      break;
      label535:
      com.tencent.mm.model.bd.a(localbd, parama);
      break label317;
      label545:
      localbd.setContent(n.b(paramp.enF, paramp.epI, false));
    }
  }
  
  private static boolean a(p paramp)
  {
    if (paramp == null) {}
    while (paramp.bWA == -1) {
      return false;
    }
    return m.TI().a(paramp.fileName, paramp);
  }
  
  private static boolean a(p paramp, d.a parama)
  {
    try
    {
      paramp.enN = ((int)a(paramp, true, 3, "", paramp.cqb, parama));
      paramp.bWA |= 0x800;
      boolean bool = a(paramp);
      return bool;
    }
    catch (Exception paramp)
    {
      x.e("MicroMsg.VoiceLogic", "exception:%s", new Object[] { bi.i(paramp) });
    }
    return false;
  }
  
  public static boolean a(String paramString, com.tencent.mm.ab.i parami)
  {
    if (paramString == null) {}
    p localp;
    do
    {
      return false;
      localp = m.TI().ow(paramString);
      if (localp == null)
      {
        x.d("MicroMsg.VoiceLogic", "startSend null record : " + paramString);
        return false;
      }
    } while (localp.status != 1);
    localp.status = 2;
    localp.bWA = 64;
    epL.put(paramString, new WeakReference(parami));
    return a(localp);
  }
  
  public static b aC(String paramString1, String paramString2)
  {
    u localu = m.TI();
    paramString2 = getFullPath(paramString2);
    switch (bi.getInt(paramString1, -1))
    {
    case 2: 
    case 3: 
    default: 
      if (localu.epX.get(paramString2) == null) {
        localu.epX.put(paramString2, new a(paramString2));
      }
      return (b)localu.epX.get(paramString2);
    case 4: 
      if (localu.epZ.get(paramString2) == null) {
        localu.epZ.put(paramString2, new h(paramString2));
      }
      return (b)localu.epZ.get(paramString2);
    }
    if (localu.epY.get(paramString2) == null) {
      localu.epY.put(paramString2, new l(paramString2));
    }
    return (b)localu.epY.get(paramString2);
  }
  
  public static int b(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    int j = paramInt1;
    if (paramArrayOfByte != null)
    {
      if (paramArrayOfByte.length == 0) {
        j = paramInt1;
      }
    }
    else {
      return j;
    }
    if (paramInt1 == 0) {
      paramInt1 = paramArrayOfByte.hashCode() & 0xFF;
    }
    for (int i = paramInt1;; i = paramInt1 & 0xFF)
    {
      int k = 0;
      for (;;)
      {
        j = paramInt1;
        if (k >= paramInt2) {
          break;
        }
        paramInt1 += (paramArrayOfByte[(k + 0)] & i) * 256;
        k += 1;
      }
    }
  }
  
  public static float bD(long paramLong)
  {
    float f2 = 60.0F;
    float f1 = 1.0F;
    float f3 = (float)paramLong / 1000.0F;
    if (f3 < 1.0F) {}
    for (;;)
    {
      if (f1 > 60.0F) {
        f1 = f2;
      }
      for (;;)
      {
        return Math.round(f1);
      }
      f1 = f3;
    }
  }
  
  public static int c(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    paramString = m.TI().ow(paramString);
    if (paramString == null) {
      return -1;
    }
    paramString.epK = b(paramString.epK, paramArrayOfByte, paramInt);
    paramString.bWA |= 0x80000;
    if (a(paramString)) {
      return paramString.epK;
    }
    return 0;
  }
  
  public static String e(String paramString1, String paramString2, int paramInt)
  {
    if (bi.oW(paramString1)) {}
    do
    {
      return null;
      if ((!bi.oW(paramString2)) && (!paramString2.startsWith("amr_")) && (!paramString2.startsWith("spx_"))) {
        paramString2.startsWith("silk_");
      }
      paramString1 = om(paramString1);
    } while ((bi.oW(paramString1)) || (!j.q(getFullPath(paramString2), getFullPath(paramString1), false)));
    m(paramString1, paramInt, 1);
    return paramString1;
  }
  
  public static String getFullPath(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    return O(paramString, false);
  }
  
  public static int iF(int paramInt)
  {
    return (paramInt - 6) / 32 * 20;
  }
  
  public static boolean iG(int paramInt)
  {
    com.tencent.mm.storage.bd localbd = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().dW(paramInt);
    if ((localbd.field_msgId == 0L) || (localbd.field_imgPath == null)) {
      return false;
    }
    if (bi.oW(localbd.field_imgPath)) {
      return false;
    }
    Object localObject = localbd.field_imgPath;
    localObject = m.TI().ow((String)localObject);
    if ((localObject == null) || (bi.oW(((p)localObject).fileName))) {
      return false;
    }
    ((p)localObject).status = 3;
    ((p)localObject).emu = 0;
    ((p)localObject).createTime = (System.currentTimeMillis() / 1000L);
    ((p)localObject).enK = (System.currentTimeMillis() / 1000L);
    ((p)localObject).bWA = 8648;
    boolean bool = a((p)localObject);
    x.d("MicroMsg.VoiceLogic", " file:" + ((p)localObject).fileName + " msgid:" + ((p)localObject).enN + "  stat:" + ((p)localObject).status);
    if ((((p)localObject).enN == 0) || (bi.oW(((p)localObject).bWJ)))
    {
      x.e("MicroMsg.VoiceLogic", " failed msg id:" + ((p)localObject).enN + " user:" + ((p)localObject).bWJ);
      return bool;
    }
    localbd.setStatus(1);
    ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().a(localbd.field_msgId, localbd);
    m.TK().run();
    return true;
  }
  
  private static boolean m(String paramString, int paramInt1, int paramInt2)
  {
    if (paramString == null) {}
    p localp;
    do
    {
      return false;
      x.d("MicroMsg.VoiceLogic", "StopRecord fileName[" + paramString + "], fullPath[" + getFullPath(paramString) + "]");
      localp = m.TI().ow(paramString);
    } while (localp == null);
    if ((localp.status != 97) && (localp.status != 98)) {
      localp.status = 3;
    }
    localp.dHI = o.nM(paramString);
    if (localp.dHI <= 0)
    {
      nP(paramString);
      return false;
    }
    localp.enK = (System.currentTimeMillis() / 1000L);
    localp.epI = paramInt1;
    localp.bWA = 3424;
    com.tencent.mm.storage.bd localbd = new com.tencent.mm.storage.bd();
    localbd.ep(localp.bWJ);
    localbd.setType(34);
    localbd.eX(1);
    localbd.eq(paramString);
    if (localp.status == 97)
    {
      localbd.setStatus(2);
      localbd.setContent(n.b(localp.enF, localp.epI, false));
    }
    for (;;)
    {
      localbd.ay(com.tencent.mm.model.bd.iD(localp.bWJ));
      localbd.Dn(paramInt2);
      a.a.yw().c(localbd);
      localp.enN = ((int)com.tencent.mm.model.bd.i(localbd));
      boolean bool = a(localp);
      epL.remove(paramString);
      return bool;
      if (localp.status == 98)
      {
        localbd.setStatus(5);
        localbd.setContent(n.b(localp.enF, -1L, true));
      }
      else
      {
        localbd.setStatus(1);
        localbd.setContent(n.b(localp.enF, localp.epI, false));
      }
    }
  }
  
  public static boolean nP(String paramString)
  {
    com.tencent.mm.plugin.report.service.h.mEJ.a(111L, 234L, 1L, false);
    if (paramString == null) {
      return false;
    }
    p localp = m.TI().ow(paramString);
    if (localp == null)
    {
      x.e("MicroMsg.VoiceLogic", "Set error failed file:" + paramString);
      return false;
    }
    localp.status = 98;
    localp.enK = (System.currentTimeMillis() / 1000L);
    localp.bWA = 320;
    boolean bool = a(localp);
    x.d("MicroMsg.VoiceLogic", "setError file:" + paramString + " msgid:" + localp.enN + " old stat:" + localp.status);
    if ((localp.enN == 0) || (bi.oW(localp.bWJ)))
    {
      x.e("MicroMsg.VoiceLogic", "setError failed msg id:" + localp.enN + " user:" + localp.bWJ);
      return bool;
    }
    paramString = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().dW(localp.enN);
    com.tencent.mm.plugin.report.f.mDy.a(111L, 33L, 1L, true);
    paramString.setMsgId(localp.enN);
    paramString.setStatus(5);
    paramString.ep(localp.bWJ);
    paramString.setContent(n.b(localp.enF, -1L, true));
    ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().a(paramString.field_msgId, paramString);
    return bool;
  }
  
  public static boolean nQ(String paramString)
  {
    paramString = m.TI().ow(paramString);
    if (paramString == null) {
      return false;
    }
    if (paramString.status == 3)
    {
      com.tencent.mm.storage.bd localbd = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().dW(paramString.enN);
      localbd.setContent(n.b(paramString.enF, paramString.epI, false));
      localbd.setStatus(2);
      ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().a(paramString.enN, localbd);
    }
    paramString.status = 97;
    paramString.enK = (System.currentTimeMillis() / 1000L);
    paramString.bWA = 320;
    return a(paramString);
  }
  
  public static boolean oj(String paramString)
  {
    if (paramString == null) {}
    do
    {
      return false;
      paramString = m.TI().ow(paramString);
    } while ((paramString == null) || (paramString.enO >= 250));
    paramString.enO += 1;
    paramString.bWA = 8192;
    return a(paramString);
  }
  
  public static b ok(String paramString)
  {
    u localu = m.TI();
    String str = getFullPath(paramString);
    switch (o.oh(paramString))
    {
    default: 
      if (localu.epX.get(str) == null) {
        localu.epX.put(str, new a(str));
      }
      return (b)localu.epX.get(str);
    case 0: 
      if (localu.epX.get(str) == null) {
        localu.epX.put(str, new a(str));
      }
      return (b)localu.epX.get(str);
    case 1: 
      if (localu.epY.get(str) == null) {
        localu.epY.put(str, new l(str));
      }
      return (b)localu.epY.get(str);
    }
    if (localu.epZ.get(str) == null) {
      localu.epZ.put(str, new h(str));
    }
    return (b)localu.epZ.get(str);
  }
  
  public static void ol(String paramString)
  {
    u localu = m.TI();
    String str = getFullPath(paramString);
    switch (o.oh(paramString))
    {
    default: 
      paramString = (a)localu.epX.get(str);
      if (paramString != null)
      {
        paramString.Tz();
        localu.epX.remove(str);
      }
      break;
    }
    do
    {
      do
      {
        do
        {
          return;
          paramString = (a)localu.epX.get(str);
        } while (paramString == null);
        paramString.Tz();
        localu.epX.remove(str);
        return;
        paramString = (l)localu.epY.get(str);
      } while (paramString == null);
      paramString.Tz();
      localu.epY.remove(str);
      return;
      paramString = (h)localu.epZ.get(str);
    } while (paramString == null);
    paramString.Tz();
    localu.epZ.remove(str);
  }
  
  public static String om(String paramString)
  {
    String str = u.ov(com.tencent.mm.model.q.GF());
    p localp = new p();
    localp.fileName = str;
    localp.bWJ = paramString;
    localp.createTime = (System.currentTimeMillis() / 1000L);
    localp.clientId = str;
    localp.enK = (System.currentTimeMillis() / 1000L);
    localp.status = 1;
    localp.enF = com.tencent.mm.model.q.GF();
    localp.bWA = -1;
    if (!m.TI().b(localp)) {
      return null;
    }
    x.i("MicroMsg.VoiceLogic", "startRecord insert voicestg success");
    return str;
  }
  
  public static boolean on(String paramString)
  {
    if (paramString == null) {}
    p localp;
    do
    {
      return false;
      x.d("MicroMsg.VoiceLogic", "Mark Canceled fileName[" + paramString + "]");
      localp = m.TI().ow(paramString);
    } while (localp == null);
    localp.status = 8;
    localp.dHI = o.nM(paramString);
    localp.bWA = 96;
    return a(localp);
  }
  
  public static boolean oo(String paramString)
  {
    if (paramString == null) {
      return false;
    }
    p localp = m.TI().ow(paramString);
    if (localp == null)
    {
      x.d("MicroMsg.VoiceLogic", "cancel null download : " + paramString);
      return true;
    }
    x.d("MicroMsg.VoiceLogic", "cancel download : " + paramString + " SvrlId:" + localp.bYu);
    if (localp.bYu != 0L) {
      ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().R(localp.bWJ, localp.bYu);
    }
    return oq(paramString);
  }
  
  public static boolean op(String paramString)
  {
    if (paramString == null) {
      return false;
    }
    p localp = m.TI().ow(paramString);
    if (localp == null)
    {
      x.i("MicroMsg.VoiceLogic", "cancel null record : " + paramString);
      return true;
    }
    x.i("MicroMsg.VoiceLogic", "cancel record : " + paramString + " LocalId:" + localp.enN);
    if (localp.enN != 0) {
      ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().dX(localp.enN);
    }
    return oq(paramString);
  }
  
  public static boolean oq(String paramString)
  {
    if (bi.oW(paramString)) {
      return false;
    }
    m.TI().jy(paramString);
    ol(paramString);
    return new File(getFullPath(paramString)).delete();
  }
  
  public static boolean or(String paramString)
  {
    p localp = m.TI().ow(paramString);
    if (localp == null) {}
    do
    {
      return true;
      File localFile = new File(getFullPath(paramString));
      paramString = ok(paramString);
      if ((paramString != null) && ((paramString instanceof a)) && (Math.abs(localFile.length() - localp.dHI) == 6L))
      {
        x.i("MicroMsg.VoiceLogic", "maybe amr, ignore for the moment. %d %d", new Object[] { Long.valueOf(localFile.length()), Integer.valueOf(localp.dHI) });
        return true;
      }
      if (localFile.length() != localp.dHI)
      {
        x.e("MicroMsg.VoiceLogic", "checkChecksum fail. %d, %d", new Object[] { Long.valueOf(localFile.length()), Integer.valueOf(localp.dHI) });
        return false;
      }
      paramString = paramString.br(0, localp.dHI);
    } while ((paramString.ret != 0) || (localp.epK == 0) || (localp.epK == b(localp.epK & 0xFF, paramString.buf, paramString.bEG)));
    x.e("MicroMsg.VoiceLogic", "checkChecksum fail2. %d", new Object[] { Integer.valueOf(localp.epK) });
    return false;
  }
  
  public static com.tencent.mm.storage.bd os(String paramString)
  {
    if (paramString == null) {}
    do
    {
      return null;
      paramString = m.TI().ow(paramString);
    } while (paramString == null);
    return ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().dW(paramString.enN);
  }
  
  public static p ot(String paramString)
  {
    return m.TI().ow(paramString);
  }
  
  public static int ou(String paramString)
  {
    if (epL.get(paramString) != null)
    {
      paramString = (com.tencent.mm.ab.i)((WeakReference)epL.get(paramString)).get();
      if (paramString != null) {
        return (int)paramString.wu();
      }
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/modelvoice/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */