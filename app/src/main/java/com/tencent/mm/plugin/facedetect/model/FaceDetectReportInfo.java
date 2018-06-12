package com.tencent.mm.plugin.facedetect.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

class FaceDetectReportInfo
  implements Parcelable
{
  public static final Parcelable.Creator<FaceDetectReportInfo> CREATOR = new FaceDetectReportInfo.1();
  protected int bDv = 0;
  protected int iMg = 0;
  protected long iNJ = 0L;
  protected int iNK = 0;
  protected int iNL = 0;
  protected int iNM = 0;
  protected int iNN = 0;
  protected int iNO = 0;
  protected int iNP = 0;
  protected int iNQ = 0;
  protected int iNR = 0;
  protected int iNS = 0;
  protected int iNT = 0;
  protected int iNU = 0;
  protected int iNV = 0;
  protected int iNW = 0;
  protected int iNX = 0;
  protected int iNY = 0;
  protected int iNZ = 0;
  protected int iOa = 0;
  protected HashMap<Integer, Long> iOb = new HashMap();
  protected HashMap<Integer, Long> iOc = new HashMap();
  
  public FaceDetectReportInfo() {}
  
  protected FaceDetectReportInfo(Parcel paramParcel)
  {
    this.iNJ = paramParcel.readLong();
    this.iNK = paramParcel.readInt();
    this.iNL = paramParcel.readInt();
    this.iNM = paramParcel.readInt();
    this.iNN = paramParcel.readInt();
    this.iNO = paramParcel.readInt();
    this.iNP = paramParcel.readInt();
    this.iNQ = paramParcel.readInt();
    this.iNR = paramParcel.readInt();
    this.iNS = paramParcel.readInt();
    this.iNT = paramParcel.readInt();
    this.iNU = paramParcel.readInt();
    this.iNV = paramParcel.readInt();
    this.iNW = paramParcel.readInt();
    this.iNX = paramParcel.readInt();
    this.iNY = paramParcel.readInt();
    this.bDv = paramParcel.readInt();
    this.iMg = paramParcel.readInt();
    this.iNZ = paramParcel.readInt();
    this.iOa = paramParcel.readInt();
    try
    {
      this.iOb = paramParcel.readHashMap(HashMap.class.getClassLoader());
      this.iOc = paramParcel.readHashMap(HashMap.class.getClassLoader());
      return;
    }
    catch (Exception paramParcel)
    {
      x.printErrStackTrace("MicroMsg.FaceDetectReportInfo", paramParcel, "", new Object[0]);
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final void pv(int paramInt)
  {
    if (paramInt > 0)
    {
      if (paramInt == 1)
      {
        this.iNL += 1;
        return;
      }
      if (paramInt == 2)
      {
        this.iNM += 1;
        return;
      }
      this.iNL += 1;
      return;
    }
    if (paramInt == 0)
    {
      this.iNN += 1;
      return;
    }
    if (paramInt == -11)
    {
      this.iNP += 1;
      return;
    }
    if (paramInt == -12)
    {
      this.iNQ += 1;
      return;
    }
    if (paramInt == -13)
    {
      this.iNR += 1;
      return;
    }
    if (paramInt == -101)
    {
      this.iNV += 1;
      return;
    }
    if (paramInt == -102)
    {
      this.iNS += 1;
      return;
    }
    if (paramInt == -103)
    {
      this.iNT += 1;
      return;
    }
    if (paramInt == -105)
    {
      this.iNU += 1;
      return;
    }
    if (paramInt == -106)
    {
      this.iNO += 1;
      return;
    }
    if (paramInt == -107)
    {
      this.iNW += 1;
      return;
    }
    if (paramInt == -108)
    {
      this.iNX += 1;
      return;
    }
    if (paramInt == -109)
    {
      this.iNY += 1;
      return;
    }
    this.iNK += 1;
  }
  
  public final void reset()
  {
    this.iNJ = 0L;
    this.iNL = 0;
    this.iNM = 0;
    this.iNN = 0;
    this.iNK = 0;
    this.iNO = 0;
    this.iNP = 0;
    this.iNQ = 0;
    this.iNR = 0;
    this.iNS = 0;
    this.iNT = 0;
    this.iNU = 0;
    this.iNV = 0;
    this.iNW = 0;
    this.bDv = 0;
    this.iMg = 0;
    this.iNZ = 0;
    this.iOa = 0;
    this.iOb.clear();
    this.iOc.clear();
  }
  
  public String toString()
  {
    return "detectOk: " + this.iNL + ", motionOk: " + this.iNM + ", noFace: " + this.iNN + ", systemErr: " + this.iNK + ", noLiveFace: " + this.iNO + ", tooDark: " + this.iNP + ", tooLight: " + this.iNQ + ", backLight: " + this.iNR + ", tooSmall: " + this.iNS + ", tooBig: " + this.iNT + ", tooActive: " + this.iNU + ", poseNotValid: " + this.iNV + ", timeOut: " + this.iNW + ", totalFrame: " + this.bDv + ", verifyTime: " + this.iMg + ", processTimePerFrame: " + this.iOa;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(this.iNJ);
    paramParcel.writeInt(this.iNK);
    paramParcel.writeInt(this.iNL);
    paramParcel.writeInt(this.iNM);
    paramParcel.writeInt(this.iNN);
    paramParcel.writeInt(this.iNO);
    paramParcel.writeInt(this.iNP);
    paramParcel.writeInt(this.iNQ);
    paramParcel.writeInt(this.iNR);
    paramParcel.writeInt(this.iNS);
    paramParcel.writeInt(this.iNT);
    paramParcel.writeInt(this.iNU);
    paramParcel.writeInt(this.iNV);
    paramParcel.writeInt(this.iNW);
    paramParcel.writeInt(this.iNX);
    paramParcel.writeInt(this.iNY);
    paramParcel.writeInt(this.bDv);
    paramParcel.writeInt(this.iMg);
    paramParcel.writeInt(this.iNZ);
    paramParcel.writeInt(this.iOa);
    paramParcel.writeMap(this.iOb);
    paramParcel.writeMap(this.iOc);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/facedetect/model/FaceDetectReportInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */