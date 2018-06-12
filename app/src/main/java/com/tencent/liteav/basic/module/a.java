package com.tencent.liteav.basic.module;

public class a
{
  private String mID = "";
  
  public void clearID()
  {
    try
    {
      if (this.mID.length() != 0)
      {
        TXCStatus.b(this.mID);
        this.mID = "";
      }
      return;
    }
    finally {}
  }
  
  public void finalize()
  {
    clearID();
    super.finalize();
  }
  
  public String getID()
  {
    return this.mID;
  }
  
  public Object getStatusValue(int paramInt)
  {
    return TXCStatus.a(this.mID, paramInt);
  }
  
  public void setID(String paramString)
  {
    clearID();
    try
    {
      if (paramString.length() != 0)
      {
        this.mID = paramString;
        TXCStatus.a(this.mID);
      }
      return;
    }
    finally {}
  }
  
  public boolean setStatusValue(int paramInt, Object paramObject)
  {
    return TXCStatus.a(this.mID, paramInt, paramObject);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/liteav/basic/module/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */