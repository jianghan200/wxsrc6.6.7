package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.scan;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanResult;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public class ScanResultCompat
  implements Parcelable
{
  public static final Parcelable.Creator<ScanResultCompat> CREATOR = new ScanResultCompat.1();
  private BluetoothDevice fNN;
  public f fNO;
  public int fNP;
  private long fNQ;
  
  public ScanResultCompat(BluetoothDevice paramBluetoothDevice, f paramf, int paramInt, long paramLong)
  {
    this.fNN = paramBluetoothDevice;
    this.fNO = paramf;
    this.fNP = paramInt;
    this.fNQ = paramLong;
  }
  
  @TargetApi(21)
  ScanResultCompat(ScanResult paramScanResult)
  {
    this.fNN = paramScanResult.getDevice();
    this.fNO = new f(paramScanResult.getScanRecord());
    this.fNP = paramScanResult.getRssi();
    this.fNQ = System.currentTimeMillis();
  }
  
  private ScanResultCompat(Parcel paramParcel)
  {
    if (paramParcel.readInt() == 1) {
      this.fNN = ((BluetoothDevice)BluetoothDevice.CREATOR.createFromParcel(paramParcel));
    }
    if (paramParcel.readInt() == 1) {
      this.fNO = f.V(paramParcel.createByteArray());
    }
    this.fNP = paramParcel.readInt();
    this.fNQ = paramParcel.readLong();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      paramObject = (ScanResultCompat)paramObject;
    } while ((d.equals(this.fNN, ((ScanResultCompat)paramObject).fNN)) && (this.fNP == ((ScanResultCompat)paramObject).fNP) && (d.equals(this.fNO, ((ScanResultCompat)paramObject).fNO)) && (this.fNQ == ((ScanResultCompat)paramObject).fNQ));
    return false;
  }
  
  public final BluetoothDevice getDevice()
  {
    if (this.fNN != null) {
      return this.fNN;
    }
    return null;
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(new Object[] { this.fNN, Integer.valueOf(this.fNP), this.fNO, Long.valueOf(this.fNQ) });
  }
  
  public String toString()
  {
    return "ScanResult{mDevice=" + this.fNN + ", mScanRecord=" + d.toString(this.fNO) + ", mRssi=" + this.fNP + ", mTimestampNanos=" + this.fNQ + '}';
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (this.fNN != null)
    {
      paramParcel.writeInt(1);
      this.fNN.writeToParcel(paramParcel, paramInt);
      if (this.fNO == null) {
        break label69;
      }
      paramParcel.writeInt(1);
      paramParcel.writeByteArray(this.fNO.fNM);
    }
    for (;;)
    {
      paramParcel.writeInt(this.fNP);
      paramParcel.writeLong(this.fNQ);
      return;
      paramParcel.writeInt(0);
      break;
      label69:
      paramParcel.writeInt(0);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/scan/ScanResultCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */