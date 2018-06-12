package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ds
  extends c
{
  private static final int cNA;
  private static final int cNB;
  private static final int cNC;
  private static final int cNy;
  private static final int cNz;
  public static final String[] ciG = { "CREATE INDEX IF NOT EXISTS file_name_hash_index ON SightDraftInfo(fileNameHash)" };
  private static final int ciP = "rowid".hashCode();
  private static final int ckb;
  private static final int cxT = "localId".hashCode();
  private static final int czu = "fileName".hashCode();
  private boolean cNt = true;
  private boolean cNu = true;
  private boolean cNv = true;
  private boolean cNw = true;
  private boolean cNx = true;
  private boolean cjF = true;
  private boolean cxR = true;
  private boolean cyZ = true;
  public long field_createTime;
  public int field_fileDuration;
  public long field_fileLength;
  public String field_fileMd5;
  public String field_fileName;
  public int field_fileNameHash;
  public int field_fileStatus;
  public int field_localId;
  
  static
  {
    cNy = "fileNameHash".hashCode();
    cNz = "fileMd5".hashCode();
    cNA = "fileLength".hashCode();
    cNB = "fileStatus".hashCode();
    cNC = "fileDuration".hashCode();
    ckb = "createTime".hashCode();
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
      this.field_localId = paramCursor.getInt(i);
      this.cxR = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (czu == k) {
        this.field_fileName = paramCursor.getString(i);
      } else if (cNy == k) {
        this.field_fileNameHash = paramCursor.getInt(i);
      } else if (cNz == k) {
        this.field_fileMd5 = paramCursor.getString(i);
      } else if (cNA == k) {
        this.field_fileLength = paramCursor.getLong(i);
      } else if (cNB == k) {
        this.field_fileStatus = paramCursor.getInt(i);
      } else if (cNC == k) {
        this.field_fileDuration = paramCursor.getInt(i);
      } else if (ckb == k) {
        this.field_createTime = paramCursor.getLong(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cxR) {
      localContentValues.put("localId", Integer.valueOf(this.field_localId));
    }
    if (this.cyZ) {
      localContentValues.put("fileName", this.field_fileName);
    }
    if (this.cNt) {
      localContentValues.put("fileNameHash", Integer.valueOf(this.field_fileNameHash));
    }
    if (this.field_fileMd5 == null) {
      this.field_fileMd5 = "";
    }
    if (this.cNu) {
      localContentValues.put("fileMd5", this.field_fileMd5);
    }
    if (this.cNv) {
      localContentValues.put("fileLength", Long.valueOf(this.field_fileLength));
    }
    if (this.cNw) {
      localContentValues.put("fileStatus", Integer.valueOf(this.field_fileStatus));
    }
    if (this.cNx) {
      localContentValues.put("fileDuration", Integer.valueOf(this.field_fileDuration));
    }
    if (this.cjF) {
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/g/c/ds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */