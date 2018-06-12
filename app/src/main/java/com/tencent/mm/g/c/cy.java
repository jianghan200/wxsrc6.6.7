package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public abstract class cy
  extends c
{
  private static final int cHK;
  private static final int cJD;
  private static final int cJE = "indexBitData".hashCode();
  private static final int cJF = "fileCacheComplete".hashCode();
  private static final int cJG = "pieceFileMIMEType".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int czu;
  private boolean cHd = true;
  private boolean cJA = true;
  private boolean cJB = true;
  private boolean cJC = true;
  private boolean cJz = true;
  private boolean cyZ = true;
  public int field_fileCacheComplete;
  public String field_fileName;
  public byte[] field_indexBitData;
  public String field_musicId;
  public String field_musicUrl;
  public String field_pieceFileMIMEType;
  
  static
  {
    cHK = "musicId".hashCode();
    cJD = "musicUrl".hashCode();
    czu = "fileName".hashCode();
  }
  
  public static c.a wI()
  {
    c.a locala = new c.a();
    locala.sKy = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "musicId";
    locala.sKA.put("musicId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" musicId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "musicId";
    locala.columns[1] = "musicUrl";
    locala.sKA.put("musicUrl", "TEXT");
    localStringBuilder.append(" musicUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "fileName";
    locala.sKA.put("fileName", "TEXT");
    localStringBuilder.append(" fileName TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "indexBitData";
    locala.sKA.put("indexBitData", "BLOB");
    localStringBuilder.append(" indexBitData BLOB");
    localStringBuilder.append(", ");
    locala.columns[4] = "fileCacheComplete";
    locala.sKA.put("fileCacheComplete", "INTEGER");
    localStringBuilder.append(" fileCacheComplete INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "pieceFileMIMEType";
    locala.sKA.put("pieceFileMIMEType", "TEXT");
    localStringBuilder.append(" pieceFileMIMEType TEXT");
    locala.columns[6] = "rowid";
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
      if (cHK != k) {
        break label65;
      }
      this.field_musicId = paramCursor.getString(i);
      this.cHd = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cJD == k) {
        this.field_musicUrl = paramCursor.getString(i);
      } else if (czu == k) {
        this.field_fileName = paramCursor.getString(i);
      } else if (cJE == k) {
        this.field_indexBitData = paramCursor.getBlob(i);
      } else if (cJF == k) {
        this.field_fileCacheComplete = paramCursor.getInt(i);
      } else if (cJG == k) {
        this.field_pieceFileMIMEType = paramCursor.getString(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cHd) {
      localContentValues.put("musicId", this.field_musicId);
    }
    if (this.cJz) {
      localContentValues.put("musicUrl", this.field_musicUrl);
    }
    if (this.cyZ) {
      localContentValues.put("fileName", this.field_fileName);
    }
    if (this.cJA) {
      localContentValues.put("indexBitData", this.field_indexBitData);
    }
    if (this.cJB) {
      localContentValues.put("fileCacheComplete", Integer.valueOf(this.field_fileCacheComplete));
    }
    if (this.cJC) {
      localContentValues.put("pieceFileMIMEType", this.field_pieceFileMIMEType);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/g/c/cy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */