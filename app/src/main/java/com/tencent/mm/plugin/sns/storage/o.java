package com.tencent.mm.plugin.sns.storage;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import com.tencent.mm.bt.h;
import com.tencent.mm.g.a.qc;
import com.tencent.mm.g.a.qc.a;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.sns.b.g;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class o
  extends com.tencent.mm.sdk.e.i<n>
  implements g
{
  public static final String[] ciG;
  public static final String[] diD = { com.tencent.mm.sdk.e.i.a(n.dhO, "SnsInfo") };
  protected static String nJA;
  private static String nJB;
  private static String nJC;
  private static String nJD;
  private static ArrayList<Integer> nJE;
  private static ArrayList<Integer> nJF;
  private static String[] nJq = { "snsId", "userName", "localFlag", "createTime", "head", "localPrivate", "type", "sourceType", "likeFlag", "pravited", "stringSeq", "content", "attrBuf", "postBuf", "rowid" };
  public static String nJr;
  public static String nJs;
  public static String nJt;
  private static String nJu;
  private static String nJv;
  private static String nJw;
  public static String nJx;
  public static String nJy;
  protected static String nJz;
  public com.tencent.mm.sdk.e.e diF;
  private boolean nJo;
  private int nJp;
  
  static
  {
    ciG = new String[] { "CREATE INDEX IF NOT EXISTS serverSnsNameIndex ON SnsInfo ( snsId )", "CREATE INDEX IF NOT EXISTS serverSnsTimeHeadIndex ON SnsInfo ( head )", "DROP INDEX IF EXISTS serverSnsTimeIndex", "DROP INDEX IF EXISTS serverSnsTimeSourceTypeIndex", "CREATE INDEX IF NOT EXISTS snsMultiIndex1 ON SnsInfo ( createTime,snsId,sourceType,type)", "CREATE INDEX IF NOT EXISTS snsMultiIndex2 ON SnsInfo ( sourceType,type,userName)", "CREATE INDEX IF NOT EXISTS snsLocalflagIndex ON SnsInfo ( localFlag )" };
    nJr = "";
    nJs = " order by SnsInfo.createTime desc ,snsId desc";
    nJt = " order by SnsInfo.createTime asc ,snsId asc";
    nJu = " order by SnsInfo.createTime asc ,snsId asc";
    nJv = " order by SnsInfo.head desc ,SnsInfo.createTime desc ";
    nJw = " order by SnsInfo.head desc ,snsId desc";
    nJx = null;
    nJy = null;
    nJz = " (sourceType & 2 != 0 ) ";
    nJA = " (sourceType & 2 != 0 ) and type < 21";
    nJB = null;
    nJC = null;
    nJD = null;
    nJE = cm(Arrays.asList(new Integer[] { Integer.valueOf(16), Integer.valueOf(32), Integer.valueOf(2), Integer.valueOf(8), Integer.valueOf(64), Integer.valueOf(128) }));
    nJF = cm(Arrays.asList(new Integer[] { Integer.valueOf(2), Integer.valueOf(4), Integer.valueOf(8) }));
    nJr = "select ";
    int i = 0;
    if (i < nJq.length)
    {
      if (i < nJq.length - 1) {}
      for (nJr = nJr + " " + nJq[i] + ",";; nJr = nJr + " " + nJq[i] + " ")
      {
        i += 1;
        break;
      }
    }
    x.i("MicroMsg.SnsInfoStorage", "TIMELINE_SELECT_BEGIN " + nJr);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = nJE.iterator();
    while (localIterator.hasNext())
    {
      i = ((Integer)localIterator.next()).intValue();
      if (((i & 0x10) != 0) && ((i & 0x20) == 0)) {
        localArrayList.add(Integer.valueOf(i));
      }
    }
    nJx = g(localArrayList, "localFlag");
    x.i("MicroMsg.SnsInfoStorage", "auto optimalize sql %s", new Object[] { nJx });
    localArrayList.clear();
    localIterator = nJE.iterator();
    while (localIterator.hasNext())
    {
      i = ((Integer)localIterator.next()).intValue();
      if ((i & 0x20) != 0) {
        localArrayList.add(Integer.valueOf(i));
      }
    }
    nJy = g(localArrayList, "localFlag");
    x.i("MicroMsg.SnsInfoStorage", "auto optimalize sql %s", new Object[] { nJy });
    localArrayList.clear();
    localIterator = nJE.iterator();
    while (localIterator.hasNext())
    {
      i = ((Integer)localIterator.next()).intValue();
      if (((i & 0x40) == 0) && ((i & 0x20) != 0)) {
        localArrayList.add(Integer.valueOf(i));
      }
    }
    nJD = g(localArrayList, "localFlag");
    localArrayList.clear();
    localIterator = nJF.iterator();
    while (localIterator.hasNext())
    {
      i = ((Integer)localIterator.next()).intValue();
      if ((i & 0x8) != 0) {
        localArrayList.add(Integer.valueOf(i));
      }
    }
    nJC = g(localArrayList, "sourceType");
    x.i("MicroMsg.SnsInfoStorage", "auto optimalize sql %s", new Object[] { nJC });
    localArrayList.clear();
    localIterator = nJF.iterator();
    while (localIterator.hasNext())
    {
      i = ((Integer)localIterator.next()).intValue();
      if ((i & 0x2) != 0) {
        localArrayList.add(Integer.valueOf(i));
      }
    }
    nJz = g(localArrayList, "sourceType");
    x.i("MicroMsg.SnsInfoStorage", "auto optimalize sql %s", new Object[] { nJz });
    localArrayList.clear();
    localIterator = nJF.iterator();
    while (localIterator.hasNext())
    {
      i = ((Integer)localIterator.next()).intValue();
      if ((i & 0x4) != 0) {
        localArrayList.add(Integer.valueOf(i));
      }
    }
    nJB = g(localArrayList, "sourceType");
    x.i("MicroMsg.SnsInfoStorage", "auto optimalize sql %s", new Object[] { nJB });
  }
  
  public o(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, n.dhO, "SnsInfo", ciG);
    this.diF = parame;
    parame = this.diF.b("select count(*) from SnsInfo where snsId > 0;", null, 2);
    int i;
    if (parame.moveToFirst())
    {
      i = parame.getInt(0);
      if (i > 0)
      {
        x.i("MicroMsg.SnsInfoStorage", "exsits snsId > 0  ,count is %d", new Object[] { Integer.valueOf(i) });
        parame.close();
        i = 1;
        if (i != 0) {
          break label123;
        }
      }
    }
    for (;;)
    {
      this.nJo = bool;
      this.nJp = 0;
      if (!this.nJo) {
        break label128;
      }
      x.i("MicroMsg.SnsInfoStorage", "all sndId < 0 ,so optimalizeForSnsId");
      return;
      parame.close();
      i = 0;
      break;
      label123:
      bool = false;
    }
    label128:
    nJs = " order by SnsInfo.createTime desc ,case when snsId < 0 then 0 else 1 end ,  snsId desc";
    nJt = " order by SnsInfo.createTime asc ,case when snsId < 0 then 0 else 1 end ,  snsId asc";
    nJv = " order by SnsInfo.head desc ,SnsInfo.createTime desc ";
    nJw = " order by SnsInfo.head desc ,case when snsId < 0 then 0 else 1 end ,  snsId desc";
  }
  
  private void Ns(String paramString)
  {
    paramString = "UPDATE SnsInfo SET sourceType = sourceType & -3" + paramString;
    x.d("MicroMsg.SnsInfoStorage", "updateFilterTimeLine sql " + paramString);
    this.diF.fV("SnsInfo", paramString);
  }
  
  public static boolean Nt(String paramString)
  {
    return (paramString != null) && (!paramString.equals(""));
  }
  
  private static long Nv(String paramString)
  {
    long l = new BigInteger(paramString).longValue();
    x.i("MicroMsg.SnsInfoStorage", "seq %s to snsId %d ", new Object[] { paramString, Long.valueOf(l) });
    return l;
  }
  
  public static String aU(String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {
      return "" + " WHERE " + nJB;
    }
    paramString = "" + " WHERE SnsInfo.userName=\"" + bi.oU(paramString) + "\"";
    return paramString + " AND " + nJC;
  }
  
  public static String aV(String paramString, boolean paramBoolean)
  {
    paramString = "select *,rowid from SnsInfo " + aU(paramString, paramBoolean);
    return paramString + " AND type in ( 1,2 , 3 , 4 , 18 , 5 , 12 , 9 , 14 , 15 , 13 , 21 , 25 , 26)";
  }
  
  private static boolean bBt()
  {
    qc localqc = new qc();
    a.sFg.m(localqc);
    return localqc.caL.caM;
  }
  
  public static String bBu()
  {
    if (bBt()) {
      return " (sourceType & 2 != 0 ) and type < 21";
    }
    return " (sourceType & 2 != 0 ) ";
  }
  
  public static String bBw()
  {
    return "select *,rowid from SnsInfo  where " + " (sourceType & 2 != 0 ) ";
  }
  
  public static String bBx()
  {
    return "select *,rowid from SnsInfo  where " + bBu();
  }
  
  public static String bBy()
  {
    StringBuilder localStringBuilder = new StringBuilder().append("select *,rowid from SnsInfo  where ");
    if (bBt()) {}
    for (String str = nJA;; str = nJz) {
      return str;
    }
  }
  
  public static String bBz()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select snsId from SnsInfo  where ").append(bBu()).append(" limit 3");
    return localStringBuilder.toString();
  }
  
  private long c(String paramString, long paramLong, int paramInt, boolean paramBoolean)
  {
    Object localObject;
    if (paramLong != 0L)
    {
      localObject = com.tencent.mm.plugin.sns.data.i.LK(com.tencent.mm.plugin.sns.data.i.eF(paramLong));
      paramString = paramString + " AND SnsInfo.stringSeq < '" + (String)localObject + "'";
    }
    for (;;)
    {
      localObject = paramString;
      if (paramBoolean) {
        localObject = paramString + " AND  (snsId != 0 ) ";
      }
      paramString = (String)localObject + nJs;
      paramString = paramString + " limit " + paramInt;
      paramString = this.diF.rawQuery(paramString, null);
      if (paramString.moveToLast())
      {
        localObject = new n();
        ((n)localObject).d(paramString);
        paramString.close();
        return ((n)localObject).field_snsId;
      }
      paramString.close();
      return 0L;
    }
  }
  
  private static ArrayList<Integer> cm(List<Integer> paramList)
  {
    Object localObject = new ArrayList(paramList);
    paramList = new HashSet();
    ArrayList localArrayList1 = new ArrayList();
    localObject = ((ArrayList)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      Integer localInteger = (Integer)((Iterator)localObject).next();
      ArrayList localArrayList2 = new ArrayList();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext()) {
        localArrayList2.add(Integer.valueOf(((Integer)localIterator.next()).intValue() | localInteger.intValue()));
      }
      paramList.addAll(new HashSet(localArrayList2));
      paramList.add(localInteger);
    }
    paramList.add(Integer.valueOf(0));
    localArrayList1.addAll(paramList);
    return localArrayList1;
  }
  
  private static String g(List<Integer> paramList, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder("(");
    localStringBuilder.append(paramString + " in (");
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      localStringBuilder.append(paramList.next());
      if (paramList.hasNext()) {
        localStringBuilder.append(",");
      }
    }
    localStringBuilder.append(")");
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public final Cursor Lw(String paramString)
  {
    String str2 = bBx();
    String str1 = str2;
    if (Nt(paramString)) {
      str1 = str2 + " AND " + Nu(paramString);
    }
    paramString = str1 + nJs;
    x.d("MicroMsg.SnsInfoStorage", "getCursorForTimeLine " + paramString);
    return this.diF.rawQuery(paramString, null);
  }
  
  public final int Lx(String paramString)
  {
    paramString = af.byo().Nk(paramString);
    if (paramString == null) {
      return 0;
    }
    return paramString.bBq();
  }
  
  public final n Nk(String paramString)
  {
    if (v.Lr(paramString)) {
      return fi(v.NE(paramString));
    }
    paramString = af.byr().eZ(v.NE(paramString));
    if (paramString != null) {
      return paramString.bAL();
    }
    return null;
  }
  
  public final n Nl(String paramString)
  {
    if (v.Lr(paramString)) {
      return xd(v.NF(paramString));
    }
    paramString = af.byr().xa(v.NF(paramString));
    if (paramString != null) {
      return paramString.bAL();
    }
    return null;
  }
  
  public final void Nq(String paramString)
  {
    if (!Nt(paramString)) {
      return;
    }
    Ns(" where " + Nx(paramString) + " and " + bBu() + " and  (snsId != 0  ) ");
  }
  
  public final void Nr(String paramString)
  {
    if (!Nt(paramString)) {
      return;
    }
    Ns(" where " + Nw(paramString) + " and " + bBu() + " and  (snsId != 0  ) ");
  }
  
  public final String Nu(String paramString)
  {
    if ((paramString == null) || (paramString.equals(""))) {
      return " ";
    }
    if (this.nJo) {
      return " (snsId >= " + Nv(bi.oU(paramString)) + " ) ";
    }
    return " (stringSeq >=\"" + bi.oU(paramString) + "\"  ) ";
  }
  
  public final String Nw(String paramString)
  {
    if ((paramString == null) || (paramString.equals(""))) {
      return " ";
    }
    if (this.nJo) {
      return " (snsId > " + Nv(bi.oU(paramString)) + " ) ";
    }
    return " (stringSeq >\"" + bi.oU(paramString) + "\"  ) ";
  }
  
  public final String Nx(String paramString)
  {
    if ((paramString == null) || (paramString.equals(""))) {
      return " ";
    }
    if (this.nJo) {
      return " (snsId < " + Nv(bi.oU(paramString)) + " ) ";
    }
    return " (stringSeq <\"" + bi.oU(paramString) + "\"  ) ";
  }
  
  public final int Ny(String paramString)
  {
    Object localObject2 = bBx();
    Object localObject1 = localObject2;
    if (Nt(paramString)) {
      localObject1 = (String)localObject2 + " AND " + Nu(paramString);
    }
    paramString = (String)localObject1 + " AND  (snsId != 0 ) ";
    paramString = paramString + nJt + " limit 1";
    localObject1 = this.diF.b(paramString, null, 2);
    int i = 0;
    if (((Cursor)localObject1).moveToFirst())
    {
      localObject2 = new n();
      ((n)localObject2).d((Cursor)localObject1);
      i = ((n)localObject2).field_createTime;
    }
    ((Cursor)localObject1).close();
    x.i("MicroMsg.SnsInfoStorage", "getLastTime " + paramString + " createtime " + i);
    return i;
  }
  
  public final long a(long paramLong, int paramInt, String paramString, boolean paramBoolean)
  {
    return c(aV(paramString, paramBoolean), paramLong, paramInt, false);
  }
  
  public final boolean a(long paramLong, n paramn)
  {
    if (fa(paramLong)) {
      return b(paramLong, paramn);
    }
    return y(paramn) != -1;
  }
  
  public final List<n> aW(String paramString, boolean paramBoolean)
  {
    paramString = "select *,rowid from SnsInfo " + aU(paramString, paramBoolean) + " AND type = 4";
    paramString = this.diF.b(paramString, null, 2);
    ArrayList localArrayList = new ArrayList();
    while (paramString.moveToNext())
    {
      n localn = new n();
      localn.d(paramString);
      localArrayList.add(localn);
    }
    paramString.close();
    return localArrayList;
  }
  
  public final int b(int paramInt, n paramn)
  {
    paramn = paramn.wH();
    paramn.remove("rowid");
    return this.diF.update("SnsInfo", paramn, "rowid=?", new String[] { String.valueOf(paramInt) });
  }
  
  public final Cursor b(String paramString1, int paramInt, boolean paramBoolean, String paramString2)
  {
    String str = aV(paramString1, paramBoolean);
    paramString1 = str;
    if (Nt(paramString2)) {
      paramString1 = str + " AND " + Nu(paramString2);
    }
    if (paramBoolean) {}
    for (paramString1 = paramString1 + nJv;; paramString1 = paramString1 + nJw)
    {
      paramString2 = paramString1;
      if (paramInt > 0) {
        paramString2 = paramString1 + " LIMIT " + paramInt;
      }
      x.d("MicroMsg.SnsInfoStorage", "getCursorByUserName in gallery " + paramString2);
      return this.diF.rawQuery(paramString2, null);
    }
  }
  
  public final void b(String paramString1, boolean paramBoolean, String paramString2)
  {
    String str = aU(paramString1, paramBoolean) + " AND  (snsId != 0  ) ";
    paramString1 = str;
    if (Nt(paramString2)) {
      paramString1 = str + " AND " + Nx(paramString2);
    }
    n(paramBoolean, paramString1);
  }
  
  public final boolean b(long paramLong, n paramn)
  {
    paramn = paramn.wH();
    paramn.remove("rowid");
    return this.diF.update("SnsInfo", paramn, "snsId=?", new String[] { String.valueOf(paramLong) }) > 0;
  }
  
  public final void bBv()
  {
    Ns(" where " + bBu() + " AND  (snsId != 0  ) ");
  }
  
  public final ArrayList<Long> bwV()
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = this.diF;
    Object localObject2 = "createTime >=? AND " + nJD;
    int i = (int)(System.currentTimeMillis() / 1000L);
    localObject1 = ((com.tencent.mm.sdk.e.e)localObject1).a("SnsInfo", new String[] { "*", "rowid" }, (String)localObject2, new String[] { String.valueOf(i - 172800) }, null, null, "createTime ASC", 2);
    try
    {
      while (((Cursor)localObject1).moveToNext())
      {
        localObject2 = new n();
        ((n)localObject2).d((Cursor)localObject1);
        if ((((n)localObject2).nJc != -1) && (((n)localObject2).field_userName.equals(q.GF())))
        {
          localArrayList.add(Long.valueOf(((n)localObject2).nJc));
          x.d("MicroMsg.SnsInfoStorage", "getAllNeedResendSns, add snsInfo: " + ((n)localObject2).bBe());
        }
      }
    }
    finally
    {
      ((Cursor)localObject1).close();
    }
    tmp204_201[0] = Integer.valueOf(localArrayList1.size());
    x.d("MicroMsg.SnsInfoStorage", "getAllNeedResendSns, resendList.size:%d", tmp204_201);
    return localArrayList1;
  }
  
  public final Cursor ch(String paramString, int paramInt)
  {
    Object localObject = nJr + " from SnsInfo where ";
    String str = (String)localObject + bBu();
    localObject = str;
    if (Nt(paramString)) {
      localObject = str + " AND " + Nu(paramString);
    }
    localObject = (String)localObject + " AND createTime >= " + paramInt;
    localObject = (String)localObject + " UNION ";
    localObject = (String)localObject + nJr + " from AdSnsInfo where createTime > " + paramInt;
    localObject = (String)localObject + nJs;
    x.d("MicroMsg.SnsInfoStorage", "getAdCursorForTimeLine " + (String)localObject + " limtiSeq: " + paramString);
    return this.diF.rawQuery((String)localObject, null);
  }
  
  public final boolean delete(long paramLong)
  {
    int i = this.diF.delete("SnsInfo", "snsId=?", new String[] { String.valueOf(paramLong) });
    x.d("MicroMsg.SnsInfoStorage", "del msg " + paramLong + " res " + i);
    return i > 0;
  }
  
  public final long e(long paramLong, int paramInt, boolean paramBoolean)
  {
    return c(bBx(), paramLong, paramInt, paramBoolean);
  }
  
  public final void eB(long paramLong)
  {
    ad.getContext().getSharedPreferences(ad.chY(), 0).edit().putLong("check_trim_time", 0L).commit();
    h localh = af.FO();
    long l = localh.dO(Thread.currentThread().getId());
    int i = 0;
    while (i < paramLong)
    {
      localh.fV("SnsInfo", "INSERT INTO SnsInfo VALUES(-69999999991777434909,'miaochanchan',2,1402026897,20140606,0,2,2,0,0,'0',X'0A143131373631303534303431393332313136373037120C6D69616F6368616E6368616E18002091F7C49C052A36E8A681E6849FE8B0A2E8BF99E4BBBDE5B7A5EFBC8CE8AEA9E68891E4B88DE4BC9AE69C89E5A29EE882A5E79A84E8BFB9E8B1A1E3808232180D0000000015000000001A0022002A0032003800480050003A0A0A0012001A0022002A0042080A0010021A0022004A0052005A006000680272007A2408001200180022002A0032003A080A0012001A00220042004A040800100052040A001200',X'08E3E5A48CEA8AEA9BA301120C6D69616F6368616E6368616E1A09E88B97E7B1B3E7B1B32091F7C49C052A04080012003000380040005000580068007000800101880100900100A00101B00100B80100',NULL);");
      i += 1;
    }
    i = 0;
    while (i < 20000L)
    {
      localh.fV("snsExtInfo3", String.format("INSERT INTO snsExtInfo3 VALUES('zeustest%d','afd',2,1402026897,'d', 0,1, 1, 1, 1, 'a', 'a', NULL);", new Object[] { Integer.valueOf(i) }));
      i += 1;
    }
    i = 0;
    while (i < 20000L)
    {
      localh.fV("snsComment", String.format("INSERT INTO snsComment VALUES(-69999999991777434909,0,2,1402026897,'d', 2,1, 'a', 'b', 1, NULL);", new Object[0]));
      i += 1;
    }
    localh.gp(l);
  }
  
  public final int eC(long paramLong)
  {
    n localn = af.byo().fi(paramLong);
    if (localn == null) {
      return 0;
    }
    return localn.bBq();
  }
  
  public final boolean fa(long paramLong)
  {
    Object localObject = "select *,rowid from SnsInfo  where SnsInfo.snsId=" + paramLong;
    localObject = this.diF.rawQuery((String)localObject, null);
    int i = ((Cursor)localObject).getCount();
    ((Cursor)localObject).close();
    return i > 0;
  }
  
  public final n fi(long paramLong)
  {
    n localn = new n();
    Object localObject = "select *,rowid from SnsInfo  where SnsInfo.snsId=" + paramLong + " limit 1";
    localObject = this.diF.b((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
    {
      localn.d((Cursor)localObject);
      ((Cursor)localObject).close();
      return localn;
    }
    ((Cursor)localObject).close();
    return null;
  }
  
  public final void n(boolean paramBoolean, String paramString)
  {
    if (paramBoolean) {}
    for (int i = 4;; i = 8)
    {
      paramString = "UPDATE SnsInfo SET sourceType = sourceType & " + (i ^ 0xFFFFFFFF) + paramString;
      x.d("MicroMsg.SnsInfoStorage", "updateFilterUserName sql " + paramString);
      this.diF.fV("SnsInfo", paramString);
      return;
    }
  }
  
  public final boolean wi(int paramInt)
  {
    return xd(paramInt) != null;
  }
  
  public final n xd(int paramInt)
  {
    n localn = new n();
    Object localObject = "select *,rowid from SnsInfo  where SnsInfo.rowid=" + paramInt;
    localObject = this.diF.b((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
    {
      localn.d((Cursor)localObject);
      ((Cursor)localObject).close();
      return localn;
    }
    ((Cursor)localObject).close();
    return null;
  }
  
  public final boolean xe(int paramInt)
  {
    return this.diF.delete("SnsInfo", "rowid=?", new String[] { String.valueOf(paramInt) }) > 0;
  }
  
  public final int y(n paramn)
  {
    x.d("MicroMsg.SnsInfoStorage", "SnsInfo Insert");
    if (paramn == null) {
      return -1;
    }
    paramn = paramn.wH();
    int i = (int)this.diF.insert("SnsInfo", "", paramn);
    x.d("MicroMsg.SnsInfoStorage", "SnsInfo Insert result " + i);
    return i;
  }
  
  public final boolean z(n paramn)
  {
    if (paramn.xb(32)) {
      return af.byr().a(paramn.bBp());
    }
    paramn = paramn.wH();
    if (this.diF.replace("SnsInfo", "", paramn) > 0L) {}
    for (boolean bool = true;; bool = false)
    {
      x.d("MicroMsg.SnsInfoStorage", "SnsInfo replace result " + bool);
      return bool;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */