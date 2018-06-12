package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class af
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cqC = "card_id".hashCode();
  private static final int cqY = "lower_bound".hashCode();
  private static final int cqZ = "need_insert_show_timestamp".hashCode();
  private static final int cra = "show_timestamp_encrypt_key".hashCode();
  private static final int crb = "expire_time_interval".hashCode();
  private static final int crc = "show_expire_interval".hashCode();
  private static final int crd = "fetch_time".hashCode();
  private boolean cqS = true;
  private boolean cqT = true;
  private boolean cqU = true;
  private boolean cqV = true;
  private boolean cqW = true;
  private boolean cqX = true;
  private boolean cqj = true;
  public String field_card_id;
  public int field_expire_time_interval;
  public long field_fetch_time;
  public int field_lower_bound;
  public boolean field_need_insert_show_timestamp;
  public int field_show_expire_interval;
  public String field_show_timestamp_encrypt_key;
  
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
      if (cqY == k)
      {
        this.field_lower_bound = paramCursor.getInt(i);
      }
      else
      {
        if (cqZ == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (boolean bool = true;; bool = false)
          {
            this.field_need_insert_show_timestamp = bool;
            break;
          }
        }
        if (cra == k) {
          this.field_show_timestamp_encrypt_key = paramCursor.getString(i);
        } else if (crb == k) {
          this.field_expire_time_interval = paramCursor.getInt(i);
        } else if (crc == k) {
          this.field_show_expire_interval = paramCursor.getInt(i);
        } else if (crd == k) {
          this.field_fetch_time = paramCursor.getLong(i);
        } else if (ciP == k) {
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
    if (this.cqS) {
      localContentValues.put("lower_bound", Integer.valueOf(this.field_lower_bound));
    }
    if (this.cqT) {
      localContentValues.put("need_insert_show_timestamp", Boolean.valueOf(this.field_need_insert_show_timestamp));
    }
    if (this.cqU) {
      localContentValues.put("show_timestamp_encrypt_key", this.field_show_timestamp_encrypt_key);
    }
    if (this.cqV) {
      localContentValues.put("expire_time_interval", Integer.valueOf(this.field_expire_time_interval));
    }
    if (this.cqW) {
      localContentValues.put("show_expire_interval", Integer.valueOf(this.field_show_expire_interval));
    }
    if (this.cqX) {
      localContentValues.put("fetch_time", Long.valueOf(this.field_fetch_time));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/g/c/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */