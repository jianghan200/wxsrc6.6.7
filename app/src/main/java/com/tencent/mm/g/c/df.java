package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class df
  extends c
{
  private static final int cKA = "messageListStr".hashCode();
  private static final int cKB = "serviceInfoListStr".hashCode();
  private static final int cKC = "bizAccountListStr".hashCode();
  private static final int cKs;
  private static final int cKt;
  private static final int cKu;
  private static final int cKv;
  private static final int cKw;
  private static final int cKx;
  private static final int cKy;
  private static final int cKz;
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cli = "username".hashCode();
  private boolean cKh = true;
  private boolean cKi = true;
  private boolean cKj = true;
  private boolean cKk = true;
  private boolean cKl = true;
  private boolean cKm = true;
  private boolean cKn = true;
  private boolean cKo = true;
  private boolean cKp = true;
  private boolean cKq = true;
  private boolean cKr = true;
  private boolean clg = true;
  public String field_allArticleWording;
  public String field_banReason;
  public String field_bizAccountListStr;
  public int field_friendSubscribeCount;
  public String field_historyArticlesUrl;
  public String field_messageListStr;
  public int field_originalArticleCount;
  public String field_serviceInfoListStr;
  public int field_showRecommendArticle;
  public int field_showService;
  public int field_userRole;
  public String field_username;
  
  static
  {
    cKs = "originalArticleCount".hashCode();
    cKt = "friendSubscribeCount".hashCode();
    cKu = "allArticleWording".hashCode();
    cKv = "historyArticlesUrl".hashCode();
    cKw = "userRole".hashCode();
    cKx = "banReason".hashCode();
    cKy = "showRecommendArticle".hashCode();
    cKz = "showService".hashCode();
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
      if (cli != k) {
        break label65;
      }
      this.field_username = paramCursor.getString(i);
      this.clg = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cKs == k) {
        this.field_originalArticleCount = paramCursor.getInt(i);
      } else if (cKt == k) {
        this.field_friendSubscribeCount = paramCursor.getInt(i);
      } else if (cKu == k) {
        this.field_allArticleWording = paramCursor.getString(i);
      } else if (cKv == k) {
        this.field_historyArticlesUrl = paramCursor.getString(i);
      } else if (cKw == k) {
        this.field_userRole = paramCursor.getInt(i);
      } else if (cKx == k) {
        this.field_banReason = paramCursor.getString(i);
      } else if (cKy == k) {
        this.field_showRecommendArticle = paramCursor.getInt(i);
      } else if (cKz == k) {
        this.field_showService = paramCursor.getInt(i);
      } else if (cKA == k) {
        this.field_messageListStr = paramCursor.getString(i);
      } else if (cKB == k) {
        this.field_serviceInfoListStr = paramCursor.getString(i);
      } else if (cKC == k) {
        this.field_bizAccountListStr = paramCursor.getString(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.clg) {
      localContentValues.put("username", this.field_username);
    }
    if (this.cKh) {
      localContentValues.put("originalArticleCount", Integer.valueOf(this.field_originalArticleCount));
    }
    if (this.cKi) {
      localContentValues.put("friendSubscribeCount", Integer.valueOf(this.field_friendSubscribeCount));
    }
    if (this.cKj) {
      localContentValues.put("allArticleWording", this.field_allArticleWording);
    }
    if (this.cKk) {
      localContentValues.put("historyArticlesUrl", this.field_historyArticlesUrl);
    }
    if (this.cKl) {
      localContentValues.put("userRole", Integer.valueOf(this.field_userRole));
    }
    if (this.cKm) {
      localContentValues.put("banReason", this.field_banReason);
    }
    if (this.cKn) {
      localContentValues.put("showRecommendArticle", Integer.valueOf(this.field_showRecommendArticle));
    }
    if (this.cKo) {
      localContentValues.put("showService", Integer.valueOf(this.field_showService));
    }
    if (this.cKp) {
      localContentValues.put("messageListStr", this.field_messageListStr);
    }
    if (this.cKq) {
      localContentValues.put("serviceInfoListStr", this.field_serviceInfoListStr);
    }
    if (this.cKr) {
      localContentValues.put("bizAccountListStr", this.field_bizAccountListStr);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/g/c/df.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */