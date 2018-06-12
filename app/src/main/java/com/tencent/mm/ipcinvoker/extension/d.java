package com.tencent.mm.ipcinvoker.extension;

import android.os.Parcel;
import android.os.Parcelable;

public final class d
  implements a
{
  public final void a(Object paramObject, Parcel paramParcel)
  {
    paramParcel.writeParcelable((Parcelable)paramObject, 0);
  }
  
  public final boolean aw(Object paramObject)
  {
    return paramObject instanceof Parcelable;
  }
  
  public final Object e(Parcel paramParcel)
  {
    return paramParcel.readParcelable(getClass().getClassLoader());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/ipcinvoker/extension/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */