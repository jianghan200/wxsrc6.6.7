package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ci
  extends c
{
  private static final int cEU;
  private static final int cEV;
  private static final int cEW;
  private static final int cEX;
  private static final int cEY;
  private static final int cEZ;
  private static final int cFA = "RedPoint".hashCode();
  private static final int cFB = "WeAppDebugMode".hashCode();
  private static final int cFC = "idkey".hashCode();
  private static final int cFD = "idkeyValue".hashCode();
  private static final int cFE = "Icon".hashCode();
  private static final int cFF = "ImgUrl_cn".hashCode();
  private static final int cFG = "ImgUrl_hk".hashCode();
  private static final int cFH = "ImgUrl_tw".hashCode();
  private static final int cFI = "ImgUrl_en".hashCode();
  private static final int cFa;
  private static final int cFb;
  private static final int cFc;
  private static final int cFd;
  private static final int cFe;
  private static final int cFf;
  private static final int cFg;
  private static final int cFh;
  private static final int cFi;
  private static final int cFj;
  private static final int cFk;
  private static final int cFl;
  private static final int cFm;
  private static final int cFn;
  private static final int cFo;
  private static final int cFp;
  private static final int cFq;
  private static final int cFr;
  private static final int cFs;
  private static final int cFt;
  private static final int cFu;
  private static final int cFv;
  private static final int cFw;
  private static final int cFx;
  private static final int cFy;
  private static final int cFz;
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ciV;
  private static final int cjg;
  private static final int cjh;
  private static final int cji;
  private boolean cEA = true;
  private boolean cEB = true;
  private boolean cEC = true;
  private boolean cED = true;
  private boolean cEE = true;
  private boolean cEF = true;
  private boolean cEG = true;
  private boolean cEH = true;
  private boolean cEI = true;
  private boolean cEJ = true;
  private boolean cEK = true;
  private boolean cEL = true;
  private boolean cEM = true;
  private boolean cEN = true;
  private boolean cEO = true;
  private boolean cEP = true;
  private boolean cEQ = true;
  private boolean cER = true;
  private boolean cES = true;
  private boolean cET = true;
  private boolean cEf = true;
  private boolean cEg = true;
  private boolean cEh = true;
  private boolean cEi = true;
  private boolean cEj = true;
  private boolean cEk = true;
  private boolean cEl = true;
  private boolean cEm = true;
  private boolean cEn = true;
  private boolean cEo = true;
  private boolean cEp = true;
  private boolean cEq = true;
  private boolean cEr = true;
  private boolean cEs = true;
  private boolean cEt = true;
  private boolean cEu = true;
  private boolean cEv = true;
  private boolean cEw = true;
  private boolean cEx = true;
  private boolean cEy = true;
  private boolean cEz = true;
  private boolean ciS = true;
  private boolean ciY = true;
  private boolean ciZ = true;
  private boolean cja = true;
  public int field_AllVer;
  public int field_BizType;
  public String field_Desc_cn;
  public String field_Desc_en;
  public String field_Desc_hk;
  public String field_Desc_tw;
  public String field_DetailURL;
  public String field_Icon;
  public String field_ImgUrl_android_cn;
  public String field_ImgUrl_android_en;
  public String field_ImgUrl_android_hk;
  public String field_ImgUrl_android_tw;
  public String field_ImgUrl_cn;
  public String field_ImgUrl_en;
  public String field_ImgUrl_hk;
  public String field_ImgUrl_tw;
  public String field_Introduce_cn;
  public String field_Introduce_en;
  public String field_Introduce_hk;
  public String field_Introduce_tw;
  public String field_LabsAppId;
  public int field_Pos;
  public int field_RedPoint;
  public int field_Switch;
  public String field_ThumbUrl_cn;
  public String field_ThumbUrl_en;
  public String field_ThumbUrl_hk;
  public String field_ThumbUrl_tw;
  public String field_TitleKey_android;
  public String field_Title_cn;
  public String field_Title_en;
  public String field_Title_hk;
  public String field_Title_tw;
  public int field_Type;
  public int field_WeAppDebugMode;
  public String field_WeAppPath;
  public String field_WeAppUser;
  public long field_endtime;
  public String field_expId;
  public int field_idkey;
  public int field_idkeyValue;
  public int field_prioritylevel;
  public long field_sequence;
  public long field_starttime;
  public int field_status;
  
  static
  {
    cEU = "LabsAppId".hashCode();
    cjg = "expId".hashCode();
    cEV = "Type".hashCode();
    cEW = "BizType".hashCode();
    cEX = "Switch".hashCode();
    cEY = "AllVer".hashCode();
    cEZ = "DetailURL".hashCode();
    cFa = "WeAppUser".hashCode();
    cFb = "WeAppPath".hashCode();
    cFc = "Pos".hashCode();
    cFd = "TitleKey_android".hashCode();
    cFe = "Title_cn".hashCode();
    cFf = "Title_hk".hashCode();
    cFg = "Title_tw".hashCode();
    cFh = "Title_en".hashCode();
    cFi = "Desc_cn".hashCode();
    cFj = "Desc_hk".hashCode();
    cFk = "Desc_tw".hashCode();
    cFl = "Desc_en".hashCode();
    cFm = "Introduce_cn".hashCode();
    cFn = "Introduce_hk".hashCode();
    cFo = "Introduce_tw".hashCode();
    cFp = "Introduce_en".hashCode();
    cFq = "starttime".hashCode();
    cFr = "endtime".hashCode();
    cjh = "sequence".hashCode();
    cji = "prioritylevel".hashCode();
    ciV = "status".hashCode();
    cFs = "ThumbUrl_cn".hashCode();
    cFt = "ThumbUrl_hk".hashCode();
    cFu = "ThumbUrl_tw".hashCode();
    cFv = "ThumbUrl_en".hashCode();
    cFw = "ImgUrl_android_cn".hashCode();
    cFx = "ImgUrl_android_hk".hashCode();
    cFy = "ImgUrl_android_tw".hashCode();
    cFz = "ImgUrl_android_en".hashCode();
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
      if (cEU != k) {
        break label65;
      }
      this.field_LabsAppId = paramCursor.getString(i);
      this.cEf = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cjg == k) {
        this.field_expId = paramCursor.getString(i);
      } else if (cEV == k) {
        this.field_Type = paramCursor.getInt(i);
      } else if (cEW == k) {
        this.field_BizType = paramCursor.getInt(i);
      } else if (cEX == k) {
        this.field_Switch = paramCursor.getInt(i);
      } else if (cEY == k) {
        this.field_AllVer = paramCursor.getInt(i);
      } else if (cEZ == k) {
        this.field_DetailURL = paramCursor.getString(i);
      } else if (cFa == k) {
        this.field_WeAppUser = paramCursor.getString(i);
      } else if (cFb == k) {
        this.field_WeAppPath = paramCursor.getString(i);
      } else if (cFc == k) {
        this.field_Pos = paramCursor.getInt(i);
      } else if (cFd == k) {
        this.field_TitleKey_android = paramCursor.getString(i);
      } else if (cFe == k) {
        this.field_Title_cn = paramCursor.getString(i);
      } else if (cFf == k) {
        this.field_Title_hk = paramCursor.getString(i);
      } else if (cFg == k) {
        this.field_Title_tw = paramCursor.getString(i);
      } else if (cFh == k) {
        this.field_Title_en = paramCursor.getString(i);
      } else if (cFi == k) {
        this.field_Desc_cn = paramCursor.getString(i);
      } else if (cFj == k) {
        this.field_Desc_hk = paramCursor.getString(i);
      } else if (cFk == k) {
        this.field_Desc_tw = paramCursor.getString(i);
      } else if (cFl == k) {
        this.field_Desc_en = paramCursor.getString(i);
      } else if (cFm == k) {
        this.field_Introduce_cn = paramCursor.getString(i);
      } else if (cFn == k) {
        this.field_Introduce_hk = paramCursor.getString(i);
      } else if (cFo == k) {
        this.field_Introduce_tw = paramCursor.getString(i);
      } else if (cFp == k) {
        this.field_Introduce_en = paramCursor.getString(i);
      } else if (cFq == k) {
        this.field_starttime = paramCursor.getLong(i);
      } else if (cFr == k) {
        this.field_endtime = paramCursor.getLong(i);
      } else if (cjh == k) {
        this.field_sequence = paramCursor.getLong(i);
      } else if (cji == k) {
        this.field_prioritylevel = paramCursor.getInt(i);
      } else if (ciV == k) {
        this.field_status = paramCursor.getInt(i);
      } else if (cFs == k) {
        this.field_ThumbUrl_cn = paramCursor.getString(i);
      } else if (cFt == k) {
        this.field_ThumbUrl_hk = paramCursor.getString(i);
      } else if (cFu == k) {
        this.field_ThumbUrl_tw = paramCursor.getString(i);
      } else if (cFv == k) {
        this.field_ThumbUrl_en = paramCursor.getString(i);
      } else if (cFw == k) {
        this.field_ImgUrl_android_cn = paramCursor.getString(i);
      } else if (cFx == k) {
        this.field_ImgUrl_android_hk = paramCursor.getString(i);
      } else if (cFy == k) {
        this.field_ImgUrl_android_tw = paramCursor.getString(i);
      } else if (cFz == k) {
        this.field_ImgUrl_android_en = paramCursor.getString(i);
      } else if (cFA == k) {
        this.field_RedPoint = paramCursor.getInt(i);
      } else if (cFB == k) {
        this.field_WeAppDebugMode = paramCursor.getInt(i);
      } else if (cFC == k) {
        this.field_idkey = paramCursor.getInt(i);
      } else if (cFD == k) {
        this.field_idkeyValue = paramCursor.getInt(i);
      } else if (cFE == k) {
        this.field_Icon = paramCursor.getString(i);
      } else if (cFF == k) {
        this.field_ImgUrl_cn = paramCursor.getString(i);
      } else if (cFG == k) {
        this.field_ImgUrl_hk = paramCursor.getString(i);
      } else if (cFH == k) {
        this.field_ImgUrl_tw = paramCursor.getString(i);
      } else if (cFI == k) {
        this.field_ImgUrl_en = paramCursor.getString(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cEf) {
      localContentValues.put("LabsAppId", this.field_LabsAppId);
    }
    if (this.field_expId == null) {
      this.field_expId = "";
    }
    if (this.ciY) {
      localContentValues.put("expId", this.field_expId);
    }
    if (this.cEg) {
      localContentValues.put("Type", Integer.valueOf(this.field_Type));
    }
    if (this.cEh) {
      localContentValues.put("BizType", Integer.valueOf(this.field_BizType));
    }
    if (this.cEi) {
      localContentValues.put("Switch", Integer.valueOf(this.field_Switch));
    }
    if (this.cEj) {
      localContentValues.put("AllVer", Integer.valueOf(this.field_AllVer));
    }
    if (this.cEk) {
      localContentValues.put("DetailURL", this.field_DetailURL);
    }
    if (this.cEl) {
      localContentValues.put("WeAppUser", this.field_WeAppUser);
    }
    if (this.cEm) {
      localContentValues.put("WeAppPath", this.field_WeAppPath);
    }
    if (this.cEn) {
      localContentValues.put("Pos", Integer.valueOf(this.field_Pos));
    }
    if (this.cEo) {
      localContentValues.put("TitleKey_android", this.field_TitleKey_android);
    }
    if (this.cEp) {
      localContentValues.put("Title_cn", this.field_Title_cn);
    }
    if (this.cEq) {
      localContentValues.put("Title_hk", this.field_Title_hk);
    }
    if (this.cEr) {
      localContentValues.put("Title_tw", this.field_Title_tw);
    }
    if (this.cEs) {
      localContentValues.put("Title_en", this.field_Title_en);
    }
    if (this.cEt) {
      localContentValues.put("Desc_cn", this.field_Desc_cn);
    }
    if (this.cEu) {
      localContentValues.put("Desc_hk", this.field_Desc_hk);
    }
    if (this.cEv) {
      localContentValues.put("Desc_tw", this.field_Desc_tw);
    }
    if (this.cEw) {
      localContentValues.put("Desc_en", this.field_Desc_en);
    }
    if (this.cEx) {
      localContentValues.put("Introduce_cn", this.field_Introduce_cn);
    }
    if (this.cEy) {
      localContentValues.put("Introduce_hk", this.field_Introduce_hk);
    }
    if (this.cEz) {
      localContentValues.put("Introduce_tw", this.field_Introduce_tw);
    }
    if (this.cEA) {
      localContentValues.put("Introduce_en", this.field_Introduce_en);
    }
    if (this.cEB) {
      localContentValues.put("starttime", Long.valueOf(this.field_starttime));
    }
    if (this.cEC) {
      localContentValues.put("endtime", Long.valueOf(this.field_endtime));
    }
    if (this.ciZ) {
      localContentValues.put("sequence", Long.valueOf(this.field_sequence));
    }
    if (this.cja) {
      localContentValues.put("prioritylevel", Integer.valueOf(this.field_prioritylevel));
    }
    if (this.ciS) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.cED) {
      localContentValues.put("ThumbUrl_cn", this.field_ThumbUrl_cn);
    }
    if (this.cEE) {
      localContentValues.put("ThumbUrl_hk", this.field_ThumbUrl_hk);
    }
    if (this.cEF) {
      localContentValues.put("ThumbUrl_tw", this.field_ThumbUrl_tw);
    }
    if (this.cEG) {
      localContentValues.put("ThumbUrl_en", this.field_ThumbUrl_en);
    }
    if (this.cEH) {
      localContentValues.put("ImgUrl_android_cn", this.field_ImgUrl_android_cn);
    }
    if (this.cEI) {
      localContentValues.put("ImgUrl_android_hk", this.field_ImgUrl_android_hk);
    }
    if (this.cEJ) {
      localContentValues.put("ImgUrl_android_tw", this.field_ImgUrl_android_tw);
    }
    if (this.cEK) {
      localContentValues.put("ImgUrl_android_en", this.field_ImgUrl_android_en);
    }
    if (this.cEL) {
      localContentValues.put("RedPoint", Integer.valueOf(this.field_RedPoint));
    }
    if (this.cEM) {
      localContentValues.put("WeAppDebugMode", Integer.valueOf(this.field_WeAppDebugMode));
    }
    if (this.cEN) {
      localContentValues.put("idkey", Integer.valueOf(this.field_idkey));
    }
    if (this.cEO) {
      localContentValues.put("idkeyValue", Integer.valueOf(this.field_idkeyValue));
    }
    if (this.cEP) {
      localContentValues.put("Icon", this.field_Icon);
    }
    if (this.cEQ) {
      localContentValues.put("ImgUrl_cn", this.field_ImgUrl_cn);
    }
    if (this.cER) {
      localContentValues.put("ImgUrl_hk", this.field_ImgUrl_hk);
    }
    if (this.cES) {
      localContentValues.put("ImgUrl_tw", this.field_ImgUrl_tw);
    }
    if (this.cET) {
      localContentValues.put("ImgUrl_en", this.field_ImgUrl_en);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/g/c/ci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */