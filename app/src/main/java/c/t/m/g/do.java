package c.t.m.g;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class do
  implements Cloneable
{
  public long a;
  private int b;
  private int c;
  private String d;
  private int e;
  
  @SuppressLint({"NewApi"})
  public static do a(BluetoothDevice paramBluetoothDevice, int paramInt, byte[] paramArrayOfByte)
  {
    if (paramBluetoothDevice == null) {
      return null;
    }
    int k = 0;
    int i = 2;
    for (;;)
    {
      int j = k;
      if (i <= 5)
      {
        if (((paramArrayOfByte[(i + 2)] & 0xFF) == 2) && ((paramArrayOfByte[(i + 3)] & 0xFF) == 21)) {
          j = 1;
        }
      }
      else
      {
        if (j == 0) {
          break;
        }
        do localdo = new do();
        localdo.b = (((paramArrayOfByte[(i + 20)] & 0xFF) << 8) + (paramArrayOfByte[(i + 21)] & 0xFF));
        localdo.c = (((paramArrayOfByte[(i + 22)] & 0xFF) << 8) + (paramArrayOfByte[(i + 23)] & 0xFF));
        localdo.e = paramInt;
        localdo.d = paramBluetoothDevice.getAddress().toUpperCase();
        paramBluetoothDevice.getName();
        localdo.a = System.currentTimeMillis();
        return localdo;
      }
      i += 1;
    }
  }
  
  public static String a(List<do> paramList)
  {
    if ((paramList == null) || (paramList.size() == 0)) {
      return "[]";
    }
    JSONArray localJSONArray = new JSONArray();
    paramList = paramList.iterator();
    for (;;)
    {
      do localdo;
      JSONObject localJSONObject;
      if (paramList.hasNext())
      {
        localdo = (do)paramList.next();
        localJSONObject = new JSONObject();
      }
      try
      {
        localJSONObject.put("mac", localdo.d);
        localJSONObject.put("major", localdo.b);
        localJSONObject.put("minor", localdo.c);
        localJSONObject.put("rssi", localdo.e);
        localJSONObject.put("time", localdo.a / 1000L);
        localJSONArray.put(localJSONObject);
      }
      catch (JSONException localJSONException) {}
      return localJSONArray.toString();
    }
  }
  
  protected final Object clone()
  {
    try
    {
      Object localObject = super.clone();
      return localObject;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException) {}
    return null;
  }
  
  public final String toString()
  {
    return "Beacon [major=" + this.b + ",uuid=" + null + ", minor=" + this.c + ", bluetoothAddress=" + this.d + ", rssi=" + this.e + ", time=" + this.a + "]";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/c/t/m/g/do.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */