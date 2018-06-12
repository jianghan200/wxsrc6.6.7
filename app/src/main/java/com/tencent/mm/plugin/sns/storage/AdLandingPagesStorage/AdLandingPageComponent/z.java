package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent;

import java.io.Serializable;

public final class z
  implements Serializable
{
  public float height;
  public String iconUrl;
  public float nAZ;
  public float width;
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof z)) {
        break;
      }
      paramObject = (z)paramObject;
    } while ((((z)paramObject).iconUrl.equals(this.iconUrl)) && (((z)paramObject).width == this.width) && (((z)paramObject).height == this.height) && (((z)paramObject).nAZ == this.nAZ));
    return false;
    return false;
  }
  
  public final int hashCode()
  {
    return super.hashCode();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */