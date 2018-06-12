package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.g.a.gn;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.c;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.plugin.downloader.model.e.a;
import com.tencent.mm.plugin.game.gamewebview.ipc.GWMainProcessTask;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;

public class DoDownloadTask
  extends GWMainProcessTask
{
  public static Parcelable.Creator<DoDownloadTask> CREATOR = new DoDownloadTask.1();
  public String appId;
  public long bGm;
  public boolean bJm;
  public String bKg;
  public String extInfo;
  public long fHs;
  public String jGC;
  public String jGD;
  public String jGE;
  public String packageName;
  public int scene;
  public int type;
  public String url;
  
  public DoDownloadTask() {}
  
  private DoDownloadTask(Parcel paramParcel)
  {
    g(paramParcel);
  }
  
  public final void aai()
  {
    boolean bool1 = false;
    boolean bool2 = true;
    x.i("MicroMsg.AddDownloadTask", "doDownloadTask, type = " + this.type);
    Object localObject;
    switch (this.type)
    {
    default: 
      return;
    case 1: 
      x.i("MicroMsg.AddDownloadTask", "addDownloadTask");
      localObject = new gn();
      ((gn)localObject).bPI.url = this.url;
      ((gn)localObject).bPI.bKg = this.bKg;
      ((gn)localObject).bPI.extInfo = this.extInfo;
      ((gn)localObject).bPI.appId = this.appId;
      ((gn)localObject).bPI.scene = this.scene;
      com.tencent.mm.sdk.b.a.sFg.m((b)localObject);
      localObject = new e.a();
      ((e.a)localObject).yQ(this.url);
      ((e.a)localObject).yR(this.jGD);
      ((e.a)localObject).cx(this.fHs);
      ((e.a)localObject).yS(this.jGC);
      ((e.a)localObject).yT(this.bKg);
      ((e.a)localObject).setAppId(this.appId);
      ((e.a)localObject).cQ(this.packageName);
      ((e.a)localObject).ef(true);
      ((e.a)localObject).ox(bi.getInt(this.jGE, 1));
      ((e.a)localObject).setScene(this.scene);
      localObject = ((e.a)localObject).ick;
      this.bGm = d.aCU().a((com.tencent.mm.plugin.downloader.model.e)localObject);
      return;
    case 2: 
      x.i("MicroMsg.AddDownloadTask", "pauseDownloadTask");
      bool1 = d.aCU().cn(this.bGm);
    }
    for (;;)
    {
      this.bJm = bool1;
      return;
      x.i("MicroMsg.AddDownloadTask", "resumeDownloadTask");
      localObject = c.cs(this.bGm);
      if (localObject != null)
      {
        ((com.tencent.mm.plugin.downloader.c.a)localObject).field_scene = this.scene;
        c.e((com.tencent.mm.plugin.downloader.c.a)localObject);
      }
      bool1 = d.aCU().co(this.bGm);
      continue;
      x.i("MicroMsg.AddDownloadTask", "cancelDownloadTask");
      if (d.aCU().cl(this.bGm) > 0) {}
      for (bool1 = bool2;; bool1 = false)
      {
        this.bJm = bool1;
        return;
      }
      x.i("MicroMsg.AddDownloadTask", "cancelDownloadTask");
      localObject = d.aCU().cm(this.bGm);
      if (((FileDownloadTaskInfo)localObject).status == -1)
      {
        x.e("MicroMsg.AddDownloadTask", "installDownloadTask fail, apilevel not supported");
      }
      else if (((FileDownloadTaskInfo)localObject).status != 3)
      {
        x.e("MicroMsg.AddDownloadTask", "installDownloadTask fail, invalid status = " + ((FileDownloadTaskInfo)localObject).status);
      }
      else if (com.tencent.mm.a.e.cn(((FileDownloadTaskInfo)localObject).path))
      {
        localObject = Uri.fromFile(new File(((FileDownloadTaskInfo)localObject).path));
        bool1 = q.g(ad.getContext(), (Uri)localObject);
      }
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final void g(Parcel paramParcel)
  {
    boolean bool = true;
    this.type = paramParcel.readInt();
    this.jGC = paramParcel.readString();
    this.url = paramParcel.readString();
    this.jGD = paramParcel.readString();
    this.bKg = paramParcel.readString();
    this.extInfo = paramParcel.readString();
    this.jGE = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.packageName = paramParcel.readString();
    this.fHs = paramParcel.readLong();
    this.scene = paramParcel.readInt();
    this.bGm = paramParcel.readLong();
    if (paramParcel.readByte() == 1) {}
    for (;;)
    {
      this.bJm = bool;
      return;
      bool = false;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.type);
    paramParcel.writeString(this.jGC);
    paramParcel.writeString(this.url);
    paramParcel.writeString(this.jGD);
    paramParcel.writeString(this.bKg);
    paramParcel.writeString(this.extInfo);
    paramParcel.writeString(this.jGE);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.packageName);
    paramParcel.writeLong(this.fHs);
    paramParcel.writeInt(this.scene);
    paramParcel.writeLong(this.bGm);
    if (this.bJm) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/DoDownloadTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */