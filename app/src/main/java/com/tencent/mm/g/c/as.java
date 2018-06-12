package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class as
  extends c
{
  public static final String[] ciG = { "CREATE INDEX IF NOT EXISTS emojiGroupIndex ON EmojiInfo(catalog)" };
  private static final int ciP = "rowid".hashCode();
  private static final int cke;
  private static final int ckj;
  private static final int clp;
  private static final int cnh;
  private static final int cuY;
  private static final int cvM = "md5".hashCode();
  private static final int cvN = "svrid".hashCode();
  private static final int cvO = "catalog".hashCode();
  private static final int cvP;
  private static final int cvQ;
  private static final int cvR;
  private static final int cvS;
  private static final int cvT;
  private static final int cvU;
  private static final int cvV;
  private static final int cvW;
  private static final int cvX;
  private static final int cvY;
  private static final int cvZ;
  private static final int cvc;
  private static final int cwa;
  private static final int cwb;
  private static final int cwc;
  private static final int cwd;
  private static final int cwe;
  private static final int cwf;
  private static final int cwg;
  private static final int cwh;
  private static final int cwi;
  private static final int cwj;
  private static final int cwk;
  private static final int cwl;
  private static final int cwm;
  private boolean cjI = true;
  private boolean cjN = true;
  private boolean clm = true;
  private boolean cnd = true;
  private boolean cuC = true;
  private boolean cuy = true;
  private boolean cvA = true;
  private boolean cvB = true;
  private boolean cvC = true;
  private boolean cvD = true;
  private boolean cvE = true;
  private boolean cvF = true;
  private boolean cvG = true;
  private boolean cvH = true;
  private boolean cvI = true;
  private boolean cvJ = true;
  private boolean cvK = true;
  private boolean cvL = true;
  private boolean cvk = true;
  private boolean cvl = true;
  private boolean cvm = true;
  private boolean cvn = true;
  private boolean cvo = true;
  private boolean cvp = true;
  private boolean cvq = true;
  private boolean cvr = true;
  private boolean cvs = true;
  private boolean cvt = true;
  private boolean cvu = true;
  private boolean cvw = true;
  private boolean cvx = true;
  private boolean cvy = true;
  private boolean cvz = true;
  public String field_activityid;
  public String field_aeskey;
  public String field_app_id;
  public int field_catalog;
  public String field_cdnUrl;
  public String field_content;
  public String field_designerID;
  public String field_encrypturl;
  public String field_externMd5;
  public String field_externUrl;
  public String field_framesInfo;
  public String field_groupId;
  public int field_height;
  public int field_idx;
  public long field_lastUseTime;
  public String field_md5;
  public String field_name;
  public int field_needupload;
  public String field_reserved1;
  public String field_reserved2;
  public int field_reserved3;
  public int field_reserved4;
  public int field_size;
  public int field_source;
  public int field_start;
  public int field_state;
  public String field_svrid;
  public int field_temp;
  public String field_thumbUrl;
  public String field_tpauthkey;
  public String field_tpurl;
  public int field_type;
  public int field_width;
  
  static
  {
    cke = "type".hashCode();
    clp = "size".hashCode();
    cvP = "start".hashCode();
    cvQ = "state".hashCode();
    cvR = "name".hashCode();
    ckj = "content".hashCode();
    cvS = "reserved1".hashCode();
    cvT = "reserved2".hashCode();
    cvU = "reserved3".hashCode();
    cvV = "reserved4".hashCode();
    cvW = "app_id".hashCode();
    cvX = "groupId".hashCode();
    cuY = "lastUseTime".hashCode();
    cvY = "framesInfo".hashCode();
    cvc = "idx".hashCode();
    cvZ = "temp".hashCode();
    cnh = "source".hashCode();
    cwa = "needupload".hashCode();
    cwb = "designerID".hashCode();
    cwc = "thumbUrl".hashCode();
    cwd = "cdnUrl".hashCode();
    cwe = "encrypturl".hashCode();
    cwf = "aeskey".hashCode();
    cwg = "width".hashCode();
    cwh = "height".hashCode();
    cwi = "externUrl".hashCode();
    cwj = "externMd5".hashCode();
    cwk = "activityid".hashCode();
    cwl = "tpurl".hashCode();
    cwm = "tpauthkey".hashCode();
  }
  
  public final void d(Cursor paramCursor)
  {
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null) {
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    label20:
    int k;
    if (i < j)
    {
      k = arrayOfString[i].hashCode();
      if (cvM != k) {
        break label65;
      }
      this.field_md5 = paramCursor.getString(i);
      this.cvk = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cvN == k) {
        this.field_svrid = paramCursor.getString(i);
      } else if (cvO == k) {
        this.field_catalog = paramCursor.getInt(i);
      } else if (cke == k) {
        this.field_type = paramCursor.getInt(i);
      } else if (clp == k) {
        this.field_size = paramCursor.getInt(i);
      } else if (cvP == k) {
        this.field_start = paramCursor.getInt(i);
      } else if (cvQ == k) {
        this.field_state = paramCursor.getInt(i);
      } else if (cvR == k) {
        this.field_name = paramCursor.getString(i);
      } else if (ckj == k) {
        this.field_content = paramCursor.getString(i);
      } else if (cvS == k) {
        this.field_reserved1 = paramCursor.getString(i);
      } else if (cvT == k) {
        this.field_reserved2 = paramCursor.getString(i);
      } else if (cvU == k) {
        this.field_reserved3 = paramCursor.getInt(i);
      } else if (cvV == k) {
        this.field_reserved4 = paramCursor.getInt(i);
      } else if (cvW == k) {
        this.field_app_id = paramCursor.getString(i);
      } else if (cvX == k) {
        this.field_groupId = paramCursor.getString(i);
      } else if (cuY == k) {
        this.field_lastUseTime = paramCursor.getLong(i);
      } else if (cvY == k) {
        this.field_framesInfo = paramCursor.getString(i);
      } else if (cvc == k) {
        this.field_idx = paramCursor.getInt(i);
      } else if (cvZ == k) {
        this.field_temp = paramCursor.getInt(i);
      } else if (cnh == k) {
        this.field_source = paramCursor.getInt(i);
      } else if (cwa == k) {
        this.field_needupload = paramCursor.getInt(i);
      } else if (cwb == k) {
        this.field_designerID = paramCursor.getString(i);
      } else if (cwc == k) {
        this.field_thumbUrl = paramCursor.getString(i);
      } else if (cwd == k) {
        this.field_cdnUrl = paramCursor.getString(i);
      } else if (cwe == k) {
        this.field_encrypturl = paramCursor.getString(i);
      } else if (cwf == k) {
        this.field_aeskey = paramCursor.getString(i);
      } else if (cwg == k) {
        this.field_width = paramCursor.getInt(i);
      } else if (cwh == k) {
        this.field_height = paramCursor.getInt(i);
      } else if (cwi == k) {
        this.field_externUrl = paramCursor.getString(i);
      } else if (cwj == k) {
        this.field_externMd5 = paramCursor.getString(i);
      } else if (cwk == k) {
        this.field_activityid = paramCursor.getString(i);
      } else if (cwl == k) {
        this.field_tpurl = paramCursor.getString(i);
      } else if (cwm == k) {
        this.field_tpauthkey = paramCursor.getString(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public void reset() {}
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cvk) {
      localContentValues.put("md5", this.field_md5);
    }
    if (this.cvl) {
      localContentValues.put("svrid", this.field_svrid);
    }
    if (this.cvm) {
      localContentValues.put("catalog", Integer.valueOf(this.field_catalog));
    }
    if (this.cjI) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.clm) {
      localContentValues.put("size", Integer.valueOf(this.field_size));
    }
    if (this.cvn) {
      localContentValues.put("start", Integer.valueOf(this.field_start));
    }
    if (this.cvo) {
      localContentValues.put("state", Integer.valueOf(this.field_state));
    }
    if (this.cvp) {
      localContentValues.put("name", this.field_name);
    }
    if (this.cjN) {
      localContentValues.put("content", this.field_content);
    }
    if (this.cvq) {
      localContentValues.put("reserved1", this.field_reserved1);
    }
    if (this.cvr) {
      localContentValues.put("reserved2", this.field_reserved2);
    }
    if (this.cvs) {
      localContentValues.put("reserved3", Integer.valueOf(this.field_reserved3));
    }
    if (this.cvt) {
      localContentValues.put("reserved4", Integer.valueOf(this.field_reserved4));
    }
    if (this.cvu) {
      localContentValues.put("app_id", this.field_app_id);
    }
    if (this.field_groupId == null) {
      this.field_groupId = "";
    }
    if (this.cvw) {
      localContentValues.put("groupId", this.field_groupId);
    }
    if (this.cuy) {
      localContentValues.put("lastUseTime", Long.valueOf(this.field_lastUseTime));
    }
    if (this.field_framesInfo == null) {
      this.field_framesInfo = "";
    }
    if (this.cvx) {
      localContentValues.put("framesInfo", this.field_framesInfo);
    }
    if (this.cuC) {
      localContentValues.put("idx", Integer.valueOf(this.field_idx));
    }
    if (this.cvy) {
      localContentValues.put("temp", Integer.valueOf(this.field_temp));
    }
    if (this.cnd) {
      localContentValues.put("source", Integer.valueOf(this.field_source));
    }
    if (this.cvz) {
      localContentValues.put("needupload", Integer.valueOf(this.field_needupload));
    }
    if (this.cvA) {
      localContentValues.put("designerID", this.field_designerID);
    }
    if (this.cvB) {
      localContentValues.put("thumbUrl", this.field_thumbUrl);
    }
    if (this.cvC) {
      localContentValues.put("cdnUrl", this.field_cdnUrl);
    }
    if (this.cvD) {
      localContentValues.put("encrypturl", this.field_encrypturl);
    }
    if (this.cvE) {
      localContentValues.put("aeskey", this.field_aeskey);
    }
    if (this.cvF) {
      localContentValues.put("width", Integer.valueOf(this.field_width));
    }
    if (this.cvG) {
      localContentValues.put("height", Integer.valueOf(this.field_height));
    }
    if (this.cvH) {
      localContentValues.put("externUrl", this.field_externUrl);
    }
    if (this.cvI) {
      localContentValues.put("externMd5", this.field_externMd5);
    }
    if (this.cvJ) {
      localContentValues.put("activityid", this.field_activityid);
    }
    if (this.cvK) {
      localContentValues.put("tpurl", this.field_tpurl);
    }
    if (this.cvL) {
      localContentValues.put("tpauthkey", this.field_tpauthkey);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/g/c/as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */