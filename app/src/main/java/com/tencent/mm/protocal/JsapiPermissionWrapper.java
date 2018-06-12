package com.tencent.mm.protocal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JsapiPermissionWrapper
  implements Parcelable
{
  public static final Parcelable.Creator<JsapiPermissionWrapper> CREATOR = new JsapiPermissionWrapper.1();
  public static final JsapiPermissionWrapper qWa = new JsapiPermissionWrapper(1);
  public static final JsapiPermissionWrapper qWb = new JsapiPermissionWrapper(2);
  public static final JsapiPermissionWrapper qWc = new JsapiPermissionWrapper(3);
  public static final JsapiPermissionWrapper qWd = new JsapiPermissionWrapper(4);
  public byte[] qWe = null;
  private int qWf = 0;
  private Set<Integer> qWg;
  private Set<Integer> qWh;
  
  public JsapiPermissionWrapper()
  {
    this.qWe = null;
  }
  
  public JsapiPermissionWrapper(int paramInt)
  {
    this.qWf = paramInt;
    this.qWe = new byte[0];
  }
  
  private JsapiPermissionWrapper(Parcel paramParcel)
  {
    this.qWe = paramParcel.createByteArray();
    this.qWf = paramParcel.readInt();
    q(paramParcel.createIntArray());
    r(paramParcel.createIntArray());
  }
  
  public JsapiPermissionWrapper(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      this.qWe = null;
      return;
    }
    this.qWe = paramArrayOfByte;
  }
  
  public static boolean cgl()
  {
    return true;
  }
  
  private int[] cgm()
  {
    if (this.qWg != null)
    {
      int[] arrayOfInt = new int[this.qWg.size()];
      Iterator localIterator = this.qWg.iterator();
      int i = 0;
      if (localIterator.hasNext())
      {
        Integer localInteger = (Integer)localIterator.next();
        if (localInteger == null) {}
        for (int j = 0;; j = localInteger.intValue())
        {
          arrayOfInt[i] = j;
          i += 1;
          break;
        }
      }
      return arrayOfInt;
    }
    return new int[0];
  }
  
  private int[] cgn()
  {
    if (this.qWh != null)
    {
      int[] arrayOfInt = new int[this.qWh.size()];
      Iterator localIterator = this.qWh.iterator();
      int i = 0;
      if (localIterator.hasNext())
      {
        Integer localInteger = (Integer)localIterator.next();
        if (localInteger == null) {}
        for (int j = 0;; j = localInteger.intValue())
        {
          arrayOfInt[i] = j;
          i += 1;
          break;
        }
      }
      return arrayOfInt;
    }
    return new int[0];
  }
  
  public final int CB(int paramInt)
  {
    int i;
    if ((this.qWh != null) && (this.qWh.contains(Integer.valueOf(paramInt))))
    {
      i = 1;
      if (i == 0) {
        break label36;
      }
    }
    label36:
    label112:
    label128:
    label174:
    label214:
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
              return 1;
              i = 0;
              break;
              if ((this.qWg != null) && (this.qWg.contains(Integer.valueOf(paramInt)))) {}
              for (i = 1; i != 0; i = 0) {
                return 0;
              }
              if (this.qWf != 1) {
                break label112;
              }
            } while ((paramInt != 34) && (paramInt != 75));
            x.i("MicroMsg.JsapiPermissionWrapper", "on reserved bytes control : %d", new Object[] { Integer.valueOf(paramInt) });
            return 0;
            if (this.qWf != 2) {
              break label128;
            }
          } while (paramInt == -3);
          return 0;
          if (this.qWf != 3) {
            break label174;
          }
        } while ((paramInt != 34) && (paramInt != 75) && (paramInt != 23));
        x.i("MicroMsg.JsapiPermissionWrapper", "on reserved bytes control : %d", new Object[] { Integer.valueOf(paramInt) });
        return 0;
        if (this.qWf != 4) {
          break label214;
        }
      } while ((paramInt != 34) && (paramInt != 75));
      x.i("MicroMsg.JsapiPermissionWrapper", "hy: on reserved bytes control : %d", new Object[] { Integer.valueOf(paramInt) });
      return 0;
    } while ((paramInt == -2) || (paramInt == -3));
    if ((this.qWe == null) || (paramInt < 0) || (paramInt >= this.qWe.length)) {
      return 0;
    }
    return this.qWe[paramInt];
  }
  
  public final void a(int paramInt, byte paramByte)
  {
    int i = 0;
    if ((this.qWe == null) || (paramInt < 0) || (paramInt >= this.qWe.length))
    {
      if (this.qWe == null) {}
      for (;;)
      {
        x.e("MicroMsg.JsapiPermissionWrapper", "setPermission pos out of range, %s, %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
        return;
        i = this.qWe.length;
      }
    }
    this.qWe[paramInt] = paramByte;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof JsapiPermissionWrapper)) {}
    do
    {
      return false;
      paramObject = (JsapiPermissionWrapper)paramObject;
      if (this.qWe == ((JsapiPermissionWrapper)paramObject).qWe) {
        return true;
      }
    } while ((this.qWe == null) || (((JsapiPermissionWrapper)paramObject).qWe == null) || (this.qWe.length != ((JsapiPermissionWrapper)paramObject).qWe.length));
    int i = 0;
    for (;;)
    {
      if (i >= this.qWe.length) {
        break label87;
      }
      if (this.qWe[i] != paramObject.qWe[i]) {
        break;
      }
      i += 1;
    }
    label87:
    return true;
  }
  
  public final void fromBundle(Bundle paramBundle)
  {
    this.qWe = paramBundle.getByteArray("jsapi_perm_wrapper_bytes");
    this.qWf = paramBundle.getInt("jsapi_perm_wrapper_hardcodePermission");
    q(paramBundle.getIntArray("jsapi_perm_wrapper_blacklist"));
    r(paramBundle.getIntArray("jsapi_perm_wrapper_whitelist"));
  }
  
  public final boolean gu(int paramInt)
  {
    return CB(paramInt) == 1;
  }
  
  public final void q(int[] paramArrayOfInt)
  {
    if (this.qWg == null) {
      this.qWg = new HashSet();
    }
    while ((paramArrayOfInt != null) && (paramArrayOfInt.length > 0))
    {
      int i = 0;
      while (i < paramArrayOfInt.length)
      {
        this.qWg.add(Integer.valueOf(paramArrayOfInt[i]));
        i += 1;
      }
      this.qWg.clear();
    }
  }
  
  public final void r(int[] paramArrayOfInt)
  {
    if (this.qWh == null) {
      this.qWh = new HashSet();
    }
    while ((paramArrayOfInt != null) && (paramArrayOfInt.length > 0))
    {
      int i = 0;
      while (i < paramArrayOfInt.length)
      {
        this.qWh.add(Integer.valueOf(paramArrayOfInt[i]));
        i += 1;
      }
      this.qWh.clear();
    }
  }
  
  public final void toBundle(Bundle paramBundle)
  {
    paramBundle.putByteArray("jsapi_perm_wrapper_bytes", this.qWe);
    paramBundle.putInt("jsapi_perm_wrapper_hardcodePermission", this.qWf);
    paramBundle.putIntArray("jsapi_perm_wrapper_blacklist", cgm());
    paramBundle.putIntArray("jsapi_perm_wrapper_whitelist", cgn());
  }
  
  public String toString()
  {
    if (this.qWe == null) {
      return "null";
    }
    long l = System.currentTimeMillis();
    Object localObject = new StringBuilder(180);
    byte[] arrayOfByte = this.qWe;
    int j = arrayOfByte.length;
    int i = 0;
    while (i < j)
    {
      ((StringBuilder)localObject).append(arrayOfByte[i]);
      i += 1;
    }
    localObject = ((StringBuilder)localObject).toString();
    x.d("MicroMsg.JsapiPermissionWrapper", "toString cost %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    return (String)localObject;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeByteArray(this.qWe);
    paramParcel.writeInt(this.qWf);
    paramParcel.writeIntArray(cgm());
    paramParcel.writeIntArray(cgn());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/JsapiPermissionWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */