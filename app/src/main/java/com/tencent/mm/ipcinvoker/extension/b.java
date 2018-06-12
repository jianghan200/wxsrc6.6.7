package com.tencent.mm.ipcinvoker.extension;

import android.os.Parcel;
import com.tencent.mm.ipcinvoker.j;

public final class b
  implements a
{
  public final void a(Object paramObject, Parcel paramParcel)
  {
    paramObject = (com.tencent.mm.ipcinvoker.d.a)paramObject;
    paramParcel.writeString(paramObject.getClass().getName());
    paramParcel.writeBundle(((com.tencent.mm.ipcinvoker.d.a)paramObject).toBundle());
  }
  
  public final boolean aw(Object paramObject)
  {
    return paramObject instanceof com.tencent.mm.ipcinvoker.d.a;
  }
  
  public final Object e(Parcel paramParcel)
  {
    Object localObject = paramParcel.readString();
    paramParcel = paramParcel.readBundle();
    localObject = (com.tencent.mm.ipcinvoker.d.a)j.e((String)localObject, com.tencent.mm.ipcinvoker.d.a.class);
    if (localObject != null)
    {
      ((com.tencent.mm.ipcinvoker.d.a)localObject).fromBundle(paramParcel);
      return localObject;
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ipcinvoker/extension/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */