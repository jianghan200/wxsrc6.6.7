package com.tencent.mm.storage;

public final class ao
{
  public String bKk;
  public String ioy;
  public int taU;
  private boolean taV = false;
  public int taW;
  public int taX;
  public String taY;
  
  public ao()
  {
    this.taU = -1;
  }
  
  public ao(String paramString)
  {
    this.bKk = paramString;
    this.taU = -1;
  }
  
  public final void Dl(int paramInt)
  {
    if ((this.taU != -1) && (this.taU != paramInt) && (paramInt == 7)) {
      this.taV = true;
    }
    this.taU = paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/storage/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */