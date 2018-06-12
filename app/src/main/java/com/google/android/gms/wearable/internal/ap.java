package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.a.a;
import com.google.android.gms.wearable.b.a;
import com.google.android.gms.wearable.c.b;
import com.google.android.gms.wearable.e;
import com.google.android.gms.wearable.k.a;
import com.google.android.gms.wearable.n.b;
import com.google.android.gms.wearable.n.c;
import com.google.android.gms.wearable.q.a;
import com.google.android.gms.wearable.r.a;
import java.util.List;

final class ap<T>
  extends w.a
{
  q.a bfh;
  r.a bfi;
  c.b bfj;
  k.a bfk;
  n.b bfl;
  n.c bfm;
  b.a bfn;
  a.a bfo;
  final IntentFilter[] bfp;
  final String bfq;
  final String bfr;
  
  public final void a(DataHolder paramDataHolder)
  {
    if (this.bfj != null) {
      try
      {
        this.bfj.a(new e(paramDataHolder));
        return;
      }
      finally
      {
        paramDataHolder.close();
      }
    }
    paramDataHolder.close();
  }
  
  public final void a(AmsEntityUpdateParcelable paramAmsEntityUpdateParcelable) {}
  
  public final void a(AncsNotificationParcelable paramAncsNotificationParcelable) {}
  
  public final void a(CapabilityInfoParcelable paramCapabilityInfoParcelable) {}
  
  public final void a(ChannelEventParcelable paramChannelEventParcelable)
  {
    if (this.bfn != null) {
      paramChannelEventParcelable.a(this.bfn);
    }
  }
  
  public final void a(MessageEventParcelable paramMessageEventParcelable)
  {
    if (this.bfk != null) {
      this.bfk.a(paramMessageEventParcelable);
    }
  }
  
  public final void a(NodeParcelable paramNodeParcelable)
  {
    if (this.bfl != null) {
      this.bfl.a(paramNodeParcelable);
    }
  }
  
  public final void b(NodeParcelable paramNodeParcelable)
  {
    if (this.bfl != null) {
      this.bfl.b(paramNodeParcelable);
    }
  }
  
  public final void w(List<NodeParcelable> paramList) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/gms/wearable/internal/ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */