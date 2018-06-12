package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.protocal.c.wb;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Map;

public abstract class bf
  extends c
{
  public static final String[] ciG = { "CREATE INDEX IF NOT EXISTS FavModInfo_LocalId_Index ON FavEditInfo(localId)" };
  private static final int ciP = "rowid".hashCode();
  private static final int cke;
  private static final int ckw;
  private static final int cqB;
  private static final int cxT = "localId".hashCode();
  private static final int cxU = "modItem".hashCode();
  private boolean cjI = true;
  private boolean cku = true;
  private boolean cqi = true;
  private boolean cxR = true;
  private boolean cxS = true;
  public long field_localId;
  public wb field_modItem;
  public int field_scene;
  public long field_time;
  public int field_type;
  
  static
  {
    cqB = "time".hashCode();
    cke = "type".hashCode();
    ckw = "scene".hashCode();
  }
  
  public static c.a wI()
  {
    c.a locala = new c.a();
    locala.sKy = new Field[5];
    locala.columns = new String[6];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "localId";
    locala.sKA.put("localId", "LONG");
    localStringBuilder.append(" localId LONG");
    localStringBuilder.append(", ");
    locala.columns[1] = "modItem";
    locala.sKA.put("modItem", "BLOB");
    localStringBuilder.append(" modItem BLOB");
    localStringBuilder.append(", ");
    locala.columns[2] = "time";
    locala.sKA.put("time", "LONG");
    localStringBuilder.append(" time LONG");
    localStringBuilder.append(", ");
    locala.columns[3] = "type";
    locala.sKA.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "scene";
    locala.sKA.put("scene", "INTEGER default '1' ");
    localStringBuilder.append(" scene INTEGER default '1' ");
    locala.columns[5] = "rowid";
    locala.sql = localStringBuilder.toString();
    return locala;
  }
  
  public final void d(Cursor paramCursor)
  {
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null) {
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    label20:
    int k;
    if (i < j)
    {
      k = arrayOfString[i].hashCode();
      if (cxT != k) {
        break label60;
      }
      this.field_localId = paramCursor.getLong(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (cxU == k) {
        try
        {
          byte[] arrayOfByte = paramCursor.getBlob(i);
          if ((arrayOfByte == null) || (arrayOfByte.length <= 0)) {
            continue;
          }
          this.field_modItem = ((wb)new wb().aG(arrayOfByte));
        }
        catch (IOException localIOException)
        {
          x.e("MicroMsg.SDK.BaseFavEditInfo", localIOException.getMessage());
        }
      } else if (cqB == k) {
        this.field_time = paramCursor.getLong(i);
      } else if (cke == k) {
        this.field_type = paramCursor.getInt(i);
      } else if (ckw == k) {
        this.field_scene = paramCursor.getInt(i);
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
    if ((this.cxS) && (this.field_modItem != null)) {}
    try
    {
      localContentValues.put("modItem", this.field_modItem.toByteArray());
      if (this.cqi) {
        localContentValues.put("time", Long.valueOf(this.field_time));
      }
      if (this.cjI) {
        localContentValues.put("type", Integer.valueOf(this.field_type));
      }
      if (this.cku) {
        localContentValues.put("scene", Integer.valueOf(this.field_scene));
      }
      if (this.sKx > 0L) {
        localContentValues.put("rowid", Long.valueOf(this.sKx));
      }
      return localContentValues;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        x.e("MicroMsg.SDK.BaseFavEditInfo", localIOException.getMessage());
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/g/c/bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */