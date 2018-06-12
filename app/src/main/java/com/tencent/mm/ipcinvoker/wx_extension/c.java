package com.tencent.mm.ipcinvoker.wx_extension;

import android.os.Parcel;
import android.text.TextUtils;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  implements com.tencent.mm.ipcinvoker.extension.a
{
  public final void a(Object paramObject, Parcel paramParcel)
  {
    if (paramObject == null)
    {
      paramParcel.writeString(null);
      return;
    }
    paramObject = (com.tencent.mm.bk.a)paramObject;
    paramParcel.writeString(paramObject.getClass().getName());
    try
    {
      paramObject = ((com.tencent.mm.bk.a)paramObject).toByteArray();
      paramParcel.writeInt(paramObject.length);
      paramParcel.writeByteArray((byte[])paramObject);
      return;
    }
    catch (Exception paramObject)
    {
      for (;;)
      {
        x.e("MicroMsg.XIPC.MMProtoBufTransfer", "writeToParcel, e = %s", new Object[] { paramObject });
        paramObject = new byte[0];
      }
    }
  }
  
  public final boolean aw(Object paramObject)
  {
    return paramObject instanceof com.tencent.mm.bk.a;
  }
  
  public final Object e(Parcel paramParcel)
  {
    String str = paramParcel.readString();
    if (TextUtils.isEmpty(str)) {
      return null;
    }
    byte[] arrayOfByte = new byte[paramParcel.readInt()];
    paramParcel.readByteArray(arrayOfByte);
    try
    {
      paramParcel = (com.tencent.mm.bk.a)Class.forName(str).newInstance();
      paramParcel.aG(arrayOfByte);
      return paramParcel;
    }
    catch (Exception paramParcel)
    {
      for (;;)
      {
        x.e("MicroMsg.XIPC.MMProtoBufTransfer", "readFromParcel, e = %s", new Object[] { paramParcel });
        paramParcel = null;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ipcinvoker/wx_extension/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */