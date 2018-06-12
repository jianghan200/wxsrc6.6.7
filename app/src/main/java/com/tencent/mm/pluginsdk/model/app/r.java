package com.tencent.mm.pluginsdk.model.app;

final class r
{
  public String appId;
  public int efG;
  
  public r(String paramString, int paramInt)
  {
    this.appId = paramString;
    this.efG = paramInt;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      do
      {
        return false;
      } while (!(paramObject instanceof r));
      paramObject = (r)paramObject;
    } while ((!((r)paramObject).appId.equals(this.appId)) || (((r)paramObject).efG != this.efG));
    return true;
  }
  
  public final String toString()
  {
    return this.appId + this.efG;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/pluginsdk/model/app/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */