package com.tencent.mm.plugin.nfc.c;

import android.nfc.Tag;

public abstract class b
{
  public Tag lFg;
  public byte[] lFh = null;
  
  public boolean a(Tag paramTag)
  {
    this.lFg = paramTag;
    if (paramTag != null) {
      this.lFh = paramTag.getId();
    }
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/nfc/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */