package com.tencent.mm.plugin.shake.b;

import android.content.ContentValues;
import com.tencent.mm.g.c.do;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bmk;
import com.tencent.mm.protocal.c.bqd;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.RegionCodeDecoder;
import java.lang.reflect.Field;
import java.util.Map;

public final class d
  extends do
{
  protected static c.a dhO;
  public int bWA = -1;
  private bhy mWJ;
  public int scene;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[20];
    locala.columns = new String[21];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "shakeItemID";
    locala.sKA.put("shakeItemID", "INTEGER default '0'  PRIMARY KEY ");
    localStringBuilder.append(" shakeItemID INTEGER default '0'  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "shakeItemID";
    locala.columns[1] = "username";
    locala.sKA.put("username", "TEXT");
    localStringBuilder.append(" username TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "nickname";
    locala.sKA.put("nickname", "TEXT");
    localStringBuilder.append(" nickname TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "province";
    locala.sKA.put("province", "TEXT");
    localStringBuilder.append(" province TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "city";
    locala.sKA.put("city", "TEXT");
    localStringBuilder.append(" city TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "signature";
    locala.sKA.put("signature", "TEXT");
    localStringBuilder.append(" signature TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "distance";
    locala.sKA.put("distance", "TEXT");
    localStringBuilder.append(" distance TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "sex";
    locala.sKA.put("sex", "INTEGER");
    localStringBuilder.append(" sex INTEGER");
    localStringBuilder.append(", ");
    locala.columns[8] = "imgstatus";
    locala.sKA.put("imgstatus", "INTEGER");
    localStringBuilder.append(" imgstatus INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "hasHDImg";
    locala.sKA.put("hasHDImg", "INTEGER");
    localStringBuilder.append(" hasHDImg INTEGER");
    localStringBuilder.append(", ");
    locala.columns[10] = "insertBatch";
    locala.sKA.put("insertBatch", "INTEGER");
    localStringBuilder.append(" insertBatch INTEGER");
    localStringBuilder.append(", ");
    locala.columns[11] = "reserved1";
    locala.sKA.put("reserved1", "INTEGER");
    localStringBuilder.append(" reserved1 INTEGER");
    localStringBuilder.append(", ");
    locala.columns[12] = "reserved2";
    locala.sKA.put("reserved2", "INTEGER");
    localStringBuilder.append(" reserved2 INTEGER");
    localStringBuilder.append(", ");
    locala.columns[13] = "reserved3";
    locala.sKA.put("reserved3", "TEXT");
    localStringBuilder.append(" reserved3 TEXT");
    localStringBuilder.append(", ");
    locala.columns[14] = "reserved4";
    locala.sKA.put("reserved4", "TEXT");
    localStringBuilder.append(" reserved4 TEXT");
    localStringBuilder.append(", ");
    locala.columns[15] = "type";
    locala.sKA.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[16] = "lvbuffer";
    locala.sKA.put("lvbuffer", "BLOB");
    localStringBuilder.append(" lvbuffer BLOB");
    localStringBuilder.append(", ");
    locala.columns[17] = "regionCode";
    locala.sKA.put("regionCode", "TEXT");
    localStringBuilder.append(" regionCode TEXT");
    localStringBuilder.append(", ");
    locala.columns[18] = "snsFlag";
    locala.sKA.put("snsFlag", "INTEGER");
    localStringBuilder.append(" snsFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[19] = "sns_bgurl";
    locala.sKA.put("sns_bgurl", "TEXT");
    localStringBuilder.append(" sns_bgurl TEXT");
    locala.columns[20] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  public d()
  {
    this.field_insertBatch = 2;
  }
  
  public d(bmk parambmk)
  {
    this.field_username = parambmk.hbL;
    this.field_nickname = parambmk.hcS;
    this.field_signature = parambmk.eJK;
    this.field_distance = parambmk.rTd;
    this.field_reserved4 = String.valueOf(parambmk.skE);
    this.field_sex = parambmk.eJH;
    this.field_imgstatus = parambmk.rcm;
    this.field_hasHDImg = parambmk.skC;
    this.field_reserved1 = parambmk.rTe;
    this.field_reserved3 = parambmk.rTf;
    this.field_insertBatch = 2;
    if (parambmk.rTk != null)
    {
      this.field_snsFlag = parambmk.rTk.eJS;
      this.field_sns_bgurl = parambmk.rTk.eJT;
    }
    this.mWJ = parambmk.skD;
    this.field_province = parambmk.eJI;
    this.field_city = parambmk.eJJ;
    this.field_regionCode = RegionCodeDecoder.aq(parambmk.eJQ, this.field_province, this.field_city);
  }
  
  private int buq()
  {
    try
    {
      int i = Integer.valueOf(this.field_reserved4).intValue();
      return i;
    }
    finally {}
    return 0;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
  
  public final String getCity()
  {
    String[] arrayOfString;
    if (!bi.oW(this.field_regionCode))
    {
      arrayOfString = this.field_regionCode.split("_");
      if (arrayOfString.length > 0)
      {
        if (arrayOfString.length <= 2) {
          break label57;
        }
        RegionCodeDecoder.cmS();
        this.field_city = RegionCodeDecoder.ar(arrayOfString[0], arrayOfString[1], arrayOfString[2]);
      }
    }
    for (;;)
    {
      return this.field_city;
      label57:
      if (arrayOfString.length == 2)
      {
        RegionCodeDecoder.cmS();
        this.field_city = RegionCodeDecoder.ga(arrayOfString[0], arrayOfString[1]);
      }
      else
      {
        this.field_city = "";
      }
    }
  }
  
  public final String getProvince()
  {
    String[] arrayOfString;
    if (!bi.oW(this.field_regionCode))
    {
      arrayOfString = this.field_regionCode.split("_");
      if (arrayOfString.length > 0)
      {
        if ((arrayOfString.length <= 2) || (!arrayOfString[0].equalsIgnoreCase("cn"))) {
          break label66;
        }
        RegionCodeDecoder.cmS();
      }
    }
    for (this.field_province = RegionCodeDecoder.ga(arrayOfString[0], arrayOfString[1]);; this.field_province = RegionCodeDecoder.Zi(arrayOfString[0]))
    {
      return this.field_province;
      label66:
      RegionCodeDecoder.cmS();
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if ((this.bWA & 0x2) != 0) {
      localContentValues.put("username", this.field_username);
    }
    if ((this.bWA & 0x4) != 0) {
      localContentValues.put("nickname", this.field_nickname);
    }
    if ((this.bWA & 0x8) != 0) {
      localContentValues.put("province", getProvince());
    }
    if ((this.bWA & 0x10) != 0) {
      localContentValues.put("city", getCity());
    }
    if ((this.bWA & 0x20) != 0) {
      localContentValues.put("signature", this.field_signature);
    }
    if ((this.bWA & 0x40) != 0) {
      localContentValues.put("distance", this.field_distance);
    }
    if ((this.bWA & 0x80) != 0) {
      localContentValues.put("sex", Integer.valueOf(this.field_sex));
    }
    if ((this.bWA & 0x100) != 0) {
      localContentValues.put("imgstatus", Integer.valueOf(this.field_imgstatus));
    }
    if ((this.bWA & 0x200) != 0) {
      localContentValues.put("hasHDImg", Integer.valueOf(this.field_hasHDImg));
    }
    if ((this.bWA & 0x400) != 0) {
      localContentValues.put("insertBatch", Integer.valueOf(this.field_insertBatch));
    }
    if ((this.bWA & 0x800) != 0) {
      localContentValues.put("reserved1", Integer.valueOf(this.field_reserved1));
    }
    if ((this.bWA & 0x1000) != 0) {
      localContentValues.put("reserved2", Integer.valueOf(this.field_reserved2));
    }
    if ((this.bWA & 0x2000) != 0) {
      localContentValues.put("reserved3", this.field_reserved3);
    }
    if ((this.bWA & 0x4000) != 0) {
      localContentValues.put("reserved4", Integer.valueOf(buq()));
    }
    if ((this.bWA & 0x8000) != 0) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if ((this.bWA & 0x10000) != 0) {
      localContentValues.put("lvbuffer", this.field_lvbuffer);
    }
    if ((this.bWA & 0x20000) != 0) {
      localContentValues.put("regionCode", this.field_regionCode);
    }
    if ((this.bWA & 0x40000) != 0) {
      localContentValues.put("snsFlag", Integer.valueOf(this.field_snsFlag));
    }
    if ((this.bWA & 0x80000) != 0) {
      localContentValues.put("sns_bgurl", this.field_sns_bgurl);
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */