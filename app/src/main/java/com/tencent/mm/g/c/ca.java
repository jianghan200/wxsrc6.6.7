package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ca
  extends c
{
  private static final int cDe;
  private static final int cDf;
  private static final int cDi = "score".hashCode();
  private static final int cDo;
  private static final int cDp = "likecount".hashCode();
  private static final int cDq = "selfLikeState".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cli;
  private boolean cDb = true;
  private boolean cDc = true;
  private boolean cDh = true;
  private boolean cDl = true;
  private boolean cDm = true;
  private boolean cDn = true;
  private boolean clg = true;
  public String field_appusername;
  public int field_likecount;
  public String field_rankID;
  public int field_ranknum;
  public int field_score;
  public int field_selfLikeState;
  public String field_username;
  
  static
  {
    cDe = "rankID".hashCode();
    cDf = "appusername".hashCode();
    cli = "username".hashCode();
    cDo = "ranknum".hashCode();
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
      if (cDe != k) {
        break label60;
      }
      this.field_rankID = paramCursor.getString(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (cDf == k) {
        this.field_appusername = paramCursor.getString(i);
      } else if (cli == k) {
        this.field_username = paramCursor.getString(i);
      } else if (cDo == k) {
        this.field_ranknum = paramCursor.getInt(i);
      } else if (cDi == k) {
        this.field_score = paramCursor.getInt(i);
      } else if (cDp == k) {
        this.field_likecount = paramCursor.getInt(i);
      } else if (cDq == k) {
        this.field_selfLikeState = paramCursor.getInt(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cDb) {
      localContentValues.put("rankID", this.field_rankID);
    }
    if (this.cDc) {
      localContentValues.put("appusername", this.field_appusername);
    }
    if (this.clg) {
      localContentValues.put("username", this.field_username);
    }
    if (this.cDl) {
      localContentValues.put("ranknum", Integer.valueOf(this.field_ranknum));
    }
    if (this.cDh) {
      localContentValues.put("score", Integer.valueOf(this.field_score));
    }
    if (this.cDm) {
      localContentValues.put("likecount", Integer.valueOf(this.field_likecount));
    }
    if (this.cDn) {
      localContentValues.put("selfLikeState", Integer.valueOf(this.field_selfLikeState));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/g/c/ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */