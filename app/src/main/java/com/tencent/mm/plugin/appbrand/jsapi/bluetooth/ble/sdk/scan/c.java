package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.scan;

import android.os.ParcelUuid;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;

final class c
{
  public static final ParcelUuid fNa = ParcelUuid.fromString("0000110B-0000-1000-8000-00805F9B34FB");
  public static final ParcelUuid fNb = ParcelUuid.fromString("0000110A-0000-1000-8000-00805F9B34FB");
  public static final ParcelUuid fNc = ParcelUuid.fromString("0000110D-0000-1000-8000-00805F9B34FB");
  public static final ParcelUuid fNd = ParcelUuid.fromString("00001108-0000-1000-8000-00805F9B34FB");
  public static final ParcelUuid fNe = ParcelUuid.fromString("00001112-0000-1000-8000-00805F9B34FB");
  public static final ParcelUuid fNf = ParcelUuid.fromString("0000111E-0000-1000-8000-00805F9B34FB");
  public static final ParcelUuid fNg = ParcelUuid.fromString("0000111F-0000-1000-8000-00805F9B34FB");
  public static final ParcelUuid fNh = ParcelUuid.fromString("0000110E-0000-1000-8000-00805F9B34FB");
  public static final ParcelUuid fNi = ParcelUuid.fromString("0000110C-0000-1000-8000-00805F9B34FB");
  public static final ParcelUuid fNj = ParcelUuid.fromString("00001105-0000-1000-8000-00805f9b34fb");
  public static final ParcelUuid fNk = ParcelUuid.fromString("00001124-0000-1000-8000-00805f9b34fb");
  public static final ParcelUuid fNl = ParcelUuid.fromString("00001812-0000-1000-8000-00805f9b34fb");
  public static final ParcelUuid fNm = ParcelUuid.fromString("00001115-0000-1000-8000-00805F9B34FB");
  public static final ParcelUuid fNn = ParcelUuid.fromString("00001116-0000-1000-8000-00805F9B34FB");
  public static final ParcelUuid fNo = ParcelUuid.fromString("0000000f-0000-1000-8000-00805F9B34FB");
  public static final ParcelUuid fNp = ParcelUuid.fromString("0000112f-0000-1000-8000-00805F9B34FB");
  public static final ParcelUuid fNq = ParcelUuid.fromString("00001134-0000-1000-8000-00805F9B34FB");
  public static final ParcelUuid fNr = ParcelUuid.fromString("00001133-0000-1000-8000-00805F9B34FB");
  public static final ParcelUuid fNs = ParcelUuid.fromString("00001132-0000-1000-8000-00805F9B34FB");
  public static final ParcelUuid fNt = ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");
  public static final ParcelUuid[] fNu = { fNa, fNb, fNc, fNd, fNf, fNh, fNi, fNj, fNm, fNn, fNq, fNr, fNs };
  
  public static ParcelUuid U(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      throw new IllegalArgumentException("uuidBytes cannot be null");
    }
    int i = paramArrayOfByte.length;
    if ((i != 2) && (i != 4) && (i != 16)) {
      throw new IllegalArgumentException("uuidBytes length invalid - " + i);
    }
    if (i == 16)
    {
      paramArrayOfByte = ByteBuffer.wrap(paramArrayOfByte).order(ByteOrder.LITTLE_ENDIAN);
      return new ParcelUuid(new UUID(paramArrayOfByte.getLong(8), paramArrayOfByte.getLong(0)));
    }
    if (i == 2) {}
    for (long l = (paramArrayOfByte[0] & 0xFF) + ((paramArrayOfByte[1] & 0xFF) << 8);; l = (paramArrayOfByte[0] & 0xFF) + ((paramArrayOfByte[1] & 0xFF) << 8) + ((paramArrayOfByte[2] & 0xFF) << 16) + ((paramArrayOfByte[3] & 0xFF) << 24)) {
      return new ParcelUuid(new UUID(fNt.getUuid().getMostSignificantBits() + (l << 32), fNt.getUuid().getLeastSignificantBits()));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/scan/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */