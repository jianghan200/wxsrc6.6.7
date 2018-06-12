package com.tencent.mm.ipcinvoker.wx_extension;

import android.os.Parcel;
import com.tencent.mm.ipcinvoker.extension.a;

public final class d
  implements a
{
  public final void a(Object paramObject, Parcel paramParcel)
  {
    paramObject = (Parcel)paramObject;
    ((Parcel)paramObject).setDataPosition(0);
    paramParcel.writeInt(((Parcel)paramObject).dataSize());
    paramParcel.appendFrom((Parcel)paramObject, 0, ((Parcel)paramObject).dataSize());
  }
  
  public final boolean aw(Object paramObject)
  {
    return paramObject instanceof Parcel;
  }
  
  public final Object e(Parcel paramParcel)
  {
    Parcel localParcel = Parcel.obtain();
    localParcel.setDataPosition(0);
    int i = paramParcel.readInt();
    localParcel.appendFrom(paramParcel, paramParcel.dataPosition(), i);
    localParcel.setDataPosition(0);
    return localParcel;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/ipcinvoker/wx_extension/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */