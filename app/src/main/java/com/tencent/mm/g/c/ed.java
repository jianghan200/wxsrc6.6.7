package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ed
  extends c
{
  private static final int cNa;
  private static final int cNd;
  private static final int cNe;
  private static final int cNf;
  private static final int cNg;
  private static final int cNh;
  private static final int cNi;
  private static final int cNj;
  private static final int cNk;
  private static final int cPo;
  private static final int cPp;
  private static final int cPq;
  private static final int cPr;
  private static final int cPs;
  private static final int cPt = "label_wording".hashCode();
  private static final int cPu = "is_dynamic".hashCode();
  public static final String[] ciG = { "CREATE INDEX IF NOT EXISTS UserCardInfo_card_type_index ON UserCardInfo(card_type)" };
  private static final int ciP = "rowid".hashCode();
  private static final int ciV;
  private static final int clj;
  private static final int cqC = "card_id".hashCode();
  private static final int cqD = "card_tp_id".hashCode();
  private static final int cqz;
  private static final int cyk;
  private boolean cMN = true;
  private boolean cMQ = true;
  private boolean cMR = true;
  private boolean cMS = true;
  private boolean cMT = true;
  private boolean cMU = true;
  private boolean cMV = true;
  private boolean cMW = true;
  private boolean cMX = true;
  private boolean cPh = true;
  private boolean cPi = true;
  private boolean cPj = true;
  private boolean cPk = true;
  private boolean cPl = true;
  private boolean cPm = true;
  private boolean cPn = true;
  private boolean ciS = true;
  private boolean clh = true;
  private boolean cqg = true;
  private boolean cqj = true;
  private boolean cqk = true;
  private boolean cxW = true;
  public long field_begin_time;
  public String field_block_mask;
  public byte[] field_cardTpInfoData;
  public String field_card_id;
  public String field_card_tp_id;
  public int field_card_type;
  public long field_create_time;
  public byte[] field_dataInfoData;
  public int field_delete_state_flag;
  public long field_end_time;
  public String field_from_username;
  public boolean field_is_dynamic;
  public String field_label_wording;
  public long field_local_updateTime;
  public byte[] field_shareInfoData;
  public byte[] field_shopInfoData;
  public int field_status;
  public String field_stickyAnnouncement;
  public int field_stickyEndTime;
  public int field_stickyIndex;
  public long field_updateSeq;
  public long field_updateTime;
  
  static
  {
    cNa = "from_username".hashCode();
    ciV = "status".hashCode();
    cPo = "delete_state_flag".hashCode();
    cNd = "local_updateTime".hashCode();
    clj = "updateTime".hashCode();
    cyk = "updateSeq".hashCode();
    cPp = "create_time".hashCode();
    cNe = "begin_time".hashCode();
    cNf = "end_time".hashCode();
    cNg = "block_mask".hashCode();
    cNh = "dataInfoData".hashCode();
    cNi = "cardTpInfoData".hashCode();
    cNj = "shareInfoData".hashCode();
    cNk = "shopInfoData".hashCode();
    cPq = "stickyIndex".hashCode();
    cPr = "stickyEndTime".hashCode();
    cPs = "stickyAnnouncement".hashCode();
    cqz = "card_type".hashCode();
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
      if (cqD == k)
      {
        this.field_card_tp_id = paramCursor.getString(i);
      }
      else if (cNa == k)
      {
        this.field_from_username = paramCursor.getString(i);
      }
      else if (ciV == k)
      {
        this.field_status = paramCursor.getInt(i);
      }
      else if (cPo == k)
      {
        this.field_delete_state_flag = paramCursor.getInt(i);
      }
      else if (cNd == k)
      {
        this.field_local_updateTime = paramCursor.getLong(i);
      }
      else if (clj == k)
      {
        this.field_updateTime = paramCursor.getLong(i);
      }
      else if (cyk == k)
      {
        this.field_updateSeq = paramCursor.getLong(i);
      }
      else if (cPp == k)
      {
        this.field_create_time = paramCursor.getLong(i);
      }
      else if (cNe == k)
      {
        this.field_begin_time = paramCursor.getLong(i);
      }
      else if (cNf == k)
      {
        this.field_end_time = paramCursor.getLong(i);
      }
      else if (cNg == k)
      {
        this.field_block_mask = paramCursor.getString(i);
      }
      else if (cNh == k)
      {
        this.field_dataInfoData = paramCursor.getBlob(i);
      }
      else if (cNi == k)
      {
        this.field_cardTpInfoData = paramCursor.getBlob(i);
      }
      else if (cNj == k)
      {
        this.field_shareInfoData = paramCursor.getBlob(i);
      }
      else if (cNk == k)
      {
        this.field_shopInfoData = paramCursor.getBlob(i);
      }
      else if (cPq == k)
      {
        this.field_stickyIndex = paramCursor.getInt(i);
      }
      else if (cPr == k)
      {
        this.field_stickyEndTime = paramCursor.getInt(i);
      }
      else if (cPs == k)
      {
        this.field_stickyAnnouncement = paramCursor.getString(i);
      }
      else if (cqz == k)
      {
        this.field_card_type = paramCursor.getInt(i);
      }
      else if (cPt == k)
      {
        this.field_label_wording = paramCursor.getString(i);
      }
      else
      {
        if (cPu == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (boolean bool = true;; bool = false)
          {
            this.field_is_dynamic = bool;
            break;
          }
        }
        if (ciP == k) {
          this.sKx = paramCursor.getLong(i);
        }
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
    if (this.ciS) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.cPh) {
      localContentValues.put("delete_state_flag", Integer.valueOf(this.field_delete_state_flag));
    }
    if (this.cMQ) {
      localContentValues.put("local_updateTime", Long.valueOf(this.field_local_updateTime));
    }
    if (this.clh) {
      localContentValues.put("updateTime", Long.valueOf(this.field_updateTime));
    }
    if (this.cxW) {
      localContentValues.put("updateSeq", Long.valueOf(this.field_updateSeq));
    }
    if (this.cPi) {
      localContentValues.put("create_time", Long.valueOf(this.field_create_time));
    }
    if (this.cMR) {
      localContentValues.put("begin_time", Long.valueOf(this.field_begin_time));
    }
    if (this.cMS) {
      localContentValues.put("end_time", Long.valueOf(this.field_end_time));
    }
    if (this.cMT) {
      localContentValues.put("block_mask", this.field_block_mask);
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
    if (this.cPj) {
      localContentValues.put("stickyIndex", Integer.valueOf(this.field_stickyIndex));
    }
    if (this.cPk) {
      localContentValues.put("stickyEndTime", Integer.valueOf(this.field_stickyEndTime));
    }
    if (this.cPl) {
      localContentValues.put("stickyAnnouncement", this.field_stickyAnnouncement);
    }
    if (this.cqg) {
      localContentValues.put("card_type", Integer.valueOf(this.field_card_type));
    }
    if (this.cPm) {
      localContentValues.put("label_wording", this.field_label_wording);
    }
    if (this.cPn) {
      localContentValues.put("is_dynamic", Boolean.valueOf(this.field_is_dynamic));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/g/c/ed.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */