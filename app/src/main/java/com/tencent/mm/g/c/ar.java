package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ar
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ciV;
  private static final int cke;
  private static final int cnk;
  private static final int cuK = "productID".hashCode();
  private static final int cuL = "packIconUrl".hashCode();
  private static final int cuM = "packGrayIconUrl".hashCode();
  private static final int cuN = "packCoverUrl".hashCode();
  private static final int cuO = "packName".hashCode();
  private static final int cuP = "packDesc".hashCode();
  private static final int cuQ = "packAuthInfo".hashCode();
  private static final int cuR = "packPrice".hashCode();
  private static final int cuS = "packType".hashCode();
  private static final int cuT = "packFlag".hashCode();
  private static final int cuU = "packExpire".hashCode();
  private static final int cuV = "packTimeStamp".hashCode();
  private static final int cuW = "packCopyright".hashCode();
  private static final int cuX;
  private static final int cuY;
  private static final int cuZ;
  private static final int cva;
  private static final int cvb;
  private static final int cvc;
  private static final int cvd;
  private static final int cve;
  private static final int cvf;
  private static final int cvg;
  private static final int cvh;
  private static final int cvi;
  private static final int cvj;
  private boolean ciS = true;
  private boolean cjI = true;
  private boolean cni = true;
  private boolean cuA = true;
  private boolean cuB = true;
  private boolean cuC = true;
  private boolean cuD = true;
  private boolean cuE = true;
  private boolean cuF = true;
  private boolean cuG = true;
  private boolean cuH = true;
  private boolean cuI = true;
  private boolean cuJ = true;
  private boolean cuk = true;
  private boolean cul = true;
  private boolean cum = true;
  private boolean cun = true;
  private boolean cuo = true;
  private boolean cup = true;
  private boolean cuq = true;
  private boolean cur = true;
  private boolean cus = true;
  private boolean cut = true;
  private boolean cuu = true;
  private boolean cuv = true;
  private boolean cuw = true;
  private boolean cux = true;
  private boolean cuy = true;
  private boolean cuz = true;
  public String field_BigIconUrl;
  public String field_MutiLanName;
  public int field_buttonType;
  public int field_count;
  public int field_flag;
  public int field_idx;
  public String field_lang;
  public long field_lastUseTime;
  public String field_packAuthInfo;
  public String field_packCopyright;
  public String field_packCoverUrl;
  public String field_packDesc;
  public long field_packExpire;
  public int field_packFlag;
  public String field_packGrayIconUrl;
  public String field_packIconUrl;
  public String field_packName;
  public String field_packPrice;
  public int field_packStatus;
  public long field_packTimeStamp;
  public int field_packType;
  public String field_productID;
  public int field_recommand;
  public int field_recommandType;
  public String field_recommandWord;
  public int field_sort;
  public int field_status;
  public int field_sync;
  public int field_type;
  
  static
  {
    cke = "type".hashCode();
    ciV = "status".hashCode();
    cuX = "sort".hashCode();
    cuY = "lastUseTime".hashCode();
    cuZ = "packStatus".hashCode();
    cnk = "flag".hashCode();
    cva = "recommand".hashCode();
    cvb = "sync".hashCode();
    cvc = "idx".hashCode();
    cvd = "BigIconUrl".hashCode();
    cve = "MutiLanName".hashCode();
    cvf = "recommandType".hashCode();
    cvg = "lang".hashCode();
    cvh = "recommandWord".hashCode();
    cvi = "buttonType".hashCode();
    cvj = "count".hashCode();
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
      if (cuK != k) {
        break label65;
      }
      this.field_productID = paramCursor.getString(i);
      this.cuk = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cuL == k) {
        this.field_packIconUrl = paramCursor.getString(i);
      } else if (cuM == k) {
        this.field_packGrayIconUrl = paramCursor.getString(i);
      } else if (cuN == k) {
        this.field_packCoverUrl = paramCursor.getString(i);
      } else if (cuO == k) {
        this.field_packName = paramCursor.getString(i);
      } else if (cuP == k) {
        this.field_packDesc = paramCursor.getString(i);
      } else if (cuQ == k) {
        this.field_packAuthInfo = paramCursor.getString(i);
      } else if (cuR == k) {
        this.field_packPrice = paramCursor.getString(i);
      } else if (cuS == k) {
        this.field_packType = paramCursor.getInt(i);
      } else if (cuT == k) {
        this.field_packFlag = paramCursor.getInt(i);
      } else if (cuU == k) {
        this.field_packExpire = paramCursor.getLong(i);
      } else if (cuV == k) {
        this.field_packTimeStamp = paramCursor.getLong(i);
      } else if (cuW == k) {
        this.field_packCopyright = paramCursor.getString(i);
      } else if (cke == k) {
        this.field_type = paramCursor.getInt(i);
      } else if (ciV == k) {
        this.field_status = paramCursor.getInt(i);
      } else if (cuX == k) {
        this.field_sort = paramCursor.getInt(i);
      } else if (cuY == k) {
        this.field_lastUseTime = paramCursor.getLong(i);
      } else if (cuZ == k) {
        this.field_packStatus = paramCursor.getInt(i);
      } else if (cnk == k) {
        this.field_flag = paramCursor.getInt(i);
      } else if (cva == k) {
        this.field_recommand = paramCursor.getInt(i);
      } else if (cvb == k) {
        this.field_sync = paramCursor.getInt(i);
      } else if (cvc == k) {
        this.field_idx = paramCursor.getInt(i);
      } else if (cvd == k) {
        this.field_BigIconUrl = paramCursor.getString(i);
      } else if (cve == k) {
        this.field_MutiLanName = paramCursor.getString(i);
      } else if (cvf == k) {
        this.field_recommandType = paramCursor.getInt(i);
      } else if (cvg == k) {
        this.field_lang = paramCursor.getString(i);
      } else if (cvh == k) {
        this.field_recommandWord = paramCursor.getString(i);
      } else if (cvi == k) {
        this.field_buttonType = paramCursor.getInt(i);
      } else if (cvj == k) {
        this.field_count = paramCursor.getInt(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cuk) {
      localContentValues.put("productID", this.field_productID);
    }
    if (this.cul) {
      localContentValues.put("packIconUrl", this.field_packIconUrl);
    }
    if (this.cum) {
      localContentValues.put("packGrayIconUrl", this.field_packGrayIconUrl);
    }
    if (this.cun) {
      localContentValues.put("packCoverUrl", this.field_packCoverUrl);
    }
    if (this.cuo) {
      localContentValues.put("packName", this.field_packName);
    }
    if (this.cup) {
      localContentValues.put("packDesc", this.field_packDesc);
    }
    if (this.cuq) {
      localContentValues.put("packAuthInfo", this.field_packAuthInfo);
    }
    if (this.cur) {
      localContentValues.put("packPrice", this.field_packPrice);
    }
    if (this.cus) {
      localContentValues.put("packType", Integer.valueOf(this.field_packType));
    }
    if (this.cut) {
      localContentValues.put("packFlag", Integer.valueOf(this.field_packFlag));
    }
    if (this.cuu) {
      localContentValues.put("packExpire", Long.valueOf(this.field_packExpire));
    }
    if (this.cuv) {
      localContentValues.put("packTimeStamp", Long.valueOf(this.field_packTimeStamp));
    }
    if (this.cuw) {
      localContentValues.put("packCopyright", this.field_packCopyright);
    }
    if (this.cjI) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.ciS) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.cux) {
      localContentValues.put("sort", Integer.valueOf(this.field_sort));
    }
    if (this.cuy) {
      localContentValues.put("lastUseTime", Long.valueOf(this.field_lastUseTime));
    }
    if (this.cuz) {
      localContentValues.put("packStatus", Integer.valueOf(this.field_packStatus));
    }
    if (this.cni) {
      localContentValues.put("flag", Integer.valueOf(this.field_flag));
    }
    if (this.cuA) {
      localContentValues.put("recommand", Integer.valueOf(this.field_recommand));
    }
    if (this.cuB) {
      localContentValues.put("sync", Integer.valueOf(this.field_sync));
    }
    if (this.cuC) {
      localContentValues.put("idx", Integer.valueOf(this.field_idx));
    }
    if (this.cuD) {
      localContentValues.put("BigIconUrl", this.field_BigIconUrl);
    }
    if (this.cuE) {
      localContentValues.put("MutiLanName", this.field_MutiLanName);
    }
    if (this.cuF) {
      localContentValues.put("recommandType", Integer.valueOf(this.field_recommandType));
    }
    if (this.cuG) {
      localContentValues.put("lang", this.field_lang);
    }
    if (this.cuH) {
      localContentValues.put("recommandWord", this.field_recommandWord);
    }
    if (this.cuI) {
      localContentValues.put("buttonType", Integer.valueOf(this.field_buttonType));
    }
    if (this.cuJ) {
      localContentValues.put("count", Integer.valueOf(this.field_count));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/g/c/ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */