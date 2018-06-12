package com.tencent.mm.modelcontrol;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class VideoTransPara
  implements Parcelable
{
  public static final Parcelable.Creator<VideoTransPara> CREATOR = new Parcelable.Creator() {};
  public int audioSampleRate;
  public int dQF;
  public int dQG;
  public int dQH;
  public int dQI;
  public int dQS = 0;
  public int duration;
  public int fps;
  public int height;
  public boolean isDefault;
  public int videoBitrate;
  public int width;
  
  public VideoTransPara() {}
  
  protected VideoTransPara(Parcel paramParcel)
  {
    this.width = paramParcel.readInt();
    this.height = paramParcel.readInt();
    this.fps = paramParcel.readInt();
    this.videoBitrate = paramParcel.readInt();
    this.duration = paramParcel.readInt();
    this.dQG = paramParcel.readInt();
    this.dQF = paramParcel.readInt();
    this.audioSampleRate = paramParcel.readInt();
    this.dQH = paramParcel.readInt();
    this.dQI = paramParcel.readInt();
    if (paramParcel.readInt() > 0) {
      bool = true;
    }
    this.isDefault = bool;
    this.dQS = paramParcel.readInt();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return "[isDefault " + this.isDefault + "width " + this.width + " height " + this.height + " fps " + this.fps + " video bitrate " + this.videoBitrate + " iFrame " + this.dQG + " audio bitrate " + this.dQF + " audioSampleRate " + this.audioSampleRate + " duration " + this.duration + " profile index " + this.dQH + " preset index " + this.dQI + " thumbSize " + this.dQS + "]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.width);
    paramParcel.writeInt(this.height);
    paramParcel.writeInt(this.fps);
    paramParcel.writeInt(this.videoBitrate);
    paramParcel.writeInt(this.duration);
    paramParcel.writeInt(this.dQG);
    paramParcel.writeInt(this.dQF);
    paramParcel.writeInt(this.audioSampleRate);
    paramParcel.writeInt(this.dQH);
    paramParcel.writeInt(this.dQI);
    if (this.isDefault) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.dQS);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/modelcontrol/VideoTransPara.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */