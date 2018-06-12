package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public abstract class bh
  extends c
{
  public static final String[] ciG = { "CREATE INDEX IF NOT EXISTS FavSearchInfo_Content_Index ON FavSearchInfo(content)", "CREATE INDEX IF NOT EXISTS FavSearchInfo_TagContent_Index ON FavSearchInfo(tagContent)", "CREATE INDEX IF NOT EXISTS FavSearchInfo_SubType_Index ON FavSearchInfo(subtype)" };
  private static final int ciP = "rowid".hashCode();
  private static final int cke;
  private static final int ckj;
  private static final int cqB;
  private static final int cxT = "localId".hashCode();
  private static final int cyA;
  private static final int cyz;
  private boolean cjI = true;
  private boolean cjN = true;
  private boolean cqi = true;
  private boolean cxR = true;
  private boolean cyx = true;
  private boolean cyy = true;
  public String field_content;
  public long field_localId;
  public int field_subtype;
  public String field_tagContent;
  public long field_time;
  public int field_type;
  
  static
  {
    ckj = "content".hashCode();
    cyz = "tagContent".hashCode();
    cqB = "time".hashCode();
    cke = "type".hashCode();
    cyA = "subtype".hashCode();
  }
  
  public static c.a wI()
  {
    c.a locala = new c.a();
    locala.sKy = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "localId";
    locala.sKA.put("localId", "LONG PRIMARY KEY ");
    localStringBuilder.append(" localId LONG PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "localId";
    locala.columns[1] = "content";
    locala.sKA.put("content", "TEXT");
    localStringBuilder.append(" content TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "tagContent";
    locala.sKA.put("tagContent", "TEXT");
    localStringBuilder.append(" tagContent TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "time";
    locala.sKA.put("time", "LONG");
    localStringBuilder.append(" time LONG");
    localStringBuilder.append(", ");
    locala.columns[4] = "type";
    locala.sKA.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "subtype";
    locala.sKA.put("subtype", "INTEGER default '0' ");
    localStringBuilder.append(" subtype INTEGER default '0' ");
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
      if (cxT != k) {
        break label65;
      }
      this.field_localId = paramCursor.getLong(i);
      this.cxR = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (ckj == k) {
        this.field_content = paramCursor.getString(i);
      } else if (cyz == k) {
        this.field_tagContent = paramCursor.getString(i);
      } else if (cqB == k) {
        this.field_time = paramCursor.getLong(i);
      } else if (cke == k) {
        this.field_type = paramCursor.getInt(i);
      } else if (cyA == k) {
        this.field_subtype = paramCursor.getInt(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cxR) {
      localContentValues.put("localId", Long.valueOf(this.field_localId));
    }
    if (this.cjN) {
      localContentValues.put("content", this.field_content);
    }
    if (this.cyx) {
      localContentValues.put("tagContent", this.field_tagContent);
    }
    if (this.cqi) {
      localContentValues.put("time", Long.valueOf(this.field_time));
    }
    if (this.cjI) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.cyy) {
      localContentValues.put("subtype", Integer.valueOf(this.field_subtype));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/g/c/bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */