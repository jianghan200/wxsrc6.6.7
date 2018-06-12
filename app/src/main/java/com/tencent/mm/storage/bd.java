package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.mm.ap.a.a;
import com.tencent.mm.g.a.mo;
import com.tencent.mm.g.a.ox;
import com.tencent.mm.g.a.oz;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.k.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.y.o;
import java.util.Map;
import junit.framework.Assert;

public final class bd
  extends o
{
  public static String tbx = "voip_content_voice";
  public static String tby = "voip_content_video";
  private String tbA;
  public boolean tbz = false;
  
  public bd() {}
  
  public bd(String paramString)
  {
    super.ep(paramString);
  }
  
  public static bd al(bd parambd)
  {
    if (parambd == null)
    {
      x.d("MicroMsg.MsgInfo", "convertFrom msg is null ");
      return null;
    }
    bd localbd = new bd();
    localbd.setMsgId(parambd.field_msgId);
    localbd.ax(parambd.field_msgSvrId);
    localbd.setType(parambd.getType());
    localbd.setStatus(parambd.field_status);
    localbd.eX(parambd.field_isSend);
    localbd.field_isShowTimer = parambd.field_isShowTimer;
    localbd.cGp = true;
    localbd.ay(parambd.field_createTime);
    localbd.ep(parambd.field_talker);
    localbd.setContent(parambd.field_content);
    localbd.eq(parambd.field_imgPath);
    localbd.er(parambd.field_reserved);
    localbd.C(parambd.field_lvbuffer);
    localbd.es(parambd.field_transContent);
    localbd.eu(parambd.cGB);
    localbd.eC(parambd.cqa);
    localbd.dt(parambd.cqb);
    return localbd;
  }
  
  public static boolean av(Map<String, String> paramMap)
  {
    if ((paramMap != null) && (paramMap.containsKey(".sysmsg.$type")) && (((String)paramMap.get(".sysmsg.$type")).equalsIgnoreCase("NewXmlChatRoomAccessVerifyApplication"))) {}
    for (boolean bool = true;; bool = false)
    {
      x.d("MicroMsg.MsgInfo", "isAddChatroomInviteMsg:%s", new Object[] { Boolean.valueOf(bool) });
      return bool;
    }
  }
  
  public static boolean aw(Map<String, String> paramMap)
  {
    if ((paramMap != null) && (paramMap.containsKey(".sysmsg.$type")) && (((String)paramMap.get(".sysmsg.$type")).equalsIgnoreCase("NewXmlChatRoomAccessVerifyApproval"))) {}
    for (boolean bool = true;; bool = false)
    {
      x.d("MicroMsg.MsgInfo", "isAddChatroomInviteAcceptMsg:%s", new Object[] { Boolean.valueOf(bool) });
      return bool;
    }
  }
  
  public static void gn(long paramLong)
  {
    if ((100000000L > paramLong) && (-10L < paramLong)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("msgId not in the reasonable scope", bool);
      return;
    }
  }
  
  public final void Dn(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      x.w("MicroMsg.MsgInfo", "Illgeal forwardflag !!!");
      return;
    }
    eC(this.cqa | paramInt);
  }
  
  public final boolean YU(String paramString)
  {
    if ((!bi.oW(this.cqb)) && (!bi.oW(paramString)))
    {
      Object localObject = bl.z(this.cqb, "msgsource");
      if (localObject == null) {
        return false;
      }
      localObject = (String)((Map)localObject).get(".msgsource.atuserlist");
      if (!bi.oW((String)localObject))
      {
        localObject = ((String)localObject).split(",");
        int j = localObject.length;
        int i = 0;
        while (i < j)
        {
          if (localObject[i].trim().equals(paramString)) {
            return true;
          }
          i += 1;
        }
      }
    }
    return false;
  }
  
  public final boolean aQm()
  {
    return (getType() & 0xFFFF) == 49;
  }
  
  public final boolean aQo()
  {
    return getType() == 48;
  }
  
  public final boolean ckA()
  {
    switch (getType())
    {
    default: 
      return false;
    }
    return true;
  }
  
  public final boolean cky()
  {
    return getType() == 285212721;
  }
  
  public final boolean ckz()
  {
    return getType() == 34;
  }
  
  public final boolean cmA()
  {
    return (cmt()) && ((this.cqa & 0x400) > 0);
  }
  
  public final void cmB()
  {
    eC(this.cqa | 0x80);
  }
  
  public final boolean cmC()
  {
    boolean bool2 = true;
    boolean bool1 = bool2;
    if ((this.cqa & 0x80) == 0)
    {
      bool1 = bool2;
      if ((this.cqa & 0x300) == 0) {
        bool1 = false;
      }
    }
    return bool1;
  }
  
  public final void cmD()
  {
    eC(this.cqa & 0xFFFFFFBF);
  }
  
  public final void cmE()
  {
    eC(this.cqa | 0x40);
  }
  
  public final boolean cmF()
  {
    return (this.cqa & 0x40) != 0;
  }
  
  public final boolean cmG()
  {
    if ((!bi.oW(this.cqb)) && ((this.cqb.contains("announcement@all")) || (this.cqb.contains("notify@all")))) {}
    for (boolean bool = true;; bool = false)
    {
      x.d("MicroMsg.MsgInfo", "isAtAll isAtAll:%s", new Object[] { Boolean.valueOf(bool) });
      return bool;
    }
  }
  
  public final String cmH()
  {
    if (!cmh()) {
      return "";
    }
    if (this.tbA == null) {
      cmI();
    }
    return this.tbA;
  }
  
  public final com.tencent.mm.ap.a cmI()
  {
    x.i("MicroMsg.MsgInfo", "[parseNewXmlSysMsg]");
    com.tencent.mm.ap.a locala = a.a.b(com.tencent.mm.c.f.z(this.field_content, "sysmsg"), this);
    if (locala != null)
    {
      x.i("MicroMsg.MsgInfo", "BaseNewXmlMsg:%s", new Object[] { locala });
      if ((locala.values != null) && (locala.values.size() > 0))
      {
        if (locala.values.containsKey(".sysmsg.$type")) {
          locala.TYPE = ((String)locala.values.get(".sysmsg.$type"));
        }
        com.tencent.mm.ap.a.ebD = ".sysmsg." + locala.TYPE + ".text";
        if (locala.values.containsKey(com.tencent.mm.ap.a.ebD)) {
          locala.TEXT = ((String)locala.values.get(com.tencent.mm.ap.a.ebD));
        }
        com.tencent.mm.ap.a.ebE = ".sysmsg." + locala.TYPE + ".link.scene";
        if (locala.values.containsKey(com.tencent.mm.ap.a.ebE)) {
          locala.ebG = ((String)locala.values.get(com.tencent.mm.ap.a.ebE));
        }
        locala.Qi();
      }
      for (;;)
      {
        this.tbA = locala.TEXT;
        return locala;
        x.e("MicroMsg.BaseNewXmlMsg", "values == null || values.size() == 0 ");
      }
    }
    x.e("MicroMsg.MsgInfo", "[parseNewXmlSysMsg] null == pBaseNewXmlMsg");
    return locala;
  }
  
  public final boolean cmb()
  {
    return getType() == 436207665;
  }
  
  public final boolean cmc()
  {
    return getType() == 469762097;
  }
  
  public final boolean cmd()
  {
    return getType() == 301989937;
  }
  
  public final boolean cme()
  {
    return (getType() == 50) || (getType() == 53);
  }
  
  public final boolean cmf()
  {
    return getType() == 52;
  }
  
  public final boolean cmg()
  {
    return getType() == 318767153;
  }
  
  public final boolean cmh()
  {
    return getType() == 10002;
  }
  
  public final boolean cmi()
  {
    return (getType() == 42) || (getType() == 66);
  }
  
  public final boolean cmj()
  {
    return getType() == 43;
  }
  
  public final boolean cmk()
  {
    return getType() == 62;
  }
  
  public final boolean cml()
  {
    return getType() == 47;
  }
  
  public final boolean cmm()
  {
    return getType() == 1048625;
  }
  
  public final boolean cmn()
  {
    return getType() == 16777265;
  }
  
  public final boolean cmo()
  {
    return getType() == 268435505;
  }
  
  public final boolean cmp()
  {
    return getType() == -1879048191;
  }
  
  public final boolean cmq()
  {
    return getType() == -1879048190;
  }
  
  public final boolean cmr()
  {
    return getType() == -1879048189;
  }
  
  public final boolean cms()
  {
    switch (getType())
    {
    case 56: 
    default: 
      return false;
    }
    return true;
  }
  
  public final boolean cmt()
  {
    String str = ((com.tencent.mm.plugin.zero.b.a)g.l(com.tencent.mm.plugin.zero.b.a.class)).AT().getValue("TranslateMsgOff");
    if ((!bi.oW(str)) && (bi.WU(str) != 0)) {
      x.d("MicroMsg.MsgInfo", "isTranslateFeatureOn false");
    }
    for (int i = 0; (i != 0) && (!bi.oW(this.field_transContent)); i = 1) {
      return true;
    }
    return false;
  }
  
  public final boolean cmu()
  {
    return (this.cGE & 0x1) > 0;
  }
  
  public final void cmv()
  {
    this.cGE |= 0x1;
    this.cpN = true;
  }
  
  public final void cmw()
  {
    if (cmx()) {
      eC(this.cqa & 0xFFFFFFDF);
    }
  }
  
  public final boolean cmx()
  {
    return (this.cqa & 0x20) > 0;
  }
  
  public final boolean cmy()
  {
    return (cmt()) && ((this.cqa & 0x10) > 0);
  }
  
  public final void cmz()
  {
    if (!cmt()) {
      return;
    }
    eC(this.cqa | 0x10);
  }
  
  public final void d(Cursor paramCursor)
  {
    super.d(paramCursor);
    paramCursor = this.field_content;
    if ((paramCursor != null) && (paramCursor.length() > 2097152))
    {
      final long l = this.field_msgId;
      StringBuilder localStringBuilder = new StringBuilder(1024);
      localStringBuilder.append("Very big message: \nmsgId = ").append(l).append('\n').append("msgSvrId = ").append(this.field_msgSvrId).append('\n').append("type = ").append(getType()).append('\n').append("createTime = ").append(this.field_createTime).append('\n').append("talker = ").append(this.field_talker).append('\n').append("flag = ").append(this.field_flag).append('\n').append("content.length() = ").append(paramCursor.length()).append('\n').append("content = ").append(paramCursor.substring(0, 256));
      x.e("MicroMsg.MsgInfo", localStringBuilder.toString());
      setType(1);
      setContent("");
      paramCursor = al(this);
      g.Em().H(new Runnable()
      {
        public final void run()
        {
          ((i)g.l(i.class)).bcY().a(l, this.tbB);
        }
      });
    }
    gn(this.field_msgId);
  }
  
  public final int getType()
  {
    int j = super.getType();
    int i = j;
    if (j == 486539313) {
      i = 285212721;
    }
    return i;
  }
  
  public final boolean isSystem()
  {
    return getType() == 10000;
  }
  
  public final boolean isText()
  {
    switch (getType())
    {
    default: 
      return false;
    }
    return true;
  }
  
  public final void setStatus(int paramInt)
  {
    super.setStatus(paramInt);
    if (this.field_isSend == 1) {
      if ((!isText()) && (!aQo()) && (!cmi()))
      {
        paramInt = 1;
        if (paramInt == 0) {
          break label188;
        }
        if (this.field_status != 5) {
          break label123;
        }
        x.e("MicroMsg.MsgInfo", "set msg status fail, msgId:%d, type:%d, userName:%s %s", new Object[] { Long.valueOf(this.field_msgId), Integer.valueOf(getType()), this.field_talker, bi.cjd() });
        localObject = new ox();
        ((ox)localObject).bZS.bGS = this;
        com.tencent.mm.sdk.b.a.sFg.m((b)localObject);
      }
    }
    label123:
    label188:
    while (this.field_isSend != 0)
    {
      do
      {
        return;
        paramInt = 0;
        break;
      } while (this.field_status != 2);
      x.d("MicroMsg.MsgInfo", "successfully send msgId:%d, type:%d", new Object[] { Long.valueOf(this.field_msgId), Integer.valueOf(getType()) });
      localObject = new oz();
      ((oz)localObject).bZU.bGS = this;
      com.tencent.mm.sdk.b.a.sFg.m((b)localObject);
      return;
    }
    Object localObject = new mo();
    ((mo)localObject).bXx.bGS = this;
    com.tencent.mm.sdk.b.a.sFg.m((b)localObject);
  }
  
  public final ContentValues wH()
  {
    gn(this.field_msgId);
    return super.wH();
  }
  
  public static final class a
  {
    private String bhd = "";
    public String cCR = "";
    private String csK;
    private String csL;
    public String csP = "";
    private String csQ = "";
    public String eHT = "";
    public String eLA = "";
    public String eLB = "";
    public String eLE = "";
    public String eLz = "";
    public String lUI = "";
    public long lWQ = 0L;
    public String nickname = "";
    public String otZ = "";
    public int pOR = 0;
    public String qOy = "";
    public int scene = 0;
    public int sex;
    public String signature;
    public int tbD = 0;
    public String tbE = "";
    public String tbF = "";
    public String tbG = "";
    public String tbH = "";
    public String tbI = "";
    public String tbJ = "";
    public String tbK = "";
    public String tbL = "";
    
    public static a YV(String paramString)
    {
      a locala = new a();
      Object localObject = bi.aG(paramString, "").trim();
      paramString = (String)localObject;
      if (!((String)localObject).startsWith("<"))
      {
        int i = ((String)localObject).indexOf(":");
        paramString = (String)localObject;
        if (i != -1) {
          paramString = ((String)localObject).substring(i + 1);
        }
      }
      localObject = bl.z(paramString, "msg");
      if (localObject != null) {
        for (;;)
        {
          try
          {
            if (((Map)localObject).get(".msg.$fromusername") == null)
            {
              locala.otZ = ((String)((Map)localObject).get(".msg.$username"));
              if (((Map)localObject).get(".msg.$fromnickname") == null)
              {
                locala.nickname = ((String)((Map)localObject).get(".msg.$nickname"));
                locala.cCR = ((String)((Map)localObject).get(".msg.$alias"));
                locala.eLA = ((String)((Map)localObject).get(".msg.$fullpy"));
                locala.eLz = ((String)((Map)localObject).get(".msg.$shortpy"));
                locala.bhd = ((String)((Map)localObject).get(".msg.$source"));
                locala.tbD = bi.getInt((String)((Map)localObject).get(".msg.$imagestatus"), 0);
                locala.scene = bi.getInt((String)((Map)localObject).get(".msg.$scene"), 0);
                locala.tbE = ((String)((Map)localObject).get(".msg.$mobileidentify"));
                locala.tbF = ((String)((Map)localObject).get(".msg.$mobilelongidentify"));
                if ((((Map)localObject).get(".msg.$qqnum") != null) && (((String)((Map)localObject).get(".msg.$qqnum")).length() > 0)) {
                  locala.lWQ = bi.getLong((String)((Map)localObject).get(".msg.$qqnum"), 0L);
                }
                locala.signature = ((String)((Map)localObject).get(".msg.$sign"));
                if ((((Map)localObject).get(".msg.$sex") != null) && (((String)((Map)localObject).get(".msg.$sex")).length() > 0)) {
                  locala.sex = bi.getInt((String)((Map)localObject).get(".msg.$sex"), 0);
                }
                locala.csL = ((String)((Map)localObject).get(".msg.$city"));
                locala.csK = ((String)((Map)localObject).get(".msg.$province"));
                locala.eLB = ((String)((Map)localObject).get(".msg.$qqnickname"));
                locala.eLE = ((String)((Map)localObject).get(".msg.$qqremark"));
                if (!TextUtils.isEmpty((CharSequence)((Map)localObject).get(".msg.$certflag"))) {
                  break label765;
                }
                paramString = "0";
                locala.pOR = bi.getInt(paramString, 0);
                locala.csP = bi.oV((String)((Map)localObject).get(".msg.$certinfo"));
                locala.lUI = bi.oV((String)((Map)localObject).get(".msg.$brandIconUrl"));
                locala.csQ = bi.oV((String)((Map)localObject).get(".msg.$regionCode"));
                locala.tbG = bi.oV((String)((Map)localObject).get(".msg.$bigheadimgurl"));
                locala.tbH = bi.oV((String)((Map)localObject).get(".msg.$smallheadimgurl"));
                locala.eHT = bi.oV((String)((Map)localObject).get(".msg.$googlecontact"));
                locala.qOy = bi.oV((String)((Map)localObject).get(".msg.$antispamticket"));
                locala.tbI = bi.oV((String)((Map)localObject).get(".msg.$openimappid"));
                locala.tbJ = bi.oV((String)((Map)localObject).get(".msg.$openimdesc"));
                locala.tbK = bi.oV((String)((Map)localObject).get(".msg.$openimdescicon"));
                locala.tbL = bi.oV((String)((Map)localObject).get(".msg.$openimcustominfo"));
                if (ab.XR(locala.otZ)) {
                  locala.qOy = bi.oV((String)((Map)localObject).get(".msg.$ticket"));
                }
                x.i("MicroMsg.MsgInfo", "dkverify FriendContent user:[%s] ticket:[%s] big:[%s] sm:[%s]", new Object[] { locala.otZ, locala.qOy, locala.tbG, locala.tbH });
                return locala;
              }
            }
            else
            {
              locala.otZ = ((String)((Map)localObject).get(".msg.$fromusername"));
              continue;
            }
            locala.nickname = ((String)((Map)localObject).get(".msg.$fromnickname"));
          }
          catch (Exception paramString)
          {
            x.e("MicroMsg.MsgInfo", "exception:%s", new Object[] { bi.i(paramString) });
            return locala;
          }
          continue;
          label765:
          paramString = (String)((Map)localObject).get(".msg.$certflag");
        }
      }
      return locala;
    }
    
    public final String cmJ()
    {
      if ((this.eLE != null) && (this.eLE.length() > 0)) {
        return this.eLE;
      }
      if ((this.eLB != null) && (this.eLB.length() > 0)) {
        return this.eLB;
      }
      return Long.toString(this.lWQ);
    }
    
    public final String getCity()
    {
      String[] arrayOfString;
      if (!bi.oW(this.csQ))
      {
        arrayOfString = this.csQ.split("_");
        if (arrayOfString.length > 0)
        {
          if (arrayOfString.length <= 2) {
            break label57;
          }
          RegionCodeDecoder.cmS();
          this.csL = RegionCodeDecoder.ar(arrayOfString[0], arrayOfString[1], arrayOfString[2]);
        }
      }
      for (;;)
      {
        return this.csL;
        label57:
        if (arrayOfString.length == 2)
        {
          RegionCodeDecoder.cmS();
          this.csL = RegionCodeDecoder.ga(arrayOfString[0], arrayOfString[1]);
        }
        else
        {
          this.csL = "";
        }
      }
    }
    
    public final String getDisplayName()
    {
      if (!TextUtils.isEmpty(this.nickname)) {
        return this.nickname;
      }
      if (!TextUtils.isEmpty(this.cCR)) {
        return this.cCR;
      }
      x.f("MicroMsg.MsgInfo", "username is nullOrNil");
      return bi.oV(this.otZ);
    }
    
    public final String getProvince()
    {
      String[] arrayOfString;
      if (!bi.oW(this.csQ))
      {
        arrayOfString = this.csQ.split("_");
        if (arrayOfString.length > 0)
        {
          if ((arrayOfString.length <= 2) || (!RegionCodeDecoder.Zh(arrayOfString[0]))) {
            break label63;
          }
          RegionCodeDecoder.cmS();
        }
      }
      for (this.csK = RegionCodeDecoder.ga(arrayOfString[0], arrayOfString[1]);; this.csK = RegionCodeDecoder.Zi(arrayOfString[0]))
      {
        return this.csK;
        label63:
        RegionCodeDecoder.cmS();
      }
    }
  }
  
  public static final class b
  {
    public int bSz = 0;
    public double kCw = 0.0D;
    public double kCx = 0.0D;
    public String kFa = "";
    public String label = "";
    public String otZ = "";
    public String qyA = "";
    public String tbM = "";
    public String tbN = null;
    public String tbO = null;
    public String tbP = null;
    
    public static b YW(String paramString)
    {
      b localb = new b();
      paramString = bl.z(paramString, "msg");
      if (paramString != null)
      {
        localb.otZ = bi.aG((String)paramString.get(".msg.location.$fromusername"), "");
        localb.kCw = bi.WW((String)paramString.get(".msg.location.$x"));
        localb.kCx = bi.WW((String)paramString.get(".msg.location.$y"));
        localb.label = bi.aG((String)paramString.get(".msg.location.$label"), "");
        localb.tbM = bi.aG((String)paramString.get(".msg.location.$maptype"), "");
        localb.bSz = bi.WU((String)paramString.get(".msg.location.$scale"));
        localb.tbP = bi.aG((String)paramString.get(".msg.location.$localLocationen"), "");
        localb.tbN = bi.aG((String)paramString.get(".msg.location.$localLocationcn"), "");
        localb.tbO = bi.aG((String)paramString.get(".msg.location.$localLocationtw"), "");
        localb.kFa = bi.aG((String)paramString.get(".msg.location.$poiname"), "");
        localb.qyA = bi.aG((String)paramString.get(".msg.location.$infourl"), "");
      }
      return localb;
    }
    
    public final boolean cmK()
    {
      return (this.kFa != null) && (!this.kFa.equals(""));
    }
    
    public final String toString()
    {
      return String.format("%d-%d-%d", new Object[] { Integer.valueOf((int)(this.kCw * 1000000.0D)), Integer.valueOf((int)(this.kCx * 1000000.0D)), Integer.valueOf(this.bSz) });
    }
  }
  
  public static final class c
  {
    public String content = "";
    public String eeZ = "";
    public boolean jff = false;
    public String mcf;
    public String tbQ = "";
    public String title = "";
    
    public static c YX(String paramString)
    {
      c localc = new c();
      paramString = bl.z(paramString, "msg");
      if (paramString != null) {}
      try
      {
        localc.title = ((String)paramString.get(".msg.pushmail.content.subject"));
        localc.content = ((String)paramString.get(".msg.pushmail.content.digest"));
        localc.eeZ = ((String)paramString.get(".msg.pushmail.content.sender"));
        localc.tbQ = ((String)paramString.get(".msg.pushmail.waplink"));
        localc.jff = bi.oV((String)paramString.get(".msg.pushmail.content.attach")).equalsIgnoreCase("true");
        localc.mcf = ((String)paramString.get(".msg.pushmail.mailid"));
        return localc;
      }
      catch (Exception paramString)
      {
        x.e("MicroMsg.MsgInfo", "exception:%s", new Object[] { bi.i(paramString) });
      }
      return localc;
    }
  }
  
  public static final class d
  {
    public int bOh;
    public String cCR = "";
    public String chatroomName = "";
    public String content = "";
    private String countryCode;
    private String dDe;
    private String dDf;
    public String eHT;
    public String eLA = "";
    public String eLB = "";
    private String eLE = "";
    public String eLz = "";
    public String juZ;
    public long lWQ = 0L;
    public String nickname = "";
    public String otZ = "";
    public String qIb;
    public String qIc;
    public int scene = 0;
    public int sex;
    public String signature;
    public int tbD = 0;
    public String tbE = "";
    public String tbF = "";
    public String tbG = "";
    public String tbH = "";
    public int tbR = 0;
    public String tbS;
    public String tbT;
    public int tbU;
    public String tbV;
    public String tbW;
    
    public static d YY(String paramString)
    {
      d locald = new d();
      paramString = bl.z(paramString, "msg");
      if (paramString != null) {}
      try
      {
        locald.otZ = ((String)paramString.get(".msg.$fromusername"));
        locald.cCR = ((String)paramString.get(".msg.$alias"));
        locald.nickname = ((String)paramString.get(".msg.$fromnickname"));
        locald.eLA = ((String)paramString.get(".msg.$fullpy"));
        locald.eLz = ((String)paramString.get(".msg.$shortpy"));
        locald.content = ((String)paramString.get(".msg.$content"));
        locald.tbD = bi.getInt((String)paramString.get(".msg.$imagestatus"), 0);
        locald.scene = bi.getInt((String)paramString.get(".msg.$scene"), 0);
        locald.tbE = ((String)paramString.get(".msg.$mhash"));
        locald.tbF = ((String)paramString.get(".msg.$mfullhash"));
        if ((paramString.get(paramString.get(".msg.$qqnum")) != null) && (((String)paramString.get(paramString.get(".msg.$qqnum"))).length() > 0)) {
          locald.lWQ = bi.getLong((String)paramString.get(".msg.$qqnum"), 0L);
        }
        locald.eLB = ((String)paramString.get(".msg.$qqnickname"));
        locald.eLE = ((String)paramString.get(".msg.$qqremark"));
        locald.signature = ((String)paramString.get(".msg.$sign"));
        if ((paramString.get(".msg.$sex") != null) && (((String)paramString.get(".msg.$sex")).length() > 0)) {
          locald.sex = bi.getInt((String)paramString.get(".msg.$sex"), 0);
        }
        locald.dDe = ((String)paramString.get(".msg.$city"));
        locald.dDf = ((String)paramString.get(".msg.$province"));
        locald.countryCode = ((String)paramString.get(".msg.$country"));
        if (paramString.get(".msg.$snsflag") != null)
        {
          locald.tbR = bi.getInt((String)paramString.get(".msg.$snsflag"), 0);
          locald.tbS = ((String)paramString.get(".msg.$snsbgimgid"));
        }
        locald.juZ = ((String)paramString.get(".msg.$ticket"));
        x.d("MicroMsg.MsgInfo", "dkverify ticket:%s", new Object[] { locald.juZ });
        locald.tbG = bi.oV((String)paramString.get(".msg.$bigheadimgurl"));
        locald.tbH = bi.oV((String)paramString.get(".msg.$smallheadimgurl"));
        locald.bOh = bi.getInt((String)paramString.get(".msg.$opcode"), 0);
        locald.tbT = bi.oV((String)paramString.get(".msg.$encryptusername"));
        locald.eHT = bi.oV((String)paramString.get(".msg.$googlecontact"));
        x.d("MicroMsg.MsgInfo", "dkavatar VerifyContent user:[%s] big:[%s] sm:[%s]", new Object[] { locald.otZ, locald.tbG, locald.tbH });
        locald.chatroomName = bi.oV((String)paramString.get(".msg.$chatroomusername"));
        locald.qIb = ((String)paramString.get(".msg.$sourceusername"));
        locald.qIc = ((String)paramString.get(".msg.$sourcenickname"));
        locald.tbU = bi.getInt((String)paramString.get(".msg.Antispam.$isSuspiciousUser"), 0);
        if (locald.tbU == 1)
        {
          locald.tbV = ((String)paramString.get(".msg.Antispam.safetyWarning"));
          locald.tbW = ((String)paramString.get(".msg.Antispam.safetyWarningDetail"));
        }
        return locald;
      }
      catch (Exception paramString)
      {
        x.printErrStackTrace("MicroMsg.MsgInfo", paramString, "", new Object[0]);
      }
      return locald;
    }
    
    public final String cmL()
    {
      return this.juZ;
    }
    
    public final String cmM()
    {
      return this.otZ;
    }
    
    public final int cmN()
    {
      return this.sex;
    }
    
    public final String cmO()
    {
      return this.signature;
    }
    
    public final String cmP()
    {
      return this.tbT;
    }
    
    public final String getCity()
    {
      if ((!bi.oW(this.countryCode)) && (!bi.oW(this.dDf)))
      {
        if (bi.oW(this.dDe))
        {
          RegionCodeDecoder.cmS();
          return RegionCodeDecoder.ga(this.countryCode, this.dDf);
        }
        RegionCodeDecoder.cmS();
        return RegionCodeDecoder.ar(this.countryCode, this.dDf, this.dDe);
      }
      return this.dDe;
    }
    
    public final String getDisplayName()
    {
      if ((this.nickname != null) && (this.nickname.length() > 0)) {
        return this.nickname;
      }
      x.f("MicroMsg.MsgInfo", "username is nullOrNil");
      return this.otZ;
    }
    
    public final String getProvince()
    {
      if (!bi.oW(this.countryCode))
      {
        if ((!bi.oW(this.dDf)) && (!bi.oW(this.dDe)) && (RegionCodeDecoder.Zh(this.countryCode)))
        {
          RegionCodeDecoder.cmS();
          return RegionCodeDecoder.ga(this.countryCode, this.dDf);
        }
        RegionCodeDecoder.cmS();
        return RegionCodeDecoder.Zi(this.countryCode);
      }
      return this.dDf;
    }
    
    public final String wM()
    {
      return this.cCR;
    }
    
    public final String wO()
    {
      return this.nickname;
    }
    
    public final String wP()
    {
      return this.eLz;
    }
    
    public final String wQ()
    {
      return this.eLA;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/storage/bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */