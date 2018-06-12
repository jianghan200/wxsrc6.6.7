package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ae
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cnf;
  private static final int cng;
  private static final int cqA;
  private static final int cqB;
  private static final int cqC;
  private static final int cqD;
  private static final int cqE;
  private static final int cqF;
  private static final int cqG;
  private static final int cqH;
  private static final int cqI;
  private static final int cqJ;
  private static final int cqK;
  private static final int cqL;
  private static final int cqM;
  private static final int cqN;
  private static final int cqO;
  private static final int cqP;
  private static final int cqQ;
  private static final int cqR;
  private static final int cqz = "card_type".hashCode();
  private boolean cnb = true;
  private boolean cnc = true;
  private boolean cqg = true;
  private boolean cqh = true;
  private boolean cqi = true;
  private boolean cqj = true;
  private boolean cqk = true;
  private boolean cql = true;
  private boolean cqm = true;
  private boolean cqn = true;
  private boolean cqo = true;
  private boolean cqp = true;
  private boolean cqq = true;
  private boolean cqr = true;
  private boolean cqs = true;
  private boolean cqt = true;
  private boolean cqu = true;
  private boolean cqv = true;
  private boolean cqw = true;
  private boolean cqx = true;
  private boolean cqy = true;
  public String field_accept_buttons;
  public boolean field_all_unavailable;
  public byte[] field_buttonData;
  public String field_card_id;
  public String field_card_tp_id;
  public int field_card_type;
  public String field_consumed_box_id;
  public String field_description;
  public String field_jump_buttons;
  public int field_jump_type;
  public String field_logo_color;
  public String field_logo_url;
  public String field_msg_id;
  public int field_msg_type;
  public byte[] field_operData;
  public int field_read_state;
  public int field_report_scene;
  public int field_time;
  public String field_title;
  public String field_unavailable_qr_code_list;
  public String field_url;
  
  static
  {
    cnf = "title".hashCode();
    cng = "description".hashCode();
    cqA = "logo_url".hashCode();
    cqB = "time".hashCode();
    cqC = "card_id".hashCode();
    cqD = "card_tp_id".hashCode();
    cqE = "msg_id".hashCode();
    cqF = "msg_type".hashCode();
    cqG = "jump_type".hashCode();
    cqH = "url".hashCode();
    cqI = "buttonData".hashCode();
    cqJ = "operData".hashCode();
    cqK = "report_scene".hashCode();
    cqL = "read_state".hashCode();
    cqM = "accept_buttons".hashCode();
    cqN = "consumed_box_id".hashCode();
    cqO = "jump_buttons".hashCode();
    cqP = "logo_color".hashCode();
    cqQ = "unavailable_qr_code_list".hashCode();
    cqR = "all_unavailable".hashCode();
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
      if (cqz != k) {
        break label60;
      }
      this.field_card_type = paramCursor.getInt(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (cnf == k)
      {
        this.field_title = paramCursor.getString(i);
      }
      else if (cng == k)
      {
        this.field_description = paramCursor.getString(i);
      }
      else if (cqA == k)
      {
        this.field_logo_url = paramCursor.getString(i);
      }
      else if (cqB == k)
      {
        this.field_time = paramCursor.getInt(i);
      }
      else if (cqC == k)
      {
        this.field_card_id = paramCursor.getString(i);
      }
      else if (cqD == k)
      {
        this.field_card_tp_id = paramCursor.getString(i);
      }
      else if (cqE == k)
      {
        this.field_msg_id = paramCursor.getString(i);
        this.cql = true;
      }
      else if (cqF == k)
      {
        this.field_msg_type = paramCursor.getInt(i);
      }
      else if (cqG == k)
      {
        this.field_jump_type = paramCursor.getInt(i);
      }
      else if (cqH == k)
      {
        this.field_url = paramCursor.getString(i);
      }
      else if (cqI == k)
      {
        this.field_buttonData = paramCursor.getBlob(i);
      }
      else if (cqJ == k)
      {
        this.field_operData = paramCursor.getBlob(i);
      }
      else if (cqK == k)
      {
        this.field_report_scene = paramCursor.getInt(i);
      }
      else if (cqL == k)
      {
        this.field_read_state = paramCursor.getInt(i);
      }
      else if (cqM == k)
      {
        this.field_accept_buttons = paramCursor.getString(i);
      }
      else if (cqN == k)
      {
        this.field_consumed_box_id = paramCursor.getString(i);
      }
      else if (cqO == k)
      {
        this.field_jump_buttons = paramCursor.getString(i);
      }
      else if (cqP == k)
      {
        this.field_logo_color = paramCursor.getString(i);
      }
      else if (cqQ == k)
      {
        this.field_unavailable_qr_code_list = paramCursor.getString(i);
      }
      else
      {
        if (cqR == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (boolean bool = true;; bool = false)
          {
            this.field_all_unavailable = bool;
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
    if (this.cqg) {
      localContentValues.put("card_type", Integer.valueOf(this.field_card_type));
    }
    if (this.cnb) {
      localContentValues.put("title", this.field_title);
    }
    if (this.cnc) {
      localContentValues.put("description", this.field_description);
    }
    if (this.cqh) {
      localContentValues.put("logo_url", this.field_logo_url);
    }
    if (this.cqi) {
      localContentValues.put("time", Integer.valueOf(this.field_time));
    }
    if (this.cqj) {
      localContentValues.put("card_id", this.field_card_id);
    }
    if (this.cqk) {
      localContentValues.put("card_tp_id", this.field_card_tp_id);
    }
    if (this.cql) {
      localContentValues.put("msg_id", this.field_msg_id);
    }
    if (this.cqm) {
      localContentValues.put("msg_type", Integer.valueOf(this.field_msg_type));
    }
    if (this.cqn) {
      localContentValues.put("jump_type", Integer.valueOf(this.field_jump_type));
    }
    if (this.cqo) {
      localContentValues.put("url", this.field_url);
    }
    if (this.cqp) {
      localContentValues.put("buttonData", this.field_buttonData);
    }
    if (this.cqq) {
      localContentValues.put("operData", this.field_operData);
    }
    if (this.cqr) {
      localContentValues.put("report_scene", Integer.valueOf(this.field_report_scene));
    }
    if (this.cqs) {
      localContentValues.put("read_state", Integer.valueOf(this.field_read_state));
    }
    if (this.cqt) {
      localContentValues.put("accept_buttons", this.field_accept_buttons);
    }
    if (this.cqu) {
      localContentValues.put("consumed_box_id", this.field_consumed_box_id);
    }
    if (this.cqv) {
      localContentValues.put("jump_buttons", this.field_jump_buttons);
    }
    if (this.cqw) {
      localContentValues.put("logo_color", this.field_logo_color);
    }
    if (this.cqx) {
      localContentValues.put("unavailable_qr_code_list", this.field_unavailable_qr_code_list);
    }
    if (this.cqy) {
      localContentValues.put("all_unavailable", Boolean.valueOf(this.field_all_unavailable));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/g/c/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */