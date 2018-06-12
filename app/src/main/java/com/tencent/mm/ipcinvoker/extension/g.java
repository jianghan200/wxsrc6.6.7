package com.tencent.mm.ipcinvoker.extension;

import android.os.Parcel;
import com.tencent.mm.ipcinvoker.j;

public final class g
  implements a
{
  public final void a(Object paramObject, Parcel paramParcel)
  {
    paramObject = (f)paramObject;
    paramParcel.writeString(paramObject.getClass().getName());
    ((f)paramObject).f(paramParcel);
  }
  
  public final boolean aw(Object paramObject)
  {
    return paramObject instanceof f;
  }
  
  public final Object e(Parcel paramParcel)
  {
    f localf = (f)j.e(paramParcel.readString(), f.class);
    if (localf != null)
    {
      localf.readFromParcel(paramParcel);
      return localf;
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ipcinvoker/extension/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */