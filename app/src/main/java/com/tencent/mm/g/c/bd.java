package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public abstract class bd
  extends c
{
  public static final String[] ciG = { "CREATE INDEX IF NOT EXISTS FavCdnTransferInfo_LocalId ON FavCdnInfo(favLocalId)", "CREATE INDEX IF NOT EXISTS FavCDNInfo_modifyTime_Index ON FavCdnInfo(modifyTime)" };
  private static final int ciP = "rowid".hashCode();
  private static final int ciV;
  private static final int ckU;
  private static final int ckV;
  private static final int cke;
  private static final int clo;
  private static final int cmm;
  private static final int cwd;
  private static final int cxJ = "dataId".hashCode();
  private static final int cxK = "favLocalId".hashCode();
  private static final int cxL;
  private static final int cxM;
  private static final int cxN;
  private static final int cxO;
  private boolean ciS = true;
  private boolean cjI = true;
  private boolean ckD = true;
  private boolean ckE = true;
  private boolean clP = true;
  private boolean cll = true;
  private boolean cvC = true;
  private boolean cxD = true;
  private boolean cxE = true;
  private boolean cxF = true;
  private boolean cxG = true;
  private boolean cxH = true;
  private boolean cxI = true;
  public long field_attrFlag;
  public String field_cdnKey;
  public String field_cdnUrl;
  public String field_dataId;
  public int field_dataType;
  public int field_extFlag;
  public long field_favLocalId;
  public long field_modifyTime;
  public int field_offset;
  public String field_path;
  public int field_status;
  public int field_totalLen;
  public int field_type;
  
  static
  {
    cke = "type".hashCode();
    cwd = "cdnUrl".hashCode();
    cxL = "cdnKey".hashCode();
    ckU = "totalLen".hashCode();
    ckV = "offset".hashCode();
    ciV = "status".hashCode();
    cxM = "path".hashCode();
    clo = "dataType".hashCode();
    cmm = "modifyTime".hashCode();
    cxN = "extFlag".hashCode();
    cxO = "attrFlag".hashCode();
  }
  
  public static c.a wI()
  {
    c.a locala = new c.a();
    locala.sKy = new Field[13];
    locala.columns = new String[14];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "dataId";
    locala.sKA.put("dataId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" dataId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "dataId";
    locala.columns[1] = "favLocalId";
    locala.sKA.put("favLocalId", "LONG");
    localStringBuilder.append(" favLocalId LONG");
    localStringBuilder.append(", ");
    locala.columns[2] = "type";
    locala.sKA.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "cdnUrl";
    locala.sKA.put("cdnUrl", "TEXT");
    localStringBuilder.append(" cdnUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "cdnKey";
    locala.sKA.put("cdnKey", "TEXT");
    localStringBuilder.append(" cdnKey TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "totalLen";
    locala.sKA.put("totalLen", "INTEGER");
    localStringBuilder.append(" totalLen INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "offset";
    locala.sKA.put("offset", "INTEGER");
    localStringBuilder.append(" offset INTEGER");
    localStringBuilder.append(", ");
    locala.columns[7] = "status";
    locala.sKA.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    localStringBuilder.append(", ");
    locala.columns[8] = "path";
    locala.sKA.put("path", "TEXT");
    localStringBuilder.append(" path TEXT");
    localStringBuilder.append(", ");
    locala.columns[9] = "dataType";
    locala.sKA.put("dataType", "INTEGER");
    localStringBuilder.append(" dataType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[10] = "modifyTime";
    locala.sKA.put("modifyTime", "LONG default '0' ");
    localStringBuilder.append(" modifyTime LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[11] = "extFlag";
    locala.sKA.put("extFlag", "INTEGER default '0' ");
    localStringBuilder.append(" extFlag INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[12] = "attrFlag";
    locala.sKA.put("attrFlag", "LONG default '0' ");
    localStringBuilder.append(" attrFlag LONG default '0' ");
    locala.columns[13] = "rowid";
    locala.sql = localStringBuilder.toString();
    return locala;
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
      if (cxJ != k) {
        break label65;
      }
      this.field_dataId = paramCursor.getString(i);
      this.cxD = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cxK == k) {
        this.field_favLocalId = paramCursor.getLong(i);
      } else if (cke == k) {
        this.field_type = paramCursor.getInt(i);
      } else if (cwd == k) {
        this.field_cdnUrl = paramCursor.getString(i);
      } else if (cxL == k) {
        this.field_cdnKey = paramCursor.getString(i);
      } else if (ckU == k) {
        this.field_totalLen = paramCursor.getInt(i);
      } else if (ckV == k) {
        this.field_offset = paramCursor.getInt(i);
      } else if (ciV == k) {
        this.field_status = paramCursor.getInt(i);
      } else if (cxM == k) {
        this.field_path = paramCursor.getString(i);
      } else if (clo == k) {
        this.field_dataType = paramCursor.getInt(i);
      } else if (cmm == k) {
        this.field_modifyTime = paramCursor.getLong(i);
      } else if (cxN == k) {
        this.field_extFlag = paramCursor.getInt(i);
      } else if (cxO == k) {
        this.field_attrFlag = paramCursor.getLong(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cxD) {
      localContentValues.put("dataId", this.field_dataId);
    }
    if (this.cxE) {
      localContentValues.put("favLocalId", Long.valueOf(this.field_favLocalId));
    }
    if (this.cjI) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.cvC) {
      localContentValues.put("cdnUrl", this.field_cdnUrl);
    }
    if (this.cxF) {
      localContentValues.put("cdnKey", this.field_cdnKey);
    }
    if (this.ckD) {
      localContentValues.put("totalLen", Integer.valueOf(this.field_totalLen));
    }
    if (this.ckE) {
      localContentValues.put("offset", Integer.valueOf(this.field_offset));
    }
    if (this.ciS) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.cxG) {
      localContentValues.put("path", this.field_path);
    }
    if (this.cll) {
      localContentValues.put("dataType", Integer.valueOf(this.field_dataType));
    }
    if (this.clP) {
      localContentValues.put("modifyTime", Long.valueOf(this.field_modifyTime));
    }
    if (this.cxH) {
      localContentValues.put("extFlag", Integer.valueOf(this.field_extFlag));
    }
    if (this.cxI) {
      localContentValues.put("attrFlag", Long.valueOf(this.field_attrFlag));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/g/c/bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */