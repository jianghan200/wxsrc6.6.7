package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class dq
  extends c
{
  private static final int cNa;
  private static final int cNb;
  private static final int cNc;
  private static final int cNd;
  private static final int cNe;
  private static final int cNf;
  private static final int cNg = "block_mask".hashCode();
  private static final int cNh = "dataInfoData".hashCode();
  private static final int cNi = "cardTpInfoData".hashCode();
  private static final int cNj = "shareInfoData".hashCode();
  private static final int cNk = "shopInfoData".hashCode();
  private static final int cNl = "categoryType".hashCode();
  private static final int cNm = "itemIndex".hashCode();
  public static final String[] ciG = { "CREATE INDEX IF NOT EXISTS ShareCardInfo_card_tp_id_index ON ShareCardInfo(card_tp_id)" };
  private static final int ciP = "rowid".hashCode();
  private static final int ciV;
  private static final int clj;
  private static final int cqC = "card_id".hashCode();
  private static final int cqD = "card_tp_id".hashCode();
  private static final int cvW;
  private static final int cyk;
  private boolean cMN = true;
  private boolean cMO = true;
  private boolean cMP = true;
  private boolean cMQ = true;
  private boolean cMR = true;
  private boolean cMS = true;
  private boolean cMT = true;
  private boolean cMU = true;
  private boolean cMV = true;
  private boolean cMW = true;
  private boolean cMX = true;
  private boolean cMY = true;
  private boolean cMZ = true;
  private boolean ciS = true;
  private boolean clh = true;
  private boolean cqj = true;
  private boolean cqk = true;
  private boolean cvu = true;
  private boolean cxW = true;
  public String field_app_id;
  public long field_begin_time;
  public long field_block_mask;
  public byte[] field_cardTpInfoData;
  public String field_card_id;
  public String field_card_tp_id;
  public int field_categoryType;
  public String field_consumer;
  public byte[] field_dataInfoData;
  public long field_end_time;
  public String field_from_username;
  public int field_itemIndex;
  public long field_local_updateTime;
  public byte[] field_shareInfoData;
  public long field_share_time;
  public byte[] field_shopInfoData;
  public int field_status;
  public long field_updateSeq;
  public long field_updateTime;
  
  static
  {
    cNa = "from_username".hashCode();
    cNb = "consumer".hashCode();
    cvW = "app_id".hashCode();
    ciV = "status".hashCode();
    cNc = "share_time".hashCode();
    cNd = "local_updateTime".hashCode();
    clj = "updateTime".hashCode();
    cNe = "begin_time".hashCode();
    cNf = "end_time".hashCode();
    cyk = "updateSeq".hashCode();
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
      if (cqC != k) {
        break label65;
      }
      this.field_card_id = paramCursor.getString(i);
      this.cqj = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cqD == k) {
        this.field_card_tp_id = paramCursor.getString(i);
      } else if (cNa == k) {
        this.field_from_username = paramCursor.getString(i);
      } else if (cNb == k) {
        this.field_consumer = paramCursor.getString(i);
      } else if (cvW == k) {
        this.field_app_id = paramCursor.getString(i);
      } else if (ciV == k) {
        this.field_status = paramCursor.getInt(i);
      } else if (cNc == k) {
        this.field_share_time = paramCursor.getLong(i);
      } else if (cNd == k) {
        this.field_local_updateTime = paramCursor.getLong(i);
      } else if (clj == k) {
        this.field_updateTime = paramCursor.getLong(i);
      } else if (cNe == k) {
        this.field_begin_time = paramCursor.getLong(i);
      } else if (cNf == k) {
        this.field_end_time = paramCursor.getLong(i);
      } else if (cyk == k) {
        this.field_updateSeq = paramCursor.getLong(i);
      } else if (cNg == k) {
        this.field_block_mask = paramCursor.getLong(i);
      } else if (cNh == k) {
        this.field_dataInfoData = paramCursor.getBlob(i);
      } else if (cNi == k) {
        this.field_cardTpInfoData = paramCursor.getBlob(i);
      } else if (cNj == k) {
        this.field_shareInfoData = paramCursor.getBlob(i);
      } else if (cNk == k) {
        this.field_shopInfoData = paramCursor.getBlob(i);
      } else if (cNl == k) {
        this.field_categoryType = paramCursor.getInt(i);
      } else if (cNm == k) {
        this.field_itemIndex = paramCursor.getInt(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cqj) {
      localContentValues.put("card_id", this.field_card_id);
    }
    if (this.cqk) {
      localContentValues.put("card_tp_id", this.field_card_tp_id);
    }
    if (this.cMN) {
      localContentValues.put("from_username", this.field_from_username);
    }
    if (this.cMO) {
      localContentValues.put("consumer", this.field_consumer);
    }
    if (this.cvu) {
      localContentValues.put("app_id", this.field_app_id);
    }
    if (this.ciS) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.cMP) {
      localContentValues.put("share_time", Long.valueOf(this.field_share_time));
    }
    if (this.cMQ) {
      localContentValues.put("local_updateTime", Long.valueOf(this.field_local_updateTime));
    }
    if (this.clh) {
      localContentValues.put("updateTime", Long.valueOf(this.field_updateTime));
    }
    if (this.cMR) {
      localContentValues.put("begin_time", Long.valueOf(this.field_begin_time));
    }
    if (this.cMS) {
      localContentValues.put("end_time", Long.valueOf(this.field_end_time));
    }
    if (this.cxW) {
      localContentValues.put("updateSeq", Long.valueOf(this.field_updateSeq));
    }
    if (this.cMT) {
      localContentValues.put("block_mask", Long.valueOf(this.field_block_mask));
    }
    if (this.cMU) {
      localContentValues.put("dataInfoData", this.field_dataInfoData);
    }
    if (this.cMV) {
      localContentValues.put("cardTpInfoData", this.field_cardTpInfoData);
    }
    if (this.cMW) {
      localContentValues.put("shareInfoData", this.field_shareInfoData);
    }
    if (this.cMX) {
      localContentValues.put("shopInfoData", this.field_shopInfoData);
    }
    if (this.cMY) {
      localContentValues.put("categoryType", Integer.valueOf(this.field_categoryType));
    }
    if (this.cMZ) {
      localContentValues.put("itemIndex", Integer.valueOf(this.field_itemIndex));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/g/c/dq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */