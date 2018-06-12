package com.tencent.mm.plugin.facedetect.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

public class FaceDetectReporter
  implements Parcelable
{
  public static final Parcelable.Creator<FaceDetectReporter> CREATOR = new Parcelable.Creator() {};
  public static FaceDetectReporter iOf = new FaceDetectReporter();
  String appId = "";
  public long iNJ = 0L;
  public boolean iOd = false;
  private FaceDetectReportInfo iOe = null;
  long iOg = 0L;
  long iOh = -1L;
  public long iOi = -1L;
  public int iOj = 0;
  public boolean iOk = false;
  
  private FaceDetectReporter() {}
  
  protected FaceDetectReporter(Parcel paramParcel)
  {
    this.iNJ = paramParcel.readLong();
    if (paramParcel.readByte() != 0)
    {
      bool1 = true;
      this.iOd = bool1;
      this.iOe = ((FaceDetectReportInfo)paramParcel.readParcelable(FaceDetectReportInfo.class.getClassLoader()));
      this.appId = paramParcel.readString();
      this.iOg = paramParcel.readLong();
      this.iOh = paramParcel.readLong();
      this.iOi = paramParcel.readLong();
      this.iOj = paramParcel.readInt();
      if (paramParcel.readByte() == 0) {
        break label154;
      }
    }
    label154:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.iOk = bool1;
      return;
      bool1 = false;
      break;
    }
  }
  
  public static FaceDetectReporter aJU()
  {
    if (iOf == null) {
      try
      {
        if (iOf == null) {
          iOf = new FaceDetectReporter();
        }
        FaceDetectReporter localFaceDetectReporter = iOf;
        return localFaceDetectReporter;
      }
      finally {}
    }
    return iOf;
  }
  
  public static void e(long paramLong, int paramInt1, int paramInt2)
  {
    x.i("MicroMsg.FaceDetectReporter", "hy: report video: bioId: %d, errType: %d, errCode: %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    h.mEJ.h(14121, new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
  }
  
  public static int pw(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return -1;
    case 0: 
    case 3: 
      return 2;
    case 1: 
    case 4: 
      return 3;
    case 5: 
      return 4;
    }
    return 1;
  }
  
  public final void I(int paramInt, boolean paramBoolean)
  {
    int i = 1;
    x.v("MicroMsg.FaceDetectReporter", "reportStartFaceDetect businessType: %d, isRetry: %b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    h localh = h.mEJ;
    long l = this.iNJ;
    if (paramBoolean) {}
    for (;;)
    {
      localh.h(14005, new Object[] { Integer.valueOf(paramInt), Long.valueOf(l), Integer.valueOf(i) });
      return;
      i = 0;
    }
  }
  
  public final void a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4)
  {
    a(paramInt1, paramBoolean, paramInt2, paramInt3, paramInt4, 0);
  }
  
  public final void a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    x.v("MicroMsg.FaceDetectReporter", "reportFaceDetectVerifyResult sessionId: %d, hasReported: %b, businessType: %d, isRetry: %b, result: %d, errType: %d, errCode: %d", new Object[] { Long.valueOf(this.iNJ), Boolean.valueOf(this.iOd), Integer.valueOf(paramInt1), Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    if ((this.iOe != null) && (!this.iOd))
    {
      x.v("MicroMsg.FaceDetectReporter", "info: %s", new Object[] { this.iOe.toString() });
      this.iOd = true;
      this.iOe.iMg = paramInt5;
      if (this.iOe.bDv != 0) {
        this.iOe.iOa = (this.iOe.iNZ / this.iOe.bDv);
      }
      if ((!this.iOe.iOb.containsKey(Integer.valueOf(0))) || (!this.iOe.iOc.containsKey(Integer.valueOf(0)))) {
        break label688;
      }
    }
    label688:
    for (paramInt5 = (int)(((Long)this.iOe.iOc.get(Integer.valueOf(0))).longValue() - ((Long)this.iOe.iOb.get(Integer.valueOf(0))).longValue());; paramInt5 = 0)
    {
      if ((this.iOe.iOb.containsKey(Integer.valueOf(4))) && (this.iOe.iOc.containsKey(Integer.valueOf(4)))) {}
      for (int i = (int)(((Long)this.iOe.iOc.get(Integer.valueOf(4))).longValue() - ((Long)this.iOe.iOb.get(Integer.valueOf(4))).longValue());; i = 0)
      {
        x.v("MicroMsg.FaceDetectReporter", "alvinluo normal motion time: %d ms, read number motion time: %d ms", new Object[] { Integer.valueOf(paramInt5), Integer.valueOf(i) });
        h localh = h.mEJ;
        long l = this.iNJ;
        if (paramBoolean) {}
        for (int j = 1;; j = 0)
        {
          localh.h(14006, new Object[] { Long.valueOf(l), Integer.valueOf(paramInt1), Integer.valueOf(j), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(this.iOe.iNL), Integer.valueOf(this.iOe.iNM), Integer.valueOf(this.iOe.iNN), Integer.valueOf(this.iOe.iNK), Integer.valueOf(this.iOe.iNO), Integer.valueOf(this.iOe.iNP), Integer.valueOf(this.iOe.iNQ), Integer.valueOf(this.iOe.iNR), Integer.valueOf(this.iOe.iNS), Integer.valueOf(this.iOe.iNT), Integer.valueOf(this.iOe.iNU), Integer.valueOf(this.iOe.iNV), Integer.valueOf(this.iOe.iNW), Integer.valueOf(this.iOe.iMg), Integer.valueOf(this.iOe.iNX), Integer.valueOf(this.iOe.iNY), Integer.valueOf(this.iOe.iOa), Integer.valueOf(paramInt5), Integer.valueOf(i), this.appId });
          return;
        }
      }
    }
  }
  
  public final void a(FaceDetectReporter paramFaceDetectReporter)
  {
    x.v("MicroMsg.FaceDetectReporter", "alvinluo setReporter, stack: %s", new Object[] { bi.cjd().toString() });
    this.iOe = paramFaceDetectReporter.iOe;
    this.iOd = paramFaceDetectReporter.iOd;
    this.iNJ = paramFaceDetectReporter.iNJ;
    long l = this.iNJ;
    if (this.iOe != null) {}
    for (paramFaceDetectReporter = this.iOe.toString();; paramFaceDetectReporter = "null")
    {
      x.v("MicroMsg.FaceDetectReporter", "alvinluo sessionId: %d, info: %s", new Object[] { Long.valueOf(l), paramFaceDetectReporter });
      return;
    }
  }
  
  public final long aJV()
  {
    x.v("MicroMsg.FaceDetectReporter", "create report session");
    if (this.iOe == null) {
      this.iOe = new FaceDetectReportInfo();
    }
    this.iOe.reset();
    this.iOd = false;
    this.iNJ = System.currentTimeMillis();
    this.iOe.iNJ = this.iNJ;
    return this.iNJ;
  }
  
  public final void bl(String paramString, int paramInt)
  {
    long l1 = -1L;
    int i = 1;
    h localh;
    long l2;
    String str;
    if ((this.iOh == -1L) || (this.iOi == -1L) || (this.iOi < this.iOh))
    {
      x.e("MicroMsg.FaceDetectReporter", "alvinluo not set calledStartTime:%d or calledEndTime: %d, total time is not valid", new Object[] { Long.valueOf(this.iOh), Long.valueOf(this.iOi) });
      x.i("MicroMsg.FaceDetectReporter", "alvinluo report face detect interface called result, sessionId: %d, functionName: %s, interfaceType: %d, businessType: %d, totalTime: %d, isSuccess: %b, appId: %s, faceDetectCount: %d", new Object[] { Long.valueOf(this.iOg), paramString, Integer.valueOf(-1), Integer.valueOf(paramInt), Long.valueOf(l1), Boolean.valueOf(this.iOk), this.appId, Integer.valueOf(this.iOj) });
      localh = h.mEJ;
      l2 = this.iOg;
      str = this.appId;
      if (!this.iOk) {
        break label261;
      }
    }
    for (;;)
    {
      localh.h(14560, new Object[] { Long.valueOf(l2), paramString, Integer.valueOf(-1), Integer.valueOf(paramInt), str, Integer.valueOf(i), Long.valueOf(l1), Integer.valueOf(this.iOj) });
      return;
      l1 = this.iOi - this.iOh;
      break;
      label261:
      i = 0;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final void q(int paramInt, long paramLong)
  {
    if (this.iOe != null)
    {
      FaceDetectReportInfo localFaceDetectReportInfo = this.iOe;
      localFaceDetectReportInfo.bDv += 1;
      localFaceDetectReportInfo = this.iOe;
      localFaceDetectReportInfo.iNZ = ((int)(localFaceDetectReportInfo.iNZ + paramLong));
      this.iOe.pv(paramInt);
    }
  }
  
  public final void r(int paramInt, long paramLong)
  {
    if (this.iOe != null) {
      this.iOe.iOb.put(Integer.valueOf(paramInt), Long.valueOf(paramLong));
    }
  }
  
  public final void s(int paramInt, long paramLong)
  {
    if (this.iOe != null) {
      this.iOe.iOc.put(Integer.valueOf(paramInt), Long.valueOf(paramLong));
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int j = 1;
    paramParcel.writeLong(this.iNJ);
    int i;
    if (this.iOd)
    {
      i = 1;
      paramParcel.writeByte((byte)i);
      paramParcel.writeParcelable(this.iOe, paramInt);
      paramParcel.writeString(this.appId);
      paramParcel.writeLong(this.iOg);
      paramParcel.writeLong(this.iOh);
      paramParcel.writeLong(this.iOi);
      paramParcel.writeInt(this.iOj);
      if (!this.iOk) {
        break label97;
      }
    }
    label97:
    for (paramInt = j;; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      return;
      i = 0;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/facedetect/model/FaceDetectReporter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */