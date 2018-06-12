package com.tencent.mm.plugin.game.wepkg.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.plugin.game.wepkg.downloader.WePkgDownloader;
import com.tencent.mm.plugin.game.wepkg.downloader.WePkgDownloader.IWepkgUpdateCallback.RetCode;
import com.tencent.mm.sdk.platformtools.bi;

public class WepkgDownloadProcessTask
  extends BaseWepkgProcessTask
{
  public static final Parcelable.Creator<WepkgDownloadProcessTask> CREATOR = new WepkgDownloadProcessTask.2();
  public String bKg;
  public String cfX;
  public String downloadUrl;
  public Runnable fFC;
  public String ffK;
  public int fileType;
  public String kfk;
  public long kfl;
  public int kfm;
  public WePkgDownloader.IWepkgUpdateCallback.RetCode kfn;
  public String version;
  
  public WepkgDownloadProcessTask() {}
  
  private WepkgDownloadProcessTask(Parcel paramParcel)
  {
    g(paramParcel);
  }
  
  public final void aai()
  {
    ahA();
    WePkgDownloader.aVu().a(this.fileType, bi.oV(this.cfX), bi.oV(this.kfk), bi.oV(this.downloadUrl), this.kfl, bi.oV(this.version), bi.oV(this.bKg), this.kfm, new WepkgDownloadProcessTask.1(this));
  }
  
  public final void aaj()
  {
    if (this.fFC != null) {
      this.fFC.run();
    }
  }
  
  public final void k(Parcel paramParcel)
  {
    this.fileType = paramParcel.readInt();
    this.cfX = paramParcel.readString();
    this.kfk = paramParcel.readString();
    this.downloadUrl = paramParcel.readString();
    this.kfl = paramParcel.readLong();
    this.version = paramParcel.readString();
    this.bKg = paramParcel.readString();
    this.kfm = paramParcel.readInt();
    this.ffK = paramParcel.readString();
    this.kfn = ((WePkgDownloader.IWepkgUpdateCallback.RetCode)paramParcel.readParcelable(WePkgDownloader.IWepkgUpdateCallback.RetCode.class.getClassLoader()));
  }
  
  public final void v(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.fileType);
    paramParcel.writeString(this.cfX);
    paramParcel.writeString(this.kfk);
    paramParcel.writeString(this.downloadUrl);
    paramParcel.writeLong(this.kfl);
    paramParcel.writeString(this.version);
    paramParcel.writeString(this.bKg);
    paramParcel.writeInt(this.kfm);
    paramParcel.writeString(this.ffK);
    paramParcel.writeParcelable(this.kfn, paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/wepkg/model/WepkgDownloadProcessTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */