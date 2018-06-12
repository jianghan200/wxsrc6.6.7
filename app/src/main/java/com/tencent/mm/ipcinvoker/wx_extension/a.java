package com.tencent.mm.ipcinvoker.wx_extension;

import android.os.Parcel;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  implements com.tencent.mm.ipcinvoker.extension.a
{
  public final void a(Object paramObject, Parcel paramParcel)
  {
    paramObject = (b)paramObject;
    com.tencent.mm.ipcinvoker.extension.c.a(((b)paramObject).dID.dIL, paramParcel);
    if (ad.cic()) {
      com.tencent.mm.ipcinvoker.extension.c.a(((b)paramObject).dIE.dIL, paramParcel);
    }
    for (;;)
    {
      paramParcel.writeString(((b)paramObject).uri);
      paramParcel.writeInt(((b)paramObject).dIF);
      paramParcel.writeInt(((b)paramObject).dID.cmdId);
      paramParcel.writeInt(((b)paramObject).dIE.cmdId);
      return;
      paramParcel.writeString(((b)paramObject).dIE.dIL.getClass().getName());
    }
  }
  
  public final boolean aw(Object paramObject)
  {
    return paramObject instanceof b;
  }
  
  public final Object e(Parcel paramParcel)
  {
    b.a locala1 = new b.a();
    locala1.dIG = ((com.tencent.mm.bk.a)com.tencent.mm.ipcinvoker.extension.c.a(c.class.getName(), paramParcel));
    String str;
    if (ad.cic()) {
      str = paramParcel.readString();
    }
    for (;;)
    {
      try
      {
        locala1.dIH = ((com.tencent.mm.bk.a)Class.forName(str).newInstance());
        locala1.uri = paramParcel.readString();
        locala1.dIF = paramParcel.readInt();
        locala1.dII = paramParcel.readInt();
        locala1.dIJ = paramParcel.readInt();
        return locala1.KT();
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.XIPC.CommReqRespTransfer", "readFromParcel, mm process initiate resp e = %s", new Object[] { localException });
        locala1.dIH = new com.tencent.mm.bk.a();
        continue;
      }
      com.tencent.mm.bk.a locala = (com.tencent.mm.bk.a)com.tencent.mm.ipcinvoker.extension.c.a(c.class.getName(), paramParcel);
      Object localObject = locala;
      if (locala == null) {
        localObject = new com.tencent.mm.bk.a();
      }
      locala1.dIH = ((com.tencent.mm.bk.a)localObject);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ipcinvoker/wx_extension/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */