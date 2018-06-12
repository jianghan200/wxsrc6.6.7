package com.tencent.mm.plugin.appbrand.jsapi.base;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.v;
import com.tencent.mm.ab.v.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.protocal.c.chu;
import com.tencent.mm.protocal.c.ge;
import com.tencent.mm.protocal.c.gf;
import com.tencent.mm.storage.aa.a;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public class ReportSubmitFormTask
  extends MainProcessTask
{
  public static final Parcelable.Creator<ReportSubmitFormTask> CREATOR = new ReportSubmitFormTask.2();
  public String appId;
  public int bGF;
  public String bVs;
  public int cbu;
  public String fKK;
  public int type;
  
  public ReportSubmitFormTask() {}
  
  public ReportSubmitFormTask(AppBrandSysConfig paramAppBrandSysConfig)
  {
    this.appId = paramAppBrandSysConfig.appId;
    this.bGF = paramAppBrandSysConfig.frm.fih;
    this.cbu = paramAppBrandSysConfig.frm.fii;
  }
  
  private static LinkedList<chu> aim()
  {
    localLinkedList = new LinkedList();
    Object localObject = (String)g.Ei().DT().get(aa.a.sUv, null);
    try
    {
      localObject = new JSONArray((String)localObject);
      int i = 0;
      while (i < ((JSONArray)localObject).length())
      {
        JSONObject localJSONObject = ((JSONArray)localObject).getJSONObject(i);
        chu localchu = new chu();
        localchu.type = localJSONObject.getInt("type");
        localchu.bPS = localJSONObject.getString("appid");
        localchu.sBN = localJSONObject.getString("formid");
        localchu.sBO = localJSONObject.getString("pageid");
        localchu.sBP = localJSONObject.getInt("appstate");
        localchu.sBQ = localJSONObject.getInt("appversion");
        localLinkedList.add(localchu);
        i += 1;
      }
      return localLinkedList;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ReportSubmitFormTask", localException.getMessage());
      g.Ei().DT().a(aa.a.sUv, "");
    }
  }
  
  public final void aai()
  {
    Object localObject1 = new b.a();
    ((b.a)localObject1).dIG = new ge();
    ((b.a)localObject1).dIH = new gf();
    ((b.a)localObject1).uri = "/cgi-bin/mmbiz-bin/wxausrevent/batchrecordwxatemplatemsgevent";
    ((b.a)localObject1).dIF = 1129;
    localObject1 = ((b.a)localObject1).KT();
    final ge localge = (ge)((b)localObject1).dID.dIL;
    localge.rgJ = new LinkedList();
    ??? = new chu();
    ((chu)???).type = this.type;
    ((chu)???).bPS = this.appId;
    ((chu)???).sBN = this.fKK;
    ((chu)???).sBO = this.bVs;
    ((chu)???).sBP = this.bGF;
    ((chu)???).sBQ = this.cbu;
    localge.rgJ.add(???);
    synchronized (getClass())
    {
      localge.rgJ.addAll(aim());
      v.a((b)localObject1, new v.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String arg3, b paramAnonymousb, l paramAnonymousl)
        {
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0)) {}
          synchronized (ReportSubmitFormTask.this.getClass())
          {
            ReportSubmitFormTask.u(localge.rgJ);
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ReportSubmitFormTask", "Error: %d, %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
            return 0;
          }
        }
      });
      return;
    }
  }
  
  public final void g(Parcel paramParcel)
  {
    this.type = paramParcel.readInt();
    this.appId = paramParcel.readString();
    this.fKK = paramParcel.readString();
    this.bVs = paramParcel.readString();
    this.bGF = paramParcel.readInt();
    this.cbu = paramParcel.readInt();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.type);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.fKK);
    paramParcel.writeString(this.bVs);
    paramParcel.writeInt(this.bGF);
    paramParcel.writeInt(this.cbu);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/base/ReportSubmitFormTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */