package com.tencent.mm.storage;

import com.tencent.mm.g.c.cm;

public final class ai
  extends com.tencent.mm.m.a
  implements com.tencent.mm.bt.a.a<String>
{
  public bd tay;
  
  public ai() {}
  
  public ai(String paramString)
  {
    super(paramString);
  }
  
  public final void R(int paramInt, long paramLong)
  {
    switch (paramInt)
    {
    case 4: 
    case 5: 
    case 6: 
    case 8: 
    case 9: 
    case 11: 
    default: 
      return;
    case 0: 
      eV((int)paramLong);
      return;
    case 1: 
      setStatus((int)paramLong);
      return;
    case 2: 
      eX((int)paramLong);
      return;
    case 3: 
      as(paramLong);
      return;
    case 7: 
      at(paramLong);
      return;
    case 10: 
      eZ((int)paramLong);
      return;
    case 12: 
      fa((int)paramLong);
      return;
    case 13: 
      fb((int)paramLong);
      return;
    }
    fd((int)paramLong);
  }
  
  public final void aY(int paramInt, String paramString)
  {
    switch (paramInt)
    {
    case 7: 
    case 10: 
    default: 
      return;
    case 4: 
      setUsername(paramString);
      return;
    case 5: 
      setContent(paramString);
      return;
    case 6: 
      ec(paramString);
      return;
    case 8: 
      ed(paramString);
      return;
    case 9: 
      ee(paramString);
      return;
    }
    eg(paramString);
  }
  
  public final void aj(bd parambd)
  {
    setStatus(parambd.field_status);
    eX(parambd.field_isSend);
    if (parambd.cmk()) {}
    label80:
    for (;;)
    {
      long l = parambd.field_createTime;
      for (ai localai = this;; localai = this)
      {
        localai.as(l);
        if (!parambd.cmh()) {
          break;
        }
        setContent(parambd.cmH());
        return;
        if (parambd.field_status != 1) {
          break label80;
        }
        l = Long.MAX_VALUE;
      }
      setContent(parambd.field_content);
      return;
    }
  }
  
  public final void cks() {}
  
  public final void clx()
  {
    setStatus(0);
    eX(0);
    setContent("");
    ec("0");
    eV(0);
    fd(0);
    au(0L);
    fc(0);
    fc(0);
    super.ed("");
    super.ee("");
  }
  
  public final void q(int paramInt, byte[] paramArrayOfByte) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/storage/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */