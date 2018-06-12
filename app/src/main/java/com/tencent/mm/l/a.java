package com.tencent.mm.l;

import android.database.Cursor;
import com.tencent.mm.a.o;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Field;
import java.util.Map;

public class a
  extends ai
{
  public static c.a dhO;
  private static a dhQ = null;
  public long dhP;
  public int versionCode = 0;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[21];
    locala.columns = new String[22];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "username";
    locala.sKA.put("username", "TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(" username TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "username";
    locala.columns[1] = "alias";
    locala.sKA.put("alias", "TEXT default '' ");
    localStringBuilder.append(" alias TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "conRemark";
    locala.sKA.put("conRemark", "TEXT default '' ");
    localStringBuilder.append(" conRemark TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "domainList";
    locala.sKA.put("domainList", "TEXT default '' ");
    localStringBuilder.append(" domainList TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[4] = "nickname";
    locala.sKA.put("nickname", "TEXT default '' ");
    localStringBuilder.append(" nickname TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[5] = "pyInitial";
    locala.sKA.put("pyInitial", "TEXT default '' ");
    localStringBuilder.append(" pyInitial TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[6] = "quanPin";
    locala.sKA.put("quanPin", "TEXT default '' ");
    localStringBuilder.append(" quanPin TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[7] = "showHead";
    locala.sKA.put("showHead", "INTEGER default '0' ");
    localStringBuilder.append(" showHead INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[8] = "type";
    locala.sKA.put("type", "INTEGER default '0' ");
    localStringBuilder.append(" type INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[9] = "weiboFlag";
    locala.sKA.put("weiboFlag", "INTEGER default '0' ");
    localStringBuilder.append(" weiboFlag INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[10] = "weiboNickname";
    locala.sKA.put("weiboNickname", "TEXT default '' ");
    localStringBuilder.append(" weiboNickname TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[11] = "conRemarkPYFull";
    locala.sKA.put("conRemarkPYFull", "TEXT default '' ");
    localStringBuilder.append(" conRemarkPYFull TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[12] = "conRemarkPYShort";
    locala.sKA.put("conRemarkPYShort", "TEXT default '' ");
    localStringBuilder.append(" conRemarkPYShort TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[13] = "lvbuff";
    locala.sKA.put("lvbuff", "BLOB");
    localStringBuilder.append(" lvbuff BLOB");
    localStringBuilder.append(", ");
    locala.columns[14] = "verifyFlag";
    locala.sKA.put("verifyFlag", "INTEGER default '0' ");
    localStringBuilder.append(" verifyFlag INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[15] = "encryptUsername";
    locala.sKA.put("encryptUsername", "TEXT default '' ");
    localStringBuilder.append(" encryptUsername TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[16] = "chatroomFlag";
    locala.sKA.put("chatroomFlag", "INTEGER");
    localStringBuilder.append(" chatroomFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[17] = "deleteFlag";
    locala.sKA.put("deleteFlag", "INTEGER default '0' ");
    localStringBuilder.append(" deleteFlag INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[18] = "contactLabelIds";
    locala.sKA.put("contactLabelIds", "TEXT default '' ");
    localStringBuilder.append(" contactLabelIds TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[19] = "descWordingId";
    locala.sKA.put("descWordingId", "TEXT default '' ");
    localStringBuilder.append(" descWordingId TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[20] = "openImAppid";
    locala.sKA.put("openImAppid", "TEXT");
    localStringBuilder.append(" openImAppid TEXT");
    locala.columns[21] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  public a()
  {
    super.setUsername("");
    super.dx("");
    super.dy("");
    super.dz("");
    super.du("");
    super.dv("");
    super.dC("");
    super.dB("");
    super.dw("");
    super.eE(0);
    super.dA("");
    super.eD(0);
    super.setType(0);
    super.eF(0);
    super.eG(0);
    super.dE("");
    super.eJ(0);
    super.dP("");
    super.eP(0);
    super.eK(0);
    super.dI("");
    super.dJ("");
    super.eL(0);
    super.eM(0);
    super.dK("");
    super.dL("");
    super.eN(1);
    super.eI(0);
    super.eO(0);
    super.dM("");
    super.dN("");
    super.dO("");
    super.setSource(0);
    super.dR("");
    super.dQ("");
    super.ar(0L);
    super.dH("");
    super.dS("");
    super.eQ(0);
    super.dV("");
    super.dW("");
    super.dX("");
    super.ea("");
    super.dF("");
    super.dG("");
    this.versionCode = 0;
  }
  
  public a(String paramString)
  {
    this();
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    setUsername(str);
  }
  
  private int BO()
  {
    int i = this.versionCode + 1;
    this.versionCode = i;
    return i;
  }
  
  public static int Bs()
  {
    return 1;
  }
  
  public static int Bt()
  {
    return 8;
  }
  
  public static int Bu()
  {
    return 524288;
  }
  
  public static int Bv()
  {
    return 16;
  }
  
  public static int Bw()
  {
    return 32;
  }
  
  public static void a(a parama)
  {
    dhQ = parama;
  }
  
  public static String fv(String paramString)
  {
    if (dhQ != null) {
      return dhQ.cY(paramString);
    }
    return null;
  }
  
  public static boolean gd(int paramInt)
  {
    return (paramInt & 0x1) != 0;
  }
  
  private static boolean isLetter(char paramChar)
  {
    return ((paramChar >= 'A') && (paramChar <= 'Z')) || ((paramChar >= 'a') && (paramChar <= 'z'));
  }
  
  public final c.a AX()
  {
    return dhO;
  }
  
  public final int AY()
  {
    int j = 32;
    int i;
    if ((this.field_conRemarkPYShort != null) && (!this.field_conRemarkPYShort.equals("")))
    {
      i = this.field_conRemarkPYShort.charAt(0);
      if ((i < 97) || (i > 122)) {
        break label240;
      }
      j = (char)(i - 32);
    }
    label240:
    do
    {
      return j;
      if ((this.field_conRemarkPYFull != null) && (!this.field_conRemarkPYFull.equals("")))
      {
        i = this.field_conRemarkPYFull.charAt(0);
        break;
      }
      if ((super.wP() != null) && (!super.wP().equals("")))
      {
        i = super.wP().charAt(0);
        break;
      }
      if ((super.wQ() != null) && (!super.wQ().equals("")))
      {
        i = super.wQ().charAt(0);
        break;
      }
      if ((this.field_nickname != null) && (!this.field_nickname.equals("")) && (isLetter(this.field_nickname.charAt(0))))
      {
        i = this.field_nickname.charAt(0);
        break;
      }
      i = j;
      if (this.field_username == null) {
        break;
      }
      i = j;
      if (this.field_username.equals("")) {
        break;
      }
      i = j;
      if (!isLetter(this.field_username.charAt(0))) {
        break;
      }
      i = this.field_username.charAt(0);
      break;
      if (i < 65) {
        break label254;
      }
      j = i;
    } while (i <= 90);
    label254:
    return 123;
  }
  
  public final void AZ()
  {
    setType(0);
  }
  
  public final void B(byte[] paramArrayOfByte)
  {
    if (!bi.isEqual(this.field_lvbuff, paramArrayOfByte))
    {
      super.B(paramArrayOfByte);
      BO();
    }
  }
  
  public final boolean BA()
  {
    return (this.field_type & 0x8) != 0;
  }
  
  public final boolean BB()
  {
    return (0x80000 & this.field_type) != 0;
  }
  
  public final boolean BC()
  {
    return (this.field_type & 0x40) != 0;
  }
  
  public final boolean BD()
  {
    return (this.field_type & 0x200) != 0;
  }
  
  public final boolean BE()
  {
    return (this.field_type & 0x400) == 0;
  }
  
  public final boolean BF()
  {
    return (this.field_type & 0x100) != 0;
  }
  
  public final boolean BG()
  {
    return (this.field_type & 0x800) != 0;
  }
  
  public final boolean BH()
  {
    return (0x8000 & this.field_type) != 0;
  }
  
  public final void BI()
  {
    setType(this.field_type | 0x8000);
  }
  
  public final int BJ()
  {
    return (int)this.dhP;
  }
  
  public final String BK()
  {
    if (dhQ != null) {}
    for (String str = dhQ.cY(this.field_username); str != null; str = null) {
      return str;
    }
    if ((this.field_nickname == null) || (this.field_nickname.length() <= 0)) {
      return BM();
    }
    return this.field_nickname;
  }
  
  public final String BL()
  {
    if ((this.field_conRemark != null) && (!this.field_conRemark.trim().equals(""))) {
      return this.field_conRemark;
    }
    return BK();
  }
  
  public final String BM()
  {
    Object localObject2 = wM();
    if (!bi.oW((String)localObject2)) {
      return (String)localObject2;
    }
    localObject2 = this.field_username;
    Object localObject1;
    if (localObject2 == null) {
      localObject1 = null;
    }
    for (;;)
    {
      if (localObject1 != null)
      {
        localObject2 = localObject1;
        if (((String)localObject1).length() != 0) {
          break;
        }
      }
      return this.field_username;
      if (((String)localObject2).toLowerCase().endsWith("@t.qq.com"))
      {
        localObject1 = "@" + ((String)localObject2).replace("@t.qq.com", "");
      }
      else
      {
        localObject1 = localObject2;
        if (((String)localObject2).toLowerCase().endsWith("@qqim"))
        {
          localObject1 = ((String)localObject2).replace("@qqim", "");
          long l = Long.valueOf((String)localObject1).longValue();
          if (l < 0L) {
            localObject1 = new o(l).toString();
          }
        }
      }
    }
  }
  
  public final int BN()
  {
    return super.getSource();
  }
  
  public final void Ba()
  {
    setType(this.field_type | 0x4);
  }
  
  public final void Bb()
  {
    setType(this.field_type | 0x1);
  }
  
  public final void Bc()
  {
    x.w("MicroMsg.RContact", "unSetContact!! user:%s oldType:%d [%s]", new Object[] { this.field_username, Integer.valueOf(this.field_type), bi.cjd() });
    setType(this.field_type & 0xFFFFFFFE);
  }
  
  public final void Bd()
  {
    setType(this.field_type | 0x8);
  }
  
  public final void Be()
  {
    setType(this.field_type & 0xFFFFFFF7);
  }
  
  public final void Bf()
  {
    setType(this.field_type | 0x80000);
  }
  
  public final void Bg()
  {
    setType(this.field_type & 0xFFF7FFFF);
  }
  
  public final void Bh()
  {
    setType(this.field_type | 0x2);
  }
  
  public final void Bi()
  {
    setType(this.field_type & 0xFFFFFFFD);
  }
  
  public final void Bj()
  {
    setType(this.field_type & 0xF7FF);
  }
  
  public final void Bk()
  {
    setType(this.field_type | 0x20);
  }
  
  public final void Bl()
  {
    setType(this.field_type & 0xFFFFFFDF);
  }
  
  public final void Bm()
  {
    setType(this.field_type | 0x40);
  }
  
  public final void Bn()
  {
    setType(this.field_type & 0xFFFFFFBF);
  }
  
  public final void Bo()
  {
    setType(this.field_type | 0x200);
  }
  
  public final void Bp()
  {
    setType(this.field_type & 0xFDFF);
  }
  
  public final void Bq()
  {
    setType(this.field_type | 0x100);
  }
  
  public final void Br()
  {
    setType(this.field_type & 0xFEFF);
  }
  
  public final boolean Bx()
  {
    return gd(this.field_type);
  }
  
  public final boolean By()
  {
    return (this.field_type & 0x2) != 0;
  }
  
  public final boolean Bz()
  {
    return (this.field_type & 0x4) != 0;
  }
  
  public final void ar(long paramLong)
  {
    if (!bi.K(this.csC, paramLong))
    {
      super.ar(paramLong);
      BO();
    }
  }
  
  public final void d(Cursor paramCursor)
  {
    super.d(paramCursor);
    this.dhP = this.sKx;
    super.B(null);
  }
  
  public final void dA(String paramString)
  {
    if (!bi.fS(this.field_weiboNickname, paramString))
    {
      super.dA(paramString);
      BO();
    }
  }
  
  public final void dB(String paramString)
  {
    if (!bi.fS(this.field_conRemarkPYFull, paramString))
    {
      super.dB(paramString);
      BO();
    }
  }
  
  public final void dC(String paramString)
  {
    if (!bi.fS(this.field_conRemarkPYShort, paramString))
    {
      super.dC(paramString);
      BO();
    }
  }
  
  public final void dD(String paramString)
  {
    if (!bi.fS(this.field_encryptUsername, paramString))
    {
      super.dD(paramString);
      BO();
    }
  }
  
  public final void dE(String paramString)
  {
    if (!bi.fS(this.field_contactLabelIds, paramString))
    {
      super.dE(paramString);
      BO();
    }
  }
  
  public final void dH(String paramString)
  {
    if (!bi.fS(this.csB, paramString))
    {
      super.dH(paramString);
      BO();
    }
  }
  
  public final void dI(String paramString)
  {
    if (!bi.fS(this.csD, paramString))
    {
      super.dI(paramString);
      BO();
    }
  }
  
  public final void dJ(String paramString)
  {
    if (!bi.fS(this.bTi, paramString))
    {
      super.dJ(paramString);
      BO();
    }
  }
  
  public final void dK(String paramString)
  {
    if (!bi.fS(this.csG, paramString))
    {
      super.dK(paramString);
      BO();
    }
  }
  
  public final void dL(String paramString)
  {
    if (!bi.fS(this.csH, paramString))
    {
      super.dL(paramString);
      BO();
    }
  }
  
  public final void dM(String paramString)
  {
    if (!bi.fS(this.signature, paramString))
    {
      super.dM(paramString);
      BO();
    }
  }
  
  public void dN(String paramString)
  {
    if (!bi.fS(getProvince(), paramString))
    {
      super.dN(paramString);
      BO();
    }
  }
  
  public void dO(String paramString)
  {
    if (!bi.fS(getCity(), paramString))
    {
      super.dO(paramString);
      BO();
    }
  }
  
  public final void dP(String paramString)
  {
    if (!bi.fS(this.csM, paramString))
    {
      super.dP(paramString);
      BO();
    }
  }
  
  public final void dQ(String paramString)
  {
    if (!bi.fS(this.csO, paramString))
    {
      super.dQ(paramString);
      BO();
    }
  }
  
  public final void dR(String paramString)
  {
    if (!bi.fS(this.csP, paramString))
    {
      super.dR(paramString);
      BO();
    }
  }
  
  public void dS(String paramString)
  {
    if (!bi.fS(this.csQ, paramString))
    {
      super.dS(paramString);
      BO();
    }
  }
  
  public final void dT(String paramString)
  {
    if (!bi.fS(this.csT, paramString))
    {
      super.dT(paramString);
      BO();
    }
  }
  
  public final void dU(String paramString)
  {
    if (!bi.fS(this.csU, paramString))
    {
      super.dU(paramString);
      BO();
    }
  }
  
  public final void dV(String paramString)
  {
    if (!bi.fS(this.csV, paramString))
    {
      super.dV(paramString);
      BO();
    }
  }
  
  public final void dW(String paramString)
  {
    if (!bi.fS(this.csW, paramString))
    {
      super.dW(paramString);
      BO();
    }
  }
  
  public final void dX(String paramString)
  {
    if (!bi.fS(this.csX, paramString))
    {
      super.dX(paramString);
      BO();
    }
  }
  
  public final void dY(String paramString)
  {
    if (!bi.fS(this.csY, paramString))
    {
      super.dY(paramString);
      BO();
    }
  }
  
  public final void dZ(String paramString)
  {
    if (!bi.fS(this.csZ, paramString))
    {
      super.dZ(paramString);
      BO();
    }
  }
  
  public final void du(String paramString)
  {
    if (!bi.fS(wM(), paramString))
    {
      super.du(paramString);
      BO();
    }
  }
  
  public final void dv(String paramString)
  {
    if (!bi.fS(this.field_conRemark, paramString))
    {
      super.dv(paramString);
      BO();
    }
  }
  
  public final void dw(String paramString)
  {
    if (!bi.fS(this.field_domainList, paramString))
    {
      super.dw(paramString);
      BO();
    }
  }
  
  public final void dx(String paramString)
  {
    if (!bi.fS(this.field_nickname, paramString))
    {
      super.dx(paramString);
      BO();
    }
  }
  
  public final void dy(String paramString)
  {
    if (!bi.fS(wP(), paramString))
    {
      super.dy(paramString);
      BO();
    }
  }
  
  public final void dz(String paramString)
  {
    if (!bi.fS(wQ(), paramString))
    {
      super.dz(paramString);
      BO();
    }
  }
  
  public final void eD(int paramInt)
  {
    if (!bi.eG(this.field_showHead, paramInt))
    {
      super.eD(paramInt);
      BO();
    }
  }
  
  public final void eE(int paramInt)
  {
    if (!bi.eG(this.field_weiboFlag, paramInt))
    {
      super.eE(paramInt);
      BO();
    }
  }
  
  public final void eF(int paramInt)
  {
    if (!bi.eG(this.field_verifyFlag, paramInt))
    {
      super.eF(paramInt);
      BO();
    }
  }
  
  public final void eG(int paramInt)
  {
    if (!bi.eG(this.field_chatroomFlag, paramInt))
    {
      super.eG(paramInt);
      BO();
    }
  }
  
  public final void eH(int paramInt)
  {
    if (!bi.eG(this.field_deleteFlag, paramInt))
    {
      super.eH(paramInt);
      BO();
    }
  }
  
  public final void eI(int paramInt)
  {
    if (!bi.eG(this.csA, paramInt))
    {
      super.eI(paramInt);
      BO();
    }
  }
  
  public final void eJ(int paramInt)
  {
    if (!bi.eG(this.sex, paramInt))
    {
      super.eJ(paramInt);
      BO();
    }
  }
  
  public final void eK(int paramInt)
  {
    if (!bi.eG(this.uin, paramInt))
    {
      super.eK(paramInt);
      BO();
    }
  }
  
  public final void eL(int paramInt)
  {
    if (!bi.eG(this.csE, paramInt))
    {
      super.eL(paramInt);
      BO();
    }
  }
  
  public final void eM(int paramInt)
  {
    if (!bi.eG(this.csF, paramInt))
    {
      super.eM(paramInt);
      BO();
    }
  }
  
  public final void eN(int paramInt)
  {
    if (!bi.eG(this.csI, paramInt))
    {
      super.eN(paramInt);
      BO();
    }
  }
  
  public final void eO(int paramInt)
  {
    if (!bi.eG(this.csJ, paramInt))
    {
      super.eO(paramInt);
      BO();
    }
  }
  
  public final void eP(int paramInt)
  {
    if (!bi.eG(this.csN, paramInt))
    {
      super.eP(paramInt);
      BO();
    }
  }
  
  public final void eQ(int paramInt)
  {
    if (!bi.eG(this.csR, paramInt))
    {
      super.eQ(paramInt);
      BO();
    }
  }
  
  public final void eR(int paramInt)
  {
    if (!bi.eG(this.csS, paramInt))
    {
      super.eR(paramInt);
      BO();
    }
  }
  
  public final void ea(String paramString)
  {
    if (!bi.fS(this.cta, paramString))
    {
      super.ea(paramString);
      BO();
    }
  }
  
  public final void ge(int paramInt)
  {
    eG(this.field_chatroomFlag & 0xFFFFFFFE | paramInt & 0x1);
  }
  
  public final int getSource()
  {
    return super.getSource() % 1000000;
  }
  
  public final boolean isHidden()
  {
    return (this.field_type & 0x20) != 0;
  }
  
  public final void setSource(int paramInt)
  {
    if (!bi.eG(super.getSource(), paramInt))
    {
      super.setSource(paramInt);
      BO();
    }
  }
  
  public final void setType(int paramInt)
  {
    if (!bi.eG(this.field_type, paramInt))
    {
      super.setType(paramInt);
      BO();
    }
  }
  
  public final void setUsername(String paramString)
  {
    if (!bi.fS(this.field_username, paramString))
    {
      super.setUsername(paramString);
      BO();
    }
  }
  
  public final String wM()
  {
    if (dhQ != null) {}
    for (String str1 = dhQ.cZ(this.field_username);; str1 = null)
    {
      String str2 = str1;
      if (str1 == null) {
        str2 = super.wM();
      }
      return str2;
    }
  }
  
  public final String wP()
  {
    if ((super.wP() == null) || (super.wP().length() < 0)) {
      return wQ();
    }
    return super.wP();
  }
  
  public final String wQ()
  {
    if ((super.wQ() == null) || (super.wQ().length() < 0)) {
      return this.field_nickname;
    }
    return super.wQ();
  }
  
  public static abstract interface a
  {
    public abstract String cY(String paramString);
    
    public abstract String cZ(String paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/l/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */