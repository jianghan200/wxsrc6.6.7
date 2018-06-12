package com.tencent.mm.plugin.sns.storage;

import android.database.Cursor;
import android.os.Bundle;
import com.tencent.mm.a.g;
import com.tencent.mm.g.c.dx;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.protocal.c.atf;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.protocal.c.qc;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class n
  extends dx
{
  protected static c.a dhO;
  protected static Map<String, bsu> nJj = new ConcurrentHashMap();
  protected static Map<String, atf> nJk = new ConcurrentHashMap();
  public String nJb = null;
  public int nJc;
  public String nJl = null;
  public e nJm;
  private atf nJn = null;
  private boolean nkG = false;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[15];
    locala.columns = new String[16];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "snsId";
    locala.sKA.put("snsId", "LONG");
    localStringBuilder.append(" snsId LONG");
    localStringBuilder.append(", ");
    locala.columns[1] = "userName";
    locala.sKA.put("userName", "TEXT");
    localStringBuilder.append(" userName TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "localFlag";
    locala.sKA.put("localFlag", "INTEGER");
    localStringBuilder.append(" localFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "createTime";
    locala.sKA.put("createTime", "INTEGER");
    localStringBuilder.append(" createTime INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "head";
    locala.sKA.put("head", "INTEGER");
    localStringBuilder.append(" head INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "localPrivate";
    locala.sKA.put("localPrivate", "INTEGER");
    localStringBuilder.append(" localPrivate INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "type";
    locala.sKA.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[7] = "sourceType";
    locala.sKA.put("sourceType", "INTEGER");
    localStringBuilder.append(" sourceType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[8] = "likeFlag";
    locala.sKA.put("likeFlag", "INTEGER");
    localStringBuilder.append(" likeFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "pravited";
    locala.sKA.put("pravited", "INTEGER");
    localStringBuilder.append(" pravited INTEGER");
    localStringBuilder.append(", ");
    locala.columns[10] = "stringSeq";
    locala.sKA.put("stringSeq", "TEXT");
    localStringBuilder.append(" stringSeq TEXT");
    localStringBuilder.append(", ");
    locala.columns[11] = "content";
    locala.sKA.put("content", "BLOB");
    localStringBuilder.append(" content BLOB");
    localStringBuilder.append(", ");
    locala.columns[12] = "attrBuf";
    locala.sKA.put("attrBuf", "BLOB");
    localStringBuilder.append(" attrBuf BLOB");
    localStringBuilder.append(", ");
    locala.columns[13] = "postBuf";
    locala.sKA.put("postBuf", "BLOB");
    localStringBuilder.append(" postBuf BLOB");
    localStringBuilder.append(", ");
    locala.columns[14] = "subType";
    locala.sKA.put("subType", "INTEGER");
    localStringBuilder.append(" subType INTEGER");
    locala.columns[15] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  public n() {}
  
  public n(byte paramByte)
  {
    fe(0L);
  }
  
  private static int ff(long paramLong)
  {
    String str = new SimpleDateFormat("yyyyMMdd").format(new Date(1000L * paramLong));
    try
    {
      int i = Integer.valueOf(str).intValue();
      return i;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.SnsInfo", "error valueOf  " + str);
    }
    return (int)(paramLong / 86400L);
  }
  
  public static boolean fh(long paramLong)
  {
    return bi.bG(paramLong / 1000L) > 1200L;
  }
  
  public static void release()
  {
    try
    {
      nJj.clear();
      nJk.clear();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static n x(n paramn)
  {
    n localn = new n();
    localn.nJc = paramn.nJc;
    localn.field_snsId = paramn.field_snsId;
    localn.field_userName = paramn.field_userName;
    localn.field_localFlag = paramn.field_localFlag;
    localn.field_createTime = paramn.field_createTime;
    localn.field_head = paramn.field_head;
    localn.field_localPrivate = paramn.field_localPrivate;
    localn.field_type = paramn.field_type;
    localn.field_sourceType = paramn.field_sourceType;
    localn.field_likeFlag = paramn.field_likeFlag;
    localn.field_pravited = paramn.field_pravited;
    localn.field_stringSeq = paramn.field_stringSeq;
    localn.field_content = paramn.field_content;
    localn.field_attrBuf = paramn.field_attrBuf;
    return localn;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
  
  public final boolean Nj(String paramString)
  {
    paramString = com.tencent.mm.modelsns.e.ng(paramString);
    try
    {
      this.field_content = paramString.toByteArray();
      this.nJb = (g.u(this.field_content) + g.u(this.field_attrBuf));
      return true;
    }
    catch (Exception paramString)
    {
      x.printErrStackTrace("MicroMsg.SnsInfo", paramString, "", new Object[0]);
    }
    return false;
  }
  
  public final void aK(byte[] paramArrayOfByte)
  {
    this.field_attrBuf = paramArrayOfByte;
    this.nJb = (g.u(this.field_content) + g.u(this.field_attrBuf));
  }
  
  public final b bAF()
  {
    if (this.nJm == null) {
      this.nJm = af.byr().eZ(this.field_snsId);
    }
    if (this.nJm == null) {
      return new b(null);
    }
    return this.nJm.bAF();
  }
  
  public final a bAH()
  {
    if (this.nJm == null) {
      this.nJm = af.byr().eZ(this.field_snsId);
    }
    if (this.nJm == null) {
      return new a(null);
    }
    return this.nJm.bAH();
  }
  
  public final bsu bAJ()
  {
    Object localObject;
    if (this.field_content == null) {
      localObject = com.tencent.mm.modelsns.e.RF();
    }
    bsu localbsu;
    do
    {
      return (bsu)localObject;
      if (this.nJb == null) {
        this.nJb = (g.u(this.field_content) + g.u(this.field_attrBuf));
      }
      if (!nJj.containsKey(this.nJb)) {
        break;
      }
      localbsu = (bsu)nJj.get(this.nJb);
      localObject = localbsu;
    } while (localbsu != null);
    try
    {
      localObject = (bsu)new bsu().aG(this.field_content);
      nJj.put(this.nJb, localObject);
      return (bsu)localObject;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.SnsInfo", "error get snsinfo timeline!");
    }
    return com.tencent.mm.modelsns.e.RF();
  }
  
  public final String bAK()
  {
    if (xb(32)) {
      return v.ah("ad_table_", this.field_snsId);
    }
    return v.ah("sns_table_", this.field_snsId);
  }
  
  public final Bundle bAM()
  {
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("values", super.wH());
    localBundle.putInt("localid", this.nJc);
    if (bBp() != null) {
      localBundle.putBundle("adValues", bBp().bAM());
    }
    return localBundle;
  }
  
  public final atf bAW()
  {
    if (this.field_postBuf == null) {
      return new atf();
    }
    if (this.nJl == null) {
      this.nJl = g.u(this.field_postBuf);
    }
    if (nJk.containsKey(this.nJl))
    {
      this.nJn = ((atf)nJk.get(this.nJl));
      if (this.nJn != null) {
        return this.nJn;
      }
    }
    try
    {
      this.nJn = ((atf)new atf().aG(this.field_postBuf));
      nJk.put(this.nJl, this.nJn);
      return this.nJn;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.SnsInfo", "error get snsinfo timeline!");
    }
    return new atf();
  }
  
  public final int bAX()
  {
    return this.field_createTime;
  }
  
  public final void bAY()
  {
    this.field_localPrivate |= 0x1;
  }
  
  public final int bAZ()
  {
    return this.field_localPrivate;
  }
  
  public final boolean bBa()
  {
    return (this.field_localFlag & 0x80) > 0;
  }
  
  public final void bBb()
  {
    this.field_localFlag |= 0x2;
  }
  
  public final void bBc()
  {
    this.field_localFlag &= 0xFFFFFFFD;
  }
  
  public final boolean bBd()
  {
    return (this.field_localFlag & 0x2) > 0;
  }
  
  public final String bBe()
  {
    if (xb(32)) {
      return v.ah("ad_table_", this.nJc);
    }
    return v.ah("sns_table_", this.nJc);
  }
  
  public final boolean bBf()
  {
    return (this.field_localFlag & 0x10) > 0;
  }
  
  public final boolean bBg()
  {
    return ((this.field_localFlag & 0x20) > 0) && (this.field_snsId == 0L);
  }
  
  public final void bBh()
  {
    this.field_localFlag &= 0xFFFFFFDF;
  }
  
  public final void bBi()
  {
    this.field_localFlag |= 0x20;
  }
  
  public final String bBj()
  {
    a locala = bAH();
    if (locala == null) {
      return "";
    }
    return locala.nyk;
  }
  
  public final String bBk()
  {
    a locala = bAH();
    if (locala == null) {
      return "";
    }
    return locala.nyj;
  }
  
  public final String bBl()
  {
    b localb = bAF();
    if (localb != null) {
      return localb.nxZ;
    }
    return "";
  }
  
  public final String bBm()
  {
    a locala = bAH();
    if (locala != null) {
      return locala.nxZ;
    }
    return "";
  }
  
  public final String bBn()
  {
    a locala = bAH();
    if (locala != null) {
      return locala.fvT;
    }
    return "";
  }
  
  public final String bBo()
  {
    a locala = bAH();
    if (locala != null) {
      return locala.ntU;
    }
    return "";
  }
  
  public final e bBp()
  {
    if (this.nJm == null) {
      this.nJm = af.byr().eZ(this.field_snsId);
    }
    if (this.nJm != null)
    {
      this.nJm.field_createTime = this.field_createTime;
      this.nJm.field_userName = this.field_userName;
      this.nJm.field_likeFlag = this.field_likeFlag;
      this.nJm.field_attrBuf = this.field_attrBuf;
    }
    return this.nJm;
  }
  
  public final int bBq()
  {
    b localb = bAF();
    if (localb != null) {
      return localb.nyY;
    }
    return 0;
  }
  
  public final int bBr()
  {
    int i = 1;
    if (xb(32))
    {
      b localb = bAF();
      bsu localbsu = bAJ();
      if (localb.bzq()) {
        i = 3;
      }
      do
      {
        return i;
        if ((localbsu != null) && (localbsu.sqc.ruz == 27)) {
          return 6;
        }
        if (localb.bzr())
        {
          if ((localbsu != null) && (localbsu.sqc.ruz == 15) && (localbsu.sqj != 1)) {
            return 5;
          }
          return 4;
        }
      } while (this.field_type == 1);
      return 2;
    }
    return -1;
  }
  
  public final boolean bBs()
  {
    return bBr() == 6;
  }
  
  public final boolean bxX()
  {
    return this.field_snsId == 0L;
  }
  
  public final boolean bzr()
  {
    int i = bBr();
    return (i == 5) || (i == 4);
  }
  
  public final boolean bzx()
  {
    b localb = bAF();
    if (localb != null) {
      return localb.bzx();
    }
    return false;
  }
  
  public final void c(bsu parambsu)
  {
    try
    {
      this.field_content = parambsu.toByteArray();
      this.nJb = (g.u(this.field_content) + g.u(this.field_attrBuf));
      return;
    }
    catch (Exception parambsu)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.SnsInfo", parambsu, "", new Object[0]);
      }
    }
  }
  
  public final void d(Cursor paramCursor)
  {
    super.d(paramCursor);
    this.nJc = ((int)this.sKx);
  }
  
  public final void fe(long paramLong)
  {
    this.field_snsId = paramLong;
    if (paramLong != 0L) {
      fg(paramLong);
    }
  }
  
  public final void fg(long paramLong)
  {
    this.field_stringSeq = i.eF(paramLong);
    this.field_stringSeq = i.LK(this.field_stringSeq);
    x.d("MicroMsg.SnsInfo", paramLong + " stringSeq " + this.field_stringSeq);
  }
  
  public final String getUserName()
  {
    return this.field_userName;
  }
  
  public final void hK(int paramInt)
  {
    if ((paramInt - this.field_createTime < 180) && (paramInt - this.field_createTime >= 0))
    {
      if (this.field_head == 0) {
        this.field_head = ff(this.field_createTime);
      }
      return;
    }
    this.field_createTime = paramInt;
    this.field_head = ff(paramInt);
  }
  
  public final boolean isValid()
  {
    return this.field_snsId != 0L;
  }
  
  public final boolean kF()
  {
    return xb(32);
  }
  
  public final void wZ(int paramInt)
  {
    this.field_sourceType |= paramInt;
  }
  
  public final boolean xb(int paramInt)
  {
    return (this.field_sourceType & paramInt) > 0;
  }
  
  public final void xc(int paramInt)
  {
    this.field_sourceType &= (paramInt ^ 0xFFFFFFFF);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */