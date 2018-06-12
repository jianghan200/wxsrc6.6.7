package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class bl
  extends c
{
  private static final int cAa;
  private static final int cAb = "connectState".hashCode();
  private static final int cAc = "expiredTime".hashCode();
  private static final int cAd = "wifiType".hashCode();
  private static final int cAe = "action".hashCode();
  private static final int cAf = "showUrl".hashCode();
  private static final int cAg = "showWordEn".hashCode();
  private static final int cAh = "showWordCn".hashCode();
  private static final int cAi = "showWordTw".hashCode();
  private static final int cAj = "mac".hashCode();
  private static final int cAk = "verifyResult".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cqH;
  private static final int czY = "ssidmd5".hashCode();
  private static final int czZ = "ssid".hashCode();
  private boolean cqo = true;
  private boolean czL = true;
  private boolean czM = true;
  private boolean czN = true;
  private boolean czO = true;
  private boolean czP = true;
  private boolean czQ = true;
  private boolean czR = true;
  private boolean czS = true;
  private boolean czT = true;
  private boolean czU = true;
  private boolean czV = true;
  private boolean czW = true;
  private boolean czX = true;
  public int field_action;
  public int field_connectState;
  public long field_expiredTime;
  public String field_mac;
  public String field_mid;
  public String field_showUrl;
  public String field_showWordCn;
  public String field_showWordEn;
  public String field_showWordTw;
  public String field_ssid;
  public String field_ssidmd5;
  public String field_url;
  public int field_verifyResult;
  public int field_wifiType;
  
  static
  {
    cAa = "mid".hashCode();
    cqH = "url".hashCode();
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
      if (czY != k) {
        break label65;
      }
      this.field_ssidmd5 = paramCursor.getString(i);
      this.czL = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (czZ == k) {
        this.field_ssid = paramCursor.getString(i);
      } else if (cAa == k) {
        this.field_mid = paramCursor.getString(i);
      } else if (cqH == k) {
        this.field_url = paramCursor.getString(i);
      } else if (cAb == k) {
        this.field_connectState = paramCursor.getInt(i);
      } else if (cAc == k) {
        this.field_expiredTime = paramCursor.getLong(i);
      } else if (cAd == k) {
        this.field_wifiType = paramCursor.getInt(i);
      } else if (cAe == k) {
        this.field_action = paramCursor.getInt(i);
      } else if (cAf == k) {
        this.field_showUrl = paramCursor.getString(i);
      } else if (cAg == k) {
        this.field_showWordEn = paramCursor.getString(i);
      } else if (cAh == k) {
        this.field_showWordCn = paramCursor.getString(i);
      } else if (cAi == k) {
        this.field_showWordTw = paramCursor.getString(i);
      } else if (cAj == k) {
        this.field_mac = paramCursor.getString(i);
      } else if (cAk == k) {
        this.field_verifyResult = paramCursor.getInt(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.czL) {
      localContentValues.put("ssidmd5", this.field_ssidmd5);
    }
    if (this.czM) {
      localContentValues.put("ssid", this.field_ssid);
    }
    if (this.czN) {
      localContentValues.put("mid", this.field_mid);
    }
    if (this.cqo) {
      localContentValues.put("url", this.field_url);
    }
    if (this.czO) {
      localContentValues.put("connectState", Integer.valueOf(this.field_connectState));
    }
    if (this.czP) {
      localContentValues.put("expiredTime", Long.valueOf(this.field_expiredTime));
    }
    if (this.czQ) {
      localContentValues.put("wifiType", Integer.valueOf(this.field_wifiType));
    }
    if (this.czR) {
      localContentValues.put("action", Integer.valueOf(this.field_action));
    }
    if (this.czS) {
      localContentValues.put("showUrl", this.field_showUrl);
    }
    if (this.czT) {
      localContentValues.put("showWordEn", this.field_showWordEn);
    }
    if (this.czU) {
      localContentValues.put("showWordCn", this.field_showWordCn);
    }
    if (this.czV) {
      localContentValues.put("showWordTw", this.field_showWordTw);
    }
    if (this.czW) {
      localContentValues.put("mac", this.field_mac);
    }
    if (this.czX) {
      localContentValues.put("verifyResult", Integer.valueOf(this.field_verifyResult));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/g/c/bl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */