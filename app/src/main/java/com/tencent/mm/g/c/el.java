package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class el
  extends c
{
  private static final int cRP = "wallet_tpa_country".hashCode();
  private static final int cRQ = "wallet_type".hashCode();
  private static final int cRR = "wallet_name".hashCode();
  private static final int cRS = "wallet_selected".hashCode();
  private static final int cRT = "wallet_balance".hashCode();
  private static final int cRU = "wallet_tpa_country_mask".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private boolean cRJ = true;
  private boolean cRK = true;
  private boolean cRL = true;
  private boolean cRM = true;
  private boolean cRN = true;
  private boolean cRO = true;
  public int field_wallet_balance;
  public String field_wallet_name;
  public int field_wallet_selected;
  public String field_wallet_tpa_country;
  public int field_wallet_tpa_country_mask;
  public int field_wallet_type;
  
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
      if (cRP != k) {
        break label65;
      }
      this.field_wallet_tpa_country = paramCursor.getString(i);
      this.cRJ = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cRQ == k) {
        this.field_wallet_type = paramCursor.getInt(i);
      } else if (cRR == k) {
        this.field_wallet_name = paramCursor.getString(i);
      } else if (cRS == k) {
        this.field_wallet_selected = paramCursor.getInt(i);
      } else if (cRT == k) {
        this.field_wallet_balance = paramCursor.getInt(i);
      } else if (cRU == k) {
        this.field_wallet_tpa_country_mask = paramCursor.getInt(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cRJ) {
      localContentValues.put("wallet_tpa_country", this.field_wallet_tpa_country);
    }
    if (this.cRK) {
      localContentValues.put("wallet_type", Integer.valueOf(this.field_wallet_type));
    }
    if (this.cRL) {
      localContentValues.put("wallet_name", this.field_wallet_name);
    }
    if (this.cRM) {
      localContentValues.put("wallet_selected", Integer.valueOf(this.field_wallet_selected));
    }
    if (this.cRN) {
      localContentValues.put("wallet_balance", Integer.valueOf(this.field_wallet_balance));
    }
    if (this.cRO) {
      localContentValues.put("wallet_tpa_country_mask", Integer.valueOf(this.field_wallet_tpa_country_mask));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/g/c/el.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */