package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.modelcdntran.f;
import com.tencent.mm.modelcdntran.j;
import com.tencent.mm.modelvideo.b.a;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.plugin.appbrand.c.d.c;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

public final class AppBrandOnlineVideoProxy
  implements com.tencent.mm.modelvideo.b
{
  private OnlineVideoProxy fZS;
  private b.a fZT;
  
  public final void a(b.a parama)
  {
    this.fZT = parama;
    if (this.fZS != null) {
      this.fZS.gag = parama;
    }
  }
  
  public final boolean isVideoDataAvailable(String paramString, int paramInt1, int paramInt2)
  {
    if (this.fZS == null) {
      return false;
    }
    paramString = this.fZS;
    paramString.offset = paramInt1;
    paramString.length = paramInt2;
    paramString.fZX = 3;
    AppBrandMainProcessService.b(paramString);
    return paramString.gad;
  }
  
  public final void j(String paramString, int paramInt1, int paramInt2)
  {
    x.i("MicroMsg.AppBrandOnlineVideoProxy", "%s requestVideoData [%s, %d %d]", new Object[] { Integer.valueOf(hashCode()), paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.fZS != null)
    {
      paramString = this.fZS;
      paramString.offset = paramInt1;
      paramString.length = paramInt2;
      paramString.fZX = 2;
      AppBrandMainProcessService.a(paramString);
    }
  }
  
  public final void ny(String paramString)
  {
    x.i("MicroMsg.AppBrandOnlineVideoProxy", "%s stop http stream[%s]", new Object[] { Integer.valueOf(hashCode()), paramString });
    if (this.fZS != null)
    {
      this.fZS.gag = null;
      paramString = this.fZS;
      paramString.fZX = 4;
      AppBrandMainProcessService.a(paramString);
      this.fZS.ahB();
    }
    this.fZS = null;
  }
  
  public final void q(String paramString1, String paramString2, String paramString3)
  {
    x.i("MicroMsg.AppBrandOnlineVideoProxy", "%s start http stream[%s, %s, %s]", new Object[] { Integer.valueOf(hashCode()), paramString1, paramString2, paramString3 });
    if (this.fZS == null)
    {
      this.fZS = new OnlineVideoProxy();
      this.fZS.gag = this.fZT;
      this.fZS.ahA();
    }
    OnlineVideoProxy localOnlineVideoProxy = this.fZS;
    x.i("MicroMsg.AppBrandOnlineVideoProxy", "%s OnlineVideoProxy start http stream[%s %s %s] ", new Object[] { Integer.valueOf(localOnlineVideoProxy.hashCode()), paramString1, paramString2, paramString3 });
    localOnlineVideoProxy.elz = paramString1;
    localOnlineVideoProxy.path = paramString2;
    localOnlineVideoProxy.url = paramString3;
    localOnlineVideoProxy.fZX = 1;
    AppBrandMainProcessService.a(localOnlineVideoProxy);
  }
  
  private static class OnlineVideoProxy
    extends MainProcessTask
  {
    public static final Parcelable.Creator<OnlineVideoProxy> CREATOR = new AppBrandOnlineVideoProxy.OnlineVideoProxy.2();
    final int START = 1;
    final int STOP = 4;
    String elz;
    final int fZU = 0;
    final int fZV = 2;
    final int fZW = 3;
    int fZX;
    final int fZY = 10;
    final int fZZ = 11;
    final int gaa = 12;
    final int gab = 13;
    int gac;
    boolean gad = false;
    int gae;
    int gaf;
    b.a gag;
    d.c gah = new AppBrandOnlineVideoProxy.OnlineVideoProxy.1(this);
    int length;
    int offset;
    String path;
    String url;
    
    public OnlineVideoProxy() {}
    
    public OnlineVideoProxy(Parcel paramParcel)
    {
      g(paramParcel);
    }
    
    public final void aai()
    {
      x.d("MicroMsg.AppBrandOnlineVideoProxy", "runInMainProcess cdnMediaId[%s] state[%d]", new Object[] { this.elz, Integer.valueOf(this.fZX) });
      switch (this.fZX)
      {
      default: 
        x.w("MicroMsg.AppBrandOnlineVideoProxy", "unknow state ");
      case 1: 
      case 4: 
      case 2: 
        for (;;)
        {
          this.fZX = 0;
          x.i("MicroMsg.AppBrandOnlineVideoProxy", "runInMainProcess reset mainState[%d] ", new Object[] { Integer.valueOf(this.fZX) });
          ahH();
          return;
          localObject1 = e.abl();
          String str1 = this.elz;
          Object localObject2 = this.gah;
          ((com.tencent.mm.plugin.appbrand.c.b)localObject1).fnU.put(str1, localObject2);
          localObject1 = e.abl();
          str1 = this.elz;
          localObject2 = this.url;
          String str2 = this.path;
          x.i("MicroMsg.AppbrandCdnService", "add online video task [%s] url[%s] path[%s]", new Object[] { str1, localObject2, str2 });
          j localj = new j();
          localj.field_mediaId = str1;
          localj.field_fullpath = str2;
          localj.url = ((String)localObject2);
          localj.dQt = ((com.tencent.mm.plugin.appbrand.c.b)localObject1).fnV;
          localj.dQm = 1;
          localj.dQh = 3;
          o.Tb().a(localj, false);
          continue;
          e.abl().rr(this.elz);
          e.abl();
          localObject1 = this.elz;
          x.i("MicroMsg.AppbrandCdnService", "cancel online video task [%s]", new Object[] { localObject1 });
          o.Tb().k((String)localObject1, null);
          continue;
          e.abl();
          localObject1 = this.elz;
          i = this.offset;
          j = this.length;
          x.i("MicroMsg.AppbrandCdnService", "request online video task [%s]", new Object[] { localObject1 });
          o.Tb();
          f.g((String)localObject1, i, j);
        }
      }
      e.abl();
      Object localObject1 = this.elz;
      int i = this.offset;
      int j = this.length;
      x.i("MicroMsg.AppbrandCdnService", "check online video task [%s]", new Object[] { localObject1 });
      this.gad = o.Tb().isVideoDataAvailable((String)localObject1, i, j);
      ahH();
    }
    
    public final void aaj()
    {
      x.d("MicroMsg.AppBrandOnlineVideoProxy", "runInClientProcess cdnMediaId[%s] clientState[%d] [%d %d]", new Object[] { this.elz, Integer.valueOf(this.gac), Integer.valueOf(this.gae), Integer.valueOf(this.gaf) });
      if (this.gag == null) {
        return;
      }
      switch (this.gac)
      {
      }
      for (;;)
      {
        this.gac = 0;
        x.i("MicroMsg.AppBrandOnlineVideoProxy", "runInClientProcess reset clientState[%d] ", new Object[] { Integer.valueOf(this.gac) });
        return;
        this.gag.iB(this.gae);
        continue;
        this.gag.onDataAvailable(this.elz, this.gae, this.gaf);
        continue;
        this.gag.h(this.elz, this.gae, this.gaf);
        continue;
        this.gag.L(this.elz, this.gae);
      }
    }
    
    public final void g(Parcel paramParcel)
    {
      boolean bool = true;
      this.elz = paramParcel.readString();
      this.fZX = paramParcel.readInt();
      this.path = paramParcel.readString();
      this.url = paramParcel.readString();
      this.offset = paramParcel.readInt();
      this.length = paramParcel.readInt();
      if (paramParcel.readInt() == 1) {}
      for (;;)
      {
        this.gad = bool;
        this.gac = paramParcel.readInt();
        this.gae = paramParcel.readInt();
        this.gaf = paramParcel.readInt();
        return;
        bool = false;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeString(this.elz);
      paramParcel.writeInt(this.fZX);
      paramParcel.writeString(this.path);
      paramParcel.writeString(this.url);
      paramParcel.writeInt(this.offset);
      paramParcel.writeInt(this.length);
      if (this.gad) {}
      for (paramInt = 1;; paramInt = 0)
      {
        paramParcel.writeInt(paramInt);
        paramParcel.writeInt(this.gac);
        paramParcel.writeInt(this.gae);
        paramParcel.writeInt(this.gaf);
        return;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandOnlineVideoProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */