package com.tencent.mrs.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.matrix.d.b;
import com.tencent.matrix.mrs.core.MatrixReport;
import com.tencent.matrix.mrs.core.MrsCallback;
import com.tencent.mm.sdk.platformtools.s;

public class MatrixStrategyNotifyBroadcast
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null) {
      b.e("Matrix.StrategyNotifyBroadcast", "MatrixStrategyNotifyBroadcast intent == null", new Object[0]);
    }
    do
    {
      return;
      paramContext = s.j(paramIntent, "strategy");
      b.i("Matrix.StrategyNotifyBroadcast", "receive MatrixStrategyNotifyBroadcast, process: %s, strategy:%s", new Object[] { MatrixReport.with().getProcessName(), paramContext });
    } while (TextUtils.isEmpty(paramContext));
    MatrixReport.getMrsCallback().onStrategyNotify(paramContext, false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mrs/util/MatrixStrategyNotifyBroadcast.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */