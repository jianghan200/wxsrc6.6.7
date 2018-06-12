package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.plugin.game.gamewebview.ipc.GWMainProcessTask;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;

public class QueryDownloadInfoTask
  extends GWMainProcessTask
{
  public static Parcelable.Creator<QueryDownloadInfoTask> CREATOR = new Parcelable.Creator() {};
  public long bGm;
  public ArrayList<FileDownloadTaskInfo> ixN;
  public ArrayList<String> jHC;
  public int type;
  
  public QueryDownloadInfoTask() {}
  
  private QueryDownloadInfoTask(Parcel paramParcel)
  {
    g(paramParcel);
  }
  
  public final void aai()
  {
    x.i("MicroMsg.QueryDownloadInfoTask", "QueryDownloadInfoTask");
    switch (this.type)
    {
    default: 
      return;
    case 1: 
      FileDownloadTaskInfo localFileDownloadTaskInfo = d.aCU().cm(this.bGm);
      this.ixN = new ArrayList();
      this.ixN.add(localFileDownloadTaskInfo);
      return;
    }
    if ((this.jHC == null) || (this.jHC.size() == 0))
    {
      x.i("MicroMsg.QueryDownloadInfoTask", "appIdList is null");
      return;
    }
    d.aCU();
    this.ixN = d.n(this.jHC);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final void g(Parcel paramParcel)
  {
    this.type = paramParcel.readInt();
    this.bGm = paramParcel.readLong();
    this.jHC = paramParcel.readArrayList(QueryDownloadInfoTask.class.getClassLoader());
    this.ixN = paramParcel.readArrayList(QueryDownloadInfoTask.class.getClassLoader());
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.type);
    paramParcel.writeLong(this.bGm);
    paramParcel.writeList(this.jHC);
    paramParcel.writeList(this.ixN);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/QueryDownloadInfoTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */