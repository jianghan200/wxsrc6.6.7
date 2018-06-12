package com.tencent.mm.plugin.appbrand.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.plugin.appbrand.jsapi.contact.d.a;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.plugin.appbrand.jsapi.h5_interact.a;
import com.tencent.mm.plugin.appbrand.jsapi.y.a;
import com.tencent.mm.plugin.appbrand.r.c;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MMToClientEvent
  extends MainProcessTask
{
  public static final Parcelable.Creator<MMToClientEvent> CREATOR = new MMToClientEvent.2();
  private static volatile MMToClientEvent fEs;
  private static final Set<a> fEt = new HashSet();
  public String appId;
  int bGz;
  String bNC;
  public int fEp;
  String fEq;
  Object fEr;
  public int type;
  
  private MMToClientEvent() {}
  
  private MMToClientEvent(Parcel paramParcel)
  {
    g(paramParcel);
  }
  
  public static void a(a parama)
  {
    if (parama != null) {
      synchronized (fEt)
      {
        fEt.add(parama);
        return;
      }
    }
  }
  
  private static MMToClientEvent ahG()
  {
    if (fEs == null) {}
    try
    {
      if (fEs == null) {
        fEs = new MMToClientEvent();
      }
      return fEs;
    }
    finally {}
  }
  
  public static void b(a parama)
  {
    if (parama != null) {
      synchronized (fEt)
      {
        fEt.remove(parama);
        return;
      }
    }
  }
  
  public static void tg(String paramString)
  {
    ahG().fEp = 1;
    ahG().appId = paramString;
    AppBrandMainProcessService.a(ahG());
    a.aiR();
  }
  
  public static void th(String paramString)
  {
    ahG().fEp = 2;
    ahG().appId = paramString;
    AppBrandMainProcessService.b(ahG());
  }
  
  public final void aai()
  {
    switch (this.fEp)
    {
    default: 
      return;
    case 1: 
      d.a(this);
      return;
    }
    d.b(this);
  }
  
  public final void aaj()
  {
    switch (this.fEp)
    {
    }
    Object localObject2;
    do
    {
      return;
      ??? = new y.a();
      localObject2 = new HashMap();
      ((HashMap)localObject2).put("type", Integer.valueOf(this.type));
      ((HashMap)localObject2).put("data", this.bNC);
      ((y.a)???).aC(this.appId, 0).x((Map)localObject2).ahM();
      return;
      ??? = new d.a();
      localObject2 = new HashMap();
      ((HashMap)localObject2).put("count", Integer.valueOf(this.bGz));
      ((HashMap)localObject2).put("data", this.bNC);
      ((d.a)???).aC(this.appId, 0).x((Map)localObject2).ahM();
      return;
      localObject2 = this.fEr;
    } while (localObject2 == null);
    LinkedList localLinkedList = new LinkedList();
    synchronized (fEt)
    {
      localLinkedList.addAll(fEt);
      c.Em().H(new MMToClientEvent.1(this, localLinkedList, localObject2));
      return;
    }
  }
  
  public final void g(Parcel paramParcel)
  {
    this.fEp = paramParcel.readInt();
    this.appId = paramParcel.readString();
    this.type = paramParcel.readInt();
    this.bNC = paramParcel.readString();
    this.bGz = paramParcel.readInt();
    try
    {
      this.fEq = paramParcel.readString();
      if (!bi.oW(this.fEq))
      {
        Class localClass = Class.forName(this.fEq);
        if (localClass != null) {
          this.fEr = paramParcel.readParcelable(localClass.getClassLoader());
        }
      }
      return;
    }
    catch (Exception paramParcel)
    {
      x.v("MicroMsg.MMToClientEvent", "unparcel custom data e %s", new Object[] { paramParcel });
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.fEp);
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.type);
    paramParcel.writeString(this.bNC);
    paramParcel.writeInt(this.bGz);
    if ((!bi.oW(this.fEq)) && (this.fEr != null))
    {
      paramParcel.writeString(this.fEq);
      paramParcel.writeParcelable((Parcelable)this.fEr, paramInt);
    }
  }
  
  public static abstract interface a
  {
    public abstract void bj(Object paramObject);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ipc/MMToClientEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */