package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class fb
  extends c
{
  private static final int cGb;
  private static final int cGw = "reserved".hashCode();
  private static final int cVb;
  private static final int cVc;
  private static final int cVd;
  private static final int cVe;
  private static final int cVf;
  private static final int cVg;
  private static final int cVh;
  private static final int cVi;
  private static final int cVj;
  private static final int cVk = "syncTimeSecond".hashCode();
  private static final int cVl = "syncVersion".hashCode();
  private static final int cVm = "bizMenu".hashCode();
  public static final String[] ciG = { "CREATE INDEX IF NOT EXISTS WxaAttributesTableAppIdIndex ON WxaAttributesTable(appId)" };
  private static final int ciP = "rowid".hashCode();
  private static final int ckP;
  private static final int cld;
  private static final int cli;
  private static final int cpI;
  private static final int cpu;
  private boolean cFW = true;
  private boolean cGq = true;
  private boolean cUP = true;
  private boolean cUQ = true;
  private boolean cUR = true;
  private boolean cUS = true;
  private boolean cUT = true;
  private boolean cUU = true;
  private boolean cUV = true;
  private boolean cUW = true;
  private boolean cUX = true;
  private boolean cUY = true;
  private boolean cUZ = true;
  private boolean cVa = true;
  private boolean ckM = true;
  private boolean cky = true;
  private boolean clg = true;
  private boolean cpE = true;
  private boolean cpg = true;
  public String field_appId;
  public String field_appInfo;
  public int field_appOpt;
  public String field_bigHeadURL;
  public String field_bindWxaInfo;
  public String field_bizMenu;
  public String field_brandIconURL;
  public String field_dynamicInfo;
  public String field_nickname;
  public String field_registerSource;
  public String field_reserved;
  public String field_roundedSquareIconURL;
  public String field_signature;
  public String field_smallHeadURL;
  public long field_syncTimeSecond;
  public String field_syncVersion;
  public String field_username;
  public int field_usernameHash;
  public String field_versionInfo;
  
  static
  {
    cVb = "usernameHash".hashCode();
    cli = "username".hashCode();
    ckP = "appId".hashCode();
    cpI = "nickname".hashCode();
    cpu = "brandIconURL".hashCode();
    cVc = "roundedSquareIconURL".hashCode();
    cVd = "bigHeadURL".hashCode();
    cVe = "smallHeadURL".hashCode();
    cld = "signature".hashCode();
    cVf = "appOpt".hashCode();
    cVg = "registerSource".hashCode();
    cVh = "appInfo".hashCode();
    cGb = "versionInfo".hashCode();
    cVi = "bindWxaInfo".hashCode();
    cVj = "dynamicInfo".hashCode();
  }
  
  public void d(Cursor paramCursor)
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
      if (cVb != k) {
        break label65;
      }
      this.field_usernameHash = paramCursor.getInt(i);
      this.cUP = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cli == k) {
        this.field_username = paramCursor.getString(i);
      } else if (ckP == k) {
        this.field_appId = paramCursor.getString(i);
      } else if (cpI == k) {
        this.field_nickname = paramCursor.getString(i);
      } else if (cpu == k) {
        this.field_brandIconURL = paramCursor.getString(i);
      } else if (cVc == k) {
        this.field_roundedSquareIconURL = paramCursor.getString(i);
      } else if (cVd == k) {
        this.field_bigHeadURL = paramCursor.getString(i);
      } else if (cVe == k) {
        this.field_smallHeadURL = paramCursor.getString(i);
      } else if (cld == k) {
        this.field_signature = paramCursor.getString(i);
      } else if (cVf == k) {
        this.field_appOpt = paramCursor.getInt(i);
      } else if (cVg == k) {
        this.field_registerSource = paramCursor.getString(i);
      } else if (cVh == k) {
        this.field_appInfo = paramCursor.getString(i);
      } else if (cGb == k) {
        this.field_versionInfo = paramCursor.getString(i);
      } else if (cVi == k) {
        this.field_bindWxaInfo = paramCursor.getString(i);
      } else if (cVj == k) {
        this.field_dynamicInfo = paramCursor.getString(i);
      } else if (cGw == k) {
        this.field_reserved = paramCursor.getString(i);
      } else if (cVk == k) {
        this.field_syncTimeSecond = paramCursor.getLong(i);
      } else if (cVl == k) {
        this.field_syncVersion = paramCursor.getString(i);
      } else if (cVm == k) {
        this.field_bizMenu = paramCursor.getString(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cUP) {
      localContentValues.put("usernameHash", Integer.valueOf(this.field_usernameHash));
    }
    if (this.clg) {
      localContentValues.put("username", this.field_username);
    }
    if (this.cky) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.cpE) {
      localContentValues.put("nickname", this.field_nickname);
    }
    if (this.cpg) {
      localContentValues.put("brandIconURL", this.field_brandIconURL);
    }
    if (this.cUQ) {
      localContentValues.put("roundedSquareIconURL", this.field_roundedSquareIconURL);
    }
    if (this.cUR) {
      localContentValues.put("bigHeadURL", this.field_bigHeadURL);
    }
    if (this.cUS) {
      localContentValues.put("smallHeadURL", this.field_smallHeadURL);
    }
    if (this.ckM) {
      localContentValues.put("signature", this.field_signature);
    }
    if (this.cUT) {
      localContentValues.put("appOpt", Integer.valueOf(this.field_appOpt));
    }
    if (this.cUU) {
      localContentValues.put("registerSource", this.field_registerSource);
    }
    if (this.cUV) {
      localContentValues.put("appInfo", this.field_appInfo);
    }
    if (this.cFW) {
      localContentValues.put("versionInfo", this.field_versionInfo);
    }
    if (this.cUW) {
      localContentValues.put("bindWxaInfo", this.field_bindWxaInfo);
    }
    if (this.cUX) {
      localContentValues.put("dynamicInfo", this.field_dynamicInfo);
    }
    if (this.cGq) {
      localContentValues.put("reserved", this.field_reserved);
    }
    if (this.cUY) {
      localContentValues.put("syncTimeSecond", Long.valueOf(this.field_syncTimeSecond));
    }
    if (this.cUZ) {
      localContentValues.put("syncVersion", this.field_syncVersion);
    }
    if (this.cVa) {
      localContentValues.put("bizMenu", this.field_bizMenu);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/g/c/fb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */