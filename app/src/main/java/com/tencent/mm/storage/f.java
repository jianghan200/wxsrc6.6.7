package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.mm.a.o;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.u;
import com.tencent.mm.sdk.platformtools.x;

public final class f
  implements com.tencent.mm.bt.a.a<String>
{
  public long dhP;
  private String field_alias;
  public String field_conRemark;
  public int field_deleteFlag;
  public String field_descWording;
  public String field_descWordingId;
  public String field_descWordingQuanpin;
  public byte[] field_lvbuff;
  public String field_nickname;
  public String field_openImAppid;
  public String field_remarkDesc;
  public int field_showHead;
  public String field_signature;
  public String field_username;
  public int field_verifyFlag;
  public int field_weiboFlag;
  public CharSequence sNQ;
  
  private void ckr()
  {
    if (this.field_lvbuff == null) {}
    for (;;)
    {
      return;
      try
      {
        if ((this.field_lvbuff != null) && (this.field_lvbuff.length != 0))
        {
          u localu = new u();
          if (localu.by(this.field_lvbuff) == 0)
          {
            localu.CX(4);
            localu.CX(4);
            localu.chC();
            localu.CX(8);
            localu.CX(4);
            localu.chC();
            localu.chC();
            localu.CX(4);
            localu.CX(4);
            localu.chC();
            localu.chC();
            localu.CX(4);
            localu.CX(4);
            this.field_signature = localu.getString();
            localu.chC();
            localu.chC();
            localu.chC();
            localu.CX(4);
            localu.CX(4);
            localu.chC();
            localu.CX(4);
            localu.chC();
            localu.chC();
            localu.CX(4);
            localu.CX(4);
            if (!localu.chD()) {
              this.field_remarkDesc = localu.getString();
            }
            this.field_lvbuff = null;
            return;
          }
        }
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.AddressUIContact", "exception:%s", new Object[] { bi.i(localException) });
      }
    }
  }
  
  public final String BL()
  {
    if ((this.field_conRemark != null) && (!this.field_conRemark.trim().equals(""))) {
      localObject2 = this.field_conRemark;
    }
    Object localObject1;
    do
    {
      do
      {
        return (String)localObject2;
        localObject1 = com.tencent.mm.l.a.fv(this.field_username);
        localObject2 = localObject1;
      } while (localObject1 != null);
      if ((this.field_nickname != null) && (this.field_nickname.length() > 0)) {
        break;
      }
      localObject1 = this.field_alias;
      localObject2 = localObject1;
    } while (!bi.oW((String)localObject1));
    Object localObject2 = this.field_username;
    if (localObject2 == null) {
      localObject1 = null;
    }
    for (;;)
    {
      if (localObject1 != null)
      {
        localObject2 = localObject1;
        if (((String)localObject1).length() != 0) {
          break;
        }
      }
      return this.field_username;
      if (((String)localObject2).toLowerCase().endsWith("@t.qq.com"))
      {
        localObject1 = "@" + ((String)localObject2).replace("@t.qq.com", "");
      }
      else
      {
        localObject1 = localObject2;
        if (((String)localObject2).toLowerCase().endsWith("@qqim"))
        {
          localObject1 = ((String)localObject2).replace("@qqim", "");
          long l = Long.valueOf((String)localObject1).longValue();
          if (l < 0L) {
            localObject1 = new o(l).toString();
          }
        }
      }
    }
    return this.field_nickname;
  }
  
  public final void R(int paramInt, long paramLong)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 4: 
      this.field_verifyFlag = ((int)paramLong);
      return;
    case 5: 
      this.field_showHead = ((int)paramLong);
      return;
    case 6: 
      this.field_weiboFlag = ((int)paramLong);
      return;
    case 7: 
      this.dhP = paramLong;
      return;
    }
    this.field_deleteFlag = ((int)paramLong);
  }
  
  public final void aY(int paramInt, String paramString)
  {
    switch (paramInt)
    {
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    default: 
      return;
    case 0: 
      this.field_username = paramString;
      return;
    case 1: 
      this.field_nickname = paramString;
      return;
    case 2: 
      this.field_alias = paramString;
      return;
    case 3: 
      this.field_conRemark = paramString;
      return;
    case 10: 
      this.field_descWordingId = paramString;
      return;
    case 11: 
      this.field_openImAppid = paramString;
      return;
    case 12: 
      this.field_descWording = paramString;
      return;
    }
    this.field_descWordingQuanpin = paramString;
  }
  
  public final void cks()
  {
    ckr();
  }
  
  public final void d(Cursor paramCursor)
  {
    this.field_username = paramCursor.getString(0);
    this.field_nickname = paramCursor.getString(1);
    this.field_alias = paramCursor.getString(2);
    this.field_conRemark = paramCursor.getString(3);
    this.field_verifyFlag = paramCursor.getInt(4);
    this.field_showHead = paramCursor.getInt(5);
    this.field_weiboFlag = paramCursor.getInt(6);
    this.dhP = paramCursor.getLong(7);
    this.field_deleteFlag = paramCursor.getInt(8);
    this.field_lvbuff = paramCursor.getBlob(9);
    this.field_descWordingId = paramCursor.getString(10);
    this.field_openImAppid = paramCursor.getString(11);
    if (paramCursor.getColumnCount() >= 14)
    {
      this.field_descWording = paramCursor.getString(12);
      this.field_descWordingQuanpin = paramCursor.getString(13);
    }
    ckr();
  }
  
  public final void q(int paramInt, byte[] paramArrayOfByte)
  {
    if (paramInt == 9) {
      this.field_lvbuff = paramArrayOfByte;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/storage/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */