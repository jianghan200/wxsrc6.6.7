package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.bt.d;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.l.a;
import com.tencent.mm.model.s;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class ah
  extends m
  implements ay
{
  public static final String[] ciG = { "CREATE UNIQUE INDEX IF NOT EXISTS  contact_username_unique_index ON rcontact ( username )", "CREATE INDEX IF NOT EXISTS  contact_alias_index ON rcontact ( alias )", "CREATE INDEX IF NOT EXISTS  en_username_unique_index ON rcontact ( encryptUsername )", "CREATE UNIQUE INDEX IF NOT EXISTS  bottle_username_unique_index ON bottlecontact ( username )", "CREATE INDEX IF NOT EXISTS type_verifyFlag_index ON rcontact ( type,verifyFlag ) " };
  public static final String[] diD = { i.a(ab.dhO, "rcontact"), i.a(ab.dhO, "bottlecontact"), i.a(ac.dhO, "ContactCmdBuf"), "CREATE TABLE IF NOT EXISTS contact ( contactID INTEGER PRIMARY KEY, sex INT, type INT, showHead INT, username VARCHAR(40), nickname VARCHAR(40), pyInitial VARCHAR(40), quanPin VARCHAR(60), reserved TEXT );", "CREATE TABLE IF NOT EXISTS contact_ext ( username VARCHAR(40), Uin INTEGER DEFAULT 0, Email VARCHAR(128), Mobile VARCHAR(40), ShowFlag INTEGER DEFAULT 0 , ConType INTEGER DEFAULT 0 , ConRemark TEXT, ConRemark_PYShort TEXT, ConRemark_PYFull TEXT, ConQQMBlog TEXT, ConSMBlog TEXT, DomainList TEXT, reserved1 INT DEFAULT 0 , reserved2 INT DEFAULT 0 , reserved3 INT DEFAULT 0 , reserved4 INT DEFAULT 0 , reserved5 INT DEFAULT 0 , reserved6 TEXT, reserved7 TEXT, reserved8 TEXT, reserved9 TEXT, reserved10 TEXT, weiboflag  INT DEFAULT 0 ,weibonickname TEXT  );" };
  private static String tau = "showHead = 32";
  private static String tav = "type & 64 !=0 ";
  private final k<ay.a, ab> dKC = new k() {};
  private com.tencent.mm.sdk.e.e diF;
  private com.tencent.mm.sdk.e.e tar;
  public final com.tencent.mm.a.f<String, ab> tas = new com.tencent.mm.a.f(200);
  public final com.tencent.mm.a.f<String, Integer> tat = new com.tencent.mm.a.f(400);
  
  public ah(com.tencent.mm.bt.h paramh)
  {
    Object localObject = paramh.b("PRAGMA table_info( contact_ext )", null, 2);
    int n = ((Cursor)localObject).getColumnIndex("name");
    int j = 0;
    int i = 0;
    while ((((Cursor)localObject).moveToNext()) && ((i == 0) || (j == 0))) {
      if (n >= 0)
      {
        String str = ((Cursor)localObject).getString(n);
        if ("weiboNickname".equalsIgnoreCase(str)) {
          j = 1;
        } else if ("weiboFlag".equalsIgnoreCase(str)) {
          i = 1;
        }
      }
    }
    ((Cursor)localObject).close();
    if (i == 0) {
      paramh.fV("contact_ext", "Alter table contact_ext add weiboFlag INT DEFAULT 0 ");
    }
    if (j == 0) {
      paramh.fV("contact_ext", "Alter table contact_ext add weiboNickname INT DEFAULT 0 ");
    }
    localObject = paramh.b("PRAGMA table_info( rcontact )", null, 2);
    i = ((Cursor)localObject).getColumnIndex("name");
    do
    {
      if (!((Cursor)localObject).moveToNext()) {
        break;
      }
    } while ((i < 0) || (!"verifyFlag".equalsIgnoreCase(((Cursor)localObject).getString(i))));
    for (i = m;; i = 0)
    {
      ((Cursor)localObject).close();
      if (i == 0) {
        paramh.fV("rcontact", "Alter table rcontact add verifyFlag INT DEFAULT 0 ");
      }
      localObject = i.a(a.dhO, "bottlecontact", paramh).iterator();
      while (((Iterator)localObject).hasNext()) {
        paramh.fV("bottlecontact", (String)((Iterator)localObject).next());
      }
      localObject = i.a(a.dhO, "rcontact", paramh).iterator();
      while (((Iterator)localObject).hasNext()) {
        paramh.fV("rcontact", (String)((Iterator)localObject).next());
      }
      localObject = ciG;
      j = localObject.length;
      i = k;
      while (i < j)
      {
        paramh.fV("rcontact", localObject[i]);
        i += 1;
      }
      this.diF = paramh;
      this.tar = paramh;
      return;
    }
  }
  
  private void Ck(String paramString)
  {
    if (!bi.oW(paramString))
    {
      this.tas.remove(paramString);
      this.tat.remove(paramString);
    }
  }
  
  private static String I(String[] paramArrayOfString)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0)) {
      return "";
    }
    String str1 = " and (";
    int i = 0;
    while (i < paramArrayOfString.length)
    {
      String str2 = str1;
      if (i > 0) {
        str2 = str1 + " or ";
      }
      str1 = str2 + "username = '" + paramArrayOfString[i] + "' ";
      i += 1;
    }
    return str1 + " )";
  }
  
  private static String T(boolean paramBoolean1, boolean paramBoolean2)
  {
    String str2 = "type & " + a.Bs() + "!=0";
    String str1 = str2;
    if (paramBoolean1) {
      str1 = str2 + " or type & " + a.Bv() + "!=0";
    }
    str1 = " where (" + str1 + ")";
    str1 = str1 + " and type & " + a.Bw() + "=0 ";
    str2 = str1 + " and type & " + a.Bt() + " =0 ";
    str1 = str2;
    if (!paramBoolean2) {
      str1 = str2 + " and verifyFlag & " + ab.ckY() + " =0 ";
    }
    return str1;
  }
  
  private static boolean V(ab paramab)
  {
    boolean bool = false;
    if (paramab == null) {
      return false;
    }
    int i = paramab.versionCode;
    if (i <= 0) {}
    for (;;)
    {
      x.d("MicroMsg.ContactStorage", "it need to update contact: " + bool + " version code : " + i + " user: " + paramab.field_username);
      return bool;
      bool = true;
    }
  }
  
  private static String XZ(String paramString)
  {
    return "select *,rowid from " + Ya(paramString) + " ";
  }
  
  private static String Ya(String paramString)
  {
    if (ab.gY(paramString)) {
      return "bottlecontact";
    }
    return "rcontact";
  }
  
  private static String clp()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(" order by showHead asc, ");
    localStringBuffer.append(" case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull) ");
    localStringBuffer.append(" else upper(quanPin) end asc, ");
    localStringBuffer.append(" case when length(conRemark) > 0 then upper(conRemark) ");
    localStringBuffer.append(" else upper(quanPin) end asc, ");
    localStringBuffer.append(" upper(quanPin) asc, ");
    localStringBuffer.append(" upper(nickname) asc, ");
    localStringBuffer.append(" upper(username) asc ");
    return localStringBuffer.toString();
  }
  
  private static String clq()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(" order by case when verifyFlag & " + ab.ckY() + " != 0 then 0 else 1 end , showHead asc, ");
    localStringBuffer.append(" case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull) ");
    localStringBuffer.append(" else upper(quanPin) end asc, ");
    localStringBuffer.append(" case when length(conRemark) > 0 then upper(conRemark) ");
    localStringBuffer.append(" else upper(quanPin) end asc, ");
    localStringBuffer.append(" upper(quanPin) asc, ");
    localStringBuffer.append(" upper(nickname) asc, ");
    localStringBuffer.append(" upper(username) asc ");
    return localStringBuffer.toString();
  }
  
  private static String clr()
  {
    String str = "type & " + a.Bs() + "!=0";
    str = " where (" + str + ") and ";
    return str + "type & " + a.Bw() + "=0  ";
  }
  
  private static String cls()
  {
    String str = "type & " + a.Bs() + "!=0";
    return "( (" + str + ") and type & " + a.Bt() + "=0 and username like '%@chatroom')";
  }
  
  private static String clt()
  {
    String str = "type & " + a.Bs() + "!=0";
    return "( (" + str + ") and type & " + a.Bt() + "=0 and username like '%@talkroom')";
  }
  
  private static String clu()
  {
    return "type & " + a.Bt() + "=0 and username like '%@openim'";
  }
  
  private static String clv()
  {
    return clr() + " and " + clu();
  }
  
  private static String dj(List<String> paramList)
  {
    if ((paramList == null) || (paramList.size() == 0)) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      localStringBuilder.append(" or username = '").append(str).append("'");
    }
    return localStringBuilder.toString();
  }
  
  private static String dk(List<String> paramList)
  {
    String str = dj(paramList);
    int i = str.indexOf("or");
    paramList = str;
    if (i <= 2) {
      paramList = str.substring(i + 2);
    }
    return paramList;
  }
  
  private static String i(List<String> paramList, boolean paramBoolean)
  {
    String str2 = T(false, paramBoolean) + " AND " + tav;
    String str1 = "";
    Object localObject = str1;
    if (paramList != null)
    {
      localObject = str1;
      if (paramList.size() > 0)
      {
        localObject = paramList.iterator();
        for (paramList = ""; ((Iterator)localObject).hasNext(); paramList = paramList + " AND username != '" + str1 + "'") {
          str1 = (String)((Iterator)localObject).next();
        }
        localObject = paramList;
      }
    }
    return str2 + (String)localObject;
  }
  
  private static String s(String paramString, List<String> paramList)
  {
    if ((paramString == null) || (paramString.equals(""))) {
      return "";
    }
    String str = " and (";
    Object localObject = str;
    if (paramList != null)
    {
      localObject = str;
      if (paramList.size() != 0)
      {
        localObject = paramList.iterator();
        for (paramList = " and ("; ((Iterator)localObject).hasNext(); paramList = paramList + "username = '" + str + "' or ") {
          str = (String)((Iterator)localObject).next();
        }
        localObject = paramList;
      }
    }
    paramList = (String)localObject + "conRemark like '%" + paramString + "%' or ";
    paramList = paramList + "conRemarkPYFull like '%" + paramString + "%' or ";
    paramList = paramList + "conRemarkPYShort like '%" + paramString + "%' or ";
    paramList = paramList + "alias like '%" + paramString + "%' or ";
    paramList = paramList + "username like '%" + paramString + "%' or ";
    paramList = paramList + "nickname like '%" + paramString + "%' or ";
    paramList = paramList + "pyInitial like '%" + paramString + "%' or ";
    return paramList + "quanPin like '%" + paramString + "%' )";
  }
  
  public final String MD()
  {
    return clp();
  }
  
  public final void Q(ab paramab)
  {
    if ((paramab == null) || (paramab.field_username == null) || (paramab.field_type == 0)) {
      return;
    }
    this.tas.m(paramab.field_username, paramab);
    this.tat.m(paramab.field_username, Integer.valueOf(paramab.field_type));
  }
  
  public final boolean R(ab paramab)
  {
    if (Yi(paramab.field_username)) {
      if (a(paramab.field_username, paramab) != 0) {}
    }
    while (U(paramab) >= 0)
    {
      return true;
      return false;
    }
    return false;
  }
  
  public final boolean S(ab paramab)
  {
    if (paramab != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("contact NULL !", bool);
      if (V(paramab)) {
        break;
      }
      return true;
    }
    paramab.eD(paramab.AY());
    this.dKC.ci(paramab);
    this.dKC.doNotify();
    x.d("MicroMsg.ContactStorage", "replace : username=%s, showHead=%d, verifyFlag=%d", new Object[] { paramab.field_username, Integer.valueOf(paramab.field_showHead), Integer.valueOf(paramab.field_verifyFlag) });
    ContentValues localContentValues = paramab.wH();
    if ((int)paramab.dhP > 0) {
      localContentValues.put("rowid", Integer.valueOf((int)paramab.dhP));
    }
    if (this.diF.replace(Ya(paramab.field_username), a.dhO.sKz, localContentValues) > 0L) {}
    for (int i = 1;; i = 0)
    {
      Ck(paramab.field_username);
      if (!bi.oW(paramab.field_encryptUsername)) {
        Ck(paramab.field_encryptUsername);
      }
      if (i != 0) {
        break;
      }
      return false;
    }
    b(4, this, paramab.field_username);
    return true;
  }
  
  public final boolean T(ab paramab)
  {
    return U(paramab) > 0;
  }
  
  public final int U(ab paramab)
  {
    if (bi.oV(paramab.field_username).length() <= 0)
    {
      x.e("MicroMsg.ContactStorage", "FATAL ERROR, invalid contact, empty username");
      return -1;
    }
    paramab.eD(paramab.AY());
    this.dKC.ci(paramab);
    this.dKC.doNotify();
    Object localObject = paramab.wH();
    long l = System.currentTimeMillis();
    int k = (int)this.diF.insert(Ya(paramab.field_username), a.dhO.sKz, (ContentValues)localObject);
    int m = (int)bi.bH(l);
    boolean bool = b.foreground;
    localObject = com.tencent.mm.plugin.report.f.mDy;
    int i;
    if (bool)
    {
      i = 11;
      if (!bool) {
        break label233;
      }
    }
    label233:
    for (int j = 12;; j = 15)
    {
      ((com.tencent.mm.plugin.report.f)localObject).e(463, i, j, m, false);
      x.i("MicroMsg.ContactStorage", "insert : username=%s, showHead=%d, verifyFlag=%d, ret=:%d take[%s]ms fg:%b", new Object[] { paramab.field_username, Integer.valueOf(paramab.field_showHead), Integer.valueOf(paramab.field_verifyFlag), Integer.valueOf(k), Integer.valueOf(m), Boolean.valueOf(bool) });
      if (k == -1) {
        break label239;
      }
      paramab.dhP = k;
      Q(paramab);
      b(2, this, paramab.field_username);
      return k;
      i = 14;
      break;
    }
    label239:
    x.e("MicroMsg.ContactStorage", "insert failed: username=" + paramab.field_username);
    return -1;
  }
  
  protected final boolean Xu()
  {
    boolean bool = true;
    if ((this.diF == null) || (this.diF.cjr())) {
      if (this.diF != null) {
        break label52;
      }
    }
    label52:
    for (Object localObject = "null";; localObject = Boolean.valueOf(this.diF.cjr()))
    {
      x.w("MicroMsg.ContactStorage", "shouldProcessEvent db is close :%s", new Object[] { localObject });
      bool = false;
      return bool;
    }
  }
  
  public final ab Yb(String paramString)
  {
    paramString = (ab)this.tas.get(paramString);
    if (paramString != null) {
      return paramString;
    }
    return null;
  }
  
  public final boolean Yc(String paramString)
  {
    if ((bi.oW(paramString)) || ((paramString.contains("@")) && (!paramString.endsWith("@stranger")))) {
      return false;
    }
    Object localObject = (Integer)this.tat.get(paramString);
    if (localObject != null) {
      return a.gd(((Integer)localObject).intValue());
    }
    localObject = Yg(paramString);
    if ((localObject == null) || ((!((ai)localObject).field_username.equals(paramString)) && (!paramString.equals(((ai)localObject).field_encryptUsername))))
    {
      this.tat.m(paramString, Integer.valueOf(0));
      return false;
    }
    this.tat.m(paramString, Integer.valueOf(((ai)localObject).field_type));
    return a.gd(((ai)localObject).field_type);
  }
  
  public final ab Yd(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    ab localab = new ab();
    paramString = "select *,rowid from rcontact where alias=" + com.tencent.mm.bt.h.fz(paramString);
    paramString = this.diF.b(paramString, null, 2);
    if (paramString.moveToFirst())
    {
      localab.d(paramString);
      Q(localab);
    }
    paramString.close();
    localab.clb();
    return localab;
  }
  
  public final ab Ye(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    Object localObject = paramString;
    if (ab.gY(paramString)) {
      localObject = ab.XV(paramString);
    }
    paramString = Yb((String)localObject);
    if (paramString != null)
    {
      paramString.clb();
      return paramString;
    }
    paramString = new ab();
    localObject = XZ((String)localObject) + " where username=" + com.tencent.mm.bt.h.fz((String)localObject);
    localObject = this.diF.b((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
    {
      paramString.d((Cursor)localObject);
      Q(paramString);
    }
    ((Cursor)localObject).close();
    paramString.clb();
    return paramString;
  }
  
  public final ab Yf(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    Object localObject = paramString;
    if (ab.gY(paramString)) {
      localObject = ab.XV(paramString);
    }
    paramString = Yb((String)localObject);
    if (paramString != null) {
      return paramString;
    }
    paramString = new ab();
    localObject = XZ((String)localObject) + " where username=" + com.tencent.mm.bt.h.fz((String)localObject) + " or encryptUsername=" + com.tencent.mm.bt.h.fz((String)localObject);
    localObject = this.diF.b((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
    {
      paramString.d((Cursor)localObject);
      Q(paramString);
    }
    ((Cursor)localObject).close();
    return paramString;
  }
  
  public final ab Yg(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    Object localObject = paramString;
    if (ab.gY(paramString)) {
      localObject = ab.XV(paramString);
    }
    paramString = Yb((String)localObject);
    if (paramString != null) {
      return paramString;
    }
    paramString = new ab();
    localObject = XZ((String)localObject) + " where username=" + com.tencent.mm.bt.h.fz((String)localObject) + " or encryptUsername=" + com.tencent.mm.bt.h.fz((String)localObject);
    localObject = this.diF.b((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
    {
      paramString.d((Cursor)localObject);
      ((Cursor)localObject).close();
      paramString.clb();
      Q(paramString);
    }
    for (;;)
    {
      return paramString;
      ((Cursor)localObject).close();
    }
  }
  
  public final long Yh(String paramString)
  {
    long l2 = -1L;
    paramString = Yg(paramString);
    long l1 = l2;
    if (paramString != null)
    {
      l1 = l2;
      if (paramString.dhP > 0L) {
        l1 = (int)paramString.dhP;
      }
    }
    return l1;
  }
  
  public final boolean Yi(String paramString)
  {
    ab localab = Yg(paramString);
    return (localab != null) && (!bi.oW(localab.field_username)) && (localab.field_username.equals(paramString));
  }
  
  public final boolean Yj(String paramString)
  {
    boolean bool2 = false;
    if (bi.oW(paramString)) {
      return false;
    }
    paramString = "select count(*) from " + Ya(paramString) + " where type & " + a.Bt() + " !=0 and username=" + com.tencent.mm.bt.h.fz(paramString);
    paramString = this.diF.b(paramString, null, 2);
    boolean bool1 = bool2;
    if (paramString.moveToFirst())
    {
      bool1 = bool2;
      if (paramString.getInt(0) > 0) {
        bool1 = true;
      }
    }
    paramString.close();
    return bool1;
  }
  
  public final byte[] Yk(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.ContactStorage", "getCmdbuf failed user is null");
      return null;
    }
    ac localac = new ac();
    Cursor localCursor = this.diF.a("ContactCmdBuf", null, "username=?", new String[] { paramString }, null, null, null, 2);
    if (localCursor.moveToFirst()) {
      localac.d(localCursor);
    }
    localCursor.close();
    if (localac.field_cmdbuf == null) {}
    for (int i = -1;; i = localac.field_cmdbuf.length)
    {
      x.d("MicroMsg.ContactStorage", "getCmdbuf user:%s buf:%d", new Object[] { paramString, Integer.valueOf(i) });
      return localac.field_cmdbuf;
    }
  }
  
  public final int Yl(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.ContactStorage", "delCmdBuf failed user is null");
      return -1;
    }
    int i = this.diF.delete("ContactCmdBuf", "username=?", new String[] { paramString });
    x.d("MicroMsg.ContactStorage", "delCmdBuf user:%s ret:%d", new Object[] { paramString, Integer.valueOf(i) });
    return i;
  }
  
  public final int Ym(String paramString)
  {
    if (paramString.length() > 0) {}
    String str;
    int i;
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      str = paramString;
      if (ab.gY(paramString)) {
        str = ab.XV(paramString);
      }
      Ck(str);
      paramString = new ab(str);
      paramString.setType(0);
      paramString.setUsername("fake_" + bi.VF());
      paramString.dD("fake_" + bi.VF());
      i = this.diF.update(Ya(str), paramString.wH(), "username=?", new String[] { str });
      Yl(str);
      x.w("MicroMsg.ContactStorage", "delete (because the fucking talker id , dk just mark it  disappear .) user:%s res:%s %s", new Object[] { str, Integer.valueOf(i), bi.cjd() });
      if (i != 0) {
        break;
      }
      return i;
    }
    b(5, this, str);
    return i;
  }
  
  public final String Yn(String paramString)
  {
    if ((paramString == null) || (paramString.equals(""))) {
      return "";
    }
    String str = " and (" + "conRemark like '%" + paramString + "%' or ";
    str = str + "conRemarkPYFull like '%" + paramString + "%' or ";
    str = str + "conRemarkPYShort like '%" + paramString + "%' or ";
    str = str + "alias like '%" + paramString + "%' or ";
    str = str + "username like '%" + paramString + "%' or ";
    str = str + "nickname like '%" + paramString + "%' or ";
    str = str + "pyInitial like '%" + paramString + "%' or ";
    return str + "quanPin like '%" + paramString + "%' )";
  }
  
  public final int a(String paramString, ab paramab)
  {
    x.i("MicroMsg.ContactStorage", "begin to update contact : " + paramString);
    int j;
    if (!V(paramab))
    {
      j = 1;
      return j;
    }
    long l = System.currentTimeMillis();
    String str = paramString;
    if (ab.gY(paramString)) {
      str = ab.XV(paramString);
    }
    paramab.eD(paramab.AY());
    this.dKC.ci(paramab);
    this.dKC.doNotify();
    paramString = paramab.wH();
    if ((int)paramab.dhP > 0) {
      paramString.put("rowid", Integer.valueOf((int)paramab.dhP));
    }
    if (paramString.size() > 0) {}
    for (int i = this.diF.update(Ya(str), paramString, "username=?", new String[] { str });; i = 0)
    {
      x.i("MicroMsg.ContactStorage", "update : username=%s, showHead=%d, verifyFlag=%d, result1=%d, take[%d]ms", new Object[] { paramab.field_username, Integer.valueOf(paramab.field_showHead), Integer.valueOf(paramab.field_verifyFlag), Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - l) });
      Ck(str);
      if (!bi.oW(paramab.field_encryptUsername)) {
        Ck(paramab.field_encryptUsername);
      }
      j = i;
      if (i == 0) {
        break;
      }
      b(4, this, str);
      return i;
    }
  }
  
  public final Cursor a(String paramString1, String paramString2, List<String> paramList1, List<String> paramList2, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramString1 = "select username ,nickname ,alias,conRemark,verifyFlag,showHead,weiboFlag,rowid ,deleteFlag,lvbuff,descWordingId,openImAppid from rcontact " + e(paramString1, paramString2, paramList1) + dj(paramList2) + clp();
    x.v("MicroMsg.ContactStorage", paramString1);
    if (paramBoolean1)
    {
      paramString2 = "select username ,nickname ,alias,conRemark,verifyFlag,showHead,weiboFlag,rowid ,deleteFlag,lvbuff,descWordingId,openImAppid from rcontact " + i(paramList1, paramBoolean2) + clq();
      x.v("MicroMsg.ContactStorage", "favourSql " + paramString1);
      paramString2 = this.diF.b(paramString2, null, 4);
      paramString1 = this.diF.b(paramString1, null, 4);
      if (((paramString2 instanceof com.tencent.mm.bt.a.f)) && ((paramString1 instanceof com.tencent.mm.bt.a.f))) {
        return new com.tencent.mm.bt.a.e(new com.tencent.mm.bt.a.f[] { (com.tencent.mm.bt.a.f)paramString2, (com.tencent.mm.bt.a.f)paramString1 });
      }
      return d.cnR();
    }
    return this.diF.b(paramString1, null, 4);
  }
  
  public final Cursor a(List<String> paramList1, String paramString, List<String> paramList2)
  {
    paramString = "select rcontact.username ,rcontact.nickname ,rcontact.alias,rcontact.conRemark,rcontact.verifyFlag,rcontact.showHead,rcontact.weiboFlag,rcontact.rowid ,rcontact.deleteFlag,rcontact.lvbuff,rcontact.descWordingId, rcontact.openImAppid,  OpenIMWordingInfo.wording, OpenIMWordingInfo.quanpin  from rcontact left join OpenIMWordingInfo on rcontact.descWordingId=OpenIMWordingInfo.wordingId " + " and OpenIMWordingInfo.language='" + paramString + "' ";
    String str1 = paramString + clv();
    paramString = "";
    if (paramList2.size() > 0)
    {
      paramList2 = paramList2.iterator();
      paramString = "";
      if (paramList2.hasNext())
      {
        String str2 = (String)paramList2.next();
        if (paramString.equals("")) {}
        for (paramString = paramString + " and (";; paramString = paramString + " or ")
        {
          paramString = paramString + "openImAppid == '" + str2 + "'";
          break;
        }
      }
      paramString = paramString + " )";
    }
    str1 = str1 + paramString;
    paramList2 = "";
    paramString = paramList2;
    if (paramList1 != null)
    {
      paramString = paramList2;
      if (paramList1.size() > 0)
      {
        paramString = paramList1.iterator();
        for (paramList1 = ""; paramString.hasNext(); paramList1 = paramList1 + " and username != '" + paramList2 + "'") {
          paramList2 = (String)paramString.next();
        }
        paramString = paramList1;
      }
    }
    paramList1 = str1 + paramString;
    paramList1 = paramList1 + " order by OpenIMWordingInfo.quanpin IS NULL, OpenIMWordingInfo.quanpin ";
    x.v("MicroMsg.ContactStorage", "getOpenIMCursor:%s", new Object[] { paramList1 });
    return this.diF.b(paramList1, null, 4);
  }
  
  public final Cursor a(String[] paramArrayOfString, String paramString1, String paramString2, List<String> paramList1, List<String> paramList2)
  {
    paramArrayOfString = "select * ,rowid from rcontact " + e(paramString1, paramString2, paramList2) + I(paramArrayOfString) + s(paramString2, paramList1) + clp();
    x.i("MicroMsg.ContactStorage", paramArrayOfString);
    return this.diF.rawQuery(paramArrayOfString, null);
  }
  
  public final Cursor a(String[] paramArrayOfString, String paramString, List<String> paramList)
  {
    paramString = "select * ,rowid from rcontact " + e(paramString, null, paramList) + I(paramArrayOfString);
    paramList = paramString;
    if (paramArrayOfString != null)
    {
      paramList = paramString;
      if (paramArrayOfString.length > 0)
      {
        paramString = paramString + " order by 1=1 ";
        int j = paramArrayOfString.length;
        int i = 0;
        for (;;)
        {
          paramList = paramString;
          if (i >= j) {
            break;
          }
          paramList = paramArrayOfString[i];
          paramString = paramString + ",username='" + paramList + "' desc";
          i += 1;
        }
      }
    }
    x.v("MicroMsg.ContactStorage", "getSearchCursorByArrOrder sql : " + paramList);
    return this.diF.rawQuery(paramList, null);
  }
  
  public final void a(ay.a parama)
  {
    this.dKC.a(parama, null);
  }
  
  public final int b(String paramString, ab paramab)
  {
    int i = 0;
    if ((bi.oW(paramString)) || (paramab == null) || (bi.oW(paramab.field_username)))
    {
      x.e("MicroMsg.ContactStorage", "update : wrong input!");
      return 0;
    }
    x.d("MicroMsg.ContactStorage", "updateEncryptUser contact: " + paramab.field_username + " enUsername: " + paramString);
    if (!V(paramab)) {
      return 1;
    }
    if (ab.gY(paramab.field_username)) {
      paramab.setUsername(ab.XV(paramab.field_username));
    }
    paramab.eD(paramab.AY());
    this.dKC.ci(paramab);
    this.dKC.doNotify();
    x.d("MicroMsg.ContactStorage", "update : oldUsername=%s, username=%s, showHead=%d, verifyFlag=%d", new Object[] { paramString, paramab.field_username, Integer.valueOf(paramab.field_showHead), Integer.valueOf(paramab.field_verifyFlag) });
    ContentValues localContentValues = paramab.wH();
    ab localab;
    int j;
    if (paramab.dhP <= 0L)
    {
      localab = new ab(paramString);
      localab.setType(0);
      localab.setUsername("fake_" + bi.VF());
      localab.dD("fake_" + bi.VF());
      j = this.diF.update(Ya(paramString), localab.wH(), "username=?", new String[] { paramString });
      x.d("MicroMsg.ContactStorage", "newContact.contactId <= 0 | delete " + Ya(paramString) + " user :" + paramString + ", res:" + j);
      if (localContentValues.size() > 0) {
        i = (int)this.diF.replace(Ya(paramab.field_username), a.dhO.sKz, localContentValues);
      }
    }
    for (;;)
    {
      Ck(paramab.field_username);
      if (!bi.oW(paramab.field_encryptUsername)) {
        Ck(paramab.field_encryptUsername);
      }
      b(3, this, paramString);
      b(3, this, paramab.field_username);
      return i;
      if (paramString.equals(paramab.field_username))
      {
        if (localContentValues.size() > 0)
        {
          i = this.diF.update(Ya(paramab.field_username), localContentValues, "rowid=?", new String[] { paramab.dhP });
          x.i("MicroMsg.ContactStorage", "summercontact en equal username[%s], result1[%d], contactId[%d]", new Object[] { paramab.field_username, Integer.valueOf(i), Long.valueOf(paramab.dhP) });
        }
      }
      else
      {
        localab = new ab(paramString);
        localab.setType(0);
        localab.setUsername("fake_" + bi.VF());
        localab.dD("fake_" + bi.VF());
        j = this.diF.update(Ya(paramString), localab.wH(), "username=?", new String[] { paramString });
        x.d("MicroMsg.ContactStorage", "delete " + Ya(paramString) + " user :" + paramString + ", res:" + j);
        if (localContentValues.size() > 0) {
          i = this.diF.update(Ya(paramab.field_username), localContentValues, "rowid=?", new String[] { paramab.dhP });
        }
      }
    }
  }
  
  public final int b(String[] paramArrayOfString1, String... paramVarArgs)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select count(username) from rcontact where ");
    localStringBuilder.append("type & ").append(a.Bs()).append(" !=0 and ");
    localStringBuilder.append("type & ").append(a.Bw()).append(" =0 and ");
    localStringBuilder.append("type & ").append(a.Bt()).append(" =0 and ");
    localStringBuilder.append("verifyFlag & 8 = 0 and ");
    localStringBuilder.append("( username not like '%@%')");
    if ((paramArrayOfString1 != null) && (paramArrayOfString1.length > 0))
    {
      int j = paramArrayOfString1.length;
      i = 0;
      while (i < j)
      {
        String str = paramArrayOfString1[i];
        localStringBuilder.append(" and rcontact.username != '").append(str).append("'");
        i += 1;
      }
    }
    int i = 0;
    while (i < 4)
    {
      paramArrayOfString1 = paramVarArgs[i];
      localStringBuilder.append(" and rcontact.username != '").append(paramArrayOfString1).append("'");
      i += 1;
    }
    localStringBuilder.append(" or username = 'weixin'");
    paramArrayOfString1 = localStringBuilder.toString();
    paramVarArgs = this.diF.b(paramArrayOfString1, null, 2);
    if ((paramVarArgs != null) && (paramVarArgs.moveToFirst()))
    {
      i = paramVarArgs.getInt(0);
      paramVarArgs.close();
    }
    for (;;)
    {
      x.d("MicroMsg.ContactStorage", "getNormalContactCount, sql:%s, result:%d", new Object[] { paramArrayOfString1, Integer.valueOf(i) });
      return i;
      i = 0;
    }
  }
  
  public final Cursor b(String paramString1, String paramString2, List<String> paramList)
  {
    paramString1 = "select * ,rowid from rcontact " + e(paramString1, paramString2, paramList) + dj(null) + clp();
    x.v("MicroMsg.ContactStorage", paramString1);
    return this.diF.rawQuery(paramString1, null);
  }
  
  public final Cursor b(String paramString1, String paramString2, List<String> paramList1, List<String> paramList2, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramString1 = "select username from rcontact " + e(paramString1, paramString2, paramList1) + dj(paramList2) + clp();
    x.v("MicroMsg.ContactStorage", paramString1);
    if (paramBoolean1)
    {
      paramString2 = "select username from rcontact " + i(paramList1, paramBoolean2) + clq();
      x.v("MicroMsg.ContactStorage", "favourSql " + paramString1);
      paramString2 = this.diF.b(paramString2, null, 4);
      paramString1 = this.diF.b(paramString1, null, 4);
      if (((paramString2 instanceof com.tencent.mm.bt.a.f)) && ((paramString1 instanceof com.tencent.mm.bt.a.f))) {
        return new com.tencent.mm.bt.a.e(new com.tencent.mm.bt.a.f[] { (com.tencent.mm.bt.a.f)paramString2, (com.tencent.mm.bt.a.f)paramString1 });
      }
      return d.cnR();
    }
    return this.diF.rawQuery(paramString1, null);
  }
  
  public final void b(ay.a parama)
  {
    if (this.dKC != null) {
      this.dKC.remove(parama);
    }
  }
  
  public final int[] b(String paramString1, String paramString2, String paramString3, List<String> paramList)
  {
    paramString1 = "select distinct showHead from rcontact " + e(paramString1, paramString2, paramList) + Yn(paramString3) + clp();
    long l = System.currentTimeMillis();
    paramString1 = this.diF.rawQuery(paramString1, null);
    x.d("MicroMsg.ContactStorage", "kevin MMCore.getAccStg().getContactStg().getShowSectionByShowHead db.rawQuery : " + (System.currentTimeMillis() - l));
    l = System.currentTimeMillis();
    if (paramString1.getCount() >= 0) {}
    for (int i = paramString1.getCount();; i = 0)
    {
      x.d("MicroMsg.ContactStorage", "kevin MMCore.getAccStg().getContactStg().getShowSectionByShowHead cu.getCount() : " + (System.currentTimeMillis() - l));
      paramString2 = new int[i];
      if (paramString1.getCount() <= 0) {
        break;
      }
      int j = 0;
      while (j < i)
      {
        paramString1.moveToPosition(j);
        paramString2[j] = paramString1.getInt(0);
        j += 1;
      }
    }
    paramString1.close();
    return paramString2;
  }
  
  public final int[] b(String paramString1, String paramString2, String[] paramArrayOfString, List<String> paramList)
  {
    paramString1 = "select distinct showHead from rcontact " + e(paramString1, paramString2, paramList) + I(paramArrayOfString) + clp();
    long l = System.currentTimeMillis();
    paramString1 = this.diF.rawQuery(paramString1, null);
    x.d("MicroMsg.ContactStorage", "kevin MMCore.getAccStg().getContactStg().getShowHeadDistinct db.rawQuery last" + (System.currentTimeMillis() - l));
    l = System.currentTimeMillis();
    if (paramString1.getCount() >= 0) {}
    for (int i = paramString1.getCount();; i = 0)
    {
      x.d("MicroMsg.ContactStorage", "kevin MMCore.getAccStg().getContactStg().getShowHeadDistinct  cu.getCount() last" + (System.currentTimeMillis() - l));
      paramString2 = new int[i];
      if (paramString1.getCount() <= 0) {
        break;
      }
      int j = 0;
      while (j < i)
      {
        paramString1.moveToPosition(j);
        paramString2[j] = paramString1.getInt(0);
        j += 1;
      }
    }
    paramString1.close();
    return paramString2;
  }
  
  public final Cursor bdj()
  {
    return this.diF.rawQuery("select * ,rowid from rcontact  where rowid = -1", null);
  }
  
  public final int c(String[] paramArrayOfString1, String... paramVarArgs)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select count(username) from rcontact where ");
    localStringBuilder.append("type & ").append(a.Bs()).append(" !=0 and ");
    localStringBuilder.append("type & ").append(a.Bw()).append(" =0 and ");
    localStringBuilder.append("type & ").append(a.Bt()).append(" =0 and ");
    localStringBuilder.append("verifyFlag & 8 = 0 and ");
    localStringBuilder.append("( username like '%@chatroom')");
    if ((paramArrayOfString1 != null) && (paramArrayOfString1.length > 0))
    {
      int j = paramArrayOfString1.length;
      i = 0;
      while (i < j)
      {
        String str = paramArrayOfString1[i];
        localStringBuilder.append(" and rcontact.username != '").append(str).append("'");
        i += 1;
      }
    }
    int i = 0;
    while (i < 4)
    {
      paramArrayOfString1 = paramVarArgs[i];
      localStringBuilder.append(" and rcontact.username != '").append(paramArrayOfString1).append("'");
      i += 1;
    }
    paramArrayOfString1 = localStringBuilder.toString();
    paramVarArgs = this.diF.b(paramArrayOfString1, null, 2);
    if ((paramVarArgs != null) && (paramVarArgs.moveToFirst()))
    {
      i = paramVarArgs.getInt(0);
      paramVarArgs.close();
    }
    for (;;)
    {
      x.v("MicroMsg.ContactStorage", "getChatroomContactCount, sql:%s, result:%d", new Object[] { paramArrayOfString1, Integer.valueOf(i) });
      return i;
      i = 0;
    }
  }
  
  public final Cursor c(String paramString1, String paramString2, List<String> paramList)
  {
    return b(paramString1, paramString2, paramList);
  }
  
  public final void c(String paramString, ab paramab)
  {
    if (paramString == null) {}
    String str;
    do
    {
      return;
      str = paramString;
      if (ab.gY(paramString)) {
        str = ab.XV(paramString);
      }
      paramab.eD(paramab.AY());
      if (s.d(paramab))
      {
        paramab.eD(43);
        paramab.dy(com.tencent.mm.platformtools.h.oJ(paramab.BK()));
        paramab.dz(com.tencent.mm.platformtools.h.oI(paramab.BK()));
        paramab.dB(com.tencent.mm.platformtools.h.oI(paramab.BL()));
        paramab.dC(paramab.BL());
        return;
      }
      if (s.hE(paramab.field_username))
      {
        x.i("MicroMsg.ContactStorage", "update official account helper showhead %d", new Object[] { Integer.valueOf(31) });
        paramab.eD(31);
      }
      this.dKC.ci(paramab);
      this.dKC.doNotify();
      x.d("MicroMsg.ContactStorage", "username=%s, showHead=%d, verifyFlag=%d", new Object[] { paramab.field_username, Integer.valueOf(paramab.field_showHead), Integer.valueOf(paramab.field_verifyFlag) });
      paramString = paramab.wH();
      if ((int)paramab.dhP > 0) {
        paramString.put("rowid", Integer.valueOf((int)paramab.dhP));
      }
    } while (paramString.size() <= 0);
    this.diF.update(Ya(str), paramString, "username=?", new String[] { str });
  }
  
  public final int[] c(String paramString1, String paramString2, String paramString3, List<String> paramList)
  {
    Object localObject = null;
    long l = System.currentTimeMillis();
    paramString1 = "select count(*) from rcontact " + e(paramString1, paramString2, paramList) + Yn(paramString3);
    paramString1 = paramString1 + " group by showHead";
    paramString3 = this.diF.rawQuery(paramString1, null);
    x.d("MicroMsg.ContactStorage", "kevin MMCore.getAccStg().getContactStg().getSectionNumByShowHead db.rawQuery : " + (System.currentTimeMillis() - l));
    l = System.currentTimeMillis();
    int j = paramString3.getCount();
    x.d("MicroMsg.ContactStorage", "kevin MMCore.getAccStg().getContactStg().getSectionNumByShowHead cu.getCount() : " + (System.currentTimeMillis() - l));
    paramString1 = (String)localObject;
    if (j > 0)
    {
      paramString2 = new int[j];
      int i = 0;
      for (;;)
      {
        paramString1 = paramString2;
        if (i >= j) {
          break;
        }
        paramString3.moveToPosition(i);
        paramString2[i] = paramString3.getInt(0);
        i += 1;
      }
    }
    paramString3.close();
    return paramString1;
  }
  
  public final int[] c(String paramString1, String paramString2, String[] paramArrayOfString, List<String> paramList)
  {
    Object localObject = null;
    paramString1 = "select count(*) from rcontact " + e(paramString1, paramString2, paramList) + I(paramArrayOfString);
    paramString1 = paramString1 + " group by showHead";
    paramArrayOfString = this.diF.rawQuery(paramString1, null);
    paramString1 = (String)localObject;
    if (paramArrayOfString.getCount() > 0)
    {
      int j = paramArrayOfString.getCount();
      paramString2 = new int[j];
      int i = 0;
      for (;;)
      {
        paramString1 = paramString2;
        if (i >= j) {
          break;
        }
        paramArrayOfString.moveToPosition(i);
        paramString2[i] = paramArrayOfString.getInt(0);
        i += 1;
      }
    }
    paramArrayOfString.close();
    return paramString1;
  }
  
  public final List<String> cli()
  {
    Object localObject = " select openImAppid from rcontact" + clv() + " group by openImAppid ";
    localObject = " select acctTypeId from OpenIMAppIdInfo where appid in (" + (String)localObject + ") group by acctTypeId";
    localObject = this.diF.b((String)localObject, null, 4);
    LinkedList localLinkedList = new LinkedList();
    if (((Cursor)localObject).moveToFirst()) {
      do
      {
        String str = ((Cursor)localObject).getString(0);
        if (!bi.oW(str)) {
          localLinkedList.add(str);
        }
      } while (((Cursor)localObject).moveToNext());
    }
    ((Cursor)localObject).close();
    return localLinkedList;
  }
  
  public final List<String> clj()
  {
    Object localObject = "select username from rcontact where " + cls();
    localObject = this.diF.b((String)localObject, null, 2);
    ArrayList localArrayList = new ArrayList();
    if (localObject == null) {
      return localArrayList;
    }
    if (((Cursor)localObject).moveToFirst()) {
      do
      {
        localArrayList.add(((Cursor)localObject).getString(0));
      } while (((Cursor)localObject).moveToNext());
    }
    ((Cursor)localObject).close();
    return localArrayList;
  }
  
  public final Cursor clk()
  {
    String str = "select * ,rowid from rcontact  where " + new StringBuilder("type & ").append(a.Bt()).append("=0 and username like '%@chatroom'").toString();
    return this.diF.rawQuery(str, null);
  }
  
  public final Cursor cll()
  {
    String str = "select * ,rowid from rcontact " + clr() + " AND type & 256 !=0 " + clp();
    x.v("MicroMsg.ContactStorage", str);
    return this.diF.rawQuery(str, null);
  }
  
  public final Cursor clm()
  {
    String str = "select * ,rowid from rcontact  where " + tav + " and verifyFlag & " + ab.ckY() + " !=0 ";
    x.v("MicroMsg.ContactStorage", "dkbf:" + str);
    return this.diF.rawQuery(str, null);
  }
  
  public final Cursor cln()
  {
    String str = "select * ,rowid from rcontact " + clr() + " AND " + tav + " AND " + tau + clq();
    x.v("MicroMsg.ContactStorage", str);
    return this.diF.rawQuery(str, null);
  }
  
  public final int clo()
  {
    int i = 0;
    Object localObject = "select count(rowid) from rcontact " + e("@biz.contact", null, null);
    x.v("MicroMsg.ContactStorage", (String)localObject);
    localObject = this.diF.b((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst()) {
      i = ((Cursor)localObject).getInt(0);
    }
    ((Cursor)localObject).close();
    return i;
  }
  
  public final Cursor clw()
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("select username ,nickname ,alias,conRemark,verifyFlag,showHead,weiboFlag,rowid ,deleteFlag,lvbuff,descWordingId,openImAppid from rcontact  where ");
    ((StringBuilder)localObject).append("type & ").append(a.Bs()).append(" !=0 and ");
    ((StringBuilder)localObject).append("type & ").append(a.Bw()).append(" =0 and ");
    ((StringBuilder)localObject).append("type & ").append(a.Bt()).append(" =0 and ");
    ((StringBuilder)localObject).append("verifyFlag & 8 = 0 and ");
    ((StringBuilder)localObject).append("( username not like '%@%')");
    ((StringBuilder)localObject).append(" or username = 'weixin'");
    localObject = ((StringBuilder)localObject).toString();
    Cursor localCursor = this.diF.b((String)localObject, null, 2);
    x.i("MicroMsg.ContactStorage", "[oneliang]getNormalContactCursor, sql:%s", new Object[] { localObject });
    return localCursor;
  }
  
  public final Cursor d(String paramString1, String paramString2, List<String> paramList)
  {
    paramString1 = "select * ,rowid from rcontact " + e(paramString1, paramString2, paramList) + clp();
    x.v("MicroMsg.ContactStorage", paramString1);
    return this.diF.rawQuery(paramString1, null);
  }
  
  public final Cursor df(List<String> paramList)
  {
    int i = 0;
    boolean bool;
    if (paramList.size() > 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      str = "select username ,nickname ,alias,conRemark,verifyFlag,showHead,weiboFlag,rowid ,deleteFlag,lvbuff,type from rcontact  where ";
      label22:
      if (i >= paramList.size()) {
        break label141;
      }
      if (i == paramList.size() - 1) {
        break label97;
      }
    }
    label97:
    for (String str = str + "username = '" + (String)paramList.get(i) + "' OR ";; str = str + "username = '" + (String)paramList.get(i) + "'")
    {
      i += 1;
      break label22;
      bool = false;
      break;
    }
    label141:
    paramList = str + clp();
    return this.diF.rawQuery(paramList, null);
  }
  
  public final Cursor dg(List<String> paramList)
  {
    int i = 0;
    boolean bool;
    if (paramList.size() > 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      str = "select username ,nickname ,alias,conRemark,verifyFlag,showHead,weiboFlag,rowid ,deleteFlag,lvbuff,descWordingId,openImAppid from rcontact  where ";
      label22:
      if (i >= paramList.size()) {
        break label141;
      }
      if (i == paramList.size() - 1) {
        break label97;
      }
    }
    label97:
    for (String str = str + "username = '" + (String)paramList.get(i) + "' OR ";; str = str + "username = '" + (String)paramList.get(i) + "'")
    {
      i += 1;
      break label22;
      bool = false;
      break;
    }
    label141:
    paramList = str + clp();
    return this.diF.rawQuery(paramList, null);
  }
  
  public final Cursor dh(List<String> paramList)
  {
    int i = 0;
    boolean bool;
    if (paramList.size() > 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      str = "select * ,rowid from rcontact  where ";
      label22:
      if (i >= paramList.size()) {
        break label141;
      }
      if (i == paramList.size() - 1) {
        break label97;
      }
    }
    label97:
    for (String str = str + "username = '" + (String)paramList.get(i) + "' OR ";; str = str + "username = '" + (String)paramList.get(i) + "'")
    {
      i += 1;
      break label22;
      bool = false;
      break;
    }
    label141:
    paramList = str + clp();
    return this.diF.rawQuery(paramList, null);
  }
  
  public final Cursor di(List<String> paramList)
  {
    int j = 0;
    boolean bool;
    if (paramList.size() > 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      str = "select * ,rowid from rcontact  where (";
      i = 0;
      label26:
      if (i >= paramList.size()) {
        break label146;
      }
      if (i == paramList.size() - 1) {
        break label102;
      }
    }
    label102:
    for (String str = str + "username = '" + (String)paramList.get(i) + "' OR ";; str = str + "username = '" + (String)paramList.get(i) + "'")
    {
      i += 1;
      break label26;
      bool = false;
      break;
    }
    label146:
    str = str + ") order by case username ";
    int i = j;
    while (i < paramList.size())
    {
      str = str + " when '" + (String)paramList.get(i) + "' then " + i;
      i += 1;
    }
    paramList = str + " end";
    x.d("MicroMsg.ContactStorage", "getCursorByNamesInListOrder sql:" + paramList);
    return this.diF.rawQuery(paramList, null);
  }
  
  public final Cursor dl(List<String> paramList)
  {
    paramList = "select * ,rowid from rcontact where (" + tav + ") and (" + dk(paramList) + ")" + clq();
    return this.diF.rawQuery(paramList, null);
  }
  
  public final Cursor dm(List<String> paramList)
  {
    paramList = "select * ,rowid from rcontact where (" + tav + ") and (" + dk(paramList) + ")" + clq() + " and (username like  '%@openim' )";
    return this.diF.rawQuery(paramList, null);
  }
  
  public final Cursor dn(List<String> paramList)
  {
    paramList = "select * ,rowid from rcontact " + i(paramList, false) + clq();
    x.v("MicroMsg.ContactStorage", "favourSql " + paramList);
    return this.diF.rawQuery(paramList, null);
  }
  
  public final Cursor jdMethod_do(List<String> paramList)
  {
    paramList = "select * ,rowid from rcontact " + i(paramList, false) + clq() + " and (username like  '%@openim' )";
    x.v("MicroMsg.ContactStorage", "favourSql " + paramList);
    return this.diF.rawQuery(paramList, null);
  }
  
  public final List<String> dp(List<String> paramList)
  {
    if (paramList.isEmpty())
    {
      x.w("MicroMsg.ContactStorage", "getFilterList: but white list is empty");
      return new LinkedList();
    }
    long l = bi.VG();
    LinkedList localLinkedList = new LinkedList();
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("username='").append((String)paramList.get(0)).append("'");
    int i = 1;
    while (i < paramList.size())
    {
      ((StringBuilder)localObject).append(" or username='").append((String)paramList.get(i)).append("'");
      i += 1;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("showHead asc, ");
    localStringBuilder.append("pyInitial asc, ");
    localStringBuilder.append("quanPin asc, ");
    localStringBuilder.append("nickname asc, ");
    localStringBuilder.append("username asc ");
    localObject = String.format("select %s from %s where (%s) and (%s & %d != 0)  order by %s", new Object[] { "username", "rcontact", ((StringBuilder)localObject).toString(), "type", Integer.valueOf(a.Bs()), localStringBuilder.toString() });
    x.i("MicroMsg.ContactStorage", "getFilterList: sql is %s", new Object[] { localObject });
    localObject = this.diF.b((String)localObject, null, 2);
    if (localObject != null)
    {
      while (((Cursor)localObject).moveToNext()) {
        localLinkedList.add(((Cursor)localObject).getString(0));
      }
      ((Cursor)localObject).close();
    }
    x.i("MicroMsg.ContactStorage", "getFilerList: use time[%d ms] whiteList[%s], usernameList[%s]", new Object[] { Long.valueOf(bi.bI(l)), paramList, localLinkedList.toString() });
    return localLinkedList;
  }
  
  public final int[] dq(List<String> paramList)
  {
    paramList = "select distinct showHead from rcontact  where (" + dk(paramList) + ") " + clp();
    long l = System.currentTimeMillis();
    paramList = this.diF.rawQuery(paramList, null);
    x.d("MicroMsg.ContactStorage", "kevin MMCore.getAccStg().getContactStg().getShowSectionByShowHead db.rawQuery : " + (System.currentTimeMillis() - l));
    l = System.currentTimeMillis();
    if (paramList.getCount() >= 0) {}
    int[] arrayOfInt;
    for (int i = paramList.getCount();; i = 0)
    {
      x.d("MicroMsg.ContactStorage", "kevin MMCore.getAccStg().getContactStg().getShowSectionByShowHead cu.getCount() : " + (System.currentTimeMillis() - l));
      arrayOfInt = new int[i];
      if (paramList.getCount() <= 0) {
        break;
      }
      int j = 0;
      while (j < i)
      {
        paramList.moveToPosition(j);
        arrayOfInt[j] = paramList.getInt(0);
        j += 1;
      }
    }
    paramList.close();
    return arrayOfInt;
  }
  
  public final int[] dr(List<String> paramList)
  {
    int[] arrayOfInt = null;
    long l = System.currentTimeMillis();
    paramList = "select count(*) from rcontact " + "where " + dk(paramList);
    paramList = paramList + " group by showHead";
    Cursor localCursor = this.diF.b(paramList, null, 2);
    x.d("MicroMsg.ContactStorage", "kevin MMCore.getAccStg().getContactStg().getSectionNumByShowHead db.rawQuery : " + (System.currentTimeMillis() - l));
    l = System.currentTimeMillis();
    int j = localCursor.getCount();
    x.d("MicroMsg.ContactStorage", "kevin MMCore.getAccStg().getContactStg().getSectionNumByShowHead cu.getCount() : " + (System.currentTimeMillis() - l));
    paramList = arrayOfInt;
    if (j > 0)
    {
      arrayOfInt = new int[j];
      int i = 0;
      for (;;)
      {
        paramList = arrayOfInt;
        if (i >= j) {
          break;
        }
        localCursor.moveToPosition(i);
        arrayOfInt[i] = localCursor.getInt(0);
        i += 1;
      }
    }
    localCursor.close();
    return paramList;
  }
  
  public final String e(String paramString1, String paramString2, List<String> paramList)
  {
    boolean bool2 = true;
    boolean bool3 = true;
    boolean bool4 = true;
    boolean bool5 = true;
    boolean bool6 = true;
    boolean bool7 = true;
    boolean bool1 = true;
    if ((paramString1 == null) || (paramString1.equals("@all.android"))) {
      paramString1 = "" + T(true, false);
    }
    for (;;)
    {
      String str1 = "";
      paramString2 = str1;
      if (paramList == null) {
        break;
      }
      paramString2 = str1;
      if (paramList.size() <= 0) {
        break;
      }
      paramList = paramList.iterator();
      for (paramString2 = ""; paramList.hasNext(); paramString2 = paramString2 + " and username != '" + str1 + "'") {
        str1 = (String)paramList.next();
      }
      if (paramString1.equals("@all.contact.android"))
      {
        paramString1 = "" + clr();
      }
      else if (paramString1.equals("@all.chatroom.contact"))
      {
        paramString1 = new StringBuilder().append("");
        paramString2 = "(type & " + a.Bs() + "!=0 and username like '%@chatroom')";
        paramString2 = " where (" + paramString2 + ") and ";
        paramString1 = new StringBuilder().append(paramString2).append("type & ").append(a.Bw()).append("=0 ").toString();
      }
      else
      {
        if (paramString1.equals("@all.contact.without.chatroom"))
        {
          paramString1 = new StringBuilder().append("");
          paramString2 = T(false, false);
          if ((paramString2 != null) && (paramString2.length() > 0)) {}
          for (;;)
          {
            Assert.assertTrue(bool1);
            str1 = " or (" + clt() + ')' + " or (" + clu() + ")";
            paramString1 = new StringBuilder().append(paramString2).append(" and ( username not like '%@%'").append(str1).append(")").toString();
            break;
            bool1 = false;
          }
        }
        if (paramString1.equals("@all.contact.without.chatroom.without.openim"))
        {
          paramString1 = new StringBuilder().append("");
          paramString2 = T(false, false);
          if ((paramString2 != null) && (paramString2.length() > 0)) {}
          for (bool1 = bool2;; bool1 = false)
          {
            Assert.assertTrue(bool1);
            str1 = " or (" + clt() + ')';
            paramString1 = new StringBuilder().append(paramString2).append(" and ( username not like '%@%'").append(str1).append(")").toString();
            break;
          }
        }
        if (paramString1.equals("@black.android"))
        {
          paramString1 = "" + new StringBuilder(" where type & ").append(a.Bt()).append("!=0").toString();
        }
        else if (paramString1.equals("@werun.black.android"))
        {
          paramString1 = "" + new StringBuilder(" where type & ").append(a.Bu()).append("!=0").toString();
        }
        else if (paramString1.equals("@t.qq.com"))
        {
          paramString1 = "" + new StringBuilder(" where username like '%").append("@t.qq.com").append("'").toString();
        }
        else
        {
          if (paramString1.equals("@domain.android"))
          {
            paramString1 = new StringBuilder().append("");
            str1 = T(true, false);
            if ((str1 != null) && (str1.length() > 0)) {}
            for (bool1 = bool3;; bool1 = false)
            {
              Assert.assertTrue(bool1);
              paramString1 = new StringBuilder().append(str1).append(" and domainList like '%").append(paramString2).append("%'").toString();
              break;
            }
          }
          if (paramString1.equals("@micromsg.qq.com"))
          {
            paramString1 = new StringBuilder().append("");
            paramString2 = T(false, false);
            if ((paramString2 != null) && (paramString2.length() > 0)) {}
            for (bool1 = bool4;; bool1 = false)
            {
              Assert.assertTrue(bool1);
              str1 = " or (" + cls() + ')';
              String str2 = " or (" + clt() + ')';
              paramString1 = new StringBuilder().append(paramString2).append(" and ( username not like '%@%'").append(str1).append(str2).append(")").toString();
              break;
            }
          }
          if (paramString1.equals("@micromsg.no.verify.biz.qq.com"))
          {
            paramString1 = new StringBuilder().append("");
            paramString2 = "type & " + a.Bs() + " !=0 ";
            paramString2 = " where (" + paramString2 + ") and ";
            paramString2 = paramString2 + "type & " + a.Bw() + " =0 and ";
            paramString2 = paramString2 + "type & " + a.Bt() + " =0 and ";
            paramString2 = paramString2 + "verifyFlag & " + ab.ckY() + " =0";
            if ((paramString2 != null) && (paramString2.length() > 0)) {}
            for (bool1 = bool5;; bool1 = false)
            {
              Assert.assertTrue(bool1);
              str1 = " or (" + cls() + ')';
              paramString1 = new StringBuilder().append(paramString2).append(" and ( username not like '%@%'").append(str1).append(")").toString();
              break;
            }
          }
          if (paramString1.equals("@micromsg.with.all.biz.qq.com"))
          {
            paramString1 = new StringBuilder().append("");
            paramString2 = "type & " + a.Bs() + " !=0 ";
            paramString2 = " where (" + paramString2 + ") and ";
            paramString2 = paramString2 + "type & " + a.Bw() + " =0 and ";
            paramString2 = paramString2 + "type & " + a.Bt() + " =0";
            if ((paramString2 != null) && (paramString2.length() > 0)) {}
            for (bool1 = bool6;; bool1 = false)
            {
              Assert.assertTrue(bool1);
              str1 = " or (" + cls() + ')';
              paramString1 = new StringBuilder().append(paramString2).append(" and ( username not like '%@%'").append(str1).append(")").toString();
              break;
            }
          }
          if (paramString1.equals("@qqim"))
          {
            paramString1 = new StringBuilder().append("");
            paramString2 = T(false, false);
            if ((paramString2 != null) && (paramString2.length() > 0)) {}
            for (bool1 = bool7;; bool1 = false)
            {
              Assert.assertTrue(bool1);
              paramString1 = new StringBuilder().append(paramString2).append(" and username like '%").append("@qqim").append("'").toString();
              break;
            }
          }
          if (paramString1.equals("@all.chatroom"))
          {
            paramString1 = new StringBuilder().append("");
            paramString2 = "type & " + a.Bs() + " !=0";
            paramString2 = paramString2 + " or type & 2 !=0";
            paramString2 = paramString2 + " or type & 4 !=0";
            paramString2 = paramString2 + " or 1";
            paramString1 = new StringBuilder(" where (").append(paramString2).append(") ").toString();
          }
          else if (paramString1.equals("@verify.contact"))
          {
            paramString1 = new StringBuilder().append("");
            paramString2 = "type & " + a.Bs() + " != 0 and ";
            paramString2 = paramString2 + "verifyFlag & " + ab.ckX() + " != 0";
            paramString1 = new StringBuilder(" where (").append(paramString2).append(") ").toString();
          }
          else if (paramString1.equals("@biz.contact"))
          {
            paramString1 = new StringBuilder().append("");
            paramString2 = "type & " + a.Bs() + " != 0 and ";
            paramString2 = paramString2 + "verifyFlag & " + ab.ckY() + " != 0";
            paramString1 = new StringBuilder(" where (").append(paramString2).append(") ").toString();
          }
          else if (paramString1.equals("@all.weixin.android"))
          {
            paramString1 = new StringBuilder().append("");
            paramString2 = "type & " + a.Bs() + " != 0 or  (username not like '%@qqim' and username not like '%@qr' and username not like '%@bottle' and username not like '%@fb' and username not like '%@google' and username not like '%@t.qq.com' and username not like '%@t.sina.com' and username not like '%@t.sina.com" + "')";
            paramString1 = new StringBuilder(" where (").append(paramString2).append(") ").toString();
          }
          else if (paramString1.equals("@openim.contact"))
          {
            paramString1 = "" + clv();
          }
          else
          {
            x.d("MicroMsg.ContactStorage", "unknow role type");
            paramString1 = "" + T(false, false);
          }
        }
      }
    }
    return paramString1 + paramString2;
  }
  
  public final ab gl(long paramLong)
  {
    ab localab = null;
    Object localObject = null;
    if (paramLong <= 0L) {}
    do
    {
      return (ab)localObject;
      localObject = "select * ,rowid from rcontact  where rowid=" + paramLong;
      localObject = this.diF.b((String)localObject, null, 2);
      if (((Cursor)localObject).moveToFirst())
      {
        localab = new ab();
        localab.d((Cursor)localObject);
        Q(localab);
      }
      ((Cursor)localObject).close();
      localObject = localab;
    } while (localab == null);
    localab.clb();
    return localab;
  }
  
  public final Cursor h(List<String> paramList, boolean paramBoolean)
  {
    String str = "select * ,rowid from rcontact  where " + dk(paramList);
    paramList = str;
    if (paramBoolean) {
      paramList = str + " " + clp();
    }
    x.d("MicroMsg.ContactStorage", "sql " + paramList);
    return this.diF.rawQuery(paramList, null);
  }
  
  public final int x(String paramString, byte[] paramArrayOfByte)
  {
    int i = -1;
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.ContactStorage", "getCmdbuf failed user is null");
      return -1;
    }
    ac localac = new ac();
    localac.field_cmdbuf = paramArrayOfByte;
    localac.field_username = paramString;
    int j = (int)this.diF.replace("ContactCmdBuf", "username", localac.wH());
    if (paramArrayOfByte == null) {}
    for (;;)
    {
      x.d("MicroMsg.ContactStorage", "setCmdbuf user:%s buf:%d result:%d", new Object[] { paramString, Integer.valueOf(i), Integer.valueOf(j) });
      return j;
      i = paramArrayOfByte.length;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/storage/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */