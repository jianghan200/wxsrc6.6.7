package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class l
  extends c
{
  public static final String[] ciG = { "CREATE INDEX IF NOT EXISTS AppBrandLauncherLayoutItemUpdateTimeIndex ON AppBrandLauncherLayoutItem(updateTime)", "CREATE INDEX IF NOT EXISTS AppBrandLauncherLayoutItemSceneIndex ON AppBrandLauncherLayoutItem(scene)" };
  private static final int ciP = "rowid".hashCode();
  private static final int ckw;
  private static final int clj;
  private static final int clt = "recordId".hashCode();
  private static final int clu = "brandId".hashCode();
  private static final int clv = "versionType".hashCode();
  private boolean cku = true;
  private boolean clh = true;
  private boolean clq = true;
  private boolean clr = true;
  private boolean cls = true;
  public String field_brandId;
  public int field_recordId;
  public int field_scene;
  public long field_updateTime;
  public int field_versionType;
  
  static
  {
    clj = "updateTime".hashCode();
    ckw = "scene".hashCode();
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
      if (clt != k) {
        break label65;
      }
      this.field_recordId = paramCursor.getInt(i);
      this.clq = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (clu == k) {
        this.field_brandId = paramCursor.getString(i);
      } else if (clv == k) {
        this.field_versionType = paramCursor.getInt(i);
      } else if (clj == k) {
        this.field_updateTime = paramCursor.getLong(i);
      } else if (ckw == k) {
        this.field_scene = paramCursor.getInt(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.clq) {
      localContentValues.put("recordId", Integer.valueOf(this.field_recordId));
    }
    if (this.clr) {
      localContentValues.put("brandId", this.field_brandId);
    }
    if (this.cls) {
      localContentValues.put("versionType", Integer.valueOf(this.field_versionType));
    }
    if (this.clh) {
      localContentValues.put("updateTime", Long.valueOf(this.field_updateTime));
    }
    if (this.cku) {
      localContentValues.put("scene", Integer.valueOf(this.field_scene));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/g/c/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */