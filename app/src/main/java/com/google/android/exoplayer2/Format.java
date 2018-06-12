package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.i.t;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.ColorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Format
  implements Parcelable
{
  public static final Parcelable.Creator<Format> CREATOR = new Format.1();
  public final String adT;
  public final Metadata adU;
  public final String adV;
  public final String adW;
  public final int adX;
  public final List<byte[]> adY;
  public final DrmInitData adZ;
  public final float aea;
  public final int aeb;
  public final float aec;
  public final int aed;
  public final byte[] aee;
  public final ColorInfo aef;
  public final int aeg;
  public final int aeh;
  public final int aei;
  public final int aej;
  public final long aek;
  public final int ael;
  public final String aem;
  public final int aen;
  private int aeo;
  public final int bitrate;
  public final int height;
  public final String id;
  public final int sampleRate;
  public final int width;
  
  Format(Parcel paramParcel)
  {
    this.id = paramParcel.readString();
    this.adV = paramParcel.readString();
    this.adW = paramParcel.readString();
    this.adT = paramParcel.readString();
    this.bitrate = paramParcel.readInt();
    this.adX = paramParcel.readInt();
    this.width = paramParcel.readInt();
    this.height = paramParcel.readInt();
    this.aea = paramParcel.readFloat();
    this.aeb = paramParcel.readInt();
    this.aec = paramParcel.readFloat();
    int i;
    if (paramParcel.readInt() != 0)
    {
      i = 1;
      if (i == 0) {
        break label263;
      }
    }
    label263:
    for (byte[] arrayOfByte = paramParcel.createByteArray();; arrayOfByte = null)
    {
      this.aee = arrayOfByte;
      this.aed = paramParcel.readInt();
      this.aef = ((ColorInfo)paramParcel.readParcelable(ColorInfo.class.getClassLoader()));
      this.aeg = paramParcel.readInt();
      this.sampleRate = paramParcel.readInt();
      this.aeh = paramParcel.readInt();
      this.aei = paramParcel.readInt();
      this.aej = paramParcel.readInt();
      this.ael = paramParcel.readInt();
      this.aem = paramParcel.readString();
      this.aen = paramParcel.readInt();
      this.aek = paramParcel.readLong();
      int j = paramParcel.readInt();
      this.adY = new ArrayList(j);
      i = 0;
      while (i < j)
      {
        this.adY.add(paramParcel.createByteArray());
        i += 1;
      }
      i = 0;
      break;
    }
    this.adZ = ((DrmInitData)paramParcel.readParcelable(DrmInitData.class.getClassLoader()));
    this.adU = ((Metadata)paramParcel.readParcelable(Metadata.class.getClassLoader()));
  }
  
  public Format(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, int paramInt5, float paramFloat2, byte[] paramArrayOfByte, int paramInt6, ColorInfo paramColorInfo, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, String paramString5, int paramInt13, long paramLong, List<byte[]> paramList, DrmInitData paramDrmInitData, Metadata paramMetadata)
  {
    this.id = paramString1;
    this.adV = paramString2;
    this.adW = paramString3;
    this.adT = paramString4;
    this.bitrate = paramInt1;
    this.adX = paramInt2;
    this.width = paramInt3;
    this.height = paramInt4;
    this.aea = paramFloat1;
    this.aeb = paramInt5;
    this.aec = paramFloat2;
    this.aee = paramArrayOfByte;
    this.aed = paramInt6;
    this.aef = paramColorInfo;
    this.aeg = paramInt7;
    this.sampleRate = paramInt8;
    this.aeh = paramInt9;
    this.aei = paramInt10;
    this.aej = paramInt11;
    this.ael = paramInt12;
    this.aem = paramString5;
    this.aen = paramInt13;
    this.aek = paramLong;
    paramString1 = paramList;
    if (paramList == null) {
      paramString1 = Collections.emptyList();
    }
    this.adY = paramString1;
    this.adZ = paramDrmInitData;
    this.adU = paramMetadata;
  }
  
  public static Format a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, List<byte[]> paramList, DrmInitData paramDrmInitData, String paramString3, Metadata paramMetadata)
  {
    return new Format(paramString1, null, paramString2, null, paramInt1, paramInt2, -1, -1, -1.0F, -1, -1.0F, null, -1, null, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, 0, paramString3, -1, Long.MAX_VALUE, paramList, paramDrmInitData, paramMetadata);
  }
  
  public static Format a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, List<byte[]> paramList, DrmInitData paramDrmInitData, String paramString3)
  {
    return a(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, -1, -1, paramList, paramDrmInitData, paramString3, null);
  }
  
  public static Format a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, List<byte[]> paramList, DrmInitData paramDrmInitData, String paramString3)
  {
    return a(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4, -1, paramList, paramDrmInitData, paramString3);
  }
  
  public static Format a(String paramString1, String paramString2, int paramInt1, int paramInt2, List<byte[]> paramList, float paramFloat)
  {
    return a(paramString1, paramString2, paramInt1, paramInt2, paramList, -1, paramFloat, null, -1, null);
  }
  
  public static Format a(String paramString1, String paramString2, int paramInt1, int paramInt2, List<byte[]> paramList, int paramInt3, float paramFloat, byte[] paramArrayOfByte, int paramInt4, DrmInitData paramDrmInitData)
  {
    return new Format(paramString1, null, paramString2, null, -1, -1, paramInt1, paramInt2, -1.0F, paramInt3, paramFloat, paramArrayOfByte, paramInt4, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, paramList, paramDrmInitData, null);
  }
  
  public static Format a(String paramString1, String paramString2, int paramInt1, String paramString3, int paramInt2)
  {
    return a(paramString1, paramString2, paramInt1, paramString3, paramInt2, Long.MAX_VALUE, Collections.emptyList());
  }
  
  public static Format a(String paramString1, String paramString2, int paramInt1, String paramString3, int paramInt2, long paramLong, List<byte[]> paramList)
  {
    return new Format(paramString1, null, paramString2, null, -1, -1, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, paramInt1, paramString3, paramInt2, paramLong, paramList, null, null);
  }
  
  public static Format a(String paramString1, String paramString2, long paramLong)
  {
    return a(null, paramString1, 0, paramString2, -1, paramLong, Collections.emptyList());
  }
  
  public static Format a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3)
  {
    return new Format(paramString1, paramString2, null, paramString3, paramInt1, -1, paramInt2, paramInt3, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null);
  }
  
  public static Format a(String paramString1, String paramString2, String paramString3, int paramInt, String paramString4)
  {
    return a(paramString1, paramString2, paramString3, paramInt, paramString4, -1);
  }
  
  public static Format a(String paramString1, String paramString2, String paramString3, int paramInt1, String paramString4, int paramInt2)
  {
    return new Format(paramString1, paramString2, paramString3, null, -1, -1, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, paramInt1, paramString4, paramInt2, Long.MAX_VALUE, null, null, null);
  }
  
  public static Format a(String paramString1, String paramString2, List<byte[]> paramList, String paramString3)
  {
    return new Format(paramString1, null, paramString2, null, -1, -1, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, 0, paramString3, -1, Long.MAX_VALUE, paramList, null, null);
  }
  
  public static String a(Format paramFormat)
  {
    if (paramFormat == null) {
      return "null";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("id=").append(paramFormat.id).append(", mimeType=").append(paramFormat.adW);
    if (paramFormat.bitrate != -1) {
      localStringBuilder.append(", bitrate=").append(paramFormat.bitrate);
    }
    if ((paramFormat.width != -1) && (paramFormat.height != -1)) {
      localStringBuilder.append(", res=").append(paramFormat.width).append("x").append(paramFormat.height);
    }
    if (paramFormat.aea != -1.0F) {
      localStringBuilder.append(", fps=").append(paramFormat.aea);
    }
    if (paramFormat.aeg != -1) {
      localStringBuilder.append(", channels=").append(paramFormat.aeg);
    }
    if (paramFormat.sampleRate != -1) {
      localStringBuilder.append(", sample_rate=").append(paramFormat.sampleRate);
    }
    if (paramFormat.aem != null) {
      localStringBuilder.append(", language=").append(paramFormat.aem);
    }
    return localStringBuilder.toString();
  }
  
  @TargetApi(16)
  private static void a(MediaFormat paramMediaFormat, String paramString, int paramInt)
  {
    if (paramInt != -1) {
      paramMediaFormat.setInteger(paramString, paramInt);
    }
  }
  
  public static Format af(String paramString)
  {
    return a(null, paramString, 0, null, -1, Long.MAX_VALUE, Collections.emptyList());
  }
  
  public static Format b(String paramString, long paramLong)
  {
    return new Format(null, null, paramString, null, -1, -1, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, paramLong, null, null, null);
  }
  
  public static Format b(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    return new Format(paramString1, paramString2, null, null, -1, -1, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, paramInt, paramString3, -1, Long.MAX_VALUE, null, null, null);
  }
  
  public static Format g(String paramString1, String paramString2)
  {
    return new Format(paramString1, paramString2, null, null, -1, -1, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null);
  }
  
  public static Format h(String paramString1, String paramString2)
  {
    return new Format(paramString1, null, paramString2, null, -1, -1, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if (this == paramObject) {
      bool1 = true;
    }
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        do
                        {
                          do
                          {
                            do
                            {
                              do
                              {
                                do
                                {
                                  do
                                  {
                                    do
                                    {
                                      do
                                      {
                                        do
                                        {
                                          do
                                          {
                                            do
                                            {
                                              do
                                              {
                                                do
                                                {
                                                  do
                                                  {
                                                    do
                                                    {
                                                      do
                                                      {
                                                        do
                                                        {
                                                          do
                                                          {
                                                            return bool1;
                                                            bool1 = bool2;
                                                          } while (paramObject == null);
                                                          bool1 = bool2;
                                                        } while (getClass() != paramObject.getClass());
                                                        paramObject = (Format)paramObject;
                                                        bool1 = bool2;
                                                      } while (this.bitrate != ((Format)paramObject).bitrate);
                                                      bool1 = bool2;
                                                    } while (this.adX != ((Format)paramObject).adX);
                                                    bool1 = bool2;
                                                  } while (this.width != ((Format)paramObject).width);
                                                  bool1 = bool2;
                                                } while (this.height != ((Format)paramObject).height);
                                                bool1 = bool2;
                                              } while (this.aea != ((Format)paramObject).aea);
                                              bool1 = bool2;
                                            } while (this.aeb != ((Format)paramObject).aeb);
                                            bool1 = bool2;
                                          } while (this.aec != ((Format)paramObject).aec);
                                          bool1 = bool2;
                                        } while (this.aed != ((Format)paramObject).aed);
                                        bool1 = bool2;
                                      } while (this.aeg != ((Format)paramObject).aeg);
                                      bool1 = bool2;
                                    } while (this.sampleRate != ((Format)paramObject).sampleRate);
                                    bool1 = bool2;
                                  } while (this.aeh != ((Format)paramObject).aeh);
                                  bool1 = bool2;
                                } while (this.aei != ((Format)paramObject).aei);
                                bool1 = bool2;
                              } while (this.aej != ((Format)paramObject).aej);
                              bool1 = bool2;
                            } while (this.aek != ((Format)paramObject).aek);
                            bool1 = bool2;
                          } while (this.ael != ((Format)paramObject).ael);
                          bool1 = bool2;
                        } while (!t.i(this.id, ((Format)paramObject).id));
                        bool1 = bool2;
                      } while (!t.i(this.aem, ((Format)paramObject).aem));
                      bool1 = bool2;
                    } while (this.aen != ((Format)paramObject).aen);
                    bool1 = bool2;
                  } while (!t.i(this.adV, ((Format)paramObject).adV));
                  bool1 = bool2;
                } while (!t.i(this.adW, ((Format)paramObject).adW));
                bool1 = bool2;
              } while (!t.i(this.adT, ((Format)paramObject).adT));
              bool1 = bool2;
            } while (!t.i(this.adZ, ((Format)paramObject).adZ));
            bool1 = bool2;
          } while (!t.i(this.adU, ((Format)paramObject).adU));
          bool1 = bool2;
        } while (!t.i(this.aef, ((Format)paramObject).aef));
        bool1 = bool2;
      } while (!Arrays.equals(this.aee, ((Format)paramObject).aee));
      bool1 = bool2;
    } while (this.adY.size() != ((Format)paramObject).adY.size());
    int i = 0;
    for (;;)
    {
      if (i >= this.adY.size()) {
        break label499;
      }
      bool1 = bool2;
      if (!Arrays.equals((byte[])this.adY.get(i), (byte[])((Format)paramObject).adY.get(i))) {
        break;
      }
      i += 1;
    }
    label499:
    return true;
  }
  
  public final int hashCode()
  {
    int i2 = 0;
    int i;
    int j;
    label28:
    int k;
    label37:
    int m;
    label47:
    int i3;
    int i4;
    int i5;
    int i6;
    int i7;
    int n;
    label87:
    int i8;
    int i1;
    if (this.aeo == 0)
    {
      if (this.id != null) {
        break label194;
      }
      i = 0;
      if (this.adV != null) {
        break label205;
      }
      j = 0;
      if (this.adW != null) {
        break label216;
      }
      k = 0;
      if (this.adT != null) {
        break label227;
      }
      m = 0;
      i3 = this.bitrate;
      i4 = this.width;
      i5 = this.height;
      i6 = this.aeg;
      i7 = this.sampleRate;
      if (this.aem != null) {
        break label239;
      }
      n = 0;
      i8 = this.aen;
      if (this.adZ != null) {
        break label251;
      }
      i1 = 0;
      label103:
      if (this.adU != null) {
        break label263;
      }
    }
    for (;;)
    {
      this.aeo = ((i1 + ((n + ((((((m + (k + (j + (i + 527) * 31) * 31) * 31) * 31 + i3) * 31 + i4) * 31 + i5) * 31 + i6) * 31 + i7) * 31) * 31 + i8) * 31) * 31 + i2);
      return this.aeo;
      label194:
      i = this.id.hashCode();
      break;
      label205:
      j = this.adV.hashCode();
      break label28;
      label216:
      k = this.adW.hashCode();
      break label37;
      label227:
      m = this.adT.hashCode();
      break label47;
      label239:
      n = this.aem.hashCode();
      break label87;
      label251:
      i1 = this.adZ.hashCode();
      break label103;
      label263:
      i2 = this.adU.hashCode();
    }
  }
  
  public final int iP()
  {
    if ((this.width == -1) || (this.height == -1)) {
      return -1;
    }
    return this.width * this.height;
  }
  
  @SuppressLint({"InlinedApi"})
  @TargetApi(16)
  public final MediaFormat iQ()
  {
    MediaFormat localMediaFormat = new MediaFormat();
    localMediaFormat.setString("mime", this.adW);
    Object localObject = this.aem;
    if (localObject != null) {
      localMediaFormat.setString("language", (String)localObject);
    }
    a(localMediaFormat, "max-input-size", this.adX);
    a(localMediaFormat, "width", this.width);
    a(localMediaFormat, "height", this.height);
    float f = this.aea;
    if (f != -1.0F) {
      localMediaFormat.setFloat("frame-rate", f);
    }
    a(localMediaFormat, "rotation-degrees", this.aeb);
    a(localMediaFormat, "channel-count", this.aeg);
    a(localMediaFormat, "sample-rate", this.sampleRate);
    a(localMediaFormat, "encoder-delay", this.aei);
    a(localMediaFormat, "encoder-padding", this.aej);
    int i = 0;
    while (i < this.adY.size())
    {
      localMediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap((byte[])this.adY.get(i)));
      i += 1;
    }
    localObject = this.aef;
    if (localObject != null)
    {
      a(localMediaFormat, "color-transfer", ((ColorInfo)localObject).aCP);
      a(localMediaFormat, "color-standard", ((ColorInfo)localObject).aCN);
      a(localMediaFormat, "color-range", ((ColorInfo)localObject).aCO);
      localObject = ((ColorInfo)localObject).aCQ;
      if (localObject != null) {
        localMediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap((byte[])localObject));
      }
    }
    return localMediaFormat;
  }
  
  public final String toString()
  {
    return "Format(" + this.id + ", " + this.adV + ", " + this.adW + ", " + this.bitrate + ", " + this.aem + ", [" + this.width + ", " + this.height + ", " + this.aea + "], [" + this.aeg + ", " + this.sampleRate + "])";
  }
  
  public final Format u(long paramLong)
  {
    return new Format(this.id, this.adV, this.adW, this.adT, this.bitrate, this.adX, this.width, this.height, this.aea, this.aeb, this.aec, this.aee, this.aed, this.aef, this.aeg, this.sampleRate, this.aeh, this.aei, this.aej, this.ael, this.aem, this.aen, paramLong, this.adY, this.adZ, this.adU);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.id);
    paramParcel.writeString(this.adV);
    paramParcel.writeString(this.adW);
    paramParcel.writeString(this.adT);
    paramParcel.writeInt(this.bitrate);
    paramParcel.writeInt(this.adX);
    paramParcel.writeInt(this.width);
    paramParcel.writeInt(this.height);
    paramParcel.writeFloat(this.aea);
    paramParcel.writeInt(this.aeb);
    paramParcel.writeFloat(this.aec);
    if (this.aee != null) {}
    for (int i = 1;; i = 0)
    {
      paramParcel.writeInt(i);
      if (this.aee != null) {
        paramParcel.writeByteArray(this.aee);
      }
      paramParcel.writeInt(this.aed);
      paramParcel.writeParcelable(this.aef, paramInt);
      paramParcel.writeInt(this.aeg);
      paramParcel.writeInt(this.sampleRate);
      paramParcel.writeInt(this.aeh);
      paramParcel.writeInt(this.aei);
      paramParcel.writeInt(this.aej);
      paramParcel.writeInt(this.ael);
      paramParcel.writeString(this.aem);
      paramParcel.writeInt(this.aen);
      paramParcel.writeLong(this.aek);
      i = this.adY.size();
      paramParcel.writeInt(i);
      paramInt = 0;
      while (paramInt < i)
      {
        paramParcel.writeByteArray((byte[])this.adY.get(paramInt));
        paramInt += 1;
      }
    }
    paramParcel.writeParcelable(this.adZ, 0);
    paramParcel.writeParcelable(this.adU, 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/exoplayer2/Format.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */