package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.f;
import com.google.android.gms.wearable.g;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class d
  implements f
{
  private Uri aMJ;
  private byte[] bdf;
  private Map<String, g> ber;
  
  public d(f paramf)
  {
    this.aMJ = paramf.getUri();
    this.bdf = paramf.getData();
    HashMap localHashMap = new HashMap();
    paramf = paramf.rQ().entrySet().iterator();
    while (paramf.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramf.next();
      if (localEntry.getKey() != null) {
        localHashMap.put(localEntry.getKey(), ((g)localEntry.getValue()).freeze());
      }
    }
    this.ber = Collections.unmodifiableMap(localHashMap);
  }
  
  public final byte[] getData()
  {
    return this.bdf;
  }
  
  public final Uri getUri()
  {
    return this.aMJ;
  }
  
  public final Map<String, g> rQ()
  {
    return this.ber;
  }
  
  public final String toString()
  {
    boolean bool = Log.isLoggable("DataItem", 3);
    StringBuilder localStringBuilder = new StringBuilder("DataItemEntity{ ");
    localStringBuilder.append("uri=" + this.aMJ);
    Object localObject2 = new StringBuilder(", dataSz=");
    if (this.bdf == null) {}
    for (Object localObject1 = "null";; localObject1 = Integer.valueOf(this.bdf.length))
    {
      localStringBuilder.append(localObject1);
      localStringBuilder.append(", numAssets=" + this.ber.size());
      if ((!bool) || (this.ber.isEmpty())) {
        break label249;
      }
      localStringBuilder.append(", assets=[");
      localObject2 = this.ber.entrySet().iterator();
      for (localObject1 = ""; ((Iterator)localObject2).hasNext(); localObject1 = ", ")
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject2).next();
        localStringBuilder.append((String)localObject1 + (String)localEntry.getKey() + ": " + ((g)localEntry.getValue()).getId());
      }
    }
    localStringBuilder.append("]");
    label249:
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/wearable/internal/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */