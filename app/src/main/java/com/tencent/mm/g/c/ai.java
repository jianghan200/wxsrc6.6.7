package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.u;
import com.tencent.mm.sdk.platformtools.x;

public abstract class ai
  extends c
{
  public static final String[] ciG = { "CREATE INDEX IF NOT EXISTS deleteflag_index ON Contact(deleteFlag)" };
  private static final int ciP = "rowid".hashCode();
  private static final int cke;
  private static final int cli = "username".hashCode();
  private static final int cmw;
  private static final int cpI;
  private static final int csj = "alias".hashCode();
  private static final int csk = "conRemark".hashCode();
  private static final int csl = "domainList".hashCode();
  private static final int csm;
  private static final int csn;
  private static final int cso;
  private static final int csp;
  private static final int csq;
  private static final int csr;
  private static final int css;
  private static final int cst;
  private static final int csu;
  private static final int csv;
  private static final int csw;
  private static final int csx;
  private static final int csy;
  private static final int csz;
  public String bTi;
  private boolean cjI = false;
  private boolean clZ = false;
  private boolean clg = false;
  private boolean cpE = false;
  private boolean crS = false;
  private boolean crT = false;
  private boolean crU = false;
  private boolean crV = false;
  private boolean crW = false;
  private boolean crX = false;
  private boolean crY = false;
  private boolean crZ = false;
  public int csA;
  public String csB;
  public long csC;
  public String csD;
  public int csE;
  public int csF;
  public String csG;
  public String csH;
  public int csI;
  public int csJ;
  private String csK;
  private String csL;
  public String csM;
  public int csN;
  public String csO;
  public String csP;
  public String csQ;
  public int csR;
  public int csS;
  public String csT;
  public String csU;
  public String csV;
  public String csW;
  public String csX;
  public String csY;
  public String csZ;
  private boolean csa = false;
  private boolean csb = false;
  private boolean csc = false;
  private boolean csd = false;
  private boolean cse = false;
  private boolean csf = false;
  private boolean csg = false;
  private boolean csh = false;
  private boolean csi = false;
  public String cta;
  private int ctb;
  private String ctc;
  public int ctd;
  public String cte;
  private String field_alias;
  public int field_chatroomFlag;
  public String field_conRemark;
  public String field_conRemarkPYFull;
  public String field_conRemarkPYShort;
  public String field_contactLabelIds;
  public int field_deleteFlag;
  public String field_descWordingId;
  public String field_domainList;
  public String field_encryptUsername;
  public byte[] field_lvbuff;
  public String field_nickname;
  public String field_openImAppid;
  private String field_pyInitial;
  private String field_quanPin;
  public int field_showHead;
  public int field_type;
  public String field_username;
  public int field_verifyFlag;
  public int field_weiboFlag;
  public String field_weiboNickname;
  public int sex;
  public String signature;
  private int source;
  public int uin;
  
  static
  {
    cpI = "nickname".hashCode();
    csm = "pyInitial".hashCode();
    csn = "quanPin".hashCode();
    cso = "showHead".hashCode();
    cke = "type".hashCode();
    csp = "weiboFlag".hashCode();
    csq = "weiboNickname".hashCode();
    csr = "conRemarkPYFull".hashCode();
    css = "conRemarkPYShort".hashCode();
    cmw = "lvbuff".hashCode();
    cst = "verifyFlag".hashCode();
    csu = "encryptUsername".hashCode();
    csv = "chatroomFlag".hashCode();
    csw = "deleteFlag".hashCode();
    csx = "contactLabelIds".hashCode();
    csy = "descWordingId".hashCode();
    csz = "openImAppid".hashCode();
  }
  
  public void B(byte[] paramArrayOfByte)
  {
    this.field_lvbuff = paramArrayOfByte;
    this.clZ = true;
  }
  
  public void ar(long paramLong)
  {
    this.csC = paramLong;
    this.clZ = true;
  }
  
  public void d(Cursor paramCursor)
  {
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null) {
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (cli == k)
      {
        this.field_username = paramCursor.getString(i);
        this.clg = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (csj == k) {
          this.field_alias = paramCursor.getString(i);
        } else if (csk == k) {
          this.field_conRemark = paramCursor.getString(i);
        } else if (csl == k) {
          this.field_domainList = paramCursor.getString(i);
        } else if (cpI == k) {
          this.field_nickname = paramCursor.getString(i);
        } else if (csm == k) {
          this.field_pyInitial = paramCursor.getString(i);
        } else if (csn == k) {
          this.field_quanPin = paramCursor.getString(i);
        } else if (cso == k) {
          this.field_showHead = paramCursor.getInt(i);
        } else if (cke == k) {
          this.field_type = paramCursor.getInt(i);
        } else if (csp == k) {
          this.field_weiboFlag = paramCursor.getInt(i);
        } else if (csq == k) {
          this.field_weiboNickname = paramCursor.getString(i);
        } else if (csr == k) {
          this.field_conRemarkPYFull = paramCursor.getString(i);
        } else if (css == k) {
          this.field_conRemarkPYShort = paramCursor.getString(i);
        } else if (cmw == k) {
          this.field_lvbuff = paramCursor.getBlob(i);
        } else if (cst == k) {
          this.field_verifyFlag = paramCursor.getInt(i);
        } else if (csu == k) {
          this.field_encryptUsername = paramCursor.getString(i);
        } else if (csv == k) {
          this.field_chatroomFlag = paramCursor.getInt(i);
        } else if (csw == k) {
          this.field_deleteFlag = paramCursor.getInt(i);
        } else if (csx == k) {
          this.field_contactLabelIds = paramCursor.getString(i);
        } else if (csy == k) {
          this.field_descWordingId = paramCursor.getString(i);
        } else if (csz == k) {
          this.field_openImAppid = paramCursor.getString(i);
        } else if (ciP == k) {
          this.sKx = paramCursor.getLong(i);
        }
      }
    }
    wS();
  }
  
  public void dA(String paramString)
  {
    this.field_weiboNickname = paramString;
    this.crZ = true;
  }
  
  public void dB(String paramString)
  {
    this.field_conRemarkPYFull = paramString;
    this.csa = true;
  }
  
  public void dC(String paramString)
  {
    this.field_conRemarkPYShort = paramString;
    this.csb = true;
  }
  
  public void dD(String paramString)
  {
    this.field_encryptUsername = paramString;
    this.csd = true;
  }
  
  public void dE(String paramString)
  {
    this.field_contactLabelIds = paramString;
    this.csg = true;
  }
  
  public final void dF(String paramString)
  {
    this.field_descWordingId = paramString;
    this.csh = true;
  }
  
  public final void dG(String paramString)
  {
    this.field_openImAppid = paramString;
    this.csi = true;
  }
  
  public void dH(String paramString)
  {
    this.csB = paramString;
    this.clZ = true;
  }
  
  public void dI(String paramString)
  {
    this.csD = paramString;
    this.clZ = true;
  }
  
  public void dJ(String paramString)
  {
    this.bTi = paramString;
    this.clZ = true;
  }
  
  public void dK(String paramString)
  {
    this.csG = paramString;
    this.clZ = true;
  }
  
  public void dL(String paramString)
  {
    this.csH = paramString;
    this.clZ = true;
  }
  
  public void dM(String paramString)
  {
    this.signature = paramString;
    this.clZ = true;
  }
  
  public void dN(String paramString)
  {
    this.csK = paramString;
    this.clZ = true;
  }
  
  public void dO(String paramString)
  {
    this.csL = paramString;
    this.clZ = true;
  }
  
  public void dP(String paramString)
  {
    this.csM = paramString;
    this.clZ = true;
  }
  
  public void dQ(String paramString)
  {
    this.csO = paramString;
    this.clZ = true;
  }
  
  public void dR(String paramString)
  {
    this.csP = paramString;
    this.clZ = true;
  }
  
  public void dS(String paramString)
  {
    this.csQ = paramString;
    this.clZ = true;
  }
  
  public void dT(String paramString)
  {
    this.csT = paramString;
    this.clZ = true;
  }
  
  public void dU(String paramString)
  {
    this.csU = paramString;
    this.clZ = true;
  }
  
  public void dV(String paramString)
  {
    this.csV = paramString;
    this.clZ = true;
  }
  
  public void dW(String paramString)
  {
    this.csW = paramString;
    this.clZ = true;
  }
  
  public void dX(String paramString)
  {
    this.csX = paramString;
    this.clZ = true;
  }
  
  public void dY(String paramString)
  {
    this.csY = paramString;
    this.clZ = true;
  }
  
  public void dZ(String paramString)
  {
    this.csZ = paramString;
    this.clZ = true;
  }
  
  public void du(String paramString)
  {
    this.field_alias = paramString;
    this.crS = true;
  }
  
  public void dv(String paramString)
  {
    this.field_conRemark = paramString;
    this.crT = true;
  }
  
  public void dw(String paramString)
  {
    this.field_domainList = paramString;
    this.crU = true;
  }
  
  public void dx(String paramString)
  {
    this.field_nickname = paramString;
    this.cpE = true;
  }
  
  public void dy(String paramString)
  {
    this.field_pyInitial = paramString;
    this.crV = true;
  }
  
  public void dz(String paramString)
  {
    this.field_quanPin = paramString;
    this.crW = true;
  }
  
  public void eD(int paramInt)
  {
    this.field_showHead = paramInt;
    this.crX = true;
  }
  
  public void eE(int paramInt)
  {
    this.field_weiboFlag = paramInt;
    this.crY = true;
  }
  
  public void eF(int paramInt)
  {
    this.field_verifyFlag = paramInt;
    this.csc = true;
  }
  
  public void eG(int paramInt)
  {
    this.field_chatroomFlag = paramInt;
    this.cse = true;
  }
  
  public void eH(int paramInt)
  {
    this.field_deleteFlag = paramInt;
    this.csf = true;
  }
  
  public void eI(int paramInt)
  {
    this.csA = paramInt;
    this.clZ = true;
  }
  
  public void eJ(int paramInt)
  {
    this.sex = paramInt;
    this.clZ = true;
  }
  
  public void eK(int paramInt)
  {
    this.uin = paramInt;
    this.clZ = true;
  }
  
  public void eL(int paramInt)
  {
    this.csE = paramInt;
    this.clZ = true;
  }
  
  public void eM(int paramInt)
  {
    this.csF = paramInt;
    this.clZ = true;
  }
  
  public void eN(int paramInt)
  {
    this.csI = paramInt;
    this.clZ = true;
  }
  
  public void eO(int paramInt)
  {
    this.csJ = paramInt;
    this.clZ = true;
  }
  
  public void eP(int paramInt)
  {
    this.csN = paramInt;
    this.clZ = true;
  }
  
  public void eQ(int paramInt)
  {
    this.csR = paramInt;
    this.clZ = true;
  }
  
  public void eR(int paramInt)
  {
    this.csS = paramInt;
    this.clZ = true;
  }
  
  public final void eS(int paramInt)
  {
    this.ctb = paramInt;
    this.clZ = true;
  }
  
  public final void eT(int paramInt)
  {
    this.ctd = paramInt;
    this.clZ = true;
  }
  
  public void ea(String paramString)
  {
    this.cta = paramString;
    this.clZ = true;
  }
  
  public final void eb(String paramString)
  {
    this.cte = paramString;
    this.clZ = true;
  }
  
  public String getCity()
  {
    return this.csL;
  }
  
  public String getProvince()
  {
    return this.csK;
  }
  
  public int getSource()
  {
    return this.source;
  }
  
  public final String getUsername()
  {
    return this.field_username;
  }
  
  public void setSource(int paramInt)
  {
    this.source = paramInt;
    this.clZ = true;
  }
  
  public void setType(int paramInt)
  {
    this.field_type = paramInt;
    this.cjI = true;
  }
  
  public void setUsername(String paramString)
  {
    this.field_username = paramString;
    this.clg = true;
  }
  
  public final ContentValues wH()
  {
    try
    {
      if (this.clZ)
      {
        localObject = new u();
        ((u)localObject).chE();
        ((u)localObject).CZ(this.csA);
        ((u)localObject).CZ(this.sex);
        ((u)localObject).Wj(this.csB);
        ((u)localObject).fX(this.csC);
        ((u)localObject).CZ(this.uin);
        ((u)localObject).Wj(this.csD);
        ((u)localObject).Wj(this.bTi);
        ((u)localObject).CZ(this.csE);
        ((u)localObject).CZ(this.csF);
        ((u)localObject).Wj(this.csG);
        ((u)localObject).Wj(this.csH);
        ((u)localObject).CZ(this.csI);
        ((u)localObject).CZ(this.csJ);
        ((u)localObject).Wj(this.signature);
        ((u)localObject).Wj(this.csK);
        ((u)localObject).Wj(this.csL);
        ((u)localObject).Wj(this.csM);
        ((u)localObject).CZ(this.csN);
        ((u)localObject).CZ(this.source);
        ((u)localObject).Wj(this.csO);
        ((u)localObject).CZ(this.field_verifyFlag);
        ((u)localObject).Wj(this.csP);
        ((u)localObject).Wj(this.csQ);
        ((u)localObject).CZ(this.csR);
        ((u)localObject).CZ(this.csS);
        ((u)localObject).Wj(this.csT);
        ((u)localObject).Wj(this.csU);
        ((u)localObject).Wj(this.csV);
        ((u)localObject).Wj(this.csW);
        ((u)localObject).Wj(this.csX);
        ((u)localObject).Wj(this.csY);
        ((u)localObject).Wj(this.csZ);
        ((u)localObject).Wj(this.cta);
        ((u)localObject).CZ(this.ctb);
        ((u)localObject).Wj(this.ctc);
        ((u)localObject).CZ(this.ctd);
        ((u)localObject).Wj(this.cte);
        this.field_lvbuff = ((u)localObject).chF();
      }
      Object localObject = new ContentValues();
      if (this.field_username == null) {
        this.field_username = "";
      }
      if (this.clg) {
        ((ContentValues)localObject).put("username", this.field_username);
      }
      if (this.field_alias == null) {
        this.field_alias = "";
      }
      if (this.crS) {
        ((ContentValues)localObject).put("alias", this.field_alias);
      }
      if (this.field_conRemark == null) {
        this.field_conRemark = "";
      }
      if (this.crT) {
        ((ContentValues)localObject).put("conRemark", this.field_conRemark);
      }
      if (this.field_domainList == null) {
        this.field_domainList = "";
      }
      if (this.crU) {
        ((ContentValues)localObject).put("domainList", this.field_domainList);
      }
      if (this.field_nickname == null) {
        this.field_nickname = "";
      }
      if (this.cpE) {
        ((ContentValues)localObject).put("nickname", this.field_nickname);
      }
      if (this.field_pyInitial == null) {
        this.field_pyInitial = "";
      }
      if (this.crV) {
        ((ContentValues)localObject).put("pyInitial", this.field_pyInitial);
      }
      if (this.field_quanPin == null) {
        this.field_quanPin = "";
      }
      if (this.crW) {
        ((ContentValues)localObject).put("quanPin", this.field_quanPin);
      }
      if (this.crX) {
        ((ContentValues)localObject).put("showHead", Integer.valueOf(this.field_showHead));
      }
      if (this.cjI) {
        ((ContentValues)localObject).put("type", Integer.valueOf(this.field_type));
      }
      if (this.crY) {
        ((ContentValues)localObject).put("weiboFlag", Integer.valueOf(this.field_weiboFlag));
      }
      if (this.field_weiboNickname == null) {
        this.field_weiboNickname = "";
      }
      if (this.crZ) {
        ((ContentValues)localObject).put("weiboNickname", this.field_weiboNickname);
      }
      if (this.field_conRemarkPYFull == null) {
        this.field_conRemarkPYFull = "";
      }
      if (this.csa) {
        ((ContentValues)localObject).put("conRemarkPYFull", this.field_conRemarkPYFull);
      }
      if (this.field_conRemarkPYShort == null) {
        this.field_conRemarkPYShort = "";
      }
      if (this.csb) {
        ((ContentValues)localObject).put("conRemarkPYShort", this.field_conRemarkPYShort);
      }
      if (this.clZ) {
        ((ContentValues)localObject).put("lvbuff", this.field_lvbuff);
      }
      if (this.csc) {
        ((ContentValues)localObject).put("verifyFlag", Integer.valueOf(this.field_verifyFlag));
      }
      if (this.field_encryptUsername == null) {
        this.field_encryptUsername = "";
      }
      if (this.csd) {
        ((ContentValues)localObject).put("encryptUsername", this.field_encryptUsername);
      }
      if (this.cse) {
        ((ContentValues)localObject).put("chatroomFlag", Integer.valueOf(this.field_chatroomFlag));
      }
      if (this.csf) {
        ((ContentValues)localObject).put("deleteFlag", Integer.valueOf(this.field_deleteFlag));
      }
      if (this.field_contactLabelIds == null) {
        this.field_contactLabelIds = "";
      }
      if (this.csg) {
        ((ContentValues)localObject).put("contactLabelIds", this.field_contactLabelIds);
      }
      if (this.field_descWordingId == null) {
        this.field_descWordingId = "";
      }
      if (this.csh) {
        ((ContentValues)localObject).put("descWordingId", this.field_descWordingId);
      }
      if (this.csi) {
        ((ContentValues)localObject).put("openImAppid", this.field_openImAppid);
      }
      if (this.sKx > 0L) {
        ((ContentValues)localObject).put("rowid", Long.valueOf(this.sKx));
      }
      return (ContentValues)localObject;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.e("MicroMsg.SDK.BaseContact", "get value failed, %s", new Object[] { localException.getMessage() });
      }
    }
  }
  
  public String wM()
  {
    return this.field_alias;
  }
  
  public final String wN()
  {
    return this.field_conRemark;
  }
  
  public final String wO()
  {
    return this.field_nickname;
  }
  
  public String wP()
  {
    return this.field_pyInitial;
  }
  
  public String wQ()
  {
    return this.field_quanPin;
  }
  
  public final String wR()
  {
    return this.field_encryptUsername;
  }
  
  public final void wS()
  {
    try
    {
      if (this.field_lvbuff == null) {
        return;
      }
      if (this.field_lvbuff.length == 0) {
        return;
      }
      u localu = new u();
      int i = localu.by(this.field_lvbuff);
      if (i != 0)
      {
        x.e("MicroMsg.SDK.BaseContact", "parse LVBuffer error:" + i);
        return;
      }
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.SDK.BaseContact", "get value failed");
      return;
    }
    this.csA = localException.getInt();
    this.sex = localException.getInt();
    this.csB = localException.getString();
    this.csC = localException.getLong();
    this.uin = localException.getInt();
    this.csD = localException.getString();
    this.bTi = localException.getString();
    this.csE = localException.getInt();
    this.csF = localException.getInt();
    this.csG = localException.getString();
    this.csH = localException.getString();
    this.csI = localException.getInt();
    this.csJ = localException.getInt();
    this.signature = localException.getString();
    this.csK = localException.getString();
    this.csL = localException.getString();
    this.csM = localException.getString();
    this.csN = localException.getInt();
    this.source = localException.getInt();
    this.csO = localException.getString();
    this.field_verifyFlag = localException.getInt();
    this.csP = localException.getString();
    if (!localException.chD()) {
      this.csQ = localException.getString();
    }
    if (!localException.chD()) {
      this.csR = localException.getInt();
    }
    if (!localException.chD()) {
      this.csS = localException.getInt();
    }
    if (!localException.chD()) {
      this.csT = localException.getString();
    }
    if (!localException.chD()) {
      this.csU = localException.getString();
    }
    if (!localException.chD()) {
      this.csV = localException.getString();
    }
    if (!localException.chD()) {
      this.csW = localException.getString();
    }
    if (!localException.chD()) {
      this.csX = localException.getString();
    }
    if (!localException.chD()) {
      this.csY = localException.getString();
    }
    if (!localException.chD()) {
      this.csZ = localException.getString();
    }
    if (!localException.chD()) {
      this.cta = localException.getString();
    }
    if (!localException.chD()) {
      this.ctb = localException.getInt();
    }
    if (!localException.chD()) {
      this.ctc = localException.getString();
    }
    if (!localException.chD()) {
      this.ctd = localException.getInt();
    }
    if (!localException.chD()) {
      this.cte = localException.getString();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/g/c/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */