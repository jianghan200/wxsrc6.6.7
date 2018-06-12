package android.support.v4.app;

import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;

final class b
{
  static SharedElementCallback a(a parama)
  {
    b localb = null;
    if (parama != null) {
      localb = new b(parama);
    }
    return localb;
  }
  
  public static abstract class a
  {
    public abstract Parcelable onCaptureSharedElementSnapshot(View paramView, Matrix paramMatrix, RectF paramRectF);
    
    public abstract View onCreateSnapshotView(Context paramContext, Parcelable paramParcelable);
  }
  
  private static final class b
    extends SharedElementCallback
  {
    private b.a mu;
    
    public b(b.a parama)
    {
      this.mu = parama;
    }
    
    public final Parcelable onCaptureSharedElementSnapshot(View paramView, Matrix paramMatrix, RectF paramRectF)
    {
      return this.mu.onCaptureSharedElementSnapshot(paramView, paramMatrix, paramRectF);
    }
    
    public final View onCreateSnapshotView(Context paramContext, Parcelable paramParcelable)
    {
      return this.mu.onCreateSnapshotView(paramContext, paramParcelable);
    }
    
    public final void onMapSharedElements(List<String> paramList, Map<String, View> paramMap) {}
    
    public final void onRejectSharedElements(List<View> paramList) {}
    
    public final void onSharedElementEnd(List<String> paramList, List<View> paramList1, List<View> paramList2) {}
    
    public final void onSharedElementStart(List<String> paramList, List<View> paramList1, List<View> paramList2) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/app/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */