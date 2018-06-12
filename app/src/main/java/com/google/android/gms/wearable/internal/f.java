package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class f
  extends com.google.android.gms.common.data.f
  implements com.google.android.gms.wearable.f
{
  private final int beK;
  
  public f(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    super(paramDataHolder, paramInt1);
    this.beK = paramInt2;
  }
  
  public final byte[] getData()
  {
    return getByteArray("data");
  }
  
  public final Uri getUri()
  {
    return Uri.parse(getString("path"));
  }
  
  public final Map<String, g> rQ()
  {
    HashMap localHashMap = new HashMap(this.beK);
    int i = 0;
    while (i < this.beK)
    {
      c localc = new c(this.aMb, this.aMx + i);
      if (localc.getString("asset_key") != null) {
        localHashMap.put(localc.getString("asset_key"), localc);
      }
      i += 1;
    }
    return localHashMap;
  }
  
  public final String toString()
  {
    boolean bool = Log.isLoggable("DataItem", 3);
    Object localObject1 = getByteArray("data");
    Object localObject2 = rQ();
    StringBuilder localStringBuilder = new StringBuilder("DataItemInternal{ ");
    localStringBuilder.append("uri=" + getUri());
    Object localObject3 = new StringBuilder(", dataSz=");
    if (localObject1 == null) {}
    for (localObject1 = "null";; localObject1 = Integer.valueOf(localObject1.length))
    {
      localStringBuilder.append(localObject1);
      localStringBuilder.append(", numAssets=" + ((Map)localObject2).size());
      if ((!bool) || (((Map)localObject2).isEmpty())) {
        break label250;
      }
      localStringBuilder.append(", assets=[");
      localObject2 = ((Map)localObject2).entrySet().iterator();
      for (localObject1 = ""; ((Iterator)localObject2).hasNext(); localObject1 = ", ")
      {
        localObject3 = (Map.Entry)((Iterator)localObject2).next();
        localStringBuilder.append((String)localObject1 + (String)((Map.Entry)localObject3).getKey() + ": " + ((g)((Map.Entry)localObject3).getValue()).getId());
      }
    }
    localStringBuilder.append("]");
    label250:
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/wearable/internal/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */