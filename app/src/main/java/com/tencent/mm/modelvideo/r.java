package com.tencent.mm.modelvideo;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.protocal.c.aso;
import com.tencent.mm.protocal.c.bri;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;

public final class r
{
  public int bSX = 0;
  public int bWA = -1;
  public String bWJ = "";
  public long bYu = 0L;
  public String bZN = "";
  public String cas = "";
  String clientId = "";
  public long createTime = 0L;
  public int dHI = 0;
  public int dQo = 0;
  public String elu = "";
  public long emf = 0L;
  public int emu = 0;
  public String enF = "";
  public int enH = 0;
  public int enI = 0;
  public int enJ = 0;
  public long enK = 0L;
  public long enL = 0L;
  public int enM = 0;
  public int enN = 0;
  public int enO = 0;
  public int enP = 0;
  public int enQ = 0;
  public int enR = 0;
  public String enS = "";
  public int enT = 0;
  public String enU = "";
  public bri enV = new bri();
  public aso enW = new aso();
  public String fileName = "";
  public int status = 0;
  public int videoFormat = 0;
  
  private byte[] Ti()
  {
    try
    {
      byte[] arrayOfByte = this.enV.toByteArray();
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.VideoInfo", localException, "", new Object[0]);
    }
    return new byte[0];
  }
  
  private byte[] Tq()
  {
    try
    {
      byte[] arrayOfByte = this.enW.toByteArray();
      return arrayOfByte;
    }
    catch (Exception localException) {}
    return new byte[0];
  }
  
  public static String nH(String paramString)
  {
    try
    {
      paramString = bl.z(paramString, "msg");
      if (paramString != null)
      {
        paramString = (String)paramString.get(".msg.videomsg.$cdnvideourl");
        return paramString;
      }
    }
    catch (Exception paramString) {}
    return "";
  }
  
  public final String Tj()
  {
    if (this.bWJ == null) {
      return "";
    }
    return this.bWJ;
  }
  
  public final String Tk()
  {
    if (this.enF == null) {
      return "";
    }
    return this.enF;
  }
  
  public final String Tl()
  {
    if (this.elu == null) {
      return "";
    }
    return this.elu;
  }
  
  public final String Tm()
  {
    if (this.enS == null) {
      return "";
    }
    return this.enS;
  }
  
  public final boolean Tn()
  {
    return (this.status == 140) || (this.status == 141) || (this.status == 142);
  }
  
  public final boolean To()
  {
    return (this.status == 121) || (this.status == 122) || (this.status == 120) || (this.status == 123);
  }
  
  public final boolean Tp()
  {
    return (this.status == 199) || (this.status == 199);
  }
  
  public final void d(Cursor paramCursor)
  {
    this.fileName = paramCursor.getString(0);
    this.clientId = paramCursor.getString(1);
    this.bYu = paramCursor.getLong(2);
    this.emu = paramCursor.getInt(3);
    this.enH = paramCursor.getInt(4);
    this.dHI = paramCursor.getInt(5);
    this.enI = paramCursor.getInt(6);
    this.enJ = paramCursor.getInt(7);
    this.status = paramCursor.getInt(8);
    this.createTime = paramCursor.getLong(9);
    this.enK = paramCursor.getLong(10);
    this.enL = paramCursor.getLong(11);
    this.enM = paramCursor.getInt(12);
    this.enN = paramCursor.getInt(13);
    this.enO = paramCursor.getInt(14);
    this.enP = paramCursor.getInt(15);
    this.bWJ = paramCursor.getString(16);
    this.enF = paramCursor.getString(17);
    this.enQ = paramCursor.getInt(18);
    this.enR = paramCursor.getInt(19);
    this.elu = paramCursor.getString(20);
    this.enS = paramCursor.getString(21);
    this.enT = paramCursor.getInt(22);
    this.emf = paramCursor.getLong(23);
    this.enU = paramCursor.getString(24);
    this.cas = paramCursor.getString(25);
    byte[] arrayOfByte = paramCursor.getBlob(26);
    this.enV = new bri();
    try
    {
      this.enV.aG(arrayOfByte);
      this.bZN = paramCursor.getString(27);
      this.dQo = paramCursor.getInt(28);
      arrayOfByte = paramCursor.getBlob(29);
      this.enW = new aso();
    }
    catch (Exception localException1)
    {
      try
      {
        this.enW.aG(arrayOfByte);
        this.bSX = paramCursor.getInt(30);
        this.videoFormat = paramCursor.getInt(31);
        return;
        localException1 = localException1;
        x.printErrStackTrace("MicroMsg.VideoInfo", localException1, "", new Object[0]);
      }
      catch (Exception localException2)
      {
        for (;;) {}
      }
    }
  }
  
  public final String getFileName()
  {
    if (this.fileName == null) {
      return "";
    }
    return this.fileName;
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if ((this.bWA & 0x1) != 0) {
      localContentValues.put("filename", getFileName());
    }
    if ((this.bWA & 0x2) != 0) {
      if (this.clientId != null) {
        break label752;
      }
    }
    label752:
    for (String str = "";; str = this.clientId)
    {
      localContentValues.put("clientid", str);
      if ((this.bWA & 0x4) != 0) {
        localContentValues.put("msgsvrid", Long.valueOf(this.bYu));
      }
      if ((this.bWA & 0x8) != 0) {
        localContentValues.put("netoffset", Integer.valueOf(this.emu));
      }
      if ((this.bWA & 0x10) != 0) {
        localContentValues.put("filenowsize", Integer.valueOf(this.enH));
      }
      if ((this.bWA & 0x20) != 0) {
        localContentValues.put("totallen", Integer.valueOf(this.dHI));
      }
      if ((this.bWA & 0x40) != 0) {
        localContentValues.put("thumbnetoffset", Integer.valueOf(this.enI));
      }
      if ((this.bWA & 0x80) != 0) {
        localContentValues.put("thumblen", Integer.valueOf(this.enJ));
      }
      if ((this.bWA & 0x100) != 0) {
        localContentValues.put("status", Integer.valueOf(this.status));
      }
      if ((this.bWA & 0x200) != 0) {
        localContentValues.put("createtime", Long.valueOf(this.createTime));
      }
      if ((this.bWA & 0x400) != 0) {
        localContentValues.put("lastmodifytime", Long.valueOf(this.enK));
      }
      if ((this.bWA & 0x800) != 0) {
        localContentValues.put("downloadtime", Long.valueOf(this.enL));
      }
      if ((this.bWA & 0x1000) != 0) {
        localContentValues.put("videolength", Integer.valueOf(this.enM));
      }
      if ((this.bWA & 0x2000) != 0) {
        localContentValues.put("msglocalid", Integer.valueOf(this.enN));
      }
      if ((this.bWA & 0x4000) != 0) {
        localContentValues.put("nettimes", Integer.valueOf(this.enO));
      }
      if ((this.bWA & 0x8000) != 0) {
        localContentValues.put("cameratype", Integer.valueOf(this.enP));
      }
      if ((this.bWA & 0x10000) != 0) {
        localContentValues.put("user", Tj());
      }
      if ((this.bWA & 0x20000) != 0) {
        localContentValues.put("human", Tk());
      }
      if ((this.bWA & 0x40000) != 0) {
        localContentValues.put("reserved1", Integer.valueOf(this.enQ));
      }
      if ((this.bWA & 0x80000) != 0) {
        localContentValues.put("reserved2", Integer.valueOf(this.enR));
      }
      if ((this.bWA & 0x100000) != 0) {
        localContentValues.put("reserved3", Tl());
      }
      if ((this.bWA & 0x200000) != 0) {
        localContentValues.put("reserved4", Tm());
      }
      if ((this.bWA & 0x400000) != 0) {
        localContentValues.put("videofuncflag", Integer.valueOf(this.enT));
      }
      if ((this.bWA & 0x800000) != 0) {
        localContentValues.put("masssendid", Long.valueOf(this.emf));
      }
      if ((this.bWA & 0x1000000) != 0) {
        localContentValues.put("masssendlist", this.enU);
      }
      if ((this.bWA & 0x2000000) != 0) {
        localContentValues.put("videomd5", this.cas);
      }
      if ((this.bWA & 0x4000000) != 0) {
        localContentValues.put("streamvideo", Ti());
      }
      if ((this.bWA & 0x8000000) != 0) {
        localContentValues.put("statextstr", this.bZN);
      }
      if ((this.bWA & 0x10000000) != 0) {
        localContentValues.put("downloadscene", Integer.valueOf(this.dQo));
      }
      if ((this.bWA & 0x20000000) != 0) {
        localContentValues.put("mmsightextinfo", Tq());
      }
      if ((this.bWA & 0x1) != 0) {
        localContentValues.put("preloadsize", Integer.valueOf(this.bSX));
      }
      if ((this.bWA & 0x2) != 0) {
        localContentValues.put("videoformat", Integer.valueOf(this.videoFormat));
      }
      return localContentValues;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/modelvideo/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */