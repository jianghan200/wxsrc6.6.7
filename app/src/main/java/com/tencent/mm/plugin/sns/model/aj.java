package com.tencent.mm.plugin.sns.model;

import android.database.Cursor;
import com.tencent.mm.model.q;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.g.a;
import com.tencent.mm.plugin.sns.storage.h;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.storage.t;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.protocal.c.alh;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.protocal.c.bbj;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.boh;
import com.tencent.mm.protocal.c.boi;
import com.tencent.mm.protocal.c.bon;
import com.tencent.mm.protocal.c.bou;
import com.tencent.mm.protocal.c.boy;
import com.tencent.mm.protocal.c.bpg;
import com.tencent.mm.protocal.c.bpn;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.protocal.c.cj;
import com.tencent.mm.protocal.c.qc;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class aj
{
  private static Map<String, boy> nrf = new ConcurrentHashMap();
  
  public static n Mk(String paramString)
  {
    Cursor localCursor = af.byo().b(paramString, 1, false, "");
    if (localCursor.getCount() == 0)
    {
      localCursor.close();
      paramString = null;
    }
    n localn;
    do
    {
      return paramString;
      localCursor.moveToFirst();
      localn = new n();
      localn.d(localCursor);
      paramString = localn;
    } while (localCursor.isClosed());
    localCursor.close();
    return localn;
  }
  
  public static boolean Ml(String paramString)
  {
    return q.GF().equals(paramString.trim());
  }
  
  public static String Mm(String paramString)
  {
    int i = 1;
    LinkedList localLinkedList = new LinkedList();
    Object localObject = af.byu().getCursor();
    if (((Cursor)localObject).moveToFirst()) {
      do
      {
        t localt = new t();
        localt.d((Cursor)localObject);
        localLinkedList.add(bi.aG(localt.field_tagName, ""));
      } while (((Cursor)localObject).moveToNext());
    }
    ((Cursor)localObject).close();
    localObject = paramString;
    while (localLinkedList.contains(localObject))
    {
      localObject = paramString + i;
      i += 1;
    }
    return (String)localObject;
  }
  
  public static List<com.tencent.mm.plugin.sns.g.b> Mn(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    if (af.bxX()) {
      return localArrayList;
    }
    Object localObject = h.Nl(paramString);
    if (localObject == null) {
      return localArrayList;
    }
    localObject = ((n)localObject).bAJ();
    if ((((bsu)localObject).sqc == null) || (((bsu)localObject).sqc.ruA.size() == 0)) {
      return localArrayList;
    }
    localArrayList.clear();
    Iterator localIterator = ((bsu)localObject).sqc.ruA.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      ate localate = (ate)localIterator.next();
      com.tencent.mm.plugin.sns.g.b localb = new com.tencent.mm.plugin.sns.g.b();
      localb.caK = localate;
      localb.nuP = paramString;
      localb.dTR = ((bsu)localObject).lOH;
      localb.nuQ = i;
      localArrayList.add(localb);
      i += 1;
    }
    return localArrayList;
  }
  
  public static boolean O(int paramInt, boolean paramBoolean)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramBoolean)
    {
      bool1 = bool2;
      if (paramInt > 0) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  private static long a(n paramn, boy paramboy, String paramString, int paramInt)
  {
    int i = 1;
    n localn = paramn;
    if (paramn == null) {
      localn = new n();
    }
    if (!af.byn().eR(localn.field_snsId)) {
      return paramboy.rlK;
    }
    if (paramboy.smS != 0)
    {
      x.i("MicroMsg.SnsInfoStorageLogic", "hit the filter id:" + paramboy.rlK + "  " + i.eF(paramboy.rlK));
      if (localn.xb(paramInt)) {
        break label728;
      }
      localn.wZ(paramInt);
    }
    label728:
    for (paramInt = i;; paramInt = 0)
    {
      if (paramInt != 0) {
        af.byo().a(paramboy.rlK, localn);
      }
      return paramboy.rlK;
      paramn = paramboy.smO;
      x.i("MicroMsg.SnsInfoStorageLogic", "hasChange id:  %s listSize %s Stringid %s", new Object[] { Long.valueOf(paramboy.rlK), Integer.valueOf(paramn.size()), i.eF(paramboy.rlK) });
      if ((paramboy.smH == null) || (paramboy.smH.siK == null))
      {
        x.i("MicroMsg.SnsInfoStorageLogic", "object desc is null");
        return paramboy.rlK;
      }
      paramn = new String(paramboy.smH.siK.toByteArray());
      x.d("MicroMsg.SnsInfoStorageLogic", "from server %d ", new Object[] { Long.valueOf(paramboy.rlK) });
      if (bi.oW(paramn)) {
        return paramboy.rlK;
      }
      if (!localn.Nj(paramn)) {
        return paramboy.rlK;
      }
      paramboy.smY = b(paramboy.smY, localn.field_attrBuf);
      x.d("MicroMsg.SnsInfoStorageLogic", "from server xml ok %d", new Object[] { Long.valueOf(paramboy.rlK) });
      paramboy.smH.bq(new byte[0]);
      localn.field_userName = paramboy.rdS;
      localn.hK(paramboy.lOH);
      localn.field_likeFlag = paramboy.smI;
      localn.fe(paramboy.rlK);
      localn.fg(paramboy.rlK);
      localn.wZ(paramInt);
      for (;;)
      {
        try
        {
          l = bi.VG();
        }
        catch (Exception paramn)
        {
          long l;
          int j;
          x.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", paramn, "", new Object[0]);
          continue;
          i = 0;
          continue;
          localn.bBc();
          continue;
          if ((j != 1) && ((paramString.equals(paramboy.rdS)) || (paramInt != 4))) {
            continue;
          }
          localn.bAY();
          localn.c(paramn);
          localn.field_type = paramn.sqc.ruz;
          localn.field_subType = paramn.sqc.ruB;
          af.byo().a(paramboy.rlK, localn);
          return paramboy.rlK;
        }
        try
        {
          if (localn.field_type == 15)
          {
            paramn = (boy)new boy().aG(localn.field_attrBuf);
            if ((paramn != null) && (paramn.sna != null) && (paramn.sna.sdz > 0))
            {
              paramboy.sna = paramn.sna;
              x.i("MicroMsg.SnsInfoStorageLogic", "mergePreloadInfo predownload info [%d %d %s] cost[%d]", new Object[] { Integer.valueOf(paramboy.sna.sdz), Integer.valueOf(paramboy.sna.sdA), paramboy.sna.sdB, Long.valueOf(bi.bI(l)) });
            }
          }
        }
        catch (Exception paramn)
        {
          x.e("MicroMsg.SnsInfoStorageLogic", "mergePreloadInfo error %s", new Object[] { paramn.toString() });
        }
      }
      localn.aK(paramboy.toByteArray());
      paramn = localn.bAJ();
      paramn.hbL = paramboy.rdS;
      j = paramn.rVG;
      localn.field_pravited = j;
      x.i("MicroMsg.SnsInfoStorageLogic", "ext flag %s  extflag %s", new Object[] { Long.valueOf(paramboy.rlK), Integer.valueOf(paramboy.rXx) });
      if ((paramboy.rXx & 0x1) > 0)
      {
        i = 1;
        if (i == 0) {
          continue;
        }
        localn.bBb();
        if ((j != 1) || (paramInt == 4)) {
          continue;
        }
        x.e("MicroMsg.SnsInfoStorageLogic", "svr error push me the private pic in timelnie or others");
        return 0L;
      }
    }
  }
  
  public static ate a(n paramn, int paramInt)
  {
    if (af.bxX()) {}
    do
    {
      do
      {
        return null;
      } while (paramn == null);
      paramn = paramn.bAJ();
    } while ((paramn.sqc == null) || (paramn.sqc.ruA.size() == 0) || (paramn.sqc.ruA.size() <= paramInt));
    return (ate)paramn.sqc.ruA.get(paramInt);
  }
  
  public static ate a(n paramn, String paramString)
  {
    paramn = paramn.bAJ();
    if ((paramn.sqc == null) || (paramn.sqc.ruA.size() == 0)) {
      return null;
    }
    paramn = paramn.sqc.ruA.iterator();
    while (paramn.hasNext())
    {
      ate localate = (ate)paramn.next();
      if (localate.ksA.equals(paramString)) {
        return localate;
      }
    }
    return null;
  }
  
  public static List<n> a(String paramString1, boolean paramBoolean1, String paramString2, boolean paramBoolean2)
  {
    if (paramBoolean2) {}
    for (paramString1 = af.byo().b(paramString1, 10, paramBoolean1, paramString2);; paramString1 = af.byo().b(paramString1, 0, paramBoolean1, paramString2))
    {
      paramString2 = new ArrayList();
      if (paramString1.getCount() != 0) {
        break;
      }
      paramString1.close();
      return paramString2;
    }
    if (paramString1.moveToFirst()) {
      do
      {
        n localn = new n();
        localn.d(paramString1);
        paramString2.add(localn);
      } while (paramString1.moveToNext());
    }
    paramString1.close();
    return paramString2;
  }
  
  public static void a(String paramString1, int paramInt, LinkedList<boy> paramLinkedList, String paramString2)
  {
    if ((paramLinkedList == null) || (paramLinkedList.isEmpty())) {
      return;
    }
    Object localObject3 = af.byo();
    ArrayList localArrayList = new ArrayList();
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    Object localObject2;
    while (i < paramLinkedList.size())
    {
      boy localboy = (boy)paramLinkedList.get(i);
      localObject2 = ((o)localObject3).fi(localboy.rlK);
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = new n();
      }
      if (a((n)localObject1, localboy, paramString1, paramInt) != 0L)
      {
        if ((localLinkedList.size() < 3) && ((((n)localObject1).field_type == 1) || (((n)localObject1).field_type == 15))) {
          localLinkedList.add(i.eF(((n)localObject1).field_snsId));
        }
        localArrayList.add(Long.valueOf(localboy.rlK));
      }
      i += 1;
    }
    if (((paramInt == 4) || (paramInt == 8)) && (paramString2.equals("")))
    {
      localObject1 = af.bys().Np(paramString1);
      if (localObject1 != null)
      {
        localObject1 = ((l)localObject1).field_newerIds;
        localObject1 = bi.F(bi.aG((String)localObject1, "").split(","));
        x.d("MicroMsg.SnsInfoStorageLogic", "newerIds " + cg(localLinkedList));
        label258:
        do
        {
          if ((localLinkedList.size() >= 3) || (((List)localObject1).size() <= 0)) {
            break;
          }
          localObject2 = (String)((List)localObject1).remove(0);
        } while (localObject2 == null);
        i = 0;
      }
      for (;;)
      {
        if (i < localLinkedList.size())
        {
          localObject3 = (String)localLinkedList.get(i);
          if (((String)localObject2).compareTo((String)localObject3) != 0)
          {
            if (((String)localObject2).compareTo((String)localObject3) <= 0) {
              break label388;
            }
            localLinkedList.add(0, localObject2);
          }
        }
        if (localLinkedList.contains(localObject2)) {
          break label258;
        }
        localLinkedList.add(localObject2);
        break label258;
        localObject1 = "";
        break;
        label388:
        i += 1;
      }
      x.i("MicroMsg.SnsInfoStorageLogic", "merge newerIds " + cg(localLinkedList));
      af.bys().eM(paramString1, cg(localLinkedList));
    }
    Object localObject1 = i.LK(i.eF(((boy)paramLinkedList.getLast()).rlK));
    x.d("MicroMsg.SnsInfoStorageLogic", "FIlTER SEQ :: " + paramString2 + "  -  " + (String)localObject1);
    if (paramInt == 2)
    {
      localObject2 = af.byo();
      paramLinkedList = o.bBw();
      if (paramString2 != null)
      {
        paramString1 = paramLinkedList;
        if (paramString2.equals("")) {}
      }
      else
      {
        paramString1 = paramLinkedList + " AND " + ((o)localObject2).Nx(paramString2);
      }
      paramLinkedList = paramString1;
      if (o.Nt((String)localObject1)) {
        paramLinkedList = paramString1 + " AND " + ((o)localObject2).Nu((String)localObject1);
      }
      x.d("MicroMsg.SnsInfoStorage", "getCursorByUserSeq " + paramLinkedList);
      paramString1 = ((o)localObject2).diF.rawQuery(paramLinkedList, null);
      label623:
      if (paramString1 != null)
      {
        if (paramString1.moveToFirst()) {
          break label788;
        }
        paramString1.close();
      }
    }
    else
    {
      localObject2 = af.byo();
      if (paramInt != 4) {
        break label782;
      }
    }
    label782:
    for (boolean bool = true;; bool = false)
    {
      paramLinkedList = o.aV(paramString1, bool);
      paramString1 = paramLinkedList;
      if (o.Nt(paramString2)) {
        paramString1 = paramLinkedList + " AND " + ((o)localObject2).Nx(paramString2);
      }
      paramLinkedList = paramString1;
      if (o.Nt((String)localObject1)) {
        paramLinkedList = paramString1 + " AND " + ((o)localObject2).Nu((String)localObject1);
      }
      x.d("MicroMsg.SnsInfoStorage", "getCursorByUserSeq " + paramLinkedList);
      paramString1 = ((o)localObject2).diF.rawQuery(paramLinkedList, null);
      break label623;
      break;
    }
    for (;;)
    {
      label788:
      paramLinkedList = new n();
      paramLinkedList.d(paramString1);
      long l = paramLinkedList.field_snsId;
      if (paramLinkedList.bBf()) {
        x.d("MicroMsg.SnsInfoStorageLogic", "uploading one ");
      }
      while (!paramString1.moveToNext())
      {
        paramString1.close();
        return;
        if (paramLinkedList.bBg())
        {
          x.d("MicroMsg.SnsInfoStorageLogic", "die one ");
        }
        else if (!localArrayList.contains(Long.valueOf(l)))
        {
          paramLinkedList.xc(paramInt);
          af.byo().b(l, paramLinkedList);
          x.i("MicroMsg.SnsInfoStorageLogic", "removeSourceFlag sns Id " + l + " source " + paramInt);
        }
      }
    }
  }
  
  public static boolean a(long paramLong, boi paramboi)
  {
    boh localboh = paramboi.smo;
    if ((localboh.hcE != 1) && (localboh.hcE != 2)) {
      return true;
    }
    n localn = af.byo().fi(paramLong);
    if (localn == null) {
      return true;
    }
    if ((localn.field_type == 21) && (!com.tencent.mm.plugin.sns.lucky.a.g.bxd()))
    {
      x.i("MicroMsg.SnsInfoStorageLogic", "passed because close lucky");
      return false;
    }
    try
    {
      boy localboy = (boy)new boy().aG(localn.field_attrBuf);
      localboy.rlK = paramLong;
      Iterator localIterator;
      bon localbon;
      if (localboh.hcE == 1)
      {
        localIterator = localboy.smL.iterator();
        while (localIterator.hasNext())
        {
          localbon = (bon)localIterator.next();
          if ((localbon.lOH == localboh.lOH) && (localbon.rdS.equals(localboh.seC))) {
            return true;
          }
        }
        localboy.smL.add(ad.a(paramboi));
      }
      for (;;)
      {
        localn.aK(localboy.toByteArray());
        af.byo().a(localboy.rlK, localn);
        break;
        if (localboh.hcE == 2)
        {
          localIterator = localboy.smO.iterator();
          while (localIterator.hasNext())
          {
            localbon = (bon)localIterator.next();
            if ((localbon.lOH == localboh.lOH) && (localbon.rdS.equals(localboh.seC))) {
              return true;
            }
          }
          localboy.smO.add(ad.a(paramboi));
        }
      }
      return true;
    }
    catch (Exception paramboi)
    {
      x.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", paramboi, "", new Object[0]);
    }
  }
  
  public static bhy b(bhy parambhy, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {}
    bhy localbhy;
    do
    {
      try
      {
        localbhy = ((boy)new boy().aG(paramArrayOfByte)).smY;
      }
      catch (Exception parambhy)
      {
        bpg localbpg;
        x.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", parambhy, "", new Object[0]);
        return null;
      }
      localbpg = new bpg();
      paramArrayOfByte = localbpg;
      if (localbhy != null) {
        paramArrayOfByte = (bpg)localbpg.aG(localbhy.siK.lR);
      }
      parambhy = (bpg)new bpg().aG(parambhy.siK.lR);
      if (parambhy.snn == null) {
        parambhy.snn = paramArrayOfByte.snn;
      }
      if (paramArrayOfByte.snm == null) {
        parambhy.snm = null;
      }
      for (;;)
      {
        parambhy = parambhy.toByteArray();
        return new bhy().bq(parambhy);
        if (parambhy.snm == null)
        {
          parambhy.snm = paramArrayOfByte.snm;
          continue;
          localbhy = null;
        }
      }
    } while (parambhy != null);
    return localbhy;
  }
  
  public static void b(long paramLong, boi paramboi)
  {
    paramboi = paramboi.smo;
    if (paramboi.hcE != 9) {}
    n localn;
    do
    {
      return;
      localn = af.byo().fi(paramLong);
    } while (localn == null);
    try
    {
      boy localboy = (boy)new boy().aG(localn.field_attrBuf);
      localboy.rlK = paramLong;
      Iterator localIterator = localboy.smO.iterator();
      while (localIterator.hasNext())
      {
        bon localbon = (bon)localIterator.next();
        if ((localbon.smh == paramboi.smh) && (!bi.oW(localbon.rdS)) && (localbon.rdS.equals(paramboi.seC))) {
          localboy.smO.remove(localbon);
        }
      }
      localn.aK(localboy.toByteArray());
      af.byo().a(localboy.rlK, localn);
      return;
    }
    catch (Exception paramboi)
    {
      x.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", paramboi, "", new Object[0]);
    }
  }
  
  public static void byG()
  {
    if (nrf != null) {
      nrf.clear();
    }
  }
  
  public static List<n> byH()
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = af.byo();
    Object localObject2 = o.bBx() + " AND " + o.nJy + " AND  (snsId = 0  ) ";
    localObject1 = ((o)localObject1).diF.rawQuery((String)localObject2, null);
    if (((Cursor)localObject1).getCount() == 0)
    {
      ((Cursor)localObject1).close();
      return localArrayList;
    }
    ((Cursor)localObject1).moveToFirst();
    do
    {
      localObject2 = new n();
      ((n)localObject2).d((Cursor)localObject1);
      localArrayList.add(localObject2);
    } while (((Cursor)localObject1).moveToNext());
    ((Cursor)localObject1).close();
    return localArrayList;
  }
  
  public static void byI()
  {
    Cursor localCursor = af.byo().ch("", 0);
    if (localCursor != null)
    {
      x.i("MicroMsg.SnsInfoStorageLogic", "all timeline snsId begin");
      while (localCursor.moveToNext())
      {
        n localn = new n();
        localn.d(localCursor);
        x.i("MicroMsg.SnsInfoStorageLogic", localn.bAK());
      }
      x.i("MicroMsg.SnsInfoStorageLogic", "all timeline snsId end");
      localCursor.close();
    }
  }
  
  public static void c(long paramLong, boi paramboi)
  {
    paramboi = paramboi.smo;
    if (paramboi.hcE != 13) {}
    n localn;
    do
    {
      return;
      localn = af.byo().fi(paramLong);
    } while (localn == null);
    try
    {
      boy localboy = (boy)new boy().aG(localn.field_attrBuf);
      localboy.rlK = paramLong;
      if (localboy.smZ == null) {
        localboy.smZ = new bpn();
      }
      if (paramboi.hcE == 13)
      {
        Object localObject = localboy.smZ.snC.iterator();
        while (((Iterator)localObject).hasNext()) {
          if (((bou)((Iterator)localObject).next()).rdS.equals(paramboi.seC)) {
            return;
          }
        }
        localObject = new bou();
        ((bou)localObject).sml = paramboi.sml;
        ((bou)localObject).lOH = paramboi.lOH;
        ((bou)localObject).rdS = paramboi.seC;
        localboy.smZ.snC.add(localObject);
        localboy.smZ.snB = localboy.smZ.snC.size();
      }
      localn.aK(localboy.toByteArray());
      af.byo().a(localboy.rlK, localn);
      return;
    }
    catch (Exception paramboi)
    {
      x.e("MicroMsg.SnsInfoStorageLogic", "error for update hbaction " + paramboi.getMessage());
      x.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", paramboi, "", new Object[0]);
    }
  }
  
  private static String cg(List<String> paramList)
  {
    Iterator localIterator = paramList.iterator();
    paramList = "";
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (paramList.length() == 0) {
        paramList = str;
      } else {
        paramList = paramList + "," + str;
      }
    }
    return paramList;
  }
  
  public static List<com.tencent.mm.plugin.sns.g.b> ch(List<String> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramList == null) {
      return localArrayList;
    }
    localArrayList.clear();
    paramList = paramList.iterator();
    int i = 0;
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      com.tencent.mm.plugin.sns.g.b localb = new com.tencent.mm.plugin.sns.g.b();
      ate localate = new ate();
      localate.ksA = ("pre_temp_extend_pic" + str);
      localb.caK = localate;
      localb.nuP = "";
      localb.nuQ = i;
      localArrayList.add(localb);
      i += 1;
    }
    return localArrayList;
  }
  
  public static long d(boy paramboy)
  {
    n localn2 = af.byo().fi(paramboy.rlK);
    n localn1 = localn2;
    if (localn2 == null) {
      localn1 = new n();
    }
    return a(localn1, paramboy, "", 0);
  }
  
  public static List<com.tencent.mm.plugin.sns.g.b> ey(String paramString1, String paramString2)
  {
    int i = 0;
    localArrayList = new ArrayList();
    Object localObject1 = null;
    try
    {
      Object localObject2 = paramString2 + paramString1 + "_ARTISTF.mm";
      Object localObject3 = paramString2 + paramString1 + "_ARTIST.mm";
      paramString1 = (String)localObject1;
      if (FileOp.cn((String)localObject2))
      {
        paramString1 = FileOp.e((String)localObject2, 0, (int)FileOp.mI((String)localObject2));
        paramString1 = (cj)new cj().aG(paramString1);
      }
      paramString2 = paramString1;
      if (paramString1 == null)
      {
        FileOp.deleteFile((String)localObject2);
        paramString2 = a.MP(new String(FileOp.e((String)localObject3, 0, (int)FileOp.mI((String)localObject3))));
        FileOp.b((String)localObject2, paramString2.toByteArray(), -1);
      }
      paramString1 = paramString2.rcM.iterator();
      if (paramString1.hasNext())
      {
        localObject1 = (alh)paramString1.next();
        paramString2 = ((alh)localObject1).jPe;
        localObject1 = ((alh)localObject1).ruA.iterator();
        int j = i;
        for (;;)
        {
          i = j;
          if (!((Iterator)localObject1).hasNext()) {
            break;
          }
          localObject2 = (ate)((Iterator)localObject1).next();
          ((ate)localObject2).jOS = paramString2;
          localObject3 = new com.tencent.mm.plugin.sns.g.b();
          ((com.tencent.mm.plugin.sns.g.b)localObject3).caK = ((ate)localObject2);
          ((com.tencent.mm.plugin.sns.g.b)localObject3).nuP = "";
          ((com.tencent.mm.plugin.sns.g.b)localObject3).nuQ = j;
          localArrayList.add(localObject3);
          j += 1;
        }
      }
      return localArrayList;
    }
    catch (Exception paramString1)
    {
      x.e("MicroMsg.SnsInfoStorageLogic", "error initDataArtist");
    }
  }
  
  public static boy m(n paramn)
  {
    try
    {
      paramn = (boy)new boy().aG(paramn.field_attrBuf);
      paramn = af.byn().c(paramn);
      nrf.clear();
      return paramn;
    }
    catch (Exception paramn)
    {
      x.e("MicroMsg.SnsInfoStorageLogic", "SnsObject parseFrom error");
      x.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", paramn, "", new Object[0]);
    }
    return new boy();
  }
  
  public static boy n(n paramn)
  {
    try
    {
      if (paramn.nJb == null) {
        paramn.nJb = (com.tencent.mm.a.g.u(paramn.field_content) + com.tencent.mm.a.g.u(paramn.field_attrBuf));
      }
      if (nrf.containsKey(paramn.nJb))
      {
        localboy = (boy)nrf.get(paramn.nJb);
        if (localboy != null)
        {
          af.byn().c(localboy);
          return localboy;
        }
      }
      boy localboy = (boy)new boy().aG(paramn.field_attrBuf);
      nrf.put(paramn.nJb, localboy);
      af.byn().c(localboy);
      return localboy;
    }
    catch (Exception paramn)
    {
      x.e("MicroMsg.SnsInfoStorageLogic", "SnsObject parseFrom error");
      x.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", paramn, "", new Object[0]);
    }
    return new boy();
  }
  
  /* Error */
  public static boolean wx(int paramInt)
  {
    // Byte code:
    //   0: ldc -28
    //   2: new 115	java/lang/StringBuilder
    //   5: dup
    //   6: ldc_w 776
    //   9: invokespecial 233	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   12: iload_0
    //   13: invokevirtual 123	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   16: invokevirtual 126	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   19: invokestatic 491	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   22: invokestatic 25	com/tencent/mm/plugin/sns/model/af:byo	()Lcom/tencent/mm/plugin/sns/storage/o;
    //   25: iload_0
    //   26: invokevirtual 780	com/tencent/mm/plugin/sns/storage/o:xd	(I)Lcom/tencent/mm/plugin/sns/storage/n;
    //   29: astore 6
    //   31: aload 6
    //   33: ifnonnull +5 -> 38
    //   36: iconst_0
    //   37: ireturn
    //   38: aload 6
    //   40: invokevirtual 783	com/tencent/mm/plugin/sns/storage/n:bBh	()V
    //   43: aload 6
    //   45: invokestatic 788	java/lang/System:currentTimeMillis	()J
    //   48: ldc2_w 789
    //   51: ldiv
    //   52: l2i
    //   53: invokevirtual 337	com/tencent/mm/plugin/sns/storage/n:hK	(I)V
    //   56: aconst_null
    //   57: astore 5
    //   59: new 792	com/tencent/mm/protocal/c/atf
    //   62: dup
    //   63: invokespecial 793	com/tencent/mm/protocal/c/atf:<init>	()V
    //   66: aload 6
    //   68: getfield 796	com/tencent/mm/plugin/sns/storage/n:field_postBuf	[B
    //   71: invokevirtual 797	com/tencent/mm/protocal/c/atf:aG	([B)Lcom/tencent/mm/bk/a;
    //   74: checkcast 792	com/tencent/mm/protocal/c/atf
    //   77: astore_3
    //   78: aload_3
    //   79: iconst_0
    //   80: putfield 800	com/tencent/mm/protocal/c/atf:dHg	I
    //   83: aload_3
    //   84: invokestatic 788	java/lang/System:currentTimeMillis	()J
    //   87: putfield 803	com/tencent/mm/protocal/c/atf:rWf	J
    //   90: aload 6
    //   92: aload_3
    //   93: invokevirtual 804	com/tencent/mm/protocal/c/atf:toByteArray	()[B
    //   96: putfield 796	com/tencent/mm/plugin/sns/storage/n:field_postBuf	[B
    //   99: aload_3
    //   100: ifnull -64 -> 36
    //   103: invokestatic 25	com/tencent/mm/plugin/sns/model/af:byo	()Lcom/tencent/mm/plugin/sns/storage/o;
    //   106: iload_0
    //   107: aload 6
    //   109: invokevirtual 807	com/tencent/mm/plugin/sns/storage/o:b	(ILcom/tencent/mm/plugin/sns/storage/n;)I
    //   112: pop
    //   113: iconst_0
    //   114: istore_0
    //   115: iload_0
    //   116: aload_3
    //   117: getfield 810	com/tencent/mm/protocal/c/atf:rWc	Ljava/util/LinkedList;
    //   120: invokevirtual 158	java/util/LinkedList:size	()I
    //   123: if_icmpge +144 -> 267
    //   126: aload_3
    //   127: getfield 810	com/tencent/mm/protocal/c/atf:rWc	Ljava/util/LinkedList;
    //   130: iload_0
    //   131: invokevirtual 441	java/util/LinkedList:get	(I)Ljava/lang/Object;
    //   134: checkcast 812	com/tencent/mm/protocal/c/ari
    //   137: getfield 815	com/tencent/mm/protocal/c/ari:rTF	I
    //   140: istore_1
    //   141: invokestatic 819	com/tencent/mm/plugin/sns/model/af:byd	()Lcom/tencent/mm/plugin/sns/storage/s;
    //   144: iload_1
    //   145: i2l
    //   146: invokevirtual 825	com/tencent/mm/plugin/sns/storage/s:fj	(J)Lcom/tencent/mm/plugin/sns/storage/r;
    //   149: astore 4
    //   151: aload 4
    //   153: ifnull +39 -> 192
    //   156: aload 4
    //   158: iconst_0
    //   159: putfield 830	com/tencent/mm/plugin/sns/storage/r:offset	I
    //   162: new 832	com/tencent/mm/protocal/c/ath
    //   165: dup
    //   166: invokespecial 833	com/tencent/mm/protocal/c/ath:<init>	()V
    //   169: aload 4
    //   171: getfield 836	com/tencent/mm/plugin/sns/storage/r:nJM	[B
    //   174: invokevirtual 837	com/tencent/mm/protocal/c/ath:aG	([B)Lcom/tencent/mm/bk/a;
    //   177: checkcast 832	com/tencent/mm/protocal/c/ath
    //   180: astore 5
    //   182: aload 5
    //   184: getfield 840	com/tencent/mm/protocal/c/ath:rWA	I
    //   187: istore_2
    //   188: iload_2
    //   189: ifne +31 -> 220
    //   192: iload_0
    //   193: iconst_1
    //   194: iadd
    //   195: istore_0
    //   196: goto -81 -> 115
    //   199: astore 4
    //   201: aload 5
    //   203: astore_3
    //   204: ldc -28
    //   206: aload 4
    //   208: ldc 27
    //   210: iconst_0
    //   211: anewarray 4	java/lang/Object
    //   214: invokestatic 417	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   217: goto -118 -> 99
    //   220: aload 5
    //   222: iconst_2
    //   223: putfield 840	com/tencent/mm/protocal/c/ath:rWA	I
    //   226: aload 5
    //   228: ldc 27
    //   230: putfield 843	com/tencent/mm/protocal/c/ath:rWB	Ljava/lang/String;
    //   233: aload 4
    //   235: aload 5
    //   237: invokevirtual 844	com/tencent/mm/protocal/c/ath:toByteArray	()[B
    //   240: putfield 836	com/tencent/mm/plugin/sns/storage/r:nJM	[B
    //   243: invokestatic 819	com/tencent/mm/plugin/sns/model/af:byd	()Lcom/tencent/mm/plugin/sns/storage/s;
    //   246: iload_1
    //   247: aload 4
    //   249: invokevirtual 847	com/tencent/mm/plugin/sns/storage/s:a	(ILcom/tencent/mm/plugin/sns/storage/r;)I
    //   252: pop
    //   253: goto -61 -> 192
    //   256: astore_3
    //   257: ldc -28
    //   259: ldc_w 849
    //   262: invokestatic 408	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   265: iconst_0
    //   266: ireturn
    //   267: iconst_1
    //   268: ireturn
    //   269: astore 4
    //   271: goto -67 -> 204
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	274	0	paramInt	int
    //   140	107	1	i	int
    //   187	2	2	j	int
    //   77	127	3	localObject	Object
    //   256	1	3	localException1	Exception
    //   149	21	4	localr	com.tencent.mm.plugin.sns.storage.r
    //   199	49	4	localException2	Exception
    //   269	1	4	localException3	Exception
    //   57	179	5	localath	com.tencent.mm.protocal.c.ath
    //   29	79	6	localn	n
    // Exception table:
    //   from	to	target	type
    //   59	78	199	java/lang/Exception
    //   162	188	256	java/lang/Exception
    //   220	243	256	java/lang/Exception
    //   78	99	269	java/lang/Exception
  }
  
  public static n wy(int paramInt)
  {
    n localn = new n();
    Object localObject1 = af.byo();
    Object localObject2 = o.bBy();
    localObject2 = (String)localObject2 + " and createTime < " + paramInt;
    localObject2 = (String)localObject2 + o.nJs;
    localObject2 = (String)localObject2 + " LIMIT 1";
    x.i("MicroMsg.SnsInfoStorage", "getTimelineByCreateTime sql %s", new Object[] { localObject2 });
    localObject2 = ((o)localObject1).diF.rawQuery((String)localObject2, null);
    localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = null;
    }
    if (localObject1 == null) {
      return null;
    }
    if (((Cursor)localObject1).moveToFirst())
    {
      localn.d((Cursor)localObject1);
      ((Cursor)localObject1).close();
      return localn;
    }
    ((Cursor)localObject1).close();
    return null;
  }
  
  public static void wz(int paramInt)
  {
    x.d("MicroMsg.SnsInfoStorageLogic", "unsetOmitResendFlag localId　" + paramInt);
    n localn = af.byo().xd(paramInt);
    if (localn == null) {
      return;
    }
    if ((localn.field_localFlag & 0x40) > 0) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        localn.field_localFlag &= 0xFFFFFFBF;
      }
      af.byo().b(paramInt, localn);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */