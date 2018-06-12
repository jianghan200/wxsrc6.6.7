package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class bi
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cnf;
  private static final int cqH;
  private static final int cyL = "featureId".hashCode();
  private static final int cyM;
  private static final int cyN;
  private static final int cyO;
  private static final int cyP;
  private static final int cyQ;
  private static final int cyR;
  private static final int cyS;
  private static final int cyT;
  private static final int cyU;
  private boolean cnb = true;
  private boolean cqo = true;
  private boolean cyB = true;
  private boolean cyC = true;
  private boolean cyD = true;
  private boolean cyE = true;
  private boolean cyF = true;
  private boolean cyG = true;
  private boolean cyH = true;
  private boolean cyI = true;
  private boolean cyJ = true;
  private boolean cyK = true;
  public int field_actionType;
  public String field_androidUrl;
  public int field_featureId;
  public String field_helpUrl;
  public String field_iconPath;
  public String field_tag;
  public long field_timestamp;
  public String field_title;
  public String field_titlePY;
  public String field_titleShortPY;
  public String field_updateUrl;
  public String field_url;
  
  static
  {
    cnf = "title".hashCode();
    cyM = "titlePY".hashCode();
    cyN = "titleShortPY".hashCode();
    cyO = "tag".hashCode();
    cyP = "actionType".hashCode();
    cqH = "url".hashCode();
    cyQ = "helpUrl".hashCode();
    cyR = "updateUrl".hashCode();
    cyS = "androidUrl".hashCode();
    cyT = "iconPath".hashCode();
    cyU = "timestamp".hashCode();
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
      if (cyL != k) {
        break label65;
      }
      this.field_featureId = paramCursor.getInt(i);
      this.cyB = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cnf == k) {
        this.field_title = paramCursor.getString(i);
      } else if (cyM == k) {
        this.field_titlePY = paramCursor.getString(i);
      } else if (cyN == k) {
        this.field_titleShortPY = paramCursor.getString(i);
      } else if (cyO == k) {
        this.field_tag = paramCursor.getString(i);
      } else if (cyP == k) {
        this.field_actionType = paramCursor.getInt(i);
      } else if (cqH == k) {
        this.field_url = paramCursor.getString(i);
      } else if (cyQ == k) {
        this.field_helpUrl = paramCursor.getString(i);
      } else if (cyR == k) {
        this.field_updateUrl = paramCursor.getString(i);
      } else if (cyS == k) {
        this.field_androidUrl = paramCursor.getString(i);
      } else if (cyT == k) {
        this.field_iconPath = paramCursor.getString(i);
      } else if (cyU == k) {
        this.field_timestamp = paramCursor.getLong(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cyB) {
      localContentValues.put("featureId", Integer.valueOf(this.field_featureId));
    }
    if (this.cnb) {
      localContentValues.put("title", this.field_title);
    }
    if (this.cyC) {
      localContentValues.put("titlePY", this.field_titlePY);
    }
    if (this.cyD) {
      localContentValues.put("titleShortPY", this.field_titleShortPY);
    }
    if (this.cyE) {
      localContentValues.put("tag", this.field_tag);
    }
    if (this.cyF) {
      localContentValues.put("actionType", Integer.valueOf(this.field_actionType));
    }
    if (this.cqo) {
      localContentValues.put("url", this.field_url);
    }
    if (this.cyG) {
      localContentValues.put("helpUrl", this.field_helpUrl);
    }
    if (this.cyH) {
      localContentValues.put("updateUrl", this.field_updateUrl);
    }
    if (this.cyI) {
      localContentValues.put("androidUrl", this.field_androidUrl);
    }
    if (this.cyJ) {
      localContentValues.put("iconPath", this.field_iconPath);
    }
    if (this.cyK) {
      localContentValues.put("timestamp", Long.valueOf(this.field_timestamp));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/g/c/bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */