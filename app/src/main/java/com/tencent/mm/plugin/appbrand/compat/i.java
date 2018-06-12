package com.tencent.mm.plugin.appbrand.compat;

import android.graphics.Bitmap;
import com.tencent.mapsdk.raster.model.BitmapDescriptor;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.PolylineOptions;
import com.tencent.mm.plugin.appbrand.compat.a.b.f;
import com.tencent.mm.plugin.appbrand.compat.a.b.p;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class i
  implements b.p
{
  final PolylineOptions foG = new PolylineOptions();
  
  public final void c(Iterable<b.f> paramIterable)
  {
    LinkedList localLinkedList = new LinkedList();
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext())
    {
      b.f localf = (b.f)paramIterable.next();
      if ((localf instanceof f)) {
        localLinkedList.add(((f)localf).foC);
      } else {
        localLinkedList.add(new LatLng(localf.adG(), localf.adH()));
      }
    }
    this.foG.addAll(localLinkedList);
  }
  
  public final void jT(int paramInt)
  {
    this.foG.color(paramInt);
  }
  
  public final void jU(int paramInt)
  {
    this.foG.width(paramInt);
  }
  
  public final void jV(int paramInt)
  {
    this.foG.edgeColor(paramInt);
  }
  
  public final void jW(int paramInt)
  {
    this.foG.edgeWidth(paramInt);
  }
  
  public final void setDottedLine(boolean paramBoolean)
  {
    this.foG.setDottedLine(paramBoolean);
  }
  
  public final void u(Bitmap paramBitmap)
  {
    this.foG.arrowTexture(new BitmapDescriptor(paramBitmap));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/compat/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */